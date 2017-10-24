package nl.gvm.compiler.ast.expressions;

import java.util.List;
import nl.gvm.compiler.GCompiler;
import nl.gvm.compiler.ast.statements.Statement;
import nl.gvm.core.GVM;
import nl.gvm.program.GVMFunction;
import nl.gvm.streams.RandomAccessByteStream;

public class FunctionDefExpression extends Expression {

	private final List<Statement> statements;
	private final List<String> parameters;
	
	public FunctionDefExpression( List<String> parameters , List<Statement> stats )
	{
		this.statements = stats;
		this.parameters = parameters;
	}
	
	@Override
	public void compile(GCompiler c) {
		RandomAccessByteStream code = c.code;
		GVMFunction prev = c.getFunction();
		
		RandomAccessByteStream fcode = new RandomAccessByteStream();
		GVMFunction function = new GVMFunction( fcode, parameters);
		c.setFunction(function);
		c.code = fcode;
		
		int index = c.getProgram().addFunction(function);
		for( Statement s : statements )
		{
			s.compile(c);
		}
		c.code = code;
		c.setFunction(prev);
		c.code.add( GVM.LDC_F );
		c.code.writeInt( index );
		
	}

}
