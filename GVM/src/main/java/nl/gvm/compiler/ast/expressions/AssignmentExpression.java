package nl.gvm.compiler.ast.expressions;

import java.util.LinkedList;
import java.util.List;

import nl.gvm.compiler.GCompiler;
import nl.gvm.core.GVM;

public class AssignmentExpression extends Expression {

	private final List<Expression> variables;
	private final Expression value;


	public AssignmentExpression( List<Expression> variables, Expression value )
	{
		this.variables = variables;
		this.value = value;
	}

	
	public AssignmentExpression( Expression variable, Expression value )
	{
		this.value = value;
		this.variables = new LinkedList<>();
		this.variables.add(variable);
	}
	
	public void compile(GCompiler c) {
		if(variables.size() == 1) {
			value.compile(c);
			variables.get(0).compile(c);
			c.code.add(GVM.PUT);
		} else {
			value.compile(c);
			for(int i=0;i<variables.size();i++) {
				c.code.add(GVM.DUP);
				c.code.add(GVM.GET);
				c.code.writeInt(i);
				variables.get(i).compile(c);
				c.code.add(GVM.PUT);
				c.code.add(GVM.POP);
			}
			c.code.add(GVM.POP);
		}
	}

	
	
}
