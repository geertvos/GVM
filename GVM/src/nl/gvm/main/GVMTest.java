package nl.gvm.main;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import nl.gvm.compiler.GCompiler;
import nl.gvm.compiler.ast.statements.Statement;
import nl.gvm.compiler.parser.GScriptASTRewriter;
import nl.gvm.core.GVM;
import nl.gvm.core.GVMDebugInfo;
import nl.gvm.program.GVMFunction;
import nl.gvm.program.GVMProgram;
import nl.gvm.streams.RandomAccessByteStream;

import org.antlr.runtime.RecognitionException;

public class GVMTest {

	public static void main(String[] args) throws IOException, RecognitionException {
		String filename = "";
		if(args.length == 1) {
			filename = args[0];
		} else {
			System.out.println("Please specify file name.");
		}
		System.out.println("┌─────────────────────────────────────────┐");
		System.out.println("│                 GVM v 1.00              │");
		System.out.println("└─────────────────────────────────────────┘");
		System.out.println("> Compiling "+filename);
		long start = System.currentTimeMillis();
		GScriptASTRewriter parser = new GScriptASTRewriter();
		InputStream is = new FileInputStream(new File(filename));
		List<Statement> statements = parser.parse(is);
		GCompiler compiler = new GCompiler();
		GVMProgram p = compiler.compile(statements);
		long end = System.currentTimeMillis();
		System.out.println("> Compilation finished. Took "+(end-start)+"ms");
		System.out.println("> Started VM.");
		System.out.println("───────────────────────────────────────────");
		System.out.println();
		//GVMDebugInfo.displayProgram(p);
		GVM vm = new GVM(p);
		vm.run();
	}

	public static void testMethod() {
		System.out.println("Calling a test method through native wrapper.");
	}
	
	public static void testMethodString(String param) {
		System.out.println("Calling a test method through native wrapper with a param: "+param);
	}
	
}