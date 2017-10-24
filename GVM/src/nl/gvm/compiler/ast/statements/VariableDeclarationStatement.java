package nl.gvm.compiler.ast.statements;

import nl.gvm.compiler.GCompiler;
import nl.gvm.compiler.ast.expressions.AssignmentExpression;
import nl.gvm.compiler.ast.expressions.Expression;
import nl.gvm.compiler.ast.expressions.VariableExpression;
import nl.gvm.core.GVM;

public class VariableDeclarationStatement extends Statement {

	private String name;
	private Expression value;
	
	public VariableDeclarationStatement( String name )
	{
		this.name = name;
	}
	
	public VariableDeclarationStatement( String name , Expression val )
	{
		this.name = name;
		this.value = val;
	}

	@Override
	public void compile(GCompiler c) {
		c.function.registerLocalVariable(name);
		//Variable points to a parameter
		if( value!=null){
			Expression as = new AssignmentExpression(new VariableExpression(name), value);
			as.compile(c);
			c.code.write(GVM.POP); //Remove the value from stack
		}
	}
}
