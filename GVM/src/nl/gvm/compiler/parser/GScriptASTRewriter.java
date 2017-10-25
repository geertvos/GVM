package nl.gvm.compiler.parser;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import nl.gvm.compiler.ast.expressions.AddOperator;
import nl.gvm.compiler.ast.expressions.AndExpression;
import nl.gvm.compiler.ast.expressions.AssignmentExpression;
import nl.gvm.compiler.ast.expressions.ConditionExpression;
import nl.gvm.compiler.ast.expressions.ConstantExpression;
import nl.gvm.compiler.ast.expressions.ConstructorExpression;
import nl.gvm.compiler.ast.expressions.DivOperator;
import nl.gvm.compiler.ast.expressions.EqualsOperator;
import nl.gvm.compiler.ast.expressions.Expression;
import nl.gvm.compiler.ast.expressions.FieldReferenceExpression;
import nl.gvm.compiler.ast.expressions.FunctionCallExpression;
import nl.gvm.compiler.ast.expressions.FunctionDefExpression;
import nl.gvm.compiler.ast.expressions.GreaterOperator;
import nl.gvm.compiler.ast.expressions.LowerOperator;
import nl.gvm.compiler.ast.expressions.MultOperator;
import nl.gvm.compiler.ast.expressions.NativeFunctionCallExpression;
import nl.gvm.compiler.ast.expressions.NotExpression;
import nl.gvm.compiler.ast.expressions.OrExpression;
import nl.gvm.compiler.ast.expressions.SubOperator;
import nl.gvm.compiler.ast.expressions.ThisExpression;
import nl.gvm.compiler.ast.expressions.VariableExpression;
import nl.gvm.compiler.ast.statements.ExpressionStatement;
import nl.gvm.compiler.ast.statements.ForStatement;
import nl.gvm.compiler.ast.statements.IfStatement;
import nl.gvm.compiler.ast.statements.JumpStatement;
import nl.gvm.compiler.ast.statements.LoopStatement;
import nl.gvm.compiler.ast.statements.ReturnStatement;
import nl.gvm.compiler.ast.statements.Statement;
import nl.gvm.compiler.ast.statements.StatementBlockStatement;
import nl.gvm.compiler.ast.statements.TryCatchBlock;
import nl.gvm.compiler.ast.statements.VariableDeclarationStatement;
import nl.gvm.compiler.ast.statements.WhileStatement;
import nl.gvm.core.Value.TYPE;
import nl.gvm.program.NativeMethodAutoWrapper;
import nl.gvm.program.NativePrintMethod;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

public class GScriptASTRewriter {
	
	private Stack<LoopStatement> loopStack;
	
	 public List<Statement> parse(InputStream is) throws IOException, RecognitionException
	 {
		 loopStack = new Stack<LoopStatement>();
		 ANTLRInputStream input = new ANTLRInputStream( is );
	     GScriptLexer lexer = new GScriptLexer(input);
	     CommonTokenStream tokens = new CommonTokenStream(lexer);
	     GScriptParser parser = new GScriptParser(tokens);
	     CommonTree t  = (CommonTree) parser.program().getTree();
	     
	     if( t.getType() == GScriptLexer.PROGRAM )
	     {
	    	 return parseProgram(t);
	     } else return null;
	 }
	 
	 public List<Statement> parseProgram( Tree t )
	 {
		 List<Statement> statements = new Vector<Statement>();
		 for( int i = 0;i <t.getChildCount() ; i++)
		 {
			 statements.add(parseStatement( t.getChild(i) ));
		 }
		 return statements;
	 }
	 
	 public Statement parseStatement( Tree t )
	 {
		 switch( t.getType() )
		 {
		 case GScriptLexer.EXPRESSIONSTATEMENT:
		 {
			 Expression exp = parseExpression( t.getChild(0) );
			 return new ExpressionStatement(exp);
		 }
		 case GScriptLexer.IFSTATEMENT:
		 {
			 Expression cond = parseExpression(t.getChild(0));
			 Statement trueStatement;
			 if( t.getChildCount() == 2 )
			 {
				 trueStatement = parseStatement(t.getChild(1));
				 return new IfStatement(cond, trueStatement);
			 } else {
				 trueStatement = parseStatement(t.getChild(1));
				 Statement falseStatement = parseStatement(t.getChild(2));
				 return new IfStatement(cond, trueStatement,falseStatement);
			 }
		 }
		 case GScriptLexer.FORSTATEMENT:
		 {
			 Statement init = parseStatement(t.getChild(0));	
			 Expression cond = parseExpression(t.getChild(1));	
			 Statement update = parseStatement(t.getChild(2));	
			 ForStatement forStat = new ForStatement(init, cond, update);
			 this.loopStack.push(forStat);
			 Statement loop = parseStatement(t.getChild(3));
			 this.loopStack.pop();
			 forStat.setLoop(loop);
			 return forStat;
		 }
		 case GScriptLexer.WHILESTATEMENT:
		 {
			 Expression cond = parseExpression(t.getChild(0));
			 WhileStatement ws = new WhileStatement(cond);
			 loopStack.push(ws);
			 Statement loop = parseStatement(t.getChild(1));
			 loopStack.pop();
			 ws.setLoop(loop);
			 return ws;
		 }	
		 case GScriptLexer.STATEMENTBLOCK:
		 {
			 StatementBlockStatement block = new StatementBlockStatement();
			 for( int i=0;i<t.getChildCount();i++)
			 {
				 block.addStatement( parseStatement( t.getChild(i) ) );
			 }
			 return block;
		 }
		 case GScriptLexer.CONTINUESTATEMENT:
			 {
				 if( loopStack.size() == 0 )
				 {
					 System.out.println("Continue can only be used inside a loop construct.");
					 return null;
				 }
				 JumpStatement js = new JumpStatement();
				 loopStack.peek().addContinue( js );
				 return js;
			 }
		 case GScriptLexer.BREAKSTATEMENT:
		 {
			 if( loopStack.size() == 0 )
			 {
				 System.out.println("Break can only be used inside a loop construct.");
				 return null;
			 }
			 JumpStatement js = new JumpStatement();
			 loopStack.peek().addBreak( js );
			 return js;
		 }	
		 case GScriptLexer.RETURNSTATEMENT:
			 if( t.getChildCount()==0)
				 return new ReturnStatement();
			 if( t.getChildCount()==1)
			 {
				 return new ReturnStatement( parseExpression(t.getChild(0)) );
			 }
			 break;
		 case GScriptLexer.VARDEFSTATEMENT:
		 {
			 if( t.getChildCount() == 1 )
			 {
				 //Only declare variable
				 return new VariableDeclarationStatement(t.getChild(0).getText());
			 } else if( t.getChildCount() == 2) {
				 return new VariableDeclarationStatement(t.getChild(0).getText(),parseExpression(t.getChild(1)));
			 } else {
				 System.out.println("Variable defintion expects 1 or two child nodes.");
			 }
		 }
		 case GScriptLexer.TRYCATCHBLOCK:
		 {
			 if( t.getChildCount() == 3 )
			 {
				 Statement tryBlock = parseStatement(t.getChild(0));
				 String identifier = t.getChild(1).getText();
				 Statement catchBlock = parseStatement(t.getChild(2));
				 return new TryCatchBlock(tryBlock, identifier, catchBlock);
			 }
		 }
		 }
		 return null;
	 }
	 
	 private Expression parseExpression(Tree t) {
		 switch( t.getType() )
		 {
		 case GScriptLexer.ASSIGNMENTEXPRESSION:
		 {
			 if( t.getChildCount() == 2 )
			 {
				 Expression fieldReference = parseExpression(t.getChild(0));
				 Expression argument = parseExpression(t.getChild(1));
				 return new AssignmentExpression( fieldReference , argument );
			 } else {
				System.out.println("Illegal number of child nodes for assignment expression"); 
			 }
		 }
		 case GScriptLexer.CONDITIONEXPRESSION:
			 if( t.getChildCount() == 3 )
			 {
				 return new ConditionExpression( parseExpression(t.getChild(0)),parseExpression(t.getChild(1)),parseExpression(t.getChild(2)));
			 } else {
				 System.out.println("Invalid number of childnodes for condition expression.");
			 }
			 return null;
		 case GScriptLexer.FUNCTIONEXPRESSION:
			 if( t.getChildCount() == 2 )
			 {
				 Tree argumentsTree = t.getChild(0);
				 Tree bodyTree = t.getChild(1);
				 List<String> args = new Vector<String>();
				 for( int i=0;i<argumentsTree.getChildCount();i++)
				 {
					 args.add( argumentsTree.getChild(i).getText());
				 }
				 List<Statement> body = new Vector<Statement>();
				 for( int j=0;j<bodyTree.getChildCount();j++)
				 {
					 body.add( parseStatement( bodyTree.getChild(j)));
				 }
				 return new FunctionDefExpression(args, body);
			 } else {
				 //Generate error
			 }
			 break;
		 case GScriptLexer.NEWEXPRESSION:
		 {
			 if( t.getChildCount()==1)
			 {
				 Expression function = parseExpression(t.getChild(0));
				 if( function instanceof FunctionCallExpression )
					 return new ConstructorExpression((FunctionCallExpression) function);
				 else {
					 System.out.println("Constructor must be a function");
					 return null;
				 }
			 } else {
				 //Generate error
				 System.out.println("New expression expects one argument, functioncall.");
			 }
		 }
		 case GScriptLexer.OREXPRESSION:
		 {
			 if( t.getChildCount() == 2 )
			 {
				 Expression arg1 = parseExpression(t.getChild(0));
				 Expression arg2 = parseExpression(t.getChild(0));
				 return new OrExpression(arg1, arg2);
			 } else {
				 System.out.println("Illegal number of arguments for OR operator");
			 }
		 }
		 case GScriptLexer.ANDEXPRESSION:
			 if( t.getChildCount() == 2 )
			 {
				 Expression arg1 = parseExpression(t.getChild(0));
				 Expression arg2 = parseExpression(t.getChild(0));
				 return new AndExpression(arg1, arg2);
			 } else {
				 System.out.println("Illegal number of arguments for AND operator");
			 }
		 case GScriptLexer.BITOREXPRESSION:
		 case GScriptLexer.BITXOREXPRESSION:
		 case GScriptLexer.BITANDEXPRESSION:
		 case GScriptLexer.EQUALITYEXPRESSION:
		 {
			 if( t.getChildCount() == 3 )
			 {
				 String operator = t.getChild(0).getText();
				 Expression arg1 = parseExpression(t.getChild(1));
				 Expression arg2 = parseExpression(t.getChild(2));
				 if( operator.equals("=="))
				 {
					 return new EqualsOperator(arg1, arg2);
				 } else if(operator.equals("!=")){
					 return new NotExpression(new EqualsOperator(arg1, arg2));
				 } else {
					 System.out.println("Equality operator unknown: "+operator);
				 }
			 } else {
				 System.out.println("Equality expression has invalid number of child nodes");
			 }			 
		 }
		 case GScriptLexer.RELATIONALEXPRESSION:
		 {
			 if( t.getChildCount() == 3 )
			 {
				 String operator = t.getChild(0).getText();
				 Expression arg1 = parseExpression(t.getChild(1));
				 Expression arg2 = parseExpression(t.getChild(2));
				 if( operator.equals("<"))
				 {
					 return new LowerOperator(arg1, arg2);
				 } else if(operator.equals(">")){
					 return new GreaterOperator(arg1, arg2);
				 } else if(operator.equals(">=")){
					 return new OrExpression(new EqualsOperator(arg1, arg2), new GreaterOperator(arg1, arg2)) ;
				 } else if(operator.equals("<=")){
					 return new OrExpression(new EqualsOperator(arg1, arg2), new LowerOperator(arg1, arg2)) ;
				 } else {
					 System.out.println("Relational operator unknown: "+operator);
				 }
			 } else {
				 System.out.println("Equality expression has invalid number of child nodes");
			 }				 
		 }
		 case GScriptLexer.MULTIPLICATIVEEXPRESSION:
		 {
			 if( t.getChildCount()==3)
			 {
				 String operation = t.getChild(0).getText();
				 Expression arg1 = parseExpression(t.getChild(1));
				 Expression arg2 = parseExpression(t.getChild(2));
				 if( operation.equals("*"))
					 return new MultOperator(arg1, arg2);
				 else if( operation.equals("/"))
					 return new DivOperator(arg1, arg2);
				 else System.out.println("Unknown additive operator: "+operation);
			 } else {
				 System.out.println("Unknown number of child nodes for additive expression");
			 }
			 return null;
		 }			 
		 case GScriptLexer.UNARYEXPRESSION:
		 {
			 if( t.getChildCount() == 2 )
			 {
				 String operator = t.getChild(0).getText();
				 Expression arg = parseExpression(t.getChild(1));
				 if( operator.equals("!"))
				 {
					 return new NotExpression(arg);
				 } else {
					 System.out.println("Unknown operator: "+operator);
				 }
			 } else {
				 System.out.println("Unary expression has invalid number of child nodes.");
			 }
			 return null;
		 } 
		 case GScriptLexer.POSTFIXEXPRESSION:
		 {
			 System.out.println("Postfix not implemented");
			 if( t.getChildCount()==2)
			 {
				 String operator = t.getChild(0).getText();
				 Expression variable = parseExpression( t.getChild(1));
				 if( operator.equals("++"))
				 {
					 return new AddOperator(variable, new ConstantExpression(1, TYPE.NUMBER));
				 }
				 else if( operator.equals("--"))
				 {
					 return new SubOperator(variable, new ConstantExpression(1, TYPE.NUMBER));
				 } else {
					 System.out.println("Unknown postfix operator: "+operator);
				 }
			 } else {
				 System.out.println("Invalid number of child nodes for postfix operator");
			 }
			 return null;
		 }
		 case GScriptLexer.ADDITIVEEXPRESSION:
		 {
			 if( t.getChildCount()==3)
			 {
				 String operation = t.getChild(0).getText();
				 Expression arg1 = parseExpression(t.getChild(1));
				 Expression arg2 = parseExpression(t.getChild(2));
				 if( operation.equals("+"))
					 return new AddOperator(arg1, arg2);
				 else if( operation.equals("-"))
					 return new SubOperator(arg1, arg2);
				 else System.out.println("Unknown additive operator: "+operation);
			 } else {
				 System.out.println("Unknown number of child nodes for additive expression");
			 }
			 return null;
		 }
		 case GScriptLexer.NUMBERLITERAL:
		 {
			 String text = t.getChild(0).getText();
			 int val = Integer.parseInt(text);
			 return new ConstantExpression(val,TYPE.NUMBER);
		 }
		 case GScriptLexer.STRINGLITERAL:
		 {
			 String text = t.getChild(0).getText();
			 if( text.startsWith("\"") || text.startsWith("'"))
				 text=text.substring(1, text.length()-1);
			 return new ConstantExpression(text);
		 }
		 case GScriptLexer.FUNCTIONCALLEXPRESSION:
		 {
			 //TODO: Alleen a.call().refine() toestaan
			 if( t.getChildCount()==1)
			 {
				 String function = t.getChild(0).getText();
				 return new FunctionCallExpression(new VariableExpression(function));
			 } else if ( t.getChildCount() == 2 )
			 {
				 String function = t.getChild(0).getText();
				 if( function.equals("print") )
				 {
					 List<Expression> arguments = new ArrayList<Expression>();
					 Tree argumentTree = t.getChild(1);
					 for( int i=0;i<argumentTree.getChildCount();i++)
					 {
						 arguments.add( parseExpression( argumentTree.getChild(i)));
					 }
					 return new NativeFunctionCallExpression( new NativePrintMethod(), arguments);
					 
				 } else if( function.equals("native") ) {
						 List<Expression> arguments = new ArrayList<Expression>();
						 Tree argumentTree = t.getChild(1);
						 for( int i=0;i<argumentTree.getChildCount();i++)
						 {
							 arguments.add( parseExpression( argumentTree.getChild(i)) );
						 }
						 return new NativeFunctionCallExpression( new NativeMethodAutoWrapper(arguments.size()), arguments);
						 
			     } else {
					 List<Expression> arguments = new ArrayList<Expression>();
					 Tree argumentTree = t.getChild(1);
					 for( int i=0;i<argumentTree.getChildCount();i++)
					 {
						 arguments.add( parseExpression( argumentTree.getChild(i)));
					 }
					 return new FunctionCallExpression( new VariableExpression(t.getChild(0).getText()),arguments);
					 //return new FunctionCallExpression( .. ,arguments);
				 }
			 } else if( t.getChildCount() == 3 )
			 {
				 List<Expression> arguments = new ArrayList<Expression>();
				 Tree argumentTree = t.getChild(1);
				 Expression otherPart = parseExpression(t.getChild(2));
				 for( int i=0;i<argumentTree.getChildCount();i++)
				 {
					 arguments.add( parseExpression( argumentTree.getChild(i)));
				 }
				 FunctionCallExpression thisPart = new FunctionCallExpression( new VariableExpression(t.getChild(0).getText())); 
				 if( otherPart instanceof FieldReferenceExpression )
				 {
					 ((FieldReferenceExpression) otherPart).setField(thisPart);
					 return otherPart;
				 }
				 return thisPart;
			 }
			 //Generate error here
			 break;
		 }		 
		 case GScriptLexer.VARIABLEEXPRESSION:
			 if( t.getChildCount() == 1 )
			 {
				 return new VariableExpression(t.getChild(0).getText());
			 } else if ( t.getChildCount()==2 )
			 {
				 //Nested variable
				 String fieldName = t.getChild(0).getText();
				 VariableExpression thisOne = new VariableExpression(fieldName);
				 Expression otherPart = parseExpression( t.getChild(1));
				 if( otherPart instanceof FieldReferenceExpression )
				 {
				 	((FieldReferenceExpression)otherPart).setField(thisOne);
				 	return otherPart;
				 }
				 return thisOne;
			 }
		 case GScriptLexer.BOOLEANLITERAL:
		 {
			 String text2=t.getChild(0).getText();
			 if( text2.equals("true"))
				 return new ConstantExpression(1, TYPE.BOOLEAN);
			 return new ConstantExpression(0, TYPE.BOOLEAN);
		 }
		 case GScriptLexer.UNDEFINEDLITERAL:
		 {
			 return new ConstantExpression(0,TYPE.UNDEFINED);
		 }
		
		 case GScriptLexer.THISLITERAL:
		 {
			 return new ThisExpression();
		 }	 
	}
		 return null;
	}

}
