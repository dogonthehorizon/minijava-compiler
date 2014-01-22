package
parse
;
import
java
.
util
.
List
;
import
errorMsg
.
*
;
public class TokenGrammarParseTable implements wrangLR.runtime.ParseTable {
public int getEofSym() { return 176; }
public int getNttSym() { return 177; }
private String[] symNameTable = {
"$$start",
"start",
"ws*",
"$$0",
"token",
"`boolean",
"`class",
"`extends",
"`void",
"`int",
"`while",
"`if",
"`else",
"`for",
"`break",
"`this",
"`false",
"`true",
"`super",
"`null",
"`return",
"`instanceof",
"`new",
"`abstract",
"`assert",
"`byte",
"`case",
"`catch",
"`char",
"`const",
"`continue",
"`default",
"`do",
"`double",
"`enum",
"`final",
"`finally",
"`float",
"`goto",
"`implements",
"`import",
"`interface",
"`long",
"`native",
"`package",
"`private",
"`protected",
"`public",
"`short",
"`static",
"`strictfp",
"`switch",
"`synchronized",
"`throw",
"`throws",
"`transient",
"`try",
"`volatile",
"`!",
"`!=",
"`%",
"`&&",
"`*",
"`(",
"`)",
"`{",
"`}",
"`-",
"`+",
"`=",
"`==",
"`[",
"`]",
"`||",
"`<",
"`<=",
"`,",
"`>",
"`>=",
"`.",
"`;",
"`++",
"`--",
"`/",
"ID",
"INTLIT",
"STRINGLIT",
"CHARLIT",
"\"b\"",
"\"o\"",
"\"l\"",
"\"e\"",
"\"a\"",
"\"n\"",
"idChar",
"reserved",
"\"r\"",
"\"k\"",
"\"c\"",
"\"s\"",
"\"x\"",
"\"t\"",
"\"d\"",
"\"f\"",
"\"i\"",
"\"w\"",
"\"u\"",
"\"p\"",
"\"h\"",
"\"v\"",
"\"y\"",
"\"m\"",
"\"g\"",
"\"z\"",
"\"!\"",
"\"=\"",
"\"/\"",
"\"*\"",
"\"%\"",
"\"&\"",
"\"(\"",
"\")\"",
"\"+\"",
"\",\"",
"\"-\"",
"\".\"",
"\";\"",
"\"<\"",
"\">\"",
"\"[\"",
"\"]\"",
"\"{\"",
"\"|\"",
"\"}\"",
"\"0\"",
"{\"1\"..\"9\"}",
"\"X\"",
"intLit2",
"`x",
"digit++",
"\'\"\'",
"stringLiteral",
"$$1",
"stringChar",
"char",
"\"\\\"",
"\"\'\"",
"printable",
"letter",
"idChar**",
"$$2",
"singleComment",
"printable**",
"eol",
"commentStart",
"commentTerminal",
"commentEnd",
"multiCommentContent",
"multiComment",
"multiCommentContent**",
"digit",
"\"_\"",
"{\"A\"..\"W\" \"Y\"..\"Z\" \"j\" \"q\"}",
"{\"#\"..\"$\" \":\" \"?\"..\"@\" \"^\" \"`\" \"~\"}",
"\" \"",
"stringChar**",
"ws",
"9",
"10",
"13",
"idChar*",
"stringChar*",
"multiCommentContent*",
"printable*",
"token*",
"digit+",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private TokenGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 178;}
private static final int MIN_REDUCTION = 1611;
public int minReduction() { return MIN_REDUCTION;}
private static final int MAX_ACCEPT_REDUCTION = MIN_REDUCTION+1;
public int maxAcceptReduction() { return MAX_ACCEPT_REDUCTION; }
private final int[][] parseTable;
public void error(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).error(pos,msg);
 else if (((Object)actionObject) instanceof wrangLR.runtime.FilePosObject)
 System.err.println(((wrangLR.runtime.FilePosObject)(Object)actionObject).filePosString(pos)+
 ": "+msg);
 else System.err.println("file position "+pos+": "+msg);}
public void warning(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).warning(pos,msg);
 else if (((Object)actionObject) instanceof wrangLR.runtime.FilePosObject)
 System.err.println(((wrangLR.runtime.FilePosObject)(Object)actionObject).filePosString(pos)+
 "(warning): "+msg);
 else System.err.println("file position "+pos+"(warning): "+msg);}
public String filePosString(int pos){
 if (((Object)actionObject) instanceof wrangLR.runtime.FilePosObject)
 return ((wrangLR.runtime.FilePosObject)(Object)actionObject).filePosString(pos);
 else return ""+pos;}
public boolean parse(java.io.InputStream is) {
	return new wrangLR.runtime.BaseParser(this).parse(is);
}
public boolean parse(java.io.InputStream is, int verboseLevel, int verboseReductionLevel) {
	return new wrangLR.runtime.BaseParser(this, verboseLevel, verboseReductionLevel).parse(is);
}
private class Initter1{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 0
0x80000000|534, // match move
0x80000000|816, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1
  }
,
{ // state 2
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+251, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+251, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+251, // $
-1, // $NT
  }
,
{ // state 3
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+154, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+154, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+154, // $
MIN_REDUCTION+154, // $NT
  }
,
{ // state 4
0x80000000|789, // match move
0x80000000|301, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 5
104,751, // "i"
  }
,
{ // state 6
0x80000000|1426, // match move
0x80000000|849, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 7
92,1391, // "a"
  }
,
{ // state 8
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+283, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+283, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+283, // $
-1, // $NT
  }
,
{ // state 9
93,260, // "n"
  }
,
{ // state 10
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+275, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+275, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+275, // $
-1, // $NT
  }
,
{ // state 11
2,656, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 12
0x80000000|1, // match move
0x80000000|1603, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 13
0x80000000|1, // match move
0x80000000|832, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 14
177,MIN_REDUCTION+187, // $NT
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 15
2,320, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 16
0x80000000|876, // match move
0x80000000|1453, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 17
0x80000000|1174, // match move
0x80000000|1248, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 18
101,1318, // "t"
  }
,
{ // state 19
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 20
0x80000000|594, // match move
0x80000000|981, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 21
0x80000000|1003, // match move
0x80000000|1473, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 22
0x80000000|836, // match move
0x80000000|1515, // no-match move
0x80000000|1159, // NT-test-match state for digit
  }
,
{ // state 23
2,69, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 24
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 25
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 26
0x80000000|161, // match move
0x80000000|980, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 27
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+364, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+364, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+364, // $
-1, // $NT
  }
,
{ // state 28
0x80000000|997, // match move
0x80000000|1377, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 29
-1, // $$start
-1, // start
1558, // ws*
-1, // $$0
MIN_REDUCTION+245, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+245, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+245, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+245, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+245, // "u"
778, // "p"
MIN_REDUCTION+245, // "h"
1449, // "v"
MIN_REDUCTION+245, // "y"
MIN_REDUCTION+245, // "m"
1133, // "g"
MIN_REDUCTION+245, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+245, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+245, // {"1".."9"}
MIN_REDUCTION+245, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+245, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+245, // $
MIN_REDUCTION+245, // $NT
  }
,
{ // state 30
0x80000000|1, // match move
0x80000000|47, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 31
0x80000000|249, // match move
0x80000000|796, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 32
0x80000000|1, // match move
0x80000000|794, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 33
0x80000000|1143, // match move
0x80000000|1307, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 34
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 35
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 36
0x80000000|1, // match move
0x80000000|537, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 37
0x80000000|1440, // match move
0x80000000|1402, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 38
0x80000000|1, // match move
0x80000000|1403, // no-match move
// T-test match for "/":
116,
  }
,
{ // state 39
-1, // $$start
-1, // start
1357, // ws*
-1, // $$0
MIN_REDUCTION+233, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+233, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+233, // "k"
1310, // "c"
1054, // "s"
MIN_REDUCTION+233, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+233, // "u"
778, // "p"
MIN_REDUCTION+233, // "h"
1449, // "v"
MIN_REDUCTION+233, // "y"
MIN_REDUCTION+233, // "m"
1133, // "g"
MIN_REDUCTION+233, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+233, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+233, // {"1".."9"}
MIN_REDUCTION+233, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+233, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+233, // $
MIN_REDUCTION+233, // $NT
  }
,
{ // state 40
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+295, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+295, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+295, // $
-1, // $NT
  }
,
{ // state 41
0x80000000|1, // match move
0x80000000|769, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 42
91,1229, // "e"
  }
,
{ // state 43
177,MIN_REDUCTION+190, // $NT
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 44
2,195, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 45
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 46
177,MIN_REDUCTION+153, // $NT
  }
,
{ // state 47
0x80000000|1028, // match move
0x80000000|1285, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 48
0x80000000|1607, // match move
0x80000000|96, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 49
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 50
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 51
0x80000000|977, // match move
0x80000000|1298, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 52
117,85, // "*"
  }
,
{ // state 53
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 54
104,1216, // "i"
  }
,
{ // state 55
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 56
0x80000000|65, // match move
0x80000000|1447, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 57
106,883, // "u"
  }
,
{ // state 58
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 59
-1, // $$start
-1, // start
1004, // ws*
-1, // $$0
MIN_REDUCTION+149, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+149, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+149, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+149, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+149, // "u"
778, // "p"
MIN_REDUCTION+149, // "h"
1449, // "v"
MIN_REDUCTION+149, // "y"
MIN_REDUCTION+149, // "m"
1133, // "g"
MIN_REDUCTION+149, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+149, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+149, // {"1".."9"}
MIN_REDUCTION+149, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+149, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+149, // $
MIN_REDUCTION+149, // $NT
  }
,
{ // state 60
0x80000000|545, // match move
0x80000000|1512, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 61
177,MIN_REDUCTION+229, // $NT
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 62
117,MIN_REDUCTION+319, // "*"
156,MIN_REDUCTION+319, // commentEnd
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 63
0x80000000|196, // match move
0x80000000|601, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 64
0x80000000|1409, // match move
0x80000000|798, // no-match move
// T-test match for {"*" "/"}:
116,
117,
  }
,
{ // state 65
2,576, // ws*
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 66
101,1187, // "t"
105,447, // "w"
106,1359, // "u"
108,333, // "h"
110,67, // "y"
  }
,
{ // state 67
93,467, // "n"
  }
,
{ // state 68
177,MIN_REDUCTION+318, // $NT
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 69
0x80000000|716, // match move
0x80000000|756, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 70
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 71
177,MIN_REDUCTION+211, // $NT
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 72
0x80000000|250, // match move
0x80000000|423, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 73
0x80000000|1, // match move
0x80000000|623, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 74
2,332, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 75
2,874, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 76
2,834, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 77
2,923, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 78
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 79
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 80
93,379, // "n"
  }
,
{ // state 81
91,123, // "e"
  }
,
{ // state 82
0x80000000|1, // match move
0x80000000|477, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 83
0x80000000|900, // match move
0x80000000|255, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 84
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 85
0x80000000|273, // match move
0x80000000|62, // no-match move
0x80000000|1370, // NT-test-match state for multiCommentContent
  }
,
{ // state 86
177,MIN_REDUCTION+133, // $NT
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 87
2,515, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 88
0x80000000|339, // match move
0x80000000|3, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 89
177,MIN_REDUCTION+183, // $NT
  }
,
{ // state 90
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 91
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 92
0x80000000|1334, // match move
0x80000000|1094, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 93
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 94
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 95
0x80000000|1, // match move
0x80000000|1519, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 96
-1, // $$start
-1, // start
1549, // ws*
-1, // $$0
MIN_REDUCTION+101, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+101, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+101, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+101, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+101, // "u"
778, // "p"
MIN_REDUCTION+101, // "h"
1449, // "v"
MIN_REDUCTION+101, // "y"
MIN_REDUCTION+101, // "m"
1133, // "g"
MIN_REDUCTION+101, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+101, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+101, // {"1".."9"}
MIN_REDUCTION+101, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+101, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+101, // $
MIN_REDUCTION+101, // $NT
  }
,
{ // state 97
177,MIN_REDUCTION+213, // $NT
  }
,
{ // state 98
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 99
0x80000000|140, // match move
0x80000000|92, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 100
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 101
101,358, // "t"
  }
,
{ // state 102
0x80000000|142, // match move
0x80000000|361, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 103
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 104
90,1289, // "l"
  }
,
{ // state 105
91,622, // "e"
  }
,
{ // state 106
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 107
0x80000000|1, // match move
0x80000000|72, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 108
92,1410, // "a"
  }
,
{ // state 109
91,497, // "e"
  }
,
{ // state 110
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 111
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 112
90,245, // "l"
  }
,
{ // state 113
0x80000000|996, // match move
0x80000000|1396, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 114
0x80000000|362, // match move
0x80000000|729, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 115
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 116
0x80000000|767, // match move
0x80000000|1595, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 117
103,1542, // "f"
  }
,
{ // state 118
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 119
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 120
0x80000000|226, // match move
0x80000000|1384, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 121
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 122
0x80000000|1035, // match move
0x80000000|529, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 123
98,175, // "c"
  }
,
{ // state 124
2,576, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 125
-1, // $$start
-1, // start
613, // ws*
-1, // $$0
MIN_REDUCTION+182, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+182, // "o"
1053, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+182, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+182, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+182, // "u"
778, // "p"
MIN_REDUCTION+182, // "h"
1449, // "v"
MIN_REDUCTION+182, // "y"
MIN_REDUCTION+182, // "m"
1133, // "g"
MIN_REDUCTION+182, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+182, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+182, // {"1".."9"}
MIN_REDUCTION+182, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+182, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+182, // $
MIN_REDUCTION+182, // $NT
  }
,
{ // state 126
104,1240, // "i"
  }
,
{ // state 127
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 128
0x80000000|1, // match move
0x80000000|844, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 129
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 130
104,1423, // "i"
108,5, // "h"
  }
,
{ // state 131
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 132
177,MIN_REDUCTION+243, // $NT
  }
,
{ // state 133
-1, // $$start
-1, // start
834, // ws*
-1, // $$0
MIN_REDUCTION+298, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+298, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+298, // $
-1, // $NT
  }
,
{ // state 134
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 135
0x80000000|842, // match move
0x80000000|261, // no-match move
0x80000000|1370, // NT-test-match state for multiCommentContent
  }
,
{ // state 136
0x80000000|329, // match move
0x80000000|156, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 137
-1, // $$start
-1, // start
1021, // ws*
-1, // $$0
MIN_REDUCTION+176, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+176, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+176, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+176, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
1375, // "u"
778, // "p"
MIN_REDUCTION+176, // "h"
1449, // "v"
MIN_REDUCTION+176, // "y"
MIN_REDUCTION+176, // "m"
1133, // "g"
MIN_REDUCTION+176, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+176, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+176, // {"1".."9"}
MIN_REDUCTION+176, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+176, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+176, // $
MIN_REDUCTION+176, // $NT
  }
,
{ // state 138
99,1233, // "s"
101,1466, // "t"
  }
,
{ // state 139
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 140
2,414, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 141
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 142
2,1007, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 143
108,1321, // "h"
  }
,
{ // state 144
-1, // $$start
-1, // start
709, // ws*
-1, // $$0
MIN_REDUCTION+170, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+170, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+170, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+170, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+170, // "u"
778, // "p"
MIN_REDUCTION+170, // "h"
1449, // "v"
MIN_REDUCTION+170, // "y"
MIN_REDUCTION+170, // "m"
1133, // "g"
MIN_REDUCTION+170, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+170, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+170, // {"1".."9"}
MIN_REDUCTION+170, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+170, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+170, // $
MIN_REDUCTION+170, // $NT
  }
,
{ // state 145
0x80000000|1284, // match move
0x80000000|782, // no-match move
0x80000000|1159, // NT-test-match state for digit
  }
,
{ // state 146
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 147
0x80000000|1319, // match move
0x80000000|619, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 148
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 149
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 150
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 151
177,MIN_REDUCTION+120, // $NT
  }
,
{ // state 152
0x80000000|964, // match move
0x80000000|1367, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 153
0x80000000|252, // match move
0x80000000|169, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 154
2,588, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 155
0x80000000|1082, // match move
0x80000000|554, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 156
0x80000000|1477, // match move
0x80000000|487, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 157
-1, // $$start
-1, // start
595, // ws*
-1, // $$0
MIN_REDUCTION+294, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+294, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+294, // $
-1, // $NT
  }
,
{ // state 158
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 159
0x80000000|807, // match move
0x80000000|808, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 160
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 161
2,814, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 162
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+281, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+281, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+281, // $
-1, // $NT
  }
,
{ // state 163
0x80000000|1089, // match move
0x80000000|1355, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 164
0x80000000|1, // match move
0x80000000|1342, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 165
0x80000000|901, // match move
0x80000000|63, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 166
2,1349, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 167
0x80000000|1242, // match move
0x80000000|967, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 168
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 169
-1, // $$start
-1, // start
588, // ws*
-1, // $$0
MIN_REDUCTION+248, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
-1, // `=
-1, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
MIN_REDUCTION+248, // "="
64, // "/"
MIN_REDUCTION+248, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+248, // $
-1, // $NT
  }
,
{ // state 170
0x80000000|843, // match move
0x80000000|1008, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 171
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 172
0x80000000|560, // match move
0x80000000|165, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 173
89,963, // "o"
96,238, // "r"
110,303, // "y"
  }
,
{ // state 174
177,MIN_REDUCTION+177, // $NT
  }
,
{ // state 175
101,391, // "t"
  }
,
{ // state 176
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+257, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+257, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+257, // $
-1, // $NT
  }
,
{ // state 177
-1, // $$start
-1, // start
1591, // ws*
-1, // $$0
MIN_REDUCTION+206, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+206, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+206, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+206, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+206, // "u"
778, // "p"
MIN_REDUCTION+206, // "h"
1449, // "v"
MIN_REDUCTION+206, // "y"
MIN_REDUCTION+206, // "m"
1133, // "g"
MIN_REDUCTION+206, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+206, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+206, // {"1".."9"}
MIN_REDUCTION+206, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+206, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+206, // $
MIN_REDUCTION+206, // $NT
  }
,
{ // state 178
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 179
0x80000000|193, // match move
0x80000000|459, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 180
0x80000000|1431, // match move
0x80000000|1358, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 181
0x80000000|918, // match move
0x80000000|507, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 182
177,MIN_REDUCTION+178, // $NT
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 183
0x80000000|1561, // match move
0x80000000|88, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 184
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+202, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+202, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+202, // $
MIN_REDUCTION+202, // $NT
  }
,
{ // state 185
99,101, // "s"
  }
,
{ // state 186
0x80000000|1198, // match move
0x80000000|1365, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 187
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 188
177,MIN_REDUCTION+240, // $NT
  }
,
{ // state 189
89,1279, // "o"
90,1097, // "l"
  }
,
{ // state 190
177,MIN_REDUCTION+323, // $NT
  }
,
{ // state 191
0x80000000|112, // match move
0x80000000|328, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 192
0x80000000|633, // match move
0x80000000|1442, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 193
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 194
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+151, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+151, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+151, // $
MIN_REDUCTION+151, // $NT
  }
,
{ // state 195
0x80000000|1170, // match move
0x80000000|1354, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 196
2,225, // ws*
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 197
0x80000000|1163, // match move
0x80000000|1424, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 198
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+190, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+190, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+190, // $
MIN_REDUCTION+190, // $NT
  }
,
{ // state 199
2,180, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 200
2,1177, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 201
0x80000000|1254, // match move
0x80000000|1243, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 202
2,458, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 203
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 204
0x80000000|1485, // match move
0x80000000|1414, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 205
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 206
0x80000000|1109, // match move
0x80000000|527, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 207
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+172, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+172, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+172, // $
MIN_REDUCTION+172, // $NT
  }
,
{ // state 208
0x80000000|565, // match move
0x80000000|426, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 209
2,637, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 210
111,1015, // "m"
  }
,
{ // state 211
0x80000000|1114, // match move
0x80000000|616, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 212
0x80000000|1, // match move
0x80000000|452, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 213
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 214
0x80000000|1461, // match move
0x80000000|311, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 215
0x80000000|23, // match move
0x80000000|1077, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 216
0x80000000|1386, // match move
0x80000000|888, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 217
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 218
177,MIN_REDUCTION+340, // $NT
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 219
0x80000000|115, // match move
0x80000000|820, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 220
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+311, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+311, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+311, // $
-1, // $NT
  }
};
}
private class Initter2{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 221
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 222
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 223
88,1072, // "b"
89,1072, // "o"
90,1072, // "l"
91,1072, // "e"
92,1072, // "a"
93,1072, // "n"
96,1072, // "r"
97,1072, // "k"
98,1072, // "c"
99,1072, // "s"
100,1072, // "x"
101,1072, // "t"
102,1072, // "d"
103,1072, // "f"
104,1072, // "i"
105,1072, // "w"
106,1072, // "u"
107,1072, // "p"
108,1072, // "h"
109,1072, // "v"
110,1072, // "y"
111,1072, // "m"
112,1072, // "g"
113,1072, // "z"
114,1072, // "!"
115,1072, // "="
116,1072, // "/"
117,1072, // "*"
118,1072, // "%"
119,1072, // "&"
120,1072, // "("
121,1072, // ")"
122,1072, // "+"
123,1072, // ","
124,1072, // "-"
125,1072, // "."
126,1072, // ";"
127,1072, // "<"
128,1072, // ">"
129,1072, // "["
130,1072, // "]"
131,1072, // "{"
132,1072, // "|"
133,1072, // "}"
134,1072, // "0"
135,1072, // {"1".."9"}
136,1072, // "X"
140,1072, // '"'
145,1072, // "\"
146,1072, // "'"
161,1072, // "_"
162,1072, // {"A".."W" "Y".."Z" "j" "q"}
163,1072, // {"#".."$" ":" "?".."@" "^" "`" "~"}
164,1072, // " "
  }
,
{ // state 224
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+169, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+169, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+169, // $
MIN_REDUCTION+169, // $NT
  }
,
{ // state 225
0x80000000|359, // match move
0x80000000|1393, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 226
2,1039, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 227
0x80000000|1, // match move
0x80000000|581, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 228
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 229
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 230
0x80000000|1152, // match move
0x80000000|1581, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 231
-1, // $$start
-1, // start
33, // ws*
-1, // $$0
MIN_REDUCTION+242, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+242, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+242, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+242, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+242, // "u"
778, // "p"
MIN_REDUCTION+242, // "h"
1449, // "v"
MIN_REDUCTION+242, // "y"
MIN_REDUCTION+242, // "m"
1133, // "g"
MIN_REDUCTION+242, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+242, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+242, // {"1".."9"}
MIN_REDUCTION+242, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+242, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+242, // $
MIN_REDUCTION+242, // $NT
  }
,
{ // state 232
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 233
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 234
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 235
1,533, // start
2,992, // ws*
3,229, // $$0
4,321, // token
5,1099, // `boolean
6,239, // `class
7,1052, // `extends
8,368, // `void
9,1507, // `int
10,1006, // `while
11,811, // `if
12,1518, // `else
13,570, // `for
14,745, // `break
15,1593, // `this
16,1439, // `false
17,1011, // `true
18,747, // `super
19,649, // `null
20,961, // `return
21,797, // `instanceof
22,822, // `new
23,146, // `abstract
24,958, // `assert
25,526, // `byte
26,45, // `case
27,1412, // `catch
28,341, // `char
29,420, // `const
30,90, // `continue
31,360, // `default
32,50, // `do
33,1327, // `double
34,568, // `enum
35,549, // `final
36,1189, // `finally
37,945, // `float
38,886, // `goto
39,474, // `implements
40,494, // `import
41,100, // `interface
42,1218, // `long
43,397, // `native
44,1530, // `package
45,1540, // `private
46,203, // `protected
47,1288, // `public
48,857, // `short
49,1244, // `static
50,25, // `strictfp
51,1559, // `switch
52,1190, // `synchronized
53,1259, // `throw
54,324, // `throws
55,868, // `transient
56,150, // `try
57,931, // `volatile
174,760, // token*
  }
,
{ // state 236
98,985, // "c"
  }
,
{ // state 237
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+157, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+157, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+157, // $
MIN_REDUCTION+157, // $NT
  }
,
{ // state 238
91,510, // "e"
  }
,
{ // state 239
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 240
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 241
0x80000000|58, // match move
0x80000000|556, // no-match move
0x80000000|1370, // NT-test-match state for multiCommentContent
  }
,
{ // state 242
117,1042, // "*"
156,1387, // commentEnd
159,532, // multiCommentContent**
172,1084, // multiCommentContent*
  }
,
{ // state 243
0x80000000|1207, // match move
0x80000000|1490, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 244
0x80000000|1195, // match move
0x80000000|962, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 245
110,227, // "y"
  }
,
{ // state 246
177,MIN_REDUCTION+115, // $NT
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 247
177,MIN_REDUCTION+333, // $NT
  }
,
{ // state 248
-1, // $$start
-1, // start
732, // ws*
-1, // $$0
MIN_REDUCTION+188, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+188, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+188, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+188, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+188, // "u"
778, // "p"
MIN_REDUCTION+188, // "h"
1449, // "v"
MIN_REDUCTION+188, // "y"
MIN_REDUCTION+188, // "m"
1133, // "g"
MIN_REDUCTION+188, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+188, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+188, // {"1".."9"}
MIN_REDUCTION+188, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+188, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+188, // $
MIN_REDUCTION+188, // $NT
  }
,
{ // state 249
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 250
2,1520, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 251
0x80000000|1, // match move
0x80000000|948, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 252
2,588, // ws*
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 253
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 254
177,MIN_REDUCTION+205, // $NT
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 255
0x80000000|897, // match move
0x80000000|1119, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 256
2,954, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 257
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 258
2,414, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 259
177,MIN_REDUCTION+341, // $NT
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 260
99,743, // "s"
  }
,
{ // state 261
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 262
177,MIN_REDUCTION+346, // $NT
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 263
91,12, // "e"
  }
,
{ // state 264
0x80000000|253, // match move
0x80000000|40, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 265
177,MIN_REDUCTION+207, // $NT
  }
,
{ // state 266
2,605, // ws*
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 267
91,1202, // "e"
  }
,
{ // state 268
177,MIN_REDUCTION+202, // $NT
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 269
90,191, // "l"
  }
,
{ // state 270
2,21, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 271
103,108, // "f"
  }
,
{ // state 272
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 273
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 274
2,1188, // ws*
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 275
0x80000000|235, // match move
0x80000000|889, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 276
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 277
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 278
149,MIN_REDUCTION+332, // idChar**
161,MIN_REDUCTION+332, // "_"
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 279
0x80000000|1235, // match move
0x80000000|410, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 280
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 281
177,MIN_REDUCTION+216, // $NT
  }
,
{ // state 282
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 283
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 284
132,1063, // "|"
  }
,
{ // state 285
168,1497, // {10}
  }
,
{ // state 286
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+223, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+223, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+223, // $
MIN_REDUCTION+223, // $NT
  }
,
{ // state 287
0x80000000|1, // match move
0x80000000|36, // no-match move
// T-test match for "/":
116,
  }
,
{ // state 288
177,MIN_REDUCTION+106, // $NT
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 289
0x80000000|35, // match move
0x80000000|1577, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 290
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+115, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+115, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+115, // $
MIN_REDUCTION+115, // $NT
  }
,
{ // state 291
88,1325, // "b"
89,1325, // "o"
90,1325, // "l"
91,1325, // "e"
92,1325, // "a"
93,1325, // "n"
96,1325, // "r"
97,1325, // "k"
98,1325, // "c"
99,1325, // "s"
100,1325, // "x"
101,1325, // "t"
102,1325, // "d"
103,1325, // "f"
104,1325, // "i"
105,1325, // "w"
106,1325, // "u"
107,1325, // "p"
108,1325, // "h"
109,1325, // "v"
110,1325, // "y"
111,1325, // "m"
112,1325, // "g"
113,1325, // "z"
114,1325, // "!"
115,1325, // "="
116,1325, // "/"
117,1325, // "*"
118,1325, // "%"
119,1325, // "&"
120,1325, // "("
121,1325, // ")"
122,1325, // "+"
123,1325, // ","
124,1325, // "-"
125,1325, // "."
126,1325, // ";"
127,1325, // "<"
128,1325, // ">"
129,1325, // "["
130,1325, // "]"
131,1325, // "{"
132,1325, // "|"
133,1325, // "}"
134,1325, // "0"
135,1325, // {"1".."9"}
136,1325, // "X"
140,1325, // '"'
143,1434, // stringChar
145,1325, // "\"
146,1325, // "'"
147,1428, // printable
161,1325, // "_"
162,1325, // {"A".."W" "Y".."Z" "j" "q"}
163,1325, // {"#".."$" ":" "?".."@" "^" "`" "~"}
164,1325, // " "
  }
,
{ // state 292
0x80000000|1, // match move
0x80000000|243, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 293
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 294
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+139, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+139, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+139, // $
MIN_REDUCTION+139, // $NT
  }
,
{ // state 295
-1, // $$start
-1, // start
296, // ws*
-1, // $$0
MIN_REDUCTION+282, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
-1, // `=
-1, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
MIN_REDUCTION+282, // "="
64, // "/"
MIN_REDUCTION+282, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+282, // $
-1, // $NT
  }
,
{ // state 296
0x80000000|1266, // match move
0x80000000|749, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 297
91,1381, // "e"
  }
,
{ // state 298
0x80000000|380, // match move
0x80000000|1574, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 299
0x80000000|762, // match move
0x80000000|94, // no-match move
0x80000000|1159, // NT-test-match state for digit
  }
,
{ // state 300
-1, // $$start
-1, // start
1188, // ws*
-1, // $$0
MIN_REDUCTION+302, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+302, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+302, // $
-1, // $NT
  }
,
{ // state 301
0x80000000|742, // match move
0x80000000|1348, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 302
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 303
101,42, // "t"
  }
,
{ // state 304
0x80000000|949, // match move
0x80000000|159, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 305
177,MIN_REDUCTION+171, // $NT
  }
,
{ // state 306
0x80000000|708, // match move
0x80000000|295, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 307
0x80000000|1192, // match move
0x80000000|902, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 308
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 309
0x80000000|1156, // match move
0x80000000|1481, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 310
101,925, // "t"
  }
,
{ // state 311
0x80000000|596, // match move
0x80000000|1328, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 312
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 313
0x80000000|1136, // match move
0x80000000|793, // no-match move
// T-test match for "-":
124,
  }
,
{ // state 314
0x80000000|44, // match move
0x80000000|365, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 315
0x80000000|541, // match move
0x80000000|1385, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 316
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 317
96,695, // "r"
  }
,
{ // state 318
0x80000000|763, // match move
0x80000000|366, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 319
89,1031, // "o"
  }
,
{ // state 320
0x80000000|734, // match move
0x80000000|244, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 321
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 322
91,403, // "e"
  }
,
{ // state 323
0x80000000|543, // match move
0x80000000|157, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 324
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 325
177,MIN_REDUCTION+118, // $NT
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 326
177,MIN_REDUCTION+210, // $NT
  }
,
{ // state 327
115,1001, // "="
  }
,
{ // state 328
0x80000000|990, // match move
0x80000000|125, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 329
2,647, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 330
0x80000000|658, // match move
0x80000000|1185, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 331
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+118, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+118, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+118, // $
MIN_REDUCTION+118, // $NT
  }
,
{ // state 332
0x80000000|1280, // match move
0x80000000|1225, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 333
89,1578, // "o"
  }
,
{ // state 334
5,1108, // `boolean
6,973, // `class
7,1030, // `extends
8,1022, // `void
9,482, // `int
10,696, // `while
11,1047, // `if
12,750, // `else
13,839, // `for
14,1458, // `break
15,903, // `this
16,419, // `false
17,854, // `true
18,1459, // `super
19,598, // `null
20,1046, // `return
21,1587, // `instanceof
22,151, // `new
23,425, // `abstract
24,810, // `assert
25,46, // `byte
26,1260, // `case
27,1495, // `catch
28,340, // `char
29,481, // `const
30,1275, // `continue
31,305, // `default
32,174, // `do
33,738, // `double
34,615, // `enum
35,89, // `final
36,704, // `finally
37,384, // `float
38,1464, // `goto
39,461, // `implements
40,584, // `import
41,392, // `interface
42,908, // `long
43,265, // `native
44,326, // `package
45,97, // `private
46,281, // `protected
47,402, // `public
48,1535, // `short
49,1134, // `static
50,1580, // `strictfp
51,1421, // `switch
52,956, // `synchronized
53,642, // `throw
54,1460, // `throws
55,188, // `transient
56,132, // `try
57,1356, // `volatile
88,173, // "b"
90,1237, // "l"
91,1463, // "e"
92,1212, // "a"
93,1277, // "n"
96,1602, // "r"
98,1310, // "c"
99,1353, // "s"
101,1211, // "t"
102,1332, // "d"
103,1057, // "f"
104,1058, // "i"
105,1430, // "w"
107,778, // "p"
109,1449, // "v"
112,1133, // "g"
  }
,
{ // state 335
0x80000000|1388, // match move
0x80000000|1543, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 336
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 337
0x80000000|813, // match move
0x80000000|779, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 338
0x80000000|1, // match move
0x80000000|1347, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 339
177,MIN_REDUCTION+154, // $NT
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 340
177,MIN_REDUCTION+162, // $NT
  }
,
{ // state 341
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 342
0x80000000|1014, // match move
0x80000000|1270, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 343
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+130, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+130, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+130, // $
MIN_REDUCTION+130, // $NT
  }
,
{ // state 344
92,845, // "a"
96,823, // "r"
108,1443, // "h"
  }
,
{ // state 345
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 346
0x80000000|86, // match move
0x80000000|1016, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 347
-1, // $$start
-1, // start
370, // ws*
-1, // $$0
MIN_REDUCTION+284, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+284, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+284, // $
-1, // $NT
  }
,
{ // state 348
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+214, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+214, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+214, // $
MIN_REDUCTION+214, // $NT
  }
,
{ // state 349
2,370, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 350
2,332, // ws*
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 351
101,54, // "t"
  }
,
{ // state 352
0x80000000|815, // match move
0x80000000|1589, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 353
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 354
0x80000000|469, // match move
0x80000000|741, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 355
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 356
2,289, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 357
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 358
96,1205, // "r"
  }
,
{ // state 359
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 360
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 361
0x80000000|993, // match move
0x80000000|689, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 362
177,MIN_REDUCTION+208, // $NT
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 363
91,1541, // "e"
  }
,
{ // state 364
177,MIN_REDUCTION+317, // $NT
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 365
-1, // $$start
-1, // start
195, // ws*
-1, // $$0
MIN_REDUCTION+161, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+161, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+161, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+161, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+161, // "u"
778, // "p"
MIN_REDUCTION+161, // "h"
1449, // "v"
MIN_REDUCTION+161, // "y"
MIN_REDUCTION+161, // "m"
1133, // "g"
MIN_REDUCTION+161, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+161, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+161, // {"1".."9"}
MIN_REDUCTION+161, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+161, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+161, // $
MIN_REDUCTION+161, // $NT
  }
,
{ // state 366
0x80000000|1582, // match move
0x80000000|194, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 367
0x80000000|436, // match move
0x80000000|186, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 368
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 369
0x80000000|327, // match move
0x80000000|728, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 370
0x80000000|580, // match move
0x80000000|1176, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 371
0x80000000|1467, // match move
0x80000000|230, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 372
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 373
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 374
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 375
0x80000000|890, // match move
0x80000000|859, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 376
177,MIN_REDUCTION+181, // $NT
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 377
0x80000000|677, // match move
0x80000000|286, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 378
0x80000000|628, // match move
0x80000000|938, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 379
112,1069, // "g"
  }
,
{ // state 380
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 381
92,317, // "a"
  }
,
{ // state 382
0x80000000|127, // match move
0x80000000|693, // no-match move
0x80000000|1370, // NT-test-match state for multiCommentContent
  }
,
{ // state 383
0x80000000|178, // match move
0x80000000|1038, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 384
177,MIN_REDUCTION+189, // $NT
  }
,
{ // state 385
0x80000000|1435, // match move
0x80000000|1175, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 386
0x80000000|1, // match move
0x80000000|862, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 387
0x80000000|1215, // match move
0x80000000|27, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 388
4,1180, // token
5,1099, // `boolean
6,239, // `class
7,1052, // `extends
8,368, // `void
9,1507, // `int
10,1006, // `while
11,811, // `if
12,1518, // `else
13,570, // `for
14,745, // `break
15,1593, // `this
16,1439, // `false
17,1011, // `true
18,747, // `super
19,649, // `null
20,961, // `return
21,797, // `instanceof
22,822, // `new
23,146, // `abstract
24,958, // `assert
25,526, // `byte
26,45, // `case
27,1412, // `catch
28,341, // `char
29,420, // `const
30,90, // `continue
31,360, // `default
32,50, // `do
33,1327, // `double
34,568, // `enum
35,549, // `final
36,1189, // `finally
37,945, // `float
38,886, // `goto
39,474, // `implements
40,494, // `import
41,100, // `interface
42,1218, // `long
43,397, // `native
44,1530, // `package
45,1540, // `private
46,203, // `protected
47,1288, // `public
48,857, // `short
49,1244, // `static
50,25, // `strictfp
51,1559, // `switch
52,1190, // `synchronized
53,1259, // `throw
54,324, // `throws
55,868, // `transient
56,150, // `try
57,931, // `volatile
  }
,
{ // state 389
0x80000000|928, // match move
0x80000000|398, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 390
0x80000000|1, // match move
0x80000000|899, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 391
91,1573, // "e"
  }
,
{ // state 392
177,MIN_REDUCTION+201, // $NT
  }
,
{ // state 393
0x80000000|915, // match move
0x80000000|922, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 394
2,910, // ws*
150,336, // $$2
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 395
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 396
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 397
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 398
0x80000000|246, // match move
0x80000000|290, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 399
2,1269, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 400
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+184, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+184, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+184, // $
MIN_REDUCTION+184, // $NT
  }
,
{ // state 401
0x80000000|654, // match move
0x80000000|592, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 402
177,MIN_REDUCTION+126, // $NT
  }
,
{ // state 403
93,542, // "n"
  }
,
{ // state 404
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 405
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 406
0x80000000|1, // match move
0x80000000|1465, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 407
0x80000000|1523, // match move
0x80000000|1196, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 408
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 409
0x80000000|388, // match move
0x80000000|574, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 410
0x80000000|1219, // match move
0x80000000|523, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 411
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 412
3,1230, // $$0
4,321, // token
5,1099, // `boolean
6,239, // `class
7,1052, // `extends
8,368, // `void
9,1507, // `int
10,1006, // `while
11,811, // `if
12,1518, // `else
13,570, // `for
14,745, // `break
15,1593, // `this
16,1439, // `false
17,1011, // `true
18,747, // `super
19,649, // `null
20,961, // `return
21,797, // `instanceof
22,822, // `new
23,146, // `abstract
24,958, // `assert
25,526, // `byte
26,45, // `case
27,1412, // `catch
28,341, // `char
29,420, // `const
30,90, // `continue
31,360, // `default
32,50, // `do
33,1327, // `double
34,568, // `enum
35,549, // `final
36,1189, // `finally
37,945, // `float
38,886, // `goto
39,474, // `implements
40,494, // `import
41,100, // `interface
42,1218, // `long
43,397, // `native
44,1530, // `package
45,1540, // `private
46,203, // `protected
47,1288, // `public
48,857, // `short
49,1244, // `static
50,25, // `strictfp
51,1559, // `switch
52,1190, // `synchronized
53,1259, // `throw
54,324, // `throws
55,868, // `transient
56,150, // `try
57,931, // `volatile
174,760, // token*
  }
,
{ // state 413
0x80000000|1, // match move
0x80000000|765, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 414
0x80000000|1193, // match move
0x80000000|701, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 415
0x80000000|846, // match move
0x80000000|1584, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 416
98,783, // "c"
  }
,
{ // state 417
99,105, // "s"
  }
,
{ // state 418
0x80000000|1378, // match move
0x80000000|1532, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 419
177,MIN_REDUCTION+105, // $NT
  }
,
{ // state 420
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 421
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 422
104,104, // "i"
  }
,
{ // state 423
-1, // $$start
-1, // start
1520, // ws*
-1, // $$0
MIN_REDUCTION+230, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+230, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+230, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+230, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+230, // "u"
778, // "p"
MIN_REDUCTION+230, // "h"
1449, // "v"
MIN_REDUCTION+230, // "y"
MIN_REDUCTION+230, // "m"
1133, // "g"
MIN_REDUCTION+230, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+230, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+230, // {"1".."9"}
MIN_REDUCTION+230, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+230, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+230, // $
MIN_REDUCTION+230, // $NT
  }
,
{ // state 424
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+91, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+91, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+91, // $
MIN_REDUCTION+91, // $NT
  }
,
{ // state 425
177,MIN_REDUCTION+147, // $NT
  }
,
{ // state 426
-1, // $$start
-1, // start
1376, // ws*
-1, // $$0
MIN_REDUCTION+215, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+215, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+215, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+215, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+215, // "u"
778, // "p"
MIN_REDUCTION+215, // "h"
1449, // "v"
MIN_REDUCTION+215, // "y"
MIN_REDUCTION+215, // "m"
1133, // "g"
MIN_REDUCTION+215, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+215, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+215, // {"1".."9"}
MIN_REDUCTION+215, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+215, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+215, // $
MIN_REDUCTION+215, // $NT
  }
,
{ // state 427
0x80000000|943, // match move
0x80000000|1488, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 428
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 429
99,212, // "s"
  }
,
{ // state 430
177,MIN_REDUCTION+322, // $NT
  }
,
{ // state 431
0x80000000|433, // match move
0x80000000|215, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 432
-1, // $$start
-1, // start
332, // ws*
-1, // $$0
MIN_REDUCTION+288, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+288, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+288, // $
-1, // $NT
  }
,
{ // state 433
2,69, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 434
0x80000000|357, // match move
0x80000000|155, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 435
106,1221, // "u"
  }
,
{ // state 436
2,6, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 437
2,401, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 438
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 439
99,723, // "s"
  }
,
{ // state 440
0x80000000|904, // match move
0x80000000|707, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 441
0x80000000|1454, // match move
0x80000000|443, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 442
0x80000000|998, // match move
0x80000000|572, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 443
0x80000000|438, // match move
0x80000000|579, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 444
-1, // $$start
-1, // start
418, // ws*
-1, // $$0
MIN_REDUCTION+98, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+98, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+98, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+98, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+98, // "u"
778, // "p"
MIN_REDUCTION+98, // "h"
1449, // "v"
MIN_REDUCTION+98, // "y"
MIN_REDUCTION+98, // "m"
1133, // "g"
MIN_REDUCTION+98, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+98, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+98, // {"1".."9"}
MIN_REDUCTION+98, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+98, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+98, // $
MIN_REDUCTION+98, // $NT
  }
};
}
private class Initter3{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 445
177,MIN_REDUCTION+88, // $NT
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 446
0x80000000|1346, // match move
0x80000000|1390, // no-match move
0x80000000|223, // NT-test-match state for printable
  }
,
{ // state 447
104,1423, // "i"
  }
,
{ // state 448
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+304, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+304, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+304, // $
-1, // $NT
  }
,
{ // state 449
106,210, // "u"
  }
,
{ // state 450
0x80000000|84, // match move
0x80000000|1208, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 451
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 452
0x80000000|1524, // match move
0x80000000|1571, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 453
0x80000000|881, // match move
0x80000000|59, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 454
153,364, // eol
168,259, // {10}
169,466, // {13}
  }
,
{ // state 455
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 456
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+100, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+100, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+100, // $
MIN_REDUCTION+100, // $NT
  }
,
{ // state 457
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+301, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+301, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+301, // $
-1, // $NT
  }
,
{ // state 458
0x80000000|1064, // match move
0x80000000|1227, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 459
0x80000000|222, // match move
0x80000000|1510, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 460
-1, // $$start
-1, // start
383, // ws*
-1, // $$0
MIN_REDUCTION+266, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+266, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+266, // $
-1, // $NT
  }
,
{ // state 461
177,MIN_REDUCTION+195, // $NT
  }
,
{ // state 462
-1, // $$start
-1, // start
-1, // ws*
1230, // $$0
321, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
-1, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
760, // token*
145, // digit+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 463
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 464
-1, // $$start
-1, // start
1247, // ws*
-1, // $$0
MIN_REDUCTION+212, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+212, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+212, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+212, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+212, // "u"
778, // "p"
MIN_REDUCTION+212, // "h"
1449, // "v"
MIN_REDUCTION+212, // "y"
MIN_REDUCTION+212, // "m"
1133, // "g"
MIN_REDUCTION+212, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+212, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+212, // {"1".."9"}
MIN_REDUCTION+212, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+212, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+212, // $
MIN_REDUCTION+212, // $NT
  }
,
{ // state 465
88,812, // "b"
  }
,
{ // state 466
0x80000000|686, // match move
0x80000000|771, // no-match move
// T-test match for 10:
168,
  }
,
{ // state 467
98,143, // "c"
  }
,
{ // state 468
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 469
2,567, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 470
177,MIN_REDUCTION+193, // $NT
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 471
1,533, // start
2,992, // ws*
3,229, // $$0
4,321, // token
58,168, // `!
59,1179, // `!=
60,19, // `%
61,717, // `&&
63,1420, // `(
64,141, // `)
65,692, // `{
66,731, // `}
67,1505, // `-
68,1252, // `+
69,1471, // `=
70,91, // `==
71,1597, // `[
72,233, // `]
73,106, // `||
74,1527, // `<
75,490, // `<=
76,1382, // `,
77,396, // `>
78,1521, // `>=
79,776, // `.
80,1088, // `;
81,1081, // `++
82,1178, // `--
83,455, // `/
84,1276, // ID
85,110, // INTLIT
86,1500, // STRINGLIT
87,1448, // CHARLIT
134,1241, // "0"
148,659, // letter
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
174,760, // token*
  }
,
{ // state 472
-1, // $$start
-1, // start
786, // ws*
-1, // $$0
MIN_REDUCTION+134, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+134, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+134, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+134, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+134, // "u"
778, // "p"
MIN_REDUCTION+134, // "h"
1449, // "v"
MIN_REDUCTION+134, // "y"
MIN_REDUCTION+134, // "m"
1133, // "g"
MIN_REDUCTION+134, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+134, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+134, // {"1".."9"}
MIN_REDUCTION+134, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+134, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+134, // $
MIN_REDUCTION+134, // $NT
  }
,
{ // state 473
90,480, // "l"
93,449, // "n"
96,271, // "r"
100,744, // "x"
  }
,
{ // state 474
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 475
108,413, // "h"
  }
,
{ // state 476
-1, // $$start
-1, // start
1531, // ws*
-1, // $$0
MIN_REDUCTION+296, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+296, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+296, // $
-1, // $NT
  }
,
{ // state 477
0x80000000|1565, // match move
0x80000000|472, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 478
2,179, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 479
177,MIN_REDUCTION+196, // $NT
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 480
99,780, // "s"
  }
,
{ // state 481
177,MIN_REDUCTION+165, // $NT
  }
,
{ // state 482
177,MIN_REDUCTION+117, // $NT
  }
,
{ // state 483
99,1044, // "s"
  }
,
{ // state 484
2,709, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 485
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 486
1,533, // start
2,992, // ws*
3,229, // $$0
4,321, // token
5,1099, // `boolean
6,239, // `class
7,1052, // `extends
8,368, // `void
9,1507, // `int
10,1006, // `while
11,811, // `if
12,1518, // `else
13,570, // `for
14,745, // `break
15,1593, // `this
16,1439, // `false
17,1011, // `true
18,747, // `super
19,649, // `null
20,961, // `return
21,797, // `instanceof
22,822, // `new
23,146, // `abstract
24,958, // `assert
25,526, // `byte
26,45, // `case
27,1412, // `catch
28,341, // `char
29,420, // `const
30,90, // `continue
31,360, // `default
32,50, // `do
33,1327, // `double
34,568, // `enum
35,549, // `final
36,1189, // `finally
37,945, // `float
38,886, // `goto
39,474, // `implements
40,494, // `import
41,100, // `interface
42,1218, // `long
43,397, // `native
44,1530, // `package
45,1540, // `private
46,203, // `protected
47,1288, // `public
48,857, // `short
49,1244, // `static
50,25, // `strictfp
51,1559, // `switch
52,1190, // `synchronized
53,1259, // `throw
54,324, // `throws
55,868, // `transient
56,150, // `try
57,931, // `volatile
88,173, // "b"
90,1237, // "l"
91,1463, // "e"
92,1212, // "a"
93,1277, // "n"
96,1602, // "r"
98,1310, // "c"
99,1353, // "s"
101,1211, // "t"
102,1332, // "d"
103,1057, // "f"
104,1058, // "i"
105,1430, // "w"
107,778, // "p"
109,1449, // "v"
112,1133, // "g"
174,760, // token*
176,MIN_REDUCTION+1, // $
  }
,
{ // state 487
0x80000000|934, // match move
0x80000000|1100, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 488
2,1591, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 489
0x80000000|1074, // match move
0x80000000|748, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 490
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 491
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 492
-1, // $$start
-1, // start
206, // ws*
-1, // $$0
MIN_REDUCTION+173, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+173, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+173, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+173, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+173, // "u"
778, // "p"
MIN_REDUCTION+173, // "h"
1449, // "v"
MIN_REDUCTION+173, // "y"
MIN_REDUCTION+173, // "m"
1133, // "g"
MIN_REDUCTION+173, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+173, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+173, // {"1".."9"}
MIN_REDUCTION+173, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+173, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+173, // $
MIN_REDUCTION+173, // $NT
  }
,
{ // state 493
122,614, // "+"
  }
,
{ // state 494
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 495
2,1598, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 496
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 497
93,563, // "n"
  }
,
{ // state 498
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 499
-1, // $$start
-1, // start
515, // ws*
-1, // $$0
MIN_REDUCTION+116, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+116, // "o"
1237, // "l"
473, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+116, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+116, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+116, // "u"
778, // "p"
MIN_REDUCTION+116, // "h"
1449, // "v"
MIN_REDUCTION+116, // "y"
MIN_REDUCTION+116, // "m"
1133, // "g"
MIN_REDUCTION+116, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+116, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+116, // {"1".."9"}
MIN_REDUCTION+116, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+116, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+116, // $
MIN_REDUCTION+116, // $NT
  }
,
{ // state 500
91,936, // "e"
  }
,
{ // state 501
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 502
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 503
-1, // $$start
-1, // start
441, // ws*
-1, // $$0
MIN_REDUCTION+95, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+95, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+95, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+95, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+95, // "u"
778, // "p"
MIN_REDUCTION+95, // "h"
1449, // "v"
MIN_REDUCTION+95, // "y"
MIN_REDUCTION+95, // "m"
1133, // "g"
MIN_REDUCTION+95, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+95, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+95, // {"1".."9"}
MIN_REDUCTION+95, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+95, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+95, // $
MIN_REDUCTION+95, // $NT
  }
,
{ // state 504
0x80000000|1061, // match move
0x80000000|1043, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 505
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 506
105,338, // "w"
  }
,
{ // state 507
0x80000000|1265, // match move
0x80000000|1142, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 508
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+196, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+196, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+196, // $
MIN_REDUCTION+196, // $NT
  }
,
{ // state 509
0x80000000|1032, // match move
0x80000000|503, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 510
92,1369, // "a"
  }
,
{ // state 511
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 512
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 513
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 514
177,MIN_REDUCTION+329, // $NT
  }
,
{ // state 515
0x80000000|312, // match move
0x80000000|389, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 516
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 517
177,MIN_REDUCTION+172, // $NT
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 518
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+148, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+148, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+148, // $
MIN_REDUCTION+148, // $NT
  }
,
{ // state 519
0x80000000|74, // match move
0x80000000|1406, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 520
2,576, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 521
0x80000000|258, // match move
0x80000000|99, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 522
0x80000000|479, // match move
0x80000000|508, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 523
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+217, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+217, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+217, // $
MIN_REDUCTION+217, // $NT
  }
,
{ // state 524
0x80000000|1, // match move
0x80000000|354, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 525
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 526
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 527
0x80000000|872, // match move
0x80000000|667, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 528
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 529
0x80000000|254, // match move
0x80000000|726, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 530
92,57, // "a"
  }
,
{ // state 531
89,593, // "o"
  }
,
{ // state 532
117,1042, // "*"
156,1251, // commentEnd
  }
,
{ // state 533
176,MIN_REDUCTION+0, // $
  }
,
{ // state 534
0x80000000|1, // match move
0x80000000|1324, // no-match move
// T-test match for "/":
116,
  }
,
{ // state 535
101,1311, // "t"
  }
,
{ // state 536
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 537
0x80000000|1315, // match move
0x80000000|1341, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 538
117,1554, // "*"
  }
,
{ // state 539
0x80000000|795, // match move
0x80000000|242, // no-match move
0x80000000|1370, // NT-test-match state for multiCommentContent
  }
,
{ // state 540
0x80000000|1213, // match move
0x80000000|715, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 541
2,440, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 542
101,660, // "t"
  }
,
{ // state 543
2,595, // ws*
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 544
99,864, // "s"
  }
,
{ // state 545
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 546
0x80000000|914, // match move
0x80000000|1095, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 547
-1, // $$start
-1, // start
401, // ws*
-1, // $$0
MIN_REDUCTION+250, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+250, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+250, // $
-1, // $NT
  }
,
{ // state 548
0x80000000|1073, // match move
0x80000000|1096, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 549
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 550
101,1468, // "t"
  }
,
{ // state 551
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 552
0x80000000|1116, // match move
0x80000000|462, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 553
0x80000000|166, // match move
0x80000000|16, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 554
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+124, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+124, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+124, // $
MIN_REDUCTION+124, // $NT
  }
,
{ // state 555
2,1531, // ws*
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 556
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 557
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 558
0x80000000|979, // match move
0x80000000|969, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 559
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 560
2,225, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 561
2,994, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 562
0x80000000|412, // match move
0x80000000|853, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 563
102,439, // "d"
  }
,
{ // state 564
0x80000000|1037, // match move
0x80000000|424, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 565
2,1376, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 566
177,MIN_REDUCTION+169, // $NT
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 567
0x80000000|118, // match move
0x80000000|1363, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 568
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 569
0x80000000|1238, // match move
0x80000000|674, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 570
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 571
0x80000000|1110, // match move
0x80000000|1127, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 572
-1, // $$start
-1, // start
910, // ws*
-1, // $$0
MIN_REDUCTION+316, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+316, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+316, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+316, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+316, // "u"
778, // "p"
MIN_REDUCTION+316, // "h"
1449, // "v"
MIN_REDUCTION+316, // "y"
MIN_REDUCTION+316, // "m"
1133, // "g"
MIN_REDUCTION+316, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+316, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+316, // {"1".."9"}
MIN_REDUCTION+316, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
1487, // idChar**
408, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+316, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
733, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+316, // $
-1, // $NT
  }
,
{ // state 573
119,1469, // "&"
  }
,
{ // state 574
4,1180, // token
58,168, // `!
59,1179, // `!=
60,19, // `%
61,717, // `&&
63,1420, // `(
64,141, // `)
65,692, // `{
66,731, // `}
67,1505, // `-
68,1252, // `+
69,1471, // `=
70,91, // `==
71,1597, // `[
72,233, // `]
73,106, // `||
74,1527, // `<
75,490, // `<=
76,1382, // `,
77,396, // `>
78,1521, // `>=
79,776, // `.
80,1088, // `;
81,1081, // `++
82,1178, // `--
83,455, // `/
84,1276, // ID
85,110, // INTLIT
86,1500, // STRINGLIT
87,1448, // CHARLIT
134,1241, // "0"
148,659, // letter
  }
,
{ // state 575
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 576
0x80000000|98, // match move
0x80000000|546, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 577
-1, // $$start
-1, // start
937, // ws*
-1, // $$0
MIN_REDUCTION+270, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+270, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+270, // $
-1, // $NT
  }
,
{ // state 578
2,418, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 579
0x80000000|1226, // match move
0x80000000|799, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 580
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 581
0x80000000|1182, // match move
0x80000000|671, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 582
-1, // $$start
-1, // start
440, // ws*
-1, // $$0
MIN_REDUCTION+236, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+236, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+236, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+236, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+236, // "u"
778, // "p"
MIN_REDUCTION+236, // "h"
1449, // "v"
MIN_REDUCTION+236, // "y"
MIN_REDUCTION+236, // "m"
1133, // "g"
MIN_REDUCTION+236, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+236, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+236, // {"1".."9"}
MIN_REDUCTION+236, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+236, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+236, // $
MIN_REDUCTION+236, // $NT
  }
,
{ // state 583
0x80000000|539, // match move
0x80000000|952, // no-match move
0x80000000|1291, // NT-test-match state for commentTerminal
  }
,
{ // state 584
177,MIN_REDUCTION+198, // $NT
  }
,
{ // state 585
0x80000000|478, // match move
0x80000000|1474, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 586
0x80000000|1, // match move
0x80000000|291, // no-match move
// T-test match for {'"' "\"}:
140,
145,
  }
,
{ // state 587
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 588
0x80000000|139, // match move
0x80000000|371, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 589
2,1283, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 590
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 591
0x80000000|1331, // match move
0x80000000|869, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 592
0x80000000|1029, // match move
0x80000000|216, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 593
93,1451, // "n"
  }
,
{ // state 594
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 595
0x80000000|373, // match move
0x80000000|1411, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 596
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 597
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 598
177,MIN_REDUCTION+123, // $NT
  }
,
{ // state 599
0x80000000|1516, // match move
0x80000000|933, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 600
0x80000000|1, // match move
0x80000000|1154, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 601
-1, // $$start
-1, // start
225, // ws*
-1, // $$0
MIN_REDUCTION+262, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
-1, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
-1, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+262, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
MIN_REDUCTION+262, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+262, // $
-1, // $NT
  }
,
{ // state 602
99,1201, // "s"
  }
,
{ // state 603
0x80000000|1, // match move
0x80000000|855, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 604
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 605
0x80000000|55, // match move
0x80000000|167, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 606
0x80000000|129, // match move
0x80000000|635, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 607
88,1072, // "b"
89,1072, // "o"
90,1072, // "l"
91,1072, // "e"
92,1072, // "a"
93,1072, // "n"
96,1072, // "r"
97,1072, // "k"
98,1072, // "c"
99,1072, // "s"
100,1072, // "x"
101,1072, // "t"
102,1072, // "d"
103,1072, // "f"
104,1072, // "i"
105,1072, // "w"
106,1072, // "u"
107,1072, // "p"
108,1072, // "h"
109,1072, // "v"
110,1072, // "y"
111,1072, // "m"
112,1072, // "g"
113,1072, // "z"
114,1072, // "!"
115,1072, // "="
116,1072, // "/"
117,1072, // "*"
118,1072, // "%"
119,1072, // "&"
120,1072, // "("
121,1072, // ")"
122,1072, // "+"
123,1072, // ","
124,1072, // "-"
125,1072, // "."
126,1072, // ";"
127,1072, // "<"
128,1072, // ">"
129,1072, // "["
130,1072, // "]"
131,1072, // "{"
132,1072, // "|"
133,1072, // "}"
134,1072, // "0"
135,1072, // {"1".."9"}
136,1072, // "X"
140,1072, // '"'
145,1072, // "\"
146,1072, // "'"
147,912, // printable
161,1072, // "_"
162,1072, // {"A".."W" "Y".."Z" "j" "q"}
163,1072, // {"#".."$" ":" "?".."@" "^" "`" "~"}
164,1072, // " "
  }
,
{ // state 608
177,MIN_REDUCTION+157, // $NT
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 609
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 610
0x80000000|1268, // match move
0x80000000|1590, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 611
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 612
91,688, // "e"
  }
,
{ // state 613
0x80000000|1570, // match move
0x80000000|309, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 614
0x80000000|801, // match move
0x80000000|1293, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 615
177,MIN_REDUCTION+180, // $NT
  }
,
{ // state 616
-1, // $$start
-1, // start
214, // ws*
-1, // $$0
MIN_REDUCTION+264, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+264, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+264, // $
-1, // $NT
  }
,
{ // state 617
0x80000000|399, // match move
0x80000000|636, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 618
146,136, // "'"
  }
,
{ // state 619
0x80000000|1246, // match move
0x80000000|489, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 620
2,383, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 621
0x80000000|1400, // match move
0x80000000|367, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 622
0x80000000|1, // match move
0x80000000|1166, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 623
0x80000000|495, // match move
0x80000000|1083, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 624
0x80000000|356, // match move
0x80000000|724, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 625
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 626
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 627
116,446, // "/"
117,85, // "*"
  }
,
{ // state 628
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 629
0x80000000|293, // match move
0x80000000|1583, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 630
0x80000000|485, // match move
0x80000000|276, // no-match move
0x80000000|1159, // NT-test-match state for digit
  }
,
{ // state 631
0x80000000|700, // match move
0x80000000|774, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 632
0x80000000|182, // match move
0x80000000|1329, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 633
4,1180, // token
5,1099, // `boolean
6,239, // `class
7,1052, // `extends
8,368, // `void
9,1507, // `int
10,1006, // `while
11,811, // `if
12,1518, // `else
13,570, // `for
14,745, // `break
15,1593, // `this
16,1439, // `false
17,1011, // `true
18,747, // `super
19,649, // `null
20,961, // `return
21,797, // `instanceof
22,822, // `new
23,146, // `abstract
24,958, // `assert
25,526, // `byte
26,45, // `case
27,1412, // `catch
28,341, // `char
29,420, // `const
30,90, // `continue
31,360, // `default
32,50, // `do
33,1327, // `double
34,568, // `enum
35,549, // `final
36,1189, // `finally
37,945, // `float
38,886, // `goto
39,474, // `implements
40,494, // `import
41,100, // `interface
42,1218, // `long
43,397, // `native
44,1530, // `package
45,1540, // `private
46,203, // `protected
47,1288, // `public
48,857, // `short
49,1244, // `static
50,25, // `strictfp
51,1559, // `switch
52,1190, // `synchronized
53,1259, // `throw
54,324, // `throws
55,868, // `transient
56,150, // `try
57,931, // `volatile
88,173, // "b"
90,1237, // "l"
91,1463, // "e"
92,1212, // "a"
93,1277, // "n"
96,1602, // "r"
98,1310, // "c"
99,1353, // "s"
101,1211, // "t"
102,1332, // "d"
103,1057, // "f"
104,1058, // "i"
105,1430, // "w"
107,778, // "p"
109,1449, // "v"
112,1133, // "g"
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 634
0x80000000|1214, // match move
0x80000000|547, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 635
0x80000000|355, // match move
0x80000000|220, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 636
-1, // $$start
-1, // start
1269, // ws*
-1, // $$0
MIN_REDUCTION+179, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+179, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+179, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+179, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+179, // "u"
778, // "p"
MIN_REDUCTION+179, // "h"
1449, // "v"
MIN_REDUCTION+179, // "y"
MIN_REDUCTION+179, // "m"
1133, // "g"
MIN_REDUCTION+179, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+179, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+179, // {"1".."9"}
MIN_REDUCTION+179, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+179, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+179, // $
MIN_REDUCTION+179, // $NT
  }
};
}
private class Initter4{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 637
0x80000000|1263, // match move
0x80000000|1264, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 638
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 639
0x80000000|894, // match move
0x80000000|791, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 640
-1, // $$start
-1, // start
835, // ws*
-1, // $$0
MIN_REDUCTION+104, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+104, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+104, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+104, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+104, // "u"
778, // "p"
MIN_REDUCTION+104, // "h"
1449, // "v"
MIN_REDUCTION+104, // "y"
MIN_REDUCTION+104, // "m"
1133, // "g"
MIN_REDUCTION+104, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+104, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+104, // {"1".."9"}
MIN_REDUCTION+104, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+104, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+104, // $
MIN_REDUCTION+104, // $NT
  }
,
{ // state 641
98,73, // "c"
  }
,
{ // state 642
177,MIN_REDUCTION+234, // $NT
  }
,
{ // state 643
177,MIN_REDUCTION+342, // $NT
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 644
0x80000000|753, // match move
0x80000000|39, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 645
0x80000000|1, // match move
0x80000000|944, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 646
2,20, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 647
0x80000000|511, // match move
0x80000000|606, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 648
93,292, // "n"
  }
,
{ // state 649
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 650
0x80000000|349, // match move
0x80000000|17, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 651
88,837, // "b"
89,837, // "o"
90,837, // "l"
91,837, // "e"
92,837, // "a"
93,837, // "n"
94,982, // idChar
96,837, // "r"
97,837, // "k"
98,837, // "c"
99,837, // "s"
100,837, // "x"
101,837, // "t"
102,837, // "d"
103,837, // "f"
104,837, // "i"
105,837, // "w"
106,837, // "u"
107,837, // "p"
108,837, // "h"
109,837, // "v"
110,837, // "y"
111,837, // "m"
112,837, // "g"
113,837, // "z"
134,909, // "0"
135,909, // {"1".."9"}
136,837, // "X"
148,204, // letter
160,427, // digit
161,1407, // "_"
162,837, // {"A".."W" "Y".."Z" "j" "q"}
  }
,
{ // state 652
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 653
2,69, // ws*
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 654
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 655
2,1349, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 656
0x80000000|987, // match move
0x80000000|995, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 657
-1, // $$start
-1, // start
1283, // ws*
-1, // $$0
MIN_REDUCTION+167, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+167, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+167, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+167, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+167, // "u"
778, // "p"
MIN_REDUCTION+167, // "h"
1449, // "v"
MIN_REDUCTION+167, // "y"
MIN_REDUCTION+167, // "m"
1133, // "g"
MIN_REDUCTION+167, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+167, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+167, // {"1".."9"}
MIN_REDUCTION+167, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+167, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+167, // $
MIN_REDUCTION+167, // $NT
  }
,
{ // state 658
2,988, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 659
0x80000000|1482, // match move
0x80000000|442, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 660
0x80000000|1, // match move
0x80000000|26, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 661
93,1351, // "n"
  }
,
{ // state 662
0x80000000|562, // match move
0x80000000|552, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 663
177,MIN_REDUCTION+160, // $NT
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 664
0x80000000|1186, // match move
0x80000000|4, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 665
101,81, // "t"
  }
,
{ // state 666
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 667
0x80000000|517, // match move
0x80000000|207, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 668
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+145, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+145, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+145, // $
MIN_REDUCTION+145, // $NT
  }
,
{ // state 669
0x80000000|1036, // match move
0x80000000|456, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 670
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 671
-1, // $$start
-1, // start
1079, // ws*
-1, // $$0
MIN_REDUCTION+185, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+185, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+185, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+185, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+185, // "u"
778, // "p"
MIN_REDUCTION+185, // "h"
1449, // "v"
MIN_REDUCTION+185, // "y"
MIN_REDUCTION+185, // "m"
1133, // "g"
MIN_REDUCTION+185, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+185, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+185, // {"1".."9"}
MIN_REDUCTION+185, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+185, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+185, // $
MIN_REDUCTION+185, // $NT
  }
,
{ // state 672
0x80000000|1253, // match move
0x80000000|1456, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 673
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 674
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+238, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+238, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+238, // $
MIN_REDUCTION+238, // $NT
  }
,
{ // state 675
0x80000000|484, // match move
0x80000000|144, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 676
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+244, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+244, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+244, // $
MIN_REDUCTION+244, // $NT
  }
,
{ // state 677
177,MIN_REDUCTION+223, // $NT
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 678
88,1309, // "b"
89,1309, // "o"
90,1309, // "l"
91,1309, // "e"
92,1309, // "a"
93,1309, // "n"
96,1309, // "r"
97,1309, // "k"
98,1309, // "c"
99,1309, // "s"
100,1309, // "x"
101,1309, // "t"
102,1309, // "d"
103,1309, // "f"
104,1309, // "i"
105,1309, // "w"
106,1309, // "u"
107,1309, // "p"
108,1309, // "h"
109,1309, // "v"
110,1309, // "y"
111,1309, // "m"
112,1309, // "g"
113,1309, // "z"
134,247, // "0"
135,247, // {"1".."9"}
136,1309, // "X"
148,514, // letter
160,804, // digit
161,737, // "_"
162,1309, // {"A".."W" "Y".."Z" "j" "q"}
  }
,
{ // state 679
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+241, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+241, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+241, // $
MIN_REDUCTION+241, // $NT
  }
,
{ // state 680
90,1261, // "l"
  }
,
{ // state 681
2,1199, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 682
93,138, // "n"
  }
,
{ // state 683
0x80000000|394, // match move
0x80000000|571, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 684
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+285, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+285, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+285, // $
-1, // $NT
  }
,
{ // state 685
0x80000000|1005, // match move
0x80000000|1115, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 686
168,643, // {10}
  }
,
{ // state 687
91,251, // "e"
  }
,
{ // state 688
93,991, // "n"
  }
,
{ // state 689
-1, // $$start
-1, // start
1007, // ws*
-1, // $$0
MIN_REDUCTION+268, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
-1, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
-1, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+268, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
MIN_REDUCTION+268, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+268, // $
-1, // $NT
  }
,
{ // state 690
0x80000000|986, // match move
0x80000000|1338, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 691
2,181, // ws*
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 692
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 693
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 694
0x80000000|325, // match move
0x80000000|331, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 695
0x80000000|1, // match move
0x80000000|314, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 696
177,MIN_REDUCTION+144, // $NT
  }
,
{ // state 697
116,52, // "/"
154,1144, // commentStart
157,1422, // multiCommentContent
  }
,
{ // state 698
-1, // $$start
-1, // start
51, // ws*
-1, // $$0
MIN_REDUCTION+143, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+143, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+143, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+143, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+143, // "u"
778, // "p"
MIN_REDUCTION+143, // "h"
1449, // "v"
MIN_REDUCTION+143, // "y"
MIN_REDUCTION+143, // "m"
1133, // "g"
MIN_REDUCTION+143, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+143, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+143, // {"1".."9"}
MIN_REDUCTION+143, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+143, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+143, // $
MIN_REDUCTION+143, // $NT
  }
,
{ // state 699
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+166, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+166, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+166, // $
MIN_REDUCTION+166, // $NT
  }
,
{ // state 700
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 701
0x80000000|1220, // match move
0x80000000|951, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 702
0x80000000|1151, // match move
0x80000000|960, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 703
0x80000000|1135, // match move
0x80000000|927, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 704
177,MIN_REDUCTION+186, // $NT
  }
,
{ // state 705
-1, // $$start
-1, // start
69, // ws*
-1, // $$0
MIN_REDUCTION+305, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+305, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+305, // $
-1, // $NT
  }
,
{ // state 706
0x80000000|875, // match move
0x80000000|1335, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 707
0x80000000|79, // match move
0x80000000|307, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 708
2,296, // ws*
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 709
0x80000000|1326, // match move
0x80000000|1308, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 710
0x80000000|714, // match move
0x80000000|1417, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 711
2,605, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 712
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+127, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+127, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+127, // $
MIN_REDUCTION+127, // $NT
  }
,
{ // state 713
91,164, // "e"
  }
,
{ // state 714
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 715
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+97, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+97, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+97, // $
MIN_REDUCTION+97, // $NT
  }
,
{ // state 716
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 717
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 718
0x80000000|1101, // match move
0x80000000|1314, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 719
98,297, // "c"
  }
,
{ // state 720
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 721
177,MIN_REDUCTION+184, // $NT
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 722
-1, // $$start
-1, // start
710, // ws*
-1, // $$0
MIN_REDUCTION+113, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+113, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+113, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+113, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+113, // "u"
778, // "p"
MIN_REDUCTION+113, // "h"
1449, // "v"
MIN_REDUCTION+113, // "y"
MIN_REDUCTION+113, // "m"
1133, // "g"
MIN_REDUCTION+113, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+113, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+113, // {"1".."9"}
MIN_REDUCTION+113, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+113, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+113, // $
MIN_REDUCTION+113, // $NT
  }
,
{ // state 723
0x80000000|1, // match move
0x80000000|48, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 724
-1, // $$start
-1, // start
289, // ws*
-1, // $$0
MIN_REDUCTION+140, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+140, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+140, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+140, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+140, // "u"
778, // "p"
MIN_REDUCTION+140, // "h"
1449, // "v"
MIN_REDUCTION+140, // "y"
MIN_REDUCTION+140, // "m"
1133, // "g"
MIN_REDUCTION+140, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+140, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+140, // {"1".."9"}
MIN_REDUCTION+140, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+140, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+140, // $
MIN_REDUCTION+140, // $NT
  }
,
{ // state 725
0x80000000|541, // match move
0x80000000|582, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 726
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+205, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+205, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+205, // $
MIN_REDUCTION+205, // $NT
  }
,
{ // state 727
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+199, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+199, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+199, // $
MIN_REDUCTION+199, // $NT
  }
,
{ // state 728
0x80000000|1297, // match move
0x80000000|1493, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 729
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+208, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+208, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+208, // $
MIN_REDUCTION+208, // $NT
  }
,
{ // state 730
177,MIN_REDUCTION+199, // $NT
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 731
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 732
0x80000000|228, // match move
0x80000000|1290, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 733
0x80000000|651, // match move
0x80000000|111, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 734
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 735
0x80000000|43, // match move
0x80000000|198, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 736
92,1539, // "a"
  }
,
{ // state 737
177,MIN_REDUCTION+331, // $NT
  }
,
{ // state 738
177,MIN_REDUCTION+174, // $NT
  }
,
{ // state 739
116,538, // "/"
154,1034, // commentStart
  }
,
{ // state 740
0x80000000|1601, // match move
0x80000000|1294, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 741
-1, // $$start
-1, // start
567, // ws*
-1, // $$0
MIN_REDUCTION+209, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+209, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+209, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+209, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+209, // "u"
778, // "p"
MIN_REDUCTION+209, // "h"
1449, // "v"
MIN_REDUCTION+209, // "y"
MIN_REDUCTION+209, // "m"
1133, // "g"
MIN_REDUCTION+209, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+209, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+209, // {"1".."9"}
MIN_REDUCTION+209, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+209, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+209, // $
MIN_REDUCTION+209, // $NT
  }
,
{ // state 742
177,MIN_REDUCTION+226, // $NT
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 743
104,322, // "i"
  }
,
{ // state 744
101,109, // "t"
  }
,
{ // state 745
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 746
2,214, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 747
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 748
-1, // $$start
-1, // start
337, // ws*
-1, // $$0
MIN_REDUCTION+258, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+258, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+258, // $
-1, // $NT
  }
,
{ // state 749
0x80000000|496, // match move
0x80000000|1169, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 750
177,MIN_REDUCTION+99, // $NT
  }
,
{ // state 751
90,1087, // "l"
  }
,
{ // state 752
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+297, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+297, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+297, // $
-1, // $NT
  }
,
{ // state 753
2,1357, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 754
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 755
0x80000000|1433, // match move
0x80000000|1479, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 756
0x80000000|1067, // match move
0x80000000|757, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 757
0x80000000|213, // match move
0x80000000|448, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 758
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 759
108,1544, // "h"
  }
,
{ // state 760
0x80000000|1455, // match move
0x80000000|1389, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 761
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 762
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 763
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 764
2,835, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 765
0x80000000|75, // match move
0x80000000|970, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 766
0x80000000|1141, // match move
0x80000000|460, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 767
2,937, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 768
0x80000000|1, // match move
0x80000000|1232, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 769
0x80000000|578, // match move
0x80000000|444, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 770
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 771
177,MIN_REDUCTION+343, // $NT
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 772
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 773
0x80000000|266, // match move
0x80000000|1600, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 774
0x80000000|1373, // match move
0x80000000|60, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 775
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 776
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 777
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 778
92,236, // "a"
96,1164, // "r"
106,465, // "u"
  }
,
{ // state 779
0x80000000|1197, // match move
0x80000000|1132, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 780
91,41, // "e"
  }
,
{ // state 781
0x80000000|896, // match move
0x80000000|926, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 782
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 783
101,1437, // "t"
  }
,
{ // state 784
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 785
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 786
0x80000000|1496, // match move
0x80000000|911, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 787
0x80000000|604, // match move
0x80000000|1380, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 788
0x80000000|1296, // match move
0x80000000|1579, // no-match move
0x80000000|1370, // NT-test-match state for multiCommentContent
  }
,
{ // state 789
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 790
0x80000000|566, // match move
0x80000000|224, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 791
-1, // $$start
-1, // start
1139, // ws*
-1, // $$0
MIN_REDUCTION+107, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+107, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+107, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+107, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+107, // "u"
778, // "p"
MIN_REDUCTION+107, // "h"
1449, // "v"
MIN_REDUCTION+107, // "y"
MIN_REDUCTION+107, // "m"
1133, // "g"
MIN_REDUCTION+107, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+107, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+107, // {"1".."9"}
MIN_REDUCTION+107, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+107, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+107, // $
MIN_REDUCTION+107, // $NT
  }
,
{ // state 792
0x80000000|873, // match move
0x80000000|1462, // no-match move
0x80000000|1605, // NT-test-match state for stringChar
  }
,
{ // state 793
0x80000000|887, // match move
0x80000000|102, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 794
0x80000000|209, // match move
0x80000000|1599, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 795
116,52, // "/"
154,1144, // commentStart
157,865, // multiCommentContent
159,532, // multiCommentContent**
172,1084, // multiCommentContent*
  }
,
{ // state 796
0x80000000|1478, // match move
0x80000000|1362, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 797
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 798
2,631, // ws*
153,1149, // eol
164,878, // " "
166,1033, // ws
167,878, // {9}
168,259, // {10}
169,466, // {13}
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 799
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+94, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+94, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+94, // $
MIN_REDUCTION+94, // $NT
  }
,
{ // state 800
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+190, // (default reduction)
  }
};
}
private class Initter5{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 801
2,214, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 802
0x80000000|131, // match move
0x80000000|170, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 803
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+277, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+277, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+277, // $
-1, // $NT
  }
,
{ // state 804
177,MIN_REDUCTION+330, // $NT
  }
,
{ // state 805
0x80000000|1, // match move
0x80000000|1161, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 806
0x80000000|257, // match move
0x80000000|989, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 807
2,672, // ws*
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 808
-1, // $$start
-1, // start
672, // ws*
-1, // $$0
MIN_REDUCTION+280, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+280, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+280, // $
-1, // $NT
  }
,
{ // state 809
2,401, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 810
177,MIN_REDUCTION+150, // $NT
  }
,
{ // state 811
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 812
90,1427, // "l"
  }
,
{ // state 813
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 814
0x80000000|463, // match move
0x80000000|1372, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 815
177,MIN_REDUCTION+136, // $NT
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 816
0x80000000|919, // match move
0x80000000|1183, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 817
2,937, // ws*
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 818
0x80000000|1271, // match move
0x80000000|905, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 819
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 820
0x80000000|892, // match move
0x80000000|1055, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 821
177,MIN_REDUCTION+112, // $NT
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 822
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 823
92,9, // "a"
104,1240, // "i"
106,687, // "u"
110,877, // "y"
  }
,
{ // state 824
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 825
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 826
0x80000000|1, // match move
0x80000000|1056, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 827
2,180, // ws*
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 828
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+160, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+160, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+160, // $
MIN_REDUCTION+160, // $NT
  }
,
{ // state 829
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+142, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+142, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+142, // $
MIN_REDUCTION+142, // $NT
  }
,
{ // state 830
115,920, // "="
  }
,
{ // state 831
0x80000000|1210, // match move
0x80000000|1503, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 832
0x80000000|11, // match move
0x80000000|1013, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 833
101,30, // "t"
  }
,
{ // state 834
0x80000000|302, // match move
0x80000000|1450, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 835
0x80000000|428, // match move
0x80000000|1537, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 836
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 837
0x80000000|525, // match move
0x80000000|278, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 838
177,MIN_REDUCTION+109, // $NT
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 839
177,MIN_REDUCTION+108, // $NT
  }
,
{ // state 840
177,MIN_REDUCTION+121, // $NT
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 841
0x80000000|608, // match move
0x80000000|237, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 842
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 843
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 844
0x80000000|1098, // match move
0x80000000|248, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 845
101,924, // "t"
  }
,
{ // state 846
2,848, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 847
106,1379, // "u"
  }
,
{ // state 848
0x80000000|852, // match move
0x80000000|1231, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 849
0x80000000|372, // match move
0x80000000|385, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 850
0x80000000|1502, // match move
0x80000000|548, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 851
0x80000000|1282, // match move
0x80000000|1345, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 852
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 853
3,1230, // $$0
4,321, // token
58,168, // `!
59,1179, // `!=
60,19, // `%
61,717, // `&&
63,1420, // `(
64,141, // `)
65,692, // `{
66,731, // `}
67,1505, // `-
68,1252, // `+
69,1471, // `=
70,91, // `==
71,1597, // `[
72,233, // `]
73,106, // `||
74,1527, // `<
75,490, // `<=
76,1382, // `,
77,396, // `>
78,1521, // `>=
79,776, // `.
80,1088, // `;
81,1081, // `++
82,1178, // `--
83,455, // `/
84,1276, // ID
85,110, // INTLIT
86,1500, // STRINGLIT
87,1448, // CHARLIT
134,1241, // "0"
148,659, // letter
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
174,760, // token*
  }
,
{ // state 854
177,MIN_REDUCTION+138, // $NT
  }
,
{ // state 855
0x80000000|1222, // match move
0x80000000|1514, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 856
-1, // $$start
533, // start
992, // ws*
229, // $$0
321, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
-1, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
760, // token*
145, // digit+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 857
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 858
0x80000000|830, // match move
0x80000000|941, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 859
0x80000000|1019, // match move
0x80000000|1234, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 860
0x80000000|1548, // match move
0x80000000|722, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 861
2,1531, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 862
0x80000000|1204, // match move
0x80000000|698, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 863
92,1556, // "a"
  }
,
{ // state 864
91,1337, // "e"
  }
,
{ // state 865
0x80000000|283, // match move
0x80000000|498, // no-match move
0x80000000|1370, // NT-test-match state for multiCommentContent
  }
,
{ // state 866
-1, // $$start
-1, // start
1199, // ws*
-1, // $$0
MIN_REDUCTION+137, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+137, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+137, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+137, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+137, // "u"
778, // "p"
MIN_REDUCTION+137, // "h"
1449, // "v"
MIN_REDUCTION+137, // "y"
MIN_REDUCTION+137, // "m"
1133, // "g"
MIN_REDUCTION+137, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+137, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+137, // {"1".."9"}
MIN_REDUCTION+137, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+137, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+137, // $
MIN_REDUCTION+137, // $NT
  }
,
{ // state 867
-1, // $$start
-1, // start
994, // ws*
-1, // $$0
MIN_REDUCTION+155, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+155, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+155, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+155, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+155, // "u"
778, // "p"
MIN_REDUCTION+155, // "h"
1449, // "v"
MIN_REDUCTION+155, // "y"
MIN_REDUCTION+155, // "m"
1133, // "g"
MIN_REDUCTION+155, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+155, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+155, // {"1".."9"}
MIN_REDUCTION+155, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+155, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+155, // $
MIN_REDUCTION+155, // $NT
  }
,
{ // state 868
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 869
-1, // $$start
-1, // start
458, // ws*
-1, // $$0
MIN_REDUCTION+286, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
-1, // `=
-1, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
MIN_REDUCTION+286, // "="
64, // "/"
MIN_REDUCTION+286, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+286, // $
-1, // $NT
  }
,
{ // state 870
0x80000000|1545, // match move
0x80000000|294, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 871
-1, // $$start
-1, // start
21, // ws*
-1, // $$0
MIN_REDUCTION+122, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+122, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+122, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+122, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+122, // "u"
778, // "p"
MIN_REDUCTION+122, // "h"
1449, // "v"
MIN_REDUCTION+122, // "y"
MIN_REDUCTION+122, // "m"
1133, // "g"
MIN_REDUCTION+122, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+122, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+122, // {"1".."9"}
MIN_REDUCTION+122, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+122, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+122, // $
MIN_REDUCTION+122, // $NT
  }
,
{ // state 872
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 873
0x80000000|1, // match move
0x80000000|1425, // no-match move
// T-test match for {'"' "\"}:
140,
145,
  }
,
{ // state 874
0x80000000|1040, // match move
0x80000000|1105, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 875
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 876
2,1349, // ws*
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 877
0x80000000|1, // match move
0x80000000|1416, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 878
177,MIN_REDUCTION+337, // $NT
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 879
0x80000000|1371, // match move
0x80000000|1305, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 880
0x80000000|134, // match move
0x80000000|407, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 881
2,1004, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 882
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+109, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+109, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+109, // $
MIN_REDUCTION+109, // $NT
  }
,
{ // state 883
90,535, // "l"
  }
,
{ // state 884
92,550, // "a"
  }
,
{ // state 885
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 886
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 887
2,1007, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 888
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+249, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+249, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+249, // $
-1, // $NT
  }
,
{ // state 889
1,533, // start
2,992, // ws*
3,229, // $$0
4,321, // token
58,168, // `!
59,1179, // `!=
60,19, // `%
61,717, // `&&
62,1484, // `*
63,1420, // `(
64,141, // `)
65,692, // `{
66,731, // `}
67,1505, // `-
68,1252, // `+
69,1471, // `=
70,91, // `==
71,1597, // `[
72,233, // `]
73,106, // `||
74,1527, // `<
75,490, // `<=
76,1382, // `,
77,396, // `>
78,1521, // `>=
79,776, // `.
80,1088, // `;
81,1081, // `++
82,1178, // `--
84,1276, // ID
85,110, // INTLIT
86,1500, // STRINGLIT
87,1448, // CHARLIT
117,38, // "*"
137,968, // intLit2
139,282, // digit++
148,659, // letter
153,1149, // eol
160,630, // digit
166,1033, // ws
174,760, // token*
175,145, // digit+
  }
,
{ // state 890
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 891
0x80000000|1000, // match move
0x80000000|1049, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 892
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 893
0x80000000|620, // match move
0x80000000|1191, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 894
2,1139, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 895
109,884, // "v"
  }
,
{ // state 896
2,880, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 897
2,296, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 898
0x80000000|280, // match move
0x80000000|8, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 899
0x80000000|1012, // match move
0x80000000|492, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 900
115,650, // "="
  }
,
{ // state 901
2,225, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 902
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+235, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+235, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+235, // $
MIN_REDUCTION+235, // $NT
  }
,
{ // state 903
177,MIN_REDUCTION+135, // $NT
  }
,
{ // state 904
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 905
0x80000000|555, // match move
0x80000000|476, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 906
177,MIN_REDUCTION+339, // $NT
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 907
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+255, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+255, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+255, // $
-1, // $NT
  }
,
{ // state 908
177,MIN_REDUCTION+204, // $NT
  }
,
{ // state 909
0x80000000|1392, // match move
0x80000000|597, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 910
0x80000000|1181, // match move
0x80000000|375, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 911
0x80000000|673, // match move
0x80000000|346, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 912
177,MIN_REDUCTION+335, // $NT
  }
,
{ // state 913
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 914
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 915
177,MIN_REDUCTION+175, // $NT
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 916
2,848, // ws*
58,168, // `!
59,1179, // `!=
60,19, // `%
61,717, // `&&
63,1420, // `(
64,141, // `)
65,692, // `{
66,731, // `}
67,1505, // `-
68,1252, // `+
69,1471, // `=
70,91, // `==
71,1597, // `[
72,233, // `]
73,106, // `||
74,1527, // `<
75,490, // `<=
76,1382, // `,
77,396, // `>
78,1521, // `>=
79,776, // `.
80,1088, // `;
81,1081, // `++
82,1178, // `--
83,455, // `/
84,1276, // ID
86,1500, // STRINGLIT
87,1448, // CHARLIT
88,837, // "b"
89,837, // "o"
90,837, // "l"
91,837, // "e"
92,837, // "a"
93,837, // "n"
96,837, // "r"
97,837, // "k"
98,837, // "c"
99,837, // "s"
100,837, // "x"
101,837, // "t"
102,837, // "d"
103,837, // "f"
104,837, // "i"
105,837, // "w"
106,837, // "u"
107,837, // "p"
108,837, // "h"
109,837, // "v"
110,837, // "y"
111,837, // "m"
112,837, // "g"
113,837, // "z"
114,369, // "!"
115,83, // "="
116,64, // "/"
118,621, // "%"
119,573, // "&"
120,147, // "("
121,521, // ")"
122,1250, // "+"
123,893, // ","
124,313, // "-"
125,1272, // "."
126,690, // ";"
127,858, // "<"
128,113, // ">"
129,1343, // "["
130,1551, // "]"
131,197, // "{"
132,284, // "|"
133,703, // "}"
136,837, // "X"
140,792, // '"'
146,1563, // "'"
148,659, // letter
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
162,837, // {"A".."W" "Y".."Z" "j" "q"}
164,878, // " "
166,1033, // ws
167,878, // {9}
168,259, // {10}
169,466, // {13}
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 917
103,1452, // "f"
  }
,
{ // state 918
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 919
0x80000000|1513, // match move
0x80000000|471, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 920
0x80000000|1441, // match move
0x80000000|304, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 921
0x80000000|1172, // match move
0x80000000|24, // no-match move
0x80000000|223, // NT-test-match state for printable
  }
,
{ // state 922
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+175, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+175, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+175, // $
MIN_REDUCTION+175, // $NT
  }
,
{ // state 923
0x80000000|1125, // match move
0x80000000|335, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 924
104,1124, // "i"
  }
,
{ // state 925
0x80000000|1, // match move
0x80000000|453, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 926
-1, // $$start
-1, // start
880, // ws*
-1, // $$0
MIN_REDUCTION+110, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+110, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+110, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+110, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+110, // "u"
778, // "p"
MIN_REDUCTION+110, // "h"
1449, // "v"
MIN_REDUCTION+110, // "y"
MIN_REDUCTION+110, // "m"
1133, // "g"
MIN_REDUCTION+110, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+110, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+110, // {"1".."9"}
MIN_REDUCTION+110, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+110, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+110, // $
MIN_REDUCTION+110, // $NT
  }
,
{ // state 927
0x80000000|76, // match move
0x80000000|1051, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 928
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 929
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 930
101,847, // "t"
  }
,
{ // state 931
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 932
89,1557, // "o"
  }
,
{ // state 933
0x80000000|274, // match move
0x80000000|300, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 934
2,647, // ws*
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 935
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+193, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+193, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+193, // $
MIN_REDUCTION+193, // $NT
  }
,
{ // state 936
102,107, // "d"
  }
,
{ // state 937
0x80000000|611, // match move
0x80000000|1525, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 938
0x80000000|61, // match move
0x80000000|1364, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 939
2,834, // ws*
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 940
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+211, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+211, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+211, // $
MIN_REDUCTION+211, // $NT
  }
,
{ // state 941
0x80000000|1027, // match move
0x80000000|330, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 942
177,MIN_REDUCTION+324, // $NT
  }
,
{ // state 943
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 944
0x80000000|1596, // match move
0x80000000|1508, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 945
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 946
91,736, // "e"
  }
,
{ // state 947
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 948
0x80000000|681, // match move
0x80000000|866, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 949
2,672, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 950
0x80000000|670, // match move
0x80000000|505, // no-match move
0x80000000|1605, // NT-test-match state for stringChar
  }
,
{ // state 951
0x80000000|1145, // match move
0x80000000|1506, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 952
88,241, // "b"
89,241, // "o"
90,241, // "l"
91,241, // "e"
92,241, // "a"
93,241, // "n"
96,241, // "r"
97,241, // "k"
98,241, // "c"
99,241, // "s"
100,241, // "x"
101,241, // "t"
102,241, // "d"
103,241, // "f"
104,241, // "i"
105,241, // "w"
106,241, // "u"
107,241, // "p"
108,241, // "h"
109,241, // "v"
110,241, // "y"
111,241, // "m"
112,241, // "g"
113,241, // "z"
114,241, // "!"
115,241, // "="
116,241, // "/"
117,241, // "*"
118,241, // "%"
119,241, // "&"
120,241, // "("
121,241, // ")"
122,241, // "+"
123,241, // ","
124,241, // "-"
125,241, // "."
126,241, // ";"
127,241, // "<"
128,241, // ">"
129,241, // "["
130,241, // "]"
131,241, // "{"
132,241, // "|"
133,241, // "}"
134,241, // "0"
135,241, // {"1".."9"}
136,241, // "X"
140,241, // '"'
145,241, // "\"
146,241, // "'"
147,382, // printable
153,1167, // eol
157,865, // multiCommentContent
159,532, // multiCommentContent**
161,241, // "_"
162,241, // {"A".."W" "Y".."Z" "j" "q"}
163,241, // {"#".."$" ":" "?".."@" "^" "`" "~"}
164,241, // " "
168,135, // {10}
169,1546, // {13}
172,1084, // multiCommentContent*
  }
,
{ // state 953
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+291, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+291, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+291, // $
-1, // $NT
  }
,
{ // state 954
0x80000000|1078, // match move
0x80000000|1322, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 955
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+267, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+267, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+267, // $
-1, // $NT
  }
,
{ // state 956
177,MIN_REDUCTION+231, // $NT
  }
,
{ // state 957
-1, // $$start
-1, // start
1137, // ws*
-1, // $$0
MIN_REDUCTION+191, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+191, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+191, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+191, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+191, // "u"
778, // "p"
MIN_REDUCTION+191, // "h"
1449, // "v"
MIN_REDUCTION+191, // "y"
MIN_REDUCTION+191, // "m"
1133, // "g"
MIN_REDUCTION+191, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+191, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+191, // {"1".."9"}
MIN_REDUCTION+191, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+191, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+191, // $
MIN_REDUCTION+191, // $NT
  }
,
{ // state 958
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 959
107,189, // "p"
  }
,
{ // state 960
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+103, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+103, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+103, // $
MIN_REDUCTION+103, // $NT
  }
,
{ // state 961
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 962
0x80000000|501, // match move
0x80000000|907, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 963
89,1224, // "o"
  }
,
{ // state 964
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 965
177,MIN_REDUCTION+320, // $NT
  }
,
{ // state 966
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 967
0x80000000|775, // match move
0x80000000|1111, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 968
0x80000000|1336, // match move
0x80000000|599, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 969
0x80000000|1045, // match move
0x80000000|1586, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 970
-1, // $$start
-1, // start
874, // ws*
-1, // $$0
MIN_REDUCTION+158, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+158, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+158, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+158, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+158, // "u"
778, // "p"
MIN_REDUCTION+158, // "h"
1449, // "v"
MIN_REDUCTION+158, // "y"
MIN_REDUCTION+158, // "m"
1133, // "g"
MIN_REDUCTION+158, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+158, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+158, // {"1".."9"}
MIN_REDUCTION+158, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+158, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+158, // $
MIN_REDUCTION+158, // $NT
  }
,
{ // state 971
101,1302, // "t"
  }
,
{ // state 972
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 973
177,MIN_REDUCTION+96, // $NT
  }
,
{ // state 974
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+232, // (default reduction)
  }
};
}
private class Initter6{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 975
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 976
0x80000000|821, // match move
0x80000000|984, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 977
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 978
2,685, // ws*
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 979
2,320, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 980
-1, // $$start
-1, // start
814, // ws*
-1, // $$0
MIN_REDUCTION+239, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+239, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+239, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+239, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+239, // "u"
778, // "p"
MIN_REDUCTION+239, // "h"
1449, // "v"
MIN_REDUCTION+239, // "y"
MIN_REDUCTION+239, // "m"
1133, // "g"
MIN_REDUCTION+239, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+239, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+239, // {"1".."9"}
MIN_REDUCTION+239, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+239, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+239, // $
MIN_REDUCTION+239, // $NT
  }
,
{ // state 981
0x80000000|652, // match move
0x80000000|694, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 982
0x80000000|1018, // match move
0x80000000|770, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 983
-1, // $$start
-1, // start
1177, // ws*
-1, // $$0
MIN_REDUCTION+152, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+152, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+152, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+152, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+152, // "u"
778, // "p"
MIN_REDUCTION+152, // "h"
1449, // "v"
MIN_REDUCTION+152, // "y"
MIN_REDUCTION+152, // "m"
1133, // "g"
MIN_REDUCTION+152, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+152, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+152, // {"1".."9"}
MIN_REDUCTION+152, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+152, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+152, // $
MIN_REDUCTION+152, // $NT
  }
,
{ // state 984
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+112, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+112, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+112, // $
MIN_REDUCTION+112, // $NT
  }
,
{ // state 985
97,863, // "k"
  }
,
{ // state 986
2,181, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 987
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 988
0x80000000|316, // match move
0x80000000|787, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 989
0x80000000|277, // match move
0x80000000|457, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 990
2,613, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 991
101,429, // "t"
  }
,
{ // state 992
0x80000000|287, // match move
0x80000000|662, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 993
2,1007, // ws*
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 994
0x80000000|754, // match move
0x80000000|183, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 995
0x80000000|34, // match move
0x80000000|377, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 996
115,519, // "="
  }
,
{ // state 997
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 998
2,910, // ws*
149,1487, // idChar**
150,408, // $$2
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
170,733, // idChar*
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 999
91,1146, // "e"
  }
,
{ // state 1000
2,31, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 1001
0x80000000|809, // match move
0x80000000|1155, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1002
98,759, // "c"
  }
,
{ // state 1003
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 1004
0x80000000|1374, // match move
0x80000000|831, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1005
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 1006
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 1007
0x80000000|1511, // match move
0x80000000|1401, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1008
0x80000000|470, // match move
0x80000000|935, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1009
0x80000000|1026, // match move
0x80000000|522, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1010
102,1130, // "d"
  }
,
{ // state 1011
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 1012
2,206, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 1013
-1, // $$start
-1, // start
656, // ws*
-1, // $$0
MIN_REDUCTION+224, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+224, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+224, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+224, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+224, // "u"
778, // "p"
MIN_REDUCTION+224, // "h"
1449, // "v"
MIN_REDUCTION+224, // "y"
MIN_REDUCTION+224, // "m"
1133, // "g"
MIN_REDUCTION+224, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+224, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+224, // {"1".."9"}
MIN_REDUCTION+224, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+224, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+224, // $
MIN_REDUCTION+224, // $NT
  }
,
{ // state 1014
177,MIN_REDUCTION+163, // $NT
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 1015
0x80000000|1, // match move
0x80000000|617, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 1016
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+133, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+133, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+133, // $
MIN_REDUCTION+133, // $NT
  }
,
{ // state 1017
2,383, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 1018
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 1019
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 1020
0x80000000|1, // match move
0x80000000|798, // no-match move
// T-test match for {"*" "/"}:
116,
117,
  }
,
{ // state 1021
0x80000000|272, // match move
0x80000000|1075, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1022
177,MIN_REDUCTION+141, // $NT
  }
,
{ // state 1023
0x80000000|1333, // match move
0x80000000|676, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1024
0x80000000|1249, // match move
0x80000000|1059, // no-match move
0x80000000|223, // NT-test-match state for printable
  }
,
{ // state 1025
0x80000000|586, // match move
0x80000000|121, // no-match move
0x80000000|1605, // NT-test-match state for stringChar
  }
,
{ // state 1026
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 1027
2,988, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1028
2,1121, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 1029
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 1030
177,MIN_REDUCTION+102, // $NT
  }
,
{ // state 1031
105,1344, // "w"
  }
,
{ // state 1032
2,441, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1033
177,MIN_REDUCTION+347, // $NT
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 1034
177,MIN_REDUCTION+325, // $NT
  }
,
{ // state 1035
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 1036
177,MIN_REDUCTION+100, // $NT
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 1037
177,MIN_REDUCTION+91, // $NT
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 1038
0x80000000|528, // match move
0x80000000|1093, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1039
0x80000000|148, // match move
0x80000000|1009, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1040
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1041
-1, // $$start
-1, // start
685, // ws*
-1, // $$0
MIN_REDUCTION+365, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+365, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+365, // $
-1, // $NT
  }
,
{ // state 1042
116,1592, // "/"
  }
,
{ // state 1043
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+269, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+269, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+269, // $
-1, // $NT
  }
,
{ // state 1044
0x80000000|1, // match move
0x80000000|509, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 1045
2,320, // ws*
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 1046
177,MIN_REDUCTION+129, // $NT
  }
,
{ // state 1047
177,MIN_REDUCTION+111, // $NT
  }
,
{ // state 1048
0x80000000|638, // match move
0x80000000|1023, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1049
-1, // $$start
-1, // start
31, // ws*
-1, // $$0
MIN_REDUCTION+203, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+203, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+203, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+203, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+203, // "u"
778, // "p"
MIN_REDUCTION+203, // "h"
1449, // "v"
MIN_REDUCTION+203, // "y"
MIN_REDUCTION+203, // "m"
1133, // "g"
MIN_REDUCTION+203, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+203, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+203, // {"1".."9"}
MIN_REDUCTION+203, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+203, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+203, // $
MIN_REDUCTION+203, // $NT
  }
,
{ // state 1050
0x80000000|1209, // match move
0x80000000|116, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1051
0x80000000|939, // match move
0x80000000|133, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1052
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 1053
89,80, // "o"
110,227, // "y"
  }
,
{ // state 1054
0x80000000|66, // match move
0x80000000|315, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 1055
0x80000000|445, // match move
0x80000000|1491, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1056
0x80000000|77, // match move
0x80000000|1255, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1057
89,1070, // "o"
90,932, // "l"
92,1065, // "a"
104,661, // "i"
  }
,
{ // state 1058
93,1107, // "n"
103,1138, // "f"
111,959, // "m"
  }
,
{ // state 1059
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 1060
-1, // $$start
-1, // start
954, // ws*
-1, // $$0
MIN_REDUCTION+164, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+164, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+164, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+164, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+164, // "u"
778, // "p"
MIN_REDUCTION+164, // "h"
1449, // "v"
MIN_REDUCTION+164, // "y"
MIN_REDUCTION+164, // "m"
1133, // "g"
MIN_REDUCTION+164, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+164, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+164, // {"1".."9"}
MIN_REDUCTION+164, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+164, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+164, // $
MIN_REDUCTION+164, // $NT
  }
,
{ // state 1061
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 1062
0x80000000|1, // match move
0x80000000|639, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 1063
0x80000000|861, // match move
0x80000000|818, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1064
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 1065
90,417, // "l"
  }
,
{ // state 1066
0x80000000|124, // match move
0x80000000|56, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1067
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1068
0x80000000|1256, // match move
0x80000000|1131, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 1069
0x80000000|1, // match move
0x80000000|891, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 1070
96,1062, // "r"
  }
,
{ // state 1071
0x80000000|158, // match move
0x80000000|163, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1072
177,MIN_REDUCTION+334, // $NT
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 1073
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1074
2,337, // ws*
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 1075
0x80000000|411, // match move
0x80000000|393, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1076
0x80000000|149, // match move
0x80000000|955, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1077
0x80000000|653, // match move
0x80000000|705, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1078
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 1079
0x80000000|1522, // match move
0x80000000|851, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1080
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+261, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+261, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+261, // $
-1, // $NT
  }
,
{ // state 1081
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 1082
177,MIN_REDUCTION+124, // $NT
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1083
-1, // $$start
-1, // start
1598, // ws*
-1, // $$0
MIN_REDUCTION+125, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+125, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+125, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+125, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+125, // "u"
778, // "p"
MIN_REDUCTION+125, // "h"
1449, // "v"
MIN_REDUCTION+125, // "y"
MIN_REDUCTION+125, // "m"
1133, // "g"
MIN_REDUCTION+125, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+125, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+125, // {"1".."9"}
MIN_REDUCTION+125, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+125, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+125, // $
MIN_REDUCTION+125, // $NT
  }
,
{ // state 1084
0x80000000|1361, // match move
0x80000000|1301, // no-match move
0x80000000|1291, // NT-test-match state for commentTerminal
  }
,
{ // state 1085
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 1086
0x80000000|1398, // match move
0x80000000|264, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1087
91,386, // "e"
  }
,
{ // state 1088
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 1089
177,MIN_REDUCTION+232, // $NT
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 1090
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 1091
2,33, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1092
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+121, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+121, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+121, // $
MIN_REDUCTION+121, // $NT
  }
,
{ // state 1093
0x80000000|1118, // match move
0x80000000|1194, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1094
-1, // $$start
-1, // start
414, // ws*
-1, // $$0
MIN_REDUCTION+260, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+260, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+260, // $
-1, // $NT
  }
,
{ // state 1095
0x80000000|557, // match move
0x80000000|953, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1096
0x80000000|609, // match move
0x80000000|2, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1097
91,1239, // "e"
  }
,
{ // state 1098
2,732, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 1099
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 1100
-1, // $$start
-1, // start
647, // ws*
-1, // $$0
MIN_REDUCTION+312, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+312, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+312, // $
-1, // $NT
  }
,
{ // state 1101
2,180, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 1102
2,595, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 1103
0x80000000|1436, // match move
0x80000000|668, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1104
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 1105
0x80000000|1499, // match move
0x80000000|841, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1106
177,MIN_REDUCTION+241, // $NT
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 1107
99,971, // "s"
101,1564, // "t"
  }
,
{ // state 1108
177,MIN_REDUCTION+90, // $NT
  }
,
{ // state 1109
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 1110
2,910, // ws*
150,336, // $$2
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 1111
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+306, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+306, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+306, // $
-1, // $NT
  }
,
{ // state 1112
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 1113
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+181, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+181, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+181, // $
MIN_REDUCTION+181, // $NT
  }
,
{ // state 1114
2,214, // ws*
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 1115
0x80000000|758, // match move
0x80000000|387, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1116
3,1230, // $$0
4,321, // token
5,1099, // `boolean
6,239, // `class
7,1052, // `extends
8,368, // `void
9,1507, // `int
10,1006, // `while
11,811, // `if
12,1518, // `else
13,570, // `for
14,745, // `break
15,1593, // `this
16,1439, // `false
17,1011, // `true
18,747, // `super
19,649, // `null
20,961, // `return
21,797, // `instanceof
22,822, // `new
23,146, // `abstract
24,958, // `assert
25,526, // `byte
26,45, // `case
27,1412, // `catch
28,341, // `char
29,420, // `const
30,90, // `continue
31,360, // `default
32,50, // `do
33,1327, // `double
34,568, // `enum
35,549, // `final
36,1189, // `finally
37,945, // `float
38,886, // `goto
39,474, // `implements
40,494, // `import
41,100, // `interface
42,1218, // `long
43,397, // `native
44,1530, // `package
45,1540, // `private
46,203, // `protected
47,1288, // `public
48,857, // `short
49,1244, // `static
50,25, // `strictfp
51,1559, // `switch
52,1190, // `synchronized
53,1259, // `throw
54,324, // `throws
55,868, // `transient
56,150, // `try
57,931, // `volatile
88,173, // "b"
90,1237, // "l"
91,1463, // "e"
92,1212, // "a"
93,1277, // "n"
96,1602, // "r"
98,1310, // "c"
99,1353, // "s"
101,1211, // "t"
102,1332, // "d"
103,1057, // "f"
104,1058, // "i"
105,1430, // "w"
107,778, // "p"
109,1449, // "v"
112,1133, // "g"
174,760, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 1117
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 1118
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1119
0x80000000|1419, // match move
0x80000000|306, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1120
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1121
0x80000000|1168, // match move
0x80000000|279, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1122
0x80000000|205, // match move
0x80000000|1604, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1123
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1124
98,1368, // "c"
  }
,
{ // state 1125
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 1126
0x80000000|256, // match move
0x80000000|1060, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1127
-1, // $$start
-1, // start
910, // ws*
-1, // $$0
MIN_REDUCTION+314, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+314, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
336, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+314, // $
-1, // $NT
  }
,
{ // state 1128
113,500, // "z"
  }
,
{ // state 1129
-1, // $$start
-1, // start
181, // ws*
-1, // $$0
MIN_REDUCTION+276, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+276, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+276, // $
-1, // $NT
  }
,
{ // state 1130
0x80000000|1, // match move
0x80000000|624, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 1131
0x80000000|1588, // match move
0x80000000|137, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1132
0x80000000|972, // match move
0x80000000|176, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1133
89,1494, // "o"
  }
,
{ // state 1134
177,MIN_REDUCTION+222, // $NT
  }
,
{ // state 1135
2,834, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 1136
124,1050, // "-"
  }
,
{ // state 1137
0x80000000|513, // match move
0x80000000|1476, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1138
0x80000000|1, // match move
0x80000000|781, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 1139
0x80000000|1489, // match move
0x80000000|755, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1140
177,MIN_REDUCTION+214, // $NT
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 1141
2,383, // ws*
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 1142
0x80000000|720, // match move
0x80000000|10, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1143
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 1144
0x80000000|1300, // match move
0x80000000|93, // no-match move
0x80000000|1370, // NT-test-match state for multiCommentContent
  }
,
{ // state 1145
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 1146
96,271, // "r"
  }
,
{ // state 1147
2,332, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 1148
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1149
177,MIN_REDUCTION+338, // $NT
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 1150
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1151
177,MIN_REDUCTION+103, // $NT
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 1152
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 1153
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 1154
0x80000000|1245, // match move
0x80000000|29, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1155
0x80000000|437, // match move
0x80000000|634, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1156
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 1157
100,491, // "x"
134,22, // "0"
135,22, // {"1".."9"}
136,491, // "X"
138,1360, // `x
139,610, // digit++
160,630, // digit
175,145, // digit+
  }
,
{ // state 1158
91,524, // "e"
  }
,
{ // state 1159
134,247, // "0"
135,247, // {"1".."9"}
  }
,
{ // state 1160
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+279, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+279, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+279, // $
-1, // $NT
  }
,
{ // state 1161
0x80000000|1399, // match move
0x80000000|464, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1162
91,390, // "e"
  }
,
{ // state 1163
2,595, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 1164
89,665, // "o"
104,895, // "i"
  }
,
{ // state 1165
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 1166
0x80000000|764, // match move
0x80000000|640, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1167
0x80000000|1394, // match move
0x80000000|1085, // no-match move
0x80000000|1370, // NT-test-match state for multiCommentContent
  }
,
{ // state 1168
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 1169
0x80000000|1217, // match move
0x80000000|162, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1170
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 1171
177,MIN_REDUCTION+166, // $NT
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 1172
88,1501, // "b"
89,1501, // "o"
90,1501, // "l"
91,1501, // "e"
92,1501, // "a"
93,1501, // "n"
96,1501, // "r"
97,1501, // "k"
98,1501, // "c"
99,1501, // "s"
100,1501, // "x"
101,1501, // "t"
102,1501, // "d"
103,1501, // "f"
104,1501, // "i"
105,1501, // "w"
106,1501, // "u"
107,1501, // "p"
108,1501, // "h"
109,1501, // "v"
110,1501, // "y"
111,1501, // "m"
112,1501, // "g"
113,1501, // "z"
114,1501, // "!"
115,1501, // "="
116,1501, // "/"
117,1501, // "*"
118,1501, // "%"
119,1501, // "&"
120,1501, // "("
121,1501, // ")"
122,1501, // "+"
123,1501, // ","
124,1501, // "-"
125,1501, // "."
126,1501, // ";"
127,1501, // "<"
128,1501, // ">"
129,1501, // "["
130,1501, // "]"
131,1501, // "{"
132,1501, // "|"
133,1501, // "}"
134,1501, // "0"
135,1501, // {"1".."9"}
136,1501, // "X"
140,1501, // '"'
145,1501, // "\"
146,1501, // "'"
147,1313, // printable
161,1501, // "_"
162,1501, // {"A".."W" "Y".."Z" "j" "q"}
163,1501, // {"#".."$" ":" "?".."@" "^" "`" "~"}
164,1501, // " "
  }
,
{ // state 1173
0x80000000|1312, // match move
0x80000000|1122, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1174
2,370, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 1175
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+253, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+253, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+253, // $
-1, // $NT
  }
,
{ // state 1176
0x80000000|777, // match move
0x80000000|898, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1177
0x80000000|70, // match move
0x80000000|318, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1178
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 1179
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 1180
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 1181
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 1182
2,1079, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1183
0x80000000|486, // match move
0x80000000|856, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1184
2,458, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 1185
0x80000000|1534, // match move
0x80000000|1223, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1186
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 1187
92,845, // "a"
96,126, // "r"
  }
,
{ // state 1188
0x80000000|405, // match move
0x80000000|806, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1189
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 1190
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 1191
0x80000000|1017, // match move
0x80000000|766, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1192
177,MIN_REDUCTION+235, // $NT
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 1193
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 1194
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+265, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+265, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+265, // $
-1, // $NT
  }
,
{ // state 1195
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 1196
0x80000000|838, // match move
0x80000000|882, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1197
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+257, // (default reduction)
  }
};
}
private class Initter7{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 1198
2,6, // ws*
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1199
0x80000000|825, // match move
0x80000000|1594, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1200
0x80000000|1560, // match move
0x80000000|1292, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1201
0x80000000|1, // match move
0x80000000|725, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 1202
0x80000000|1, // match move
0x80000000|740, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 1203
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1204
2,51, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 1205
92,416, // "a"
  }
,
{ // state 1206
140,1572, // '"'
142,421, // $$1
  }
,
{ // state 1207
2,629, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 1208
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+287, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+287, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+287, // $
-1, // $NT
  }
,
{ // state 1209
2,937, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 1210
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1211
96,1536, // "r"
108,1443, // "h"
  }
,
{ // state 1212
88,185, // "b"
99,544, // "s"
  }
,
{ // state 1213
177,MIN_REDUCTION+97, // $NT
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 1214
2,401, // ws*
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 1215
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 1216
109,263, // "v"
  }
,
{ // state 1217
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1218
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 1219
177,MIN_REDUCTION+217, // $NT
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 1220
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 1221
91,95, // "e"
  }
,
{ // state 1222
4,1180, // token
5,1099, // `boolean
6,239, // `class
7,1052, // `extends
8,368, // `void
9,1507, // `int
10,1006, // `while
11,811, // `if
12,1518, // `else
13,570, // `for
14,745, // `break
15,1593, // `this
16,1439, // `false
17,1011, // `true
18,747, // `super
19,649, // `null
20,961, // `return
21,797, // `instanceof
22,822, // `new
23,146, // `abstract
24,958, // `assert
25,526, // `byte
26,45, // `case
27,1412, // `catch
28,341, // `char
29,420, // `const
30,90, // `continue
31,360, // `default
32,50, // `do
33,1327, // `double
34,568, // `enum
35,549, // `final
36,1189, // `finally
37,945, // `float
38,886, // `goto
39,474, // `implements
40,494, // `import
41,100, // `interface
42,1218, // `long
43,397, // `native
44,1530, // `package
45,1540, // `private
46,203, // `protected
47,1288, // `public
48,857, // `short
49,1244, // `static
50,25, // `strictfp
51,1559, // `switch
52,1190, // `synchronized
53,1259, // `throw
54,324, // `throws
55,868, // `transient
56,150, // `try
57,931, // `volatile
  }
,
{ // state 1223
-1, // $$start
-1, // start
988, // ws*
-1, // $$0
MIN_REDUCTION+278, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
-1, // `=
-1, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
MIN_REDUCTION+278, // "="
64, // "/"
MIN_REDUCTION+278, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+278, // $
-1, // $NT
  }
,
{ // state 1224
90,946, // "l"
  }
,
{ // state 1225
0x80000000|308, // match move
0x80000000|450, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1226
177,MIN_REDUCTION+94, // $NT
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 1227
0x80000000|404, // match move
0x80000000|1575, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1228
0x80000000|587, // match move
0x80000000|1446, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1229
0x80000000|1, // match move
0x80000000|1287, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 1230
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 1231
0x80000000|1123, // match move
0x80000000|152, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1232
0x80000000|1257, // match move
0x80000000|957, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1233
101,1498, // "t"
  }
,
{ // state 1234
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+366, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+366, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+366, // $
-1, // $NT
  }
,
{ // state 1235
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 1236
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 1237
89,80, // "o"
  }
,
{ // state 1238
177,MIN_REDUCTION+238, // $NT
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 1239
111,612, // "m"
  }
,
{ // state 1240
98,1486, // "c"
  }
,
{ // state 1241
0x80000000|1157, // match move
0x80000000|415, // no-match move
// T-test match for {"0".."9" "X" "x"}:
100,
134,
135,
136,
  }
,
{ // state 1242
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 1243
-1, // $$start
-1, // start
1517, // ws*
-1, // $$0
MIN_REDUCTION+146, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+146, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+146, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+146, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+146, // "u"
778, // "p"
MIN_REDUCTION+146, // "h"
1449, // "v"
MIN_REDUCTION+146, // "y"
MIN_REDUCTION+146, // "m"
1133, // "g"
MIN_REDUCTION+146, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+146, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+146, // {"1".."9"}
MIN_REDUCTION+146, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+146, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+146, // $
MIN_REDUCTION+146, // $NT
  }
,
{ // state 1244
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 1245
2,1558, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 1246
2,337, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 1247
0x80000000|824, // match move
0x80000000|1200, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1248
0x80000000|1432, // match move
0x80000000|347, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1249
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 1250
0x80000000|493, // match move
0x80000000|172, // no-match move
// T-test match for "+":
122,
  }
,
{ // state 1251
177,MIN_REDUCTION+326, // $NT
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 1252
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 1253
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 1254
2,1517, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 1255
-1, // $$start
-1, // start
923, // ws*
-1, // $$0
MIN_REDUCTION+131, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+131, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+131, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+131, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+131, // "u"
778, // "p"
MIN_REDUCTION+131, // "h"
1449, // "v"
MIN_REDUCTION+131, // "y"
MIN_REDUCTION+131, // "m"
1133, // "g"
MIN_REDUCTION+131, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+131, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+131, // {"1".."9"}
MIN_REDUCTION+131, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+131, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+131, // $
MIN_REDUCTION+131, // $NT
  }
,
{ // state 1256
106,1375, // "u"
  }
,
{ // state 1257
2,1137, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 1258
0x80000000|1418, // match move
0x80000000|669, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1259
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 1260
177,MIN_REDUCTION+156, // $NT
  }
,
{ // state 1261
90,406, // "l"
  }
,
{ // state 1262
177,MIN_REDUCTION+127, // $NT
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 1263
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 1264
0x80000000|103, // match move
0x80000000|564, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1265
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 1266
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1267
2,181, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 1268
2,605, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 1269
0x80000000|1150, // match move
0x80000000|1317, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1270
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+163, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+163, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+163, // $
MIN_REDUCTION+163, // $NT
  }
,
{ // state 1271
2,1531, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1272
0x80000000|199, // match move
0x80000000|718, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1273
88,1072, // "b"
89,1072, // "o"
90,1072, // "l"
91,1072, // "e"
92,1072, // "a"
93,1072, // "n"
96,1072, // "r"
97,1072, // "k"
98,1072, // "c"
99,1072, // "s"
100,1072, // "x"
101,1072, // "t"
102,1072, // "d"
103,1072, // "f"
104,1072, // "i"
105,1072, // "w"
106,1072, // "u"
107,1072, // "p"
108,1072, // "h"
109,1072, // "v"
110,1072, // "y"
111,1072, // "m"
112,1072, // "g"
113,1072, // "z"
114,1072, // "!"
115,1072, // "="
116,1072, // "/"
117,1072, // "*"
118,1072, // "%"
119,1072, // "&"
120,1072, // "("
121,1072, // ")"
122,1072, // "+"
123,1072, // ","
124,1072, // "-"
125,1072, // "."
126,1072, // ";"
127,1072, // "<"
128,1072, // ">"
129,1072, // "["
130,1072, // "]"
131,1072, // "{"
132,1072, // "|"
133,1072, // "}"
134,1072, // "0"
135,1072, // {"1".."9"}
136,1072, // "X"
140,1072, // '"'
145,1072, // "\"
146,1072, // "'"
147,190, // printable
153,942, // eol
161,1072, // "_"
162,1072, // {"A".."W" "Y".."Z" "j" "q"}
163,1072, // {"#".."$" ":" "?".."@" "^" "`" "~"}
164,1072, // " "
168,259, // {10}
169,466, // {13}
  }
,
{ // state 1274
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1275
177,MIN_REDUCTION+168, // $NT
  }
,
{ // state 1276
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 1277
91,506, // "e"
92,351, // "a"
106,680, // "u"
  }
,
{ // state 1278
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+187, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+187, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+187, // $
MIN_REDUCTION+187, // $NT
  }
,
{ // state 1279
96,18, // "r"
  }
,
{ // state 1280
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 1281
93,719, // "n"
  }
,
{ // state 1282
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 1283
0x80000000|1165, // match move
0x80000000|706, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1284
134,22, // "0"
135,22, // {"1".."9"}
160,299, // digit
  }
,
{ // state 1285
-1, // $$start
-1, // start
1121, // ws*
-1, // $$0
MIN_REDUCTION+218, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+218, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+218, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+218, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+218, // "u"
778, // "p"
MIN_REDUCTION+218, // "h"
1449, // "v"
MIN_REDUCTION+218, // "y"
MIN_REDUCTION+218, // "m"
1133, // "g"
MIN_REDUCTION+218, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+218, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+218, // {"1".."9"}
MIN_REDUCTION+218, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+218, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+218, // $
MIN_REDUCTION+218, // $NT
  }
,
{ // state 1286
0x80000000|1184, // match move
0x80000000|591, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1287
0x80000000|200, // match move
0x80000000|983, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1288
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 1289
91,600, // "e"
  }
,
{ // state 1290
0x80000000|913, // match move
0x80000000|1483, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1291
116,538, // "/"
117,1042, // "*"
154,965, // commentStart
156,430, // commentEnd
  }
,
{ // state 1292
0x80000000|71, // match move
0x80000000|940, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1293
0x80000000|746, // match move
0x80000000|211, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1294
-1, // $$start
-1, // start
1429, // ws*
-1, // $$0
MIN_REDUCTION+200, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+200, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+200, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+200, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+200, // "u"
778, // "p"
MIN_REDUCTION+200, // "h"
1449, // "v"
MIN_REDUCTION+200, // "y"
MIN_REDUCTION+200, // "m"
1133, // "g"
MIN_REDUCTION+200, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+200, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+200, // {"1".."9"}
MIN_REDUCTION+200, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+200, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+200, // $
MIN_REDUCTION+200, // $NT
  }
,
{ // state 1295
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 1296
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 1297
2,588, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1298
0x80000000|1320, // match move
0x80000000|1445, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1299
177,MIN_REDUCTION+148, // $NT
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1300
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 1301
88,241, // "b"
89,241, // "o"
90,241, // "l"
91,241, // "e"
92,241, // "a"
93,241, // "n"
96,241, // "r"
97,241, // "k"
98,241, // "c"
99,241, // "s"
100,241, // "x"
101,241, // "t"
102,241, // "d"
103,241, // "f"
104,241, // "i"
105,241, // "w"
106,241, // "u"
107,241, // "p"
108,241, // "h"
109,241, // "v"
110,241, // "y"
111,241, // "m"
112,241, // "g"
113,241, // "z"
114,241, // "!"
115,241, // "="
116,241, // "/"
117,241, // "*"
118,241, // "%"
119,241, // "&"
120,241, // "("
121,241, // ")"
122,241, // "+"
123,241, // ","
124,241, // "-"
125,241, // "."
126,241, // ";"
127,241, // "<"
128,241, // ">"
129,241, // "["
130,241, // "]"
131,241, // "{"
132,241, // "|"
133,241, // "}"
134,241, // "0"
135,241, // {"1".."9"}
136,241, // "X"
140,241, // '"'
145,241, // "\"
146,241, // "'"
147,382, // printable
153,1167, // eol
157,1422, // multiCommentContent
161,241, // "_"
162,241, // {"A".."W" "Y".."Z" "j" "q"}
163,241, // {"#".."$" ":" "?".."@" "^" "`" "~"}
164,241, // " "
168,135, // {10}
169,1546, // {13}
  }
,
{ // state 1302
92,1281, // "a"
  }
,
{ // state 1303
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 1304
0x80000000|1106, // match move
0x80000000|679, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1305
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+271, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+271, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+271, // $
-1, // $NT
  }
,
{ // state 1306
0x80000000|691, // match move
0x80000000|1129, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1307
0x80000000|1295, // match move
0x80000000|1304, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1308
0x80000000|1274, // match move
0x80000000|790, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1309
177,MIN_REDUCTION+332, // $NT
  }
,
{ // state 1310
89,682, // "o"
90,1528, // "l"
92,1472, // "a"
108,381, // "h"
  }
,
{ // state 1311
0x80000000|1, // match move
0x80000000|675, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 1312
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 1313
0x80000000|1153, // match move
0x80000000|345, // no-match move
0x80000000|223, // NT-test-match state for printable
  }
,
{ // state 1314
0x80000000|827, // match move
0x80000000|1526, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1315
3,1230, // $$0
4,321, // token
5,1099, // `boolean
6,239, // `class
7,1052, // `extends
8,368, // `void
9,1507, // `int
10,1006, // `while
11,811, // `if
12,1518, // `else
13,570, // `for
14,745, // `break
15,1593, // `this
16,1439, // `false
17,1011, // `true
18,747, // `super
19,649, // `null
20,961, // `return
21,797, // `instanceof
22,822, // `new
23,146, // `abstract
24,958, // `assert
25,526, // `byte
26,45, // `case
27,1412, // `catch
28,341, // `char
29,420, // `const
30,90, // `continue
31,360, // `default
32,50, // `do
33,1327, // `double
34,568, // `enum
35,549, // `final
36,1189, // `finally
37,945, // `float
38,886, // `goto
39,474, // `implements
40,494, // `import
41,100, // `interface
42,1218, // `long
43,397, // `native
44,1530, // `package
45,1540, // `private
46,203, // `protected
47,1288, // `public
48,857, // `short
49,1244, // `static
50,25, // `strictfp
51,1559, // `switch
52,1190, // `synchronized
53,1259, // `throw
54,324, // `throws
55,868, // `transient
56,150, // `try
57,931, // `volatile
174,760, // token*
  }
,
{ // state 1316
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 1317
0x80000000|1120, // match move
0x80000000|632, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1318
0x80000000|1, // match move
0x80000000|120, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 1319
2,337, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 1320
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 1321
96,531, // "r"
  }
,
{ // state 1322
0x80000000|374, // match move
0x80000000|342, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1323
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 1324
0x80000000|1, // match move
0x80000000|275, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1325
0x80000000|575, // match move
0x80000000|516, // no-match move
0x80000000|1605, // NT-test-match state for stringChar
  }
,
{ // state 1326
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1327
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 1328
0x80000000|666, // match move
0x80000000|1395, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1329
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+178, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+178, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+178, // $
MIN_REDUCTION+178, // $NT
  }
,
{ // state 1330
177,MIN_REDUCTION+130, // $NT
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 1331
2,458, // ws*
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 1332
89,1068, // "o"
91,1350, // "e"
  }
,
{ // state 1333
177,MIN_REDUCTION+244, // $NT
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 1334
2,414, // ws*
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 1335
0x80000000|1171, // match move
0x80000000|699, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1336
2,1188, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 1337
96,310, // "r"
  }
,
{ // state 1338
0x80000000|1267, // match move
0x80000000|1306, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1339
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+106, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+106, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+106, // $
MIN_REDUCTION+106, // $NT
  }
,
{ // state 1340
0x80000000|1, // match move
0x80000000|208, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 1341
3,1230, // $$0
4,321, // token
58,168, // `!
59,1179, // `!=
60,19, // `%
61,717, // `&&
62,1484, // `*
63,1420, // `(
64,141, // `)
65,692, // `{
66,731, // `}
67,1505, // `-
68,1252, // `+
69,1471, // `=
70,91, // `==
71,1597, // `[
72,233, // `]
73,106, // `||
74,1527, // `<
75,490, // `<=
76,1382, // `,
77,396, // `>
78,1521, // `>=
79,776, // `.
80,1088, // `;
81,1081, // `++
82,1178, // `--
84,1276, // ID
85,110, // INTLIT
86,1500, // STRINGLIT
87,1448, // CHARLIT
117,38, // "*"
137,968, // intLit2
139,282, // digit++
148,659, // letter
153,1149, // eol
160,630, // digit
166,262, // ws
174,760, // token*
175,145, // digit+
  }
,
{ // state 1342
0x80000000|561, // match move
0x80000000|867, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1343
0x80000000|655, // match move
0x80000000|553, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1344
0x80000000|602, // match move
0x80000000|644, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 1345
0x80000000|721, // match move
0x80000000|400, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1346
88,1501, // "b"
89,1501, // "o"
90,1501, // "l"
91,1501, // "e"
92,1501, // "a"
93,1501, // "n"
96,1501, // "r"
97,1501, // "k"
98,1501, // "c"
99,1501, // "s"
100,1501, // "x"
101,1501, // "t"
102,1501, // "d"
103,1501, // "f"
104,1501, // "i"
105,1501, // "w"
106,1501, // "u"
107,1501, // "p"
108,1501, // "h"
109,1501, // "v"
110,1501, // "y"
111,1501, // "m"
112,1501, // "g"
113,1501, // "z"
114,1501, // "!"
115,1501, // "="
116,1501, // "/"
117,1501, // "*"
118,1501, // "%"
119,1501, // "&"
120,1501, // "("
121,1501, // ")"
122,1501, // "+"
123,1501, // ","
124,1501, // "-"
125,1501, // "."
126,1501, // ";"
127,1501, // "<"
128,1501, // ">"
129,1501, // "["
130,1501, // "]"
131,1501, // "{"
132,1501, // "|"
133,1501, // "}"
134,1501, // "0"
135,1501, // {"1".."9"}
136,1501, // "X"
140,1501, // '"'
145,1501, // "\"
146,1501, // "'"
147,1024, // printable
152,454, // printable**
161,1501, // "_"
162,1501, // {"A".."W" "Y".."Z" "j" "q"}
163,1501, // {"#".."$" ":" "?".."@" "^" "`" "~"}
164,1501, // " "
173,921, // printable*
  }
,
{ // state 1347
0x80000000|646, // match move
0x80000000|1608, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1348
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+226, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+226, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+226, // $
MIN_REDUCTION+226, // $NT
  }
,
{ // state 1349
0x80000000|761, // match move
0x80000000|1173, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1350
103,530, // "f"
  }
,
{ // state 1351
92,269, // "a"
  }
,
{ // state 1352
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 1353
101,1187, // "t"
105,447, // "w"
106,1359, // "u"
108,333, // "h"
110,67, // "y"
  }
,
{ // state 1354
0x80000000|217, // match move
0x80000000|1509, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1355
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+232, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+232, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+232, // $
MIN_REDUCTION+232, // $NT
  }
,
{ // state 1356
177,MIN_REDUCTION+246, // $NT
  }
,
{ // state 1357
0x80000000|974, // match move
0x80000000|1071, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1358
0x80000000|395, // match move
0x80000000|879, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1359
107,363, // "p"
  }
,
{ // state 1360
134,22, // "0"
135,22, // {"1".."9"}
139,431, // digit++
160,630, // digit
175,145, // digit+
  }
,
{ // state 1361
0x80000000|697, // match move
0x80000000|353, // no-match move
0x80000000|1370, // NT-test-match state for multiCommentContent
  }
,
{ // state 1362
0x80000000|268, // match move
0x80000000|184, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1363
0x80000000|451, // match move
0x80000000|114, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1364
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+229, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+229, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+229, // $
MIN_REDUCTION+229, // $NT
  }
,
{ // state 1365
-1, // $$start
-1, // start
6, // ws*
-1, // $$0
MIN_REDUCTION+254, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+254, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+254, // $
-1, // $NT
  }
,
{ // state 1366
99,82, // "s"
  }
,
{ // state 1367
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+299, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+299, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+299, // $
-1, // $NT
  }
,
{ // state 1368
0x80000000|1, // match move
0x80000000|585, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 1369
97,32, // "k"
  }
,
{ // state 1370
0x80000000|739, // match move
0x80000000|1273, // no-match move
0x80000000|1291, // NT-test-match state for commentTerminal
  }
,
{ // state 1371
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1372
0x80000000|1585, // match move
0x80000000|569, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1373
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 1374
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1375
88,1480, // "b"
  }
,
{ // state 1376
0x80000000|1606, // match move
0x80000000|1228, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1377
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+293, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+293, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+293, // $
-1, // $NT
  }
,
{ // state 1378
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 1379
96,648, // "r"
  }
,
{ // state 1380
0x80000000|1504, // match move
0x80000000|803, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1381
89,117, // "o"
  }
,
{ // state 1382
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 1383
90,7, // "l"
104,1010, // "i"
  }
,
{ // state 1384
-1, // $$start
-1, // start
1039, // ws*
-1, // $$0
MIN_REDUCTION+197, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+197, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+197, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+197, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+197, // "u"
778, // "p"
MIN_REDUCTION+197, // "h"
1449, // "v"
MIN_REDUCTION+197, // "y"
MIN_REDUCTION+197, // "m"
1133, // "g"
MIN_REDUCTION+197, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+197, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+197, // {"1".."9"}
MIN_REDUCTION+197, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+197, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+197, // $
MIN_REDUCTION+197, // $NT
  }
,
{ // state 1385
-1, // $$start
-1, // start
440, // ws*
-1, // $$0
MIN_REDUCTION+236, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+236, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+236, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+236, // "x"
344, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
130, // "w"
1359, // "u"
778, // "p"
333, // "h"
1449, // "v"
67, // "y"
MIN_REDUCTION+236, // "m"
1133, // "g"
MIN_REDUCTION+236, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+236, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+236, // {"1".."9"}
MIN_REDUCTION+236, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+236, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+236, // $
MIN_REDUCTION+236, // $NT
  }
,
{ // state 1386
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 1387
177,MIN_REDUCTION+327, // $NT
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 1388
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 1389
0x80000000|409, // match move
0x80000000|192, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1390
152,454, // printable**
153,68, // eol
168,259, // {10}
169,466, // {13}
173,921, // printable*
  }
,
{ // state 1391
101,422, // "t"
  }
,
{ // state 1392
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 1393
0x80000000|1117, // match move
0x80000000|1413, // no-match move
// T-test match for "0":
134,
  }
};
}
private class Initter8{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 1394
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 1395
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+263, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+263, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+263, // $
-1, // $NT
  }
,
{ // state 1396
0x80000000|202, // match move
0x80000000|1286, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1397
2,685, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 1398
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1399
2,1247, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 1400
2,6, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1401
0x80000000|1148, // match move
0x80000000|1076, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1402
-1, // $$start
-1, // start
664, // ws*
-1, // $$0
MIN_REDUCTION+227, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+227, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+227, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+227, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+227, // "u"
778, // "p"
MIN_REDUCTION+227, // "h"
1449, // "v"
MIN_REDUCTION+227, // "y"
MIN_REDUCTION+227, // "m"
1133, // "g"
MIN_REDUCTION+227, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+227, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+227, // {"1".."9"}
MIN_REDUCTION+227, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+227, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+227, // $
MIN_REDUCTION+227, // $NT
  }
,
{ // state 1403
2,850, // ws*
153,1149, // eol
164,878, // " "
166,1033, // ws
167,878, // {9}
168,259, // {10}
169,466, // {13}
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 1404
0x80000000|840, // match move
0x80000000|1092, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1405
93,435, // "n"
  }
,
{ // state 1406
0x80000000|1147, // match move
0x80000000|1547, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1407
0x80000000|590, // match move
0x80000000|1352, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 1408
0x80000000|187, // match move
0x80000000|752, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1409
116,446, // "/"
117,85, // "*"
  }
,
{ // state 1410
98,267, // "c"
  }
,
{ // state 1411
0x80000000|171, // match move
0x80000000|28, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1412
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 1413
0x80000000|1323, // match move
0x80000000|1080, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1414
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 1415
101,128, // "t"
  }
,
{ // state 1416
0x80000000|1091, // match move
0x80000000|231, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1417
0x80000000|1444, // match move
0x80000000|976, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1418
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 1419
2,296, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 1420
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 1421
177,MIN_REDUCTION+228, // $NT
  }
,
{ // state 1422
0x80000000|49, // match move
0x80000000|966, // no-match move
0x80000000|1370, // NT-test-match state for multiCommentContent
  }
,
{ // state 1423
101,1002, // "t"
  }
,
{ // state 1424
0x80000000|1102, // match move
0x80000000|323, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1425
88,1325, // "b"
89,1325, // "o"
90,1325, // "l"
91,1325, // "e"
92,1325, // "a"
93,1325, // "n"
96,1325, // "r"
97,1325, // "k"
98,1325, // "c"
99,1325, // "s"
100,1325, // "x"
101,1325, // "t"
102,1325, // "d"
103,1325, // "f"
104,1325, // "i"
105,1325, // "w"
106,1325, // "u"
107,1325, // "p"
108,1325, // "h"
109,1325, // "v"
110,1325, // "y"
111,1325, // "m"
112,1325, // "g"
113,1325, // "z"
114,1325, // "!"
115,1325, // "="
116,1325, // "/"
117,1325, // "*"
118,1325, // "%"
119,1325, // "&"
120,1325, // "("
121,1325, // ")"
122,1325, // "+"
123,1325, // ","
124,1325, // "-"
125,1325, // "."
126,1325, // ";"
127,1325, // "<"
128,1325, // ">"
129,1325, // "["
130,1325, // "]"
131,1325, // "{"
132,1325, // "|"
133,1325, // "}"
134,1325, // "0"
135,1325, // {"1".."9"}
136,1325, // "X"
140,1325, // '"'
141,1206, // stringLiteral
143,950, // stringChar
145,1325, // "\"
146,1325, // "'"
147,1428, // printable
161,1325, // "_"
162,1325, // {"A".."W" "Y".."Z" "j" "q"}
163,1325, // {"#".."$" ":" "?".."@" "^" "`" "~"}
164,1325, // " "
165,625, // stringChar**
171,1025, // stringChar*
  }
,
{ // state 1426
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 1427
104,641, // "i"
  }
,
{ // state 1428
0x80000000|1104, // match move
0x80000000|626, // no-match move
0x80000000|1605, // NT-test-match state for stringChar
  }
,
{ // state 1429
0x80000000|232, // match move
0x80000000|298, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1430
108,5, // "h"
  }
,
{ // state 1431
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1432
2,370, // ws*
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 1433
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1434
0x80000000|221, // match move
0x80000000|160, // no-match move
0x80000000|1605, // NT-test-match state for stringChar
  }
,
{ // state 1435
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 1436
177,MIN_REDUCTION+145, // $NT
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1437
0x80000000|1, // match move
0x80000000|201, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 1438
0x80000000|978, // match move
0x80000000|1041, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1439
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 1440
2,664, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 1441
2,672, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1442
4,1180, // token
58,168, // `!
59,1179, // `!=
60,19, // `%
61,717, // `&&
63,1420, // `(
64,141, // `)
65,692, // `{
66,731, // `}
67,1505, // `-
68,1252, // `+
69,1471, // `=
70,91, // `==
71,1597, // `[
72,233, // `]
73,106, // `||
74,1527, // `<
75,490, // `<=
76,1382, // `,
77,396, // `>
78,1521, // `>=
79,776, // `.
80,1088, // `;
81,1081, // `++
82,1178, // `--
83,455, // `/
84,1276, // ID
85,110, // INTLIT
86,1500, // STRINGLIT
87,1448, // CHARLIT
88,837, // "b"
89,837, // "o"
90,837, // "l"
91,837, // "e"
92,837, // "a"
93,837, // "n"
96,837, // "r"
97,837, // "k"
98,837, // "c"
99,837, // "s"
100,837, // "x"
101,837, // "t"
102,837, // "d"
103,837, // "f"
104,837, // "i"
105,837, // "w"
106,837, // "u"
107,837, // "p"
108,837, // "h"
109,837, // "v"
110,837, // "y"
111,837, // "m"
112,837, // "g"
113,837, // "z"
114,369, // "!"
115,83, // "="
116,1020, // "/"
118,621, // "%"
119,573, // "&"
120,147, // "("
121,521, // ")"
122,1250, // "+"
123,893, // ","
124,313, // "-"
125,1272, // "."
126,690, // ";"
127,858, // "<"
128,113, // ">"
129,1343, // "["
130,1551, // "]"
131,197, // "{"
132,284, // "|"
133,703, // "}"
134,22, // "0"
135,22, // {"1".."9"}
136,837, // "X"
137,968, // intLit2
139,282, // digit++
140,792, // '"'
146,1563, // "'"
148,659, // letter
160,630, // digit
162,837, // {"A".."W" "Y".."Z" "j" "q"}
175,145, // digit+
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 1443
96,319, // "r"
104,1366, // "i"
  }
,
{ // state 1444
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 1445
0x80000000|1569, // match move
0x80000000|829, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1446
0x80000000|1140, // match move
0x80000000|348, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1447
-1, // $$start
-1, // start
576, // ws*
-1, // $$0
MIN_REDUCTION+292, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+292, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+292, // $
-1, // $NT
  }
,
{ // state 1448
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 1449
89,1383, // "o"
  }
,
{ // state 1450
0x80000000|885, // match move
0x80000000|1408, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1451
104,1128, // "i"
  }
,
{ // state 1452
107,13, // "p"
  }
,
{ // state 1453
-1, // $$start
-1, // start
1349, // ws*
-1, // $$0
MIN_REDUCTION+290, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+290, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+290, // $
-1, // $NT
  }
,
{ // state 1454
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 1455
0x80000000|1, // match move
0x80000000|603, // no-match move
// T-test match for "/":
116,
  }
,
{ // state 1456
0x80000000|240, // match move
0x80000000|1533, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1457
89,768, // "o"
  }
,
{ // state 1458
177,MIN_REDUCTION+93, // $NT
  }
,
{ // state 1459
177,MIN_REDUCTION+132, // $NT
  }
,
{ // state 1460
177,MIN_REDUCTION+237, // $NT
  }
,
{ // state 1461
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1462
140,1572, // '"'
141,1206, // stringLiteral
142,947, // $$1
165,625, // stringChar**
171,1025, // stringChar*
  }
,
{ // state 1463
90,480, // "l"
93,449, // "n"
100,744, // "x"
  }
,
{ // state 1464
177,MIN_REDUCTION+192, // $NT
  }
,
{ // state 1465
0x80000000|270, // match move
0x80000000|871, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1466
104,1405, // "i"
  }
,
{ // state 1467
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 1468
91,805, // "e"
  }
,
{ // state 1469
0x80000000|15, // match move
0x80000000|558, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1470
0x80000000|468, // match move
0x80000000|1303, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 1471
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 1472
99,713, // "s"
101,1609, // "t"
  }
,
{ // state 1473
0x80000000|929, // match move
0x80000000|1404, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1474
-1, // $$start
-1, // start
179, // ws*
-1, // $$0
MIN_REDUCTION+221, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+221, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+221, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+221, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+221, // "u"
778, // "p"
MIN_REDUCTION+221, // "h"
1449, // "v"
MIN_REDUCTION+221, // "y"
MIN_REDUCTION+221, // "m"
1133, // "g"
MIN_REDUCTION+221, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+221, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+221, // {"1".."9"}
MIN_REDUCTION+221, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+221, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+221, // $
MIN_REDUCTION+221, // $NT
  }
,
{ // state 1475
0x80000000|1262, // match move
0x80000000|712, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1476
0x80000000|800, // match move
0x80000000|735, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1477
2,647, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 1478
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 1479
0x80000000|288, // match move
0x80000000|1339, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1480
90,1162, // "l"
  }
,
{ // state 1481
0x80000000|376, // match move
0x80000000|1113, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1482
88,837, // "b"
89,837, // "o"
90,837, // "l"
91,837, // "e"
92,837, // "a"
93,837, // "n"
94,1470, // idChar
96,837, // "r"
97,837, // "k"
98,837, // "c"
99,837, // "s"
100,837, // "x"
101,837, // "t"
102,837, // "d"
103,837, // "f"
104,837, // "i"
105,837, // "w"
106,837, // "u"
107,837, // "p"
108,837, // "h"
109,837, // "v"
110,837, // "y"
111,837, // "m"
112,837, // "g"
113,837, // "z"
134,909, // "0"
135,909, // {"1".."9"}
136,837, // "X"
148,204, // letter
149,1487, // idChar**
160,427, // digit
161,1407, // "_"
162,837, // {"A".."W" "Y".."Z" "j" "q"}
170,733, // idChar*
  }
,
{ // state 1483
0x80000000|14, // match move
0x80000000|1278, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1484
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 1485
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 1486
101,917, // "t"
  }
,
{ // state 1487
0x80000000|1566, // match move
0x80000000|683, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1488
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 1489
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1490
-1, // $$start
-1, // start
629, // ws*
-1, // $$0
MIN_REDUCTION+128, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+128, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+128, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+128, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+128, // "u"
778, // "p"
MIN_REDUCTION+128, // "h"
1449, // "v"
MIN_REDUCTION+128, // "y"
MIN_REDUCTION+128, // "m"
1133, // "g"
MIN_REDUCTION+128, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+128, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+128, // {"1".."9"}
MIN_REDUCTION+128, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+128, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+128, // $
MIN_REDUCTION+128, // $NT
  }
,
{ // state 1491
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+88, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+88, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+88, // $
MIN_REDUCTION+88, // $NT
  }
,
{ // state 1492
0x80000000|1555, // match move
0x80000000|1438, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1493
0x80000000|154, // match move
0x80000000|153, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1494
101,1457, // "t"
  }
,
{ // state 1495
177,MIN_REDUCTION+159, // $NT
  }
,
{ // state 1496
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 1497
0x80000000|78, // match move
0x80000000|1562, // no-match move
0x80000000|1370, // NT-test-match state for multiCommentContent
  }
,
{ // state 1498
0x80000000|1, // match move
0x80000000|1126, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 1499
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1500
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 1501
0x80000000|784, // match move
0x80000000|551, // no-match move
0x80000000|223, // NT-test-match state for printable
  }
,
{ // state 1502
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1503
0x80000000|1299, // match move
0x80000000|518, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1504
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 1505
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 1506
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+259, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+259, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+259, // $
-1, // $NT
  }
,
{ // state 1507
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 1508
-1, // $$start
-1, // start
219, // ws*
-1, // $$0
MIN_REDUCTION+89, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+89, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+89, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+89, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+89, // "u"
778, // "p"
MIN_REDUCTION+89, // "h"
1449, // "v"
MIN_REDUCTION+89, // "y"
MIN_REDUCTION+89, // "m"
1133, // "g"
MIN_REDUCTION+89, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+89, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+89, // {"1".."9"}
MIN_REDUCTION+89, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+89, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+89, // $
MIN_REDUCTION+89, // $NT
  }
,
{ // state 1509
0x80000000|663, // match move
0x80000000|828, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1510
0x80000000|1567, // match move
0x80000000|1553, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1511
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1512
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+273, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+273, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+273, // $
-1, // $NT
  }
,
{ // state 1513
1,533, // start
2,992, // ws*
3,229, // $$0
4,321, // token
5,1099, // `boolean
6,239, // `class
7,1052, // `extends
8,368, // `void
9,1507, // `int
10,1006, // `while
11,811, // `if
12,1518, // `else
13,570, // `for
14,745, // `break
15,1593, // `this
16,1439, // `false
17,1011, // `true
18,747, // `super
19,649, // `null
20,961, // `return
21,797, // `instanceof
22,822, // `new
23,146, // `abstract
24,958, // `assert
25,526, // `byte
26,45, // `case
27,1412, // `catch
28,341, // `char
29,420, // `const
30,90, // `continue
31,360, // `default
32,50, // `do
33,1327, // `double
34,568, // `enum
35,549, // `final
36,1189, // `finally
37,945, // `float
38,886, // `goto
39,474, // `implements
40,494, // `import
41,100, // `interface
42,1218, // `long
43,397, // `native
44,1530, // `package
45,1540, // `private
46,203, // `protected
47,1288, // `public
48,857, // `short
49,1244, // `static
50,25, // `strictfp
51,1559, // `switch
52,1190, // `synchronized
53,1259, // `throw
54,324, // `throws
55,868, // `transient
56,150, // `try
57,931, // `volatile
174,760, // token*
  }
,
{ // state 1514
4,1180, // token
58,168, // `!
59,1179, // `!=
60,19, // `%
61,717, // `&&
62,1484, // `*
63,1420, // `(
64,141, // `)
65,692, // `{
66,731, // `}
67,1505, // `-
68,1252, // `+
69,1471, // `=
70,91, // `==
71,1597, // `[
72,233, // `]
73,106, // `||
74,1527, // `<
75,490, // `<=
76,1382, // `,
77,396, // `>
78,1521, // `>=
79,776, // `.
80,1088, // `;
81,1081, // `++
82,1178, // `--
84,1276, // ID
85,110, // INTLIT
86,1500, // STRINGLIT
87,1448, // CHARLIT
117,38, // "*"
137,968, // intLit2
139,282, // digit++
148,659, // letter
160,630, // digit
175,145, // digit+
  }
,
{ // state 1515
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 1516
2,1188, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 1517
0x80000000|975, // match move
0x80000000|1576, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1518
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 1519
0x80000000|589, // match move
0x80000000|657, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1520
0x80000000|119, // match move
0x80000000|378, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1521
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 1522
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 1523
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 1524
2,802, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 1525
0x80000000|234, // match move
0x80000000|504, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1526
-1, // $$start
-1, // start
180, // ws*
-1, // $$0
MIN_REDUCTION+272, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+272, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+272, // $
-1, // $NT
  }
,
{ // state 1527
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 1528
92,1538, // "a"
  }
,
{ // state 1529
0x80000000|87, // match move
0x80000000|499, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1530
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 1531
0x80000000|1203, // match move
0x80000000|1086, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1532
0x80000000|785, // match move
0x80000000|540, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1533
0x80000000|1112, // match move
0x80000000|1160, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1534
2,988, // ws*
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 1535
177,MIN_REDUCTION+219, // $NT
  }
,
{ // state 1536
92,9, // "a"
106,687, // "u"
110,877, // "y"
  }
,
{ // state 1537
0x80000000|772, // match move
0x80000000|702, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1538
99,483, // "s"
  }
,
{ // state 1539
93,645, // "n"
  }
,
{ // state 1540
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 1541
96,826, // "r"
  }
,
{ // state 1542
0x80000000|1, // match move
0x80000000|860, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 1543
0x80000000|1330, // match move
0x80000000|343, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1544
0x80000000|1, // match move
0x80000000|37, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 1545
177,MIN_REDUCTION+139, // $NT
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 1546
0x80000000|285, // match move
0x80000000|788, // no-match move
// T-test match for 10:
168,
  }
,
{ // state 1547
0x80000000|350, // match move
0x80000000|432, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1548
2,710, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 1549
0x80000000|1316, // match move
0x80000000|1258, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1550
2,848, // ws*
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 1551
0x80000000|520, // match move
0x80000000|1066, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1552
88,1072, // "b"
89,1072, // "o"
90,1072, // "l"
91,1072, // "e"
92,1072, // "a"
93,1072, // "n"
96,1072, // "r"
97,1072, // "k"
98,1072, // "c"
99,1072, // "s"
100,1072, // "x"
101,1072, // "t"
102,1072, // "d"
103,1072, // "f"
104,1072, // "i"
105,1072, // "w"
106,1072, // "u"
107,1072, // "p"
108,1072, // "h"
109,1072, // "v"
110,1072, // "y"
111,1072, // "m"
112,1072, // "g"
113,1072, // "z"
114,1072, // "!"
115,1072, // "="
116,1072, // "/"
117,1072, // "*"
118,1072, // "%"
119,1072, // "&"
120,1072, // "("
121,1072, // ")"
122,1072, // "+"
123,1072, // ","
124,1072, // "-"
125,1072, // "."
126,1072, // ";"
127,1072, // "<"
128,1072, // ">"
129,1072, // "["
130,1072, // "]"
131,1072, // "{"
132,1072, // "|"
133,1072, // "}"
134,1072, // "0"
135,1072, // {"1".."9"}
136,1072, // "X"
140,1072, // '"'
144,618, // char
145,1072, // "\"
146,1072, // "'"
147,819, // printable
161,1072, // "_"
162,1072, // {"A".."W" "Y".."Z" "j" "q"}
163,1072, // {"#".."$" ":" "?".."@" "^" "`" "~"}
164,1072, // " "
  }
,
{ // state 1553
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+220, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+220, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+220, // $
MIN_REDUCTION+220, // $NT
  }
,
{ // state 1554
177,MIN_REDUCTION+319, // $NT
  }
,
{ // state 1555
2,685, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 1556
112,1158, // "g"
  }
,
{ // state 1557
92,1415, // "a"
  }
,
{ // state 1558
0x80000000|536, // match move
0x80000000|1048, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1559
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 1560
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 1561
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 1562
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 1563
0x80000000|1, // match move
0x80000000|1552, // no-match move
// T-test match for {"'" "\"}:
145,
146,
  }
,
{ // state 1564
0x80000000|999, // match move
0x80000000|1529, // no-match move
0x80000000|678, // NT-test-match state for idChar
  }
,
{ // state 1565
2,786, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 1566
2,910, // ws*
150,336, // $$2
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 1567
177,MIN_REDUCTION+220, // $NT
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 1568
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 1569
177,MIN_REDUCTION+142, // $NT
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 1570
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 1571
-1, // $$start
-1, // start
802, // ws*
-1, // $$0
MIN_REDUCTION+194, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+194, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+194, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+194, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+194, // "u"
778, // "p"
MIN_REDUCTION+194, // "h"
1449, // "v"
MIN_REDUCTION+194, // "y"
MIN_REDUCTION+194, // "m"
1133, // "g"
MIN_REDUCTION+194, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+194, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+194, // {"1".."9"}
MIN_REDUCTION+194, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+194, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+194, // $
MIN_REDUCTION+194, // $NT
  }
,
{ // state 1572
0x80000000|1397, // match move
0x80000000|1492, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1573
102,1340, // "d"
  }
,
{ // state 1574
0x80000000|730, // match move
0x80000000|727, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1575
0x80000000|512, // match move
0x80000000|684, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1576
0x80000000|559, // match move
0x80000000|1103, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1577
0x80000000|1090, // match move
0x80000000|870, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1578
96,833, // "r"
  }
,
{ // state 1579
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 1580
177,MIN_REDUCTION+225, // $NT
  }
,
{ // state 1581
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+247, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+247, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+247, // $
-1, // $NT
  }
,
{ // state 1582
177,MIN_REDUCTION+151, // $NT
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 1583
0x80000000|53, // match move
0x80000000|1475, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1584
0x80000000|1550, // match move
0x80000000|916, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1585
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 1586
-1, // $$start
-1, // start
320, // ws*
-1, // $$0
MIN_REDUCTION+256, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+256, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+256, // $
-1, // $NT
  }
,
{ // state 1587
177,MIN_REDUCTION+114, // $NT
  }
,
{ // state 1588
2,1021, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 1589
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+136, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+136, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+136, // $
MIN_REDUCTION+136, // $NT
  }
,
{ // state 1590
0x80000000|711, // match move
0x80000000|773, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1591
0x80000000|1236, // match move
0x80000000|122, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1592
177,MIN_REDUCTION+321, // $NT
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1593
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 1594
0x80000000|1568, // match move
0x80000000|352, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1595
0x80000000|817, // match move
0x80000000|577, // no-match move
0x80000000|334, // NT-test-match state for reserved
  }
,
{ // state 1596
2,219, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 1597
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 1598
0x80000000|502, // match move
0x80000000|434, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1599
-1, // $$start
-1, // start
637, // ws*
-1, // $$0
MIN_REDUCTION+92, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+92, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+92, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+92, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+92, // "u"
778, // "p"
MIN_REDUCTION+92, // "h"
1449, // "v"
MIN_REDUCTION+92, // "y"
MIN_REDUCTION+92, // "m"
1133, // "g"
MIN_REDUCTION+92, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+92, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+92, // {"1".."9"}
MIN_REDUCTION+92, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+92, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+92, // $
MIN_REDUCTION+92, // $NT
  }
,
{ // state 1600
-1, // $$start
-1, // start
605, // ws*
-1, // $$0
MIN_REDUCTION+307, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+307, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+307, // $
-1, // $NT
  }
,
{ // state 1601
2,1429, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 1602
91,930, // "e"
  }
,
{ // state 1603
0x80000000|488, // match move
0x80000000|177, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1604
-1, // $$start
-1, // start
-1, // ws*
-1, // $$0
MIN_REDUCTION+289, // token
-1, // `boolean
-1, // `class
-1, // `extends
-1, // `void
-1, // `int
-1, // `while
-1, // `if
-1, // `else
-1, // `for
-1, // `break
-1, // `this
-1, // `false
-1, // `true
-1, // `super
-1, // `null
-1, // `return
-1, // `instanceof
-1, // `new
-1, // `abstract
-1, // `assert
-1, // `byte
-1, // `case
-1, // `catch
-1, // `char
-1, // `const
-1, // `continue
-1, // `default
-1, // `do
-1, // `double
-1, // `enum
-1, // `final
-1, // `finally
-1, // `float
-1, // `goto
-1, // `implements
-1, // `import
-1, // `interface
-1, // `long
-1, // `native
-1, // `package
-1, // `private
-1, // `protected
-1, // `public
-1, // `short
-1, // `static
-1, // `strictfp
-1, // `switch
-1, // `synchronized
-1, // `throw
-1, // `throws
-1, // `transient
-1, // `try
-1, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
837, // "b"
837, // "o"
837, // "l"
837, // "e"
837, // "a"
837, // "n"
-1, // idChar
-1, // reserved
837, // "r"
837, // "k"
837, // "c"
837, // "s"
837, // "x"
837, // "t"
837, // "d"
837, // "f"
837, // "i"
837, // "w"
837, // "u"
837, // "p"
837, // "h"
837, // "v"
837, // "y"
837, // "m"
837, // "g"
837, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+289, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
22, // "0"
22, // {"1".."9"}
837, // "X"
968, // intLit2
-1, // `x
282, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
659, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
630, // digit
-1, // "_"
837, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
262, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
145, // digit+
MIN_REDUCTION+289, // $
-1, // $NT
  }
,
{ // state 1605
0x80000000|1, // match move
0x80000000|607, // no-match move
// T-test match for {'"' "\"}:
140,
145,
  }
,
{ // state 1606
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,262, // ws
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 1607
2,1549, // ws*
151,906, // singleComment
153,1149, // eol
154,583, // commentStart
158,218, // multiComment
166,1033, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 1608
-1, // $$start
-1, // start
20, // ws*
-1, // $$0
MIN_REDUCTION+119, // token
1099, // `boolean
239, // `class
1052, // `extends
368, // `void
1507, // `int
1006, // `while
811, // `if
1518, // `else
570, // `for
745, // `break
1593, // `this
1439, // `false
1011, // `true
747, // `super
649, // `null
961, // `return
797, // `instanceof
822, // `new
146, // `abstract
958, // `assert
526, // `byte
45, // `case
1412, // `catch
341, // `char
420, // `const
90, // `continue
360, // `default
50, // `do
1327, // `double
568, // `enum
549, // `final
1189, // `finally
945, // `float
886, // `goto
474, // `implements
494, // `import
100, // `interface
1218, // `long
397, // `native
1530, // `package
1540, // `private
203, // `protected
1288, // `public
857, // `short
1244, // `static
25, // `strictfp
1559, // `switch
1190, // `synchronized
1259, // `throw
324, // `throws
868, // `transient
150, // `try
931, // `volatile
168, // `!
1179, // `!=
19, // `%
717, // `&&
-1, // `*
1420, // `(
141, // `)
692, // `{
731, // `}
1505, // `-
1252, // `+
1471, // `=
91, // `==
1597, // `[
233, // `]
106, // `||
1527, // `<
490, // `<=
1382, // `,
396, // `>
1521, // `>=
776, // `.
1088, // `;
1081, // `++
1178, // `--
455, // `/
1276, // ID
110, // INTLIT
1500, // STRINGLIT
1448, // CHARLIT
173, // "b"
MIN_REDUCTION+119, // "o"
1237, // "l"
1463, // "e"
1212, // "a"
1277, // "n"
-1, // idChar
-1, // reserved
1602, // "r"
MIN_REDUCTION+119, // "k"
1310, // "c"
1353, // "s"
MIN_REDUCTION+119, // "x"
1211, // "t"
1332, // "d"
1057, // "f"
1058, // "i"
1430, // "w"
MIN_REDUCTION+119, // "u"
778, // "p"
MIN_REDUCTION+119, // "h"
1449, // "v"
MIN_REDUCTION+119, // "y"
MIN_REDUCTION+119, // "m"
1133, // "g"
MIN_REDUCTION+119, // "z"
369, // "!"
83, // "="
64, // "/"
MIN_REDUCTION+119, // "*"
621, // "%"
573, // "&"
147, // "("
521, // ")"
1250, // "+"
893, // ","
313, // "-"
1272, // "."
690, // ";"
858, // "<"
113, // ">"
1343, // "["
1551, // "]"
197, // "{"
284, // "|"
703, // "}"
1241, // "0"
MIN_REDUCTION+119, // {"1".."9"}
MIN_REDUCTION+119, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
792, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
1563, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
906, // singleComment
-1, // printable**
1149, // eol
583, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
218, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+119, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
1033, // ws
878, // {9}
259, // {10}
466, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+119, // $
MIN_REDUCTION+119, // $NT
  }
};
}
private class Initter9{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 1609
98,475, // "c"
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[1610][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
  doneSoFar += new Initter3().doInit(doneSoFar);
  doneSoFar += new Initter4().doInit(doneSoFar);
  doneSoFar += new Initter5().doInit(doneSoFar);
  doneSoFar += new Initter6().doInit(doneSoFar);
  doneSoFar += new Initter7().doInit(doneSoFar);
  doneSoFar += new Initter8().doInit(doneSoFar);
  doneSoFar += new Initter9().doInit(doneSoFar);
}
public int[] getProdTable() { return prodTable; }
private static int[] prodTable = {
// $$start ::= start
(0<<16)+1,
// $$start ::=
(0<<16)+0,
// start ::= ws* $$0
(1<<16)+2,
// start ::= ws*
(1<<16)+1,
// start ::= $$0
(1<<16)+1,
// token ::= `boolean
(4<<16)+1,
// token ::= `class
(4<<16)+1,
// token ::= `extends
(4<<16)+1,
// token ::= `void
(4<<16)+1,
// token ::= `int
(4<<16)+1,
// token ::= `while
(4<<16)+1,
// token ::= `if
(4<<16)+1,
// token ::= `else
(4<<16)+1,
// token ::= `for
(4<<16)+1,
// token ::= `break
(4<<16)+1,
// token ::= `this
(4<<16)+1,
// token ::= `false
(4<<16)+1,
// token ::= `true
(4<<16)+1,
// token ::= `super
(4<<16)+1,
// token ::= `null
(4<<16)+1,
// token ::= `return
(4<<16)+1,
// token ::= `instanceof
(4<<16)+1,
// token ::= `new
(4<<16)+1,
// token ::= `abstract
(4<<16)+1,
// token ::= `assert
(4<<16)+1,
// token ::= `byte
(4<<16)+1,
// token ::= `case
(4<<16)+1,
// token ::= `catch
(4<<16)+1,
// token ::= `char
(4<<16)+1,
// token ::= `const
(4<<16)+1,
// token ::= `continue
(4<<16)+1,
// token ::= `default
(4<<16)+1,
// token ::= `do
(4<<16)+1,
// token ::= `double
(4<<16)+1,
// token ::= `enum
(4<<16)+1,
// token ::= `final
(4<<16)+1,
// token ::= `finally
(4<<16)+1,
// token ::= `float
(4<<16)+1,
// token ::= `goto
(4<<16)+1,
// token ::= `implements
(4<<16)+1,
// token ::= `import
(4<<16)+1,
// token ::= `interface
(4<<16)+1,
// token ::= `long
(4<<16)+1,
// token ::= `native
(4<<16)+1,
// token ::= `package
(4<<16)+1,
// token ::= `private
(4<<16)+1,
// token ::= `protected
(4<<16)+1,
// token ::= `public
(4<<16)+1,
// token ::= `short
(4<<16)+1,
// token ::= `static
(4<<16)+1,
// token ::= `strictfp
(4<<16)+1,
// token ::= `switch
(4<<16)+1,
// token ::= `synchronized
(4<<16)+1,
// token ::= `throw
(4<<16)+1,
// token ::= `throws
(4<<16)+1,
// token ::= `transient
(4<<16)+1,
// token ::= `try
(4<<16)+1,
// token ::= `volatile
(4<<16)+1,
// token ::= `!
(4<<16)+1,
// token ::= `!=
(4<<16)+1,
// token ::= `%
(4<<16)+1,
// token ::= `&&
(4<<16)+1,
// token ::= `*
(4<<16)+1,
// token ::= `(
(4<<16)+1,
// token ::= `)
(4<<16)+1,
// token ::= `{
(4<<16)+1,
// token ::= `}
(4<<16)+1,
// token ::= `-
(4<<16)+1,
// token ::= `+
(4<<16)+1,
// token ::= `=
(4<<16)+1,
// token ::= `==
(4<<16)+1,
// token ::= `[
(4<<16)+1,
// token ::= `]
(4<<16)+1,
// token ::= `||
(4<<16)+1,
// token ::= `<
(4<<16)+1,
// token ::= `<=
(4<<16)+1,
// token ::= `,
(4<<16)+1,
// token ::= `>
(4<<16)+1,
// token ::= `>=
(4<<16)+1,
// token ::= `.
(4<<16)+1,
// token ::= `;
(4<<16)+1,
// token ::= `++
(4<<16)+1,
// token ::= `--
(4<<16)+1,
// token ::= `/
(4<<16)+1,
// token ::= ID
(4<<16)+1,
// token ::= INTLIT
(4<<16)+1,
// token ::= STRINGLIT
(4<<16)+1,
// token ::= CHARLIT
(4<<16)+1,
// `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar ws*
(5<<16)+8,
// `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar
(5<<16)+7,
// reserved ::= `boolean
(95<<16)+1,
// `break ::= "b" "r" "e" "a" "k" !idChar ws*
(14<<16)+6,
// `break ::= "b" "r" "e" "a" "k" !idChar
(14<<16)+5,
// reserved ::= `break
(95<<16)+1,
// `class ::= "c" "l" "a" "s" "s" !idChar ws*
(6<<16)+6,
// `class ::= "c" "l" "a" "s" "s" !idChar
(6<<16)+5,
// reserved ::= `class
(95<<16)+1,
// `else ::= "e" "l" "s" "e" !idChar ws*
(12<<16)+5,
// `else ::= "e" "l" "s" "e" !idChar
(12<<16)+4,
// reserved ::= `else
(95<<16)+1,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar ws*
(7<<16)+8,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar
(7<<16)+7,
// reserved ::= `extends
(95<<16)+1,
// `false ::= "f" "a" "l" "s" "e" !idChar ws*
(16<<16)+6,
// `false ::= "f" "a" "l" "s" "e" !idChar
(16<<16)+5,
// reserved ::= `false
(95<<16)+1,
// `for ::= "f" "o" "r" !idChar ws*
(13<<16)+4,
// `for ::= "f" "o" "r" !idChar
(13<<16)+3,
// reserved ::= `for
(95<<16)+1,
// `if ::= "i" "f" !idChar ws*
(11<<16)+3,
// `if ::= "i" "f" !idChar
(11<<16)+2,
// reserved ::= `if
(95<<16)+1,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar ws*
(21<<16)+11,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar
(21<<16)+10,
// reserved ::= `instanceof
(95<<16)+1,
// `int ::= "i" "n" "t" !idChar ws*
(9<<16)+4,
// `int ::= "i" "n" "t" !idChar
(9<<16)+3,
// reserved ::= `int
(95<<16)+1,
// `new ::= "n" "e" "w" !idChar ws*
(22<<16)+4,
// `new ::= "n" "e" "w" !idChar
(22<<16)+3,
// reserved ::= `new
(95<<16)+1,
// `null ::= "n" "u" "l" "l" !idChar ws*
(19<<16)+5,
// `null ::= "n" "u" "l" "l" !idChar
(19<<16)+4,
// reserved ::= `null
(95<<16)+1,
// `public ::= "p" "u" "b" "l" "i" "c" !idChar ws*
(47<<16)+7,
// `public ::= "p" "u" "b" "l" "i" "c" !idChar
(47<<16)+6,
// reserved ::= `public
(95<<16)+1,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar ws*
(20<<16)+7,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar
(20<<16)+6,
// reserved ::= `return
(95<<16)+1,
// `super ::= "s" "u" "p" "e" "r" !idChar ws*
(18<<16)+6,
// `super ::= "s" "u" "p" "e" "r" !idChar
(18<<16)+5,
// reserved ::= `super
(95<<16)+1,
// `this ::= "t" "h" "i" "s" !idChar ws*
(15<<16)+5,
// `this ::= "t" "h" "i" "s" !idChar
(15<<16)+4,
// reserved ::= `this
(95<<16)+1,
// `true ::= "t" "r" "u" "e" !idChar ws*
(17<<16)+5,
// `true ::= "t" "r" "u" "e" !idChar
(17<<16)+4,
// reserved ::= `true
(95<<16)+1,
// `void ::= "v" "o" "i" "d" !idChar ws*
(8<<16)+5,
// `void ::= "v" "o" "i" "d" !idChar
(8<<16)+4,
// reserved ::= `void
(95<<16)+1,
// `while ::= "w" "h" "i" "l" "e" !idChar ws*
(10<<16)+6,
// `while ::= "w" "h" "i" "l" "e" !idChar
(10<<16)+5,
// reserved ::= `while
(95<<16)+1,
// `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar ws*
(23<<16)+9,
// `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar
(23<<16)+8,
// reserved ::= `abstract
(95<<16)+1,
// `assert ::= "a" "s" "s" "e" "r" "t" !idChar ws*
(24<<16)+7,
// `assert ::= "a" "s" "s" "e" "r" "t" !idChar
(24<<16)+6,
// reserved ::= `assert
(95<<16)+1,
// `byte ::= "b" "y" "t" "e" !idChar ws*
(25<<16)+5,
// `byte ::= "b" "y" "t" "e" !idChar
(25<<16)+4,
// reserved ::= `byte
(95<<16)+1,
// `case ::= "c" "a" "s" "e" !idChar ws*
(26<<16)+5,
// `case ::= "c" "a" "s" "e" !idChar
(26<<16)+4,
// reserved ::= `case
(95<<16)+1,
// `catch ::= "c" "a" "t" "c" "h" !idChar ws*
(27<<16)+6,
// `catch ::= "c" "a" "t" "c" "h" !idChar
(27<<16)+5,
// reserved ::= `catch
(95<<16)+1,
// `char ::= "c" "h" "a" "r" !idChar ws*
(28<<16)+5,
// `char ::= "c" "h" "a" "r" !idChar
(28<<16)+4,
// reserved ::= `char
(95<<16)+1,
// `const ::= "c" "o" "n" "s" "t" !idChar ws*
(29<<16)+6,
// `const ::= "c" "o" "n" "s" "t" !idChar
(29<<16)+5,
// reserved ::= `const
(95<<16)+1,
// `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar ws*
(30<<16)+9,
// `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar
(30<<16)+8,
// reserved ::= `continue
(95<<16)+1,
// `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar ws*
(31<<16)+8,
// `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar
(31<<16)+7,
// reserved ::= `default
(95<<16)+1,
// `double ::= "d" "o" "u" "b" "l" "e" !idChar ws*
(33<<16)+7,
// `double ::= "d" "o" "u" "b" "l" "e" !idChar
(33<<16)+6,
// reserved ::= `double
(95<<16)+1,
// `do ::= "d" "o" !idChar ws*
(32<<16)+3,
// `do ::= "d" "o" !idChar
(32<<16)+2,
// reserved ::= `do
(95<<16)+1,
// `enum ::= "e" "n" "u" "m" !idChar ws*
(34<<16)+5,
// `enum ::= "e" "n" "u" "m" !idChar
(34<<16)+4,
// reserved ::= `enum
(95<<16)+1,
// `final ::= "f" "i" "n" "a" "l" !idChar ws*
(35<<16)+6,
// `final ::= "f" "i" "n" "a" "l" !idChar
(35<<16)+5,
// reserved ::= `final
(95<<16)+1,
// `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar ws*
(36<<16)+8,
// `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar
(36<<16)+7,
// reserved ::= `finally
(95<<16)+1,
// `float ::= "f" "l" "o" "a" "t" !idChar ws*
(37<<16)+6,
// `float ::= "f" "l" "o" "a" "t" !idChar
(37<<16)+5,
// reserved ::= `float
(95<<16)+1,
// `goto ::= "g" "o" "t" "o" !idChar ws*
(38<<16)+5,
// `goto ::= "g" "o" "t" "o" !idChar
(38<<16)+4,
// reserved ::= `goto
(95<<16)+1,
// `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar ws*
(39<<16)+11,
// `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar
(39<<16)+10,
// reserved ::= `implements
(95<<16)+1,
// `import ::= "i" "m" "p" "o" "r" "t" !idChar ws*
(40<<16)+7,
// `import ::= "i" "m" "p" "o" "r" "t" !idChar
(40<<16)+6,
// reserved ::= `import
(95<<16)+1,
// `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar ws*
(41<<16)+10,
// `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar
(41<<16)+9,
// reserved ::= `interface
(95<<16)+1,
// `long ::= "l" "o" "n" "g" !idChar ws*
(42<<16)+5,
// `long ::= "l" "o" "n" "g" !idChar
(42<<16)+4,
// reserved ::= `long
(95<<16)+1,
// `native ::= "n" "a" "t" "i" "v" "e" !idChar ws*
(43<<16)+7,
// `native ::= "n" "a" "t" "i" "v" "e" !idChar
(43<<16)+6,
// reserved ::= `native
(95<<16)+1,
// `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar ws*
(44<<16)+8,
// `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar
(44<<16)+7,
// reserved ::= `package
(95<<16)+1,
// `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar ws*
(45<<16)+8,
// `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar
(45<<16)+7,
// reserved ::= `private
(95<<16)+1,
// `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar ws*
(46<<16)+10,
// `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar
(46<<16)+9,
// reserved ::= `protected
(95<<16)+1,
// `short ::= "s" "h" "o" "r" "t" !idChar ws*
(48<<16)+6,
// `short ::= "s" "h" "o" "r" "t" !idChar
(48<<16)+5,
// reserved ::= `short
(95<<16)+1,
// `static ::= "s" "t" "a" "t" "i" "c" !idChar ws*
(49<<16)+7,
// `static ::= "s" "t" "a" "t" "i" "c" !idChar
(49<<16)+6,
// reserved ::= `static
(95<<16)+1,
// `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar ws*
(50<<16)+9,
// `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar
(50<<16)+8,
// reserved ::= `strictfp
(95<<16)+1,
// `switch ::= "s" "w" "i" "t" "c" "h" !idChar ws*
(51<<16)+7,
// `switch ::= "s" "w" "i" "t" "c" "h" !idChar
(51<<16)+6,
// reserved ::= `switch
(95<<16)+1,
// `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar ws*
(52<<16)+13,
// `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar
(52<<16)+12,
// reserved ::= `synchronized
(95<<16)+1,
// `throw ::= "t" "h" "r" "o" "w" !idChar ws*
(53<<16)+6,
// `throw ::= "t" "h" "r" "o" "w" !idChar
(53<<16)+5,
// reserved ::= `throw
(95<<16)+1,
// `throws ::= "t" "h" "r" "o" "w" "s" !idChar ws*
(54<<16)+7,
// `throws ::= "t" "h" "r" "o" "w" "s" !idChar
(54<<16)+6,
// reserved ::= `throws
(95<<16)+1,
// `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar ws*
(55<<16)+10,
// `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar
(55<<16)+9,
// reserved ::= `transient
(95<<16)+1,
// `try ::= "t" "r" "y" !idChar ws*
(56<<16)+4,
// `try ::= "t" "r" "y" !idChar
(56<<16)+3,
// reserved ::= `try
(95<<16)+1,
// `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar ws*
(57<<16)+9,
// `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar
(57<<16)+8,
// reserved ::= `volatile
(95<<16)+1,
// `! ::= "!" !"=" ws*
(58<<16)+2,
// `! ::= "!" !"="
(58<<16)+1,
// `!= ::= "!" "=" ws*
(59<<16)+3,
// `!= ::= "!" "="
(59<<16)+2,
// `* ::= !"/" "*" !"/" ws*
(62<<16)+2,
// `* ::= !"/" "*" !"/"
(62<<16)+1,
// `% ::= "%" ws*
(60<<16)+2,
// `% ::= "%"
(60<<16)+1,
// `&& ::= "&" "&" ws*
(61<<16)+3,
// `&& ::= "&" "&"
(61<<16)+2,
// `( ::= "(" ws*
(63<<16)+2,
// `( ::= "("
(63<<16)+1,
// `) ::= ")" ws*
(64<<16)+2,
// `) ::= ")"
(64<<16)+1,
// `+ ::= "+" !"+" ws*
(68<<16)+2,
// `+ ::= "+" !"+"
(68<<16)+1,
// `++ ::= "+" "+" ws*
(81<<16)+3,
// `++ ::= "+" "+"
(81<<16)+2,
// `, ::= "," ws*
(76<<16)+2,
// `, ::= ","
(76<<16)+1,
// `- ::= "-" !"-" ws*
(67<<16)+2,
// `- ::= "-" !"-"
(67<<16)+1,
// `-- ::= "-" "-" ws*
(82<<16)+3,
// `-- ::= "-" "-"
(82<<16)+2,
// `. ::= "." ws*
(79<<16)+2,
// `. ::= "."
(79<<16)+1,
// `/ ::= !"*" "/" !{"*" "/"} ws*
(83<<16)+2,
// `/ ::= !"*" "/" !{"*" "/"}
(83<<16)+1,
// `; ::= ";" ws*
(80<<16)+2,
// `; ::= ";"
(80<<16)+1,
// `< ::= "<" !"=" ws*
(74<<16)+2,
// `< ::= "<" !"="
(74<<16)+1,
// `<= ::= "<" "=" ws*
(75<<16)+3,
// `<= ::= "<" "="
(75<<16)+2,
// `= ::= "=" !"=" ws*
(69<<16)+2,
// `= ::= "=" !"="
(69<<16)+1,
// `== ::= "=" "=" ws*
(70<<16)+3,
// `== ::= "=" "="
(70<<16)+2,
// `> ::= ">" !"=" ws*
(77<<16)+2,
// `> ::= ">" !"="
(77<<16)+1,
// `>= ::= ">" "=" ws*
(78<<16)+3,
// `>= ::= ">" "="
(78<<16)+2,
// `[ ::= "[" ws*
(71<<16)+2,
// `[ ::= "["
(71<<16)+1,
// `] ::= "]" ws*
(72<<16)+2,
// `] ::= "]"
(72<<16)+1,
// `{ ::= "{" ws*
(65<<16)+2,
// `{ ::= "{"
(65<<16)+1,
// `|| ::= "|" "|" ws*
(73<<16)+3,
// `|| ::= "|" "|"
(73<<16)+2,
// `} ::= "}" ws*
(66<<16)+2,
// `} ::= "}"
(66<<16)+1,
// INTLIT ::= "0" !{"0".."9" "X" "x"} ws*
(85<<16)+2,
// INTLIT ::= "0" !{"0".."9" "X" "x"}
(85<<16)+1,
// INTLIT ::= intLit2 ws*
(85<<16)+2,
// INTLIT ::= intLit2
(85<<16)+1,
// `x ::= {"X" "x"}
(138<<16)+1,
// INTLIT ::= "0" `x digit++ ws*
(85<<16)+4,
// INTLIT ::= "0" `x digit++
(85<<16)+3,
// INTLIT ::= "0" digit++ ws*
(85<<16)+3,
// INTLIT ::= "0" digit++
(85<<16)+2,
// STRINGLIT ::= '"' stringLiteral $$1
(86<<16)+3,
// STRINGLIT ::= '"' !stringChar $$1
(86<<16)+2,
// char ::= !{"'" "\"} printable
(144<<16)+1,
// CHARLIT ::= "'" char "'" ws*
(87<<16)+4,
// CHARLIT ::= "'" char "'"
(87<<16)+3,
// ID ::= !reserved letter idChar** $$2
(84<<16)+3,
// ID ::= !reserved letter idChar**
(84<<16)+2,
// ID ::= !reserved letter !idChar $$2
(84<<16)+2,
// ID ::= !reserved letter !idChar
(84<<16)+1,
// singleComment ::= "/" "/" printable** eol
(151<<16)+4,
// singleComment ::= "/" "/" !printable eol
(151<<16)+3,
// commentStart ::= "/" "*"
(154<<16)+2,
// commentTerminal ::= commentStart
(155<<16)+1,
// commentEnd ::= "*" "/"
(156<<16)+2,
// commentTerminal ::= commentEnd
(155<<16)+1,
// multiCommentContent ::= !commentTerminal printable
(157<<16)+1,
// multiCommentContent ::= eol
(157<<16)+1,
// multiCommentContent ::= commentStart
(157<<16)+1,
// multiComment ::= commentStart multiCommentContent** commentEnd
(158<<16)+3,
// multiComment ::= commentStart !multiCommentContent commentEnd
(158<<16)+2,
// intLit2 ::= !"0" digit++
(137<<16)+1,
// idChar ::= letter
(94<<16)+1,
// idChar ::= digit
(94<<16)+1,
// idChar ::= "_"
(94<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(148<<16)+1,
// digit ::= {"0".."9"}
(160<<16)+1,
// printable ::= {" ".."~"}
(147<<16)+1,
// stringChar ::= !{'"' "\"} printable
(143<<16)+1,
// stringLiteral ::= stringChar**
(141<<16)+1,
// ws ::= {9 " "}
(166<<16)+1,
// ws ::= eol
(166<<16)+1,
// ws ::= singleComment
(166<<16)+1,
// ws ::= multiComment
(166<<16)+1,
// eol ::= {10}
(153<<16)+1,
// eol ::= {13} {10}
(153<<16)+2,
// eol ::= {13} !10
(153<<16)+1,
// idChar** ::= idChar* !idChar
(149<<16)+1,
// stringChar** ::= stringChar* !stringChar
(165<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// multiCommentContent** ::= multiCommentContent* !multiCommentContent
(159<<16)+1,
// printable** ::= printable* !printable
(152<<16)+1,
// token* ::= token* token
(174<<16)+2,
// token* ::= token
(174<<16)+1,
// digit++ ::= digit+ !digit
(139<<16)+1,
// digit+ ::= digit
(175<<16)+1,
// digit+ ::= digit+ digit
(175<<16)+2,
// printable* ::= printable* printable
(173<<16)+2,
// printable* ::= printable
(173<<16)+1,
// stringChar* ::= stringChar* stringChar
(171<<16)+2,
// stringChar* ::= stringChar
(171<<16)+1,
// multiCommentContent* ::= multiCommentContent* multiCommentContent
(172<<16)+2,
// multiCommentContent* ::= multiCommentContent
(172<<16)+1,
// idChar* ::= idChar* idChar
(170<<16)+2,
// idChar* ::= idChar
(170<<16)+1,
// $$0 ::= token*
(3<<16)+1,
// $$1 ::= '"' ws*
(142<<16)+2,
// $$1 ::= '"'
(142<<16)+1,
// $$2 ::= ws*
(150<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
-1, // 0
-1, // 1
-1, // 2
-1, // 3
-1, // 4
-1, // 5
-1, // 6
-1, // 7
-1, // 8
167, // 9
168, // 10
-1, // 11
-1, // 12
169, // 13
-1, // 14
-1, // 15
-1, // 16
-1, // 17
-1, // 18
-1, // 19
-1, // 20
-1, // 21
-1, // 22
-1, // 23
-1, // 24
-1, // 25
-1, // 26
-1, // 27
-1, // 28
-1, // 29
-1, // 30
-1, // 31
164, // " "
114, // "!"
140, // '"'
163, // "#"
163, // "$"
118, // "%"
119, // "&"
146, // "'"
120, // "("
121, // ")"
117, // "*"
122, // "+"
123, // ","
124, // "-"
125, // "."
116, // "/"
134, // "0"
135, // "1"
135, // "2"
135, // "3"
135, // "4"
135, // "5"
135, // "6"
135, // "7"
135, // "8"
135, // "9"
163, // ":"
126, // ";"
127, // "<"
115, // "="
128, // ">"
163, // "?"
163, // "@"
162, // "A"
162, // "B"
162, // "C"
162, // "D"
162, // "E"
162, // "F"
162, // "G"
162, // "H"
162, // "I"
162, // "J"
162, // "K"
162, // "L"
162, // "M"
162, // "N"
162, // "O"
162, // "P"
162, // "Q"
162, // "R"
162, // "S"
162, // "T"
162, // "U"
162, // "V"
162, // "W"
136, // "X"
162, // "Y"
162, // "Z"
129, // "["
145, // "\"
130, // "]"
163, // "^"
161, // "_"
163, // "`"
92, // "a"
88, // "b"
98, // "c"
102, // "d"
91, // "e"
103, // "f"
112, // "g"
108, // "h"
104, // "i"
162, // "j"
97, // "k"
90, // "l"
111, // "m"
93, // "n"
89, // "o"
107, // "p"
162, // "q"
96, // "r"
99, // "s"
101, // "t"
106, // "u"
109, // "v"
105, // "w"
100, // "x"
110, // "y"
113, // "z"
131, // "{"
132, // "|"
133, // "}"
163, // "~"
-1, // 127
-1, // 128
-1, // 129
-1, // 130
-1, // 131
-1, // 132
-1, // 133
-1, // 134
-1, // 135
-1, // 136
-1, // 137
-1, // 138
-1, // 139
-1, // 140
-1, // 141
-1, // 142
-1, // 143
-1, // 144
-1, // 145
-1, // 146
-1, // 147
-1, // 148
-1, // 149
-1, // 150
-1, // 151
-1, // 152
-1, // 153
-1, // 154
-1, // 155
-1, // 156
-1, // 157
-1, // 158
-1, // 159
-1, // 160
-1, // 161
-1, // 162
-1, // 163
-1, // 164
-1, // 165
-1, // 166
-1, // 167
-1, // 168
-1, // 169
-1, // 170
-1, // 171
-1, // 172
-1, // 173
-1, // 174
-1, // 175
-1, // 176
-1, // 177
-1, // 178
-1, // 179
-1, // 180
-1, // 181
-1, // 182
-1, // 183
-1, // 184
-1, // 185
-1, // 186
-1, // 187
-1, // 188
-1, // 189
-1, // 190
-1, // 191
-1, // 192
-1, // 193
-1, // 194
-1, // 195
-1, // 196
-1, // 197
-1, // 198
-1, // 199
-1, // 200
-1, // 201
-1, // 202
-1, // 203
-1, // 204
-1, // 205
-1, // 206
-1, // 207
-1, // 208
-1, // 209
-1, // 210
-1, // 211
-1, // 212
-1, // 213
-1, // 214
-1, // 215
-1, // 216
-1, // 217
-1, // 218
-1, // 219
-1, // 220
-1, // 221
-1, // 222
-1, // 223
-1, // 224
-1, // 225
-1, // 226
-1, // 227
-1, // 228
-1, // 229
-1, // 230
-1, // 231
-1, // 232
-1, // 233
-1, // 234
-1, // 235
-1, // 236
-1, // 237
-1, // 238
-1, // 239
-1, // 240
-1, // 241
-1, // 242
-1, // 243
-1, // 244
-1, // 245
-1, // 246
-1, // 247
-1, // 248
-1, // 249
-1, // 250
-1, // 251
-1, // 252
-1, // 253
-1, // 254
-1, // 255
};
public String[] getActionProdNameTable() { return actionProdNameTable; }
private String[] actionProdNameTable = {
" ", // 0
" ", // 1
"start ::= ws* token*", // 2
"start ::= ws* token*", // 3
"start ::= ws* token*", // 4
"token ::= # `boolean", // 5
"token ::= # `class", // 6
"token ::= # `extends", // 7
"token ::= # `void", // 8
"token ::= # `int", // 9
"token ::= # `while", // 10
"token ::= # `if", // 11
"token ::= # `else", // 12
"token ::= # `for", // 13
"token ::= # `break", // 14
"token ::= # `this", // 15
"token ::= # `false", // 16
"token ::= # `true", // 17
"token ::= # `super", // 18
"token ::= # `null", // 19
"token ::= # `return", // 20
"token ::= # `instanceof", // 21
"token ::= # `new", // 22
"token ::= # `abstract", // 23
"token ::= # `assert", // 24
"token ::= # `byte", // 25
"token ::= # `case", // 26
"token ::= # `catch", // 27
"token ::= # `char", // 28
"token ::= # `const", // 29
"token ::= # `continue", // 30
"token ::= # `default", // 31
"token ::= # `do", // 32
"token ::= # `double", // 33
"token ::= # `enum", // 34
"token ::= # `final", // 35
"token ::= # `finally", // 36
"token ::= # `float", // 37
"token ::= # `goto", // 38
"token ::= # `implements", // 39
"token ::= # `import", // 40
"token ::= # `interface", // 41
"token ::= # `long", // 42
"token ::= # `native", // 43
"token ::= # `package", // 44
"token ::= # `private", // 45
"token ::= # `protected", // 46
"token ::= # `public", // 47
"token ::= # `short", // 48
"token ::= # `static", // 49
"token ::= # `strictfp", // 50
"token ::= # `switch", // 51
"token ::= # `synchronized", // 52
"token ::= # `throw", // 53
"token ::= # `throws", // 54
"token ::= # `transient", // 55
"token ::= # `try", // 56
"token ::= # `volatile", // 57
"token ::= # `!", // 58
"token ::= # `!=", // 59
"token ::= # `%", // 60
"token ::= # `&&", // 61
"token ::= # `*", // 62
"token ::= # `(", // 63
"token ::= # `)", // 64
"token ::= # `{", // 65
"token ::= # `}", // 66
"token ::= # `-", // 67
"token ::= # `+", // 68
"token ::= # `=", // 69
"token ::= # `==", // 70
"token ::= # `[", // 71
"token ::= # `]", // 72
"token ::= # `||", // 73
"token ::= # `<", // 74
"token ::= # `<=", // 75
"token ::= # `,", // 76
"token ::= # `>", // 77
"token ::= # `>=", // 78
"token ::= # `.", // 79
"token ::= # `;", // 80
"token ::= # `++", // 81
"token ::= # `--", // 82
"token ::= # `/", // 83
"token ::= # ID", // 84
"token ::= # INTLIT", // 85
"token ::= # STRINGLIT", // 86
"token ::= # CHARLIT", // 87
"`boolean ::= \"b\" \"o\" \"o\" \"l\" \"e\" \"a\" \"n\" !idChar ws*", // 88
"`boolean ::= \"b\" \"o\" \"o\" \"l\" \"e\" \"a\" \"n\" !idChar ws*", // 89
"reserved ::= `boolean", // 90
"`break ::= \"b\" \"r\" \"e\" \"a\" \"k\" !idChar ws*", // 91
"`break ::= \"b\" \"r\" \"e\" \"a\" \"k\" !idChar ws*", // 92
"reserved ::= `break", // 93
"`class ::= \"c\" \"l\" \"a\" \"s\" \"s\" !idChar ws*", // 94
"`class ::= \"c\" \"l\" \"a\" \"s\" \"s\" !idChar ws*", // 95
"reserved ::= `class", // 96
"`else ::= \"e\" \"l\" \"s\" \"e\" !idChar ws*", // 97
"`else ::= \"e\" \"l\" \"s\" \"e\" !idChar ws*", // 98
"reserved ::= `else", // 99
"`extends ::= \"e\" \"x\" \"t\" \"e\" \"n\" \"d\" \"s\" !idChar ws*", // 100
"`extends ::= \"e\" \"x\" \"t\" \"e\" \"n\" \"d\" \"s\" !idChar ws*", // 101
"reserved ::= `extends", // 102
"`false ::= \"f\" \"a\" \"l\" \"s\" \"e\" !idChar ws*", // 103
"`false ::= \"f\" \"a\" \"l\" \"s\" \"e\" !idChar ws*", // 104
"reserved ::= `false", // 105
"`for ::= \"f\" \"o\" \"r\" !idChar ws*", // 106
"`for ::= \"f\" \"o\" \"r\" !idChar ws*", // 107
"reserved ::= `for", // 108
"`if ::= \"i\" \"f\" !idChar ws*", // 109
"`if ::= \"i\" \"f\" !idChar ws*", // 110
"reserved ::= `if", // 111
"`instanceof ::= \"i\" \"n\" \"s\" \"t\" \"a\" \"n\" \"c\" \"e\" \"o\" \"f\" !idChar ws*", // 112
"`instanceof ::= \"i\" \"n\" \"s\" \"t\" \"a\" \"n\" \"c\" \"e\" \"o\" \"f\" !idChar ws*", // 113
"reserved ::= `instanceof", // 114
"`int ::= \"i\" \"n\" \"t\" !idChar ws*", // 115
"`int ::= \"i\" \"n\" \"t\" !idChar ws*", // 116
"reserved ::= `int", // 117
"`new ::= \"n\" \"e\" \"w\" !idChar ws*", // 118
"`new ::= \"n\" \"e\" \"w\" !idChar ws*", // 119
"reserved ::= `new", // 120
"`null ::= \"n\" \"u\" \"l\" \"l\" !idChar ws*", // 121
"`null ::= \"n\" \"u\" \"l\" \"l\" !idChar ws*", // 122
"reserved ::= `null", // 123
"`public ::= \"p\" \"u\" \"b\" \"l\" \"i\" \"c\" !idChar ws*", // 124
"`public ::= \"p\" \"u\" \"b\" \"l\" \"i\" \"c\" !idChar ws*", // 125
"reserved ::= `public", // 126
"`return ::= \"r\" \"e\" \"t\" \"u\" \"r\" \"n\" !idChar ws*", // 127
"`return ::= \"r\" \"e\" \"t\" \"u\" \"r\" \"n\" !idChar ws*", // 128
"reserved ::= `return", // 129
"`super ::= \"s\" \"u\" \"p\" \"e\" \"r\" !idChar ws*", // 130
"`super ::= \"s\" \"u\" \"p\" \"e\" \"r\" !idChar ws*", // 131
"reserved ::= `super", // 132
"`this ::= \"t\" \"h\" \"i\" \"s\" !idChar ws*", // 133
"`this ::= \"t\" \"h\" \"i\" \"s\" !idChar ws*", // 134
"reserved ::= `this", // 135
"`true ::= \"t\" \"r\" \"u\" \"e\" !idChar ws*", // 136
"`true ::= \"t\" \"r\" \"u\" \"e\" !idChar ws*", // 137
"reserved ::= `true", // 138
"`void ::= \"v\" \"o\" \"i\" \"d\" !idChar ws*", // 139
"`void ::= \"v\" \"o\" \"i\" \"d\" !idChar ws*", // 140
"reserved ::= `void", // 141
"`while ::= \"w\" \"h\" \"i\" \"l\" \"e\" !idChar ws*", // 142
"`while ::= \"w\" \"h\" \"i\" \"l\" \"e\" !idChar ws*", // 143
"reserved ::= `while", // 144
"`abstract ::= \"a\" \"b\" \"s\" \"t\" \"r\" \"a\" \"c\" \"t\" !idChar ws*", // 145
"`abstract ::= \"a\" \"b\" \"s\" \"t\" \"r\" \"a\" \"c\" \"t\" !idChar ws*", // 146
"reserved ::= `abstract", // 147
"`assert ::= \"a\" \"s\" \"s\" \"e\" \"r\" \"t\" !idChar ws*", // 148
"`assert ::= \"a\" \"s\" \"s\" \"e\" \"r\" \"t\" !idChar ws*", // 149
"reserved ::= `assert", // 150
"`byte ::= \"b\" \"y\" \"t\" \"e\" !idChar ws*", // 151
"`byte ::= \"b\" \"y\" \"t\" \"e\" !idChar ws*", // 152
"reserved ::= `byte", // 153
"`case ::= \"c\" \"a\" \"s\" \"e\" !idChar ws*", // 154
"`case ::= \"c\" \"a\" \"s\" \"e\" !idChar ws*", // 155
"reserved ::= `case", // 156
"`catch ::= \"c\" \"a\" \"t\" \"c\" \"h\" !idChar ws*", // 157
"`catch ::= \"c\" \"a\" \"t\" \"c\" \"h\" !idChar ws*", // 158
"reserved ::= `catch", // 159
"`char ::= \"c\" \"h\" \"a\" \"r\" !idChar ws*", // 160
"`char ::= \"c\" \"h\" \"a\" \"r\" !idChar ws*", // 161
"reserved ::= `char", // 162
"`const ::= \"c\" \"o\" \"n\" \"s\" \"t\" !idChar ws*", // 163
"`const ::= \"c\" \"o\" \"n\" \"s\" \"t\" !idChar ws*", // 164
"reserved ::= `const", // 165
"`continue ::= \"c\" \"o\" \"n\" \"t\" \"i\" \"n\" \"u\" \"e\" !idChar ws*", // 166
"`continue ::= \"c\" \"o\" \"n\" \"t\" \"i\" \"n\" \"u\" \"e\" !idChar ws*", // 167
"reserved ::= `continue", // 168
"`default ::= \"d\" \"e\" \"f\" \"a\" \"u\" \"l\" \"t\" !idChar ws*", // 169
"`default ::= \"d\" \"e\" \"f\" \"a\" \"u\" \"l\" \"t\" !idChar ws*", // 170
"reserved ::= `default", // 171
"`double ::= \"d\" \"o\" \"u\" \"b\" \"l\" \"e\" !idChar ws*", // 172
"`double ::= \"d\" \"o\" \"u\" \"b\" \"l\" \"e\" !idChar ws*", // 173
"reserved ::= `double", // 174
"`do ::= \"d\" \"o\" !idChar ws*", // 175
"`do ::= \"d\" \"o\" !idChar ws*", // 176
"reserved ::= `do", // 177
"`enum ::= \"e\" \"n\" \"u\" \"m\" !idChar ws*", // 178
"`enum ::= \"e\" \"n\" \"u\" \"m\" !idChar ws*", // 179
"reserved ::= `enum", // 180
"`final ::= \"f\" \"i\" \"n\" \"a\" \"l\" !idChar ws*", // 181
"`final ::= \"f\" \"i\" \"n\" \"a\" \"l\" !idChar ws*", // 182
"reserved ::= `final", // 183
"`finally ::= \"f\" \"i\" \"n\" \"a\" \"l\" \"l\" \"y\" !idChar ws*", // 184
"`finally ::= \"f\" \"i\" \"n\" \"a\" \"l\" \"l\" \"y\" !idChar ws*", // 185
"reserved ::= `finally", // 186
"`float ::= \"f\" \"l\" \"o\" \"a\" \"t\" !idChar ws*", // 187
"`float ::= \"f\" \"l\" \"o\" \"a\" \"t\" !idChar ws*", // 188
"reserved ::= `float", // 189
"`goto ::= \"g\" \"o\" \"t\" \"o\" !idChar ws*", // 190
"`goto ::= \"g\" \"o\" \"t\" \"o\" !idChar ws*", // 191
"reserved ::= `goto", // 192
"`implements ::= \"i\" \"m\" \"p\" \"l\" \"e\" \"m\" \"e\" \"n\" \"t\" \"s\" !idChar ws*", // 193
"`implements ::= \"i\" \"m\" \"p\" \"l\" \"e\" \"m\" \"e\" \"n\" \"t\" \"s\" !idChar ws*", // 194
"reserved ::= `implements", // 195
"`import ::= \"i\" \"m\" \"p\" \"o\" \"r\" \"t\" !idChar ws*", // 196
"`import ::= \"i\" \"m\" \"p\" \"o\" \"r\" \"t\" !idChar ws*", // 197
"reserved ::= `import", // 198
"`interface ::= \"i\" \"n\" \"t\" \"e\" \"r\" \"f\" \"a\" \"c\" \"e\" !idChar ws*", // 199
"`interface ::= \"i\" \"n\" \"t\" \"e\" \"r\" \"f\" \"a\" \"c\" \"e\" !idChar ws*", // 200
"reserved ::= `interface", // 201
"`long ::= \"l\" \"o\" \"n\" \"g\" !idChar ws*", // 202
"`long ::= \"l\" \"o\" \"n\" \"g\" !idChar ws*", // 203
"reserved ::= `long", // 204
"`native ::= \"n\" \"a\" \"t\" \"i\" \"v\" \"e\" !idChar ws*", // 205
"`native ::= \"n\" \"a\" \"t\" \"i\" \"v\" \"e\" !idChar ws*", // 206
"reserved ::= `native", // 207
"`package ::= \"p\" \"a\" \"c\" \"k\" \"a\" \"g\" \"e\" !idChar ws*", // 208
"`package ::= \"p\" \"a\" \"c\" \"k\" \"a\" \"g\" \"e\" !idChar ws*", // 209
"reserved ::= `package", // 210
"`private ::= \"p\" \"r\" \"i\" \"v\" \"a\" \"t\" \"e\" !idChar ws*", // 211
"`private ::= \"p\" \"r\" \"i\" \"v\" \"a\" \"t\" \"e\" !idChar ws*", // 212
"reserved ::= `private", // 213
"`protected ::= \"p\" \"r\" \"o\" \"t\" \"e\" \"c\" \"t\" \"e\" \"d\" !idChar ws*", // 214
"`protected ::= \"p\" \"r\" \"o\" \"t\" \"e\" \"c\" \"t\" \"e\" \"d\" !idChar ws*", // 215
"reserved ::= `protected", // 216
"`short ::= \"s\" \"h\" \"o\" \"r\" \"t\" !idChar ws*", // 217
"`short ::= \"s\" \"h\" \"o\" \"r\" \"t\" !idChar ws*", // 218
"reserved ::= `short", // 219
"`static ::= \"s\" \"t\" \"a\" \"t\" \"i\" \"c\" !idChar ws*", // 220
"`static ::= \"s\" \"t\" \"a\" \"t\" \"i\" \"c\" !idChar ws*", // 221
"reserved ::= `static", // 222
"`strictfp ::= \"s\" \"t\" \"r\" \"i\" \"c\" \"t\" \"f\" \"p\" !idChar ws*", // 223
"`strictfp ::= \"s\" \"t\" \"r\" \"i\" \"c\" \"t\" \"f\" \"p\" !idChar ws*", // 224
"reserved ::= `strictfp", // 225
"`switch ::= \"s\" \"w\" \"i\" \"t\" \"c\" \"h\" !idChar ws*", // 226
"`switch ::= \"s\" \"w\" \"i\" \"t\" \"c\" \"h\" !idChar ws*", // 227
"reserved ::= `switch", // 228
"`synchronized ::= \"s\" \"y\" \"n\" \"c\" \"h\" \"r\" \"o\" \"n\" \"i\" \"z\" \"e\" \"d\" !idChar ws*", // 229
"`synchronized ::= \"s\" \"y\" \"n\" \"c\" \"h\" \"r\" \"o\" \"n\" \"i\" \"z\" \"e\" \"d\" !idChar ws*", // 230
"reserved ::= `synchronized", // 231
"`throw ::= \"t\" \"h\" \"r\" \"o\" \"w\" !idChar ws*", // 232
"`throw ::= \"t\" \"h\" \"r\" \"o\" \"w\" !idChar ws*", // 233
"reserved ::= `throw", // 234
"`throws ::= \"t\" \"h\" \"r\" \"o\" \"w\" \"s\" !idChar ws*", // 235
"`throws ::= \"t\" \"h\" \"r\" \"o\" \"w\" \"s\" !idChar ws*", // 236
"reserved ::= `throws", // 237
"`transient ::= \"t\" \"r\" \"a\" \"n\" \"s\" \"i\" \"e\" \"n\" \"t\" !idChar ws*", // 238
"`transient ::= \"t\" \"r\" \"a\" \"n\" \"s\" \"i\" \"e\" \"n\" \"t\" !idChar ws*", // 239
"reserved ::= `transient", // 240
"`try ::= \"t\" \"r\" \"y\" !idChar ws*", // 241
"`try ::= \"t\" \"r\" \"y\" !idChar ws*", // 242
"reserved ::= `try", // 243
"`volatile ::= \"v\" \"o\" \"l\" \"a\" \"t\" \"i\" \"l\" \"e\" !idChar ws*", // 244
"`volatile ::= \"v\" \"o\" \"l\" \"a\" \"t\" \"i\" \"l\" \"e\" !idChar ws*", // 245
"reserved ::= `volatile", // 246
"`! ::= \"!\" !\"=\" ws*", // 247
"`! ::= \"!\" !\"=\" ws*", // 248
"`!= ::= \"!\" \"=\" ws*", // 249
"`!= ::= \"!\" \"=\" ws*", // 250
"`* ::= !\"/\" \"*\" !\"/\" ws*", // 251
"`* ::= !\"/\" \"*\" !\"/\" ws*", // 252
"`% ::= \"%\" ws*", // 253
"`% ::= \"%\" ws*", // 254
"`&& ::= \"&\" \"&\" ws*", // 255
"`&& ::= \"&\" \"&\" ws*", // 256
"`( ::= \"(\" ws*", // 257
"`( ::= \"(\" ws*", // 258
"`) ::= \")\" ws*", // 259
"`) ::= \")\" ws*", // 260
"`+ ::= \"+\" !\"+\" ws*", // 261
"`+ ::= \"+\" !\"+\" ws*", // 262
"`++ ::= \"+\" \"+\" ws*", // 263
"`++ ::= \"+\" \"+\" ws*", // 264
"`, ::= \",\" ws*", // 265
"`, ::= \",\" ws*", // 266
"`- ::= \"-\" !\"-\" ws*", // 267
"`- ::= \"-\" !\"-\" ws*", // 268
"`-- ::= \"-\" \"-\" ws*", // 269
"`-- ::= \"-\" \"-\" ws*", // 270
"`. ::= \".\" ws*", // 271
"`. ::= \".\" ws*", // 272
"`/ ::= !\"*\" \"/\" !{\"*\" \"/\"} ws*", // 273
"`/ ::= !\"*\" \"/\" !{\"*\" \"/\"} ws*", // 274
"`; ::= \";\" ws*", // 275
"`; ::= \";\" ws*", // 276
"`< ::= \"<\" !\"=\" ws*", // 277
"`< ::= \"<\" !\"=\" ws*", // 278
"`<= ::= \"<\" \"=\" ws*", // 279
"`<= ::= \"<\" \"=\" ws*", // 280
"`= ::= \"=\" !\"=\" ws*", // 281
"`= ::= \"=\" !\"=\" ws*", // 282
"`== ::= \"=\" \"=\" ws*", // 283
"`== ::= \"=\" \"=\" ws*", // 284
"`> ::= \">\" !\"=\" ws*", // 285
"`> ::= \">\" !\"=\" ws*", // 286
"`>= ::= \">\" \"=\" ws*", // 287
"`>= ::= \">\" \"=\" ws*", // 288
"`[ ::= \"[\" ws*", // 289
"`[ ::= \"[\" ws*", // 290
"`] ::= \"]\" ws*", // 291
"`] ::= \"]\" ws*", // 292
"`{ ::= \"{\" ws*", // 293
"`{ ::= \"{\" ws*", // 294
"`|| ::= \"|\" \"|\" ws*", // 295
"`|| ::= \"|\" \"|\" ws*", // 296
"`} ::= \"}\" ws*", // 297
"`} ::= \"}\" ws*", // 298
"INTLIT ::= # \"0\" !{\"0\"..\"9\" \"X\" \"x\"} ws*", // 299
"INTLIT ::= # \"0\" !{\"0\"..\"9\" \"X\" \"x\"} ws*", // 300
"INTLIT ::= # intLit2 ws*", // 301
"INTLIT ::= # intLit2 ws*", // 302
"`x ::= {\"X\" \"x\"}", // 303
"INTLIT ::= # \"0\" `x digit++ ws*", // 304
"INTLIT ::= # \"0\" `x digit++ ws*", // 305
"INTLIT ::= # \"0\" digit++ ws*", // 306
"INTLIT ::= # \"0\" digit++ ws*", // 307
"STRINGLIT ::= # \'\"\' stringLiteral \'\"\' ws*", // 308
"STRINGLIT ::= # \'\"\' stringLiteral \'\"\' ws*", // 309
"char ::= !{\"\'\" \"\\\"} printable", // 310
"CHARLIT ::= # \"\'\" char \"\'\" ws*", // 311
"CHARLIT ::= # \"\'\" char \"\'\" ws*", // 312
"ID ::= # !reserved letter idChar** ws*", // 313
"ID ::= # !reserved letter idChar** ws*", // 314
"ID ::= # !reserved letter idChar** ws*", // 315
"ID ::= # !reserved letter idChar** ws*", // 316
"singleComment ::= \"/\" \"/\" printable** eol", // 317
"singleComment ::= \"/\" \"/\" printable** eol", // 318
"commentStart ::= \"/\" \"*\"", // 319
"commentTerminal ::= commentStart", // 320
"commentEnd ::= \"*\" \"/\"", // 321
"commentTerminal ::= commentEnd", // 322
"multiCommentContent ::= !commentTerminal printable", // 323
"multiCommentContent ::= eol", // 324
"multiCommentContent ::= # commentStart", // 325
"multiComment ::= commentStart multiCommentContent** commentEnd", // 326
"multiComment ::= commentStart multiCommentContent** commentEnd", // 327
"intLit2 ::= !\"0\" digit++", // 328
"idChar ::= letter", // 329
"idChar ::= digit", // 330
"idChar ::= \"_\"", // 331
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 332
"digit ::= {\"0\"..\"9\"}", // 333
"printable ::= {\" \"..\"~\"}", // 334
"stringChar ::= !{\'\"\' \"\\\"} printable", // 335
"stringLiteral ::= stringChar**", // 336
"ws ::= {9 \" \"}", // 337
"ws ::= eol", // 338
"ws ::= singleComment", // 339
"ws ::= multiComment", // 340
"eol ::= {10} registerNewline", // 341
"eol ::= {13} {10} registerNewline", // 342
"eol ::= {13} !10 registerNewline", // 343
"idChar** ::= idChar* !idChar ", // 344
"stringChar** ::= stringChar* !stringChar ", // 345
"ws* ::= ws* ws ", // 346
"ws* ::= ws* ws ", // 347
"multiCommentContent** ::= multiCommentContent* !multiCommentContent ", // 348
"printable** ::= printable* !printable ", // 349
"token* ::= token* token ", // 350
"token* ::= token* token ", // 351
"digit++ ::= digit+ !digit ", // 352
"digit+ ::= digit ", // 353
"digit+ ::= digit+ digit ", // 354
"printable* ::= printable* printable ", // 355
"printable* ::= printable* printable ", // 356
"stringChar* ::= stringChar* stringChar ", // 357
"stringChar* ::= stringChar* stringChar ", // 358
"multiCommentContent* ::= multiCommentContent* multiCommentContent ", // 359
"multiCommentContent* ::= multiCommentContent* multiCommentContent ", // 360
"idChar* ::= idChar* idChar ", // 361
"idChar* ::= idChar* idChar ", // 362
" ", // 363
" ", // 364
" ", // 365
" ", // 366
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= start @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: $$start ::= [start] @pass
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 2: start ::= ws* $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 3: start ::= ws* [token*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 4: start ::= [ws*] $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 5: token ::= [#] `boolean @sawBoolean(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 6: token ::= [#] `class @sawClass(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 7: token ::= [#] `extends @sawExtends(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 8: token ::= [#] `void @sawVoid(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: token ::= [#] `int @sawInt(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: token ::= [#] `while @sawWhile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: token ::= [#] `if @sawIf(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: token ::= [#] `else @sawElse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: token ::= [#] `for @sawFor(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: token ::= [#] `break @sawBreak(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: token ::= [#] `this @sawThis(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 16: token ::= [#] `false @sawFalse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 17: token ::= [#] `true @sawTrue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 18: token ::= [#] `super @sawSuper(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 19: token ::= [#] `null @sawNull(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 20: token ::= [#] `return @sawReturn(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 21: token ::= [#] `instanceof @sawInstanceof(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 22: token ::= [#] `new @sawNew(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 23: token ::= [#] `abstract @sawAbstract(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 24: token ::= [#] `assert @sawAssert(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 25: token ::= [#] `byte @sawByte(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 26: token ::= [#] `case @sawCase(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 27: token ::= [#] `catch @sawCatch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 28: token ::= [#] `char @sawChar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 29: token ::= [#] `const @sawConst(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 30: token ::= [#] `continue @sawContinue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 31: token ::= [#] `default @sawDefault(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 32: token ::= [#] `do @sawDo(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 33: token ::= [#] `double @sawDouble(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 34: token ::= [#] `enum @sawEnum(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 35: token ::= [#] `final @sawFinal(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 36: token ::= [#] `finally @sawFinally(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 37: token ::= [#] `float @sawFloat(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 38: token ::= [#] `goto @sawGoto(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 39: token ::= [#] `implements @sawImplements(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 40: token ::= [#] `import @sawImport(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 41: token ::= [#] `interface @sawInterface(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 42: token ::= [#] `long @sawLong(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 43: token ::= [#] `native @sawNative(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 44: token ::= [#] `package @sawPackage(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 45: token ::= [#] `private @sawPrivate(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 46: token ::= [#] `protected @sawProtected(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 47: token ::= [#] `public @sawPublic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 48: token ::= [#] `short @sawShort(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 49: token ::= [#] `static @sawStatic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 50: token ::= [#] `strictfp @sawStrictfp(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 51: token ::= [#] `switch @sawSwitch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 52: token ::= [#] `synchronized @sawSynchronized(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 53: token ::= [#] `throw @sawThrow(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 54: token ::= [#] `throws @sawThrows(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 55: token ::= [#] `transient @sawTransient(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 56: token ::= [#] `try @sawTry(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 57: token ::= [#] `volatile @sawVolatile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 58: token ::= [#] `! @sawNot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 59: token ::= [#] `!= @sawNotEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 60: token ::= [#] `% @sawRemainder(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 61: token ::= [#] `&& @sawAnd(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 62: token ::= [#] `* @sawTimes(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 63: token ::= [#] `( @sawLpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 64: token ::= [#] `) @sawRpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 65: token ::= [#] `{ @sawLbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 66: token ::= [#] `} @sawRbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 67: token ::= [#] `- @sawMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 68: token ::= [#] `+ @sawPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 69: token ::= [#] `= @sawAssign(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 70: token ::= [#] `== @sawEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 71: token ::= [#] `[ @sawLbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 72: token ::= [#] `] @sawRbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 73: token ::= [#] `|| @sawOr(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 74: token ::= [#] `< @sawLess(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 75: token ::= [#] `<= @sawLessEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 76: token ::= [#] `, @sawComma(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 77: token ::= [#] `> @sawGreater(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 78: token ::= [#] `>= @sawGreaterEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 79: token ::= [#] `. @sawDot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 80: token ::= [#] `; @sawSemi(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 81: token ::= [#] `++ @sawPlusPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((76<<5)|0x5)/*methodCall:76*/,
    },
    { // 82: token ::= [#] `-- @sawMinusMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // 83: token ::= [#] `/ @sawSlash(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // 84: token ::= [#] ID @identifier(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((79<<5)|0x5)/*methodCall:79*/,
    },
    { // 85: token ::= [#] INTLIT @intLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((80<<5)|0x5)/*methodCall:80*/,
    },
    { // 86: token ::= [#] STRINGLIT @stringLit(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((81<<5)|0x5)/*methodCall:81*/,
    },
    { // 87: token ::= [#] CHARLIT @charLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((82<<5)|0x5)/*methodCall:82*/,
    },
    { // 88: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 89: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 90: reserved ::= `boolean @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 91: `break ::= "b" "r" "e" "a" "k" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 92: `break ::= "b" "r" "e" "a" "k" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 93: reserved ::= `break @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 94: `class ::= "c" "l" "a" "s" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 95: `class ::= "c" "l" "a" "s" "s" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 96: reserved ::= `class @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 97: `else ::= "e" "l" "s" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 98: `else ::= "e" "l" "s" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 99: reserved ::= `else @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 100: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 101: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 102: reserved ::= `extends @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 103: `false ::= "f" "a" "l" "s" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 104: `false ::= "f" "a" "l" "s" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 105: reserved ::= `false @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 106: `for ::= "f" "o" "r" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 107: `for ::= "f" "o" "r" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 108: reserved ::= `for @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 109: `if ::= "i" "f" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 110: `if ::= "i" "f" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 111: reserved ::= `if @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 112: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 113: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 114: reserved ::= `instanceof @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 115: `int ::= "i" "n" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 116: `int ::= "i" "n" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 117: reserved ::= `int @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 118: `new ::= "n" "e" "w" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 119: `new ::= "n" "e" "w" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 120: reserved ::= `new @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 121: `null ::= "n" "u" "l" "l" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 122: `null ::= "n" "u" "l" "l" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 123: reserved ::= `null @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 124: `public ::= "p" "u" "b" "l" "i" "c" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 125: `public ::= "p" "u" "b" "l" "i" "c" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 126: reserved ::= `public @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 127: `return ::= "r" "e" "t" "u" "r" "n" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 128: `return ::= "r" "e" "t" "u" "r" "n" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 129: reserved ::= `return @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 130: `super ::= "s" "u" "p" "e" "r" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 131: `super ::= "s" "u" "p" "e" "r" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 132: reserved ::= `super @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 133: `this ::= "t" "h" "i" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 134: `this ::= "t" "h" "i" "s" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 135: reserved ::= `this @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 136: `true ::= "t" "r" "u" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 137: `true ::= "t" "r" "u" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 138: reserved ::= `true @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 139: `void ::= "v" "o" "i" "d" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 140: `void ::= "v" "o" "i" "d" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 141: reserved ::= `void @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 142: `while ::= "w" "h" "i" "l" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 143: `while ::= "w" "h" "i" "l" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 144: reserved ::= `while @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 145: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 146: `abstract ::= "a" "b" "s" "t" "r" "a" "c" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 147: reserved ::= `abstract @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 148: `assert ::= "a" "s" "s" "e" "r" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 149: `assert ::= "a" "s" "s" "e" "r" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 150: reserved ::= `assert @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 151: `byte ::= "b" "y" "t" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 152: `byte ::= "b" "y" "t" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 153: reserved ::= `byte @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 154: `case ::= "c" "a" "s" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 155: `case ::= "c" "a" "s" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 156: reserved ::= `case @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 157: `catch ::= "c" "a" "t" "c" "h" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 158: `catch ::= "c" "a" "t" "c" "h" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 159: reserved ::= `catch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 160: `char ::= "c" "h" "a" "r" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 161: `char ::= "c" "h" "a" "r" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 162: reserved ::= `char @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 163: `const ::= "c" "o" "n" "s" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 164: `const ::= "c" "o" "n" "s" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 165: reserved ::= `const @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 166: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 167: `continue ::= "c" "o" "n" "t" "i" "n" "u" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 168: reserved ::= `continue @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 169: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 170: `default ::= "d" "e" "f" "a" "u" "l" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 171: reserved ::= `default @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 172: `double ::= "d" "o" "u" "b" "l" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 173: `double ::= "d" "o" "u" "b" "l" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 174: reserved ::= `double @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 175: `do ::= "d" "o" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 176: `do ::= "d" "o" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 177: reserved ::= `do @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 178: `enum ::= "e" "n" "u" "m" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 179: `enum ::= "e" "n" "u" "m" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 180: reserved ::= `enum @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 181: `final ::= "f" "i" "n" "a" "l" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 182: `final ::= "f" "i" "n" "a" "l" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 183: reserved ::= `final @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 184: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 185: `finally ::= "f" "i" "n" "a" "l" "l" "y" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 186: reserved ::= `finally @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 187: `float ::= "f" "l" "o" "a" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 188: `float ::= "f" "l" "o" "a" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 189: reserved ::= `float @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 190: `goto ::= "g" "o" "t" "o" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 191: `goto ::= "g" "o" "t" "o" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 192: reserved ::= `goto @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 193: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 194: `implements ::= "i" "m" "p" "l" "e" "m" "e" "n" "t" "s" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 195: reserved ::= `implements @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 196: `import ::= "i" "m" "p" "o" "r" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 197: `import ::= "i" "m" "p" "o" "r" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 198: reserved ::= `import @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 199: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 200: `interface ::= "i" "n" "t" "e" "r" "f" "a" "c" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 201: reserved ::= `interface @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 202: `long ::= "l" "o" "n" "g" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 203: `long ::= "l" "o" "n" "g" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 204: reserved ::= `long @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 205: `native ::= "n" "a" "t" "i" "v" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 206: `native ::= "n" "a" "t" "i" "v" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 207: reserved ::= `native @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 208: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 209: `package ::= "p" "a" "c" "k" "a" "g" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 210: reserved ::= `package @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 211: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 212: `private ::= "p" "r" "i" "v" "a" "t" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 213: reserved ::= `private @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 214: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 215: `protected ::= "p" "r" "o" "t" "e" "c" "t" "e" "d" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 216: reserved ::= `protected @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 217: `short ::= "s" "h" "o" "r" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 218: `short ::= "s" "h" "o" "r" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 219: reserved ::= `short @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 220: `static ::= "s" "t" "a" "t" "i" "c" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 221: `static ::= "s" "t" "a" "t" "i" "c" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 222: reserved ::= `static @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 223: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 224: `strictfp ::= "s" "t" "r" "i" "c" "t" "f" "p" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 225: reserved ::= `strictfp @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 226: `switch ::= "s" "w" "i" "t" "c" "h" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 227: `switch ::= "s" "w" "i" "t" "c" "h" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 228: reserved ::= `switch @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 229: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x3)/*popOffPushBack:12*/,
    },
    { // 230: `synchronized ::= "s" "y" "n" "c" "h" "r" "o" "n" "i" "z" "e" "d" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x3)/*popOffPushBack:12*/,
    },
    { // 231: reserved ::= `synchronized @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 232: `throw ::= "t" "h" "r" "o" "w" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 233: `throw ::= "t" "h" "r" "o" "w" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 234: reserved ::= `throw @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 235: `throws ::= "t" "h" "r" "o" "w" "s" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 236: `throws ::= "t" "h" "r" "o" "w" "s" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 237: reserved ::= `throws @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 238: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 239: `transient ::= "t" "r" "a" "n" "s" "i" "e" "n" "t" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x3)/*popOffPushBack:9*/,
    },
    { // 240: reserved ::= `transient @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 241: `try ::= "t" "r" "y" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 242: `try ::= "t" "r" "y" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 243: reserved ::= `try @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 244: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 245: `volatile ::= "v" "o" "l" "a" "t" "i" "l" "e" !idChar [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x3)/*popOffPushBack:8*/,
    },
    { // 246: reserved ::= `volatile @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 247: `! ::= "!" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 248: `! ::= "!" !"=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 249: `!= ::= "!" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 250: `!= ::= "!" "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 251: `* ::= !"/" "*" !"/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 252: `* ::= !"/" "*" !"/" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 253: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 254: `% ::= "%" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 255: `&& ::= "&" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 256: `&& ::= "&" "&" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 257: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 258: `( ::= "(" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 259: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 260: `) ::= ")" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 261: `+ ::= "+" !"+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 262: `+ ::= "+" !"+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 263: `++ ::= "+" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 264: `++ ::= "+" "+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 265: `, ::= "," ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 266: `, ::= "," [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 267: `- ::= "-" !"-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 268: `- ::= "-" !"-" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 269: `-- ::= "-" "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 270: `-- ::= "-" "-" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 271: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 272: `. ::= "." [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 273: `/ ::= !"*" "/" !{"*" "/"} ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 274: `/ ::= !"*" "/" !{"*" "/"} [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 275: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 276: `; ::= ";" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 277: `< ::= "<" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 278: `< ::= "<" !"=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 279: `<= ::= "<" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 280: `<= ::= "<" "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 281: `= ::= "=" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 282: `= ::= "=" !"=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 283: `== ::= "=" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 284: `== ::= "=" "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 285: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 286: `> ::= ">" !"=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 287: `>= ::= ">" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 288: `>= ::= ">" "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 289: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 290: `[ ::= "[" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 291: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 292: `] ::= "]" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 293: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 294: `{ ::= "{" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 295: `|| ::= "|" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 296: `|| ::= "|" "|" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 297: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 298: `} ::= "}" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 299: INTLIT ::= [#] "0" !{"0".."9" "X" "x"} ws* @returnZero(int,Character)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 300: INTLIT ::= [#] "0" !{"0".."9" "X" "x"} [ws*] @returnZero(int,Character)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 301: INTLIT ::= [#] intLit2 ws* @convertToInt(int,String)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 302: INTLIT ::= [#] intLit2 [ws*] @convertToInt(int,String)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 303: `x ::= {"X" "x"} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 304: INTLIT ::= [#] "0" `x digit++ ws* @convertHexToInt(int,Character,List<Character>)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 305: INTLIT ::= [#] "0" `x digit++ [ws*] @convertHexToInt(int,Character,List<Character>)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 306: INTLIT ::= [#] "0" digit++ ws* @convertOctalToInt(int,Character,List<Character>)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 307: INTLIT ::= [#] "0" digit++ [ws*] @convertOctalToInt(int,Character,List<Character>)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 308: STRINGLIT ::= [#] '"' stringLiteral $$1 @convertStringLiteral(int,Character,String,Character)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 309: STRINGLIT ::= [#] '"' !stringChar [stringLiteral] $$1 @convertStringLiteral(int,Character,String,Character)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
    { // 310: char ::= !{"'" "\"} printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 311: CHARLIT ::= [#] "'" char "'" ws* @charLiteralToInt(int,Character,Character,Character)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((88<<5)|0x5)/*methodCall:88*/,
    },
    { // 312: CHARLIT ::= [#] "'" char "'" [ws*] @charLiteralToInt(int,Character,Character,Character)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((88<<5)|0x5)/*methodCall:88*/,
    },
    { // 313: ID ::= !reserved [#] letter idChar** $$2 @convertToString(int,Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 314: ID ::= !reserved [#] letter idChar** [ws*] @convertToString(int,Character,List<Character>)=>String
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 315: ID ::= !reserved [#] letter !idChar [idChar**] $$2 @convertToString(int,Character,List<Character>)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 316: ID ::= !reserved [#] letter !idChar [idChar**] [ws*] @convertToString(int,Character,List<Character>)=>String
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((89<<5)|0x5)/*methodCall:89*/,
    },
    { // 317: singleComment ::= "/" "/" printable** eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 318: singleComment ::= "/" "/" !printable [printable**] eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 319: commentStart ::= "/" "*" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 320: commentTerminal ::= commentStart @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 321: commentEnd ::= "*" "/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 322: commentTerminal ::= commentEnd @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 323: multiCommentContent ::= !commentTerminal printable @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 324: multiCommentContent ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 325: multiCommentContent ::= [#] commentStart @possibleNestedComment(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((90<<5)|0x5)/*methodCall:90*/,
    },
    { // 326: multiComment ::= commentStart multiCommentContent** commentEnd @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 327: multiComment ::= commentStart !multiCommentContent [multiCommentContent**] commentEnd @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 328: intLit2 ::= !"0" digit++ @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 329: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 330: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 331: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 332: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 333: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 334: printable ::= {" ".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 335: stringChar ::= !{'"' "\"} printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 336: stringLiteral ::= stringChar** @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 337: ws ::= {9 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 338: ws ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 339: ws ::= singleComment @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 340: ws ::= multiComment @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 341: eol ::= {10} [registerNewline] @void
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 342: eol ::= {13} {10} [registerNewline] @void
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 343: eol ::= {13} !10 [registerNewline] @void
      ((14<<5)|0x6)/*nullProductionAction:14*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 344: idChar** ::= idChar* !idChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 345: stringChar** ::= stringChar* !stringChar @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 346: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 347: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 348: multiCommentContent** ::= multiCommentContent* !multiCommentContent @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 349: printable** ::= printable* !printable @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 350: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 351: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
    },
    { // 352: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 353: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 354: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 355: printable* ::= printable* printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 356: printable* ::= [printable*] printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 357: stringChar* ::= stringChar* stringChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 358: stringChar* ::= [stringChar*] stringChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 359: multiCommentContent* ::= multiCommentContent* multiCommentContent @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 360: multiCommentContent* ::= [multiCommentContent*] multiCommentContent @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 361: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 362: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 363: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 364: $$1 ::= '"' ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 365: $$1 ::= '"' [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 366: $$2 ::= ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "printable** ::= printable* !printable ", // printable**
    "printable* ::= ", // printable*
    "start ::= ws* token*", // start
    "ws* ::= ", // ws*
    "multiCommentContent* ::= ", // multiCommentContent*
    "stringChar* ::= ", // stringChar*
    "idChar** ::= idChar* !idChar ", // idChar**
    "token* ::= ", // token*
    "idChar* ::= ", // idChar*
    "multiCommentContent** ::= multiCommentContent* !multiCommentContent ", // multiCommentContent**
    "stringLiteral ::= stringChar**", // stringLiteral
    "stringChar** ::= stringChar* !stringChar ", // stringChar**
    " ", // $$start
    "# ::= ", // #
    "registerNewline ::= #", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // printable**
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // printable*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // start
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
    },
    { // ws*
    },
    { // multiCommentContent*
    },
    { // stringChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // idChar**
      ((8<<5)|0x6)/*nullProductionAction:8*/,
    },
    { // token*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // multiCommentContent**
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // stringLiteral
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // stringChar**
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // $$start
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((13<<5)|0x6)/*nullProductionAction:13*/,
      ((91<<5)|0x5)/*methodCall:91*/,
    },
};
public void actionCall(int idx, wrangLR.runtime.SemanticInfo si) {
  switch(idx) {
    default: System.err.println("Internal error--illegal action number: "+idx);break;
    case 0: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawBoolean(parm0);
    }
    break;
    case 1: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawClass(parm0);
    }
    break;
    case 2: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawExtends(parm0);
    }
    break;
    case 3: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawVoid(parm0);
    }
    break;
    case 4: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInt(parm0);
    }
    break;
    case 5: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawWhile(parm0);
    }
    break;
    case 6: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawIf(parm0);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawElse(parm0);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFor(parm0);
    }
    break;
    case 9: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawBreak(parm0);
    }
    break;
    case 10: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThis(parm0);
    }
    break;
    case 11: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFalse(parm0);
    }
    break;
    case 12: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTrue(parm0);
    }
    break;
    case 13: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSuper(parm0);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNull(parm0);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawReturn(parm0);
    }
    break;
    case 16: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInstanceof(parm0);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNew(parm0);
    }
    break;
    case 18: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAbstract(parm0);
    }
    break;
    case 19: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAssert(parm0);
    }
    break;
    case 20: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawByte(parm0);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawCase(parm0);
    }
    break;
    case 22: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawCatch(parm0);
    }
    break;
    case 23: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawChar(parm0);
    }
    break;
    case 24: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawConst(parm0);
    }
    break;
    case 25: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawContinue(parm0);
    }
    break;
    case 26: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDefault(parm0);
    }
    break;
    case 27: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDo(parm0);
    }
    break;
    case 28: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDouble(parm0);
    }
    break;
    case 29: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawEnum(parm0);
    }
    break;
    case 30: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFinal(parm0);
    }
    break;
    case 31: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFinally(parm0);
    }
    break;
    case 32: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFloat(parm0);
    }
    break;
    case 33: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGoto(parm0);
    }
    break;
    case 34: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawImplements(parm0);
    }
    break;
    case 35: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawImport(parm0);
    }
    break;
    case 36: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInterface(parm0);
    }
    break;
    case 37: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLong(parm0);
    }
    break;
    case 38: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNative(parm0);
    }
    break;
    case 39: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPackage(parm0);
    }
    break;
    case 40: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPrivate(parm0);
    }
    break;
    case 41: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawProtected(parm0);
    }
    break;
    case 42: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPublic(parm0);
    }
    break;
    case 43: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawShort(parm0);
    }
    break;
    case 44: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawStatic(parm0);
    }
    break;
    case 45: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawStrictfp(parm0);
    }
    break;
    case 46: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSwitch(parm0);
    }
    break;
    case 47: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSynchronized(parm0);
    }
    break;
    case 48: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThrow(parm0);
    }
    break;
    case 49: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThrows(parm0);
    }
    break;
    case 50: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTransient(parm0);
    }
    break;
    case 51: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTry(parm0);
    }
    break;
    case 52: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawVolatile(parm0);
    }
    break;
    case 53: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNot(parm0);
    }
    break;
    case 54: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNotEqual(parm0);
    }
    break;
    case 55: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRemainder(parm0);
    }
    break;
    case 56: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAnd(parm0);
    }
    break;
    case 57: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTimes(parm0);
    }
    break;
    case 58: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLpar(parm0);
    }
    break;
    case 59: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRpar(parm0);
    }
    break;
    case 60: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLbrace(parm0);
    }
    break;
    case 61: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRbrace(parm0);
    }
    break;
    case 62: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawMinus(parm0);
    }
    break;
    case 63: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPlus(parm0);
    }
    break;
    case 64: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAssign(parm0);
    }
    break;
    case 65: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawEqual(parm0);
    }
    break;
    case 66: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLbrack(parm0);
    }
    break;
    case 67: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRbrack(parm0);
    }
    break;
    case 68: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawOr(parm0);
    }
    break;
    case 69: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLess(parm0);
    }
    break;
    case 70: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLessEq(parm0);
    }
    break;
    case 71: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawComma(parm0);
    }
    break;
    case 72: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGreater(parm0);
    }
    break;
    case 73: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGreaterEq(parm0);
    }
    break;
    case 74: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDot(parm0);
    }
    break;
    case 75: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSemi(parm0);
    }
    break;
    case 76: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPlusPlus(parm0);
    }
    break;
    case 77: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawMinusMinus(parm0);
    }
    break;
    case 78: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSlash(parm0);
    }
    break;
    case 79: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      actionObject.identifier(parm0,parm1);
    }
    break;
    case 80: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      actionObject.intLit(parm0,parm1);
    }
    break;
    case 81: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      actionObject.stringLit(parm0,parm1);
    }
    break;
    case 82: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      actionObject.charLit(parm0,parm1);
    }
    break;
    case 83: {
      int parm0 = (Integer)si.popPb();
      Character parm1 = (Character)si.popPb();
      int result = actionObject.returnZero(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 84: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 85: {
      int parm0 = (Integer)si.popPb();
      Character parm1 = (Character)si.popPb();
      List<Character> parm2 = (List<Character>)si.popPb();
      int result = actionObject.convertHexToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 86: {
      int parm0 = (Integer)si.popPb();
      Character parm1 = (Character)si.popPb();
      List<Character> parm2 = (List<Character>)si.popPb();
      int result = actionObject.convertOctalToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 87: {
      int parm0 = (Integer)si.popPb();
      Character parm1 = (Character)si.popPb();
      String parm2 = (String)si.popPb();
      Character parm3 = (Character)si.popPb();
      String result = actionObject.convertStringLiteral(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 88: {
      int parm0 = (Integer)si.popPb();
      Character parm1 = (Character)si.popPb();
      Character parm2 = (Character)si.popPb();
      Character parm3 = (Character)si.popPb();
      int result = actionObject.charLiteralToInt(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 89: {
      int parm0 = (Integer)si.popPb();
      Character parm1 = (Character)si.popPb();
      List<Character> parm2 = (List<Character>)si.popPb();
      String result = actionObject.convertToString(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 90: {
      int parm0 = (Integer)si.popPb();
      actionObject.possibleNestedComment(parm0);
    }
    break;
    case 91: {
      int parm0 = (Integer)si.popPb();
      actionObject.registerNewline(parm0);
    }
    break;
  }
}
private String[] saNameSigTable = {
"void sawBoolean(int)",
"void sawClass(int)",
"void sawExtends(int)",
"void sawVoid(int)",
"void sawInt(int)",
"void sawWhile(int)",
"void sawIf(int)",
"void sawElse(int)",
"void sawFor(int)",
"void sawBreak(int)",
"void sawThis(int)",
"void sawFalse(int)",
"void sawTrue(int)",
"void sawSuper(int)",
"void sawNull(int)",
"void sawReturn(int)",
"void sawInstanceof(int)",
"void sawNew(int)",
"void sawAbstract(int)",
"void sawAssert(int)",
"void sawByte(int)",
"void sawCase(int)",
"void sawCatch(int)",
"void sawChar(int)",
"void sawConst(int)",
"void sawContinue(int)",
"void sawDefault(int)",
"void sawDo(int)",
"void sawDouble(int)",
"void sawEnum(int)",
"void sawFinal(int)",
"void sawFinally(int)",
"void sawFloat(int)",
"void sawGoto(int)",
"void sawImplements(int)",
"void sawImport(int)",
"void sawInterface(int)",
"void sawLong(int)",
"void sawNative(int)",
"void sawPackage(int)",
"void sawPrivate(int)",
"void sawProtected(int)",
"void sawPublic(int)",
"void sawShort(int)",
"void sawStatic(int)",
"void sawStrictfp(int)",
"void sawSwitch(int)",
"void sawSynchronized(int)",
"void sawThrow(int)",
"void sawThrows(int)",
"void sawTransient(int)",
"void sawTry(int)",
"void sawVolatile(int)",
"void sawNot(int)",
"void sawNotEqual(int)",
"void sawRemainder(int)",
"void sawAnd(int)",
"void sawTimes(int)",
"void sawLpar(int)",
"void sawRpar(int)",
"void sawLbrace(int)",
"void sawRbrace(int)",
"void sawMinus(int)",
"void sawPlus(int)",
"void sawAssign(int)",
"void sawEqual(int)",
"void sawLbrack(int)",
"void sawRbrack(int)",
"void sawOr(int)",
"void sawLess(int)",
"void sawLessEq(int)",
"void sawComma(int)",
"void sawGreater(int)",
"void sawGreaterEq(int)",
"void sawDot(int)",
"void sawSemi(int)",
"void sawPlusPlus(int)",
"void sawMinusMinus(int)",
"void sawSlash(int)",
"void identifier(int,String)",
"void intLit(int,int)",
"void stringLit(int,String)",
"void charLit(int,int)",
"int returnZero(int,Character)",
"int convertToInt(int,String)",
"int convertHexToInt(int,Character,List<Character>)",
"int convertOctalToInt(int,Character,List<Character>)",
"String convertStringLiteral(int,Character,String,Character)",
"int charLiteralToInt(int,Character,Character,Character)",
"String convertToString(int,Character,List<Character>)",
"void possibleNestedComment(int)",
"void registerNewline(int)",
};
public String[] getSaNameSigTable() {
  return saNameSigTable;
}
private int[] sigCountTable = {
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
2,0,
2,0,
2,0,
2,0,
2,1,
2,1,
3,1,
3,1,
4,1,
4,1,
3,1,
1,0,
1,0,
};
public int[] getSigCountTable() {
  return sigCountTable;
}
public int[] getSymbolSizeTable() { return symbolSizeTable; }
private int[] symbolSizeTable = {
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    1,
    1,
    1,
    1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    0,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    0,
    1,
    -1,
    1,
    1,
    1,
    1,
    -1,
    -1,
    1,
    1,
    1,
    0,
    0,
    1,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    1,
    -1,
    -1,
    -1,
    -1,
    1,
    0,
    -1,
    -1,
    -1,
    1,
    1,
    0,
    1,
    0,
    1,
    -1,
    -1,
};
public Object vectorToTuple(java.util.Vector<Object> vec) {
  switch (vec.size()) {
  }
  System.err.println("Internal error--illegal Tuple size: "+vec.size());
  return null;
}
}
