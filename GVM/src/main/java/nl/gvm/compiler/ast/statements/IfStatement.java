package nl.gvm.compiler.ast.statements;

import nl.gvm.compiler.GCompiler;
import nl.gvm.compiler.ast.expressions.Expression;
import nl.gvm.core.GVM;

public class IfStatement extends Statement{

	private Expression condition;
	private Statement truestatement;
	private Statement falsestatement;
	
	public IfStatement( Expression condition,Statement truestatement, Statement falsestatement )
	{
		this.condition = condition;
		this.truestatement = truestatement;
		this.falsestatement = falsestatement;
	}
	
	public IfStatement( Expression condition,Statement truestatement  )
	{
		this.condition = condition;
		this.truestatement = truestatement;
	}	
	
	@Override
	public void compile(GCompiler c) {
		condition.compile(c);
		c.code.add( GVM.NOT );
		c.code.add( GVM.CJMP );
		int elsepos = c.code.getPointerPosition();
		c.code.writeInt( -1 ); 
		truestatement.compile(c);
		if( falsestatement != null )
		{
			c.code.add( GVM.JMP );
			int endoftrue = c.code.getPointerPosition();
			c.code.writeInt( -1 );
			c.code.set(elsepos, c.code.getPointerPosition());
			falsestatement.compile(c);
			c.code.set(endoftrue, c.code.getPointerPosition());
		} else {
			c.code.set(elsepos, c.code.getPointerPosition());
		}
	}

}
