package nl.gvm.compiler.ast.statements;

import java.util.List;
import java.util.Vector;


import nl.gvm.compiler.GCompiler;

public class StatementBlockStatement extends Statement {

	private List<Statement> statements;

	public StatementBlockStatement()
	{
		this.statements = new Vector<Statement>();
	}
	
	public StatementBlockStatement( List<Statement> statements )
	{
		this.statements = statements;
	}
	
	public void addStatement( Statement statement )
	{
		this.statements.add( statement );
	}
	
	@Override
	public void compile(GCompiler c) {
		for( Statement s : statements )
			s.compile(c);
	}

}
