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

		GScriptASTRewriter parser = new GScriptASTRewriter();
		InputStream is = new FileInputStream(new File("exceptions.gs"));
		List<Statement> statements = parser.parse(is);
		GCompiler compiler = new GCompiler();
		GVMProgram p = compiler.compile(statements);
		//GVMDebugInfo.displayProgram(p);
		GVM vm = new GVM(p);
		vm.run();
	}

}
