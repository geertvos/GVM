package nl.gvm.core;
import java.util.Collection;
import java.util.HashMap;

/**
 * The GVMObject represents an object created by the virtual machine and is always placed on the heap. The stack may contain references to an object.
 * Each object has a number of values stored using an integer as ID. The compiler maps field/function names to an id.
 * @author geertvos
 *
 */
public class GVMObject {

	private HashMap<Integer,Value> data = new HashMap<Integer, Value>();
	
	/**
	 * Set a value in this object
	 * @param id The ID of the field
	 * @param v The value, can be a reference to another object.
	 */
	public void setValue( int id , Value v )
	{
		data.put(id, v);
	}
	
	/**
	 * Returns the value stored under ID 
	 * @param id The id of the field/function
	 * @return Returns the value as Value object and Undefined if not found.
	 */
	public Value getValue( int id )
	{
		if( data.containsKey(id))
			return data.get(id);
		else {
			Value v = new Value(0, Value.TYPE.UNDEFINED);
			data.put( id , v );
			return v;
		}
	}

	/**
	 * Return all the fields/functions of this objects. For garbage collection purposes.
	 * @return A collection of all fields. 
	 */
	public Collection<Value> getValues() {
		return data.values();
	}
	
}
