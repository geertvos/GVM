package nl.gvm.compiler.ast.statements;

import nl.gvm.compiler.GCompiler;
import nl.gvm.compiler.ast.expressions.Expression;
import nl.gvm.core.GVM;

public class ExpressionStatement extends Statement {

	private final Expression expression;
	
	public ExpressionStatement( Expression e )
	{
		this.expression = e;
	}
	
	@Override
	public void compile(GCompiler c) {
		expression.compile(c);
		c.code.add( GVM.POP );
	}

}
