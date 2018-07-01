package nl.gvm.compiler.ast.statements;

import nl.gvm.compiler.GCompiler;
import nl.gvm.compiler.ast.expressions.Expression;
import nl.gvm.core.GVM;

public class WhileStatement extends LoopStatement{

	private Expression condition;
	private Statement statement;
	
	public WhileStatement( Expression condition, Statement loop )
	{
		this.condition = condition;
		this.statement = loop;
	}	
	
	public WhileStatement( Expression condition )
	{
		this.condition = condition;
	}

	public void setLoop( Statement l )
	{
		this.statement = l;
	}
	
	@Override
	public void compile(GCompiler c) {
		int pos = c.code.size();
		
		condition.compile(c);
		
		c.code.add( GVM.NOT );
		c.code.add( GVM.CJMP );
		int placepos = c.code.size();
		c.code.writeInt( -1 ); // Placeholder at pos+2
		statement.compile(c);
		c.code.add( GVM.JMP );
		c.code.writeInt( pos );
		
		//Set placeholder value
		int endPos = c.code.size();
		c.code.set( placepos, endPos );
		for( JumpStatement js : breaks )
			js.setJump(endPos);
		for( JumpStatement js : continues )
			js.setJump(pos);
		
	}

}
