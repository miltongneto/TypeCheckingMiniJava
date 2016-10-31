// Generated from mvgn.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mvgnParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__29=1, T__28=2, T__27=3, T__26=4, T__25=5, T__24=6, T__23=7, T__22=8, 
		T__21=9, T__20=10, T__19=11, T__18=12, T__17=13, T__16=14, T__15=15, T__14=16, 
		T__13=17, T__12=18, T__11=19, T__10=20, T__9=21, T__8=22, T__7=23, T__6=24, 
		T__5=25, T__4=26, T__3=27, T__2=28, T__1=29, T__0=30, INTEGER=31, IDENTIFIER=32, 
		WHITESPACE=33, OP=34;
	public static final String[] tokenNames = {
		"<INVALID>", "'main'", "'length'", "'return'", "'new'", "'true'", "'class'", 
		"';'", "'while'", "'void'", "'{'", "'='", "'extends'", "'}'", "'if'", 
		"'int'", "'('", "','", "'this'", "'false'", "'.'", "'boolean'", "'System.out.println'", 
		"'['", "'String'", "']'", "'public'", "'!'", "'static'", "'else'", "')'", 
		"INTEGER", "IDENTIFIER", "WHITESPACE", "OP"
	};
	public static final int
		RULE_goal = 0, RULE_mainClass = 1, RULE_classDecl = 2, RULE_statement = 3, 
		RULE_exp = 4, RULE_expList = 5, RULE_expRest = 6, RULE_varDecl = 7, RULE_methodDecl = 8, 
		RULE_formalList = 9, RULE_formal = 10, RULE_type = 11;
	public static final String[] ruleNames = {
		"goal", "mainClass", "classDecl", "statement", "exp", "expList", "expRest", 
		"varDecl", "methodDecl", "formalList", "formal", "type"
	};

	@Override
	public String getGrammarFileName() { return "mvgn.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mvgnParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(mvgnParser.EOF, 0); }
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
		}
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
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
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).exitGoal(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); mainClass();
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(25); classDecl();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31); match(EOF);
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
			return getToken(mvgnParser.IDENTIFIER, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(mvgnParser.IDENTIFIER); }
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).exitMainClass(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); match(T__24);
			setState(34); match(IDENTIFIER);
			setState(35); match(T__20);
			setState(36); match(T__4);
			setState(37); match(T__2);
			setState(38); match(T__21);
			setState(39); match(T__29);
			setState(40); match(T__14);
			setState(41); match(T__6);
			setState(42); match(T__7);
			setState(43); match(T__5);
			setState(44); match(IDENTIFIER);
			setState(45); match(T__0);
			setState(46); match(T__20);
			setState(47); statement();
			setState(48); match(T__17);
			setState(49); match(T__17);
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

	public static class ClassDeclContext extends ParserRuleContext {
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(mvgnParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(mvgnParser.IDENTIFIER); }
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).exitClassDecl(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDecl);
		int _la;
		try {
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51); match(T__24);
				setState(52); match(IDENTIFIER);
				setState(53); match(T__20);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__9) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(54); varDecl();
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
					setState(60); methodDecl();
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(66); match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67); match(T__24);
				setState(68); match(IDENTIFIER);
				{
				setState(69); match(T__18);
				setState(70); match(IDENTIFIER);
				}
				setState(72); match(T__20);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__9) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(73); varDecl();
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(79); methodDecl();
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(85); match(T__17);
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

	public static class StatementContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(mvgnParser.IDENTIFIER, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(129);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88); match(T__20);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__20) | (1L << T__16) | (1L << T__8) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(89); statement();
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(95); match(T__17);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96); match(T__16);
				setState(97); match(T__14);
				setState(98); exp(0);
				setState(99); match(T__0);
				setState(100); statement();
				setState(101); match(T__1);
				setState(102); statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104); match(T__22);
				setState(105); match(T__14);
				setState(106); exp(0);
				setState(107); match(T__0);
				setState(108); statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110); match(T__8);
				setState(111); match(T__14);
				setState(112); exp(0);
				setState(113); match(T__0);
				setState(114); match(T__23);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(116); match(IDENTIFIER);
				setState(117); match(T__19);
				setState(118); exp(0);
				setState(119); match(T__23);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(121); match(IDENTIFIER);
				setState(122); match(T__7);
				setState(123); exp(0);
				setState(124); match(T__5);
				setState(125); match(T__19);
				setState(126); exp(0);
				setState(127); match(T__23);
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

	public static class ExpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpListContext expList() {
			return getRuleContext(ExpListContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(mvgnParser.INTEGER, 0); }
		public TerminalNode OP() { return getToken(mvgnParser.OP, 0); }
		public TerminalNode IDENTIFIER() { return getToken(mvgnParser.IDENTIFIER, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(132); match(T__3);
				setState(133); exp(2);
				}
				break;
			case 2:
				{
				setState(134); match(INTEGER);
				}
				break;
			case 3:
				{
				setState(135); match(T__25);
				}
				break;
			case 4:
				{
				setState(136); match(T__11);
				}
				break;
			case 5:
				{
				setState(137); match(IDENTIFIER);
				}
				break;
			case 6:
				{
				setState(138); match(T__12);
				}
				break;
			case 7:
				{
				setState(139); match(T__26);
				setState(140); match(T__15);
				setState(141); match(T__7);
				setState(142); exp(0);
				setState(143); match(T__5);
				}
				break;
			case 8:
				{
				setState(145); match(T__26);
				setState(146); match(IDENTIFIER);
				setState(147); match(T__14);
				setState(148); match(T__0);
				}
				break;
			case 9:
				{
				setState(149); match(T__14);
				setState(150); exp(0);
				setState(151); match(T__0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(173);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(155);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(156); match(OP);
						setState(157); exp(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(158);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(159); match(T__7);
						setState(160); exp(0);
						setState(161); match(T__5);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(163);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(164); match(T__10);
						setState(165); match(T__28);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(166);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(167); match(T__10);
						setState(168); match(IDENTIFIER);
						setState(169); match(T__14);
						setState(170); expList();
						setState(171); match(T__0);
						}
						break;
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class ExpListContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<ExpRestContext> expRest() {
			return getRuleContexts(ExpRestContext.class);
		}
		public ExpRestContext expRest(int i) {
			return getRuleContext(ExpRestContext.class,i);
		}
		public ExpListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).enterExpList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).exitExpList(this);
		}
	}

	public final ExpListContext expList() throws RecognitionException {
		ExpListContext _localctx = new ExpListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); exp(0);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(179); expRest();
				}
				}
				setState(184);
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

	public static class ExpRestContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).enterExpRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).exitExpRest(this);
		}
	}

	public final ExpRestContext expRest() throws RecognitionException {
		ExpRestContext _localctx = new ExpRestContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); match(T__13);
			setState(186); exp(0);
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

	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(mvgnParser.IDENTIFIER, 0); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); type();
			setState(189); match(IDENTIFIER);
			setState(190); match(T__23);
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

	public static class MethodDeclContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public FormalListContext formalList() {
			return getRuleContext(FormalListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(mvgnParser.IDENTIFIER, 0); }
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).exitMethodDecl(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192); match(T__4);
			setState(193); type();
			setState(194); match(IDENTIFIER);
			setState(195); match(T__14);
			setState(196); formalList();
			setState(197); match(T__0);
			setState(198); match(T__20);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(199); varDecl();
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__20) | (1L << T__16) | (1L << T__8) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(205); statement();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211); match(T__27);
			setState(212); exp(0);
			setState(213); match(T__23);
			setState(214); match(T__17);
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
		public TerminalNode IDENTIFIER() { return getToken(mvgnParser.IDENTIFIER, 0); }
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
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).enterFormalList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).exitFormalList(this);
		}
	}

	public final FormalListContext formalList() throws RecognitionException {
		FormalListContext _localctx = new FormalListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_formalList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); type();
			setState(217); match(IDENTIFIER);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(218); match(T__13);
				setState(219); formal();
				}
				}
				setState(224);
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
		public TerminalNode IDENTIFIER() { return getToken(mvgnParser.IDENTIFIER, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).exitFormal(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); type();
			setState(226); match(IDENTIFIER);
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
		public TerminalNode IDENTIFIER() { return getToken(mvgnParser.IDENTIFIER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mvgnListener ) ((mvgnListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		try {
			setState(234);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228); match(T__15);
				setState(229); match(T__7);
				setState(230); match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231); match(T__15);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232); match(T__9);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(233); match(IDENTIFIER);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 13);
		case 1: return precpred(_ctx, 12);
		case 2: return precpred(_ctx, 11);
		case 3: return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u00ef\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\4\7\4@\n\4\f\4\16\4C\13\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4\3\4\7\4S\n\4\f\4\16\4"+
		"V\13\4\3\4\5\4Y\n\4\3\5\3\5\7\5]\n\5\f\5\16\5`\13\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0084\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u009c\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00b0\n\6\f\6\16\6\u00b3\13\6\3\7\3\7\7"+
		"\7\u00b7\n\7\f\7\16\7\u00ba\13\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\n\u00cb\n\n\f\n\16\n\u00ce\13\n\3\n\7\n\u00d1"+
		"\n\n\f\n\16\n\u00d4\13\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13"+
		"\u00df\n\13\f\13\16\13\u00e2\13\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00ed\n\r\3\r\2\3\n\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\u0101\2"+
		"\32\3\2\2\2\4#\3\2\2\2\6X\3\2\2\2\b\u0083\3\2\2\2\n\u009b\3\2\2\2\f\u00b4"+
		"\3\2\2\2\16\u00bb\3\2\2\2\20\u00be\3\2\2\2\22\u00c2\3\2\2\2\24\u00da\3"+
		"\2\2\2\26\u00e3\3\2\2\2\30\u00ec\3\2\2\2\32\36\5\4\3\2\33\35\5\6\4\2\34"+
		"\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3"+
		"\2\2\2!\"\7\2\2\3\"\3\3\2\2\2#$\7\b\2\2$%\7\"\2\2%&\7\f\2\2&\'\7\34\2"+
		"\2\'(\7\36\2\2()\7\13\2\2)*\7\3\2\2*+\7\22\2\2+,\7\32\2\2,-\7\31\2\2-"+
		".\7\33\2\2./\7\"\2\2/\60\7 \2\2\60\61\7\f\2\2\61\62\5\b\5\2\62\63\7\17"+
		"\2\2\63\64\7\17\2\2\64\5\3\2\2\2\65\66\7\b\2\2\66\67\7\"\2\2\67;\7\f\2"+
		"\28:\5\20\t\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<A\3\2\2\2=;\3\2"+
		"\2\2>@\5\22\n\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3"+
		"\2\2\2DY\7\17\2\2EF\7\b\2\2FG\7\"\2\2GH\7\16\2\2HI\7\"\2\2IJ\3\2\2\2J"+
		"N\7\f\2\2KM\5\20\t\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OT\3\2\2\2"+
		"PN\3\2\2\2QS\5\22\n\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2"+
		"\2VT\3\2\2\2WY\7\17\2\2X\65\3\2\2\2XE\3\2\2\2Y\7\3\2\2\2Z^\7\f\2\2[]\5"+
		"\b\5\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2a"+
		"\u0084\7\17\2\2bc\7\20\2\2cd\7\22\2\2de\5\n\6\2ef\7 \2\2fg\5\b\5\2gh\7"+
		"\37\2\2hi\5\b\5\2i\u0084\3\2\2\2jk\7\n\2\2kl\7\22\2\2lm\5\n\6\2mn\7 \2"+
		"\2no\5\b\5\2o\u0084\3\2\2\2pq\7\30\2\2qr\7\22\2\2rs\5\n\6\2st\7 \2\2t"+
		"u\7\t\2\2u\u0084\3\2\2\2vw\7\"\2\2wx\7\r\2\2xy\5\n\6\2yz\7\t\2\2z\u0084"+
		"\3\2\2\2{|\7\"\2\2|}\7\31\2\2}~\5\n\6\2~\177\7\33\2\2\177\u0080\7\r\2"+
		"\2\u0080\u0081\5\n\6\2\u0081\u0082\7\t\2\2\u0082\u0084\3\2\2\2\u0083Z"+
		"\3\2\2\2\u0083b\3\2\2\2\u0083j\3\2\2\2\u0083p\3\2\2\2\u0083v\3\2\2\2\u0083"+
		"{\3\2\2\2\u0084\t\3\2\2\2\u0085\u0086\b\6\1\2\u0086\u0087\7\35\2\2\u0087"+
		"\u009c\5\n\6\4\u0088\u009c\7!\2\2\u0089\u009c\7\7\2\2\u008a\u009c\7\25"+
		"\2\2\u008b\u009c\7\"\2\2\u008c\u009c\7\24\2\2\u008d\u008e\7\6\2\2\u008e"+
		"\u008f\7\21\2\2\u008f\u0090\7\31\2\2\u0090\u0091\5\n\6\2\u0091\u0092\7"+
		"\33\2\2\u0092\u009c\3\2\2\2\u0093\u0094\7\6\2\2\u0094\u0095\7\"\2\2\u0095"+
		"\u0096\7\22\2\2\u0096\u009c\7 \2\2\u0097\u0098\7\22\2\2\u0098\u0099\5"+
		"\n\6\2\u0099\u009a\7 \2\2\u009a\u009c\3\2\2\2\u009b\u0085\3\2\2\2\u009b"+
		"\u0088\3\2\2\2\u009b\u0089\3\2\2\2\u009b\u008a\3\2\2\2\u009b\u008b\3\2"+
		"\2\2\u009b\u008c\3\2\2\2\u009b\u008d\3\2\2\2\u009b\u0093\3\2\2\2\u009b"+
		"\u0097\3\2\2\2\u009c\u00b1\3\2\2\2\u009d\u009e\f\17\2\2\u009e\u009f\7"+
		"$\2\2\u009f\u00b0\5\n\6\20\u00a0\u00a1\f\16\2\2\u00a1\u00a2\7\31\2\2\u00a2"+
		"\u00a3\5\n\6\2\u00a3\u00a4\7\33\2\2\u00a4\u00b0\3\2\2\2\u00a5\u00a6\f"+
		"\r\2\2\u00a6\u00a7\7\26\2\2\u00a7\u00b0\7\4\2\2\u00a8\u00a9\f\f\2\2\u00a9"+
		"\u00aa\7\26\2\2\u00aa\u00ab\7\"\2\2\u00ab\u00ac\7\22\2\2\u00ac\u00ad\5"+
		"\f\7\2\u00ad\u00ae\7 \2\2\u00ae\u00b0\3\2\2\2\u00af\u009d\3\2\2\2\u00af"+
		"\u00a0\3\2\2\2\u00af\u00a5\3\2\2\2\u00af\u00a8\3\2\2\2\u00b0\u00b3\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\13\3\2\2\2\u00b3\u00b1"+
		"\3\2\2\2\u00b4\u00b8\5\n\6\2\u00b5\u00b7\5\16\b\2\u00b6\u00b5\3\2\2\2"+
		"\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\r\3"+
		"\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7\23\2\2\u00bc\u00bd\5\n\6\2\u00bd"+
		"\17\3\2\2\2\u00be\u00bf\5\30\r\2\u00bf\u00c0\7\"\2\2\u00c0\u00c1\7\t\2"+
		"\2\u00c1\21\3\2\2\2\u00c2\u00c3\7\34\2\2\u00c3\u00c4\5\30\r\2\u00c4\u00c5"+
		"\7\"\2\2\u00c5\u00c6\7\22\2\2\u00c6\u00c7\5\24\13\2\u00c7\u00c8\7 \2\2"+
		"\u00c8\u00cc\7\f\2\2\u00c9\u00cb\5\20\t\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d2\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d1\5\b\5\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d6\7\5\2\2\u00d6\u00d7\5\n\6\2\u00d7\u00d8\7\t"+
		"\2\2\u00d8\u00d9\7\17\2\2\u00d9\23\3\2\2\2\u00da\u00db\5\30\r\2\u00db"+
		"\u00e0\7\"\2\2\u00dc\u00dd\7\23\2\2\u00dd\u00df\5\26\f\2\u00de\u00dc\3"+
		"\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\25\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\5\30\r\2\u00e4\u00e5\7\"\2"+
		"\2\u00e5\27\3\2\2\2\u00e6\u00e7\7\21\2\2\u00e7\u00e8\7\31\2\2\u00e8\u00ed"+
		"\7\33\2\2\u00e9\u00ed\7\21\2\2\u00ea\u00ed\7\27\2\2\u00eb\u00ed\7\"\2"+
		"\2\u00ec\u00e6\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb"+
		"\3\2\2\2\u00ed\31\3\2\2\2\22\36;ANTX^\u0083\u009b\u00af\u00b1\u00b8\u00cc"+
		"\u00d2\u00e0\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}