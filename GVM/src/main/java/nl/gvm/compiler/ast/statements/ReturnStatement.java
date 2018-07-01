package nl.gvm.compiler.ast.statements;

import nl.gvm.compiler.GCompiler;
import nl.gvm.compiler.ast.expressions.Expression;
import nl.gvm.core.GVM;

public class ReturnStatement extends Statement {

	private Expression returnValue;
	
	public ReturnStatement()
	{
		
	}

	public ReturnStatement( Expression val )
	{
		this.returnValue = val;
	}

	
	@Override
	public void compile(GCompiler c) {
		if( returnValue == null )
			c.code.add(GVM.LDC_U);
		else
			returnValue.compile(c);
		c.code.add(GVM.RETURN);
	}

}
