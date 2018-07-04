package nl.gvm.main;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
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
			System.out.println("┌─────────────────────────────────────────┐");
			System.out.println("│                 GVM v 1.00              │");
			System.out.println("└─────────────────────────────────────────┘");
			System.out.println("Please specify file name.");
		}
		System.out.println("> Compiling "+filename);
		long start = System.currentTimeMillis();
		GScriptASTRewriter parser = new GScriptASTRewriter();
		InputStream sys = new FileInputStream(new File("system.gs"));
		List<Statement> system = parser.parse(sys);

		InputStream is = new FileInputStream(new File(filename));
		List<Statement> userStatements = parser.parse(is);

		GCompiler compiler = new GCompiler();
		List<Statement> program = new LinkedList<>();
		program.addAll(system);
		program.addAll(userStatements);
		GVMProgram p = compiler.compile(program);
		long end = System.currentTimeMillis();
		System.out.println("> Compilation finished. Took "+(end-start)+"ms");
		System.out.println();
//		GVMDebugInfo.displayProgram(p);
		GVM vm = new GVM(p);
		vm.run();
	}

	
}
