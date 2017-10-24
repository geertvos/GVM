package nl.gvm.compiler.ast.expressions;

import nl.gvm.compiler.GCompiler;
import nl.gvm.core.GVM;

public class DivOperator extends TwoArgumentExpression {

	public DivOperator( Expression lhs , Expression rhs )
	{
		super(lhs,rhs);
	}
	
	@Override
	public void compile(GCompiler c) {
		super.compile(c);
		c.code.add(GVM.DIV);
	}

}
