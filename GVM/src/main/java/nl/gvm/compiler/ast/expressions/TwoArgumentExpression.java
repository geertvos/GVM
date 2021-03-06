package nl.gvm.compiler.ast.expressions;

import nl.gvm.compiler.GCompiler;

public class TwoArgumentExpression extends Expression {

	private final Expression lhs;
	private final Expression rhs;
	
	
	public TwoArgumentExpression( Expression lhs , Expression rhs )
	{
		this.lhs = lhs;
		this.rhs = rhs;
	}
	
	@Override
	public void compile(GCompiler c) {
		lhs.compile(c);
		rhs.compile(c);
	}

}
