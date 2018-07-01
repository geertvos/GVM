package nl.gvm.compiler.ast.expressions;

import nl.gvm.compiler.GCompiler;

public class ConstructorExpression extends Expression {

	private final FunctionCallExpression function;
	
	public ConstructorExpression( FunctionCallExpression function )
	{
		this.function = function;
		function.setFieldOnly( new ConstantExpression() );		
	}
	
	@Override
	public void compile(GCompiler c) {
		function.compile(c);
	}

}
