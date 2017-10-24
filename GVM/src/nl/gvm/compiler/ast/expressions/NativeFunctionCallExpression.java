package nl.gvm.compiler.ast.expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import nl.gvm.compiler.GCompiler;
import nl.gvm.core.GVM;
import nl.gvm.program.NativeMethodWrapper;

public class NativeFunctionCallExpression extends Expression {

	private int identifier;
	private List<Expression> parameters = new ArrayList<Expression>();
	private NativeMethodWrapper method;
	
	public NativeFunctionCallExpression( NativeMethodWrapper nmw , List<Expression> parameters )
	{
		this.method = nmw;
		this.parameters = parameters;
	}
	
	public NativeFunctionCallExpression( int identifier , List<Expression> parameters )
	{
		this.identifier = identifier;
		this.parameters = parameters;
	}
	
	public NativeFunctionCallExpression(int identifier) {
		this.identifier = identifier;
	}

	@Override
	public void compile(GCompiler c) {
		
		if( method!= null )
		{
			if( !c.natives.contains(method))
				c.natives.add(method);
			identifier = c.natives.indexOf(method);
		}
		for( Expression e : parameters )
			e.compile(c);
		c.code.add(GVM.LDC_F);
		c.code.writeInt(identifier);
		c.code.add(GVM.NATIVE);
	}

}
