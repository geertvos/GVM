package nl.gvm.program;

import java.util.List;
import java.util.Map;

import nl.gvm.core.GVMObject;
import nl.gvm.core.Value;

public class NativePrintMethod extends NativeMethodWrapper {

	@Override
	public Value invoke(List<Value> arguments, Map<Integer, GVMObject> heap,
			List<String> strings) {
		Value v = arguments.get(0);
		if( v.getType() == Value.TYPE.STRING )
			System.out.println(strings.get(v.getValue()));
		else if( v.getType() == Value.TYPE.BOOLEAN )
			System.out.println( v.getValue()>0?"true":"false");
		else if( v.getType() == Value.TYPE.NUMBER )
			System.out.println( v.getValue() );
		else if( v.getType() == Value.TYPE.FUNCTION )
			System.out.println( "function#"+v.getValue() );
		else if( v.getType() == Value.TYPE.OBJECT )
			System.out.println( "object#"+v.getValue() );
		else if( v.getType() == Value.TYPE.UNDEFINED )
			System.out.println( "undefined" );
		
		return new Value(0,Value.TYPE.UNDEFINED);
	}

	@Override
	public int argumentCount() {
		return 1;
	}

}
