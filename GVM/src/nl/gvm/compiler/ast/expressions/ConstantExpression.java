package nl.gvm.compiler.ast.expressions;

import nl.gvm.compiler.GCompiler;
import nl.gvm.core.GVM;
import nl.gvm.core.Value;
import nl.gvm.core.Value.TYPE;

public class ConstantExpression extends Expression {

	private Value.TYPE type;
	private int value;
	private String string;
	
	public ConstantExpression( int value, Value.TYPE type )
	{
		this.value = value;
		this.type = type;
	}
	
	public ConstantExpression( String s )
	{
		this.string = s;
		type = Value.TYPE.STRING;
	}

	public ConstantExpression()
	{
		this.type = TYPE.OBJECT;
	}	
	
	@Override
	public void compile(GCompiler c) {
		if (type == Value.TYPE.BOOLEAN)
		{
			c.code.add( GVM.LDC_B);
			c.code.write( (byte)value );
		}
		if (type == Value.TYPE.NUMBER) 
		{
			c.code.add( GVM.LDC_N);
			c.code.writeInt(value);
		}
		if (type == Value.TYPE.FUNCTION) 
		{
			c.code.add( GVM.LDC_F);
			c.code.writeInt(value);
		}
		if (type == Value.TYPE.STRING)
		{
			c.code.add( GVM.LDC_S);
			if( !c.stringConstants.contains(string) )
				c.stringConstants.add(string);
			c.code.writeInt( c.stringConstants.indexOf(string));
			return;
		}
		if (type == Value.TYPE.UNDEFINED)
		{
			c.code.add( GVM.LDC_U);
			return;
		}
		if (type == Value.TYPE.OBJECT)
		{
			c.code.add( GVM.NEW);
			return;
		}
	}
	
}
