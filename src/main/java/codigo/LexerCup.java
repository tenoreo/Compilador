/* The following code was generated by JFlex 1.4.3 on 4/21/22, 11:20 PM */

package codigo;
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 4/21/22, 11:20 PM from the specification file
 * <tt>K:/Trabajos/bases/Compiladores/src/main/java/codigo/LexerCup.flex</tt>
 */
class LexerCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  2,  0,  0,  1,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     1, 47,  6, 14,  0,  0, 48,  8, 31, 32, 12, 42, 33,  9, 13,  7, 
     4,  5,  5,  5,  5,  5,  5,  5,  5,  5, 41,  0, 45, 17, 46,  0, 
    11,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3, 
     3,  3,  3,  3,  3,  3,  3,  3,  3,  3,  3, 29,  0, 30, 43, 10, 
     0, 19, 39, 38, 26, 23, 34, 51, 37, 20,  3, 40, 28, 18, 21, 50, 
    27,  3, 22, 35, 24, 25,  3, 36,  3, 52,  3, 15, 49, 16, 44,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\1\1\3\1\4\2\5\1\2\1\6"+
    "\1\2\1\7\1\2\1\10\1\11\1\12\1\13\1\14"+
    "\11\4\1\15\1\16\1\17\1\20\1\21\5\4\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\3\0\1\34\2\0\1\35\3\4\1\36\17\4"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\0\1\45"+
    "\1\0\1\45\2\4\1\46\20\4\3\0\1\47\1\4"+
    "\1\50\1\51\1\4\1\52\1\53\7\4\1\54\1\55"+
    "\1\4\1\56\1\45\1\57\2\4\1\60\1\61\1\62"+
    "\2\4\1\63\1\64\1\65\1\4\1\66\1\67\1\70";

  private static int [] zzUnpackAction() {
    int [] result = new int[138];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\65\0\152\0\152\0\237\0\324\0\u0109\0\u013e"+
    "\0\65\0\u0173\0\u01a8\0\u01dd\0\65\0\65\0\65\0\65"+
    "\0\u0212\0\u0247\0\u027c\0\u02b1\0\u02e6\0\u031b\0\u0350\0\u0385"+
    "\0\u03ba\0\u03ef\0\65\0\65\0\65\0\65\0\65\0\u0424"+
    "\0\u0459\0\u048e\0\u04c3\0\u04f8\0\65\0\u052d\0\65\0\65"+
    "\0\u0562\0\u0597\0\u05cc\0\65\0\65\0\u0601\0\u0636\0\u066b"+
    "\0\324\0\u06a0\0\u06d5\0\u070a\0\65\0\u073f\0\u0774\0\u07a9"+
    "\0\237\0\u07de\0\u0813\0\u0848\0\u087d\0\u08b2\0\u08e7\0\u091c"+
    "\0\u0951\0\u0986\0\u09bb\0\u09f0\0\u0a25\0\u0a5a\0\u0a8f\0\u0ac4"+
    "\0\65\0\65\0\65\0\65\0\65\0\65\0\u0af9\0\65"+
    "\0\u0b2e\0\u0b63\0\u0b98\0\u0bcd\0\237\0\u0c02\0\u0c37\0\u0c6c"+
    "\0\u0ca1\0\u0cd6\0\u0d0b\0\u0d40\0\u0d75\0\u0daa\0\u0ddf\0\u0e14"+
    "\0\u0e49\0\u0e7e\0\u0eb3\0\u0ee8\0\u0f1d\0\u0f52\0\u0b63\0\u0f87"+
    "\0\237\0\u0fbc\0\237\0\237\0\u0ff1\0\237\0\237\0\u1026"+
    "\0\u105b\0\u1090\0\u10c5\0\u10fa\0\u112f\0\u1164\0\237\0\237"+
    "\0\u1199\0\237\0\u06d5\0\237\0\u11ce\0\u1203\0\237\0\237"+
    "\0\237\0\u1238\0\u126d\0\237\0\237\0\237\0\u12a2\0\237"+
    "\0\237\0\237";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[138];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\5\1\14\1\15\1\2\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\5\1\31\1\32\1\5\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\5\1\43\1\44"+
    "\1\5\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\3\5\66\0\2\3\65\0\3\5\4\0"+
    "\1\5\7\0\13\5\5\0\7\5\11\0\3\5\15\0"+
    "\1\56\53\0\2\7\7\0\1\56\47\0\2\57\1\0"+
    "\3\57\1\0\56\57\3\0\1\60\16\0\13\60\5\0"+
    "\7\60\11\0\3\60\4\0\1\61\1\7\3\0\1\62"+
    "\53\0\2\63\1\0\11\63\1\64\50\63\21\0\1\65"+
    "\46\0\3\5\4\0\1\5\7\0\1\5\1\66\11\5"+
    "\5\0\7\5\11\0\3\5\3\0\3\5\4\0\1\5"+
    "\7\0\4\5\1\67\6\5\5\0\7\5\11\0\3\5"+
    "\3\0\3\5\4\0\1\5\7\0\3\5\1\70\7\5"+
    "\5\0\1\71\6\5\11\0\3\5\3\0\3\5\4\0"+
    "\1\5\7\0\7\5\1\72\3\5\5\0\7\5\11\0"+
    "\3\5\3\0\3\5\4\0\1\5\7\0\5\5\1\73"+
    "\5\5\5\0\7\5\11\0\3\5\3\0\3\5\4\0"+
    "\1\5\7\0\12\5\1\74\5\0\7\5\11\0\3\5"+
    "\3\0\3\5\4\0\1\5\7\0\4\5\1\75\6\5"+
    "\5\0\7\5\11\0\3\5\3\0\3\5\4\0\1\5"+
    "\7\0\5\5\1\76\5\5\5\0\7\5\11\0\3\5"+
    "\3\0\3\5\4\0\1\5\7\0\4\5\1\77\6\5"+
    "\5\0\7\5\11\0\3\5\3\0\3\5\4\0\1\5"+
    "\7\0\1\5\1\100\10\5\1\101\5\0\7\5\11\0"+
    "\3\5\3\0\3\5\4\0\1\5\7\0\6\5\1\102"+
    "\4\5\5\0\2\5\1\103\4\5\11\0\3\5\3\0"+
    "\3\5\4\0\1\5\7\0\13\5\5\0\3\5\1\104"+
    "\3\5\11\0\3\5\3\0\3\5\4\0\1\5\7\0"+
    "\1\5\1\105\11\5\5\0\3\5\1\106\3\5\11\0"+
    "\3\5\3\0\3\5\4\0\1\5\7\0\4\5\1\107"+
    "\6\5\5\0\7\5\11\0\1\110\2\5\52\0\1\111"+
    "\33\0\1\112\64\0\1\113\64\0\1\114\47\0\2\56"+
    "\57\0\2\57\1\0\3\57\1\115\56\57\10\0\1\116"+
    "\61\0\1\117\57\0\2\63\1\120\62\63\2\121\1\122"+
    "\4\121\1\63\4\121\1\63\22\121\2\63\24\121\3\0"+
    "\3\5\4\0\1\5\7\0\2\5\1\123\10\5\5\0"+
    "\7\5\11\0\3\5\3\0\3\5\4\0\1\5\7\0"+
    "\4\5\1\124\6\5\5\0\7\5\11\0\3\5\3\0"+
    "\3\5\4\0\1\5\7\0\6\5\1\125\4\5\5\0"+
    "\7\5\11\0\3\5\3\0\3\5\4\0\1\5\7\0"+
    "\12\5\1\126\5\0\7\5\11\0\3\5\3\0\3\5"+
    "\4\0\1\5\7\0\1\5\1\127\4\5\1\130\4\5"+
    "\5\0\7\5\11\0\3\5\3\0\3\5\4\0\1\5"+
    "\7\0\13\5\5\0\1\5\1\131\5\5\11\0\3\5"+
    "\3\0\3\5\4\0\1\5\7\0\7\5\1\132\3\5"+
    "\5\0\7\5\11\0\3\5\3\0\3\5\4\0\1\5"+
    "\7\0\13\5\5\0\1\133\6\5\11\0\3\5\3\0"+
    "\3\5\4\0\1\5\7\0\2\5\1\134\10\5\5\0"+
    "\7\5\11\0\3\5\3\0\3\5\4\0\1\5\7\0"+
    "\12\5\1\135\5\0\7\5\11\0\3\5\3\0\3\5"+
    "\4\0\1\5\7\0\13\5\5\0\7\5\11\0\1\136"+
    "\2\5\3\0\3\5\4\0\1\5\7\0\4\5\1\137"+
    "\6\5\5\0\7\5\11\0\3\5\3\0\3\5\4\0"+
    "\1\5\7\0\2\5\1\140\10\5\5\0\7\5\11\0"+
    "\3\5\3\0\3\5\4\0\1\5\7\0\2\5\1\141"+
    "\10\5\5\0\7\5\11\0\3\5\3\0\3\5\4\0"+
    "\1\5\7\0\13\5\5\0\1\5\1\142\5\5\11\0"+
    "\3\5\3\0\3\5\4\0\1\5\7\0\1\5\1\143"+
    "\11\5\5\0\7\5\11\0\3\5\3\0\3\5\4\0"+
    "\1\5\7\0\5\5\1\144\5\5\5\0\7\5\11\0"+
    "\3\5\3\0\3\5\4\0\1\5\7\0\13\5\5\0"+
    "\7\5\11\0\1\145\2\5\4\0\2\117\7\0\1\56"+
    "\47\0\2\121\1\122\4\121\1\63\4\121\1\146\22\121"+
    "\2\63\24\121\7\147\1\0\4\147\1\150\22\147\2\0"+
    "\24\147\3\0\3\5\4\0\1\5\7\0\3\5\1\151"+
    "\7\5\5\0\7\5\11\0\3\5\3\0\3\5\4\0"+
    "\1\5\7\0\1\5\1\152\11\5\5\0\7\5\11\0"+
    "\3\5\3\0\3\5\4\0\1\5\7\0\12\5\1\153"+
    "\5\0\7\5\11\0\3\5\3\0\3\5\4\0\1\5"+
    "\7\0\10\5\1\154\2\5\5\0\7\5\11\0\3\5"+
    "\3\0\3\5\4\0\1\5\7\0\7\5\1\155\3\5"+
    "\5\0\7\5\11\0\3\5\3\0\3\5\4\0\1\5"+
    "\7\0\5\5\1\156\5\5\5\0\7\5\11\0\3\5"+
    "\3\0\3\5\4\0\1\5\7\0\5\5\1\157\5\5"+
    "\5\0\7\5\11\0\3\5\3\0\3\5\4\0\1\5"+
    "\7\0\1\5\1\160\11\5\5\0\7\5\11\0\3\5"+
    "\3\0\3\5\4\0\1\5\7\0\3\5\1\161\7\5"+
    "\5\0\7\5\11\0\3\5\3\0\3\5\4\0\1\5"+
    "\7\0\13\5\5\0\1\5\1\162\5\5\11\0\3\5"+
    "\3\0\3\5\4\0\1\5\7\0\1\5\1\163\11\5"+
    "\5\0\7\5\11\0\3\5\3\0\3\5\4\0\1\5"+
    "\7\0\2\5\1\164\10\5\5\0\7\5\11\0\3\5"+
    "\3\0\3\5\4\0\1\5\7\0\6\5\1\165\4\5"+
    "\5\0\7\5\11\0\3\5\3\0\3\5\4\0\1\5"+
    "\7\0\12\5\1\166\5\0\7\5\11\0\3\5\3\0"+
    "\3\5\4\0\1\5\7\0\5\5\1\167\5\5\5\0"+
    "\7\5\11\0\3\5\3\0\3\5\4\0\1\5\7\0"+
    "\4\5\1\170\6\5\5\0\7\5\11\0\3\5\3\0"+
    "\3\5\4\0\1\5\7\0\1\5\1\171\11\5\5\0"+
    "\7\5\11\0\3\5\3\0\3\5\4\0\1\5\7\0"+
    "\12\5\1\172\5\0\7\5\11\0\3\5\2\63\1\120"+
    "\10\63\1\173\51\63\13\0\1\120\54\0\3\5\4\0"+
    "\1\5\7\0\13\5\5\0\7\5\11\0\2\5\1\174"+
    "\3\0\3\5\4\0\1\5\7\0\4\5\1\175\6\5"+
    "\5\0\7\5\11\0\3\5\3\0\3\5\4\0\1\5"+
    "\7\0\7\5\1\176\3\5\5\0\7\5\11\0\3\5"+
    "\3\0\3\5\4\0\1\5\7\0\6\5\1\177\4\5"+
    "\5\0\7\5\11\0\3\5\3\0\3\5\4\0\1\5"+
    "\7\0\5\5\1\200\5\5\5\0\7\5\11\0\3\5"+
    "\3\0\3\5\4\0\1\5\7\0\6\5\1\201\4\5"+
    "\5\0\7\5\11\0\3\5\3\0\3\5\4\0\1\5"+
    "\7\0\3\5\1\202\7\5\5\0\7\5\11\0\3\5"+
    "\3\0\3\5\4\0\1\5\7\0\13\5\5\0\4\5"+
    "\1\203\2\5\11\0\3\5\3\0\3\5\4\0\1\5"+
    "\7\0\5\5\1\204\5\5\5\0\7\5\11\0\3\5"+
    "\3\0\3\5\4\0\1\5\7\0\13\5\5\0\6\5"+
    "\1\205\11\0\3\5\3\0\3\5\4\0\1\5\7\0"+
    "\3\5\1\206\7\5\5\0\7\5\11\0\3\5\3\0"+
    "\3\5\4\0\1\5\7\0\12\5\1\207\5\0\7\5"+
    "\11\0\3\5\3\0\3\5\4\0\1\5\7\0\13\5"+
    "\5\0\7\5\11\0\1\5\1\210\1\5\3\0\3\5"+
    "\4\0\1\5\7\0\13\5\5\0\3\5\1\211\3\5"+
    "\11\0\3\5\3\0\3\5\4\0\1\5\7\0\6\5"+
    "\1\212\4\5\5\0\7\5\11\0\3\5";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4823];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\11\6\1\1\11\3\1\4\11\12\1\5\11"+
    "\5\1\1\11\1\1\2\11\3\1\2\11\1\1\3\0"+
    "\1\1\2\0\1\11\23\1\6\11\1\0\1\11\1\0"+
    "\24\1\3\0\42\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[138];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type,yyline,yycolumn,value);
    }

    private Symbol symbol(int type){
        return new Symbol(type,yyline,yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 52: 
          { return new Symbol(sym.simb_break, yychar, yyline, yytext());
          }
        case 57: break;
        case 30: 
          { return new Symbol(sym.simb_if, yychar, yyline, yytext());
          }
        case 58: break;
        case 32: 
          { return new Symbol(sym.simb_menor_igual, yychar, yyline, yytext());
          }
        case 59: break;
        case 48: 
          { return new Symbol(sym.simb_output, yychar, yyline, yytext());
          }
        case 60: break;
        case 5: 
          { return new Symbol(sym.Int, yychar, yyline, yytext());
          }
        case 61: break;
        case 17: 
          { return new Symbol(sym.simb_coma, yychar, yyline, yytext());
          }
        case 62: break;
        case 28: 
          { return new Symbol(sym.simb_decremento, yychar, yyline, yytext());
          }
        case 63: break;
        case 14: 
          { return new Symbol(sym.fin_arreglo, yychar, yyline, yytext());
          }
        case 64: break;
        case 23: 
          { return new Symbol(sym.simb_mayor_que, yychar, yyline, yytext());
          }
        case 65: break;
        case 33: 
          { return new Symbol(sym.simb_mayor_igual, yychar, yyline, yytext());
          }
        case 66: break;
        case 7: 
          { return new Symbol(sym.simb_negativo, yychar, yyline, yytext());
          }
        case 67: break;
        case 43: 
          { return new Symbol(sym.verdadero, yychar, yyline, yytext());
          }
        case 68: break;
        case 50: 
          { return new Symbol(sym.tipo_float, yychar, yyline, yytext());
          }
        case 69: break;
        case 15: 
          { return new Symbol(sym.ini_parentesis, yychar, yyline, yytext());
          }
        case 70: break;
        case 10: 
          { return new Symbol(sym.ini_bloque, yychar, yyline, yytext());
          }
        case 71: break;
        case 3: 
          { /**/
          }
        case 72: break;
        case 26: 
          { return new Symbol(sym.simb_disyuncion, yychar, yyline, yytext());
          }
        case 73: break;
        case 24: 
          { return new Symbol(sym.simb_negacion, yychar, yyline, yytext());
          }
        case 74: break;
        case 42: 
          { return new Symbol(sym.simb_else, yychar, yyline, yytext());
          }
        case 75: break;
        case 9: 
          { return new Symbol(sym.delimitador, yychar, yyline, yytext());
          }
        case 76: break;
        case 20: 
          { return new Symbol(sym.simb_potencia, yychar, yyline, yytext());
          }
        case 77: break;
        case 35: 
          { return new Symbol(sym.String, yychar, yyline, yytext());
          }
        case 78: break;
        case 19: 
          { return new Symbol(sym.simb_positivo, yychar, yyline, yytext());
          }
        case 79: break;
        case 40: 
          { return new Symbol(sym.valor_nulo, yychar, yyline, yytext());
          }
        case 80: break;
        case 37: 
          { /*ignore*/
          }
        case 81: break;
        case 22: 
          { return new Symbol(sym.simb_menor_que, yychar, yyline, yytext());
          }
        case 82: break;
        case 55: 
          { return new Symbol(sym.simb_switch, yychar, yyline, yytext());
          }
        case 83: break;
        case 54: 
          { return new Symbol(sym.tipo_string, yychar, yyline, yytext());
          }
        case 84: break;
        case 18: 
          { return new Symbol(sym.simb_dos_puntos, yychar, yyline, yytext());
          }
        case 85: break;
        case 39: 
          { return new Symbol(sym.simb_inicial, yychar, yyline, yytext());
          }
        case 86: break;
        case 29: 
          { return new Symbol(sym.simb_igual_que, yychar, yyline, yytext());
          }
        case 87: break;
        case 53: 
          { return new Symbol(sym.retorno, yychar, yyline, yytext());
          }
        case 88: break;
        case 13: 
          { return new Symbol(sym.ini_arreglo, yychar, yyline, yytext());
          }
        case 89: break;
        case 38: 
          { return new Symbol(sym.tipo_int, yychar, yyline, yytext());
          }
        case 90: break;
        case 11: 
          { return new Symbol(sym.fin_bloque, yychar, yyline, yytext());
          }
        case 91: break;
        case 41: 
          { return new Symbol(sym.simb_input, yychar, yyline, yytext());
          }
        case 92: break;
        case 45: 
          { return new Symbol(sym.tipo_char, yychar, yyline, yytext());
          }
        case 93: break;
        case 16: 
          { return new Symbol(sym.fin_parentesis, yychar, yyline, yytext());
          }
        case 94: break;
        case 34: 
          { return new Symbol(sym.simb_diferente, yychar, yyline, yytext());
          }
        case 95: break;
        case 31: 
          { return new Symbol(sym.simb_aumento, yychar, yyline, yytext());
          }
        case 96: break;
        case 46: 
          { return new Symbol(sym.tipo_bool, yychar, yyline, yytext());
          }
        case 97: break;
        case 56: 
          { return new Symbol(sym.simb_default, yychar, yyline, yytext());
          }
        case 98: break;
        case 44: 
          { return new Symbol(sym.simb_case, yychar, yyline, yytext());
          }
        case 99: break;
        case 51: 
          { return new Symbol(sym.simb_while, yychar, yyline, yytext());
          }
        case 100: break;
        case 36: 
          { return new Symbol(sym.Caracter, yychar, yyline, yytext());
          }
        case 101: break;
        case 8: 
          { return new Symbol(sym.simb_multiplicacion, yychar, yyline, yytext());
          }
        case 102: break;
        case 6: 
          { return new Symbol(sym.simb_division, yychar, yyline, yytext());
          }
        case 103: break;
        case 12: 
          { return new Symbol(sym.simb_igual, yychar, yyline, yytext());
          }
        case 104: break;
        case 49: 
          { return new Symbol(sym.falso, yychar, yyline, yytext());
          }
        case 105: break;
        case 2: 
          { return new Symbol(sym.Error, yychar, yyline, yytext());
          }
        case 106: break;
        case 21: 
          { return new Symbol(sym.simb_modulo, yychar, yyline, yytext());
          }
        case 107: break;
        case 1: 
          { /*Ignore*/
          }
        case 108: break;
        case 4: 
          { return new Symbol(sym.Identificador, yychar, yyline, yytext());
          }
        case 109: break;
        case 27: 
          { return new Symbol(sym.Float, yychar, yyline, yytext());
          }
        case 110: break;
        case 47: 
          { return new Symbol(sym.tipo_array, yychar, yyline, yytext());
          }
        case 111: break;
        case 25: 
          { return new Symbol(sym.simb_conjuncion, yychar, yyline, yytext());
          }
        case 112: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
