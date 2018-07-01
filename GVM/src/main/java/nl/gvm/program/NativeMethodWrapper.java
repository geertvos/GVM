package nl.gvm.program;

import java.util.List;
import java.util.Map;

import nl.gvm.core.GVMObject;
import nl.gvm.core.Value;

/**
 * Wrapper to allow the GVM to execute a 'native' method
 * @author geert
 *
 */
public abstract class NativeMethodWrapper {

	public abstract Value invoke( List<Value> arguments, Map<Integer,GVMObject> heap,List<String> strings );
	public abstract int argumentCount();
	
}
