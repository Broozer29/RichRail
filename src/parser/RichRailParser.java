package parser;
// Generated from RichRail.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RichRailParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ID=14, NUMBER=15, WHITESPACE=16;
	public static final int
		RULE_command = 0, RULE_newcommand = 1, RULE_newtraincommand = 2, RULE_newwagononecommand = 3, 
		RULE_newwagontwocommand = 4, RULE_newwagonthreecommand = 5, RULE_newlocomotivecommand = 6, 
		RULE_addcommand = 7, RULE_getcommand = 8, RULE_delcommand = 9, RULE_remcommand = 10, 
		RULE_type = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"command", "newcommand", "newtraincommand", "newwagononecommand", "newwagontwocommand", 
			"newwagonthreecommand", "newlocomotivecommand", "addcommand", "getcommand", 
			"delcommand", "remcommand", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'new'", "'train'", "'wagon1'", "'numseats'", "'wagon2'", "'wagon3'", 
			"'locomotive'", "'add'", "'to'", "'getnumseats'", "'delete'", "'remove'", 
			"'from'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "NUMBER", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "RichRail.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RichRailParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CommandContext extends ParserRuleContext {
		public NewcommandContext newcommand() {
			return getRuleContext(NewcommandContext.class,0);
		}
		public AddcommandContext addcommand() {
			return getRuleContext(AddcommandContext.class,0);
		}
		public GetcommandContext getcommand() {
			return getRuleContext(GetcommandContext.class,0);
		}
		public DelcommandContext delcommand() {
			return getRuleContext(DelcommandContext.class,0);
		}
		public RemcommandContext remcommand() {
			return getRuleContext(RemcommandContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_command);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				newcommand();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				addcommand();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				getcommand();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
				delcommand();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(28);
				remcommand();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NewcommandContext extends ParserRuleContext {
		public NewtraincommandContext newtraincommand() {
			return getRuleContext(NewtraincommandContext.class,0);
		}
		public NewwagononecommandContext newwagononecommand() {
			return getRuleContext(NewwagononecommandContext.class,0);
		}
		public NewlocomotivecommandContext newlocomotivecommand() {
			return getRuleContext(NewlocomotivecommandContext.class,0);
		}
		public NewwagontwocommandContext newwagontwocommand() {
			return getRuleContext(NewwagontwocommandContext.class,0);
		}
		public NewwagonthreecommandContext newwagonthreecommand() {
			return getRuleContext(NewwagonthreecommandContext.class,0);
		}
		public NewcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newcommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterNewcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitNewcommand(this);
		}
	}

	public final NewcommandContext newcommand() throws RecognitionException {
		NewcommandContext _localctx = new NewcommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_newcommand);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				newtraincommand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				newwagononecommand();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				newlocomotivecommand();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
				newwagontwocommand();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(35);
				newwagonthreecommand();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
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

	public static class NewtraincommandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RichRailParser.ID, 0); }
		public NewtraincommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newtraincommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterNewtraincommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitNewtraincommand(this);
		}
	}

	public final NewtraincommandContext newtraincommand() throws RecognitionException {
		NewtraincommandContext _localctx = new NewtraincommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_newtraincommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__0);
			setState(40);
			match(T__1);
			setState(41);
			match(ID);
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

	public static class NewwagononecommandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RichRailParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(RichRailParser.NUMBER, 0); }
		public NewwagononecommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newwagononecommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterNewwagononecommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitNewwagononecommand(this);
		}
	}

	public final NewwagononecommandContext newwagononecommand() throws RecognitionException {
		NewwagononecommandContext _localctx = new NewwagononecommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_newwagononecommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__0);
			setState(44);
			match(T__2);
			setState(45);
			match(ID);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(46);
				match(T__3);
				setState(47);
				match(NUMBER);
				}
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

	public static class NewwagontwocommandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RichRailParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(RichRailParser.NUMBER, 0); }
		public NewwagontwocommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newwagontwocommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterNewwagontwocommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitNewwagontwocommand(this);
		}
	}

	public final NewwagontwocommandContext newwagontwocommand() throws RecognitionException {
		NewwagontwocommandContext _localctx = new NewwagontwocommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_newwagontwocommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__0);
			setState(51);
			match(T__4);
			setState(52);
			match(ID);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(53);
				match(T__3);
				setState(54);
				match(NUMBER);
				}
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

	public static class NewwagonthreecommandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RichRailParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(RichRailParser.NUMBER, 0); }
		public NewwagonthreecommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newwagonthreecommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterNewwagonthreecommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitNewwagonthreecommand(this);
		}
	}

	public final NewwagonthreecommandContext newwagonthreecommand() throws RecognitionException {
		NewwagonthreecommandContext _localctx = new NewwagonthreecommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_newwagonthreecommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__0);
			setState(58);
			match(T__5);
			setState(59);
			match(ID);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(60);
				match(T__3);
				setState(61);
				match(NUMBER);
				}
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

	public static class NewlocomotivecommandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RichRailParser.ID, 0); }
		public NewlocomotivecommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newlocomotivecommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterNewlocomotivecommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitNewlocomotivecommand(this);
		}
	}

	public final NewlocomotivecommandContext newlocomotivecommand() throws RecognitionException {
		NewlocomotivecommandContext _localctx = new NewlocomotivecommandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_newlocomotivecommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__0);
			setState(65);
			match(T__6);
			setState(66);
			match(ID);
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

	public static class AddcommandContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(RichRailParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RichRailParser.ID, i);
		}
		public AddcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addcommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterAddcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitAddcommand(this);
		}
	}

	public final AddcommandContext addcommand() throws RecognitionException {
		AddcommandContext _localctx = new AddcommandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_addcommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__7);
			setState(69);
			match(ID);
			setState(70);
			match(T__8);
			setState(71);
			match(ID);
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

	public static class GetcommandContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(RichRailParser.ID, 0); }
		public GetcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getcommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterGetcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitGetcommand(this);
		}
	}

	public final GetcommandContext getcommand() throws RecognitionException {
		GetcommandContext _localctx = new GetcommandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_getcommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__9);
			setState(74);
			type();
			setState(75);
			match(ID);
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

	public static class DelcommandContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(RichRailParser.ID, 0); }
		public DelcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delcommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterDelcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitDelcommand(this);
		}
	}

	public final DelcommandContext delcommand() throws RecognitionException {
		DelcommandContext _localctx = new DelcommandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_delcommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__10);
			setState(78);
			type();
			setState(79);
			match(ID);
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

	public static class RemcommandContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(RichRailParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RichRailParser.ID, i);
		}
		public RemcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remcommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterRemcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitRemcommand(this);
		}
	}

	public final RemcommandContext remcommand() throws RecognitionException {
		RemcommandContext _localctx = new RemcommandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_remcommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__11);
			setState(82);
			match(ID);
			setState(83);
			match(T__12);
			setState(84);
			match(ID);
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RichRailListener ) ((RichRailListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(86);
				match(T__1);
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(87);
				match(T__2);
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(88);
				match(T__6);
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(89);
				match(T__4);
				}
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(90);
				match(T__5);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22`\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\5\2 \n\2\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3(\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5\63\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\5\6:\n\6\3\7\3\7\3\7\3\7\3\7\5\7A\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\5\r^\n\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2"+
		"c\2\37\3\2\2\2\4\'\3\2\2\2\6)\3\2\2\2\b-\3\2\2\2\n\64\3\2\2\2\f;\3\2\2"+
		"\2\16B\3\2\2\2\20F\3\2\2\2\22K\3\2\2\2\24O\3\2\2\2\26S\3\2\2\2\30]\3\2"+
		"\2\2\32 \5\4\3\2\33 \5\20\t\2\34 \5\22\n\2\35 \5\24\13\2\36 \5\26\f\2"+
		"\37\32\3\2\2\2\37\33\3\2\2\2\37\34\3\2\2\2\37\35\3\2\2\2\37\36\3\2\2\2"+
		" \3\3\2\2\2!(\5\6\4\2\"(\5\b\5\2#(\5\16\b\2$(\5\n\6\2%(\5\f\7\2&(\3\2"+
		"\2\2\'!\3\2\2\2\'\"\3\2\2\2\'#\3\2\2\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2"+
		"\2(\5\3\2\2\2)*\7\3\2\2*+\7\4\2\2+,\7\20\2\2,\7\3\2\2\2-.\7\3\2\2./\7"+
		"\5\2\2/\62\7\20\2\2\60\61\7\6\2\2\61\63\7\21\2\2\62\60\3\2\2\2\62\63\3"+
		"\2\2\2\63\t\3\2\2\2\64\65\7\3\2\2\65\66\7\7\2\2\669\7\20\2\2\678\7\6\2"+
		"\28:\7\21\2\29\67\3\2\2\29:\3\2\2\2:\13\3\2\2\2;<\7\3\2\2<=\7\b\2\2=@"+
		"\7\20\2\2>?\7\6\2\2?A\7\21\2\2@>\3\2\2\2@A\3\2\2\2A\r\3\2\2\2BC\7\3\2"+
		"\2CD\7\t\2\2DE\7\20\2\2E\17\3\2\2\2FG\7\n\2\2GH\7\20\2\2HI\7\13\2\2IJ"+
		"\7\20\2\2J\21\3\2\2\2KL\7\f\2\2LM\5\30\r\2MN\7\20\2\2N\23\3\2\2\2OP\7"+
		"\r\2\2PQ\5\30\r\2QR\7\20\2\2R\25\3\2\2\2ST\7\16\2\2TU\7\20\2\2UV\7\17"+
		"\2\2VW\7\20\2\2W\27\3\2\2\2X^\7\4\2\2Y^\7\5\2\2Z^\7\t\2\2[^\7\7\2\2\\"+
		"^\7\b\2\2]X\3\2\2\2]Y\3\2\2\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2^\31\3\2\2"+
		"\2\b\37\'\629@]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}