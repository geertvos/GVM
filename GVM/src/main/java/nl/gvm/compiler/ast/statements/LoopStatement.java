package nl.gvm.compiler.ast.statements;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public abstract class LoopStatement extends Statement {

	protected final List<JumpStatement> breaks = new LinkedList<JumpStatement>();
	protected final List<JumpStatement> continues = new LinkedList<JumpStatement>();
	
	public void addBreak( JumpStatement b )
	{
		breaks.add(b);
	}
	
	public void addContinue( JumpStatement c )
	{
		continues.add(c);
	}
}
