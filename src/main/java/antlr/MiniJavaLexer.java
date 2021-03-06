package antlr;// Generated by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		If=1, ELSE=2, THIS=3, CLASS=4, RETURN=5, While=6, FOR=7, DO=8, PUBLIC=9, 
		PRIVATE=10, STATIC=11, INT=12, VOID=13, BOOLEAN=14, FALSE=15, TRUE=16, 
		NEW=17, Semicolon=18, Point=19, OpenACC=20, CloseAcc=21, OpenPar=22, ClosePar=23, 
		OpenBar=24, CloseBar=25, Comma=26, Mul=27, Divide=28, Plus=29, Minus=30, 
		Equal=31, Assign=32, Great=33, GAndE=34, Small=35, SAndE=36, NotEqual=37, 
		Not=38, AND=39, OR=40, ERROR=41, Id=42, Number=43, String=44, Ws=45, Comment=46, 
		LineComment=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"If", "ELSE", "THIS", "CLASS", "RETURN", "While", "FOR", "DO", "PUBLIC", 
			"PRIVATE", "STATIC", "INT", "VOID", "BOOLEAN", "FALSE", "TRUE", "NEW", 
			"Semicolon", "Point", "OpenACC", "CloseAcc", "OpenPar", "ClosePar", "OpenBar", 
			"CloseBar", "Comma", "Mul", "Divide", "Plus", "Minus", "Equal", "Assign", 
			"Great", "GAndE", "Small", "SAndE", "NotEqual", "Not", "AND", "OR", "ERROR", 
			"Id", "Number", "String", "Ws", "Comment", "LineComment", "Letter", "Digit"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'this'", "'class'", "'return'", "'while'", "'for'", 
			"'do'", "'public'", "'private'", "'static'", "'int'", "'void'", "'boolean'", 
			"'false'", "'true'", "'new'", "';'", "'.'", "'{'", "'}'", "'('", "')'", 
			"'['", "']'", "','", "'*'", "'/'", "'+'", "'-'", "'=='", "'='", "'>'", 
			"'>='", "'<'", "'<='", "'!='", "'!'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "If", "ELSE", "THIS", "CLASS", "RETURN", "While", "FOR", "DO", 
			"PUBLIC", "PRIVATE", "STATIC", "INT", "VOID", "BOOLEAN", "FALSE", "TRUE", 
			"NEW", "Semicolon", "Point", "OpenACC", "CloseAcc", "OpenPar", "ClosePar", 
			"OpenBar", "CloseBar", "Comma", "Mul", "Divide", "Plus", "Minus", "Equal", 
			"Assign", "Great", "GAndE", "Small", "SAndE", "NotEqual", "Not", "AND", 
			"OR", "ERROR", "Id", "Number", "String", "Ws", "Comment", "LineComment"
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


	public MiniJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "antlr/MiniJava.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u013c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3"+
		"$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\6*\u00f8\n*\r*\16"+
		"*\u00f9\3*\6*\u00fd\n*\r*\16*\u00fe\3+\3+\3+\7+\u0104\n+\f+\16+\u0107"+
		"\13+\3,\6,\u010a\n,\r,\16,\u010b\3-\3-\7-\u0110\n-\f-\16-\u0113\13-\3"+
		"-\3-\3.\6.\u0118\n.\r.\16.\u0119\3.\3.\3/\3/\3/\3/\7/\u0122\n/\f/\16/"+
		"\u0125\13/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\7\60\u0130\n\60\f\60\16"+
		"\60\u0133\13\60\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\5\u0111\u0123"+
		"\u0131\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\2c\2\3\2\5\5\2"+
		"\13\f\17\17\"\"\4\2C\\c|\3\2\62;\2\u0142\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3e\3\2\2\2\5h\3\2\2\2\7m\3\2\2\2\t"+
		"r\3\2\2\2\13x\3\2\2\2\r\177\3\2\2\2\17\u0085\3\2\2\2\21\u0089\3\2\2\2"+
		"\23\u008c\3\2\2\2\25\u0093\3\2\2\2\27\u009b\3\2\2\2\31\u00a2\3\2\2\2\33"+
		"\u00a6\3\2\2\2\35\u00ab\3\2\2\2\37\u00b3\3\2\2\2!\u00b9\3\2\2\2#\u00be"+
		"\3\2\2\2%\u00c2\3\2\2\2\'\u00c4\3\2\2\2)\u00c6\3\2\2\2+\u00c8\3\2\2\2"+
		"-\u00ca\3\2\2\2/\u00cc\3\2\2\2\61\u00ce\3\2\2\2\63\u00d0\3\2\2\2\65\u00d2"+
		"\3\2\2\2\67\u00d4\3\2\2\29\u00d6\3\2\2\2;\u00d8\3\2\2\2=\u00da\3\2\2\2"+
		"?\u00dc\3\2\2\2A\u00df\3\2\2\2C\u00e1\3\2\2\2E\u00e3\3\2\2\2G\u00e6\3"+
		"\2\2\2I\u00e8\3\2\2\2K\u00eb\3\2\2\2M\u00ee\3\2\2\2O\u00f0\3\2\2\2Q\u00f3"+
		"\3\2\2\2S\u00f7\3\2\2\2U\u0100\3\2\2\2W\u0109\3\2\2\2Y\u010d\3\2\2\2["+
		"\u0117\3\2\2\2]\u011d\3\2\2\2_\u012b\3\2\2\2a\u0138\3\2\2\2c\u013a\3\2"+
		"\2\2ef\7k\2\2fg\7h\2\2g\4\3\2\2\2hi\7g\2\2ij\7n\2\2jk\7u\2\2kl\7g\2\2"+
		"l\6\3\2\2\2mn\7v\2\2no\7j\2\2op\7k\2\2pq\7u\2\2q\b\3\2\2\2rs\7e\2\2st"+
		"\7n\2\2tu\7c\2\2uv\7u\2\2vw\7u\2\2w\n\3\2\2\2xy\7t\2\2yz\7g\2\2z{\7v\2"+
		"\2{|\7w\2\2|}\7t\2\2}~\7p\2\2~\f\3\2\2\2\177\u0080\7y\2\2\u0080\u0081"+
		"\7j\2\2\u0081\u0082\7k\2\2\u0082\u0083\7n\2\2\u0083\u0084\7g\2\2\u0084"+
		"\16\3\2\2\2\u0085\u0086\7h\2\2\u0086\u0087\7q\2\2\u0087\u0088\7t\2\2\u0088"+
		"\20\3\2\2\2\u0089\u008a\7f\2\2\u008a\u008b\7q\2\2\u008b\22\3\2\2\2\u008c"+
		"\u008d\7r\2\2\u008d\u008e\7w\2\2\u008e\u008f\7d\2\2\u008f\u0090\7n\2\2"+
		"\u0090\u0091\7k\2\2\u0091\u0092\7e\2\2\u0092\24\3\2\2\2\u0093\u0094\7"+
		"r\2\2\u0094\u0095\7t\2\2\u0095\u0096\7k\2\2\u0096\u0097\7x\2\2\u0097\u0098"+
		"\7c\2\2\u0098\u0099\7v\2\2\u0099\u009a\7g\2\2\u009a\26\3\2\2\2\u009b\u009c"+
		"\7u\2\2\u009c\u009d\7v\2\2\u009d\u009e\7c\2\2\u009e\u009f\7v\2\2\u009f"+
		"\u00a0\7k\2\2\u00a0\u00a1\7e\2\2\u00a1\30\3\2\2\2\u00a2\u00a3\7k\2\2\u00a3"+
		"\u00a4\7p\2\2\u00a4\u00a5\7v\2\2\u00a5\32\3\2\2\2\u00a6\u00a7\7x\2\2\u00a7"+
		"\u00a8\7q\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7f\2\2\u00aa\34\3\2\2\2\u00ab"+
		"\u00ac\7d\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7n\2\2"+
		"\u00af\u00b0\7g\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7p\2\2\u00b2\36\3\2"+
		"\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7"+
		"\7u\2\2\u00b7\u00b8\7g\2\2\u00b8 \3\2\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb"+
		"\7t\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7g\2\2\u00bd\"\3\2\2\2\u00be\u00bf"+
		"\7p\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7y\2\2\u00c1$\3\2\2\2\u00c2\u00c3"+
		"\7=\2\2\u00c3&\3\2\2\2\u00c4\u00c5\7\60\2\2\u00c5(\3\2\2\2\u00c6\u00c7"+
		"\7}\2\2\u00c7*\3\2\2\2\u00c8\u00c9\7\177\2\2\u00c9,\3\2\2\2\u00ca\u00cb"+
		"\7*\2\2\u00cb.\3\2\2\2\u00cc\u00cd\7+\2\2\u00cd\60\3\2\2\2\u00ce\u00cf"+
		"\7]\2\2\u00cf\62\3\2\2\2\u00d0\u00d1\7_\2\2\u00d1\64\3\2\2\2\u00d2\u00d3"+
		"\7.\2\2\u00d3\66\3\2\2\2\u00d4\u00d5\7,\2\2\u00d58\3\2\2\2\u00d6\u00d7"+
		"\7\61\2\2\u00d7:\3\2\2\2\u00d8\u00d9\7-\2\2\u00d9<\3\2\2\2\u00da\u00db"+
		"\7/\2\2\u00db>\3\2\2\2\u00dc\u00dd\7?\2\2\u00dd\u00de\7?\2\2\u00de@\3"+
		"\2\2\2\u00df\u00e0\7?\2\2\u00e0B\3\2\2\2\u00e1\u00e2\7@\2\2\u00e2D\3\2"+
		"\2\2\u00e3\u00e4\7@\2\2\u00e4\u00e5\7?\2\2\u00e5F\3\2\2\2\u00e6\u00e7"+
		"\7>\2\2\u00e7H\3\2\2\2\u00e8\u00e9\7>\2\2\u00e9\u00ea\7?\2\2\u00eaJ\3"+
		"\2\2\2\u00eb\u00ec\7#\2\2\u00ec\u00ed\7?\2\2\u00edL\3\2\2\2\u00ee\u00ef"+
		"\7#\2\2\u00efN\3\2\2\2\u00f0\u00f1\7(\2\2\u00f1\u00f2\7(\2\2\u00f2P\3"+
		"\2\2\2\u00f3\u00f4\7~\2\2\u00f4\u00f5\7~\2\2\u00f5R\3\2\2\2\u00f6\u00f8"+
		"\5c\62\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00fd\5a\61\2\u00fc\u00fb\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"T\3\2\2\2\u0100\u0105\5a\61\2\u0101\u0104\5a\61\2\u0102\u0104\5c\62\2"+
		"\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106V\3\2\2\2\u0107\u0105\3\2\2\2\u0108"+
		"\u010a\5c\62\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010b\u010c\3\2\2\2\u010cX\3\2\2\2\u010d\u0111\7$\2\2\u010e\u0110"+
		"\13\2\2\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u0112\3\2\2\2"+
		"\u0111\u010f\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115"+
		"\7$\2\2\u0115Z\3\2\2\2\u0116\u0118\t\2\2\2\u0117\u0116\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011c\b.\2\2\u011c\\\3\2\2\2\u011d\u011e\7\61\2\2\u011e\u011f\7,\2\2"+
		"\u011f\u0123\3\2\2\2\u0120\u0122\13\2\2\2\u0121\u0120\3\2\2\2\u0122\u0125"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0126\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0126\u0127\7,\2\2\u0127\u0128\7\61\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012a\b/\2\2\u012a^\3\2\2\2\u012b\u012c\7\61\2\2\u012c\u012d"+
		"\7\61\2\2\u012d\u0131\3\2\2\2\u012e\u0130\13\2\2\2\u012f\u012e\3\2\2\2"+
		"\u0130\u0133\3\2\2\2\u0131\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0134"+
		"\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\7\f\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\b\60\2\2\u0137`\3\2\2\2\u0138\u0139\t\3\2\2\u0139b\3\2\2\2\u013a"+
		"\u013b\t\4\2\2\u013bd\3\2\2\2\f\2\u00f9\u00fe\u0103\u0105\u010b\u0111"+
		"\u0119\u0123\u0131\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}