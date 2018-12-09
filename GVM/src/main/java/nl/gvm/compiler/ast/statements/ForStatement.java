package nl.gvm.compiler.ast.statements;

import nl.gvm.compiler.GCompiler;
import nl.gvm.compiler.ast.expressions.Expression;
import nl.gvm.core.GVM;

public class ForStatement extends LoopStatement {

	private final Expression condition;
	private final Statement initstatement;
	private final Statement updatestatement;
	private Statement loopstatement;

	public ForStatement( Statement init , Expression condition , Statement update )
	{
		this.initstatement = init;
		this.condition = condition;
		this.updatestatement = update;
	}

	
	public ForStatement( Statement init , Expression condition , Statement update ,Statement loop )
	{
		this.initstatement = init;
		this.condition = condition;
		this.updatestatement = update;
		this.loopstatement = loop;
	}

	public void setLoop( Statement s )
	{
		this.loopstatement = s;
	}
	
	@Override
	public void compile(GCompiler c) {
		initstatement.compile(c);
		int conditionpos = c.code.size();
		condition.compile(c);
		c.code.add( GVM.NOT );
		c.code.add( GVM.CJMP );
		int elsepos = c.code.size();
		c.code.writeInt( -1 ); 
		loopstatement.compile(c);
		int updatepos = c.code.size();
		updatestatement.compile(c);
		c.code.add( GVM.JMP );
		c.code.writeInt( conditionpos );
		c.code.set( elsepos, c.code.size());

		int endPos = c.code.size();
		for( JumpStatement js : breaks )
			js.setJump(endPos);
		for( JumpStatement js : continues )
			js.setJump(updatepos);
		
	}	
	
}
