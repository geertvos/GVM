package nl.gvm.compiler.ast.expressions;

import nl.gvm.core.GVM;
import nl.gvm.compiler.GCompiler;

public class AddOperator extends TwoArgumentExpression {

	public AddOperator( Expression lhs , Expression rhs )
	{
		super(lhs,rhs);
	}
	
	@Override
	public void compile(GCompiler c) {
		super.compile(c);
		c.code.add(GVM.ADD);
	}

}
