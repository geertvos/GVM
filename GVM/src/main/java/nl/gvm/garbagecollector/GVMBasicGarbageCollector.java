package nl.gvm.garbagecollector;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import nl.gvm.core.GVMObject;
import nl.gvm.core.Value;


public class GVMBasicGarbageCollector implements GVMGarbageCollector {

	private Map<Integer,GVMObject> heap;
	private int currentTreshHold = 20;
	
	@Override
	public void collect(Map<Integer, GVMObject> heap, Stack<Value> stack) {
		if( heap.size() < currentTreshHold )
			return;
		
		//Build list of live objects
		this.heap = heap;
		Set<GVMObject> alive = new HashSet<GVMObject>();
		for( Value v : stack )
		{
			if( v.getType().equals(Value.TYPE.OBJECT))
			{
				GVMObject child = heap.get(v.getValue());
				search( child , alive);
			}
		}
		heap.values().retainAll(alive);
		while( heap.size() > currentTreshHold )
			currentTreshHold = currentTreshHold*2;
		System.out.println("GC executed.");
	}
	
	private void search( GVMObject o , Set<GVMObject> alive )
	{
		if( !alive.contains(o) )
		{
			alive.add(o);
			for( Value v : o.getValues() )
			{
				if( v.getType().equals(Value.TYPE.OBJECT))
				{
					GVMObject child = heap.get(v.getValue());
					search( child , alive);
				}
			}
		}
	}

}
