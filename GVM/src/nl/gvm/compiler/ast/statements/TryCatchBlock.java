package nl.gvm.compiler.ast.statements;

import nl.gvm.compiler.GCompiler;
import nl.gvm.core.GVM;

public class TryCatchBlock extends Statement {

	private Statement tryBlock;
	private Statement catchBlock;
	private String variableName;
	
	public TryCatchBlock( Statement tryBlock , String variableName , Statement catchBlock )
	{
		this.tryBlock = tryBlock;
		this.variableName = variableName;
		this.catchBlock = catchBlock;
	}
	
	@Override
	public void compile(GCompiler c) {
		int startIndex = c.code.getPointerPosition();
		tryBlock.compile(c);
		c.code.add(GVM.JMP);
		int endofTry = c.code.getPointerPosition();
		c.code.writeInt(0);//Set to end of catch
		c.function.registerLocalVariable(variableName);
		c.code.add(GVM.LDS);
		c.code.writeInt(1+c.function.parameters.size()+c.function.getLocals().indexOf(variableName));
		c.code.add(GVM.PUT);
		catchBlock.compile(c);
		c.code.set(endofTry, c.code.getPointerPosition());
		c.function.registerCatchBlock(startIndex, endofTry-1, endofTry+4);
	}

}
