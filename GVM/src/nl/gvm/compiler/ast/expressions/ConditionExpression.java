package nl.gvm.compiler.ast.expressions;

import nl.gvm.compiler.GCompiler;
import nl.gvm.core.GVM;

public class ConditionExpression extends Expression {

	private final Expression condition;
	private final Expression trueVal;
	private final Expression falseVal;

	public ConditionExpression( Expression condition , Expression trueVal, Expression falseVal )
	{
		this.condition = condition;
		this.trueVal = trueVal;
		this.falseVal = falseVal;
	}

	@Override
	public void compile(GCompiler c) {
		condition.compile(c);
		c.code.add(GVM.CJMP);
		c.code.writeInt(-1);
		int truepart = c.code.size()-1;
		falseVal.compile(c);
		c.code.add(GVM.JMP);
		int end = c.code.size()-1;
		c.code.set(truepart, c.code.size() );
		trueVal.compile(c);
		c.code.set(end, c.code.size());
	}
	
}
