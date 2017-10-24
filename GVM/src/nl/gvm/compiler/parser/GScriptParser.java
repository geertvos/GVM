package nl.gvm.compiler.parser;

// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g 2011-03-05 14:01:55

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class GScriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM", "FUNCTIONEXPRESSION", "PARAMETERS", "FUNCTIONBODY", "STATEMENTBLOCK", "TRYCATCHBLOCK", "EXPRESSIONSTATEMENT", "IFSTATEMENT", "WHILESTATEMENT", "FORSTATEMENT", "CONTINUESTATEMENT", "BREAKSTATEMENT", "RETURNSTATEMENT", "VARDEFSTATEMENT", "EXPRESSION", "CONDITIONEXPRESSION", "OREXPRESSION", "ANDEXPRESSION", "BITOREXPRESSION", "BITANDEXPRESSION", "BITXOREXPRESSION", "EQUALITYEXPRESSION", "RELATIONALEXPRESSION", "ADDITIVEEXPRESSION", "MULTIPLICATIVEEXPRESSION", "UNARYEXPRESSION", "PRIMARY", "IDENTIFIER", "VARIABLEEXPRESSION", "ARGUMENTS", "ASSIGNMENTEXPRESSION", "NEWEXPRESSION", "FUNCTIONCALLEXPRESSION", "POSTFIXEXPRESSION", "UNDEFINEDLITERAL", "BOOLEANLITERAL", "NUMBERLITERAL", "STRINGLITERAL", "THISLITERAL", "LT", "Identifier", "StringLiteral", "NumericLiteral", "DoubleStringCharacter", "SingleStringCharacter", "EscapeSequence", "CharacterEscapeSequence", "HexEscapeSequence", "UnicodeEscapeSequence", "SingleEscapeCharacter", "NonEscapeCharacter", "EscapeCharacter", "DecimalDigit", "HexDigit", "DecimalLiteral", "HexIntegerLiteral", "ExponentPart", "IdentifierStart", "IdentifierPart", "UnicodeLetter", "UnicodeDigit", "UnicodeConnectorPunctuation", "UnicodeCombiningMark", "Comment", "LineComment", "WhiteSpace", "'function'", "'('", "','", "')'", "'{'", "'}'", "'try'", "'catch'", "';'", "'if'", "'else'", "'while'", "'for'", "'continue'", "'break'", "'return'", "'var'", "'='", "'?'", "':'", "'new'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'!'", "'++'", "'--'", "'this'", "'\\.'", "'undefined'", "'true'", "'false'"
    };
    public static final int EOF=-1;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__110=110;
    public static final int T__111=111;
    public static final int T__112=112;
    public static final int T__113=113;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int PROGRAM=4;
    public static final int FUNCTIONEXPRESSION=5;
    public static final int PARAMETERS=6;
    public static final int FUNCTIONBODY=7;
    public static final int STATEMENTBLOCK=8;
    public static final int TRYCATCHBLOCK=9;
    public static final int EXPRESSIONSTATEMENT=10;
    public static final int IFSTATEMENT=11;
    public static final int WHILESTATEMENT=12;
    public static final int FORSTATEMENT=13;
    public static final int CONTINUESTATEMENT=14;
    public static final int BREAKSTATEMENT=15;
    public static final int RETURNSTATEMENT=16;
    public static final int VARDEFSTATEMENT=17;
    public static final int EXPRESSION=18;
    public static final int CONDITIONEXPRESSION=19;
    public static final int OREXPRESSION=20;
    public static final int ANDEXPRESSION=21;
    public static final int BITOREXPRESSION=22;
    public static final int BITANDEXPRESSION=23;
    public static final int BITXOREXPRESSION=24;
    public static final int EQUALITYEXPRESSION=25;
    public static final int RELATIONALEXPRESSION=26;
    public static final int ADDITIVEEXPRESSION=27;
    public static final int MULTIPLICATIVEEXPRESSION=28;
    public static final int UNARYEXPRESSION=29;
    public static final int PRIMARY=30;
    public static final int IDENTIFIER=31;
    public static final int VARIABLEEXPRESSION=32;
    public static final int ARGUMENTS=33;
    public static final int ASSIGNMENTEXPRESSION=34;
    public static final int NEWEXPRESSION=35;
    public static final int FUNCTIONCALLEXPRESSION=36;
    public static final int POSTFIXEXPRESSION=37;
    public static final int UNDEFINEDLITERAL=38;
    public static final int BOOLEANLITERAL=39;
    public static final int NUMBERLITERAL=40;
    public static final int STRINGLITERAL=41;
    public static final int THISLITERAL=42;
    public static final int LT=43;
    public static final int Identifier=44;
    public static final int StringLiteral=45;
    public static final int NumericLiteral=46;
    public static final int DoubleStringCharacter=47;
    public static final int SingleStringCharacter=48;
    public static final int EscapeSequence=49;
    public static final int CharacterEscapeSequence=50;
    public static final int HexEscapeSequence=51;
    public static final int UnicodeEscapeSequence=52;
    public static final int SingleEscapeCharacter=53;
    public static final int NonEscapeCharacter=54;
    public static final int EscapeCharacter=55;
    public static final int DecimalDigit=56;
    public static final int HexDigit=57;
    public static final int DecimalLiteral=58;
    public static final int HexIntegerLiteral=59;
    public static final int ExponentPart=60;
    public static final int IdentifierStart=61;
    public static final int IdentifierPart=62;
    public static final int UnicodeLetter=63;
    public static final int UnicodeDigit=64;
    public static final int UnicodeConnectorPunctuation=65;
    public static final int UnicodeCombiningMark=66;
    public static final int Comment=67;
    public static final int LineComment=68;
    public static final int WhiteSpace=69;

    // delegates
    // delegators


        public GScriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GScriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[183+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return GScriptParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:54:1: program : ( LT )* sourceElements ( LT )* EOF -> ^( PROGRAM sourceElements ) ;
    public final GScriptParser.program_return program() throws RecognitionException {
        GScriptParser.program_return retval = new GScriptParser.program_return();
        retval.start = input.LT(1);
        int program_StartIndex = input.index();
        Object root_0 = null;

        Token LT1=null;
        Token LT3=null;
        Token EOF4=null;
        GScriptParser.sourceElements_return sourceElements2 = null;


        Object LT1_tree=null;
        Object LT3_tree=null;
        Object EOF4_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_sourceElements=new RewriteRuleSubtreeStream(adaptor,"rule sourceElements");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:55:2: ( ( LT )* sourceElements ( LT )* EOF -> ^( PROGRAM sourceElements ) )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:55:4: ( LT )* sourceElements ( LT )* EOF
            {
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:55:4: ( LT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==LT) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT1=(Token)match(input,LT,FOLLOW_LT_in_program204); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT1);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            pushFollow(FOLLOW_sourceElements_in_program207);
            sourceElements2=sourceElements();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sourceElements.add(sourceElements2.getTree());
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:55:23: ( LT )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==LT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT3=(Token)match(input,LT,FOLLOW_LT_in_program209); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT3);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_program212); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF4);



            // AST REWRITE
            // elements: sourceElements
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 56:2: -> ^( PROGRAM sourceElements )
            {
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:56:5: ^( PROGRAM sourceElements )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);

                adaptor.addChild(root_1, stream_sourceElements.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, program_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class sourceElements_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sourceElements"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:59:1: sourceElements : statement ( ( LT )* statement )* ;
    public final GScriptParser.sourceElements_return sourceElements() throws RecognitionException {
        GScriptParser.sourceElements_return retval = new GScriptParser.sourceElements_return();
        retval.start = input.LT(1);
        int sourceElements_StartIndex = input.index();
        Object root_0 = null;

        Token LT6=null;
        GScriptParser.statement_return statement5 = null;

        GScriptParser.statement_return statement7 = null;


        Object LT6_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:60:2: ( statement ( ( LT )* statement )* )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:60:4: statement ( ( LT )* statement )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_statement_in_sourceElements233);
            statement5=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement5.getTree());
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:60:14: ( ( LT )* statement )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:60:15: ( LT )* statement
            	    {
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:60:17: ( LT )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==LT) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    	    {
            	    	    LT6=(Token)match(input,LT,FOLLOW_LT_in_sourceElements236); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_statement_in_sourceElements240);
            	    statement7=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement7.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, sourceElements_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "sourceElements"

    public static class functionExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionExpression"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:63:1: functionExpression : 'function' ( LT )* ( Identifier )? ( LT )* formalParameterList ( LT )* functionBody -> ^( FUNCTIONEXPRESSION ( Identifier )? formalParameterList functionBody ) ;
    public final GScriptParser.functionExpression_return functionExpression() throws RecognitionException {
        GScriptParser.functionExpression_return retval = new GScriptParser.functionExpression_return();
        retval.start = input.LT(1);
        int functionExpression_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal8=null;
        Token LT9=null;
        Token Identifier10=null;
        Token LT11=null;
        Token LT13=null;
        GScriptParser.formalParameterList_return formalParameterList12 = null;

        GScriptParser.functionBody_return functionBody14 = null;


        Object string_literal8_tree=null;
        Object LT9_tree=null;
        Object Identifier10_tree=null;
        Object LT11_tree=null;
        Object LT13_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:64:2: ( 'function' ( LT )* ( Identifier )? ( LT )* formalParameterList ( LT )* functionBody -> ^( FUNCTIONEXPRESSION ( Identifier )? formalParameterList functionBody ) )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:64:4: 'function' ( LT )* ( Identifier )? ( LT )* formalParameterList ( LT )* functionBody
            {
            string_literal8=(Token)match(input,70,FOLLOW_70_in_functionExpression253); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_70.add(string_literal8);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:64:15: ( LT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==LT) ) {
                    int LA5_2 = input.LA(2);

                    if ( (synpred5_GScript()) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT9=(Token)match(input,LT,FOLLOW_LT_in_functionExpression255); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT9);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:64:19: ( Identifier )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Identifier) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: Identifier
                    {
                    Identifier10=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionExpression258); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier10);


                    }
                    break;

            }

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:64:31: ( LT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==LT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT11=(Token)match(input,LT,FOLLOW_LT_in_functionExpression261); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT11);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            pushFollow(FOLLOW_formalParameterList_in_functionExpression264);
            formalParameterList12=formalParameterList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_formalParameterList.add(formalParameterList12.getTree());
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:64:55: ( LT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==LT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT13=(Token)match(input,LT,FOLLOW_LT_in_functionExpression266); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT13);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            pushFollow(FOLLOW_functionBody_in_functionExpression269);
            functionBody14=functionBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionBody.add(functionBody14.getTree());


            // AST REWRITE
            // elements: functionBody, Identifier, formalParameterList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 65:2: -> ^( FUNCTIONEXPRESSION ( Identifier )? formalParameterList functionBody )
            {
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:65:5: ^( FUNCTIONEXPRESSION ( Identifier )? formalParameterList functionBody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTIONEXPRESSION, "FUNCTIONEXPRESSION"), root_1);

                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:65:26: ( Identifier )?
                if ( stream_Identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_Identifier.nextNode());

                }
                stream_Identifier.reset();
                adaptor.addChild(root_1, stream_formalParameterList.nextTree());
                adaptor.addChild(root_1, stream_functionBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, functionExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionExpression"

    public static class formalParameterList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameterList"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:68:1: formalParameterList : '(' ( ( LT )* Identifier ( ( LT )* ',' ( LT )* Identifier )* )? ( LT )* ')' -> ^( PARAMETERS ( Identifier )* ) ;
    public final GScriptParser.formalParameterList_return formalParameterList() throws RecognitionException {
        GScriptParser.formalParameterList_return retval = new GScriptParser.formalParameterList_return();
        retval.start = input.LT(1);
        int formalParameterList_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal15=null;
        Token LT16=null;
        Token Identifier17=null;
        Token LT18=null;
        Token char_literal19=null;
        Token LT20=null;
        Token Identifier21=null;
        Token LT22=null;
        Token char_literal23=null;

        Object char_literal15_tree=null;
        Object LT16_tree=null;
        Object Identifier17_tree=null;
        Object LT18_tree=null;
        Object char_literal19_tree=null;
        Object LT20_tree=null;
        Object Identifier21_tree=null;
        Object LT22_tree=null;
        Object char_literal23_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:69:2: ( '(' ( ( LT )* Identifier ( ( LT )* ',' ( LT )* Identifier )* )? ( LT )* ')' -> ^( PARAMETERS ( Identifier )* ) )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:69:4: '(' ( ( LT )* Identifier ( ( LT )* ',' ( LT )* Identifier )* )? ( LT )* ')'
            {
            char_literal15=(Token)match(input,71,FOLLOW_71_in_formalParameterList295); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_71.add(char_literal15);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:69:8: ( ( LT )* Identifier ( ( LT )* ',' ( LT )* Identifier )* )?
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:69:9: ( LT )* Identifier ( ( LT )* ',' ( LT )* Identifier )*
                    {
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:69:9: ( LT )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==LT) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    {
                    	    LT16=(Token)match(input,LT,FOLLOW_LT_in_formalParameterList298); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LT.add(LT16);


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    Identifier17=(Token)match(input,Identifier,FOLLOW_Identifier_in_formalParameterList301); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier17);

                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:69:24: ( ( LT )* ',' ( LT )* Identifier )*
                    loop12:
                    do {
                        int alt12=2;
                        alt12 = dfa12.predict(input);
                        switch (alt12) {
                    	case 1 :
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:69:25: ( LT )* ',' ( LT )* Identifier
                    	    {
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:69:25: ( LT )*
                    	    loop10:
                    	    do {
                    	        int alt10=2;
                    	        int LA10_0 = input.LA(1);

                    	        if ( (LA10_0==LT) ) {
                    	            alt10=1;
                    	        }


                    	        switch (alt10) {
                    	    	case 1 :
                    	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    	    {
                    	    	    LT18=(Token)match(input,LT,FOLLOW_LT_in_formalParameterList304); if (state.failed) return retval; 
                    	    	    if ( state.backtracking==0 ) stream_LT.add(LT18);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop10;
                    	        }
                    	    } while (true);

                    	    char_literal19=(Token)match(input,72,FOLLOW_72_in_formalParameterList307); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_72.add(char_literal19);

                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:69:33: ( LT )*
                    	    loop11:
                    	    do {
                    	        int alt11=2;
                    	        int LA11_0 = input.LA(1);

                    	        if ( (LA11_0==LT) ) {
                    	            alt11=1;
                    	        }


                    	        switch (alt11) {
                    	    	case 1 :
                    	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    	    {
                    	    	    LT20=(Token)match(input,LT,FOLLOW_LT_in_formalParameterList309); if (state.failed) return retval; 
                    	    	    if ( state.backtracking==0 ) stream_LT.add(LT20);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop11;
                    	        }
                    	    } while (true);

                    	    Identifier21=(Token)match(input,Identifier,FOLLOW_Identifier_in_formalParameterList312); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_Identifier.add(Identifier21);


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:69:52: ( LT )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==LT) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT22=(Token)match(input,LT,FOLLOW_LT_in_formalParameterList318); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT22);


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            char_literal23=(Token)match(input,73,FOLLOW_73_in_formalParameterList321); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_73.add(char_literal23);



            // AST REWRITE
            // elements: Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 70:2: -> ^( PARAMETERS ( Identifier )* )
            {
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:70:5: ^( PARAMETERS ( Identifier )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMETERS, "PARAMETERS"), root_1);

                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:70:18: ( Identifier )*
                while ( stream_Identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_Identifier.nextNode());

                }
                stream_Identifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, formalParameterList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalParameterList"

    public static class functionBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionBody"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:73:1: functionBody : '{' ( LT )* ( sourceElements )? ( LT )* '}' -> ^( FUNCTIONBODY ( sourceElements )? ) ;
    public final GScriptParser.functionBody_return functionBody() throws RecognitionException {
        GScriptParser.functionBody_return retval = new GScriptParser.functionBody_return();
        retval.start = input.LT(1);
        int functionBody_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal24=null;
        Token LT25=null;
        Token LT27=null;
        Token char_literal28=null;
        GScriptParser.sourceElements_return sourceElements26 = null;


        Object char_literal24_tree=null;
        Object LT25_tree=null;
        Object LT27_tree=null;
        Object char_literal28_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_sourceElements=new RewriteRuleSubtreeStream(adaptor,"rule sourceElements");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:74:2: ( '{' ( LT )* ( sourceElements )? ( LT )* '}' -> ^( FUNCTIONBODY ( sourceElements )? ) )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:74:4: '{' ( LT )* ( sourceElements )? ( LT )* '}'
            {
            char_literal24=(Token)match(input,74,FOLLOW_74_in_functionBody342); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_74.add(char_literal24);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:74:8: ( LT )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==LT) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred15_GScript()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT25=(Token)match(input,LT,FOLLOW_LT_in_functionBody344); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT25);


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:74:12: ( sourceElements )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=Identifier && LA16_0<=NumericLiteral)||(LA16_0>=70 && LA16_0<=71)||LA16_0==74||LA16_0==76||(LA16_0>=78 && LA16_0<=79)||(LA16_0>=81 && LA16_0<=86)||LA16_0==90||LA16_0==103||(LA16_0>=107 && LA16_0<=108)||LA16_0==111||(LA16_0>=113 && LA16_0<=115)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: sourceElements
                    {
                    pushFollow(FOLLOW_sourceElements_in_functionBody347);
                    sourceElements26=sourceElements();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sourceElements.add(sourceElements26.getTree());

                    }
                    break;

            }

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:74:28: ( LT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==LT) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT27=(Token)match(input,LT,FOLLOW_LT_in_functionBody350); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT27);


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            char_literal28=(Token)match(input,75,FOLLOW_75_in_functionBody353); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_75.add(char_literal28);



            // AST REWRITE
            // elements: sourceElements
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 75:2: -> ^( FUNCTIONBODY ( sourceElements )? )
            {
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:75:5: ^( FUNCTIONBODY ( sourceElements )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTIONBODY, "FUNCTIONBODY"), root_1);

                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:75:20: ( sourceElements )?
                if ( stream_sourceElements.hasNext() ) {
                    adaptor.addChild(root_1, stream_sourceElements.nextTree());

                }
                stream_sourceElements.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, functionBody_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionBody"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:79:1: statement : ( statementBlock | tryCatchBlock | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | variableDefinitionStatement );
    public final GScriptParser.statement_return statement() throws RecognitionException {
        GScriptParser.statement_return retval = new GScriptParser.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        Object root_0 = null;

        GScriptParser.statementBlock_return statementBlock29 = null;

        GScriptParser.tryCatchBlock_return tryCatchBlock30 = null;

        GScriptParser.emptyStatement_return emptyStatement31 = null;

        GScriptParser.expressionStatement_return expressionStatement32 = null;

        GScriptParser.ifStatement_return ifStatement33 = null;

        GScriptParser.iterationStatement_return iterationStatement34 = null;

        GScriptParser.continueStatement_return continueStatement35 = null;

        GScriptParser.breakStatement_return breakStatement36 = null;

        GScriptParser.returnStatement_return returnStatement37 = null;

        GScriptParser.variableDefinitionStatement_return variableDefinitionStatement38 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:80:2: ( statementBlock | tryCatchBlock | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | variableDefinitionStatement )
            int alt18=10;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt18=1;
                }
                break;
            case 76:
                {
                alt18=2;
                }
                break;
            case 78:
                {
                alt18=3;
                }
                break;
            case Identifier:
            case StringLiteral:
            case NumericLiteral:
            case 70:
            case 71:
            case 90:
            case 103:
            case 107:
            case 108:
            case 111:
            case 113:
            case 114:
            case 115:
                {
                alt18=4;
                }
                break;
            case 79:
                {
                alt18=5;
                }
                break;
            case 81:
            case 82:
                {
                alt18=6;
                }
                break;
            case 83:
                {
                alt18=7;
                }
                break;
            case 84:
                {
                alt18=8;
                }
                break;
            case 85:
                {
                alt18=9;
                }
                break;
            case 86:
                {
                alt18=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:80:4: statementBlock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_statementBlock_in_statement375);
                    statementBlock29=statementBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statementBlock29.getTree());

                    }
                    break;
                case 2 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:81:4: tryCatchBlock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tryCatchBlock_in_statement380);
                    tryCatchBlock30=tryCatchBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tryCatchBlock30.getTree());

                    }
                    break;
                case 3 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:82:4: emptyStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_emptyStatement_in_statement385);
                    emptyStatement31=emptyStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, emptyStatement31.getTree());

                    }
                    break;
                case 4 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:83:4: expressionStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expressionStatement_in_statement390);
                    expressionStatement32=expressionStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionStatement32.getTree());

                    }
                    break;
                case 5 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:84:4: ifStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statement395);
                    ifStatement33=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement33.getTree());

                    }
                    break;
                case 6 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:85:4: iterationStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iterationStatement_in_statement400);
                    iterationStatement34=iterationStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, iterationStatement34.getTree());

                    }
                    break;
                case 7 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:86:4: continueStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_continueStatement_in_statement405);
                    continueStatement35=continueStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, continueStatement35.getTree());

                    }
                    break;
                case 8 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:87:4: breakStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_breakStatement_in_statement410);
                    breakStatement36=breakStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, breakStatement36.getTree());

                    }
                    break;
                case 9 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:88:4: returnStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_returnStatement_in_statement415);
                    returnStatement37=returnStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, returnStatement37.getTree());

                    }
                    break;
                case 10 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:89:4: variableDefinitionStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableDefinitionStatement_in_statement420);
                    variableDefinitionStatement38=variableDefinitionStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDefinitionStatement38.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class statementBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementBlock"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:92:1: statementBlock : '{' ( LT )* ( statementList )? ( LT )* '}' -> ^( STATEMENTBLOCK ( statementList )? ) ;
    public final GScriptParser.statementBlock_return statementBlock() throws RecognitionException {
        GScriptParser.statementBlock_return retval = new GScriptParser.statementBlock_return();
        retval.start = input.LT(1);
        int statementBlock_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal39=null;
        Token LT40=null;
        Token LT42=null;
        Token char_literal43=null;
        GScriptParser.statementList_return statementList41 = null;


        Object char_literal39_tree=null;
        Object LT40_tree=null;
        Object LT42_tree=null;
        Object char_literal43_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_statementList=new RewriteRuleSubtreeStream(adaptor,"rule statementList");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:93:2: ( '{' ( LT )* ( statementList )? ( LT )* '}' -> ^( STATEMENTBLOCK ( statementList )? ) )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:93:4: '{' ( LT )* ( statementList )? ( LT )* '}'
            {
            char_literal39=(Token)match(input,74,FOLLOW_74_in_statementBlock432); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_74.add(char_literal39);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:93:8: ( LT )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==LT) ) {
                    int LA19_2 = input.LA(2);

                    if ( (synpred27_GScript()) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT40=(Token)match(input,LT,FOLLOW_LT_in_statementBlock434); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT40);


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:93:12: ( statementList )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=Identifier && LA20_0<=NumericLiteral)||(LA20_0>=70 && LA20_0<=71)||LA20_0==74||LA20_0==76||(LA20_0>=78 && LA20_0<=79)||(LA20_0>=81 && LA20_0<=86)||LA20_0==90||LA20_0==103||(LA20_0>=107 && LA20_0<=108)||LA20_0==111||(LA20_0>=113 && LA20_0<=115)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: statementList
                    {
                    pushFollow(FOLLOW_statementList_in_statementBlock437);
                    statementList41=statementList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementList.add(statementList41.getTree());

                    }
                    break;

            }

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:93:27: ( LT )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==LT) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT42=(Token)match(input,LT,FOLLOW_LT_in_statementBlock440); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT42);


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            char_literal43=(Token)match(input,75,FOLLOW_75_in_statementBlock443); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_75.add(char_literal43);



            // AST REWRITE
            // elements: statementList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 94:2: -> ^( STATEMENTBLOCK ( statementList )? )
            {
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:94:5: ^( STATEMENTBLOCK ( statementList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTBLOCK, "STATEMENTBLOCK"), root_1);

                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:94:22: ( statementList )?
                if ( stream_statementList.hasNext() ) {
                    adaptor.addChild(root_1, stream_statementList.nextTree());

                }
                stream_statementList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, statementBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statementBlock"

    public static class tryCatchBlock_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tryCatchBlock"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:97:1: tryCatchBlock : 'try' ( LT )* statement ( LT )* 'catch' ( LT )* '(' ( LT )* Identifier ( LT )* ')' ( LT )* statement -> ^( TRYCATCHBLOCK statement Identifier statement ) ;
    public final GScriptParser.tryCatchBlock_return tryCatchBlock() throws RecognitionException {
        GScriptParser.tryCatchBlock_return retval = new GScriptParser.tryCatchBlock_return();
        retval.start = input.LT(1);
        int tryCatchBlock_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal44=null;
        Token LT45=null;
        Token LT47=null;
        Token string_literal48=null;
        Token LT49=null;
        Token char_literal50=null;
        Token LT51=null;
        Token Identifier52=null;
        Token LT53=null;
        Token char_literal54=null;
        Token LT55=null;
        GScriptParser.statement_return statement46 = null;

        GScriptParser.statement_return statement56 = null;


        Object string_literal44_tree=null;
        Object LT45_tree=null;
        Object LT47_tree=null;
        Object string_literal48_tree=null;
        Object LT49_tree=null;
        Object char_literal50_tree=null;
        Object LT51_tree=null;
        Object Identifier52_tree=null;
        Object LT53_tree=null;
        Object char_literal54_tree=null;
        Object LT55_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:98:2: ( 'try' ( LT )* statement ( LT )* 'catch' ( LT )* '(' ( LT )* Identifier ( LT )* ')' ( LT )* statement -> ^( TRYCATCHBLOCK statement Identifier statement ) )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:98:4: 'try' ( LT )* statement ( LT )* 'catch' ( LT )* '(' ( LT )* Identifier ( LT )* ')' ( LT )* statement
            {
            string_literal44=(Token)match(input,76,FOLLOW_76_in_tryCatchBlock464); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_76.add(string_literal44);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:98:10: ( LT )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==LT) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT45=(Token)match(input,LT,FOLLOW_LT_in_tryCatchBlock466); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT45);


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            pushFollow(FOLLOW_statement_in_tryCatchBlock470);
            statement46=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement46.getTree());
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:98:25: ( LT )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==LT) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT47=(Token)match(input,LT,FOLLOW_LT_in_tryCatchBlock472); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT47);


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            string_literal48=(Token)match(input,77,FOLLOW_77_in_tryCatchBlock475); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_77.add(string_literal48);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:98:37: ( LT )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==LT) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT49=(Token)match(input,LT,FOLLOW_LT_in_tryCatchBlock477); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT49);


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            char_literal50=(Token)match(input,71,FOLLOW_71_in_tryCatchBlock480); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_71.add(char_literal50);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:98:45: ( LT )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==LT) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT51=(Token)match(input,LT,FOLLOW_LT_in_tryCatchBlock482); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT51);


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            Identifier52=(Token)match(input,Identifier,FOLLOW_Identifier_in_tryCatchBlock485); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier52);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:98:60: ( LT )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==LT) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT53=(Token)match(input,LT,FOLLOW_LT_in_tryCatchBlock487); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT53);


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            char_literal54=(Token)match(input,73,FOLLOW_73_in_tryCatchBlock490); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_73.add(char_literal54);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:98:68: ( LT )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==LT) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT55=(Token)match(input,LT,FOLLOW_LT_in_tryCatchBlock492); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT55);


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            pushFollow(FOLLOW_statement_in_tryCatchBlock495);
            statement56=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement56.getTree());


            // AST REWRITE
            // elements: statement, statement, Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 99:2: -> ^( TRYCATCHBLOCK statement Identifier statement )
            {
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:99:5: ^( TRYCATCHBLOCK statement Identifier statement )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TRYCATCHBLOCK, "TRYCATCHBLOCK"), root_1);

                adaptor.addChild(root_1, stream_statement.nextTree());
                adaptor.addChild(root_1, stream_Identifier.nextNode());
                adaptor.addChild(root_1, stream_statement.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, tryCatchBlock_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "tryCatchBlock"

    public static class statementList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementList"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:103:1: statementList : statement ( ( LT )* statement )* ;
    public final GScriptParser.statementList_return statementList() throws RecognitionException {
        GScriptParser.statementList_return retval = new GScriptParser.statementList_return();
        retval.start = input.LT(1);
        int statementList_StartIndex = input.index();
        Object root_0 = null;

        Token LT58=null;
        GScriptParser.statement_return statement57 = null;

        GScriptParser.statement_return statement59 = null;


        Object LT58_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:104:2: ( statement ( ( LT )* statement )* )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:104:4: statement ( ( LT )* statement )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_statement_in_statementList521);
            statement57=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, statement57.getTree());
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:104:14: ( ( LT )* statement )*
            loop29:
            do {
                int alt29=2;
                alt29 = dfa29.predict(input);
                switch (alt29) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:104:15: ( LT )* statement
            	    {
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:104:17: ( LT )*
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0==LT) ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    	    {
            	    	    LT58=(Token)match(input,LT,FOLLOW_LT_in_statementList524); if (state.failed) return retval;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop28;
            	        }
            	    } while (true);

            	    pushFollow(FOLLOW_statement_in_statementList528);
            	    statement59=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement59.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, statementList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statementList"

    public static class emptyStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "emptyStatement"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:107:1: emptyStatement : ';' ;
    public final GScriptParser.emptyStatement_return emptyStatement() throws RecognitionException {
        GScriptParser.emptyStatement_return retval = new GScriptParser.emptyStatement_return();
        retval.start = input.LT(1);
        int emptyStatement_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal60=null;

        Object char_literal60_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:108:2: ( ';' )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:108:4: ';'
            {
            root_0 = (Object)adaptor.nil();

            char_literal60=(Token)match(input,78,FOLLOW_78_in_emptyStatement542); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, emptyStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "emptyStatement"

    public static class expressionStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionStatement"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:111:1: expressionStatement : expression -> ^( EXPRESSIONSTATEMENT expression ) ;
    public final GScriptParser.expressionStatement_return expressionStatement() throws RecognitionException {
        GScriptParser.expressionStatement_return retval = new GScriptParser.expressionStatement_return();
        retval.start = input.LT(1);
        int expressionStatement_StartIndex = input.index();
        Object root_0 = null;

        GScriptParser.expression_return expression61 = null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:112:2: ( expression -> ^( EXPRESSIONSTATEMENT expression ) )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:112:4: expression
            {
            pushFollow(FOLLOW_expression_in_expressionStatement555);
            expression61=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression61.getTree());


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 113:2: -> ^( EXPRESSIONSTATEMENT expression )
            {
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:113:5: ^( EXPRESSIONSTATEMENT expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRESSIONSTATEMENT, "EXPRESSIONSTATEMENT"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, expressionStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expressionStatement"

    public static class ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:116:1: ifStatement : 'if' ( LT )* '(' ( LT )* expression ( LT )* ')' ( LT )* t= statement ( ( LT )* 'else' ( LT )* e= statement )? -> ^( IFSTATEMENT expression $t ( $e)? ) ;
    public final GScriptParser.ifStatement_return ifStatement() throws RecognitionException {
        GScriptParser.ifStatement_return retval = new GScriptParser.ifStatement_return();
        retval.start = input.LT(1);
        int ifStatement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal62=null;
        Token LT63=null;
        Token char_literal64=null;
        Token LT65=null;
        Token LT67=null;
        Token char_literal68=null;
        Token LT69=null;
        Token LT70=null;
        Token string_literal71=null;
        Token LT72=null;
        GScriptParser.statement_return t = null;

        GScriptParser.statement_return e = null;

        GScriptParser.expression_return expression66 = null;


        Object string_literal62_tree=null;
        Object LT63_tree=null;
        Object char_literal64_tree=null;
        Object LT65_tree=null;
        Object LT67_tree=null;
        Object char_literal68_tree=null;
        Object LT69_tree=null;
        Object LT70_tree=null;
        Object string_literal71_tree=null;
        Object LT72_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:117:2: ( 'if' ( LT )* '(' ( LT )* expression ( LT )* ')' ( LT )* t= statement ( ( LT )* 'else' ( LT )* e= statement )? -> ^( IFSTATEMENT expression $t ( $e)? ) )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:117:4: 'if' ( LT )* '(' ( LT )* expression ( LT )* ')' ( LT )* t= statement ( ( LT )* 'else' ( LT )* e= statement )?
            {
            string_literal62=(Token)match(input,79,FOLLOW_79_in_ifStatement576); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_79.add(string_literal62);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:117:9: ( LT )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==LT) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT63=(Token)match(input,LT,FOLLOW_LT_in_ifStatement578); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT63);


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            char_literal64=(Token)match(input,71,FOLLOW_71_in_ifStatement581); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_71.add(char_literal64);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:117:17: ( LT )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==LT) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT65=(Token)match(input,LT,FOLLOW_LT_in_ifStatement583); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT65);


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            pushFollow(FOLLOW_expression_in_ifStatement586);
            expression66=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression66.getTree());
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:117:32: ( LT )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==LT) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT67=(Token)match(input,LT,FOLLOW_LT_in_ifStatement588); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT67);


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            char_literal68=(Token)match(input,73,FOLLOW_73_in_ifStatement591); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_73.add(char_literal68);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:117:40: ( LT )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==LT) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT69=(Token)match(input,LT,FOLLOW_LT_in_ifStatement593); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT69);


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            pushFollow(FOLLOW_statement_in_ifStatement598);
            t=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(t.getTree());
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:117:56: ( ( LT )* 'else' ( LT )* e= statement )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==LT) ) {
                int LA36_1 = input.LA(2);

                if ( (synpred44_GScript()) ) {
                    alt36=1;
                }
            }
            else if ( (LA36_0==80) ) {
                int LA36_2 = input.LA(2);

                if ( (synpred44_GScript()) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:117:57: ( LT )* 'else' ( LT )* e= statement
                    {
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:117:57: ( LT )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==LT) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    {
                    	    LT70=(Token)match(input,LT,FOLLOW_LT_in_ifStatement601); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LT.add(LT70);


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    string_literal71=(Token)match(input,80,FOLLOW_80_in_ifStatement604); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_80.add(string_literal71);

                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:117:68: ( LT )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==LT) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    {
                    	    LT72=(Token)match(input,LT,FOLLOW_LT_in_ifStatement606); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LT.add(LT72);


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    pushFollow(FOLLOW_statement_in_ifStatement611);
                    e=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(e.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: t, e, expression
            // token labels: 
            // rule labels: retval, e, t
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);
            RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.tree:null);

            root_0 = (Object)adaptor.nil();
            // 118:2: -> ^( IFSTATEMENT expression $t ( $e)? )
            {
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:118:5: ^( IFSTATEMENT expression $t ( $e)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IFSTATEMENT, "IFSTATEMENT"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                adaptor.addChild(root_1, stream_t.nextTree());
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:118:33: ( $e)?
                if ( stream_e.hasNext() ) {
                    adaptor.addChild(root_1, stream_e.nextTree());

                }
                stream_e.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, ifStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class iterationStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iterationStatement"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:121:1: iterationStatement : ( whileStatement | forStatement );
    public final GScriptParser.iterationStatement_return iterationStatement() throws RecognitionException {
        GScriptParser.iterationStatement_return retval = new GScriptParser.iterationStatement_return();
        retval.start = input.LT(1);
        int iterationStatement_StartIndex = input.index();
        Object root_0 = null;

        GScriptParser.whileStatement_return whileStatement73 = null;

        GScriptParser.forStatement_return forStatement74 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:122:2: ( whileStatement | forStatement )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==81) ) {
                alt37=1;
            }
            else if ( (LA37_0==82) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:122:4: whileStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_iterationStatement641);
                    whileStatement73=whileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement73.getTree());

                    }
                    break;
                case 2 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:123:4: forStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forStatement_in_iterationStatement646);
                    forStatement74=forStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forStatement74.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, iterationStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "iterationStatement"

    public static class whileStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:126:1: whileStatement : 'while' ( LT )* '(' ( LT )* expression ( LT )* ')' ( LT )* statement -> ^( WHILESTATEMENT expression statement ) ;
    public final GScriptParser.whileStatement_return whileStatement() throws RecognitionException {
        GScriptParser.whileStatement_return retval = new GScriptParser.whileStatement_return();
        retval.start = input.LT(1);
        int whileStatement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal75=null;
        Token LT76=null;
        Token char_literal77=null;
        Token LT78=null;
        Token LT80=null;
        Token char_literal81=null;
        Token LT82=null;
        GScriptParser.expression_return expression79 = null;

        GScriptParser.statement_return statement83 = null;


        Object string_literal75_tree=null;
        Object LT76_tree=null;
        Object char_literal77_tree=null;
        Object LT78_tree=null;
        Object LT80_tree=null;
        Object char_literal81_tree=null;
        Object LT82_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:127:2: ( 'while' ( LT )* '(' ( LT )* expression ( LT )* ')' ( LT )* statement -> ^( WHILESTATEMENT expression statement ) )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:127:4: 'while' ( LT )* '(' ( LT )* expression ( LT )* ')' ( LT )* statement
            {
            string_literal75=(Token)match(input,81,FOLLOW_81_in_whileStatement658); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_81.add(string_literal75);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:127:12: ( LT )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==LT) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT76=(Token)match(input,LT,FOLLOW_LT_in_whileStatement660); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT76);


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            char_literal77=(Token)match(input,71,FOLLOW_71_in_whileStatement663); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_71.add(char_literal77);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:127:20: ( LT )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==LT) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT78=(Token)match(input,LT,FOLLOW_LT_in_whileStatement665); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT78);


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            pushFollow(FOLLOW_expression_in_whileStatement668);
            expression79=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression79.getTree());
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:127:35: ( LT )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==LT) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT80=(Token)match(input,LT,FOLLOW_LT_in_whileStatement670); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT80);


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            char_literal81=(Token)match(input,73,FOLLOW_73_in_whileStatement673); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_73.add(char_literal81);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:127:43: ( LT )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==LT) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT82=(Token)match(input,LT,FOLLOW_LT_in_whileStatement675); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT82);


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            pushFollow(FOLLOW_statement_in_whileStatement678);
            statement83=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement83.getTree());


            // AST REWRITE
            // elements: expression, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 128:2: -> ^( WHILESTATEMENT expression statement )
            {
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:128:5: ^( WHILESTATEMENT expression statement )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILESTATEMENT, "WHILESTATEMENT"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                adaptor.addChild(root_1, stream_statement.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, whileStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "whileStatement"

    public static class forStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forStatement"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:131:1: forStatement : 'for' ( LT )* '(' ( ( LT )* statement )? ( LT )* ';' ( ( LT )* expression )? ( LT )* ';' ( ( LT )* statement )? ( LT )* ')' ( LT )* statement -> ^( FORSTATEMENT statement expression statement statement ) ;
    public final GScriptParser.forStatement_return forStatement() throws RecognitionException {
        GScriptParser.forStatement_return retval = new GScriptParser.forStatement_return();
        retval.start = input.LT(1);
        int forStatement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal84=null;
        Token LT85=null;
        Token char_literal86=null;
        Token LT87=null;
        Token LT89=null;
        Token char_literal90=null;
        Token LT91=null;
        Token LT93=null;
        Token char_literal94=null;
        Token LT95=null;
        Token LT97=null;
        Token char_literal98=null;
        Token LT99=null;
        GScriptParser.statement_return statement88 = null;

        GScriptParser.expression_return expression92 = null;

        GScriptParser.statement_return statement96 = null;

        GScriptParser.statement_return statement100 = null;


        Object string_literal84_tree=null;
        Object LT85_tree=null;
        Object char_literal86_tree=null;
        Object LT87_tree=null;
        Object LT89_tree=null;
        Object char_literal90_tree=null;
        Object LT91_tree=null;
        Object LT93_tree=null;
        Object char_literal94_tree=null;
        Object LT95_tree=null;
        Object LT97_tree=null;
        Object char_literal98_tree=null;
        Object LT99_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:132:2: ( 'for' ( LT )* '(' ( ( LT )* statement )? ( LT )* ';' ( ( LT )* expression )? ( LT )* ';' ( ( LT )* statement )? ( LT )* ')' ( LT )* statement -> ^( FORSTATEMENT statement expression statement statement ) )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:132:4: 'for' ( LT )* '(' ( ( LT )* statement )? ( LT )* ';' ( ( LT )* expression )? ( LT )* ';' ( ( LT )* statement )? ( LT )* ')' ( LT )* statement
            {
            string_literal84=(Token)match(input,82,FOLLOW_82_in_forStatement702); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_82.add(string_literal84);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:132:10: ( LT )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==LT) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT85=(Token)match(input,LT,FOLLOW_LT_in_forStatement704); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT85);


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            char_literal86=(Token)match(input,71,FOLLOW_71_in_forStatement707); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_71.add(char_literal86);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:132:18: ( ( LT )* statement )?
            int alt44=2;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:132:19: ( LT )* statement
                    {
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:132:19: ( LT )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==LT) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    {
                    	    LT87=(Token)match(input,LT,FOLLOW_LT_in_forStatement710); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LT.add(LT87);


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    pushFollow(FOLLOW_statement_in_forStatement713);
                    statement88=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement88.getTree());

                    }
                    break;

            }

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:132:35: ( LT )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==LT) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT89=(Token)match(input,LT,FOLLOW_LT_in_forStatement717); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT89);


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            char_literal90=(Token)match(input,78,FOLLOW_78_in_forStatement720); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_78.add(char_literal90);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:132:43: ( ( LT )* expression )?
            int alt47=2;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:132:44: ( LT )* expression
                    {
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:132:44: ( LT )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==LT) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    {
                    	    LT91=(Token)match(input,LT,FOLLOW_LT_in_forStatement723); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LT.add(LT91);


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    pushFollow(FOLLOW_expression_in_forStatement726);
                    expression92=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression92.getTree());

                    }
                    break;

            }

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:132:61: ( LT )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==LT) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT93=(Token)match(input,LT,FOLLOW_LT_in_forStatement730); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT93);


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            char_literal94=(Token)match(input,78,FOLLOW_78_in_forStatement733); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_78.add(char_literal94);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:132:69: ( ( LT )* statement )?
            int alt50=2;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:132:70: ( LT )* statement
                    {
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:132:70: ( LT )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==LT) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    {
                    	    LT95=(Token)match(input,LT,FOLLOW_LT_in_forStatement736); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LT.add(LT95);


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    pushFollow(FOLLOW_statement_in_forStatement739);
                    statement96=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement96.getTree());

                    }
                    break;

            }

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:132:86: ( LT )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==LT) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT97=(Token)match(input,LT,FOLLOW_LT_in_forStatement743); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT97);


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            char_literal98=(Token)match(input,73,FOLLOW_73_in_forStatement746); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_73.add(char_literal98);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:132:94: ( LT )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==LT) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT99=(Token)match(input,LT,FOLLOW_LT_in_forStatement748); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT99);


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            pushFollow(FOLLOW_statement_in_forStatement751);
            statement100=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement100.getTree());


            // AST REWRITE
            // elements: expression, statement, statement, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 133:2: -> ^( FORSTATEMENT statement expression statement statement )
            {
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:133:5: ^( FORSTATEMENT statement expression statement statement )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORSTATEMENT, "FORSTATEMENT"), root_1);

                adaptor.addChild(root_1, stream_statement.nextTree());
                adaptor.addChild(root_1, stream_expression.nextTree());
                adaptor.addChild(root_1, stream_statement.nextTree());
                adaptor.addChild(root_1, stream_statement.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, forStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forStatement"

    public static class continueStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "continueStatement"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:136:1: continueStatement : 'continue' ( Identifier )? ( LT | ';' ) -> ^( CONTINUESTATEMENT ( Identifier )? ) ;
    public final GScriptParser.continueStatement_return continueStatement() throws RecognitionException {
        GScriptParser.continueStatement_return retval = new GScriptParser.continueStatement_return();
        retval.start = input.LT(1);
        int continueStatement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal101=null;
        Token Identifier102=null;
        Token LT103=null;
        Token char_literal104=null;

        Object string_literal101_tree=null;
        Object Identifier102_tree=null;
        Object LT103_tree=null;
        Object char_literal104_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:137:2: ( 'continue' ( Identifier )? ( LT | ';' ) -> ^( CONTINUESTATEMENT ( Identifier )? ) )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:137:4: 'continue' ( Identifier )? ( LT | ';' )
            {
            string_literal101=(Token)match(input,83,FOLLOW_83_in_continueStatement778); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_83.add(string_literal101);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:137:15: ( Identifier )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==Identifier) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: Identifier
                    {
                    Identifier102=(Token)match(input,Identifier,FOLLOW_Identifier_in_continueStatement780); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier102);


                    }
                    break;

            }

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:137:27: ( LT | ';' )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==LT) ) {
                alt54=1;
            }
            else if ( (LA54_0==78) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:137:28: LT
                    {
                    LT103=(Token)match(input,LT,FOLLOW_LT_in_continueStatement784); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LT.add(LT103);


                    }
                    break;
                case 2 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:137:33: ';'
                    {
                    char_literal104=(Token)match(input,78,FOLLOW_78_in_continueStatement788); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_78.add(char_literal104);


                    }
                    break;

            }



            // AST REWRITE
            // elements: Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 138:2: -> ^( CONTINUESTATEMENT ( Identifier )? )
            {
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:138:5: ^( CONTINUESTATEMENT ( Identifier )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONTINUESTATEMENT, "CONTINUESTATEMENT"), root_1);

                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:138:25: ( Identifier )?
                if ( stream_Identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_Identifier.nextNode());

                }
                stream_Identifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, continueStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "continueStatement"

    public static class breakStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "breakStatement"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:141:1: breakStatement : 'break' ( Identifier )? ( LT | ';' ) -> ^( BREAKSTATEMENT ( Identifier )? ) ;
    public final GScriptParser.breakStatement_return breakStatement() throws RecognitionException {
        GScriptParser.breakStatement_return retval = new GScriptParser.breakStatement_return();
        retval.start = input.LT(1);
        int breakStatement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal105=null;
        Token Identifier106=null;
        Token LT107=null;
        Token char_literal108=null;

        Object string_literal105_tree=null;
        Object Identifier106_tree=null;
        Object LT107_tree=null;
        Object char_literal108_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:142:2: ( 'break' ( Identifier )? ( LT | ';' ) -> ^( BREAKSTATEMENT ( Identifier )? ) )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:142:4: 'break' ( Identifier )? ( LT | ';' )
            {
            string_literal105=(Token)match(input,84,FOLLOW_84_in_breakStatement810); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_84.add(string_literal105);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:142:12: ( Identifier )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==Identifier) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: Identifier
                    {
                    Identifier106=(Token)match(input,Identifier,FOLLOW_Identifier_in_breakStatement812); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier106);


                    }
                    break;

            }

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:142:24: ( LT | ';' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==LT) ) {
                alt56=1;
            }
            else if ( (LA56_0==78) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:142:25: LT
                    {
                    LT107=(Token)match(input,LT,FOLLOW_LT_in_breakStatement816); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LT.add(LT107);


                    }
                    break;
                case 2 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:142:30: ';'
                    {
                    char_literal108=(Token)match(input,78,FOLLOW_78_in_breakStatement820); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_78.add(char_literal108);


                    }
                    break;

            }



            // AST REWRITE
            // elements: Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 143:2: -> ^( BREAKSTATEMENT ( Identifier )? )
            {
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:143:5: ^( BREAKSTATEMENT ( Identifier )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BREAKSTATEMENT, "BREAKSTATEMENT"), root_1);

                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:143:22: ( Identifier )?
                if ( stream_Identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_Identifier.nextNode());

                }
                stream_Identifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, breakStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "breakStatement"

    public static class returnStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "returnStatement"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:146:1: returnStatement : 'return' ( expression )? ( LT | ';' ) -> ^( RETURNSTATEMENT ( expression )? ) ;
    public final GScriptParser.returnStatement_return returnStatement() throws RecognitionException {
        GScriptParser.returnStatement_return retval = new GScriptParser.returnStatement_return();
        retval.start = input.LT(1);
        int returnStatement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal109=null;
        Token LT111=null;
        Token char_literal112=null;
        GScriptParser.expression_return expression110 = null;


        Object string_literal109_tree=null;
        Object LT111_tree=null;
        Object char_literal112_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:147:2: ( 'return' ( expression )? ( LT | ';' ) -> ^( RETURNSTATEMENT ( expression )? ) )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:147:4: 'return' ( expression )? ( LT | ';' )
            {
            string_literal109=(Token)match(input,85,FOLLOW_85_in_returnStatement842); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_85.add(string_literal109);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:147:13: ( expression )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=Identifier && LA57_0<=NumericLiteral)||(LA57_0>=70 && LA57_0<=71)||LA57_0==90||LA57_0==103||(LA57_0>=107 && LA57_0<=108)||LA57_0==111||(LA57_0>=113 && LA57_0<=115)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: expression
                    {
                    pushFollow(FOLLOW_expression_in_returnStatement844);
                    expression110=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression110.getTree());

                    }
                    break;

            }

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:147:25: ( LT | ';' )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==LT) ) {
                alt58=1;
            }
            else if ( (LA58_0==78) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:147:26: LT
                    {
                    LT111=(Token)match(input,LT,FOLLOW_LT_in_returnStatement848); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LT.add(LT111);


                    }
                    break;
                case 2 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:147:31: ';'
                    {
                    char_literal112=(Token)match(input,78,FOLLOW_78_in_returnStatement852); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_78.add(char_literal112);


                    }
                    break;

            }



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 148:2: -> ^( RETURNSTATEMENT ( expression )? )
            {
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:148:5: ^( RETURNSTATEMENT ( expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURNSTATEMENT, "RETURNSTATEMENT"), root_1);

                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:148:23: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, returnStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "returnStatement"

    public static class variableDefinitionStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDefinitionStatement"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:151:1: variableDefinitionStatement : 'var' Identifier ( '=' expression )? -> ^( VARDEFSTATEMENT Identifier ( expression )? ) ;
    public final GScriptParser.variableDefinitionStatement_return variableDefinitionStatement() throws RecognitionException {
        GScriptParser.variableDefinitionStatement_return retval = new GScriptParser.variableDefinitionStatement_return();
        retval.start = input.LT(1);
        int variableDefinitionStatement_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal113=null;
        Token Identifier114=null;
        Token char_literal115=null;
        GScriptParser.expression_return expression116 = null;


        Object string_literal113_tree=null;
        Object Identifier114_tree=null;
        Object char_literal115_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:152:2: ( 'var' Identifier ( '=' expression )? -> ^( VARDEFSTATEMENT Identifier ( expression )? ) )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:152:4: 'var' Identifier ( '=' expression )?
            {
            string_literal113=(Token)match(input,86,FOLLOW_86_in_variableDefinitionStatement877); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_86.add(string_literal113);

            Identifier114=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableDefinitionStatement879); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier114);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:152:21: ( '=' expression )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==87) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:152:23: '=' expression
                    {
                    char_literal115=(Token)match(input,87,FOLLOW_87_in_variableDefinitionStatement883); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_87.add(char_literal115);

                    pushFollow(FOLLOW_expression_in_variableDefinitionStatement885);
                    expression116=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression116.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: expression, Identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 153:2: -> ^( VARDEFSTATEMENT Identifier ( expression )? )
            {
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:153:5: ^( VARDEFSTATEMENT Identifier ( expression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDEFSTATEMENT, "VARDEFSTATEMENT"), root_1);

                adaptor.addChild(root_1, stream_Identifier.nextNode());
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:153:34: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, variableDefinitionStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableDefinitionStatement"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:156:1: expression : ( conditionalExpression | assignmentExpression | functionExpression | functionCallExpression | newExpression );
    public final GScriptParser.expression_return expression() throws RecognitionException {
        GScriptParser.expression_return retval = new GScriptParser.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        Object root_0 = null;

        GScriptParser.conditionalExpression_return conditionalExpression117 = null;

        GScriptParser.assignmentExpression_return assignmentExpression118 = null;

        GScriptParser.functionExpression_return functionExpression119 = null;

        GScriptParser.functionCallExpression_return functionCallExpression120 = null;

        GScriptParser.newExpression_return newExpression121 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:157:2: ( conditionalExpression | assignmentExpression | functionExpression | functionCallExpression | newExpression )
            int alt60=5;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:157:4: conditionalExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_conditionalExpression_in_expression912);
                    conditionalExpression117=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression117.getTree());

                    }
                    break;
                case 2 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:157:28: assignmentExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignmentExpression_in_expression916);
                    assignmentExpression118=assignmentExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentExpression118.getTree());

                    }
                    break;
                case 3 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:157:51: functionExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionExpression_in_expression920);
                    functionExpression119=functionExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionExpression119.getTree());

                    }
                    break;
                case 4 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:157:72: functionCallExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionCallExpression_in_expression924);
                    functionCallExpression120=functionCallExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCallExpression120.getTree());

                    }
                    break;
                case 5 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:157:97: newExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_newExpression_in_expression928);
                    newExpression121=newExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newExpression121.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class assignmentExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignmentExpression"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:160:1: assignmentExpression : fieldReferenceExpression '=' expression -> ^( ASSIGNMENTEXPRESSION fieldReferenceExpression expression ) ;
    public final GScriptParser.assignmentExpression_return assignmentExpression() throws RecognitionException {
        GScriptParser.assignmentExpression_return retval = new GScriptParser.assignmentExpression_return();
        retval.start = input.LT(1);
        int assignmentExpression_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal123=null;
        GScriptParser.fieldReferenceExpression_return fieldReferenceExpression122 = null;

        GScriptParser.expression_return expression124 = null;


        Object char_literal123_tree=null;
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_fieldReferenceExpression=new RewriteRuleSubtreeStream(adaptor,"rule fieldReferenceExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:161:2: ( fieldReferenceExpression '=' expression -> ^( ASSIGNMENTEXPRESSION fieldReferenceExpression expression ) )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:161:4: fieldReferenceExpression '=' expression
            {
            pushFollow(FOLLOW_fieldReferenceExpression_in_assignmentExpression941);
            fieldReferenceExpression122=fieldReferenceExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fieldReferenceExpression.add(fieldReferenceExpression122.getTree());
            char_literal123=(Token)match(input,87,FOLLOW_87_in_assignmentExpression943); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_87.add(char_literal123);

            pushFollow(FOLLOW_expression_in_assignmentExpression945);
            expression124=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression124.getTree());


            // AST REWRITE
            // elements: fieldReferenceExpression, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 162:2: -> ^( ASSIGNMENTEXPRESSION fieldReferenceExpression expression )
            {
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:162:5: ^( ASSIGNMENTEXPRESSION fieldReferenceExpression expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGNMENTEXPRESSION, "ASSIGNMENTEXPRESSION"), root_1);

                adaptor.addChild(root_1, stream_fieldReferenceExpression.nextTree());
                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, assignmentExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "assignmentExpression"

    public static class conditionalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalExpression"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:165:1: conditionalExpression : (singleArg= logicalORExpression -> $singleArg) ( ( ( LT )* '?' ( LT )* expression ( LT )* ':' ( LT )* expression )+ -> ^( CONDITIONEXPRESSION $singleArg ( expression )* ) )? ;
    public final GScriptParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        GScriptParser.conditionalExpression_return retval = new GScriptParser.conditionalExpression_return();
        retval.start = input.LT(1);
        int conditionalExpression_StartIndex = input.index();
        Object root_0 = null;

        Token LT125=null;
        Token char_literal126=null;
        Token LT127=null;
        Token LT129=null;
        Token char_literal130=null;
        Token LT131=null;
        GScriptParser.logicalORExpression_return singleArg = null;

        GScriptParser.expression_return expression128 = null;

        GScriptParser.expression_return expression132 = null;


        Object LT125_tree=null;
        Object char_literal126_tree=null;
        Object LT127_tree=null;
        Object LT129_tree=null;
        Object char_literal130_tree=null;
        Object LT131_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_logicalORExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalORExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:2: ( (singleArg= logicalORExpression -> $singleArg) ( ( ( LT )* '?' ( LT )* expression ( LT )* ':' ( LT )* expression )+ -> ^( CONDITIONEXPRESSION $singleArg ( expression )* ) )? )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:4: (singleArg= logicalORExpression -> $singleArg) ( ( ( LT )* '?' ( LT )* expression ( LT )* ':' ( LT )* expression )+ -> ^( CONDITIONEXPRESSION $singleArg ( expression )* ) )?
            {
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:4: (singleArg= logicalORExpression -> $singleArg)
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:5: singleArg= logicalORExpression
            {
            pushFollow(FOLLOW_logicalORExpression_in_conditionalExpression970);
            singleArg=logicalORExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logicalORExpression.add(singleArg.getTree());


            // AST REWRITE
            // elements: singleArg
            // token labels: 
            // rule labels: singleArg, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_singleArg=new RewriteRuleSubtreeStream(adaptor,"rule singleArg",singleArg!=null?singleArg.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 166:34: -> $singleArg
            {
                adaptor.addChild(root_0, stream_singleArg.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:49: ( ( ( LT )* '?' ( LT )* expression ( LT )* ':' ( LT )* expression )+ -> ^( CONDITIONEXPRESSION $singleArg ( expression )* ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==LT) ) {
                int LA66_1 = input.LA(2);

                if ( (synpred77_GScript()) ) {
                    alt66=1;
                }
            }
            else if ( (LA66_0==88) ) {
                int LA66_2 = input.LA(2);

                if ( (synpred77_GScript()) ) {
                    alt66=1;
                }
            }
            switch (alt66) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:50: ( ( LT )* '?' ( LT )* expression ( LT )* ':' ( LT )* expression )+
                    {
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:50: ( ( LT )* '?' ( LT )* expression ( LT )* ':' ( LT )* expression )+
                    int cnt65=0;
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==LT) ) {
                            int LA65_1 = input.LA(2);

                            if ( (synpred76_GScript()) ) {
                                alt65=1;
                            }


                        }
                        else if ( (LA65_0==88) ) {
                            int LA65_3 = input.LA(2);

                            if ( (synpred76_GScript()) ) {
                                alt65=1;
                            }


                        }


                        switch (alt65) {
                    	case 1 :
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:51: ( LT )* '?' ( LT )* expression ( LT )* ':' ( LT )* expression
                    	    {
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:51: ( LT )*
                    	    loop61:
                    	    do {
                    	        int alt61=2;
                    	        int LA61_0 = input.LA(1);

                    	        if ( (LA61_0==LT) ) {
                    	            alt61=1;
                    	        }


                    	        switch (alt61) {
                    	    	case 1 :
                    	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    	    {
                    	    	    LT125=(Token)match(input,LT,FOLLOW_LT_in_conditionalExpression979); if (state.failed) return retval; 
                    	    	    if ( state.backtracking==0 ) stream_LT.add(LT125);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop61;
                    	        }
                    	    } while (true);

                    	    char_literal126=(Token)match(input,88,FOLLOW_88_in_conditionalExpression982); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_88.add(char_literal126);

                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:59: ( LT )*
                    	    loop62:
                    	    do {
                    	        int alt62=2;
                    	        int LA62_0 = input.LA(1);

                    	        if ( (LA62_0==LT) ) {
                    	            alt62=1;
                    	        }


                    	        switch (alt62) {
                    	    	case 1 :
                    	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    	    {
                    	    	    LT127=(Token)match(input,LT,FOLLOW_LT_in_conditionalExpression984); if (state.failed) return retval; 
                    	    	    if ( state.backtracking==0 ) stream_LT.add(LT127);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop62;
                    	        }
                    	    } while (true);

                    	    pushFollow(FOLLOW_expression_in_conditionalExpression987);
                    	    expression128=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression128.getTree());
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:74: ( LT )*
                    	    loop63:
                    	    do {
                    	        int alt63=2;
                    	        int LA63_0 = input.LA(1);

                    	        if ( (LA63_0==LT) ) {
                    	            alt63=1;
                    	        }


                    	        switch (alt63) {
                    	    	case 1 :
                    	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    	    {
                    	    	    LT129=(Token)match(input,LT,FOLLOW_LT_in_conditionalExpression989); if (state.failed) return retval; 
                    	    	    if ( state.backtracking==0 ) stream_LT.add(LT129);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop63;
                    	        }
                    	    } while (true);

                    	    char_literal130=(Token)match(input,89,FOLLOW_89_in_conditionalExpression992); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_89.add(char_literal130);

                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:82: ( LT )*
                    	    loop64:
                    	    do {
                    	        int alt64=2;
                    	        int LA64_0 = input.LA(1);

                    	        if ( (LA64_0==LT) ) {
                    	            alt64=1;
                    	        }


                    	        switch (alt64) {
                    	    	case 1 :
                    	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    	    {
                    	    	    LT131=(Token)match(input,LT,FOLLOW_LT_in_conditionalExpression994); if (state.failed) return retval; 
                    	    	    if ( state.backtracking==0 ) stream_LT.add(LT131);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop64;
                    	        }
                    	    } while (true);

                    	    pushFollow(FOLLOW_expression_in_conditionalExpression997);
                    	    expression132=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression132.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt65 >= 1 ) break loop65;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(65, input);
                                throw eee;
                        }
                        cnt65++;
                    } while (true);



                    // AST REWRITE
                    // elements: expression, singleArg
                    // token labels: 
                    // rule labels: singleArg, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_singleArg=new RewriteRuleSubtreeStream(adaptor,"rule singleArg",singleArg!=null?singleArg.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 166:99: -> ^( CONDITIONEXPRESSION $singleArg ( expression )* )
                    {
                        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:102: ^( CONDITIONEXPRESSION $singleArg ( expression )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITIONEXPRESSION, "CONDITIONEXPRESSION"), root_1);

                        adaptor.addChild(root_1, stream_singleArg.nextTree());
                        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:135: ( expression )*
                        while ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, conditionalExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "conditionalExpression"

    public static class newExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newExpression"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:170:1: newExpression : 'new' ( LT )* functionCallExpression -> ^( NEWEXPRESSION functionCallExpression ) ;
    public final GScriptParser.newExpression_return newExpression() throws RecognitionException {
        GScriptParser.newExpression_return retval = new GScriptParser.newExpression_return();
        retval.start = input.LT(1);
        int newExpression_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal133=null;
        Token LT134=null;
        GScriptParser.functionCallExpression_return functionCallExpression135 = null;


        Object string_literal133_tree=null;
        Object LT134_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_functionCallExpression=new RewriteRuleSubtreeStream(adaptor,"rule functionCallExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:171:2: ( 'new' ( LT )* functionCallExpression -> ^( NEWEXPRESSION functionCallExpression ) )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:171:4: 'new' ( LT )* functionCallExpression
            {
            string_literal133=(Token)match(input,90,FOLLOW_90_in_newExpression1026); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_90.add(string_literal133);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:171:10: ( LT )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==LT) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT134=(Token)match(input,LT,FOLLOW_LT_in_newExpression1028); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT134);


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            pushFollow(FOLLOW_functionCallExpression_in_newExpression1031);
            functionCallExpression135=functionCallExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_functionCallExpression.add(functionCallExpression135.getTree());


            // AST REWRITE
            // elements: functionCallExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 171:37: -> ^( NEWEXPRESSION functionCallExpression )
            {
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:171:39: ^( NEWEXPRESSION functionCallExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEWEXPRESSION, "NEWEXPRESSION"), root_1);

                adaptor.addChild(root_1, stream_functionCallExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, newExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "newExpression"

    public static class logicalORExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalORExpression"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:174:1: logicalORExpression : (singleArg= logicalANDExpression -> $singleArg) ( ( ( LT )* '||' ( LT )* logicalANDExpression )+ -> ^( OREXPRESSION ( logicalANDExpression )* ) )? ;
    public final GScriptParser.logicalORExpression_return logicalORExpression() throws RecognitionException {
        GScriptParser.logicalORExpression_return retval = new GScriptParser.logicalORExpression_return();
        retval.start = input.LT(1);
        int logicalORExpression_StartIndex = input.index();
        Object root_0 = null;

        Token LT136=null;
        Token string_literal137=null;
        Token LT138=null;
        GScriptParser.logicalANDExpression_return singleArg = null;

        GScriptParser.logicalANDExpression_return logicalANDExpression139 = null;


        Object LT136_tree=null;
        Object string_literal137_tree=null;
        Object LT138_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleSubtreeStream stream_logicalANDExpression=new RewriteRuleSubtreeStream(adaptor,"rule logicalANDExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:175:2: ( (singleArg= logicalANDExpression -> $singleArg) ( ( ( LT )* '||' ( LT )* logicalANDExpression )+ -> ^( OREXPRESSION ( logicalANDExpression )* ) )? )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:175:4: (singleArg= logicalANDExpression -> $singleArg) ( ( ( LT )* '||' ( LT )* logicalANDExpression )+ -> ^( OREXPRESSION ( logicalANDExpression )* ) )?
            {
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:175:4: (singleArg= logicalANDExpression -> $singleArg)
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:175:5: singleArg= logicalANDExpression
            {
            pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression1052);
            singleArg=logicalANDExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logicalANDExpression.add(singleArg.getTree());


            // AST REWRITE
            // elements: singleArg
            // token labels: 
            // rule labels: singleArg, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_singleArg=new RewriteRuleSubtreeStream(adaptor,"rule singleArg",singleArg!=null?singleArg.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 175:35: -> $singleArg
            {
                adaptor.addChild(root_0, stream_singleArg.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:175:50: ( ( ( LT )* '||' ( LT )* logicalANDExpression )+ -> ^( OREXPRESSION ( logicalANDExpression )* ) )?
            int alt71=2;
            alt71 = dfa71.predict(input);
            switch (alt71) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:175:51: ( ( LT )* '||' ( LT )* logicalANDExpression )+
                    {
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:175:51: ( ( LT )* '||' ( LT )* logicalANDExpression )+
                    int cnt70=0;
                    loop70:
                    do {
                        int alt70=2;
                        alt70 = dfa70.predict(input);
                        switch (alt70) {
                    	case 1 :
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:175:52: ( LT )* '||' ( LT )* logicalANDExpression
                    	    {
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:175:52: ( LT )*
                    	    loop68:
                    	    do {
                    	        int alt68=2;
                    	        int LA68_0 = input.LA(1);

                    	        if ( (LA68_0==LT) ) {
                    	            alt68=1;
                    	        }


                    	        switch (alt68) {
                    	    	case 1 :
                    	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    	    {
                    	    	    LT136=(Token)match(input,LT,FOLLOW_LT_in_logicalORExpression1061); if (state.failed) return retval; 
                    	    	    if ( state.backtracking==0 ) stream_LT.add(LT136);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop68;
                    	        }
                    	    } while (true);

                    	    string_literal137=(Token)match(input,91,FOLLOW_91_in_logicalORExpression1064); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_91.add(string_literal137);

                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:175:61: ( LT )*
                    	    loop69:
                    	    do {
                    	        int alt69=2;
                    	        int LA69_0 = input.LA(1);

                    	        if ( (LA69_0==LT) ) {
                    	            alt69=1;
                    	        }


                    	        switch (alt69) {
                    	    	case 1 :
                    	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    	    {
                    	    	    LT138=(Token)match(input,LT,FOLLOW_LT_in_logicalORExpression1066); if (state.failed) return retval; 
                    	    	    if ( state.backtracking==0 ) stream_LT.add(LT138);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop69;
                    	        }
                    	    } while (true);

                    	    pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression1069);
                    	    logicalANDExpression139=logicalANDExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_logicalANDExpression.add(logicalANDExpression139.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt70 >= 1 ) break loop70;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(70, input);
                                throw eee;
                        }
                        cnt70++;
                    } while (true);



                    // AST REWRITE
                    // elements: logicalANDExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 175:88: -> ^( OREXPRESSION ( logicalANDExpression )* )
                    {
                        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:175:91: ^( OREXPRESSION ( logicalANDExpression )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OREXPRESSION, "OREXPRESSION"), root_1);

                        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:175:106: ( logicalANDExpression )*
                        while ( stream_logicalANDExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_logicalANDExpression.nextTree());

                        }
                        stream_logicalANDExpression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, logicalORExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicalORExpression"

    public static class logicalANDExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalANDExpression"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:178:1: logicalANDExpression : (singleArg= bitwiseORExpression -> $singleArg) ( ( ( LT )* '&&' ( LT )* bitwiseORExpression )+ -> ^( ANDEXPRESSION ( bitwiseORExpression )* ) )? ;
    public final GScriptParser.logicalANDExpression_return logicalANDExpression() throws RecognitionException {
        GScriptParser.logicalANDExpression_return retval = new GScriptParser.logicalANDExpression_return();
        retval.start = input.LT(1);
        int logicalANDExpression_StartIndex = input.index();
        Object root_0 = null;

        Token LT140=null;
        Token string_literal141=null;
        Token LT142=null;
        GScriptParser.bitwiseORExpression_return singleArg = null;

        GScriptParser.bitwiseORExpression_return bitwiseORExpression143 = null;


        Object LT140_tree=null;
        Object string_literal141_tree=null;
        Object LT142_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleSubtreeStream stream_bitwiseORExpression=new RewriteRuleSubtreeStream(adaptor,"rule bitwiseORExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:179:2: ( (singleArg= bitwiseORExpression -> $singleArg) ( ( ( LT )* '&&' ( LT )* bitwiseORExpression )+ -> ^( ANDEXPRESSION ( bitwiseORExpression )* ) )? )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:179:4: (singleArg= bitwiseORExpression -> $singleArg) ( ( ( LT )* '&&' ( LT )* bitwiseORExpression )+ -> ^( ANDEXPRESSION ( bitwiseORExpression )* ) )?
            {
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:179:4: (singleArg= bitwiseORExpression -> $singleArg)
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:179:5: singleArg= bitwiseORExpression
            {
            pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression1097);
            singleArg=bitwiseORExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bitwiseORExpression.add(singleArg.getTree());


            // AST REWRITE
            // elements: singleArg
            // token labels: 
            // rule labels: singleArg, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_singleArg=new RewriteRuleSubtreeStream(adaptor,"rule singleArg",singleArg!=null?singleArg.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 179:34: -> $singleArg
            {
                adaptor.addChild(root_0, stream_singleArg.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:179:49: ( ( ( LT )* '&&' ( LT )* bitwiseORExpression )+ -> ^( ANDEXPRESSION ( bitwiseORExpression )* ) )?
            int alt75=2;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:179:50: ( ( LT )* '&&' ( LT )* bitwiseORExpression )+
                    {
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:179:50: ( ( LT )* '&&' ( LT )* bitwiseORExpression )+
                    int cnt74=0;
                    loop74:
                    do {
                        int alt74=2;
                        alt74 = dfa74.predict(input);
                        switch (alt74) {
                    	case 1 :
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:179:51: ( LT )* '&&' ( LT )* bitwiseORExpression
                    	    {
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:179:51: ( LT )*
                    	    loop72:
                    	    do {
                    	        int alt72=2;
                    	        int LA72_0 = input.LA(1);

                    	        if ( (LA72_0==LT) ) {
                    	            alt72=1;
                    	        }


                    	        switch (alt72) {
                    	    	case 1 :
                    	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    	    {
                    	    	    LT140=(Token)match(input,LT,FOLLOW_LT_in_logicalANDExpression1106); if (state.failed) return retval; 
                    	    	    if ( state.backtracking==0 ) stream_LT.add(LT140);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop72;
                    	        }
                    	    } while (true);

                    	    string_literal141=(Token)match(input,92,FOLLOW_92_in_logicalANDExpression1109); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_92.add(string_literal141);

                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:179:60: ( LT )*
                    	    loop73:
                    	    do {
                    	        int alt73=2;
                    	        int LA73_0 = input.LA(1);

                    	        if ( (LA73_0==LT) ) {
                    	            alt73=1;
                    	        }


                    	        switch (alt73) {
                    	    	case 1 :
                    	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    	    {
                    	    	    LT142=(Token)match(input,LT,FOLLOW_LT_in_logicalANDExpression1111); if (state.failed) return retval; 
                    	    	    if ( state.backtracking==0 ) stream_LT.add(LT142);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop73;
                    	        }
                    	    } while (true);

                    	    pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression1114);
                    	    bitwiseORExpression143=bitwiseORExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_bitwiseORExpression.add(bitwiseORExpression143.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt74 >= 1 ) break loop74;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(74, input);
                                throw eee;
                        }
                        cnt74++;
                    } while (true);



                    // AST REWRITE
                    // elements: bitwiseORExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 179:86: -> ^( ANDEXPRESSION ( bitwiseORExpression )* )
                    {
                        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:179:89: ^( ANDEXPRESSION ( bitwiseORExpression )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ANDEXPRESSION, "ANDEXPRESSION"), root_1);

                        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:179:105: ( bitwiseORExpression )*
                        while ( stream_bitwiseORExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_bitwiseORExpression.nextTree());

                        }
                        stream_bitwiseORExpression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, logicalANDExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "logicalANDExpression"

    public static class bitwiseORExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseORExpression"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:182:1: bitwiseORExpression : (singleArg= bitwiseXORExpression -> $singleArg) ( ( ( LT )* '|' ( LT )* bitwiseXORExpression )+ -> ^( BITOREXPRESSION ( bitwiseXORExpression )* ) )? ;
    public final GScriptParser.bitwiseORExpression_return bitwiseORExpression() throws RecognitionException {
        GScriptParser.bitwiseORExpression_return retval = new GScriptParser.bitwiseORExpression_return();
        retval.start = input.LT(1);
        int bitwiseORExpression_StartIndex = input.index();
        Object root_0 = null;

        Token LT144=null;
        Token char_literal145=null;
        Token LT146=null;
        GScriptParser.bitwiseXORExpression_return singleArg = null;

        GScriptParser.bitwiseXORExpression_return bitwiseXORExpression147 = null;


        Object LT144_tree=null;
        Object char_literal145_tree=null;
        Object LT146_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_bitwiseXORExpression=new RewriteRuleSubtreeStream(adaptor,"rule bitwiseXORExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:183:2: ( (singleArg= bitwiseXORExpression -> $singleArg) ( ( ( LT )* '|' ( LT )* bitwiseXORExpression )+ -> ^( BITOREXPRESSION ( bitwiseXORExpression )* ) )? )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:183:4: (singleArg= bitwiseXORExpression -> $singleArg) ( ( ( LT )* '|' ( LT )* bitwiseXORExpression )+ -> ^( BITOREXPRESSION ( bitwiseXORExpression )* ) )?
            {
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:183:4: (singleArg= bitwiseXORExpression -> $singleArg)
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:183:5: singleArg= bitwiseXORExpression
            {
            pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression1142);
            singleArg=bitwiseXORExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bitwiseXORExpression.add(singleArg.getTree());


            // AST REWRITE
            // elements: singleArg
            // token labels: 
            // rule labels: singleArg, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_singleArg=new RewriteRuleSubtreeStream(adaptor,"rule singleArg",singleArg!=null?singleArg.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 183:35: -> $singleArg
            {
                adaptor.addChild(root_0, stream_singleArg.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:183:50: ( ( ( LT )* '|' ( LT )* bitwiseXORExpression )+ -> ^( BITOREXPRESSION ( bitwiseXORExpression )* ) )?
            int alt79=2;
            alt79 = dfa79.predict(input);
            switch (alt79) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:183:51: ( ( LT )* '|' ( LT )* bitwiseXORExpression )+
                    {
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:183:51: ( ( LT )* '|' ( LT )* bitwiseXORExpression )+
                    int cnt78=0;
                    loop78:
                    do {
                        int alt78=2;
                        alt78 = dfa78.predict(input);
                        switch (alt78) {
                    	case 1 :
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:183:52: ( LT )* '|' ( LT )* bitwiseXORExpression
                    	    {
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:183:52: ( LT )*
                    	    loop76:
                    	    do {
                    	        int alt76=2;
                    	        int LA76_0 = input.LA(1);

                    	        if ( (LA76_0==LT) ) {
                    	            alt76=1;
                    	        }


                    	        switch (alt76) {
                    	    	case 1 :
                    	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    	    {
                    	    	    LT144=(Token)match(input,LT,FOLLOW_LT_in_bitwiseORExpression1151); if (state.failed) return retval; 
                    	    	    if ( state.backtracking==0 ) stream_LT.add(LT144);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop76;
                    	        }
                    	    } while (true);

                    	    char_literal145=(Token)match(input,93,FOLLOW_93_in_bitwiseORExpression1154); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_93.add(char_literal145);

                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:183:60: ( LT )*
                    	    loop77:
                    	    do {
                    	        int alt77=2;
                    	        int LA77_0 = input.LA(1);

                    	        if ( (LA77_0==LT) ) {
                    	            alt77=1;
                    	        }


                    	        switch (alt77) {
                    	    	case 1 :
                    	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    	    {
                    	    	    LT146=(Token)match(input,LT,FOLLOW_LT_in_bitwiseORExpression1156); if (state.failed) return retval; 
                    	    	    if ( state.backtracking==0 ) stream_LT.add(LT146);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop77;
                    	        }
                    	    } while (true);

                    	    pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression1159);
                    	    bitwiseXORExpression147=bitwiseXORExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_bitwiseXORExpression.add(bitwiseXORExpression147.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt78 >= 1 ) break loop78;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(78, input);
                                throw eee;
                        }
                        cnt78++;
                    } while (true);



                    // AST REWRITE
                    // elements: bitwiseXORExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 183:87: -> ^( BITOREXPRESSION ( bitwiseXORExpression )* )
                    {
                        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:183:90: ^( BITOREXPRESSION ( bitwiseXORExpression )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BITOREXPRESSION, "BITOREXPRESSION"), root_1);

                        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:183:108: ( bitwiseXORExpression )*
                        while ( stream_bitwiseXORExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_bitwiseXORExpression.nextTree());

                        }
                        stream_bitwiseXORExpression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, bitwiseORExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitwiseORExpression"

    public static class bitwiseXORExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseXORExpression"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:186:1: bitwiseXORExpression : (singleArg= bitwiseANDExpression -> $singleArg) ( ( ( LT )* '^' ( LT )* bitwiseANDExpression )+ -> ^( BITXOREXPRESSION ( bitwiseANDExpression )* ) )? ;
    public final GScriptParser.bitwiseXORExpression_return bitwiseXORExpression() throws RecognitionException {
        GScriptParser.bitwiseXORExpression_return retval = new GScriptParser.bitwiseXORExpression_return();
        retval.start = input.LT(1);
        int bitwiseXORExpression_StartIndex = input.index();
        Object root_0 = null;

        Token LT148=null;
        Token char_literal149=null;
        Token LT150=null;
        GScriptParser.bitwiseANDExpression_return singleArg = null;

        GScriptParser.bitwiseANDExpression_return bitwiseANDExpression151 = null;


        Object LT148_tree=null;
        Object char_literal149_tree=null;
        Object LT150_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleSubtreeStream stream_bitwiseANDExpression=new RewriteRuleSubtreeStream(adaptor,"rule bitwiseANDExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:187:2: ( (singleArg= bitwiseANDExpression -> $singleArg) ( ( ( LT )* '^' ( LT )* bitwiseANDExpression )+ -> ^( BITXOREXPRESSION ( bitwiseANDExpression )* ) )? )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:187:4: (singleArg= bitwiseANDExpression -> $singleArg) ( ( ( LT )* '^' ( LT )* bitwiseANDExpression )+ -> ^( BITXOREXPRESSION ( bitwiseANDExpression )* ) )?
            {
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:187:4: (singleArg= bitwiseANDExpression -> $singleArg)
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:187:5: singleArg= bitwiseANDExpression
            {
            pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression1187);
            singleArg=bitwiseANDExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_bitwiseANDExpression.add(singleArg.getTree());


            // AST REWRITE
            // elements: singleArg
            // token labels: 
            // rule labels: singleArg, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_singleArg=new RewriteRuleSubtreeStream(adaptor,"rule singleArg",singleArg!=null?singleArg.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 187:35: -> $singleArg
            {
                adaptor.addChild(root_0, stream_singleArg.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:187:50: ( ( ( LT )* '^' ( LT )* bitwiseANDExpression )+ -> ^( BITXOREXPRESSION ( bitwiseANDExpression )* ) )?
            int alt83=2;
            alt83 = dfa83.predict(input);
            switch (alt83) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:187:51: ( ( LT )* '^' ( LT )* bitwiseANDExpression )+
                    {
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:187:51: ( ( LT )* '^' ( LT )* bitwiseANDExpression )+
                    int cnt82=0;
                    loop82:
                    do {
                        int alt82=2;
                        alt82 = dfa82.predict(input);
                        switch (alt82) {
                    	case 1 :
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:187:52: ( LT )* '^' ( LT )* bitwiseANDExpression
                    	    {
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:187:52: ( LT )*
                    	    loop80:
                    	    do {
                    	        int alt80=2;
                    	        int LA80_0 = input.LA(1);

                    	        if ( (LA80_0==LT) ) {
                    	            alt80=1;
                    	        }


                    	        switch (alt80) {
                    	    	case 1 :
                    	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    	    {
                    	    	    LT148=(Token)match(input,LT,FOLLOW_LT_in_bitwiseXORExpression1196); if (state.failed) return retval; 
                    	    	    if ( state.backtracking==0 ) stream_LT.add(LT148);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop80;
                    	        }
                    	    } while (true);

                    	    char_literal149=(Token)match(input,94,FOLLOW_94_in_bitwiseXORExpression1199); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_94.add(char_literal149);

                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:187:60: ( LT )*
                    	    loop81:
                    	    do {
                    	        int alt81=2;
                    	        int LA81_0 = input.LA(1);

                    	        if ( (LA81_0==LT) ) {
                    	            alt81=1;
                    	        }


                    	        switch (alt81) {
                    	    	case 1 :
                    	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    	    {
                    	    	    LT150=(Token)match(input,LT,FOLLOW_LT_in_bitwiseXORExpression1201); if (state.failed) return retval; 
                    	    	    if ( state.backtracking==0 ) stream_LT.add(LT150);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop81;
                    	        }
                    	    } while (true);

                    	    pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression1204);
                    	    bitwiseANDExpression151=bitwiseANDExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_bitwiseANDExpression.add(bitwiseANDExpression151.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt82 >= 1 ) break loop82;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(82, input);
                                throw eee;
                        }
                        cnt82++;
                    } while (true);



                    // AST REWRITE
                    // elements: bitwiseANDExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 187:87: -> ^( BITXOREXPRESSION ( bitwiseANDExpression )* )
                    {
                        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:187:90: ^( BITXOREXPRESSION ( bitwiseANDExpression )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BITXOREXPRESSION, "BITXOREXPRESSION"), root_1);

                        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:187:109: ( bitwiseANDExpression )*
                        while ( stream_bitwiseANDExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_bitwiseANDExpression.nextTree());

                        }
                        stream_bitwiseANDExpression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, bitwiseXORExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitwiseXORExpression"

    public static class bitwiseANDExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseANDExpression"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:190:1: bitwiseANDExpression : (singleArg= equalityExpression -> $singleArg) ( ( ( LT )* '&' ( LT )* equalityExpression )+ -> ^( BITANDEXPRESSION ( equalityExpression )* ) )? ;
    public final GScriptParser.bitwiseANDExpression_return bitwiseANDExpression() throws RecognitionException {
        GScriptParser.bitwiseANDExpression_return retval = new GScriptParser.bitwiseANDExpression_return();
        retval.start = input.LT(1);
        int bitwiseANDExpression_StartIndex = input.index();
        Object root_0 = null;

        Token LT152=null;
        Token char_literal153=null;
        Token LT154=null;
        GScriptParser.equalityExpression_return singleArg = null;

        GScriptParser.equalityExpression_return equalityExpression155 = null;


        Object LT152_tree=null;
        Object char_literal153_tree=null;
        Object LT154_tree=null;
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleSubtreeStream stream_equalityExpression=new RewriteRuleSubtreeStream(adaptor,"rule equalityExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:191:2: ( (singleArg= equalityExpression -> $singleArg) ( ( ( LT )* '&' ( LT )* equalityExpression )+ -> ^( BITANDEXPRESSION ( equalityExpression )* ) )? )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:191:4: (singleArg= equalityExpression -> $singleArg) ( ( ( LT )* '&' ( LT )* equalityExpression )+ -> ^( BITANDEXPRESSION ( equalityExpression )* ) )?
            {
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:191:4: (singleArg= equalityExpression -> $singleArg)
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:191:5: singleArg= equalityExpression
            {
            pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression1233);
            singleArg=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_equalityExpression.add(singleArg.getTree());


            // AST REWRITE
            // elements: singleArg
            // token labels: 
            // rule labels: singleArg, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_singleArg=new RewriteRuleSubtreeStream(adaptor,"rule singleArg",singleArg!=null?singleArg.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 191:33: -> $singleArg
            {
                adaptor.addChild(root_0, stream_singleArg.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:191:48: ( ( ( LT )* '&' ( LT )* equalityExpression )+ -> ^( BITANDEXPRESSION ( equalityExpression )* ) )?
            int alt87=2;
            alt87 = dfa87.predict(input);
            switch (alt87) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:191:49: ( ( LT )* '&' ( LT )* equalityExpression )+
                    {
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:191:49: ( ( LT )* '&' ( LT )* equalityExpression )+
                    int cnt86=0;
                    loop86:
                    do {
                        int alt86=2;
                        alt86 = dfa86.predict(input);
                        switch (alt86) {
                    	case 1 :
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:191:50: ( LT )* '&' ( LT )* equalityExpression
                    	    {
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:191:50: ( LT )*
                    	    loop84:
                    	    do {
                    	        int alt84=2;
                    	        int LA84_0 = input.LA(1);

                    	        if ( (LA84_0==LT) ) {
                    	            alt84=1;
                    	        }


                    	        switch (alt84) {
                    	    	case 1 :
                    	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    	    {
                    	    	    LT152=(Token)match(input,LT,FOLLOW_LT_in_bitwiseANDExpression1242); if (state.failed) return retval; 
                    	    	    if ( state.backtracking==0 ) stream_LT.add(LT152);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop84;
                    	        }
                    	    } while (true);

                    	    char_literal153=(Token)match(input,95,FOLLOW_95_in_bitwiseANDExpression1245); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_95.add(char_literal153);

                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:191:58: ( LT )*
                    	    loop85:
                    	    do {
                    	        int alt85=2;
                    	        int LA85_0 = input.LA(1);

                    	        if ( (LA85_0==LT) ) {
                    	            alt85=1;
                    	        }


                    	        switch (alt85) {
                    	    	case 1 :
                    	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    	    {
                    	    	    LT154=(Token)match(input,LT,FOLLOW_LT_in_bitwiseANDExpression1247); if (state.failed) return retval; 
                    	    	    if ( state.backtracking==0 ) stream_LT.add(LT154);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop85;
                    	        }
                    	    } while (true);

                    	    pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression1250);
                    	    equalityExpression155=equalityExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_equalityExpression.add(equalityExpression155.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt86 >= 1 ) break loop86;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(86, input);
                                throw eee;
                        }
                        cnt86++;
                    } while (true);



                    // AST REWRITE
                    // elements: equalityExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 191:83: -> ^( BITANDEXPRESSION ( equalityExpression )* )
                    {
                        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:191:86: ^( BITANDEXPRESSION ( equalityExpression )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BITANDEXPRESSION, "BITANDEXPRESSION"), root_1);

                        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:191:105: ( equalityExpression )*
                        while ( stream_equalityExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_equalityExpression.nextTree());

                        }
                        stream_equalityExpression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, bitwiseANDExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bitwiseANDExpression"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpression"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:194:1: equalityExpression : (singleArg= relationalExpression -> $singleArg) ( ( ( LT )* (op= '==' | op= '!=' ) ( LT )* equalityExpression ) -> ^( EQUALITYEXPRESSION $op relationalExpression equalityExpression ) )? ;
    public final GScriptParser.equalityExpression_return equalityExpression() throws RecognitionException {
        GScriptParser.equalityExpression_return retval = new GScriptParser.equalityExpression_return();
        retval.start = input.LT(1);
        int equalityExpression_StartIndex = input.index();
        Object root_0 = null;

        Token op=null;
        Token LT156=null;
        Token LT157=null;
        GScriptParser.relationalExpression_return singleArg = null;

        GScriptParser.equalityExpression_return equalityExpression158 = null;


        Object op_tree=null;
        Object LT156_tree=null;
        Object LT157_tree=null;
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleSubtreeStream stream_equalityExpression=new RewriteRuleSubtreeStream(adaptor,"rule equalityExpression");
        RewriteRuleSubtreeStream stream_relationalExpression=new RewriteRuleSubtreeStream(adaptor,"rule relationalExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:195:2: ( (singleArg= relationalExpression -> $singleArg) ( ( ( LT )* (op= '==' | op= '!=' ) ( LT )* equalityExpression ) -> ^( EQUALITYEXPRESSION $op relationalExpression equalityExpression ) )? )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:195:4: (singleArg= relationalExpression -> $singleArg) ( ( ( LT )* (op= '==' | op= '!=' ) ( LT )* equalityExpression ) -> ^( EQUALITYEXPRESSION $op relationalExpression equalityExpression ) )?
            {
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:195:4: (singleArg= relationalExpression -> $singleArg)
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:195:5: singleArg= relationalExpression
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression1278);
            singleArg=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_relationalExpression.add(singleArg.getTree());


            // AST REWRITE
            // elements: singleArg
            // token labels: 
            // rule labels: singleArg, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_singleArg=new RewriteRuleSubtreeStream(adaptor,"rule singleArg",singleArg!=null?singleArg.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 195:35: -> $singleArg
            {
                adaptor.addChild(root_0, stream_singleArg.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:195:50: ( ( ( LT )* (op= '==' | op= '!=' ) ( LT )* equalityExpression ) -> ^( EQUALITYEXPRESSION $op relationalExpression equalityExpression ) )?
            int alt91=2;
            alt91 = dfa91.predict(input);
            switch (alt91) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:195:51: ( ( LT )* (op= '==' | op= '!=' ) ( LT )* equalityExpression )
                    {
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:195:51: ( ( LT )* (op= '==' | op= '!=' ) ( LT )* equalityExpression )
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:195:52: ( LT )* (op= '==' | op= '!=' ) ( LT )* equalityExpression
                    {
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:195:52: ( LT )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==LT) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    {
                    	    LT156=(Token)match(input,LT,FOLLOW_LT_in_equalityExpression1287); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LT.add(LT156);


                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);

                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:195:56: (op= '==' | op= '!=' )
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==96) ) {
                        alt89=1;
                    }
                    else if ( (LA89_0==97) ) {
                        alt89=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 89, 0, input);

                        throw nvae;
                    }
                    switch (alt89) {
                        case 1 :
                            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:195:57: op= '=='
                            {
                            op=(Token)match(input,96,FOLLOW_96_in_equalityExpression1293); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_96.add(op);


                            }
                            break;
                        case 2 :
                            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:195:67: op= '!='
                            {
                            op=(Token)match(input,97,FOLLOW_97_in_equalityExpression1299); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_97.add(op);


                            }
                            break;

                    }

                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:195:76: ( LT )*
                    loop90:
                    do {
                        int alt90=2;
                        int LA90_0 = input.LA(1);

                        if ( (LA90_0==LT) ) {
                            alt90=1;
                        }


                        switch (alt90) {
                    	case 1 :
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    {
                    	    LT157=(Token)match(input,LT,FOLLOW_LT_in_equalityExpression1302); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LT.add(LT157);


                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);

                    pushFollow(FOLLOW_equalityExpression_in_equalityExpression1305);
                    equalityExpression158=equalityExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_equalityExpression.add(equalityExpression158.getTree());

                    }



                    // AST REWRITE
                    // elements: op, relationalExpression, equalityExpression
                    // token labels: op
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 195:100: -> ^( EQUALITYEXPRESSION $op relationalExpression equalityExpression )
                    {
                        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:195:103: ^( EQUALITYEXPRESSION $op relationalExpression equalityExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EQUALITYEXPRESSION, "EQUALITYEXPRESSION"), root_1);

                        adaptor.addChild(root_1, stream_op.nextNode());
                        adaptor.addChild(root_1, stream_relationalExpression.nextTree());
                        adaptor.addChild(root_1, stream_equalityExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, equalityExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "equalityExpression"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpression"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:199:1: relationalExpression : (singleArg= additiveExpression -> $singleArg) ( ( ( LT )* (op= '<' | op= '>' | op= '<=' | op= '>=' ) ( LT )* relationalExpression ) -> ^( RELATIONALEXPRESSION $op additiveExpression relationalExpression ) )? ;
    public final GScriptParser.relationalExpression_return relationalExpression() throws RecognitionException {
        GScriptParser.relationalExpression_return retval = new GScriptParser.relationalExpression_return();
        retval.start = input.LT(1);
        int relationalExpression_StartIndex = input.index();
        Object root_0 = null;

        Token op=null;
        Token LT159=null;
        Token LT160=null;
        GScriptParser.additiveExpression_return singleArg = null;

        GScriptParser.relationalExpression_return relationalExpression161 = null;


        Object op_tree=null;
        Object LT159_tree=null;
        Object LT160_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_relationalExpression=new RewriteRuleSubtreeStream(adaptor,"rule relationalExpression");
        RewriteRuleSubtreeStream stream_additiveExpression=new RewriteRuleSubtreeStream(adaptor,"rule additiveExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:200:2: ( (singleArg= additiveExpression -> $singleArg) ( ( ( LT )* (op= '<' | op= '>' | op= '<=' | op= '>=' ) ( LT )* relationalExpression ) -> ^( RELATIONALEXPRESSION $op additiveExpression relationalExpression ) )? )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:200:4: (singleArg= additiveExpression -> $singleArg) ( ( ( LT )* (op= '<' | op= '>' | op= '<=' | op= '>=' ) ( LT )* relationalExpression ) -> ^( RELATIONALEXPRESSION $op additiveExpression relationalExpression ) )?
            {
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:200:4: (singleArg= additiveExpression -> $singleArg)
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:200:5: singleArg= additiveExpression
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression1336);
            singleArg=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_additiveExpression.add(singleArg.getTree());


            // AST REWRITE
            // elements: singleArg
            // token labels: 
            // rule labels: singleArg, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_singleArg=new RewriteRuleSubtreeStream(adaptor,"rule singleArg",singleArg!=null?singleArg.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 200:33: -> $singleArg
            {
                adaptor.addChild(root_0, stream_singleArg.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:200:48: ( ( ( LT )* (op= '<' | op= '>' | op= '<=' | op= '>=' ) ( LT )* relationalExpression ) -> ^( RELATIONALEXPRESSION $op additiveExpression relationalExpression ) )?
            int alt95=2;
            alt95 = dfa95.predict(input);
            switch (alt95) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:200:49: ( ( LT )* (op= '<' | op= '>' | op= '<=' | op= '>=' ) ( LT )* relationalExpression )
                    {
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:200:49: ( ( LT )* (op= '<' | op= '>' | op= '<=' | op= '>=' ) ( LT )* relationalExpression )
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:200:50: ( LT )* (op= '<' | op= '>' | op= '<=' | op= '>=' ) ( LT )* relationalExpression
                    {
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:200:50: ( LT )*
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==LT) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    {
                    	    LT159=(Token)match(input,LT,FOLLOW_LT_in_relationalExpression1345); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LT.add(LT159);


                    	    }
                    	    break;

                    	default :
                    	    break loop92;
                        }
                    } while (true);

                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:200:54: (op= '<' | op= '>' | op= '<=' | op= '>=' )
                    int alt93=4;
                    switch ( input.LA(1) ) {
                    case 98:
                        {
                        alt93=1;
                        }
                        break;
                    case 99:
                        {
                        alt93=2;
                        }
                        break;
                    case 100:
                        {
                        alt93=3;
                        }
                        break;
                    case 101:
                        {
                        alt93=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 93, 0, input);

                        throw nvae;
                    }

                    switch (alt93) {
                        case 1 :
                            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:200:55: op= '<'
                            {
                            op=(Token)match(input,98,FOLLOW_98_in_relationalExpression1351); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_98.add(op);


                            }
                            break;
                        case 2 :
                            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:200:64: op= '>'
                            {
                            op=(Token)match(input,99,FOLLOW_99_in_relationalExpression1357); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_99.add(op);


                            }
                            break;
                        case 3 :
                            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:200:73: op= '<='
                            {
                            op=(Token)match(input,100,FOLLOW_100_in_relationalExpression1363); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_100.add(op);


                            }
                            break;
                        case 4 :
                            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:200:83: op= '>='
                            {
                            op=(Token)match(input,101,FOLLOW_101_in_relationalExpression1369); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_101.add(op);


                            }
                            break;

                    }

                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:200:93: ( LT )*
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==LT) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    {
                    	    LT160=(Token)match(input,LT,FOLLOW_LT_in_relationalExpression1373); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LT.add(LT160);


                    	    }
                    	    break;

                    	default :
                    	    break loop94;
                        }
                    } while (true);

                    pushFollow(FOLLOW_relationalExpression_in_relationalExpression1376);
                    relationalExpression161=relationalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relationalExpression.add(relationalExpression161.getTree());

                    }



                    // AST REWRITE
                    // elements: op, additiveExpression, relationalExpression
                    // token labels: op
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 200:119: -> ^( RELATIONALEXPRESSION $op additiveExpression relationalExpression )
                    {
                        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:200:122: ^( RELATIONALEXPRESSION $op additiveExpression relationalExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RELATIONALEXPRESSION, "RELATIONALEXPRESSION"), root_1);

                        adaptor.addChild(root_1, stream_op.nextNode());
                        adaptor.addChild(root_1, stream_additiveExpression.nextTree());
                        adaptor.addChild(root_1, stream_relationalExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, relationalExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "relationalExpression"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpression"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:203:1: additiveExpression : (singleArg= multiplicativeExpression -> $singleArg) ( ( ( LT )* (op= '+' | op= '-' ) ( LT )* additiveExpression ) -> ^( ADDITIVEEXPRESSION $op multiplicativeExpression additiveExpression ) )? ;
    public final GScriptParser.additiveExpression_return additiveExpression() throws RecognitionException {
        GScriptParser.additiveExpression_return retval = new GScriptParser.additiveExpression_return();
        retval.start = input.LT(1);
        int additiveExpression_StartIndex = input.index();
        Object root_0 = null;

        Token op=null;
        Token LT162=null;
        Token LT163=null;
        GScriptParser.multiplicativeExpression_return singleArg = null;

        GScriptParser.additiveExpression_return additiveExpression164 = null;


        Object op_tree=null;
        Object LT162_tree=null;
        Object LT163_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleSubtreeStream stream_additiveExpression=new RewriteRuleSubtreeStream(adaptor,"rule additiveExpression");
        RewriteRuleSubtreeStream stream_multiplicativeExpression=new RewriteRuleSubtreeStream(adaptor,"rule multiplicativeExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:204:2: ( (singleArg= multiplicativeExpression -> $singleArg) ( ( ( LT )* (op= '+' | op= '-' ) ( LT )* additiveExpression ) -> ^( ADDITIVEEXPRESSION $op multiplicativeExpression additiveExpression ) )? )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:204:4: (singleArg= multiplicativeExpression -> $singleArg) ( ( ( LT )* (op= '+' | op= '-' ) ( LT )* additiveExpression ) -> ^( ADDITIVEEXPRESSION $op multiplicativeExpression additiveExpression ) )?
            {
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:204:4: (singleArg= multiplicativeExpression -> $singleArg)
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:204:5: singleArg= multiplicativeExpression
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1406);
            singleArg=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_multiplicativeExpression.add(singleArg.getTree());


            // AST REWRITE
            // elements: singleArg
            // token labels: 
            // rule labels: singleArg, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_singleArg=new RewriteRuleSubtreeStream(adaptor,"rule singleArg",singleArg!=null?singleArg.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 204:39: -> $singleArg
            {
                adaptor.addChild(root_0, stream_singleArg.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:204:54: ( ( ( LT )* (op= '+' | op= '-' ) ( LT )* additiveExpression ) -> ^( ADDITIVEEXPRESSION $op multiplicativeExpression additiveExpression ) )?
            int alt99=2;
            alt99 = dfa99.predict(input);
            switch (alt99) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:204:55: ( ( LT )* (op= '+' | op= '-' ) ( LT )* additiveExpression )
                    {
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:204:55: ( ( LT )* (op= '+' | op= '-' ) ( LT )* additiveExpression )
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:204:56: ( LT )* (op= '+' | op= '-' ) ( LT )* additiveExpression
                    {
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:204:56: ( LT )*
                    loop96:
                    do {
                        int alt96=2;
                        int LA96_0 = input.LA(1);

                        if ( (LA96_0==LT) ) {
                            alt96=1;
                        }


                        switch (alt96) {
                    	case 1 :
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    {
                    	    LT162=(Token)match(input,LT,FOLLOW_LT_in_additiveExpression1415); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LT.add(LT162);


                    	    }
                    	    break;

                    	default :
                    	    break loop96;
                        }
                    } while (true);

                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:204:61: (op= '+' | op= '-' )
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==102) ) {
                        alt97=1;
                    }
                    else if ( (LA97_0==103) ) {
                        alt97=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 97, 0, input);

                        throw nvae;
                    }
                    switch (alt97) {
                        case 1 :
                            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:204:62: op= '+'
                            {
                            op=(Token)match(input,102,FOLLOW_102_in_additiveExpression1422); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_102.add(op);


                            }
                            break;
                        case 2 :
                            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:204:71: op= '-'
                            {
                            op=(Token)match(input,103,FOLLOW_103_in_additiveExpression1428); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_103.add(op);


                            }
                            break;

                    }

                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:204:79: ( LT )*
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==LT) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    {
                    	    LT163=(Token)match(input,LT,FOLLOW_LT_in_additiveExpression1431); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LT.add(LT163);


                    	    }
                    	    break;

                    	default :
                    	    break loop98;
                        }
                    } while (true);

                    pushFollow(FOLLOW_additiveExpression_in_additiveExpression1434);
                    additiveExpression164=additiveExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_additiveExpression.add(additiveExpression164.getTree());

                    }



                    // AST REWRITE
                    // elements: multiplicativeExpression, op, additiveExpression
                    // token labels: op
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 204:103: -> ^( ADDITIVEEXPRESSION $op multiplicativeExpression additiveExpression )
                    {
                        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:204:106: ^( ADDITIVEEXPRESSION $op multiplicativeExpression additiveExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ADDITIVEEXPRESSION, "ADDITIVEEXPRESSION"), root_1);

                        adaptor.addChild(root_1, stream_op.nextNode());
                        adaptor.addChild(root_1, stream_multiplicativeExpression.nextTree());
                        adaptor.addChild(root_1, stream_additiveExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, additiveExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "additiveExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpression"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:207:1: multiplicativeExpression : (singleArg= unaryExpression -> $singleArg) ( ( ( LT )* (op= '*' | op= '/' | op= '%' ) ( LT )* multiplicativeExpression )+ -> ^( MULTIPLICATIVEEXPRESSION $op unaryExpression multiplicativeExpression ) )? ;
    public final GScriptParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        GScriptParser.multiplicativeExpression_return retval = new GScriptParser.multiplicativeExpression_return();
        retval.start = input.LT(1);
        int multiplicativeExpression_StartIndex = input.index();
        Object root_0 = null;

        Token op=null;
        Token LT165=null;
        Token LT166=null;
        GScriptParser.unaryExpression_return singleArg = null;

        GScriptParser.multiplicativeExpression_return multiplicativeExpression167 = null;


        Object op_tree=null;
        Object LT165_tree=null;
        Object LT166_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        RewriteRuleSubtreeStream stream_multiplicativeExpression=new RewriteRuleSubtreeStream(adaptor,"rule multiplicativeExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:2: ( (singleArg= unaryExpression -> $singleArg) ( ( ( LT )* (op= '*' | op= '/' | op= '%' ) ( LT )* multiplicativeExpression )+ -> ^( MULTIPLICATIVEEXPRESSION $op unaryExpression multiplicativeExpression ) )? )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:4: (singleArg= unaryExpression -> $singleArg) ( ( ( LT )* (op= '*' | op= '/' | op= '%' ) ( LT )* multiplicativeExpression )+ -> ^( MULTIPLICATIVEEXPRESSION $op unaryExpression multiplicativeExpression ) )?
            {
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:4: (singleArg= unaryExpression -> $singleArg)
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:5: singleArg= unaryExpression
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1464);
            singleArg=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_unaryExpression.add(singleArg.getTree());


            // AST REWRITE
            // elements: singleArg
            // token labels: 
            // rule labels: singleArg, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_singleArg=new RewriteRuleSubtreeStream(adaptor,"rule singleArg",singleArg!=null?singleArg.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 208:30: -> $singleArg
            {
                adaptor.addChild(root_0, stream_singleArg.nextTree());

            }

            retval.tree = root_0;}
            }

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:45: ( ( ( LT )* (op= '*' | op= '/' | op= '%' ) ( LT )* multiplicativeExpression )+ -> ^( MULTIPLICATIVEEXPRESSION $op unaryExpression multiplicativeExpression ) )?
            int alt104=2;
            switch ( input.LA(1) ) {
                case LT:
                    {
                    int LA104_1 = input.LA(2);

                    if ( (synpred118_GScript()) ) {
                        alt104=1;
                    }
                    }
                    break;
                case 104:
                    {
                    int LA104_2 = input.LA(2);

                    if ( (synpred118_GScript()) ) {
                        alt104=1;
                    }
                    }
                    break;
                case 105:
                    {
                    int LA104_3 = input.LA(2);

                    if ( (synpred118_GScript()) ) {
                        alt104=1;
                    }
                    }
                    break;
                case 106:
                    {
                    int LA104_4 = input.LA(2);

                    if ( (synpred118_GScript()) ) {
                        alt104=1;
                    }
                    }
                    break;
            }

            switch (alt104) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:46: ( ( LT )* (op= '*' | op= '/' | op= '%' ) ( LT )* multiplicativeExpression )+
                    {
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:46: ( ( LT )* (op= '*' | op= '/' | op= '%' ) ( LT )* multiplicativeExpression )+
                    int cnt103=0;
                    loop103:
                    do {
                        int alt103=2;
                        switch ( input.LA(1) ) {
                        case LT:
                            {
                            int LA103_1 = input.LA(2);

                            if ( (synpred117_GScript()) ) {
                                alt103=1;
                            }


                            }
                            break;
                        case 104:
                            {
                            int LA103_3 = input.LA(2);

                            if ( (synpred117_GScript()) ) {
                                alt103=1;
                            }


                            }
                            break;
                        case 105:
                            {
                            int LA103_4 = input.LA(2);

                            if ( (synpred117_GScript()) ) {
                                alt103=1;
                            }


                            }
                            break;
                        case 106:
                            {
                            int LA103_5 = input.LA(2);

                            if ( (synpred117_GScript()) ) {
                                alt103=1;
                            }


                            }
                            break;

                        }

                        switch (alt103) {
                    	case 1 :
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:47: ( LT )* (op= '*' | op= '/' | op= '%' ) ( LT )* multiplicativeExpression
                    	    {
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:47: ( LT )*
                    	    loop100:
                    	    do {
                    	        int alt100=2;
                    	        int LA100_0 = input.LA(1);

                    	        if ( (LA100_0==LT) ) {
                    	            alt100=1;
                    	        }


                    	        switch (alt100) {
                    	    	case 1 :
                    	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    	    {
                    	    	    LT165=(Token)match(input,LT,FOLLOW_LT_in_multiplicativeExpression1473); if (state.failed) return retval; 
                    	    	    if ( state.backtracking==0 ) stream_LT.add(LT165);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop100;
                    	        }
                    	    } while (true);

                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:52: (op= '*' | op= '/' | op= '%' )
                    	    int alt101=3;
                    	    switch ( input.LA(1) ) {
                    	    case 104:
                    	        {
                    	        alt101=1;
                    	        }
                    	        break;
                    	    case 105:
                    	        {
                    	        alt101=2;
                    	        }
                    	        break;
                    	    case 106:
                    	        {
                    	        alt101=3;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return retval;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 101, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt101) {
                    	        case 1 :
                    	            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:53: op= '*'
                    	            {
                    	            op=(Token)match(input,104,FOLLOW_104_in_multiplicativeExpression1480); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_104.add(op);


                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:62: op= '/'
                    	            {
                    	            op=(Token)match(input,105,FOLLOW_105_in_multiplicativeExpression1486); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_105.add(op);


                    	            }
                    	            break;
                    	        case 3 :
                    	            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:71: op= '%'
                    	            {
                    	            op=(Token)match(input,106,FOLLOW_106_in_multiplicativeExpression1492); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_106.add(op);


                    	            }
                    	            break;

                    	    }

                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:79: ( LT )*
                    	    loop102:
                    	    do {
                    	        int alt102=2;
                    	        int LA102_0 = input.LA(1);

                    	        if ( (LA102_0==LT) ) {
                    	            alt102=1;
                    	        }


                    	        switch (alt102) {
                    	    	case 1 :
                    	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    	    {
                    	    	    LT166=(Token)match(input,LT,FOLLOW_LT_in_multiplicativeExpression1495); if (state.failed) return retval; 
                    	    	    if ( state.backtracking==0 ) stream_LT.add(LT166);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop102;
                    	        }
                    	    } while (true);

                    	    pushFollow(FOLLOW_multiplicativeExpression_in_multiplicativeExpression1498);
                    	    multiplicativeExpression167=multiplicativeExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_multiplicativeExpression.add(multiplicativeExpression167.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt103 >= 1 ) break loop103;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(103, input);
                                throw eee;
                        }
                        cnt103++;
                    } while (true);



                    // AST REWRITE
                    // elements: op, multiplicativeExpression, unaryExpression
                    // token labels: op
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 208:110: -> ^( MULTIPLICATIVEEXPRESSION $op unaryExpression multiplicativeExpression )
                    {
                        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:113: ^( MULTIPLICATIVEEXPRESSION $op unaryExpression multiplicativeExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MULTIPLICATIVEEXPRESSION, "MULTIPLICATIVEEXPRESSION"), root_1);

                        adaptor.addChild(root_1, stream_op.nextNode());
                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());
                        adaptor.addChild(root_1, stream_multiplicativeExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, multiplicativeExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpression"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:211:1: unaryExpression : ( postfixExpression | ( (op= '-' | op= '~' | op= '!' ) primaryExpression ) -> ^( UNARYEXPRESSION $op primaryExpression ) | primaryExpression );
    public final GScriptParser.unaryExpression_return unaryExpression() throws RecognitionException {
        GScriptParser.unaryExpression_return retval = new GScriptParser.unaryExpression_return();
        retval.start = input.LT(1);
        int unaryExpression_StartIndex = input.index();
        Object root_0 = null;

        Token op=null;
        GScriptParser.postfixExpression_return postfixExpression168 = null;

        GScriptParser.primaryExpression_return primaryExpression169 = null;

        GScriptParser.primaryExpression_return primaryExpression170 = null;


        Object op_tree=null;
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleSubtreeStream stream_primaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule primaryExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:212:2: ( postfixExpression | ( (op= '-' | op= '~' | op= '!' ) primaryExpression ) -> ^( UNARYEXPRESSION $op primaryExpression ) | primaryExpression )
            int alt106=3;
            alt106 = dfa106.predict(input);
            switch (alt106) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:212:4: postfixExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression1526);
                    postfixExpression168=postfixExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpression168.getTree());

                    }
                    break;
                case 2 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:213:2: ( (op= '-' | op= '~' | op= '!' ) primaryExpression )
                    {
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:213:2: ( (op= '-' | op= '~' | op= '!' ) primaryExpression )
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:213:4: (op= '-' | op= '~' | op= '!' ) primaryExpression
                    {
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:213:4: (op= '-' | op= '~' | op= '!' )
                    int alt105=3;
                    switch ( input.LA(1) ) {
                    case 103:
                        {
                        alt105=1;
                        }
                        break;
                    case 107:
                        {
                        alt105=2;
                        }
                        break;
                    case 108:
                        {
                        alt105=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 105, 0, input);

                        throw nvae;
                    }

                    switch (alt105) {
                        case 1 :
                            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:213:5: op= '-'
                            {
                            op=(Token)match(input,103,FOLLOW_103_in_unaryExpression1537); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_103.add(op);


                            }
                            break;
                        case 2 :
                            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:213:14: op= '~'
                            {
                            op=(Token)match(input,107,FOLLOW_107_in_unaryExpression1543); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_107.add(op);


                            }
                            break;
                        case 3 :
                            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:213:23: op= '!'
                            {
                            op=(Token)match(input,108,FOLLOW_108_in_unaryExpression1549); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_108.add(op);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression1552);
                    primaryExpression169=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_primaryExpression.add(primaryExpression169.getTree());

                    }



                    // AST REWRITE
                    // elements: op, primaryExpression
                    // token labels: op
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 214:2: -> ^( UNARYEXPRESSION $op primaryExpression )
                    {
                        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:214:5: ^( UNARYEXPRESSION $op primaryExpression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARYEXPRESSION, "UNARYEXPRESSION"), root_1);

                        adaptor.addChild(root_1, stream_op.nextNode());
                        adaptor.addChild(root_1, stream_primaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:214:49: primaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression1570);
                    primaryExpression170=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryExpression170.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, unaryExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "unaryExpression"

    public static class postfixExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfixExpression"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:217:1: postfixExpression : fieldReferenceExpression (op= '++' | op= '--' ) -> ^( POSTFIXEXPRESSION $op fieldReferenceExpression ) ;
    public final GScriptParser.postfixExpression_return postfixExpression() throws RecognitionException {
        GScriptParser.postfixExpression_return retval = new GScriptParser.postfixExpression_return();
        retval.start = input.LT(1);
        int postfixExpression_StartIndex = input.index();
        Object root_0 = null;

        Token op=null;
        GScriptParser.fieldReferenceExpression_return fieldReferenceExpression171 = null;


        Object op_tree=null;
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleSubtreeStream stream_fieldReferenceExpression=new RewriteRuleSubtreeStream(adaptor,"rule fieldReferenceExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:218:2: ( fieldReferenceExpression (op= '++' | op= '--' ) -> ^( POSTFIXEXPRESSION $op fieldReferenceExpression ) )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:218:4: fieldReferenceExpression (op= '++' | op= '--' )
            {
            pushFollow(FOLLOW_fieldReferenceExpression_in_postfixExpression1582);
            fieldReferenceExpression171=fieldReferenceExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fieldReferenceExpression.add(fieldReferenceExpression171.getTree());
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:218:29: (op= '++' | op= '--' )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==109) ) {
                alt107=1;
            }
            else if ( (LA107_0==110) ) {
                alt107=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:218:30: op= '++'
                    {
                    op=(Token)match(input,109,FOLLOW_109_in_postfixExpression1587); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_109.add(op);


                    }
                    break;
                case 2 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:218:40: op= '--'
                    {
                    op=(Token)match(input,110,FOLLOW_110_in_postfixExpression1593); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_110.add(op);


                    }
                    break;

            }



            // AST REWRITE
            // elements: fieldReferenceExpression, op
            // token labels: op
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_op=new RewriteRuleTokenStream(adaptor,"token op",op);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 218:49: -> ^( POSTFIXEXPRESSION $op fieldReferenceExpression )
            {
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:218:52: ^( POSTFIXEXPRESSION $op fieldReferenceExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(POSTFIXEXPRESSION, "POSTFIXEXPRESSION"), root_1);

                adaptor.addChild(root_1, stream_op.nextNode());
                adaptor.addChild(root_1, stream_fieldReferenceExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, postfixExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "postfixExpression"

    public static class primaryExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primaryExpression"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:222:1: primaryExpression : ( 'this' -> THISLITERAL | fieldReferenceExpression | literal | '(' ( LT )* expression ( LT )* ')' );
    public final GScriptParser.primaryExpression_return primaryExpression() throws RecognitionException {
        GScriptParser.primaryExpression_return retval = new GScriptParser.primaryExpression_return();
        retval.start = input.LT(1);
        int primaryExpression_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal172=null;
        Token char_literal175=null;
        Token LT176=null;
        Token LT178=null;
        Token char_literal179=null;
        GScriptParser.fieldReferenceExpression_return fieldReferenceExpression173 = null;

        GScriptParser.literal_return literal174 = null;

        GScriptParser.expression_return expression177 = null;


        Object string_literal172_tree=null;
        Object char_literal175_tree=null;
        Object LT176_tree=null;
        Object LT178_tree=null;
        Object char_literal179_tree=null;
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:223:2: ( 'this' -> THISLITERAL | fieldReferenceExpression | literal | '(' ( LT )* expression ( LT )* ')' )
            int alt110=4;
            switch ( input.LA(1) ) {
            case 111:
                {
                alt110=1;
                }
                break;
            case Identifier:
                {
                alt110=2;
                }
                break;
            case StringLiteral:
            case NumericLiteral:
            case 113:
            case 114:
            case 115:
                {
                alt110=3;
                }
                break;
            case 71:
                {
                alt110=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }

            switch (alt110) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:223:4: 'this'
                    {
                    string_literal172=(Token)match(input,111,FOLLOW_111_in_primaryExpression1619); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_111.add(string_literal172);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 223:11: -> THISLITERAL
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(THISLITERAL, "THISLITERAL"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:224:4: fieldReferenceExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_fieldReferenceExpression_in_primaryExpression1628);
                    fieldReferenceExpression173=fieldReferenceExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldReferenceExpression173.getTree());

                    }
                    break;
                case 3 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:225:4: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primaryExpression1633);
                    literal174=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal174.getTree());

                    }
                    break;
                case 4 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:226:4: '(' ( LT )* expression ( LT )* ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal175=(Token)match(input,71,FOLLOW_71_in_primaryExpression1638); if (state.failed) return retval;
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:226:11: ( LT )*
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==LT) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    {
                    	    LT176=(Token)match(input,LT,FOLLOW_LT_in_primaryExpression1641); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop108;
                        }
                    } while (true);

                    pushFollow(FOLLOW_expression_in_primaryExpression1645);
                    expression177=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression177.getTree());
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:226:27: ( LT )*
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==LT) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    {
                    	    LT178=(Token)match(input,LT,FOLLOW_LT_in_primaryExpression1647); if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    break loop109;
                        }
                    } while (true);

                    char_literal179=(Token)match(input,73,FOLLOW_73_in_primaryExpression1651); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, primaryExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primaryExpression"

    public static class fieldReferenceExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldReferenceExpression"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:229:1: fieldReferenceExpression : ( functionCallExpression | variableExpression );
    public final GScriptParser.fieldReferenceExpression_return fieldReferenceExpression() throws RecognitionException {
        GScriptParser.fieldReferenceExpression_return retval = new GScriptParser.fieldReferenceExpression_return();
        retval.start = input.LT(1);
        int fieldReferenceExpression_StartIndex = input.index();
        Object root_0 = null;

        GScriptParser.functionCallExpression_return functionCallExpression180 = null;

        GScriptParser.variableExpression_return variableExpression181 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:230:2: ( functionCallExpression | variableExpression )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==Identifier) ) {
                int LA111_1 = input.LA(2);

                if ( (synpred129_GScript()) ) {
                    alt111=1;
                }
                else if ( (true) ) {
                    alt111=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 111, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:230:4: functionCallExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionCallExpression_in_fieldReferenceExpression1663);
                    functionCallExpression180=functionCallExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, functionCallExpression180.getTree());

                    }
                    break;
                case 2 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:230:29: variableExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_variableExpression_in_fieldReferenceExpression1667);
                    variableExpression181=variableExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableExpression181.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, fieldReferenceExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "fieldReferenceExpression"

    public static class functionCallExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionCallExpression"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:233:1: functionCallExpression : Identifier ( LT )* arguments ( LT )* ( '\\.' fieldReferenceExpression )? -> ^( FUNCTIONCALLEXPRESSION Identifier ( arguments )? ( fieldReferenceExpression )? ) ;
    public final GScriptParser.functionCallExpression_return functionCallExpression() throws RecognitionException {
        GScriptParser.functionCallExpression_return retval = new GScriptParser.functionCallExpression_return();
        retval.start = input.LT(1);
        int functionCallExpression_StartIndex = input.index();
        Object root_0 = null;

        Token Identifier182=null;
        Token LT183=null;
        Token LT185=null;
        Token char_literal186=null;
        GScriptParser.arguments_return arguments184 = null;

        GScriptParser.fieldReferenceExpression_return fieldReferenceExpression187 = null;


        Object Identifier182_tree=null;
        Object LT183_tree=null;
        Object LT185_tree=null;
        Object char_literal186_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_fieldReferenceExpression=new RewriteRuleSubtreeStream(adaptor,"rule fieldReferenceExpression");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:234:2: ( Identifier ( LT )* arguments ( LT )* ( '\\.' fieldReferenceExpression )? -> ^( FUNCTIONCALLEXPRESSION Identifier ( arguments )? ( fieldReferenceExpression )? ) )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:234:4: Identifier ( LT )* arguments ( LT )* ( '\\.' fieldReferenceExpression )?
            {
            Identifier182=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionCallExpression1677); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier182);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:234:15: ( LT )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==LT) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT183=(Token)match(input,LT,FOLLOW_LT_in_functionCallExpression1679); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT183);


            	    }
            	    break;

            	default :
            	    break loop112;
                }
            } while (true);

            pushFollow(FOLLOW_arguments_in_functionCallExpression1682);
            arguments184=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_arguments.add(arguments184.getTree());
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:234:29: ( LT )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==LT) ) {
                    int LA113_2 = input.LA(2);

                    if ( (synpred131_GScript()) ) {
                        alt113=1;
                    }


                }


                switch (alt113) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT185=(Token)match(input,LT,FOLLOW_LT_in_functionCallExpression1684); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT185);


            	    }
            	    break;

            	default :
            	    break loop113;
                }
            } while (true);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:234:34: ( '\\.' fieldReferenceExpression )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==112) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:234:36: '\\.' fieldReferenceExpression
                    {
                    char_literal186=(Token)match(input,112,FOLLOW_112_in_functionCallExpression1690); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_112.add(char_literal186);

                    pushFollow(FOLLOW_fieldReferenceExpression_in_functionCallExpression1692);
                    fieldReferenceExpression187=fieldReferenceExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fieldReferenceExpression.add(fieldReferenceExpression187.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: fieldReferenceExpression, Identifier, arguments
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 235:2: -> ^( FUNCTIONCALLEXPRESSION Identifier ( arguments )? ( fieldReferenceExpression )? )
            {
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:235:5: ^( FUNCTIONCALLEXPRESSION Identifier ( arguments )? ( fieldReferenceExpression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTIONCALLEXPRESSION, "FUNCTIONCALLEXPRESSION"), root_1);

                adaptor.addChild(root_1, stream_Identifier.nextNode());
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:235:41: ( arguments )?
                if ( stream_arguments.hasNext() ) {
                    adaptor.addChild(root_1, stream_arguments.nextTree());

                }
                stream_arguments.reset();
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:235:52: ( fieldReferenceExpression )?
                if ( stream_fieldReferenceExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_fieldReferenceExpression.nextTree());

                }
                stream_fieldReferenceExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, functionCallExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "functionCallExpression"

    public static class variableExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableExpression"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:238:1: variableExpression : Identifier ( LT )* ( '\\.' fieldReferenceExpression )? -> ^( VARIABLEEXPRESSION Identifier ( fieldReferenceExpression )? ) ;
    public final GScriptParser.variableExpression_return variableExpression() throws RecognitionException {
        GScriptParser.variableExpression_return retval = new GScriptParser.variableExpression_return();
        retval.start = input.LT(1);
        int variableExpression_StartIndex = input.index();
        Object root_0 = null;

        Token Identifier188=null;
        Token LT189=null;
        Token char_literal190=null;
        GScriptParser.fieldReferenceExpression_return fieldReferenceExpression191 = null;


        Object Identifier188_tree=null;
        Object LT189_tree=null;
        Object char_literal190_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_fieldReferenceExpression=new RewriteRuleSubtreeStream(adaptor,"rule fieldReferenceExpression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:239:2: ( Identifier ( LT )* ( '\\.' fieldReferenceExpression )? -> ^( VARIABLEEXPRESSION Identifier ( fieldReferenceExpression )? ) )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:239:4: Identifier ( LT )* ( '\\.' fieldReferenceExpression )?
            {
            Identifier188=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableExpression1722); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(Identifier188);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:239:15: ( LT )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==LT) ) {
                    int LA115_2 = input.LA(2);

                    if ( (synpred133_GScript()) ) {
                        alt115=1;
                    }


                }


                switch (alt115) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT189=(Token)match(input,LT,FOLLOW_LT_in_variableExpression1724); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT189);


            	    }
            	    break;

            	default :
            	    break loop115;
                }
            } while (true);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:239:19: ( '\\.' fieldReferenceExpression )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==112) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:239:21: '\\.' fieldReferenceExpression
                    {
                    char_literal190=(Token)match(input,112,FOLLOW_112_in_variableExpression1729); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_112.add(char_literal190);

                    pushFollow(FOLLOW_fieldReferenceExpression_in_variableExpression1731);
                    fieldReferenceExpression191=fieldReferenceExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fieldReferenceExpression.add(fieldReferenceExpression191.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: Identifier, fieldReferenceExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 240:2: -> ^( VARIABLEEXPRESSION Identifier ( fieldReferenceExpression )? )
            {
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:240:5: ^( VARIABLEEXPRESSION Identifier ( fieldReferenceExpression )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLEEXPRESSION, "VARIABLEEXPRESSION"), root_1);

                adaptor.addChild(root_1, stream_Identifier.nextNode());
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:240:37: ( fieldReferenceExpression )?
                if ( stream_fieldReferenceExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_fieldReferenceExpression.nextTree());

                }
                stream_fieldReferenceExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, variableExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableExpression"

    public static class arguments_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:246:1: arguments : '(' ( LT )* ( expression ( LT )* ( ',' expression ( LT )* )* )? ')' -> ^( ARGUMENTS ( expression )* ) ;
    public final GScriptParser.arguments_return arguments() throws RecognitionException {
        GScriptParser.arguments_return retval = new GScriptParser.arguments_return();
        retval.start = input.LT(1);
        int arguments_StartIndex = input.index();
        Object root_0 = null;

        Token char_literal192=null;
        Token LT193=null;
        Token LT195=null;
        Token char_literal196=null;
        Token LT198=null;
        Token char_literal199=null;
        GScriptParser.expression_return expression194 = null;

        GScriptParser.expression_return expression197 = null;


        Object char_literal192_tree=null;
        Object LT193_tree=null;
        Object LT195_tree=null;
        Object char_literal196_tree=null;
        Object LT198_tree=null;
        Object char_literal199_tree=null;
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:247:2: ( '(' ( LT )* ( expression ( LT )* ( ',' expression ( LT )* )* )? ')' -> ^( ARGUMENTS ( expression )* ) )
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:247:4: '(' ( LT )* ( expression ( LT )* ( ',' expression ( LT )* )* )? ')'
            {
            char_literal192=(Token)match(input,71,FOLLOW_71_in_arguments1763); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_71.add(char_literal192);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:247:8: ( LT )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==LT) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
            	    {
            	    LT193=(Token)match(input,LT,FOLLOW_LT_in_arguments1765); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LT.add(LT193);


            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);

            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:247:12: ( expression ( LT )* ( ',' expression ( LT )* )* )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( ((LA121_0>=Identifier && LA121_0<=NumericLiteral)||(LA121_0>=70 && LA121_0<=71)||LA121_0==90||LA121_0==103||(LA121_0>=107 && LA121_0<=108)||LA121_0==111||(LA121_0>=113 && LA121_0<=115)) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:247:13: expression ( LT )* ( ',' expression ( LT )* )*
                    {
                    pushFollow(FOLLOW_expression_in_arguments1769);
                    expression194=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression194.getTree());
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:247:24: ( LT )*
                    loop118:
                    do {
                        int alt118=2;
                        int LA118_0 = input.LA(1);

                        if ( (LA118_0==LT) ) {
                            alt118=1;
                        }


                        switch (alt118) {
                    	case 1 :
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    {
                    	    LT195=(Token)match(input,LT,FOLLOW_LT_in_arguments1771); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LT.add(LT195);


                    	    }
                    	    break;

                    	default :
                    	    break loop118;
                        }
                    } while (true);

                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:247:27: ( ',' expression ( LT )* )*
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==72) ) {
                            alt120=1;
                        }


                        switch (alt120) {
                    	case 1 :
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:247:28: ',' expression ( LT )*
                    	    {
                    	    char_literal196=(Token)match(input,72,FOLLOW_72_in_arguments1774); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_72.add(char_literal196);

                    	    pushFollow(FOLLOW_expression_in_arguments1776);
                    	    expression197=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression197.getTree());
                    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:247:43: ( LT )*
                    	    loop119:
                    	    do {
                    	        int alt119=2;
                    	        int LA119_0 = input.LA(1);

                    	        if ( (LA119_0==LT) ) {
                    	            alt119=1;
                    	        }


                    	        switch (alt119) {
                    	    	case 1 :
                    	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
                    	    	    {
                    	    	    LT198=(Token)match(input,LT,FOLLOW_LT_in_arguments1778); if (state.failed) return retval; 
                    	    	    if ( state.backtracking==0 ) stream_LT.add(LT198);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop119;
                    	        }
                    	    } while (true);


                    	    }
                    	    break;

                    	default :
                    	    break loop120;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal199=(Token)match(input,73,FOLLOW_73_in_arguments1785); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_73.add(char_literal199);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 248:2: -> ^( ARGUMENTS ( expression )* )
            {
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:248:5: ^( ARGUMENTS ( expression )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARGUMENTS, "ARGUMENTS"), root_1);

                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:248:17: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, arguments_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arguments"

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:251:1: literal : ( 'undefined' -> ^( UNDEFINEDLITERAL ) | 'true' -> ^( BOOLEANLITERAL 'true' ) | 'false' -> ^( BOOLEANLITERAL 'false' ) | StringLiteral -> ^( STRINGLITERAL StringLiteral ) | NumericLiteral -> ^( NUMBERLITERAL NumericLiteral ) );
    public final GScriptParser.literal_return literal() throws RecognitionException {
        GScriptParser.literal_return retval = new GScriptParser.literal_return();
        retval.start = input.LT(1);
        int literal_StartIndex = input.index();
        Object root_0 = null;

        Token string_literal200=null;
        Token string_literal201=null;
        Token string_literal202=null;
        Token StringLiteral203=null;
        Token NumericLiteral204=null;

        Object string_literal200_tree=null;
        Object string_literal201_tree=null;
        Object string_literal202_tree=null;
        Object StringLiteral203_tree=null;
        Object NumericLiteral204_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_NumericLiteral=new RewriteRuleTokenStream(adaptor,"token NumericLiteral");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:252:2: ( 'undefined' -> ^( UNDEFINEDLITERAL ) | 'true' -> ^( BOOLEANLITERAL 'true' ) | 'false' -> ^( BOOLEANLITERAL 'false' ) | StringLiteral -> ^( STRINGLITERAL StringLiteral ) | NumericLiteral -> ^( NUMBERLITERAL NumericLiteral ) )
            int alt122=5;
            switch ( input.LA(1) ) {
            case 113:
                {
                alt122=1;
                }
                break;
            case 114:
                {
                alt122=2;
                }
                break;
            case 115:
                {
                alt122=3;
                }
                break;
            case StringLiteral:
                {
                alt122=4;
                }
                break;
            case NumericLiteral:
                {
                alt122=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:252:4: 'undefined'
                    {
                    string_literal200=(Token)match(input,113,FOLLOW_113_in_literal1806); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_113.add(string_literal200);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 252:16: -> ^( UNDEFINEDLITERAL )
                    {
                        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:252:19: ^( UNDEFINEDLITERAL )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNDEFINEDLITERAL, "UNDEFINEDLITERAL"), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:253:4: 'true'
                    {
                    string_literal201=(Token)match(input,114,FOLLOW_114_in_literal1817); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_114.add(string_literal201);



                    // AST REWRITE
                    // elements: 114
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 253:11: -> ^( BOOLEANLITERAL 'true' )
                    {
                        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:253:14: ^( BOOLEANLITERAL 'true' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BOOLEANLITERAL, "BOOLEANLITERAL"), root_1);

                        adaptor.addChild(root_1, stream_114.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:254:4: 'false'
                    {
                    string_literal202=(Token)match(input,115,FOLLOW_115_in_literal1830); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_115.add(string_literal202);



                    // AST REWRITE
                    // elements: 115
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 254:12: -> ^( BOOLEANLITERAL 'false' )
                    {
                        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:254:15: ^( BOOLEANLITERAL 'false' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BOOLEANLITERAL, "BOOLEANLITERAL"), root_1);

                        adaptor.addChild(root_1, stream_115.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:255:4: StringLiteral
                    {
                    StringLiteral203=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_literal1843); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral203);



                    // AST REWRITE
                    // elements: StringLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 255:18: -> ^( STRINGLITERAL StringLiteral )
                    {
                        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:255:21: ^( STRINGLITERAL StringLiteral )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(STRINGLITERAL, "STRINGLITERAL"), root_1);

                        adaptor.addChild(root_1, stream_StringLiteral.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:256:4: NumericLiteral
                    {
                    NumericLiteral204=(Token)match(input,NumericLiteral,FOLLOW_NumericLiteral_in_literal1856); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NumericLiteral.add(NumericLiteral204);



                    // AST REWRITE
                    // elements: NumericLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 256:19: -> ^( NUMBERLITERAL NumericLiteral )
                    {
                        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:256:22: ^( NUMBERLITERAL NumericLiteral )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NUMBERLITERAL, "NUMBERLITERAL"), root_1);

                        adaptor.addChild(root_1, stream_NumericLiteral.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, literal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literal"

    // $ANTLR start synpred5_GScript
    public final void synpred5_GScript_fragment() throws RecognitionException {   
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:64:15: ( LT )
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:64:15: LT
        {
        match(input,LT,FOLLOW_LT_in_synpred5_GScript255); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_GScript

    // $ANTLR start synpred15_GScript
    public final void synpred15_GScript_fragment() throws RecognitionException {   
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:74:8: ( LT )
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:74:8: LT
        {
        match(input,LT,FOLLOW_LT_in_synpred15_GScript344); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_GScript

    // $ANTLR start synpred27_GScript
    public final void synpred27_GScript_fragment() throws RecognitionException {   
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:93:8: ( LT )
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:93:8: LT
        {
        match(input,LT,FOLLOW_LT_in_synpred27_GScript434); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_GScript

    // $ANTLR start synpred44_GScript
    public final void synpred44_GScript_fragment() throws RecognitionException {   
        GScriptParser.statement_return e = null;


        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:117:57: ( ( LT )* 'else' ( LT )* e= statement )
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:117:57: ( LT )* 'else' ( LT )* e= statement
        {
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:117:57: ( LT )*
        loop131:
        do {
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==LT) ) {
                alt131=1;
            }


            switch (alt131) {
        	case 1 :
        	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
        	    {
        	    match(input,LT,FOLLOW_LT_in_synpred44_GScript601); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop131;
            }
        } while (true);

        match(input,80,FOLLOW_80_in_synpred44_GScript604); if (state.failed) return ;
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:117:68: ( LT )*
        loop132:
        do {
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==LT) ) {
                alt132=1;
            }


            switch (alt132) {
        	case 1 :
        	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
        	    {
        	    match(input,LT,FOLLOW_LT_in_synpred44_GScript606); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop132;
            }
        } while (true);

        pushFollow(FOLLOW_statement_in_synpred44_GScript611);
        e=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_GScript

    // $ANTLR start synpred52_GScript
    public final void synpred52_GScript_fragment() throws RecognitionException {   
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:132:19: ( ( LT )* statement )
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:132:19: ( LT )* statement
        {
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:132:19: ( LT )*
        loop133:
        do {
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==LT) ) {
                alt133=1;
            }


            switch (alt133) {
        	case 1 :
        	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
        	    {
        	    match(input,LT,FOLLOW_LT_in_synpred52_GScript710); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop133;
            }
        } while (true);

        pushFollow(FOLLOW_statement_in_synpred52_GScript713);
        statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_GScript

    // $ANTLR start synpred68_GScript
    public final void synpred68_GScript_fragment() throws RecognitionException {   
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:157:4: ( conditionalExpression )
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:157:4: conditionalExpression
        {
        pushFollow(FOLLOW_conditionalExpression_in_synpred68_GScript912);
        conditionalExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_GScript

    // $ANTLR start synpred69_GScript
    public final void synpred69_GScript_fragment() throws RecognitionException {   
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:157:28: ( assignmentExpression )
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:157:28: assignmentExpression
        {
        pushFollow(FOLLOW_assignmentExpression_in_synpred69_GScript916);
        assignmentExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_GScript

    // $ANTLR start synpred71_GScript
    public final void synpred71_GScript_fragment() throws RecognitionException {   
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:157:72: ( functionCallExpression )
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:157:72: functionCallExpression
        {
        pushFollow(FOLLOW_functionCallExpression_in_synpred71_GScript924);
        functionCallExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred71_GScript

    // $ANTLR start synpred76_GScript
    public final void synpred76_GScript_fragment() throws RecognitionException {   
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:51: ( ( LT )* '?' ( LT )* expression ( LT )* ':' ( LT )* expression )
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:51: ( LT )* '?' ( LT )* expression ( LT )* ':' ( LT )* expression
        {
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:51: ( LT )*
        loop136:
        do {
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==LT) ) {
                alt136=1;
            }


            switch (alt136) {
        	case 1 :
        	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
        	    {
        	    match(input,LT,FOLLOW_LT_in_synpred76_GScript979); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop136;
            }
        } while (true);

        match(input,88,FOLLOW_88_in_synpred76_GScript982); if (state.failed) return ;
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:59: ( LT )*
        loop137:
        do {
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==LT) ) {
                alt137=1;
            }


            switch (alt137) {
        	case 1 :
        	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
        	    {
        	    match(input,LT,FOLLOW_LT_in_synpred76_GScript984); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop137;
            }
        } while (true);

        pushFollow(FOLLOW_expression_in_synpred76_GScript987);
        expression();

        state._fsp--;
        if (state.failed) return ;
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:74: ( LT )*
        loop138:
        do {
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==LT) ) {
                alt138=1;
            }


            switch (alt138) {
        	case 1 :
        	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
        	    {
        	    match(input,LT,FOLLOW_LT_in_synpred76_GScript989); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop138;
            }
        } while (true);

        match(input,89,FOLLOW_89_in_synpred76_GScript992); if (state.failed) return ;
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:82: ( LT )*
        loop139:
        do {
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==LT) ) {
                alt139=1;
            }


            switch (alt139) {
        	case 1 :
        	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
        	    {
        	    match(input,LT,FOLLOW_LT_in_synpred76_GScript994); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop139;
            }
        } while (true);

        pushFollow(FOLLOW_expression_in_synpred76_GScript997);
        expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred76_GScript

    // $ANTLR start synpred77_GScript
    public final void synpred77_GScript_fragment() throws RecognitionException {   
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:50: ( ( ( LT )* '?' ( LT )* expression ( LT )* ':' ( LT )* expression )+ )
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:50: ( ( LT )* '?' ( LT )* expression ( LT )* ':' ( LT )* expression )+
        {
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:50: ( ( LT )* '?' ( LT )* expression ( LT )* ':' ( LT )* expression )+
        int cnt144=0;
        loop144:
        do {
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==LT||LA144_0==88) ) {
                alt144=1;
            }


            switch (alt144) {
        	case 1 :
        	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:51: ( LT )* '?' ( LT )* expression ( LT )* ':' ( LT )* expression
        	    {
        	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:51: ( LT )*
        	    loop140:
        	    do {
        	        int alt140=2;
        	        int LA140_0 = input.LA(1);

        	        if ( (LA140_0==LT) ) {
        	            alt140=1;
        	        }


        	        switch (alt140) {
        	    	case 1 :
        	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
        	    	    {
        	    	    match(input,LT,FOLLOW_LT_in_synpred77_GScript979); if (state.failed) return ;

        	    	    }
        	    	    break;

        	    	default :
        	    	    break loop140;
        	        }
        	    } while (true);

        	    match(input,88,FOLLOW_88_in_synpred77_GScript982); if (state.failed) return ;
        	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:59: ( LT )*
        	    loop141:
        	    do {
        	        int alt141=2;
        	        int LA141_0 = input.LA(1);

        	        if ( (LA141_0==LT) ) {
        	            alt141=1;
        	        }


        	        switch (alt141) {
        	    	case 1 :
        	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
        	    	    {
        	    	    match(input,LT,FOLLOW_LT_in_synpred77_GScript984); if (state.failed) return ;

        	    	    }
        	    	    break;

        	    	default :
        	    	    break loop141;
        	        }
        	    } while (true);

        	    pushFollow(FOLLOW_expression_in_synpred77_GScript987);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:74: ( LT )*
        	    loop142:
        	    do {
        	        int alt142=2;
        	        int LA142_0 = input.LA(1);

        	        if ( (LA142_0==LT) ) {
        	            alt142=1;
        	        }


        	        switch (alt142) {
        	    	case 1 :
        	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
        	    	    {
        	    	    match(input,LT,FOLLOW_LT_in_synpred77_GScript989); if (state.failed) return ;

        	    	    }
        	    	    break;

        	    	default :
        	    	    break loop142;
        	        }
        	    } while (true);

        	    match(input,89,FOLLOW_89_in_synpred77_GScript992); if (state.failed) return ;
        	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:166:82: ( LT )*
        	    loop143:
        	    do {
        	        int alt143=2;
        	        int LA143_0 = input.LA(1);

        	        if ( (LA143_0==LT) ) {
        	            alt143=1;
        	        }


        	        switch (alt143) {
        	    	case 1 :
        	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
        	    	    {
        	    	    match(input,LT,FOLLOW_LT_in_synpred77_GScript994); if (state.failed) return ;

        	    	    }
        	    	    break;

        	    	default :
        	    	    break loop143;
        	        }
        	    } while (true);

        	    pushFollow(FOLLOW_expression_in_synpred77_GScript997);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt144 >= 1 ) break loop144;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(144, input);
                    throw eee;
            }
            cnt144++;
        } while (true);


        }
    }
    // $ANTLR end synpred77_GScript

    // $ANTLR start synpred112_GScript
    public final void synpred112_GScript_fragment() throws RecognitionException {   
        Token op=null;

        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:204:55: ( ( ( LT )* (op= '+' | op= '-' ) ( LT )* additiveExpression ) )
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:204:55: ( ( LT )* (op= '+' | op= '-' ) ( LT )* additiveExpression )
        {
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:204:55: ( ( LT )* (op= '+' | op= '-' ) ( LT )* additiveExpression )
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:204:56: ( LT )* (op= '+' | op= '-' ) ( LT )* additiveExpression
        {
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:204:56: ( LT )*
        loop176:
        do {
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( (LA176_0==LT) ) {
                alt176=1;
            }


            switch (alt176) {
        	case 1 :
        	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
        	    {
        	    match(input,LT,FOLLOW_LT_in_synpred112_GScript1415); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop176;
            }
        } while (true);

        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:204:61: (op= '+' | op= '-' )
        int alt177=2;
        int LA177_0 = input.LA(1);

        if ( (LA177_0==102) ) {
            alt177=1;
        }
        else if ( (LA177_0==103) ) {
            alt177=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 177, 0, input);

            throw nvae;
        }
        switch (alt177) {
            case 1 :
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:204:62: op= '+'
                {
                op=(Token)match(input,102,FOLLOW_102_in_synpred112_GScript1422); if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:204:71: op= '-'
                {
                op=(Token)match(input,103,FOLLOW_103_in_synpred112_GScript1428); if (state.failed) return ;

                }
                break;

        }

        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:204:79: ( LT )*
        loop178:
        do {
            int alt178=2;
            int LA178_0 = input.LA(1);

            if ( (LA178_0==LT) ) {
                alt178=1;
            }


            switch (alt178) {
        	case 1 :
        	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
        	    {
        	    match(input,LT,FOLLOW_LT_in_synpred112_GScript1431); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop178;
            }
        } while (true);

        pushFollow(FOLLOW_additiveExpression_in_synpred112_GScript1434);
        additiveExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred112_GScript

    // $ANTLR start synpred117_GScript
    public final void synpred117_GScript_fragment() throws RecognitionException {   
        Token op=null;

        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:47: ( ( LT )* (op= '*' | op= '/' | op= '%' ) ( LT )* multiplicativeExpression )
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:47: ( LT )* (op= '*' | op= '/' | op= '%' ) ( LT )* multiplicativeExpression
        {
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:47: ( LT )*
        loop179:
        do {
            int alt179=2;
            int LA179_0 = input.LA(1);

            if ( (LA179_0==LT) ) {
                alt179=1;
            }


            switch (alt179) {
        	case 1 :
        	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
        	    {
        	    match(input,LT,FOLLOW_LT_in_synpred117_GScript1473); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop179;
            }
        } while (true);

        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:52: (op= '*' | op= '/' | op= '%' )
        int alt180=3;
        switch ( input.LA(1) ) {
        case 104:
            {
            alt180=1;
            }
            break;
        case 105:
            {
            alt180=2;
            }
            break;
        case 106:
            {
            alt180=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 180, 0, input);

            throw nvae;
        }

        switch (alt180) {
            case 1 :
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:53: op= '*'
                {
                op=(Token)match(input,104,FOLLOW_104_in_synpred117_GScript1480); if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:62: op= '/'
                {
                op=(Token)match(input,105,FOLLOW_105_in_synpred117_GScript1486); if (state.failed) return ;

                }
                break;
            case 3 :
                // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:71: op= '%'
                {
                op=(Token)match(input,106,FOLLOW_106_in_synpred117_GScript1492); if (state.failed) return ;

                }
                break;

        }

        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:79: ( LT )*
        loop181:
        do {
            int alt181=2;
            int LA181_0 = input.LA(1);

            if ( (LA181_0==LT) ) {
                alt181=1;
            }


            switch (alt181) {
        	case 1 :
        	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
        	    {
        	    match(input,LT,FOLLOW_LT_in_synpred117_GScript1495); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop181;
            }
        } while (true);

        pushFollow(FOLLOW_multiplicativeExpression_in_synpred117_GScript1498);
        multiplicativeExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred117_GScript

    // $ANTLR start synpred118_GScript
    public final void synpred118_GScript_fragment() throws RecognitionException {   
        Token op=null;

        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:46: ( ( ( LT )* (op= '*' | op= '/' | op= '%' ) ( LT )* multiplicativeExpression )+ )
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:46: ( ( LT )* (op= '*' | op= '/' | op= '%' ) ( LT )* multiplicativeExpression )+
        {
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:46: ( ( LT )* (op= '*' | op= '/' | op= '%' ) ( LT )* multiplicativeExpression )+
        int cnt185=0;
        loop185:
        do {
            int alt185=2;
            int LA185_0 = input.LA(1);

            if ( (LA185_0==LT||(LA185_0>=104 && LA185_0<=106)) ) {
                alt185=1;
            }


            switch (alt185) {
        	case 1 :
        	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:47: ( LT )* (op= '*' | op= '/' | op= '%' ) ( LT )* multiplicativeExpression
        	    {
        	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:47: ( LT )*
        	    loop182:
        	    do {
        	        int alt182=2;
        	        int LA182_0 = input.LA(1);

        	        if ( (LA182_0==LT) ) {
        	            alt182=1;
        	        }


        	        switch (alt182) {
        	    	case 1 :
        	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
        	    	    {
        	    	    match(input,LT,FOLLOW_LT_in_synpred118_GScript1473); if (state.failed) return ;

        	    	    }
        	    	    break;

        	    	default :
        	    	    break loop182;
        	        }
        	    } while (true);

        	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:52: (op= '*' | op= '/' | op= '%' )
        	    int alt183=3;
        	    switch ( input.LA(1) ) {
        	    case 104:
        	        {
        	        alt183=1;
        	        }
        	        break;
        	    case 105:
        	        {
        	        alt183=2;
        	        }
        	        break;
        	    case 106:
        	        {
        	        alt183=3;
        	        }
        	        break;
        	    default:
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        NoViableAltException nvae =
        	            new NoViableAltException("", 183, 0, input);

        	        throw nvae;
        	    }

        	    switch (alt183) {
        	        case 1 :
        	            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:53: op= '*'
        	            {
        	            op=(Token)match(input,104,FOLLOW_104_in_synpred118_GScript1480); if (state.failed) return ;

        	            }
        	            break;
        	        case 2 :
        	            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:62: op= '/'
        	            {
        	            op=(Token)match(input,105,FOLLOW_105_in_synpred118_GScript1486); if (state.failed) return ;

        	            }
        	            break;
        	        case 3 :
        	            // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:71: op= '%'
        	            {
        	            op=(Token)match(input,106,FOLLOW_106_in_synpred118_GScript1492); if (state.failed) return ;

        	            }
        	            break;

        	    }

        	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:208:79: ( LT )*
        	    loop184:
        	    do {
        	        int alt184=2;
        	        int LA184_0 = input.LA(1);

        	        if ( (LA184_0==LT) ) {
        	            alt184=1;
        	        }


        	        switch (alt184) {
        	    	case 1 :
        	    	    // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:0:0: LT
        	    	    {
        	    	    match(input,LT,FOLLOW_LT_in_synpred118_GScript1495); if (state.failed) return ;

        	    	    }
        	    	    break;

        	    	default :
        	    	    break loop184;
        	        }
        	    } while (true);

        	    pushFollow(FOLLOW_multiplicativeExpression_in_synpred118_GScript1498);
        	    multiplicativeExpression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt185 >= 1 ) break loop185;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(185, input);
                    throw eee;
            }
            cnt185++;
        } while (true);


        }
    }
    // $ANTLR end synpred118_GScript

    // $ANTLR start synpred119_GScript
    public final void synpred119_GScript_fragment() throws RecognitionException {   
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:212:4: ( postfixExpression )
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:212:4: postfixExpression
        {
        pushFollow(FOLLOW_postfixExpression_in_synpred119_GScript1526);
        postfixExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred119_GScript

    // $ANTLR start synpred129_GScript
    public final void synpred129_GScript_fragment() throws RecognitionException {   
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:230:4: ( functionCallExpression )
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:230:4: functionCallExpression
        {
        pushFollow(FOLLOW_functionCallExpression_in_synpred129_GScript1663);
        functionCallExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred129_GScript

    // $ANTLR start synpred131_GScript
    public final void synpred131_GScript_fragment() throws RecognitionException {   
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:234:29: ( LT )
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:234:29: LT
        {
        match(input,LT,FOLLOW_LT_in_synpred131_GScript1684); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred131_GScript

    // $ANTLR start synpred133_GScript
    public final void synpred133_GScript_fragment() throws RecognitionException {   
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:239:15: ( LT )
        // /Users/geertvos/Documents/workspace/GVM/src/nl/gvm/compiler/parser/GScript.g:239:15: LT
        {
        match(input,LT,FOLLOW_LT_in_synpred133_GScript1724); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred133_GScript

    // Delegated rules

    public final boolean synpred129_GScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred129_GScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred77_GScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred77_GScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred118_GScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred118_GScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_GScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_GScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred119_GScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred119_GScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_GScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_GScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred117_GScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred117_GScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_GScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_GScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_GScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_GScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_GScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_GScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_GScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_GScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred76_GScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred76_GScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred112_GScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred112_GScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred133_GScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred133_GScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_GScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_GScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred131_GScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred131_GScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_GScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_GScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA74 dfa74 = new DFA74(this);
    protected DFA79 dfa79 = new DFA79(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA83 dfa83 = new DFA83(this);
    protected DFA82 dfa82 = new DFA82(this);
    protected DFA87 dfa87 = new DFA87(this);
    protected DFA86 dfa86 = new DFA86(this);
    protected DFA91 dfa91 = new DFA91(this);
    protected DFA95 dfa95 = new DFA95(this);
    protected DFA99 dfa99 = new DFA99(this);
    protected DFA106 dfa106 = new DFA106(this);
    static final String DFA4_eotS =
        "\4\uffff";
    static final String DFA4_eofS =
        "\2\2\2\uffff";
    static final String DFA4_minS =
        "\2\53\2\uffff";
    static final String DFA4_maxS =
        "\2\163\2\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA4_specialS =
        "\4\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\3\3\27\uffff\2\3\2\uffff\1\3\1\2\1\3\1\uffff\2\3\1\uffff"+
            "\6\3\3\uffff\1\3\14\uffff\1\3\3\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\3\3",
            "\1\1\3\3\27\uffff\2\3\2\uffff\1\3\1\2\1\3\1\uffff\2\3\1\uffff"+
            "\6\3\3\uffff\1\3\14\uffff\1\3\3\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\3\3",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "()* loopback of 60:14: ( ( LT )* statement )*";
        }
    }
    static final String DFA13_eotS =
        "\4\uffff";
    static final String DFA13_eofS =
        "\4\uffff";
    static final String DFA13_minS =
        "\2\53\2\uffff";
    static final String DFA13_maxS =
        "\2\111\2\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA13_specialS =
        "\4\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\1\2\34\uffff\1\3",
            "\1\1\1\2\34\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "69:8: ( ( LT )* Identifier ( ( LT )* ',' ( LT )* Identifier )* )?";
        }
    }
    static final String DFA12_eotS =
        "\4\uffff";
    static final String DFA12_eofS =
        "\4\uffff";
    static final String DFA12_minS =
        "\2\53\2\uffff";
    static final String DFA12_maxS =
        "\2\111\2\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA12_specialS =
        "\4\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\34\uffff\1\3\1\2",
            "\1\1\34\uffff\1\3\1\2",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "()* loopback of 69:24: ( ( LT )* ',' ( LT )* Identifier )*";
        }
    }
    static final String DFA29_eotS =
        "\4\uffff";
    static final String DFA29_eofS =
        "\1\2\3\uffff";
    static final String DFA29_minS =
        "\2\53\2\uffff";
    static final String DFA29_maxS =
        "\2\163\2\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA29_specialS =
        "\4\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\1\3\3\27\uffff\2\3\2\uffff\1\3\1\2\1\3\1\uffff\2\3\1\uffff"+
            "\6\3\3\uffff\1\3\14\uffff\1\3\3\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\3\3",
            "\1\1\3\3\27\uffff\2\3\2\uffff\1\3\1\2\1\3\1\uffff\2\3\1\uffff"+
            "\6\3\3\uffff\1\3\14\uffff\1\3\3\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\3\3",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "()* loopback of 104:14: ( ( LT )* statement )*";
        }
    }
    static final String DFA44_eotS =
        "\32\uffff";
    static final String DFA44_eofS =
        "\32\uffff";
    static final String DFA44_minS =
        "\1\53\1\0\2\uffff\1\0\25\uffff";
    static final String DFA44_maxS =
        "\1\163\1\0\2\uffff\1\0\25\uffff";
    static final String DFA44_acceptS =
        "\2\uffff\1\1\26\uffff\1\2";
    static final String DFA44_specialS =
        "\1\uffff\1\0\2\uffff\1\1\25\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\1\3\2\27\uffff\2\2\2\uffff\1\2\1\uffff\1\2\1\uffff\1\4\1"+
            "\2\1\uffff\6\2\3\uffff\1\2\14\uffff\1\2\3\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\3\2",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "132:18: ( ( LT )* statement )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_1 = input.LA(1);

                         
                        int index44_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_GScript()) ) {s = 2;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index44_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA44_4 = input.LA(1);

                         
                        int index44_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_GScript()) ) {s = 2;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index44_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA47_eotS =
        "\4\uffff";
    static final String DFA47_eofS =
        "\4\uffff";
    static final String DFA47_minS =
        "\2\53\2\uffff";
    static final String DFA47_maxS =
        "\2\163\2\uffff";
    static final String DFA47_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA47_specialS =
        "\4\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\1\3\2\27\uffff\2\2\6\uffff\1\3\13\uffff\1\2\14\uffff\1\2"+
            "\3\uffff\2\2\2\uffff\1\2\1\uffff\3\2",
            "\1\1\3\2\27\uffff\2\2\6\uffff\1\3\13\uffff\1\2\14\uffff\1\2"+
            "\3\uffff\2\2\2\uffff\1\2\1\uffff\3\2",
            "",
            ""
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "132:43: ( ( LT )* expression )?";
        }
    }
    static final String DFA50_eotS =
        "\4\uffff";
    static final String DFA50_eofS =
        "\4\uffff";
    static final String DFA50_minS =
        "\2\53\2\uffff";
    static final String DFA50_maxS =
        "\2\163\2\uffff";
    static final String DFA50_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA50_specialS =
        "\4\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\1\3\2\27\uffff\2\2\1\uffff\1\3\1\2\1\uffff\1\2\1\uffff\2"+
            "\2\1\uffff\6\2\3\uffff\1\2\14\uffff\1\2\3\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\3\2",
            "\1\1\3\2\27\uffff\2\2\1\uffff\1\3\1\2\1\uffff\1\2\1\uffff\2"+
            "\2\1\uffff\6\2\3\uffff\1\2\14\uffff\1\2\3\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\3\2",
            "",
            ""
    };

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "132:69: ( ( LT )* statement )?";
        }
    }
    static final String DFA60_eotS =
        "\20\uffff";
    static final String DFA60_eofS =
        "\20\uffff";
    static final String DFA60_minS =
        "\1\54\1\0\16\uffff";
    static final String DFA60_maxS =
        "\1\163\1\0\16\uffff";
    static final String DFA60_acceptS =
        "\2\uffff\1\1\11\uffff\1\3\1\5\1\2\1\4";
    static final String DFA60_specialS =
        "\1\uffff\1\0\16\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\1\2\2\27\uffff\1\14\1\2\22\uffff\1\15\14\uffff\1\2\3\uffff"+
            "\2\2\2\uffff\1\2\1\uffff\3\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "156:1: expression : ( conditionalExpression | assignmentExpression | functionExpression | functionCallExpression | newExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_1 = input.LA(1);

                         
                        int index60_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_GScript()) ) {s = 2;}

                        else if ( (synpred69_GScript()) ) {s = 14;}

                        else if ( (synpred71_GScript()) ) {s = 15;}

                         
                        input.seek(index60_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA71_eotS =
        "\5\uffff";
    static final String DFA71_eofS =
        "\2\3\2\uffff\1\3";
    static final String DFA71_minS =
        "\2\53\2\uffff\1\53";
    static final String DFA71_maxS =
        "\2\163\2\uffff\1\163";
    static final String DFA71_acceptS =
        "\2\uffff\1\1\1\2\1\uffff";
    static final String DFA71_specialS =
        "\5\uffff}>";
    static final String[] DFA71_transitionS = {
            "\1\1\3\3\27\uffff\21\3\1\uffff\3\3\1\2\13\uffff\1\3\3\uffff"+
            "\2\3\2\uffff\1\3\1\uffff\3\3",
            "\1\4\3\3\27\uffff\21\3\1\uffff\3\3\1\2\13\uffff\1\3\3\uffff"+
            "\2\3\2\uffff\1\3\1\uffff\3\3",
            "",
            "",
            "\1\4\3\3\27\uffff\21\3\1\uffff\3\3\1\2\13\uffff\1\3\3\uffff"+
            "\2\3\2\uffff\1\3\1\uffff\3\3"
    };

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "175:50: ( ( ( LT )* '||' ( LT )* logicalANDExpression )+ -> ^( OREXPRESSION ( logicalANDExpression )* ) )?";
        }
    }
    static final String DFA70_eotS =
        "\5\uffff";
    static final String DFA70_eofS =
        "\2\2\2\uffff\1\2";
    static final String DFA70_minS =
        "\2\53\2\uffff\1\53";
    static final String DFA70_maxS =
        "\2\163\2\uffff\1\163";
    static final String DFA70_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA70_specialS =
        "\5\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\1\3\2\27\uffff\21\2\1\uffff\3\2\1\3\13\uffff\1\2\3\uffff"+
            "\2\2\2\uffff\1\2\1\uffff\3\2",
            "\1\4\3\2\27\uffff\21\2\1\uffff\3\2\1\3\13\uffff\1\2\3\uffff"+
            "\2\2\2\uffff\1\2\1\uffff\3\2",
            "",
            "",
            "\1\4\3\2\27\uffff\21\2\1\uffff\3\2\1\3\13\uffff\1\2\3\uffff"+
            "\2\2\2\uffff\1\2\1\uffff\3\2"
    };

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "()+ loopback of 175:51: ( ( LT )* '||' ( LT )* logicalANDExpression )+";
        }
    }
    static final String DFA75_eotS =
        "\5\uffff";
    static final String DFA75_eofS =
        "\2\3\2\uffff\1\3";
    static final String DFA75_minS =
        "\2\53\2\uffff\1\53";
    static final String DFA75_maxS =
        "\2\163\2\uffff\1\163";
    static final String DFA75_acceptS =
        "\2\uffff\1\1\1\2\1\uffff";
    static final String DFA75_specialS =
        "\5\uffff}>";
    static final String[] DFA75_transitionS = {
            "\1\1\3\3\27\uffff\21\3\1\uffff\4\3\1\2\12\uffff\1\3\3\uffff"+
            "\2\3\2\uffff\1\3\1\uffff\3\3",
            "\1\4\3\3\27\uffff\21\3\1\uffff\4\3\1\2\12\uffff\1\3\3\uffff"+
            "\2\3\2\uffff\1\3\1\uffff\3\3",
            "",
            "",
            "\1\4\3\3\27\uffff\21\3\1\uffff\4\3\1\2\12\uffff\1\3\3\uffff"+
            "\2\3\2\uffff\1\3\1\uffff\3\3"
    };

    static final short[] DFA75_eot = DFA.unpackEncodedString(DFA75_eotS);
    static final short[] DFA75_eof = DFA.unpackEncodedString(DFA75_eofS);
    static final char[] DFA75_min = DFA.unpackEncodedStringToUnsignedChars(DFA75_minS);
    static final char[] DFA75_max = DFA.unpackEncodedStringToUnsignedChars(DFA75_maxS);
    static final short[] DFA75_accept = DFA.unpackEncodedString(DFA75_acceptS);
    static final short[] DFA75_special = DFA.unpackEncodedString(DFA75_specialS);
    static final short[][] DFA75_transition;

    static {
        int numStates = DFA75_transitionS.length;
        DFA75_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA75_transition[i] = DFA.unpackEncodedString(DFA75_transitionS[i]);
        }
    }

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = DFA75_eot;
            this.eof = DFA75_eof;
            this.min = DFA75_min;
            this.max = DFA75_max;
            this.accept = DFA75_accept;
            this.special = DFA75_special;
            this.transition = DFA75_transition;
        }
        public String getDescription() {
            return "179:49: ( ( ( LT )* '&&' ( LT )* bitwiseORExpression )+ -> ^( ANDEXPRESSION ( bitwiseORExpression )* ) )?";
        }
    }
    static final String DFA74_eotS =
        "\5\uffff";
    static final String DFA74_eofS =
        "\2\2\2\uffff\1\2";
    static final String DFA74_minS =
        "\2\53\2\uffff\1\53";
    static final String DFA74_maxS =
        "\2\163\2\uffff\1\163";
    static final String DFA74_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA74_specialS =
        "\5\uffff}>";
    static final String[] DFA74_transitionS = {
            "\1\1\3\2\27\uffff\21\2\1\uffff\4\2\1\3\12\uffff\1\2\3\uffff"+
            "\2\2\2\uffff\1\2\1\uffff\3\2",
            "\1\4\3\2\27\uffff\21\2\1\uffff\4\2\1\3\12\uffff\1\2\3\uffff"+
            "\2\2\2\uffff\1\2\1\uffff\3\2",
            "",
            "",
            "\1\4\3\2\27\uffff\21\2\1\uffff\4\2\1\3\12\uffff\1\2\3\uffff"+
            "\2\2\2\uffff\1\2\1\uffff\3\2"
    };

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "()+ loopback of 179:50: ( ( LT )* '&&' ( LT )* bitwiseORExpression )+";
        }
    }
    static final String DFA79_eotS =
        "\5\uffff";
    static final String DFA79_eofS =
        "\2\3\2\uffff\1\3";
    static final String DFA79_minS =
        "\2\53\2\uffff\1\53";
    static final String DFA79_maxS =
        "\2\163\2\uffff\1\163";
    static final String DFA79_acceptS =
        "\2\uffff\1\1\1\2\1\uffff";
    static final String DFA79_specialS =
        "\5\uffff}>";
    static final String[] DFA79_transitionS = {
            "\1\1\3\3\27\uffff\21\3\1\uffff\5\3\1\2\11\uffff\1\3\3\uffff"+
            "\2\3\2\uffff\1\3\1\uffff\3\3",
            "\1\4\3\3\27\uffff\21\3\1\uffff\5\3\1\2\11\uffff\1\3\3\uffff"+
            "\2\3\2\uffff\1\3\1\uffff\3\3",
            "",
            "",
            "\1\4\3\3\27\uffff\21\3\1\uffff\5\3\1\2\11\uffff\1\3\3\uffff"+
            "\2\3\2\uffff\1\3\1\uffff\3\3"
    };

    static final short[] DFA79_eot = DFA.unpackEncodedString(DFA79_eotS);
    static final short[] DFA79_eof = DFA.unpackEncodedString(DFA79_eofS);
    static final char[] DFA79_min = DFA.unpackEncodedStringToUnsignedChars(DFA79_minS);
    static final char[] DFA79_max = DFA.unpackEncodedStringToUnsignedChars(DFA79_maxS);
    static final short[] DFA79_accept = DFA.unpackEncodedString(DFA79_acceptS);
    static final short[] DFA79_special = DFA.unpackEncodedString(DFA79_specialS);
    static final short[][] DFA79_transition;

    static {
        int numStates = DFA79_transitionS.length;
        DFA79_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA79_transition[i] = DFA.unpackEncodedString(DFA79_transitionS[i]);
        }
    }

    class DFA79 extends DFA {

        public DFA79(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 79;
            this.eot = DFA79_eot;
            this.eof = DFA79_eof;
            this.min = DFA79_min;
            this.max = DFA79_max;
            this.accept = DFA79_accept;
            this.special = DFA79_special;
            this.transition = DFA79_transition;
        }
        public String getDescription() {
            return "183:50: ( ( ( LT )* '|' ( LT )* bitwiseXORExpression )+ -> ^( BITOREXPRESSION ( bitwiseXORExpression )* ) )?";
        }
    }
    static final String DFA78_eotS =
        "\5\uffff";
    static final String DFA78_eofS =
        "\2\2\2\uffff\1\2";
    static final String DFA78_minS =
        "\2\53\2\uffff\1\53";
    static final String DFA78_maxS =
        "\2\163\2\uffff\1\163";
    static final String DFA78_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA78_specialS =
        "\5\uffff}>";
    static final String[] DFA78_transitionS = {
            "\1\1\3\2\27\uffff\21\2\1\uffff\5\2\1\3\11\uffff\1\2\3\uffff"+
            "\2\2\2\uffff\1\2\1\uffff\3\2",
            "\1\4\3\2\27\uffff\21\2\1\uffff\5\2\1\3\11\uffff\1\2\3\uffff"+
            "\2\2\2\uffff\1\2\1\uffff\3\2",
            "",
            "",
            "\1\4\3\2\27\uffff\21\2\1\uffff\5\2\1\3\11\uffff\1\2\3\uffff"+
            "\2\2\2\uffff\1\2\1\uffff\3\2"
    };

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "()+ loopback of 183:51: ( ( LT )* '|' ( LT )* bitwiseXORExpression )+";
        }
    }
    static final String DFA83_eotS =
        "\5\uffff";
    static final String DFA83_eofS =
        "\2\3\2\uffff\1\3";
    static final String DFA83_minS =
        "\2\53\2\uffff\1\53";
    static final String DFA83_maxS =
        "\2\163\2\uffff\1\163";
    static final String DFA83_acceptS =
        "\2\uffff\1\1\1\2\1\uffff";
    static final String DFA83_specialS =
        "\5\uffff}>";
    static final String[] DFA83_transitionS = {
            "\1\1\3\3\27\uffff\21\3\1\uffff\6\3\1\2\10\uffff\1\3\3\uffff"+
            "\2\3\2\uffff\1\3\1\uffff\3\3",
            "\1\4\3\3\27\uffff\21\3\1\uffff\6\3\1\2\10\uffff\1\3\3\uffff"+
            "\2\3\2\uffff\1\3\1\uffff\3\3",
            "",
            "",
            "\1\4\3\3\27\uffff\21\3\1\uffff\6\3\1\2\10\uffff\1\3\3\uffff"+
            "\2\3\2\uffff\1\3\1\uffff\3\3"
    };

    static final short[] DFA83_eot = DFA.unpackEncodedString(DFA83_eotS);
    static final short[] DFA83_eof = DFA.unpackEncodedString(DFA83_eofS);
    static final char[] DFA83_min = DFA.unpackEncodedStringToUnsignedChars(DFA83_minS);
    static final char[] DFA83_max = DFA.unpackEncodedStringToUnsignedChars(DFA83_maxS);
    static final short[] DFA83_accept = DFA.unpackEncodedString(DFA83_acceptS);
    static final short[] DFA83_special = DFA.unpackEncodedString(DFA83_specialS);
    static final short[][] DFA83_transition;

    static {
        int numStates = DFA83_transitionS.length;
        DFA83_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA83_transition[i] = DFA.unpackEncodedString(DFA83_transitionS[i]);
        }
    }

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = DFA83_eot;
            this.eof = DFA83_eof;
            this.min = DFA83_min;
            this.max = DFA83_max;
            this.accept = DFA83_accept;
            this.special = DFA83_special;
            this.transition = DFA83_transition;
        }
        public String getDescription() {
            return "187:50: ( ( ( LT )* '^' ( LT )* bitwiseANDExpression )+ -> ^( BITXOREXPRESSION ( bitwiseANDExpression )* ) )?";
        }
    }
    static final String DFA82_eotS =
        "\5\uffff";
    static final String DFA82_eofS =
        "\2\2\2\uffff\1\2";
    static final String DFA82_minS =
        "\2\53\2\uffff\1\53";
    static final String DFA82_maxS =
        "\2\163\2\uffff\1\163";
    static final String DFA82_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA82_specialS =
        "\5\uffff}>";
    static final String[] DFA82_transitionS = {
            "\1\1\3\2\27\uffff\21\2\1\uffff\6\2\1\3\10\uffff\1\2\3\uffff"+
            "\2\2\2\uffff\1\2\1\uffff\3\2",
            "\1\4\3\2\27\uffff\21\2\1\uffff\6\2\1\3\10\uffff\1\2\3\uffff"+
            "\2\2\2\uffff\1\2\1\uffff\3\2",
            "",
            "",
            "\1\4\3\2\27\uffff\21\2\1\uffff\6\2\1\3\10\uffff\1\2\3\uffff"+
            "\2\2\2\uffff\1\2\1\uffff\3\2"
    };

    static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
    static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
    static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
    static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
    static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
    static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
    static final short[][] DFA82_transition;

    static {
        int numStates = DFA82_transitionS.length;
        DFA82_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
        }
    }

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = DFA82_eot;
            this.eof = DFA82_eof;
            this.min = DFA82_min;
            this.max = DFA82_max;
            this.accept = DFA82_accept;
            this.special = DFA82_special;
            this.transition = DFA82_transition;
        }
        public String getDescription() {
            return "()+ loopback of 187:51: ( ( LT )* '^' ( LT )* bitwiseANDExpression )+";
        }
    }
    static final String DFA87_eotS =
        "\5\uffff";
    static final String DFA87_eofS =
        "\2\3\2\uffff\1\3";
    static final String DFA87_minS =
        "\2\53\2\uffff\1\53";
    static final String DFA87_maxS =
        "\2\163\2\uffff\1\163";
    static final String DFA87_acceptS =
        "\2\uffff\1\1\1\2\1\uffff";
    static final String DFA87_specialS =
        "\5\uffff}>";
    static final String[] DFA87_transitionS = {
            "\1\1\3\3\27\uffff\21\3\1\uffff\7\3\1\2\7\uffff\1\3\3\uffff\2"+
            "\3\2\uffff\1\3\1\uffff\3\3",
            "\1\4\3\3\27\uffff\21\3\1\uffff\7\3\1\2\7\uffff\1\3\3\uffff"+
            "\2\3\2\uffff\1\3\1\uffff\3\3",
            "",
            "",
            "\1\4\3\3\27\uffff\21\3\1\uffff\7\3\1\2\7\uffff\1\3\3\uffff"+
            "\2\3\2\uffff\1\3\1\uffff\3\3"
    };

    static final short[] DFA87_eot = DFA.unpackEncodedString(DFA87_eotS);
    static final short[] DFA87_eof = DFA.unpackEncodedString(DFA87_eofS);
    static final char[] DFA87_min = DFA.unpackEncodedStringToUnsignedChars(DFA87_minS);
    static final char[] DFA87_max = DFA.unpackEncodedStringToUnsignedChars(DFA87_maxS);
    static final short[] DFA87_accept = DFA.unpackEncodedString(DFA87_acceptS);
    static final short[] DFA87_special = DFA.unpackEncodedString(DFA87_specialS);
    static final short[][] DFA87_transition;

    static {
        int numStates = DFA87_transitionS.length;
        DFA87_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA87_transition[i] = DFA.unpackEncodedString(DFA87_transitionS[i]);
        }
    }

    class DFA87 extends DFA {

        public DFA87(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 87;
            this.eot = DFA87_eot;
            this.eof = DFA87_eof;
            this.min = DFA87_min;
            this.max = DFA87_max;
            this.accept = DFA87_accept;
            this.special = DFA87_special;
            this.transition = DFA87_transition;
        }
        public String getDescription() {
            return "191:48: ( ( ( LT )* '&' ( LT )* equalityExpression )+ -> ^( BITANDEXPRESSION ( equalityExpression )* ) )?";
        }
    }
    static final String DFA86_eotS =
        "\5\uffff";
    static final String DFA86_eofS =
        "\2\2\2\uffff\1\2";
    static final String DFA86_minS =
        "\2\53\2\uffff\1\53";
    static final String DFA86_maxS =
        "\2\163\2\uffff\1\163";
    static final String DFA86_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA86_specialS =
        "\5\uffff}>";
    static final String[] DFA86_transitionS = {
            "\1\1\3\2\27\uffff\21\2\1\uffff\7\2\1\3\7\uffff\1\2\3\uffff\2"+
            "\2\2\uffff\1\2\1\uffff\3\2",
            "\1\4\3\2\27\uffff\21\2\1\uffff\7\2\1\3\7\uffff\1\2\3\uffff"+
            "\2\2\2\uffff\1\2\1\uffff\3\2",
            "",
            "",
            "\1\4\3\2\27\uffff\21\2\1\uffff\7\2\1\3\7\uffff\1\2\3\uffff"+
            "\2\2\2\uffff\1\2\1\uffff\3\2"
    };

    static final short[] DFA86_eot = DFA.unpackEncodedString(DFA86_eotS);
    static final short[] DFA86_eof = DFA.unpackEncodedString(DFA86_eofS);
    static final char[] DFA86_min = DFA.unpackEncodedStringToUnsignedChars(DFA86_minS);
    static final char[] DFA86_max = DFA.unpackEncodedStringToUnsignedChars(DFA86_maxS);
    static final short[] DFA86_accept = DFA.unpackEncodedString(DFA86_acceptS);
    static final short[] DFA86_special = DFA.unpackEncodedString(DFA86_specialS);
    static final short[][] DFA86_transition;

    static {
        int numStates = DFA86_transitionS.length;
        DFA86_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA86_transition[i] = DFA.unpackEncodedString(DFA86_transitionS[i]);
        }
    }

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = DFA86_eot;
            this.eof = DFA86_eof;
            this.min = DFA86_min;
            this.max = DFA86_max;
            this.accept = DFA86_accept;
            this.special = DFA86_special;
            this.transition = DFA86_transition;
        }
        public String getDescription() {
            return "()+ loopback of 191:49: ( ( LT )* '&' ( LT )* equalityExpression )+";
        }
    }
    static final String DFA91_eotS =
        "\5\uffff";
    static final String DFA91_eofS =
        "\2\3\2\uffff\1\3";
    static final String DFA91_minS =
        "\2\53\2\uffff\1\53";
    static final String DFA91_maxS =
        "\2\163\2\uffff\1\163";
    static final String DFA91_acceptS =
        "\2\uffff\1\1\1\2\1\uffff";
    static final String DFA91_specialS =
        "\5\uffff}>";
    static final String[] DFA91_transitionS = {
            "\1\1\3\3\27\uffff\21\3\1\uffff\10\3\2\2\5\uffff\1\3\3\uffff"+
            "\2\3\2\uffff\1\3\1\uffff\3\3",
            "\1\4\3\3\27\uffff\21\3\1\uffff\10\3\2\2\5\uffff\1\3\3\uffff"+
            "\2\3\2\uffff\1\3\1\uffff\3\3",
            "",
            "",
            "\1\4\3\3\27\uffff\21\3\1\uffff\10\3\2\2\5\uffff\1\3\3\uffff"+
            "\2\3\2\uffff\1\3\1\uffff\3\3"
    };

    static final short[] DFA91_eot = DFA.unpackEncodedString(DFA91_eotS);
    static final short[] DFA91_eof = DFA.unpackEncodedString(DFA91_eofS);
    static final char[] DFA91_min = DFA.unpackEncodedStringToUnsignedChars(DFA91_minS);
    static final char[] DFA91_max = DFA.unpackEncodedStringToUnsignedChars(DFA91_maxS);
    static final short[] DFA91_accept = DFA.unpackEncodedString(DFA91_acceptS);
    static final short[] DFA91_special = DFA.unpackEncodedString(DFA91_specialS);
    static final short[][] DFA91_transition;

    static {
        int numStates = DFA91_transitionS.length;
        DFA91_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA91_transition[i] = DFA.unpackEncodedString(DFA91_transitionS[i]);
        }
    }

    class DFA91 extends DFA {

        public DFA91(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 91;
            this.eot = DFA91_eot;
            this.eof = DFA91_eof;
            this.min = DFA91_min;
            this.max = DFA91_max;
            this.accept = DFA91_accept;
            this.special = DFA91_special;
            this.transition = DFA91_transition;
        }
        public String getDescription() {
            return "195:50: ( ( ( LT )* (op= '==' | op= '!=' ) ( LT )* equalityExpression ) -> ^( EQUALITYEXPRESSION $op relationalExpression equalityExpression ) )?";
        }
    }
    static final String DFA95_eotS =
        "\5\uffff";
    static final String DFA95_eofS =
        "\2\3\2\uffff\1\3";
    static final String DFA95_minS =
        "\2\53\2\uffff\1\53";
    static final String DFA95_maxS =
        "\2\163\2\uffff\1\163";
    static final String DFA95_acceptS =
        "\2\uffff\1\1\1\2\1\uffff";
    static final String DFA95_specialS =
        "\5\uffff}>";
    static final String[] DFA95_transitionS = {
            "\1\1\3\3\27\uffff\21\3\1\uffff\12\3\4\2\1\uffff\1\3\3\uffff"+
            "\2\3\2\uffff\1\3\1\uffff\3\3",
            "\1\4\3\3\27\uffff\21\3\1\uffff\12\3\4\2\1\uffff\1\3\3\uffff"+
            "\2\3\2\uffff\1\3\1\uffff\3\3",
            "",
            "",
            "\1\4\3\3\27\uffff\21\3\1\uffff\12\3\4\2\1\uffff\1\3\3\uffff"+
            "\2\3\2\uffff\1\3\1\uffff\3\3"
    };

    static final short[] DFA95_eot = DFA.unpackEncodedString(DFA95_eotS);
    static final short[] DFA95_eof = DFA.unpackEncodedString(DFA95_eofS);
    static final char[] DFA95_min = DFA.unpackEncodedStringToUnsignedChars(DFA95_minS);
    static final char[] DFA95_max = DFA.unpackEncodedStringToUnsignedChars(DFA95_maxS);
    static final short[] DFA95_accept = DFA.unpackEncodedString(DFA95_acceptS);
    static final short[] DFA95_special = DFA.unpackEncodedString(DFA95_specialS);
    static final short[][] DFA95_transition;

    static {
        int numStates = DFA95_transitionS.length;
        DFA95_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA95_transition[i] = DFA.unpackEncodedString(DFA95_transitionS[i]);
        }
    }

    class DFA95 extends DFA {

        public DFA95(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 95;
            this.eot = DFA95_eot;
            this.eof = DFA95_eof;
            this.min = DFA95_min;
            this.max = DFA95_max;
            this.accept = DFA95_accept;
            this.special = DFA95_special;
            this.transition = DFA95_transition;
        }
        public String getDescription() {
            return "200:48: ( ( ( LT )* (op= '<' | op= '>' | op= '<=' | op= '>=' ) ( LT )* relationalExpression ) -> ^( RELATIONALEXPRESSION $op additiveExpression relationalExpression ) )?";
        }
    }
    static final String DFA99_eotS =
        "\55\uffff";
    static final String DFA99_eofS =
        "\1\4\54\uffff";
    static final String DFA99_minS =
        "\1\53\1\0\1\uffff\1\0\51\uffff";
    static final String DFA99_maxS =
        "\1\163\1\0\1\uffff\1\0\51\uffff";
    static final String DFA99_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\50\uffff";
    static final String DFA99_specialS =
        "\1\uffff\1\0\1\uffff\1\1\51\uffff}>";
    static final String[] DFA99_transitionS = {
            "\1\1\3\4\27\uffff\21\4\1\uffff\16\4\1\2\1\3\3\uffff\2\4\2\uffff"+
            "\1\4\1\uffff\3\4",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA99_eot = DFA.unpackEncodedString(DFA99_eotS);
    static final short[] DFA99_eof = DFA.unpackEncodedString(DFA99_eofS);
    static final char[] DFA99_min = DFA.unpackEncodedStringToUnsignedChars(DFA99_minS);
    static final char[] DFA99_max = DFA.unpackEncodedStringToUnsignedChars(DFA99_maxS);
    static final short[] DFA99_accept = DFA.unpackEncodedString(DFA99_acceptS);
    static final short[] DFA99_special = DFA.unpackEncodedString(DFA99_specialS);
    static final short[][] DFA99_transition;

    static {
        int numStates = DFA99_transitionS.length;
        DFA99_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA99_transition[i] = DFA.unpackEncodedString(DFA99_transitionS[i]);
        }
    }

    class DFA99 extends DFA {

        public DFA99(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 99;
            this.eot = DFA99_eot;
            this.eof = DFA99_eof;
            this.min = DFA99_min;
            this.max = DFA99_max;
            this.accept = DFA99_accept;
            this.special = DFA99_special;
            this.transition = DFA99_transition;
        }
        public String getDescription() {
            return "204:54: ( ( ( LT )* (op= '+' | op= '-' ) ( LT )* additiveExpression ) -> ^( ADDITIVEEXPRESSION $op multiplicativeExpression additiveExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA99_1 = input.LA(1);

                         
                        int index99_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred112_GScript()) ) {s = 2;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index99_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA99_3 = input.LA(1);

                         
                        int index99_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred112_GScript()) ) {s = 2;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index99_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 99, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA106_eotS =
        "\15\uffff";
    static final String DFA106_eofS =
        "\15\uffff";
    static final String DFA106_minS =
        "\1\54\1\0\13\uffff";
    static final String DFA106_maxS =
        "\1\163\1\0\13\uffff";
    static final String DFA106_acceptS =
        "\2\uffff\1\2\2\uffff\1\3\6\uffff\1\1";
    static final String DFA106_specialS =
        "\1\uffff\1\0\13\uffff}>";
    static final String[] DFA106_transitionS = {
            "\1\1\2\5\30\uffff\1\5\37\uffff\1\2\3\uffff\2\2\2\uffff\1\5\1"+
            "\uffff\3\5",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA106_eot = DFA.unpackEncodedString(DFA106_eotS);
    static final short[] DFA106_eof = DFA.unpackEncodedString(DFA106_eofS);
    static final char[] DFA106_min = DFA.unpackEncodedStringToUnsignedChars(DFA106_minS);
    static final char[] DFA106_max = DFA.unpackEncodedStringToUnsignedChars(DFA106_maxS);
    static final short[] DFA106_accept = DFA.unpackEncodedString(DFA106_acceptS);
    static final short[] DFA106_special = DFA.unpackEncodedString(DFA106_specialS);
    static final short[][] DFA106_transition;

    static {
        int numStates = DFA106_transitionS.length;
        DFA106_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA106_transition[i] = DFA.unpackEncodedString(DFA106_transitionS[i]);
        }
    }

    class DFA106 extends DFA {

        public DFA106(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 106;
            this.eot = DFA106_eot;
            this.eof = DFA106_eof;
            this.min = DFA106_min;
            this.max = DFA106_max;
            this.accept = DFA106_accept;
            this.special = DFA106_special;
            this.transition = DFA106_transition;
        }
        public String getDescription() {
            return "211:1: unaryExpression : ( postfixExpression | ( (op= '-' | op= '~' | op= '!' ) primaryExpression ) -> ^( UNARYEXPRESSION $op primaryExpression ) | primaryExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA106_1 = input.LA(1);

                         
                        int index106_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred119_GScript()) ) {s = 12;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index106_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 106, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_LT_in_program204 = new BitSet(new long[]{0x0000780000000000L,0x000E9880047ED4C0L});
    public static final BitSet FOLLOW_sourceElements_in_program207 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LT_in_program209 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_EOF_in_program212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_sourceElements233 = new BitSet(new long[]{0x0000780000000002L,0x000E9880047ED4C0L});
    public static final BitSet FOLLOW_LT_in_sourceElements236 = new BitSet(new long[]{0x0000780000000000L,0x000E9880047ED4C0L});
    public static final BitSet FOLLOW_statement_in_sourceElements240 = new BitSet(new long[]{0x0000780000000002L,0x000E9880047ED4C0L});
    public static final BitSet FOLLOW_70_in_functionExpression253 = new BitSet(new long[]{0x0000180000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LT_in_functionExpression255 = new BitSet(new long[]{0x0000180000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_Identifier_in_functionExpression258 = new BitSet(new long[]{0x0000180000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LT_in_functionExpression261 = new BitSet(new long[]{0x0000180000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_formalParameterList_in_functionExpression264 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_LT_in_functionExpression266 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_functionBody_in_functionExpression269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_formalParameterList295 = new BitSet(new long[]{0x0000180000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LT_in_formalParameterList298 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_Identifier_in_formalParameterList301 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_LT_in_formalParameterList304 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_formalParameterList307 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_LT_in_formalParameterList309 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_Identifier_in_formalParameterList312 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_LT_in_formalParameterList318 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_formalParameterList321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_functionBody342 = new BitSet(new long[]{0x0000780000000000L,0x000E9880047EDCC0L});
    public static final BitSet FOLLOW_LT_in_functionBody344 = new BitSet(new long[]{0x0000780000000000L,0x000E9880047EDCC0L});
    public static final BitSet FOLLOW_sourceElements_in_functionBody347 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_LT_in_functionBody350 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_functionBody353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementBlock_in_statement375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryCatchBlock_in_statement380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStatement_in_statement385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStatement_in_statement390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterationStatement_in_statement400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueStatement_in_statement405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatement_in_statement410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statement415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDefinitionStatement_in_statement420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_statementBlock432 = new BitSet(new long[]{0x0000780000000000L,0x000E9880047EDCC0L});
    public static final BitSet FOLLOW_LT_in_statementBlock434 = new BitSet(new long[]{0x0000780000000000L,0x000E9880047EDCC0L});
    public static final BitSet FOLLOW_statementList_in_statementBlock437 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_LT_in_statementBlock440 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_statementBlock443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_tryCatchBlock464 = new BitSet(new long[]{0x0000780000000000L,0x000E9880047ED4C0L});
    public static final BitSet FOLLOW_LT_in_tryCatchBlock466 = new BitSet(new long[]{0x0000780000000000L,0x000E9880047ED4C0L});
    public static final BitSet FOLLOW_statement_in_tryCatchBlock470 = new BitSet(new long[]{0x0000080000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_LT_in_tryCatchBlock472 = new BitSet(new long[]{0x0000080000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_tryCatchBlock475 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LT_in_tryCatchBlock477 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_tryCatchBlock480 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_LT_in_tryCatchBlock482 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_Identifier_in_tryCatchBlock485 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LT_in_tryCatchBlock487 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_tryCatchBlock490 = new BitSet(new long[]{0x0000780000000000L,0x000E9880047ED4C0L});
    public static final BitSet FOLLOW_LT_in_tryCatchBlock492 = new BitSet(new long[]{0x0000780000000000L,0x000E9880047ED4C0L});
    public static final BitSet FOLLOW_statement_in_tryCatchBlock495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementList521 = new BitSet(new long[]{0x0000780000000002L,0x000E9880047ED4C0L});
    public static final BitSet FOLLOW_LT_in_statementList524 = new BitSet(new long[]{0x0000780000000000L,0x000E9880047ED4C0L});
    public static final BitSet FOLLOW_statement_in_statementList528 = new BitSet(new long[]{0x0000780000000002L,0x000E9880047ED4C0L});
    public static final BitSet FOLLOW_78_in_emptyStatement542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStatement555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ifStatement576 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LT_in_ifStatement578 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ifStatement581 = new BitSet(new long[]{0x0000780000000000L,0x000E9880040000C0L});
    public static final BitSet FOLLOW_LT_in_ifStatement583 = new BitSet(new long[]{0x0000780000000000L,0x000E9880040000C0L});
    public static final BitSet FOLLOW_expression_in_ifStatement586 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LT_in_ifStatement588 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ifStatement591 = new BitSet(new long[]{0x0000780000000000L,0x000E9880047ED4C0L});
    public static final BitSet FOLLOW_LT_in_ifStatement593 = new BitSet(new long[]{0x0000780000000000L,0x000E9880047ED4C0L});
    public static final BitSet FOLLOW_statement_in_ifStatement598 = new BitSet(new long[]{0x0000080000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_LT_in_ifStatement601 = new BitSet(new long[]{0x0000080000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ifStatement604 = new BitSet(new long[]{0x0000780000000000L,0x000E9880047ED4C0L});
    public static final BitSet FOLLOW_LT_in_ifStatement606 = new BitSet(new long[]{0x0000780000000000L,0x000E9880047ED4C0L});
    public static final BitSet FOLLOW_statement_in_ifStatement611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_iterationStatement641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_iterationStatement646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_whileStatement658 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LT_in_whileStatement660 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_whileStatement663 = new BitSet(new long[]{0x0000780000000000L,0x000E9880040000C0L});
    public static final BitSet FOLLOW_LT_in_whileStatement665 = new BitSet(new long[]{0x0000780000000000L,0x000E9880040000C0L});
    public static final BitSet FOLLOW_expression_in_whileStatement668 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LT_in_whileStatement670 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_whileStatement673 = new BitSet(new long[]{0x0000780000000000L,0x000E9880047ED4C0L});
    public static final BitSet FOLLOW_LT_in_whileStatement675 = new BitSet(new long[]{0x0000780000000000L,0x000E9880047ED4C0L});
    public static final BitSet FOLLOW_statement_in_whileStatement678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_forStatement702 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LT_in_forStatement704 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_forStatement707 = new BitSet(new long[]{0x0000780000000000L,0x000E9880047ED4C0L});
    public static final BitSet FOLLOW_LT_in_forStatement710 = new BitSet(new long[]{0x0000780000000000L,0x000E9880047ED4C0L});
    public static final BitSet FOLLOW_statement_in_forStatement713 = new BitSet(new long[]{0x0000080000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_forStatement717 = new BitSet(new long[]{0x0000080000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_forStatement720 = new BitSet(new long[]{0x0000780000000000L,0x000E9880040040C0L});
    public static final BitSet FOLLOW_LT_in_forStatement723 = new BitSet(new long[]{0x0000780000000000L,0x000E9880040000C0L});
    public static final BitSet FOLLOW_expression_in_forStatement726 = new BitSet(new long[]{0x0000080000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_forStatement730 = new BitSet(new long[]{0x0000080000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_forStatement733 = new BitSet(new long[]{0x0000780000000000L,0x000E9880047ED6C0L});
    public static final BitSet FOLLOW_LT_in_forStatement736 = new BitSet(new long[]{0x0000780000000000L,0x000E9880047ED4C0L});
    public static final BitSet FOLLOW_statement_in_forStatement739 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LT_in_forStatement743 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_forStatement746 = new BitSet(new long[]{0x0000780000000000L,0x000E9880047ED4C0L});
    public static final BitSet FOLLOW_LT_in_forStatement748 = new BitSet(new long[]{0x0000780000000000L,0x000E9880047ED4C0L});
    public static final BitSet FOLLOW_statement_in_forStatement751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_continueStatement778 = new BitSet(new long[]{0x0000180000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_Identifier_in_continueStatement780 = new BitSet(new long[]{0x0000080000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_continueStatement784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_continueStatement788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_breakStatement810 = new BitSet(new long[]{0x0000180000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_Identifier_in_breakStatement812 = new BitSet(new long[]{0x0000080000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_breakStatement816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_breakStatement820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_returnStatement842 = new BitSet(new long[]{0x0000780000000000L,0x000E9880040040C0L});
    public static final BitSet FOLLOW_expression_in_returnStatement844 = new BitSet(new long[]{0x0000080000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_LT_in_returnStatement848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_returnStatement852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_variableDefinitionStatement877 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Identifier_in_variableDefinitionStatement879 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_variableDefinitionStatement883 = new BitSet(new long[]{0x0000700000000000L,0x000E9880040000C0L});
    public static final BitSet FOLLOW_expression_in_variableDefinitionStatement885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_expression912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionExpression_in_expression920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCallExpression_in_expression924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_expression928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldReferenceExpression_in_assignmentExpression941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_assignmentExpression943 = new BitSet(new long[]{0x0000700000000000L,0x000E9880040000C0L});
    public static final BitSet FOLLOW_expression_in_assignmentExpression945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpression_in_conditionalExpression970 = new BitSet(new long[]{0x0000080000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_LT_in_conditionalExpression979 = new BitSet(new long[]{0x0000080000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_conditionalExpression982 = new BitSet(new long[]{0x0000780000000000L,0x000E9880040000C0L});
    public static final BitSet FOLLOW_LT_in_conditionalExpression984 = new BitSet(new long[]{0x0000780000000000L,0x000E9880040000C0L});
    public static final BitSet FOLLOW_expression_in_conditionalExpression987 = new BitSet(new long[]{0x0000080000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_LT_in_conditionalExpression989 = new BitSet(new long[]{0x0000080000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_conditionalExpression992 = new BitSet(new long[]{0x0000780000000000L,0x000E9880040000C0L});
    public static final BitSet FOLLOW_LT_in_conditionalExpression994 = new BitSet(new long[]{0x0000780000000000L,0x000E9880040000C0L});
    public static final BitSet FOLLOW_expression_in_conditionalExpression997 = new BitSet(new long[]{0x0000080000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_90_in_newExpression1026 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_LT_in_newExpression1028 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_functionCallExpression_in_newExpression1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression1052 = new BitSet(new long[]{0x0000080000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_LT_in_logicalORExpression1061 = new BitSet(new long[]{0x0000080000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_logicalORExpression1064 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_LT_in_logicalORExpression1066 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression1069 = new BitSet(new long[]{0x0000080000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression1097 = new BitSet(new long[]{0x0000080000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_LT_in_logicalANDExpression1106 = new BitSet(new long[]{0x0000080000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_logicalANDExpression1109 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_LT_in_logicalANDExpression1111 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression1114 = new BitSet(new long[]{0x0000080000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression1142 = new BitSet(new long[]{0x0000080000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_LT_in_bitwiseORExpression1151 = new BitSet(new long[]{0x0000080000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_93_in_bitwiseORExpression1154 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_LT_in_bitwiseORExpression1156 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression1159 = new BitSet(new long[]{0x0000080000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression1187 = new BitSet(new long[]{0x0000080000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_LT_in_bitwiseXORExpression1196 = new BitSet(new long[]{0x0000080000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_bitwiseXORExpression1199 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_LT_in_bitwiseXORExpression1201 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression1204 = new BitSet(new long[]{0x0000080000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression1233 = new BitSet(new long[]{0x0000080000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_LT_in_bitwiseANDExpression1242 = new BitSet(new long[]{0x0000080000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_bitwiseANDExpression1245 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_LT_in_bitwiseANDExpression1247 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression1250 = new BitSet(new long[]{0x0000080000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression1278 = new BitSet(new long[]{0x0000080000000002L,0x0000000300000000L});
    public static final BitSet FOLLOW_LT_in_equalityExpression1287 = new BitSet(new long[]{0x0000080000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_96_in_equalityExpression1293 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_97_in_equalityExpression1299 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_LT_in_equalityExpression1302 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_equalityExpression_in_equalityExpression1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression1336 = new BitSet(new long[]{0x0000080000000002L,0x0000003C00000000L});
    public static final BitSet FOLLOW_LT_in_relationalExpression1345 = new BitSet(new long[]{0x0000080000000000L,0x0000003C00000000L});
    public static final BitSet FOLLOW_98_in_relationalExpression1351 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_99_in_relationalExpression1357 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_100_in_relationalExpression1363 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_101_in_relationalExpression1369 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_LT_in_relationalExpression1373 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_relationalExpression_in_relationalExpression1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1406 = new BitSet(new long[]{0x0000080000000002L,0x000000C000000000L});
    public static final BitSet FOLLOW_LT_in_additiveExpression1415 = new BitSet(new long[]{0x0000080000000000L,0x000000C000000000L});
    public static final BitSet FOLLOW_102_in_additiveExpression1422 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_103_in_additiveExpression1428 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_LT_in_additiveExpression1431 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_additiveExpression_in_additiveExpression1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1464 = new BitSet(new long[]{0x0000080000000002L,0x0000070000000000L});
    public static final BitSet FOLLOW_LT_in_multiplicativeExpression1473 = new BitSet(new long[]{0x0000080000000000L,0x0000070000000000L});
    public static final BitSet FOLLOW_104_in_multiplicativeExpression1480 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_105_in_multiplicativeExpression1486 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_106_in_multiplicativeExpression1492 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_LT_in_multiplicativeExpression1495 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_multiplicativeExpression1498 = new BitSet(new long[]{0x0000080000000002L,0x0000070000000000L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_unaryExpression1537 = new BitSet(new long[]{0x0000700000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_107_in_unaryExpression1543 = new BitSet(new long[]{0x0000700000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_108_in_unaryExpression1549 = new BitSet(new long[]{0x0000700000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldReferenceExpression_in_postfixExpression1582 = new BitSet(new long[]{0x0000000000000000L,0x0000600000000000L});
    public static final BitSet FOLLOW_109_in_postfixExpression1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_postfixExpression1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_primaryExpression1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldReferenceExpression_in_primaryExpression1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_primaryExpression1638 = new BitSet(new long[]{0x0000780000000000L,0x000E9880040000C0L});
    public static final BitSet FOLLOW_LT_in_primaryExpression1641 = new BitSet(new long[]{0x0000780000000000L,0x000E9880040000C0L});
    public static final BitSet FOLLOW_expression_in_primaryExpression1645 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LT_in_primaryExpression1647 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_primaryExpression1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCallExpression_in_fieldReferenceExpression1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableExpression_in_fieldReferenceExpression1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_functionCallExpression1677 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_LT_in_functionCallExpression1679 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_arguments_in_functionCallExpression1682 = new BitSet(new long[]{0x0000080000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_LT_in_functionCallExpression1684 = new BitSet(new long[]{0x0000080000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_functionCallExpression1690 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_fieldReferenceExpression_in_functionCallExpression1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_variableExpression1722 = new BitSet(new long[]{0x0000080000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_LT_in_variableExpression1724 = new BitSet(new long[]{0x0000080000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_variableExpression1729 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_fieldReferenceExpression_in_variableExpression1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_arguments1763 = new BitSet(new long[]{0x0000780000000000L,0x000E9880040002C0L});
    public static final BitSet FOLLOW_LT_in_arguments1765 = new BitSet(new long[]{0x0000780000000000L,0x000E9880040002C0L});
    public static final BitSet FOLLOW_expression_in_arguments1769 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_LT_in_arguments1771 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_72_in_arguments1774 = new BitSet(new long[]{0x0000700000000000L,0x000E9880040000C0L});
    public static final BitSet FOLLOW_expression_in_arguments1776 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_LT_in_arguments1778 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_73_in_arguments1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_literal1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_literal1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_literal1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NumericLiteral_in_literal1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred5_GScript255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred15_GScript344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred27_GScript434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred44_GScript601 = new BitSet(new long[]{0x0000080000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_synpred44_GScript604 = new BitSet(new long[]{0x0000780000000000L,0x000E9880047ED4C0L});
    public static final BitSet FOLLOW_LT_in_synpred44_GScript606 = new BitSet(new long[]{0x0000780000000000L,0x000E9880047ED4C0L});
    public static final BitSet FOLLOW_statement_in_synpred44_GScript611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred52_GScript710 = new BitSet(new long[]{0x0000780000000000L,0x000E9880047ED4C0L});
    public static final BitSet FOLLOW_statement_in_synpred52_GScript713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_synpred68_GScript912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_synpred69_GScript916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCallExpression_in_synpred71_GScript924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred76_GScript979 = new BitSet(new long[]{0x0000080000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_synpred76_GScript982 = new BitSet(new long[]{0x0000780000000000L,0x000E9880040000C0L});
    public static final BitSet FOLLOW_LT_in_synpred76_GScript984 = new BitSet(new long[]{0x0000780000000000L,0x000E9880040000C0L});
    public static final BitSet FOLLOW_expression_in_synpred76_GScript987 = new BitSet(new long[]{0x0000080000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_LT_in_synpred76_GScript989 = new BitSet(new long[]{0x0000080000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_synpred76_GScript992 = new BitSet(new long[]{0x0000780000000000L,0x000E9880040000C0L});
    public static final BitSet FOLLOW_LT_in_synpred76_GScript994 = new BitSet(new long[]{0x0000780000000000L,0x000E9880040000C0L});
    public static final BitSet FOLLOW_expression_in_synpred76_GScript997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred77_GScript979 = new BitSet(new long[]{0x0000080000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_synpred77_GScript982 = new BitSet(new long[]{0x0000780000000000L,0x000E9880040000C0L});
    public static final BitSet FOLLOW_LT_in_synpred77_GScript984 = new BitSet(new long[]{0x0000780000000000L,0x000E9880040000C0L});
    public static final BitSet FOLLOW_expression_in_synpred77_GScript987 = new BitSet(new long[]{0x0000080000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_LT_in_synpred77_GScript989 = new BitSet(new long[]{0x0000080000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_synpred77_GScript992 = new BitSet(new long[]{0x0000780000000000L,0x000E9880040000C0L});
    public static final BitSet FOLLOW_LT_in_synpred77_GScript994 = new BitSet(new long[]{0x0000780000000000L,0x000E9880040000C0L});
    public static final BitSet FOLLOW_expression_in_synpred77_GScript997 = new BitSet(new long[]{0x0000080000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_LT_in_synpred112_GScript1415 = new BitSet(new long[]{0x0000080000000000L,0x000000C000000000L});
    public static final BitSet FOLLOW_102_in_synpred112_GScript1422 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_103_in_synpred112_GScript1428 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_LT_in_synpred112_GScript1431 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_additiveExpression_in_synpred112_GScript1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred117_GScript1473 = new BitSet(new long[]{0x0000080000000000L,0x0000070000000000L});
    public static final BitSet FOLLOW_104_in_synpred117_GScript1480 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_105_in_synpred117_GScript1486 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_106_in_synpred117_GScript1492 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_LT_in_synpred117_GScript1495 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_synpred117_GScript1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred118_GScript1473 = new BitSet(new long[]{0x0000080000000000L,0x0000070000000000L});
    public static final BitSet FOLLOW_104_in_synpred118_GScript1480 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_105_in_synpred118_GScript1486 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_106_in_synpred118_GScript1492 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_LT_in_synpred118_GScript1495 = new BitSet(new long[]{0x0000780000000000L,0x000E988000000080L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_synpred118_GScript1498 = new BitSet(new long[]{0x0000080000000002L,0x0000070000000000L});
    public static final BitSet FOLLOW_postfixExpression_in_synpred119_GScript1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCallExpression_in_synpred129_GScript1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred131_GScript1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_synpred133_GScript1724 = new BitSet(new long[]{0x0000000000000002L});

}