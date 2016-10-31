package sourceParser;

// Generated from gramatica.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__29=1, T__28=2, T__27=3, T__26=4, T__25=5, T__24=6, T__23=7, T__22=8, 
		T__21=9, T__20=10, T__19=11, T__18=12, T__17=13, T__16=14, T__15=15, T__14=16, 
		T__13=17, T__12=18, T__11=19, T__10=20, T__9=21, T__8=22, T__7=23, T__6=24, 
		T__5=25, T__4=26, T__3=27, T__2=28, T__1=29, T__0=30, WHITESPACE=31, OPERATOR=32, 
		IDENTIFIER=33, INTEGER_LITERAL=34;
	public static final String[] tokenNames = {
		"<INVALID>", "'main'", "'length'", "'new'", "'true'", "'return'", "'class'", 
		"'while'", "';'", "'void'", "'{'", "'='", "'extends'", "'}'", "'if'", 
		"'int'", "'('", "'this'", "','", "'false'", "'.'", "'boolean'", "'System.out.println'", 
		"'['", "'String'", "']'", "'public'", "'!'", "'static'", "'else'", "')'", 
		"WHITESPACE", "OPERATOR", "IDENTIFIER", "INTEGER_LITERAL"
	};
	public static final int
		RULE_goal = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_type = 5, RULE_formalList = 6, RULE_formal = 7, 
		RULE_statement = 8, RULE_expression = 9;
	public static final String[] ruleNames = {
		"goal", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
		"type", "formalList", "formal", "statement", "expression"
	};

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(gramaticaParser.EOF, 0); }
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitGoal(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); mainClass();
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(21); classDeclaration();
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainClassContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER(int i) {
			return getToken(gramaticaParser.IDENTIFIER, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(gramaticaParser.IDENTIFIER); }
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMainClass(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); match(T__24);
			setState(30); match(IDENTIFIER);
			setState(31); match(T__20);
			setState(32); match(T__4);
			setState(33); match(T__2);
			setState(34); match(T__21);
			setState(35); match(T__29);
			setState(36); match(T__14);
			setState(37); match(T__6);
			setState(38); match(T__7);
			setState(39); match(T__5);
			setState(40); match(IDENTIFIER);
			setState(41); match(T__0);
			setState(42); match(T__20);
			setState(43); statement();
			setState(44); match(T__17);
			setState(45); match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(gramaticaParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(gramaticaParser.IDENTIFIER); }
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); match(T__24);
			setState(48); match(IDENTIFIER);
			setState(51);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(49); match(T__18);
				setState(50); match(IDENTIFIER);
				}
			}

			setState(53); match(T__20);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__9) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(54); varDeclaration();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(60); methodDeclaration();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66); match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); type();
			setState(69); match(IDENTIFIER);
			setState(70); match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(gramaticaParser.IDENTIFIER, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(gramaticaParser.IDENTIFIER); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(T__4);
			setState(73); type();
			setState(74); match(IDENTIFIER);
			setState(75); match(T__14);
			setState(87);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__9) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(76); type();
				setState(77); match(IDENTIFIER);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(78); match(T__12);
					setState(79); type();
					setState(80); match(IDENTIFIER);
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(89); match(T__0);
			setState(90); match(T__20);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(91); varDeclaration();
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__20) | (1L << T__16) | (1L << T__8) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(97); statement();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103); match(T__25);
			setState(104); expression(0);
			setState(105); match(T__22);
			setState(106); match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108); match(T__15);
				setState(109); match(T__7);
				setState(110); match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111); match(T__9);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112); match(T__15);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113); match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalListContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public FormalListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFormalList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFormalList(this);
		}
	}

	public final FormalListContext formalList() throws RecognitionException {
		FormalListContext _localctx = new FormalListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_formalList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); type();
			setState(117); match(IDENTIFIER);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(118); match(T__12);
				setState(119); formal();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFormal(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); type();
			setState(126); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(169);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128); match(T__20);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__20) | (1L << T__16) | (1L << T__8) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(129); statement();
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135); match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136); match(T__16);
				setState(137); match(T__14);
				setState(138); expression(0);
				setState(139); match(T__0);
				setState(140); statement();
				setState(141); match(T__1);
				setState(142); statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144); match(T__23);
				setState(145); match(T__14);
				setState(146); expression(0);
				setState(147); match(T__0);
				setState(148); statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150); match(T__8);
				setState(151); match(T__14);
				setState(152); expression(0);
				setState(153); match(T__0);
				setState(154); match(T__22);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(156); match(IDENTIFIER);
				setState(157); match(T__19);
				setState(158); expression(0);
				setState(159); match(T__22);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161); match(IDENTIFIER);
				setState(162); match(T__7);
				setState(163); expression(0);
				setState(164); match(T__5);
				setState(165); match(T__19);
				setState(166); expression(0);
				setState(167); match(T__22);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(gramaticaParser.INTEGER_LITERAL, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(gramaticaParser.IDENTIFIER, 0); }
		public TerminalNode OPERATOR() { return getToken(gramaticaParser.OPERATOR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(172); match(T__3);
				setState(173); expression(2);
				}
				break;
			case 2:
				{
				setState(174); match(INTEGER_LITERAL);
				}
				break;
			case 3:
				{
				setState(175); match(T__26);
				}
				break;
			case 4:
				{
				setState(176); match(T__11);
				}
				break;
			case 5:
				{
				setState(177); match(IDENTIFIER);
				}
				break;
			case 6:
				{
				setState(178); match(T__13);
				}
				break;
			case 7:
				{
				setState(179); match(T__27);
				setState(180); match(T__15);
				setState(181); match(T__7);
				setState(182); expression(0);
				setState(183); match(T__5);
				}
				break;
			case 8:
				{
				setState(185); match(T__27);
				setState(186); match(IDENTIFIER);
				setState(187); match(T__14);
				setState(188); match(T__0);
				}
				break;
			case 9:
				{
				setState(189); match(T__14);
				setState(190); expression(0);
				setState(191); match(T__0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(221);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(196); match(OPERATOR);
						setState(197); expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(199); match(T__7);
						setState(200); expression(0);
						setState(201); match(T__5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(203);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(204); match(T__10);
						setState(205); match(T__28);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(206);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(207); match(T__10);
						setState(208); match(IDENTIFIER);
						setState(209); match(T__14);
						setState(218);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__26) | (1L << T__14) | (1L << T__13) | (1L << T__11) | (1L << T__3) | (1L << IDENTIFIER) | (1L << INTEGER_LITERAL))) != 0)) {
							{
							setState(210); expression(0);
							setState(215);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__12) {
								{
								{
								setState(211); match(T__12);
								setState(212); expression(0);
								}
								}
								setState(217);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(220); match(T__0);
						}
						break;
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 13);
		case 1: return precpred(_ctx, 12);
		case 2: return precpred(_ctx, 11);
		case 3: return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u00e5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4"+
		"\66\n\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\4\7\4@\n\4\f\4\16\4C\13\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6U\n"+
		"\6\f\6\16\6X\13\6\5\6Z\n\6\3\6\3\6\3\6\7\6_\n\6\f\6\16\6b\13\6\3\6\7\6"+
		"e\n\6\f\6\16\6h\13\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7u"+
		"\n\7\3\b\3\b\3\b\3\b\7\b{\n\b\f\b\16\b~\13\b\3\t\3\t\3\t\3\n\3\n\7\n\u0085"+
		"\n\n\f\n\16\n\u0088\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u00ac\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u00c4\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00d8\n\13\f\13\16\13\u00db"+
		"\13\13\5\13\u00dd\n\13\3\13\7\13\u00e0\n\13\f\13\16\13\u00e3\13\13\3\13"+
		"\2\3\24\f\2\4\6\b\n\f\16\20\22\24\2\2\u00fa\2\26\3\2\2\2\4\37\3\2\2\2"+
		"\6\61\3\2\2\2\bF\3\2\2\2\nJ\3\2\2\2\ft\3\2\2\2\16v\3\2\2\2\20\177\3\2"+
		"\2\2\22\u00ab\3\2\2\2\24\u00c3\3\2\2\2\26\32\5\4\3\2\27\31\5\6\4\2\30"+
		"\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\35\3\2\2\2\34"+
		"\32\3\2\2\2\35\36\7\2\2\3\36\3\3\2\2\2\37 \7\b\2\2 !\7#\2\2!\"\7\f\2\2"+
		"\"#\7\34\2\2#$\7\36\2\2$%\7\13\2\2%&\7\3\2\2&\'\7\22\2\2\'(\7\32\2\2("+
		")\7\31\2\2)*\7\33\2\2*+\7#\2\2+,\7 \2\2,-\7\f\2\2-.\5\22\n\2./\7\17\2"+
		"\2/\60\7\17\2\2\60\5\3\2\2\2\61\62\7\b\2\2\62\65\7#\2\2\63\64\7\16\2\2"+
		"\64\66\7#\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\67;\7\f\2\28:"+
		"\5\b\5\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<A\3\2\2\2=;\3\2\2\2>"+
		"@\5\n\6\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2"+
		"DE\7\17\2\2E\7\3\2\2\2FG\5\f\7\2GH\7#\2\2HI\7\n\2\2I\t\3\2\2\2JK\7\34"+
		"\2\2KL\5\f\7\2LM\7#\2\2MY\7\22\2\2NO\5\f\7\2OV\7#\2\2PQ\7\24\2\2QR\5\f"+
		"\7\2RS\7#\2\2SU\3\2\2\2TP\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WZ\3\2"+
		"\2\2XV\3\2\2\2YN\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7 \2\2\\`\7\f\2\2]_\5"+
		"\b\5\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2af\3\2\2\2b`\3\2\2\2ce\5"+
		"\22\n\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij"+
		"\7\7\2\2jk\5\24\13\2kl\7\n\2\2lm\7\17\2\2m\13\3\2\2\2no\7\21\2\2op\7\31"+
		"\2\2pu\7\33\2\2qu\7\27\2\2ru\7\21\2\2su\7#\2\2tn\3\2\2\2tq\3\2\2\2tr\3"+
		"\2\2\2ts\3\2\2\2u\r\3\2\2\2vw\5\f\7\2w|\7#\2\2xy\7\24\2\2y{\5\20\t\2z"+
		"x\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\17\3\2\2\2~|\3\2\2\2\177\u0080"+
		"\5\f\7\2\u0080\u0081\7#\2\2\u0081\21\3\2\2\2\u0082\u0086\7\f\2\2\u0083"+
		"\u0085\5\22\n\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u00ac\7\17\2\2\u008a\u008b\7\20\2\2\u008b\u008c\7\22\2\2\u008c\u008d"+
		"\5\24\13\2\u008d\u008e\7 \2\2\u008e\u008f\5\22\n\2\u008f\u0090\7\37\2"+
		"\2\u0090\u0091\5\22\n\2\u0091\u00ac\3\2\2\2\u0092\u0093\7\t\2\2\u0093"+
		"\u0094\7\22\2\2\u0094\u0095\5\24\13\2\u0095\u0096\7 \2\2\u0096\u0097\5"+
		"\22\n\2\u0097\u00ac\3\2\2\2\u0098\u0099\7\30\2\2\u0099\u009a\7\22\2\2"+
		"\u009a\u009b\5\24\13\2\u009b\u009c\7 \2\2\u009c\u009d\7\n\2\2\u009d\u00ac"+
		"\3\2\2\2\u009e\u009f\7#\2\2\u009f\u00a0\7\r\2\2\u00a0\u00a1\5\24\13\2"+
		"\u00a1\u00a2\7\n\2\2\u00a2\u00ac\3\2\2\2\u00a3\u00a4\7#\2\2\u00a4\u00a5"+
		"\7\31\2\2\u00a5\u00a6\5\24\13\2\u00a6\u00a7\7\33\2\2\u00a7\u00a8\7\r\2"+
		"\2\u00a8\u00a9\5\24\13\2\u00a9\u00aa\7\n\2\2\u00aa\u00ac\3\2\2\2\u00ab"+
		"\u0082\3\2\2\2\u00ab\u008a\3\2\2\2\u00ab\u0092\3\2\2\2\u00ab\u0098\3\2"+
		"\2\2\u00ab\u009e\3\2\2\2\u00ab\u00a3\3\2\2\2\u00ac\23\3\2\2\2\u00ad\u00ae"+
		"\b\13\1\2\u00ae\u00af\7\35\2\2\u00af\u00c4\5\24\13\4\u00b0\u00c4\7$\2"+
		"\2\u00b1\u00c4\7\6\2\2\u00b2\u00c4\7\25\2\2\u00b3\u00c4\7#\2\2\u00b4\u00c4"+
		"\7\23\2\2\u00b5\u00b6\7\5\2\2\u00b6\u00b7\7\21\2\2\u00b7\u00b8\7\31\2"+
		"\2\u00b8\u00b9\5\24\13\2\u00b9\u00ba\7\33\2\2\u00ba\u00c4\3\2\2\2\u00bb"+
		"\u00bc\7\5\2\2\u00bc\u00bd\7#\2\2\u00bd\u00be\7\22\2\2\u00be\u00c4\7 "+
		"\2\2\u00bf\u00c0\7\22\2\2\u00c0\u00c1\5\24\13\2\u00c1\u00c2\7 \2\2\u00c2"+
		"\u00c4\3\2\2\2\u00c3\u00ad\3\2\2\2\u00c3\u00b0\3\2\2\2\u00c3\u00b1\3\2"+
		"\2\2\u00c3\u00b2\3\2\2\2\u00c3\u00b3\3\2\2\2\u00c3\u00b4\3\2\2\2\u00c3"+
		"\u00b5\3\2\2\2\u00c3\u00bb\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c4\u00e1\3\2"+
		"\2\2\u00c5\u00c6\f\17\2\2\u00c6\u00c7\7\"\2\2\u00c7\u00e0\5\24\13\20\u00c8"+
		"\u00c9\f\16\2\2\u00c9\u00ca\7\31\2\2\u00ca\u00cb\5\24\13\2\u00cb\u00cc"+
		"\7\33\2\2\u00cc\u00e0\3\2\2\2\u00cd\u00ce\f\r\2\2\u00ce\u00cf\7\26\2\2"+
		"\u00cf\u00e0\7\4\2\2\u00d0\u00d1\f\f\2\2\u00d1\u00d2\7\26\2\2\u00d2\u00d3"+
		"\7#\2\2\u00d3\u00dc\7\22\2\2\u00d4\u00d9\5\24\13\2\u00d5\u00d6\7\24\2"+
		"\2\u00d6\u00d8\5\24\13\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00dc\u00d4\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00e0\7 \2\2\u00df\u00c5\3\2\2\2\u00df\u00c8\3\2\2\2\u00df\u00cd\3\2"+
		"\2\2\u00df\u00d0\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\25\3\2\2\2\u00e3\u00e1\3\2\2\2\23\32\65;AVY`ft|\u0086"+
		"\u00ab\u00c3\u00d9\u00dc\u00df\u00e1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}