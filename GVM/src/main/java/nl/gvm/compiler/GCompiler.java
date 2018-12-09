package nl.gvm.compiler;

import java.util.ArrayList;
import java.util.LinkedList;
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

	private List<String> stringConstants = new ArrayList<>();
	private List<String> varNamesConstants = new ArrayList<>();
	public List<NativeMethodWrapper> natives = new ArrayList<>();

	public RandomAccessByteStream code;
	private GVMFunction function;
	private GVMProgram program;
	
	public GVMProgram compile(List<Statement> compilables)
	{
		program = new GVMProgram("demo");
		code = new RandomAccessByteStream();
		function = new GVMFunction(code, new ArrayList<String>());
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
	
	public int registerString(String stringConstant) {
		if(!stringConstants.contains(stringConstant)) {
			stringConstants.add(stringConstant);
		}
		return stringConstants.indexOf(stringConstant);
	}
	
	public int registerVariable(String svariableName) {
		if(!varNamesConstants.contains(svariableName)) {
			varNamesConstants.add(svariableName);
		}
		return varNamesConstants.indexOf(svariableName);
	}
	
	public GVMFunction getFunction() {
		return function;
	}
	
	public void setFunction(GVMFunction function) {
		this.function = function;
	}
	
	public GVMProgram getProgram() {
		return program;
	}
}
