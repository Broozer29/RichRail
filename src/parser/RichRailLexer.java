package parser;

// Generated from RichRail.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RichRailLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ID=14, NUMBER=15, WHITESPACE=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "ID", "NUMBER", "WHITESPACE"
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


	public RichRailLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RichRail.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u008f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\7\17\177\n\17\f\17\16\17\u0082\13\17\3\20\6"+
		"\20\u0085\n\20\r\20\16\20\u0086\3\21\6\21\u008a\n\21\r\21\16\21\u008b"+
		"\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22\3\2\4\4\2\62;c|\5\2\13\f\16\17\"\"\2\u0091\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2"+
		"\2\5\'\3\2\2\2\7-\3\2\2\2\t\64\3\2\2\2\13=\3\2\2\2\rD\3\2\2\2\17K\3\2"+
		"\2\2\21V\3\2\2\2\23Z\3\2\2\2\25]\3\2\2\2\27i\3\2\2\2\31p\3\2\2\2\33w\3"+
		"\2\2\2\35|\3\2\2\2\37\u0084\3\2\2\2!\u0089\3\2\2\2#$\7p\2\2$%\7g\2\2%"+
		"&\7y\2\2&\4\3\2\2\2\'(\7v\2\2()\7t\2\2)*\7c\2\2*+\7k\2\2+,\7p\2\2,\6\3"+
		"\2\2\2-.\7y\2\2./\7c\2\2/\60\7i\2\2\60\61\7q\2\2\61\62\7p\2\2\62\63\7"+
		"\63\2\2\63\b\3\2\2\2\64\65\7p\2\2\65\66\7w\2\2\66\67\7o\2\2\678\7u\2\2"+
		"89\7g\2\29:\7c\2\2:;\7v\2\2;<\7u\2\2<\n\3\2\2\2=>\7y\2\2>?\7c\2\2?@\7"+
		"i\2\2@A\7q\2\2AB\7p\2\2BC\7\64\2\2C\f\3\2\2\2DE\7y\2\2EF\7c\2\2FG\7i\2"+
		"\2GH\7q\2\2HI\7p\2\2IJ\7\65\2\2J\16\3\2\2\2KL\7n\2\2LM\7q\2\2MN\7e\2\2"+
		"NO\7q\2\2OP\7o\2\2PQ\7q\2\2QR\7v\2\2RS\7k\2\2ST\7x\2\2TU\7g\2\2U\20\3"+
		"\2\2\2VW\7c\2\2WX\7f\2\2XY\7f\2\2Y\22\3\2\2\2Z[\7v\2\2[\\\7q\2\2\\\24"+
		"\3\2\2\2]^\7i\2\2^_\7g\2\2_`\7v\2\2`a\7p\2\2ab\7w\2\2bc\7o\2\2cd\7u\2"+
		"\2de\7g\2\2ef\7c\2\2fg\7v\2\2gh\7u\2\2h\26\3\2\2\2ij\7f\2\2jk\7g\2\2k"+
		"l\7n\2\2lm\7g\2\2mn\7v\2\2no\7g\2\2o\30\3\2\2\2pq\7t\2\2qr\7g\2\2rs\7"+
		"o\2\2st\7q\2\2tu\7x\2\2uv\7g\2\2v\32\3\2\2\2wx\7h\2\2xy\7t\2\2yz\7q\2"+
		"\2z{\7o\2\2{\34\3\2\2\2|\u0080\4c|\2}\177\t\2\2\2~}\3\2\2\2\177\u0082"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\36\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0083\u0085\4\62;\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087 \3\2\2\2\u0088\u008a\t\3\2\2"+
		"\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\b\21\2\2\u008e\"\3\2\2\2\6\2"+
		"\u0080\u0086\u008b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}