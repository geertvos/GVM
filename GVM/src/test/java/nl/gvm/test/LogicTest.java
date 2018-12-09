package nl.gvm.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

import org.antlr.runtime.RecognitionException;
import org.testng.annotations.Test;

import nl.gvm.compiler.GCompiler;
import nl.gvm.compiler.ast.statements.Statement;
import nl.gvm.compiler.parser.GScriptASTRewriter;
import nl.gvm.core.GVM;
import nl.gvm.program.GVMProgram;
import org.testng.Assert;

public class LogicTest {

	@Test(groups = "unit")
	void testLogic() throws IOException, RecognitionException {
		GScriptASTRewriter parser = new GScriptASTRewriter();
		InputStream sys = new FileInputStream(new File("system.gs"));
		List<Statement> system = parser.parse(sys);

		InputStream is = new FileInputStream(new File("logictest.gs"));
		List<Statement> userStatements = parser.parse(is);

		GCompiler compiler = new GCompiler();
		List<Statement> program = new LinkedList<>();
		program.addAll(system);
		program.addAll(userStatements);
		GVMProgram p = compiler.compile(program);
		GVM vm = new GVM(p);
		vm.run();
		Assertions.failFailures();
	}
	
	
}
