package nl.gvm.compiler.ast.expressions;

import java.util.ArrayList;
import java.util.List;

import nl.gvm.compiler.GCompiler;
import nl.gvm.core.GVM;

public class FunctionCallExpression extends Expression implements FieldReferenceExpression{

	private final FieldReferenceExpression function;
	private final List<Expression> parameters;
	private Expression field;

	
	public FunctionCallExpression( Expression field, FieldReferenceExpression function , List<Expression> parameters )
	{
		this.field = field;
		this.function = function;
		this.parameters = parameters;
	}	
	
	public void setField( Expression field )
	{
		if( this.field == null )
		{
			this.field = field;
			this.function.setField(field);
		} else {
			((FieldReferenceExpression)this.field).setField(field);
		}
	}

	public void setFieldOnly( Expression field )
	{
		this.field = field;
	}
	
	public FunctionCallExpression( FieldReferenceExpression function , List<Expression> parameters )
	{
		this.function = function;
		this.parameters = parameters;
	}

	public FunctionCallExpression( FieldReferenceExpression function )
	{
		this.function = function;
		this.parameters = new ArrayList<Expression>();
	}

	
	@Override
	public void compile(GCompiler c) {
		if( field== null ) //Add a pointer to this
		{
			c.code.add(GVM.LDS);
			c.code.writeInt(0);
		} else {
			field.compile(c);
		}
		//TODO: Compile in a parameter count check
		for( Expression e : parameters )
			e.compile(c);
		function.compile(c);
		c.code.add(GVM.INVOKE);
		c.code.writeInt(parameters.size());
	}

}
