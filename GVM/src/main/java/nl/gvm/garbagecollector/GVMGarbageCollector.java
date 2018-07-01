package nl.gvm.garbagecollector;
import java.util.Map;
import java.util.Stack;

import nl.gvm.core.GVMObject;
import nl.gvm.core.GVMPlainObject;
import nl.gvm.core.Value;


public interface GVMGarbageCollector {

	void collect(Map<Integer, GVMObject> heap, Stack<Value> stack);

}
