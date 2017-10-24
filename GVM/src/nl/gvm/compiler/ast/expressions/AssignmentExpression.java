package nl.gvm.compiler.ast.expressions;

import nl.gvm.compiler.GCompiler;
import nl.gvm.core.GVM;

public class AssignmentExpression extends Expression {

	private Expression value;
	private Expression variable;

	/**
	 * Assign a value to an existing or non existing variable
	 * @param variable The variable to set
	 * @param value The value to set
	 */
	public AssignmentExpression( Expression variable, Expression value )
	{
		this.value = value;
		this.variable = variable;
	}
	
	public void compile(GCompiler c) {
		value.compile(c);
		variable.compile(c);
		c.code.add(GVM.PUT);
	}

	
	
}
