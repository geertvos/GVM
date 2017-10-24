package nl.gvm.compiler.ast.statements;

import java.util.List;
import java.util.Vector;

public abstract class LoopStatement extends Statement {

	protected List<JumpStatement> breaks = new Vector<JumpStatement>();
	protected List<JumpStatement> continues = new Vector<JumpStatement>();
	
	public void addBreak( JumpStatement b )
	{
		breaks.add(b);
	}
	
	public void addContinue( JumpStatement c )
	{
		continues.add(c);
	}
}
