package nl.gvm.compiler.ast.expressions;

import nl.gvm.core.GVM;
import nl.gvm.compiler.GCompiler;

public class VariableExpression extends Expression implements FieldReferenceExpression {

	private String name;
	private Expression field;
	
	/**
	 * Construct a variable pointing to this.<name>
	 * Non existing fields will be created
	 * @param name The name of the variable
	 */
	public VariableExpression(String name){
		this.name = name;
	}
	
	/**
	 * Construct a variable <field>.name
	 * Non existing fields will be created
	 * @param name The name of the variable
	 * @param field The field to which the variable belongs
	 */
	public VariableExpression(String name,Expression field){
		this.name = name;
		this.field = field;
	}

	public void setField( Expression field )
	{
		if( this.field!=null)
			((FieldReferenceExpression) this.field).setField(field);
		else this.field = field;
	}
	
	public void compile(GCompiler c) {
		if( c.function.parameters.contains(name) && field==null )
		{
			//Variable points to a parameter
			c.code.add(GVM.LDS);
			c.code.writeInt(1+c.function.parameters.indexOf(name)); 
		} else if( c.function.getLocals().contains(name) && field==null ) {
			//Variable points to a local variable
			c.code.add(GVM.LDS);
			c.code.writeInt(1+c.function.parameters.size()+c.function.getLocals().indexOf(name)); 
		} else {
			//Variable points to a field of this
			if( !c.varNamesConstants.contains(name))
				c.varNamesConstants.add(name);
			int index = c.varNamesConstants.indexOf(name);
			if( field!=null )
				field.compile(c);
			else {
				c.code.add(GVM.LDS);
				c.code.writeInt(0); //Load this
			}
			c.code.add(GVM.GET);
			c.code.writeInt(index);
		}
	}
	
	
	
	
}
