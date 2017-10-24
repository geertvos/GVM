package nl.gvm.compiler.ast.expressions;

import nl.gvm.compiler.Compilable;

public interface FieldReferenceExpression extends Compilable {
	public void setField( Expression e );
}
