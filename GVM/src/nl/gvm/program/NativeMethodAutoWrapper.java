package nl.gvm.program;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import nl.gvm.core.GVMObject;
import nl.gvm.core.Value;

public class NativeMethodAutoWrapper extends NativeMethodWrapper{

	private final int args;
	
	public NativeMethodAutoWrapper(int size) {
		this.args = size;
	}

	@Override
	public Value invoke(List<Value> arguments, Map<Integer, GVMObject> heap, List<String> strings) {
		Collections.reverse(arguments);
		String classname = getStringArgument(0, arguments, strings);
		String method = getStringArgument(1, arguments, strings);
			try {
				Class theClass = Class.forName(classname);
				Object[] wrappedArgs = null;
				Class[] wrappedTypes = null;
				if(args>2) {
					int argcount = args-2;
					wrappedArgs = new Object[argcount];
					wrappedTypes = new Class[argcount];
					for(int i=2;i<args;i++) {
						String val = getStringArgument(i, arguments, strings);
						wrappedArgs[i-2] = val;
						wrappedTypes[i-2] = String.class;
					}
				}
				Method m = theClass.getMethod(method, wrappedTypes);
				//TODO: wrap other argument
				//TODO: wrap return values
				m.invoke(null, wrappedArgs );
			} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
		return null;
	}
	
	public String getStringArgument(int index, List<Value> arguments, List<String> table) {
		Value v = arguments.get(index);
		if( v.getType() == Value.TYPE.STRING ) {
			return table.get(v.getValue());
		}
		throw new IllegalArgumentException();
	}

	@Override
	public int argumentCount() {
		return args;
	}

}
