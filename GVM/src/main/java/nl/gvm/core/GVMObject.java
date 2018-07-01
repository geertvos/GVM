package nl.gvm.core;

import java.util.Collection;

public interface GVMObject {

	void setValue(int id, Value v);

	Value getValue(int id);

	Collection<Value> getValues();

}
