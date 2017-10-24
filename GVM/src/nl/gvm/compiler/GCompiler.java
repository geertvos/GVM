package nl.gvm.compiler;

import java.util.List;
import java.util.Vector;

import nl.gvm.compiler.ast.statements.Statement;
import nl.gvm.core.GVM;
import nl.gvm.program.GVMFunction;
import nl.gvm.program.GVMProgram;
import nl.gvm.program.NativeMethodWrapper;
import nl.gvm.streams.RandomAccessByteStream;

/**
 * The GCompiler compiles a list of Statements into a bytecode program
 * that can be executed by the GVM. 
 * 
 * @author geertvos
 */
public class GCompiler {

	public List<String> stringConstants = new Vector<String>();
	public List<String> varNamesConstants = new Vector<String>();
	public RandomAccessByteStream code;
	public GVMFunction function;
	public GVMProgram program;
	public List<NativeMethodWrapper> natives = new Vector<NativeMethodWrapper>();
	
	public GVMProgram compile(List<Statement> compilables)
	{
		program = new GVMProgram("demo");
		code = new RandomAccessByteStream();
		function = new GVMFunction(code, new Vector<String>());
		program.addFunction(function);
		
		code.add(GVM.NEW); //Init main function
		for( Compilable s : compilables )
		{
			s.compile(this);
		}
		code.add(GVM.HALT); //Make sure the VM stops
		
		//Prepare bytecode
		function.setBytecode(code);

		program.setConstants( stringConstants );
		program.setNatives(natives);
		return program;
		
	}
	
	
	
}
