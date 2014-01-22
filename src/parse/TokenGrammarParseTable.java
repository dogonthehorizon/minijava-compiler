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
0x80000000|529, // match move
0x80000000|1180, // no-match move
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+251, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+251, // $
-1, // $NT
  }
,
{ // state 3
115,392, // "="
  }
,
{ // state 4
99,471, // "s"
101,161, // "t"
  }
,
{ // state 5
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+154, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+154, // $
MIN_REDUCTION+154, // $NT
  }
,
{ // state 6
0x80000000|789, // match move
0x80000000|302, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 7
0x80000000|1428, // match move
0x80000000|851, // no-match move
// T-test match for "*":
117,
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+283, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+283, // $
-1, // $NT
  }
,
{ // state 9
91,1587, // "e"
  }
,
{ // state 10
0x80000000|1, // match move
0x80000000|819, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 11
0x80000000|1, // match move
0x80000000|246, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 12
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+275, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+275, // $
-1, // $NT
  }
,
{ // state 13
104,1309, // "i"
  }
,
{ // state 14
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 15
0x80000000|1, // match move
0x80000000|243, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 16
177,MIN_REDUCTION+187, // $NT
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 17
0x80000000|1438, // match move
0x80000000|985, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 18
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 19
0x80000000|596, // match move
0x80000000|981, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 20
0x80000000|1011, // match move
0x80000000|1466, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 21
101,988, // "t"
  }
,
{ // state 22
0x80000000|840, // match move
0x80000000|1522, // no-match move
0x80000000|1164, // NT-test-match state for digit
  }
,
{ // state 23
92,114, // "a"
  }
,
{ // state 24
90,942, // "l"
  }
,
{ // state 25
92,286, // "a"
  }
,
{ // state 26
0x80000000|1068, // match move
0x80000000|1329, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 27
MIN_REDUCTION+349, // (default reduction)
  }
,
{ // state 28
2,7, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 29
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+364, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+364, // $
-1, // $NT
  }
,
{ // state 30
0x80000000|1005, // match move
0x80000000|1388, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 31
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 32
0x80000000|235, // match move
0x80000000|794, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 33
2,179, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 34
101,1327, // "t"
  }
,
{ // state 35
0x80000000|1153, // match move
0x80000000|1303, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 36
98,241, // "c"
  }
,
{ // state 37
2,1276, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 38
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 39
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 40
0x80000000|1, // match move
0x80000000|531, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 41
2,923, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 42
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+295, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+295, // $
-1, // $NT
  }
,
{ // state 43
101,604, // "t"
  }
,
{ // state 44
-1, // $$start
-1, // start
936, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+270, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+270, // $
-1, // $NT
  }
,
{ // state 45
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+301, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+301, // $
-1, // $NT
  }
,
{ // state 46
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 47
177,MIN_REDUCTION+190, // $NT
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 48
92,1105, // "a"
  }
,
{ // state 49
177,MIN_REDUCTION+153, // $NT
  }
,
{ // state 50
-1, // $$start
-1, // start
679, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+280, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+280, // $
-1, // $NT
  }
,
{ // state 51
0x80000000|1, // match move
0x80000000|1363, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 52
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 53
0x80000000|977, // match move
0x80000000|1291, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 54
2,321, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 55
0x80000000|493, // match move
0x80000000|369, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 56
117,84, // "*"
  }
,
{ // state 57
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 58
-1, // $$start
-1, // start
194, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+264, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+264, // $
-1, // $NT
  }
,
{ // state 59
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 60
2,907, // ws*
150,403, // $$2
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 61
96,991, // "r"
  }
,
{ // state 62
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 63
-1, // $$start
-1, // start
950, // ws*
-1, // $$0
MIN_REDUCTION+164, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+164, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+164, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+164, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+164, // "u"
267, // "p"
MIN_REDUCTION+164, // "h"
1274, // "v"
MIN_REDUCTION+164, // "y"
MIN_REDUCTION+164, // "m"
1212, // "g"
MIN_REDUCTION+164, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+164, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+164, // {"1".."9"}
MIN_REDUCTION+164, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+164, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 64
101,262, // "t"
  }
,
{ // state 65
0x80000000|539, // match move
0x80000000|1518, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 66
177,MIN_REDUCTION+229, // $NT
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 67
2,665, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 68
117,MIN_REDUCTION+319, // "*"
156,MIN_REDUCTION+319, // commentEnd
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 69
0x80000000|630, // match move
0x80000000|58, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 70
2,1103, // ws*
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 71
0x80000000|1, // match move
0x80000000|908, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 72
2,424, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 73
-1, // $$start
-1, // start
625, // ws*
-1, // $$0
MIN_REDUCTION+182, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+182, // "o"
904, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+182, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+182, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+182, // "u"
267, // "p"
MIN_REDUCTION+182, // "h"
1274, // "v"
MIN_REDUCTION+182, // "y"
MIN_REDUCTION+182, // "m"
1212, // "g"
MIN_REDUCTION+182, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+182, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+182, // {"1".."9"}
MIN_REDUCTION+182, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+182, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 74
2,838, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 75
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 76
177,MIN_REDUCTION+211, // $NT
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 77
0x80000000|234, // match move
0x80000000|1532, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 78
115,621, // "="
  }
,
{ // state 79
90,98, // "l"
  }
,
{ // state 80
92,1354, // "a"
96,322, // "r"
108,542, // "h"
  }
,
{ // state 81
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 82
0x80000000|1, // match move
0x80000000|437, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 83
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 84
0x80000000|263, // match move
0x80000000|68, // no-match move
0x80000000|890, // NT-test-match state for multiCommentContent
  }
,
{ // state 85
177,MIN_REDUCTION+133, // $NT
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 86
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 87
0x80000000|343, // match move
0x80000000|5, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 88
177,MIN_REDUCTION+183, // $NT
  }
,
{ // state 89
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 90
177,MIN_REDUCTION+213, // $NT
  }
,
{ // state 91
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 92
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 93
-1, // $$start
-1, // start
1557, // ws*
-1, // $$0
MIN_REDUCTION+101, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+101, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+101, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+101, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+101, // "u"
267, // "p"
MIN_REDUCTION+101, // "h"
1274, // "v"
MIN_REDUCTION+101, // "y"
MIN_REDUCTION+101, // "m"
1212, // "g"
MIN_REDUCTION+101, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+101, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+101, // {"1".."9"}
MIN_REDUCTION+101, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+101, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 94
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 95
0x80000000|1, // match move
0x80000000|1140, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 96
99,502, // "s"
  }
,
{ // state 97
2,838, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 98
91,185, // "e"
  }
,
{ // state 99
MIN_REDUCTION+344, // (default reduction)
  }
,
{ // state 100
-1, // $$start
-1, // start
1150, // ws*
-1, // $$0
MIN_REDUCTION+107, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+107, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+107, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+107, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+107, // "u"
267, // "p"
MIN_REDUCTION+107, // "h"
1274, // "v"
MIN_REDUCTION+107, // "y"
MIN_REDUCTION+107, // "m"
1212, // "g"
MIN_REDUCTION+107, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+107, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+107, // {"1".."9"}
MIN_REDUCTION+107, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+107, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 101
-1, // $$start
-1, // start
1187, // ws*
-1, // $$0
MIN_REDUCTION+152, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+152, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+152, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+152, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+152, // "u"
267, // "p"
MIN_REDUCTION+152, // "h"
1274, // "v"
MIN_REDUCTION+152, // "y"
MIN_REDUCTION+152, // "m"
1212, // "g"
MIN_REDUCTION+152, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+152, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+152, // {"1".."9"}
MIN_REDUCTION+152, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+152, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 102
0x80000000|364, // match move
0x80000000|734, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 103
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 104
MIN_REDUCTION+351, // (default reduction)
  }
,
{ // state 105
0x80000000|1455, // match move
0x80000000|1189, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 106
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 107
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 108
2,950, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 109
MIN_REDUCTION+345, // (default reduction)
  }
,
{ // state 110
0x80000000|1044, // match move
0x80000000|526, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 111
0x80000000|33, // match move
0x80000000|1019, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 112
0x80000000|577, // match move
0x80000000|1404, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 113
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 114
112,808, // "g"
  }
,
{ // state 115
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 116
177,MIN_REDUCTION+243, // $NT
  }
,
{ // state 117
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 118
-1, // $$start
-1, // start
1526, // ws*
-1, // $$0
MIN_REDUCTION+230, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+230, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+230, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+230, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+230, // "u"
267, // "p"
MIN_REDUCTION+230, // "h"
1274, // "v"
MIN_REDUCTION+230, // "y"
MIN_REDUCTION+230, // "m"
1212, // "g"
MIN_REDUCTION+230, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+230, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+230, // {"1".."9"}
MIN_REDUCTION+230, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+230, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 119
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 120
92,914, // "a"
  }
,
{ // state 121
2,1352, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 122
0x80000000|1278, // match move
0x80000000|779, // no-match move
0x80000000|1164, // NT-test-match state for digit
  }
,
{ // state 123
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 124
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 125
2,1103, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 126
177,MIN_REDUCTION+120, // $NT
  }
,
{ // state 127
0x80000000|175, // match move
0x80000000|725, // no-match move
0x80000000|1606, // NT-test-match state for stringChar
  }
,
{ // state 128
0x80000000|1088, // match move
0x80000000|548, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 129
0x80000000|1, // match move
0x80000000|616, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 130
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 131
2,852, // ws*
153,1156, // eol
164,878, // " "
166,830, // ws
167,878, // {9}
168,1161, // {10}
169,707, // {13}
MIN_REDUCTION+252, // (default reduction)
  }
,
{ // state 132
-1, // $$start
-1, // start
1530, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+307, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+307, // $
-1, // $NT
  }
,
{ // state 133
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 134
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 135
-1, // $$start
-1, // start
287, // ws*
-1, // $$0
MIN_REDUCTION+140, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+140, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+140, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+140, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+140, // "u"
267, // "p"
MIN_REDUCTION+140, // "h"
1274, // "v"
MIN_REDUCTION+140, // "y"
MIN_REDUCTION+140, // "m"
1212, // "g"
MIN_REDUCTION+140, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+140, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+140, // {"1".."9"}
MIN_REDUCTION+140, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+140, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 136
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+281, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+281, // $
-1, // $NT
  }
,
{ // state 137
0x80000000|1098, // match move
0x80000000|1359, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 138
89,1512, // "o"
90,1481, // "l"
92,1479, // "a"
104,1147, // "i"
  }
,
{ // state 139
2,411, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 140
2,1557, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 141
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 142
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 143
2,1269, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 144
2,159, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 145
0x80000000|807, // match move
0x80000000|810, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 146
0x80000000|848, // match move
0x80000000|1015, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 147
MIN_REDUCTION+315, // (default reduction)
  }
,
{ // state 148
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 149
2,1263, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 150
0x80000000|281, // match move
0x80000000|1198, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 151
0x80000000|1413, // match move
0x80000000|733, // no-match move
0x80000000|890, // NT-test-match state for multiCommentContent
  }
,
{ // state 152
177,MIN_REDUCTION+177, // $NT
  }
,
{ // state 153
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 154
2,1592, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 155
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+257, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+257, // $
-1, // $NT
  }
,
{ // state 156
108,359, // "h"
  }
,
{ // state 157
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 158
2,160, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 159
0x80000000|174, // match move
0x80000000|467, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 160
0x80000000|1431, // match move
0x80000000|1362, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 161
104,1250, // "i"
  }
,
{ // state 162
92,842, // "a"
  }
,
{ // state 163
0x80000000|919, // match move
0x80000000|504, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 164
177,MIN_REDUCTION+178, // $NT
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 165
0x80000000|1565, // match move
0x80000000|87, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 166
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+202, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+202, // $
MIN_REDUCTION+202, // $NT
  }
,
{ // state 167
112,661, // "g"
  }
,
{ // state 168
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 169
2,163, // ws*
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 170
177,MIN_REDUCTION+240, // $NT
  }
,
{ // state 171
0x80000000|1576, // match move
0x80000000|1036, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 172
177,MIN_REDUCTION+323, // $NT
  }
,
{ // state 173
0x80000000|641, // match move
0x80000000|1441, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 174
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 175
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 176
0x80000000|1277, // match move
0x80000000|316, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 177
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+151, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+151, // $
MIN_REDUCTION+151, // $NT
  }
,
{ // state 178
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 179
0x80000000|1176, // match move
0x80000000|1358, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 180
0x80000000|560, // match move
0x80000000|519, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 181
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+190, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+190, // $
MIN_REDUCTION+190, // $NT
  }
,
{ // state 182
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
-1, // `=
-1, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
MIN_REDUCTION+282, // "="
1511, // "/"
MIN_REDUCTION+282, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+282, // $
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
{ // state 183
0x80000000|1483, // match move
0x80000000|1412, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 184
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 185
92,965, // "a"
  }
,
{ // state 186
0x80000000|1022, // match move
0x80000000|652, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 187
2,579, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 188
0x80000000|1124, // match move
0x80000000|523, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 189
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+172, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+172, // $
MIN_REDUCTION+172, // $NT
  }
,
{ // state 190
2,449, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 191
0x80000000|1, // match move
0x80000000|1367, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 192
2,341, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 193
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 194
0x80000000|1457, // match move
0x80000000|312, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 195
0x80000000|1391, // match move
0x80000000|888, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 196
3,1234, // $$0
4,104, // token
5,91, // `boolean
6,1280, // `class
7,1410, // `extends
8,1607, // `void
9,607, // `int
10,1247, // `while
11,301, // `if
12,1510, // `else
13,142, // `for
14,782, // `break
15,667, // `this
16,757, // `false
17,283, // `true
18,1469, // `super
19,561, // `null
20,1353, // `return
21,46, // `instanceof
22,372, // `new
23,549, // `abstract
24,877, // `assert
25,400, // `byte
26,515, // `case
27,645, // `catch
28,1337, // `char
29,18, // `const
30,130, // `continue
31,289, // `default
32,795, // `do
33,14, // `double
34,230, // `enum
35,1599, // `final
36,1418, // `finally
37,484, // `float
38,31, // `goto
39,796, // `implements
40,141, // `import
41,762, // `interface
42,1041, // `long
43,612, // `native
44,1066, // `package
45,524, // `private
46,633, // `protected
47,885, // `public
48,1078, // `short
49,1239, // `static
50,1193, // `strictfp
51,1118, // `switch
52,584, // `synchronized
53,553, // `throw
54,1040, // `throws
55,304, // `transient
56,791, // `try
57,1295, // `volatile
88,1305, // "b"
90,1497, // "l"
91,512, // "e"
92,1139, // "a"
93,1169, // "n"
96,1046, // "r"
98,1465, // "c"
99,1051, // "s"
101,440, // "t"
102,1559, // "d"
103,138, // "f"
104,617, // "i"
105,1052, // "w"
107,267, // "p"
109,1274, // "v"
112,1212, // "g"
174,764, // token*
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 197
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 198
-1, // $$start
-1, // start
203, // ws*
-1, // $$0
MIN_REDUCTION+89, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+89, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+89, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+89, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+89, // "u"
267, // "p"
MIN_REDUCTION+89, // "h"
1274, // "v"
MIN_REDUCTION+89, // "y"
MIN_REDUCTION+89, // "m"
1212, // "g"
MIN_REDUCTION+89, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+89, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+89, // {"1".."9"}
MIN_REDUCTION+89, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+89, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 199
0x80000000|1551, // match move
0x80000000|818, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 200
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 201
0x80000000|1, // match move
0x80000000|959, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 202
177,MIN_REDUCTION+340, // $NT
MIN_REDUCTION+340, // (default reduction)
  }
,
{ // state 203
0x80000000|103, // match move
0x80000000|822, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 204
2,320, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 205
MIN_REDUCTION+357, // (default reduction)
  }
,
{ // state 206
116,532, // "/"
154,340, // commentStart
  }
,
{ // state 207
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 208
2,321, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 209
88,1076, // "b"
89,1076, // "o"
90,1076, // "l"
91,1076, // "e"
92,1076, // "a"
93,1076, // "n"
96,1076, // "r"
97,1076, // "k"
98,1076, // "c"
99,1076, // "s"
100,1076, // "x"
101,1076, // "t"
102,1076, // "d"
103,1076, // "f"
104,1076, // "i"
105,1076, // "w"
106,1076, // "u"
107,1076, // "p"
108,1076, // "h"
109,1076, // "v"
110,1076, // "y"
111,1076, // "m"
112,1076, // "g"
113,1076, // "z"
114,1076, // "!"
115,1076, // "="
116,1076, // "/"
117,1076, // "*"
118,1076, // "%"
119,1076, // "&"
120,1076, // "("
121,1076, // ")"
122,1076, // "+"
123,1076, // ","
124,1076, // "-"
125,1076, // "."
126,1076, // ";"
127,1076, // "<"
128,1076, // ">"
129,1076, // "["
130,1076, // "]"
131,1076, // "{"
132,1076, // "|"
133,1076, // "}"
134,1076, // "0"
135,1076, // {"1".."9"}
136,1076, // "X"
140,1076, // '"'
145,1076, // "\"
146,1076, // "'"
161,1076, // "_"
162,1076, // {"A".."W" "Y".."Z" "j" "q"}
163,1076, // {"#".."$" ":" "?".."@" "^" "`" "~"}
164,1076, // " "
  }
,
{ // state 210
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+169, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+169, // $
MIN_REDUCTION+169, // $NT
  }
,
{ // state 211
0x80000000|362, // match move
0x80000000|1395, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 212
0x80000000|97, // match move
0x80000000|77, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 213
109,25, // "v"
  }
,
{ // state 214
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 215
90,785, // "l"
  }
,
{ // state 216
0x80000000|1159, // match move
0x80000000|1583, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 217
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 218
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 219
0x80000000|555, // match move
0x80000000|849, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 220
106,397, // "u"
  }
,
{ // state 221
1,528, // start
2,150, // ws*
3,1288, // $$0
4,104, // token
5,91, // `boolean
6,1280, // `class
7,1410, // `extends
8,1607, // `void
9,607, // `int
10,1247, // `while
11,301, // `if
12,1510, // `else
13,142, // `for
14,782, // `break
15,667, // `this
16,757, // `false
17,283, // `true
18,1469, // `super
19,561, // `null
20,1353, // `return
21,46, // `instanceof
22,372, // `new
23,549, // `abstract
24,877, // `assert
25,400, // `byte
26,515, // `case
27,645, // `catch
28,1337, // `char
29,18, // `const
30,130, // `continue
31,289, // `default
32,795, // `do
33,14, // `double
34,230, // `enum
35,1599, // `final
36,1418, // `finally
37,484, // `float
38,31, // `goto
39,796, // `implements
40,141, // `import
41,762, // `interface
42,1041, // `long
43,612, // `native
44,1066, // `package
45,524, // `private
46,633, // `protected
47,885, // `public
48,1078, // `short
49,1239, // `static
50,1193, // `strictfp
51,1118, // `switch
52,584, // `synchronized
53,553, // `throw
54,1040, // `throws
55,304, // `transient
56,791, // `try
57,1295, // `volatile
174,764, // token*
  }
,
{ // state 222
91,1230, // "e"
  }
,
{ // state 223
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+157, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+157, // $
MIN_REDUCTION+157, // $NT
  }
,
{ // state 224
0x80000000|86, // match move
0x80000000|420, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 225
0x80000000|1402, // match move
0x80000000|732, // no-match move
0x80000000|890, // NT-test-match state for multiCommentContent
  }
,
{ // state 226
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 227
0x80000000|62, // match move
0x80000000|552, // no-match move
0x80000000|890, // NT-test-match state for multiCommentContent
  }
,
{ // state 228
2,411, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 229
0x80000000|1204, // match move
0x80000000|957, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 230
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 231
177,MIN_REDUCTION+115, // $NT
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 232
177,MIN_REDUCTION+333, // $NT
  }
,
{ // state 233
102,430, // "d"
  }
,
{ // state 234
2,838, // ws*
MIN_REDUCTION+298, // (default reduction)
  }
,
{ // state 235
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 236
99,580, // "s"
  }
,
{ // state 237
177,MIN_REDUCTION+318, // $NT
MIN_REDUCTION+318, // (default reduction)
  }
,
{ // state 238
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 239
91,1148, // "e"
  }
,
{ // state 240
177,MIN_REDUCTION+205, // $NT
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 241
101,571, // "t"
  }
,
{ // state 242
91,468, // "e"
  }
,
{ // state 243
0x80000000|278, // match move
0x80000000|1056, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 244
92,454, // "a"
  }
,
{ // state 245
177,MIN_REDUCTION+346, // $NT
MIN_REDUCTION+346, // (default reduction)
  }
,
{ // state 246
0x80000000|546, // match move
0x80000000|1538, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 247
90,1196, // "l"
  }
,
{ // state 248
0x80000000|850, // match move
0x80000000|1558, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 249
0x80000000|866, // match move
0x80000000|132, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 250
0x80000000|238, // match move
0x80000000|42, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 251
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 252
177,MIN_REDUCTION+207, // $NT
  }
,
{ // state 253
101,1603, // "t"
  }
,
{ // state 254
0x80000000|644, // match move
0x80000000|1595, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 255
177,MIN_REDUCTION+202, // $NT
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 256
101,788, // "t"
  }
,
{ // state 257
99,990, // "s"
  }
,
{ // state 258
0x80000000|208, // match move
0x80000000|465, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 259
0x80000000|187, // match move
0x80000000|404, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 260
0x80000000|193, // match move
0x80000000|978, // no-match move
0x80000000|890, // NT-test-match state for multiCommentContent
  }
,
{ // state 261
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 262
91,450, // "e"
  }
,
{ // state 263
MIN_REDUCTION+319, // (default reduction)
  }
,
{ // state 264
89,1347, // "o"
  }
,
{ // state 265
0x80000000|221, // match move
0x80000000|889, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 266
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 267
92,1386, // "a"
96,1183, // "r"
106,1122, // "u"
  }
,
{ // state 268
0x80000000|1590, // match move
0x80000000|804, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 269
-1, // $$start
-1, // start
1028, // ws*
-1, // $$0
MIN_REDUCTION+176, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+176, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+176, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+176, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
591, // "u"
267, // "p"
MIN_REDUCTION+176, // "h"
1274, // "v"
MIN_REDUCTION+176, // "y"
MIN_REDUCTION+176, // "m"
1212, // "g"
MIN_REDUCTION+176, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+176, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+176, // {"1".."9"}
MIN_REDUCTION+176, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+176, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 270
149,MIN_REDUCTION+332, // idChar**
161,MIN_REDUCTION+332, // "_"
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 271
2,592, // ws*
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 272
0x80000000|1238, // match move
0x80000000|418, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 273
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 274
177,MIN_REDUCTION+216, // $NT
  }
,
{ // state 275
MIN_REDUCTION+328, // (default reduction)
  }
,
{ // state 276
92,351, // "a"
  }
,
{ // state 277
2,568, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 278
2,720, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 279
2,160, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 280
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+223, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+223, // $
MIN_REDUCTION+223, // $NT
  }
,
{ // state 281
0x80000000|1, // match move
0x80000000|40, // no-match move
// T-test match for "/":
116,
  }
,
{ // state 282
177,MIN_REDUCTION+106, // $NT
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 283
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 284
0x80000000|1, // match move
0x80000000|1067, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 285
0x80000000|1283, // match move
0x80000000|363, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 286
101,9, // "t"
  }
,
{ // state 287
0x80000000|39, // match move
0x80000000|1580, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 288
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+115, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+115, // $
MIN_REDUCTION+115, // $NT
  }
,
{ // state 289
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 290
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 291
88,1323, // "b"
89,1323, // "o"
90,1323, // "l"
91,1323, // "e"
92,1323, // "a"
93,1323, // "n"
96,1323, // "r"
97,1323, // "k"
98,1323, // "c"
99,1323, // "s"
100,1323, // "x"
101,1323, // "t"
102,1323, // "d"
103,1323, // "f"
104,1323, // "i"
105,1323, // "w"
106,1323, // "u"
107,1323, // "p"
108,1323, // "h"
109,1323, // "v"
110,1323, // "y"
111,1323, // "m"
112,1323, // "g"
113,1323, // "z"
114,1323, // "!"
115,1323, // "="
116,1323, // "/"
117,1323, // "*"
118,1323, // "%"
119,1323, // "&"
120,1323, // "("
121,1323, // ")"
122,1323, // "+"
123,1323, // ","
124,1323, // "-"
125,1323, // "."
126,1323, // ";"
127,1323, // "<"
128,1323, // ">"
129,1323, // "["
130,1323, // "]"
131,1323, // "{"
132,1323, // "|"
133,1323, // "}"
134,1323, // "0"
135,1323, // {"1".."9"}
136,1323, // "X"
140,1323, // '"'
143,1433, // stringChar
145,1323, // "\"
146,1323, // "'"
147,1429, // printable
161,1323, // "_"
162,1323, // {"A".."W" "Y".."Z" "j" "q"}
163,1323, // {"#".."$" ":" "?".."@" "^" "`" "~"}
164,1323, // " "
  }
,
{ // state 292
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 293
0x80000000|1, // match move
0x80000000|869, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 294
-1, // $$start
-1, // start
160, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+272, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+272, // $
-1, // $NT
  }
,
{ // state 295
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+139, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+139, // $
MIN_REDUCTION+139, // $NT
  }
,
{ // state 296
0x80000000|1262, // match move
0x80000000|753, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 297
0x80000000|386, // match move
0x80000000|1575, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 298
0x80000000|767, // match move
0x80000000|89, // no-match move
0x80000000|1164, // NT-test-match state for digit
  }
,
{ // state 299
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 300
0x80000000|1, // match move
0x80000000|825, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 301
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 302
0x80000000|746, // match move
0x80000000|1350, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 303
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+297, // (default reduction)
  }
,
{ // state 304
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 305
0x80000000|998, // match move
0x80000000|1449, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 306
2,424, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 307
2,721, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 308
177,MIN_REDUCTION+171, // $NT
  }
,
{ // state 309
0x80000000|1199, // match move
0x80000000|898, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 310
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 311
0x80000000|1163, // match move
0x80000000|1475, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 312
0x80000000|602, // match move
0x80000000|1328, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 313
MIN_REDUCTION+356, // (default reduction)
  }
,
{ // state 314
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 315
0x80000000|1343, // match move
0x80000000|513, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 316
0x80000000|999, // match move
0x80000000|1114, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 317
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 318
0x80000000|768, // match move
0x80000000|370, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 319
0x80000000|859, // match move
0x80000000|44, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 320
0x80000000|739, // match move
0x80000000|229, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 321
0x80000000|1566, // match move
0x80000000|1136, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 322
92,1473, // "a"
104,558, // "i"
106,414, // "u"
110,1374, // "y"
  }
,
{ // state 323
107,925, // "p"
  }
,
{ // state 324
104,354, // "i"
  }
,
{ // state 325
0x80000000|1120, // match move
0x80000000|1143, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 326
177,MIN_REDUCTION+118, // $NT
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 327
177,MIN_REDUCTION+210, // $NT
  }
,
{ // state 328
106,873, // "u"
  }
,
{ // state 329
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 330
104,558, // "i"
  }
,
{ // state 331
-1, // $$start
-1, // start
1462, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+305, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+305, // $
-1, // $NT
  }
,
{ // state 332
0x80000000|60, // match move
0x80000000|1087, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 333
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+118, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+118, // $
MIN_REDUCTION+118, // $NT
  }
,
{ // state 334
-1, // $$start
-1, // start
1012, // ws*
-1, // $$0
MIN_REDUCTION+149, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+149, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+149, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+149, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+149, // "u"
267, // "p"
MIN_REDUCTION+149, // "h"
1274, // "v"
MIN_REDUCTION+149, // "y"
MIN_REDUCTION+149, // "m"
1212, // "g"
MIN_REDUCTION+149, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+149, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+149, // {"1".."9"}
MIN_REDUCTION+149, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+149, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 335
0x80000000|1273, // match move
0x80000000|1226, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 336
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 337
91,405, // "e"
  }
,
{ // state 338
5,1123, // `boolean
6,970, // `class
7,1038, // `extends
8,1030, // `void
9,488, // `int
10,705, // `while
11,1058, // `if
12,754, // `else
13,845, // `for
14,1453, // `break
15,899, // `this
16,428, // `false
17,856, // `true
18,1454, // `super
19,606, // `null
20,1057, // `return
21,1588, // `instanceof
22,126, // `new
23,436, // `abstract
24,812, // `assert
25,49, // `byte
26,1253, // `case
27,1496, // `catch
28,345, // `char
29,487, // `const
30,1268, // `continue
31,308, // `default
32,152, // `do
33,745, // `double
34,626, // `enum
35,88, // `final
36,714, // `finally
37,393, // `float
38,1459, // `goto
39,469, // `implements
40,585, // `import
41,401, // `interface
42,903, // `long
43,252, // `native
44,327, // `package
45,90, // `private
46,274, // `protected
47,412, // `public
48,1543, // `short
49,1146, // `static
50,1581, // `strictfp
51,1420, // `switch
52,952, // `synchronized
53,650, // `throw
54,1456, // `throws
55,170, // `transient
56,116, // `try
57,1360, // `volatile
88,1305, // "b"
90,1497, // "l"
91,512, // "e"
92,1139, // "a"
93,1169, // "n"
96,1046, // "r"
98,1465, // "c"
99,1051, // "s"
101,440, // "t"
102,1559, // "d"
103,138, // "f"
104,617, // "i"
105,1052, // "w"
107,267, // "p"
109,1274, // "v"
112,1212, // "g"
  }
,
{ // state 339
0x80000000|1392, // match move
0x80000000|1554, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 340
177,MIN_REDUCTION+325, // $NT
  }
,
{ // state 341
0x80000000|814, // match move
0x80000000|777, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 342
2,1352, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 343
177,MIN_REDUCTION+154, // $NT
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 344
0x80000000|806, // match move
0x80000000|319, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 345
177,MIN_REDUCTION+162, // $NT
  }
,
{ // state 346
0x80000000|1021, // match move
0x80000000|1265, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 347
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+130, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+130, // $
MIN_REDUCTION+130, // $NT
  }
,
{ // state 348
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 349
0x80000000|85, // match move
0x80000000|1023, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 350
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+214, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+214, // $
MIN_REDUCTION+214, // $NT
  }
,
{ // state 351
98,1582, // "c"
  }
,
{ // state 352
2,466, // ws*
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 353
91,162, // "e"
  }
,
{ // state 354
101,1255, // "t"
  }
,
{ // state 355
-1, // $$start
-1, // start
1276, // ws*
-1, // $$0
MIN_REDUCTION+167, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+167, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+167, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+167, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+167, // "u"
267, // "p"
MIN_REDUCTION+167, // "h"
1274, // "v"
MIN_REDUCTION+167, // "y"
MIN_REDUCTION+167, // "m"
1212, // "g"
MIN_REDUCTION+167, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+167, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+167, // {"1".."9"}
MIN_REDUCTION+167, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+167, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 356
0x80000000|816, // match move
0x80000000|1591, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 357
MIN_REDUCTION+348, // (default reduction)
  }
,
{ // state 358
0x80000000|1171, // match move
0x80000000|186, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 359
96,1016, // "r"
  }
,
{ // state 360
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 361
0x80000000|1, // match move
0x80000000|1167, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 362
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 363
0x80000000|70, // match move
0x80000000|446, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 364
177,MIN_REDUCTION+208, // $NT
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 365
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 366
0x80000000|547, // match move
0x80000000|334, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 367
177,MIN_REDUCTION+317, // $NT
MIN_REDUCTION+317, // (default reduction)
  }
,
{ // state 368
102,71, // "d"
  }
,
{ // state 369
-1, // $$start
-1, // start
514, // ws*
-1, // $$0
MIN_REDUCTION+116, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+116, // "o"
1497, // "l"
615, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+116, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+116, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+116, // "u"
267, // "p"
MIN_REDUCTION+116, // "h"
1274, // "v"
MIN_REDUCTION+116, // "y"
MIN_REDUCTION+116, // "m"
1212, // "g"
MIN_REDUCTION+116, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+116, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+116, // {"1".."9"}
MIN_REDUCTION+116, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+116, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 370
0x80000000|1584, // match move
0x80000000|177, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 371
0x80000000|884, // match move
0x80000000|294, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 372
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 373
0x80000000|583, // match move
0x80000000|1185, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 374
0x80000000|1461, // match move
0x80000000|216, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 375
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 376
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 377
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 378
0x80000000|891, // match move
0x80000000|863, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 379
177,MIN_REDUCTION+181, // $NT
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 380
0x80000000|1, // match move
0x80000000|609, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 381
92,1473, // "a"
106,414, // "u"
110,1374, // "y"
  }
,
{ // state 382
0x80000000|685, // match move
0x80000000|280, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 383
0x80000000|306, // match move
0x80000000|1572, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 384
2,907, // ws*
150,403, // $$2
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 385
0x80000000|635, // match move
0x80000000|937, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 386
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 387
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 388
-1, // $$start
-1, // start
568, // ws*
-1, // $$0
MIN_REDUCTION+209, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+209, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+209, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+209, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+209, // "u"
267, // "p"
MIN_REDUCTION+209, // "h"
1274, // "v"
MIN_REDUCTION+209, // "y"
MIN_REDUCTION+209, // "m"
1212, // "g"
MIN_REDUCTION+209, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+209, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+209, // {"1".."9"}
MIN_REDUCTION+209, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+209, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 389
99,361, // "s"
  }
,
{ // state 390
0x80000000|113, // match move
0x80000000|699, // no-match move
0x80000000|890, // NT-test-match state for multiCommentContent
  }
,
{ // state 391
0x80000000|157, // match move
0x80000000|1048, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 392
0x80000000|960, // match move
0x80000000|1501, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 393
177,MIN_REDUCTION+189, // $NT
  }
,
{ // state 394
0x80000000|1434, // match move
0x80000000|1182, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 395
0x80000000|1219, // match move
0x80000000|29, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 396
4,1190, // token
5,91, // `boolean
6,1280, // `class
7,1410, // `extends
8,1607, // `void
9,607, // `int
10,1247, // `while
11,301, // `if
12,1510, // `else
13,142, // `for
14,782, // `break
15,667, // `this
16,757, // `false
17,283, // `true
18,1469, // `super
19,561, // `null
20,1353, // `return
21,46, // `instanceof
22,372, // `new
23,549, // `abstract
24,877, // `assert
25,400, // `byte
26,515, // `case
27,645, // `catch
28,1337, // `char
29,18, // `const
30,130, // `continue
31,289, // `default
32,795, // `do
33,14, // `double
34,230, // `enum
35,1599, // `final
36,1418, // `finally
37,484, // `float
38,31, // `goto
39,796, // `implements
40,141, // `import
41,762, // `interface
42,1041, // `long
43,612, // `native
44,1066, // `package
45,524, // `private
46,633, // `protected
47,885, // `public
48,1078, // `short
49,1239, // `static
50,1193, // `strictfp
51,1118, // `switch
52,584, // `synchronized
53,553, // `throw
54,1040, // `throws
55,304, // `transient
56,791, // `try
57,1295, // `volatile
  }
,
{ // state 397
91,1062, // "e"
  }
,
{ // state 398
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 399
0x80000000|928, // match move
0x80000000|409, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 400
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 401
177,MIN_REDUCTION+201, // $NT
  }
,
{ // state 402
0x80000000|915, // match move
0x80000000|922, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 403
MIN_REDUCTION+313, // (default reduction)
  }
,
{ // state 404
0x80000000|700, // match move
0x80000000|752, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 405
96,1042, // "r"
  }
,
{ // state 406
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 407
0x80000000|622, // match move
0x80000000|1422, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 408
-1, // $$start
-1, // start
923, // ws*
-1, // $$0
MIN_REDUCTION+131, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+131, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+131, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+131, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+131, // "u"
267, // "p"
MIN_REDUCTION+131, // "h"
1274, // "v"
MIN_REDUCTION+131, // "y"
MIN_REDUCTION+131, // "m"
1212, // "g"
MIN_REDUCTION+131, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+131, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+131, // {"1".."9"}
MIN_REDUCTION+131, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+131, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 409
0x80000000|231, // match move
0x80000000|288, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 410
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+184, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+184, // $
MIN_REDUCTION+184, // $NT
  }
,
{ // state 411
0x80000000|659, // match move
0x80000000|595, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 412
177,MIN_REDUCTION+126, // $NT
  }
,
{ // state 413
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 414
91,695, // "e"
  }
,
{ // state 415
132,305, // "|"
  }
,
{ // state 416
0x80000000|1531, // match move
0x80000000|1205, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 417
0x80000000|396, // match move
0x80000000|574, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 418
0x80000000|1222, // match move
0x80000000|521, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 419
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 420
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+306, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+306, // $
-1, // $NT
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
{ // state 421
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 422
3,1234, // $$0
4,104, // token
5,91, // `boolean
6,1280, // `class
7,1410, // `extends
8,1607, // `void
9,607, // `int
10,1247, // `while
11,301, // `if
12,1510, // `else
13,142, // `for
14,782, // `break
15,667, // `this
16,757, // `false
17,283, // `true
18,1469, // `super
19,561, // `null
20,1353, // `return
21,46, // `instanceof
22,372, // `new
23,549, // `abstract
24,877, // `assert
25,400, // `byte
26,515, // `case
27,645, // `catch
28,1337, // `char
29,18, // `const
30,130, // `continue
31,289, // `default
32,795, // `do
33,14, // `double
34,230, // `enum
35,1599, // `final
36,1418, // `finally
37,484, // `float
38,31, // `goto
39,796, // `implements
40,141, // `import
41,762, // `interface
42,1041, // `long
43,612, // `native
44,1066, // `package
45,524, // `private
46,633, // `protected
47,885, // `public
48,1078, // `short
49,1239, // `static
50,1193, // `strictfp
51,1118, // `switch
52,584, // `synchronized
53,553, // `throw
54,1040, // `throws
55,304, // `transient
56,791, // `try
57,1295, // `volatile
174,764, // token*
  }
,
{ // state 423
0x80000000|628, // match move
0x80000000|443, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 424
0x80000000|1201, // match move
0x80000000|711, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 425
0x80000000|125, // match move
0x80000000|285, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 426
0x80000000|1389, // match move
0x80000000|1540, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 427
96,1024, // "r"
  }
,
{ // state 428
177,MIN_REDUCTION+105, // $NT
  }
,
{ // state 429
2,783, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 430
0x80000000|1, // match move
0x80000000|943, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 431
0x80000000|1, // match move
0x80000000|1326, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 432
-1, // $$start
-1, // start
601, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+294, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+294, // $
-1, // $NT
  }
,
{ // state 433
MIN_REDUCTION+309, // (default reduction)
  }
,
{ // state 434
2,907, // ws*
149,145, // idChar**
150,147, // $$2
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
170,738, // idChar*
MIN_REDUCTION+316, // (default reduction)
  }
,
{ // state 435
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+91, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+91, // $
MIN_REDUCTION+91, // $NT
  }
,
{ // state 436
177,MIN_REDUCTION+147, // $NT
  }
,
{ // state 437
0x80000000|149, // match move
0x80000000|979, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 438
0x80000000|3, // match move
0x80000000|593, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 439
0x80000000|941, // match move
0x80000000|1488, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 440
96,381, // "r"
108,542, // "h"
  }
,
{ // state 441
0x80000000|1537, // match move
0x80000000|1609, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 442
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 443
-1, // $$start
-1, // start
411, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+250, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+250, // $
-1, // $NT
  }
,
{ // state 444
177,MIN_REDUCTION+322, // $NT
  }
,
{ // state 445
0x80000000|360, // match move
0x80000000|128, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 446
-1, // $$start
-1, // start
1103, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+302, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+302, // $
-1, // $NT
  }
,
{ // state 447
2,1462, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 448
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 449
0x80000000|900, // match move
0x80000000|718, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 450
98,896, // "c"
  }
,
{ // state 451
0x80000000|1450, // match move
0x80000000|453, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 452
-1, // $$start
-1, // start
163, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+276, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+276, // $
-1, // $NT
  }
,
{ // state 453
0x80000000|448, // match move
0x80000000|582, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 454
99,257, // "s"
  }
,
{ // state 455
-1, // $$start
-1, // start
721, // ws*
-1, // $$0
MIN_REDUCTION+113, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+113, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+113, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+113, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+113, // "u"
267, // "p"
MIN_REDUCTION+113, // "h"
1274, // "v"
MIN_REDUCTION+113, // "y"
MIN_REDUCTION+113, // "m"
1212, // "g"
MIN_REDUCTION+113, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+113, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+113, // {"1".."9"}
MIN_REDUCTION+113, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+113, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 456
177,MIN_REDUCTION+88, // $NT
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 457
2,737, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 458
93,691, // "n"
  }
,
{ // state 459
0x80000000|83, // match move
0x80000000|1213, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 460
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 461
-1, // $$start
-1, // start
35, // ws*
-1, // $$0
MIN_REDUCTION+242, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+242, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+242, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+242, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+242, // "u"
267, // "p"
MIN_REDUCTION+242, // "h"
1274, // "v"
MIN_REDUCTION+242, // "y"
MIN_REDUCTION+242, // "m"
1212, // "g"
MIN_REDUCTION+242, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+242, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+242, // {"1".."9"}
MIN_REDUCTION+242, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+242, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 462
153,367, // eol
168,1161, // {10}
169,707, // {13}
  }
,
{ // state 463
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+100, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+100, // $
MIN_REDUCTION+100, // $NT
  }
,
{ // state 464
101,1601, // "t"
  }
,
{ // state 465
0x80000000|1357, // match move
0x80000000|924, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 466
0x80000000|1072, // match move
0x80000000|1231, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 467
0x80000000|207, // match move
0x80000000|1515, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 468
93,253, // "n"
  }
,
{ // state 469
177,MIN_REDUCTION+195, // $NT
  }
,
{ // state 470
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 471
101,1064, // "t"
  }
,
{ // state 472
0x80000000|144, // match move
0x80000000|1403, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 473
0x80000000|800, // match move
0x80000000|971, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 474
91,966, // "e"
  }
,
{ // state 475
177,MIN_REDUCTION+193, // $NT
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 476
0x80000000|1235, // match move
0x80000000|1553, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 477
0x80000000|1349, // match move
0x80000000|1175, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 478
1,528, // start
2,150, // ws*
3,1288, // $$0
4,104, // token
58,581, // `!
59,1069, // `!=
60,1084, // `%
61,1203, // `&&
63,544, // `(
64,1089, // `)
65,419, // `{
66,1346, // `}
67,1342, // `-
68,494, // `+
69,290, // `=
70,398, // `==
71,933, // `[
72,993, // `]
73,1378, // `||
74,329, // `<
75,666, // `<=
76,1370, // `,
77,200, // `>
78,778, // `>=
79,365, // `.
80,299, // `;
81,1525, // `++
82,881, // `--
83,682, // `/
84,693, // ID
85,387, // INTLIT
86,1099, // STRINGLIT
87,537, // CHARLIT
134,958, // "0"
148,962, // letter
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
174,764, // token*
  }
,
{ // state 479
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 480
-1, // $$start
-1, // start
1592, // ws*
-1, // $$0
MIN_REDUCTION+206, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+206, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+206, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+206, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+206, // "u"
267, // "p"
MIN_REDUCTION+206, // "h"
1274, // "v"
MIN_REDUCTION+206, // "y"
MIN_REDUCTION+206, // "m"
1212, // "g"
MIN_REDUCTION+206, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+206, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+206, // {"1".."9"}
MIN_REDUCTION+206, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+206, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 481
2,1530, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 482
89,1406, // "o"
  }
,
{ // state 483
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 484
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 485
105,51, // "w"
  }
,
{ // state 486
177,MIN_REDUCTION+196, // $NT
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 487
177,MIN_REDUCTION+165, // $NT
  }
,
{ // state 488
177,MIN_REDUCTION+117, // $NT
  }
,
{ // state 489
2,1149, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 490
MIN_REDUCTION+353, // (default reduction)
  }
,
{ // state 491
0x80000000|1, // match move
0x80000000|566, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 492
MIN_REDUCTION+303, // (default reduction)
  }
,
{ // state 493
2,514, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 494
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 495
2,211, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 496
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 497
0x80000000|703, // match move
0x80000000|1126, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 498
102,600, // "d"
  }
,
{ // state 499
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 500
-1, // $$start
-1, // start
20, // ws*
-1, // $$0
MIN_REDUCTION+122, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+122, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+122, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+122, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+122, // "u"
267, // "p"
MIN_REDUCTION+122, // "h"
1274, // "v"
MIN_REDUCTION+122, // "y"
MIN_REDUCTION+122, // "m"
1212, // "g"
MIN_REDUCTION+122, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+122, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+122, // {"1".."9"}
MIN_REDUCTION+122, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+122, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 501
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 502
0x80000000|1, // match move
0x80000000|1549, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 503
0x80000000|1070, // match move
0x80000000|1054, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 504
0x80000000|1261, // match move
0x80000000|1152, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 505
-1, // $$start
-1, // start
1049, // ws*
-1, // $$0
MIN_REDUCTION+197, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+197, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+197, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+197, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+197, // "u"
267, // "p"
MIN_REDUCTION+197, // "h"
1274, // "v"
MIN_REDUCTION+197, // "y"
MIN_REDUCTION+197, // "m"
1212, // "g"
MIN_REDUCTION+197, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+197, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+197, // {"1".."9"}
MIN_REDUCTION+197, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+197, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 506
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+196, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+196, // $
MIN_REDUCTION+196, // $NT
  }
,
{ // state 507
2,211, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 508
2,989, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 509
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 510
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 511
177,MIN_REDUCTION+329, // $NT
  }
,
{ // state 512
90,719, // "l"
93,328, // "n"
100,1436, // "x"
  }
,
{ // state 513
-1, // $$start
-1, // start
335, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+288, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+288, // $
-1, // $NT
  }
,
{ // state 514
0x80000000|314, // match move
0x80000000|399, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 515
MIN_REDUCTION+26, // (default reduction)
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+148, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+148, // $
MIN_REDUCTION+148, // $NT
  }
,
{ // state 519
-1, // $$start
-1, // start
1541, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+296, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+296, // $
-1, // $NT
  }
,
{ // state 520
0x80000000|486, // match move
0x80000000|506, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 521
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+217, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+217, // $
MIN_REDUCTION+217, // $NT
  }
,
{ // state 522
MIN_REDUCTION+332, // (default reduction)
  }
,
{ // state 523
0x80000000|874, // match move
0x80000000|675, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 524
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 525
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 526
0x80000000|240, // match move
0x80000000|730, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 527
117,1053, // "*"
156,1248, // commentEnd
  }
,
{ // state 528
176,MIN_REDUCTION+0, // $
  }
,
{ // state 529
0x80000000|1, // match move
0x80000000|1322, // no-match move
// T-test match for "/":
116,
  }
,
{ // state 530
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 531
0x80000000|1313, // match move
0x80000000|1341, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 532
117,1561, // "*"
  }
,
{ // state 533
0x80000000|1217, // match move
0x80000000|724, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 534
0x80000000|1366, // match move
0x80000000|651, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 535
2,1269, // ws*
58,581, // `!
59,1069, // `!=
60,1084, // `%
61,1203, // `&&
63,544, // `(
64,1089, // `)
65,419, // `{
66,1346, // `}
67,1342, // `-
68,494, // `+
69,290, // `=
70,398, // `==
71,933, // `[
72,993, // `]
73,1378, // `||
74,329, // `<
75,666, // `<=
76,1370, // `,
77,200, // `>
78,778, // `>=
79,365, // `.
80,299, // `;
81,1525, // `++
82,881, // `--
83,682, // `/
84,693, // ID
86,1099, // STRINGLIT
87,537, // CHARLIT
88,841, // "b"
89,841, // "o"
90,841, // "l"
91,841, // "e"
92,841, // "a"
93,841, // "n"
96,841, // "r"
97,841, // "k"
98,841, // "c"
99,841, // "s"
100,841, // "x"
101,841, // "t"
102,841, // "d"
103,841, // "f"
104,841, // "i"
105,841, // "w"
106,841, // "u"
107,841, // "p"
108,841, // "h"
109,841, // "v"
110,841, // "y"
111,841, // "m"
112,841, // "g"
113,841, // "z"
114,1245, // "!"
115,820, // "="
116,1511, // "/"
118,1009, // "%"
119,1548, // "&"
120,254, // "("
121,653, // ")"
122,1006, // "+"
123,358, // ","
124,1113, // "-"
125,747, // "."
126,683, // ";"
127,1194, // "<"
128,438, // ">"
129,1600, // "["
130,259, // "]"
131,994, // "{"
132,415, // "|"
133,1297, // "}"
136,841, // "X"
140,1316, // '"'
146,868, // "'"
148,962, // letter
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
162,841, // {"A".."W" "Y".."Z" "j" "q"}
164,878, // " "
166,830, // ws
167,878, // {9}
168,1161, // {10}
169,707, // {13}
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 536
88,1323, // "b"
89,1323, // "o"
90,1323, // "l"
91,1323, // "e"
92,1323, // "a"
93,1323, // "n"
96,1323, // "r"
97,1323, // "k"
98,1323, // "c"
99,1323, // "s"
100,1323, // "x"
101,1323, // "t"
102,1323, // "d"
103,1323, // "f"
104,1323, // "i"
105,1323, // "w"
106,1323, // "u"
107,1323, // "p"
108,1323, // "h"
109,1323, // "v"
110,1323, // "y"
111,1323, // "m"
112,1323, // "g"
113,1323, // "z"
114,1323, // "!"
115,1323, // "="
116,1323, // "/"
117,1323, // "*"
118,1323, // "%"
119,1323, // "&"
120,1323, // "("
121,1323, // ")"
122,1323, // "+"
123,1323, // ","
124,1323, // "-"
125,1323, // "."
126,1323, // ";"
127,1323, // "<"
128,1323, // ">"
129,1323, // "["
130,1323, // "]"
131,1323, // "{"
132,1323, // "|"
133,1323, // "}"
134,1323, // "0"
135,1323, // {"1".."9"}
136,1323, // "X"
140,1323, // '"'
141,1492, // stringLiteral
143,127, // stringChar
145,1323, // "\"
146,1323, // "'"
147,1429, // printable
161,1323, // "_"
162,1323, // {"A".."W" "Y".."Z" "j" "q"}
163,1323, // {"#".."$" ":" "?".."@" "^" "`" "~"}
164,1323, // " "
165,631, // stringChar**
171,1033, // stringChar*
  }
,
{ // state 537
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 538
0x80000000|1029, // match move
0x80000000|535, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 539
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 540
0x80000000|913, // match move
0x80000000|1108, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 541
0x80000000|1077, // match move
0x80000000|1109, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 542
96,482, // "r"
104,831, // "i"
  }
,
{ // state 543
2,1530, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 544
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 545
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 546
2,53, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 547
2,1012, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 548
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+124, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+124, // $
MIN_REDUCTION+124, // $NT
  }
,
{ // state 549
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 550
0x80000000|1345, // match move
0x80000000|1596, // no-match move
0x80000000|209, // NT-test-match state for printable
  }
,
{ // state 551
0x80000000|749, // match move
0x80000000|769, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 552
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 553
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 554
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 555
2,373, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 556
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 557
106,591, // "u"
  }
,
{ // state 558
98,1545, // "c"
  }
,
{ // state 559
0x80000000|1427, // match move
0x80000000|198, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 560
2,1541, // ws*
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 561
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 562
0x80000000|422, // match move
0x80000000|855, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 563
0x80000000|1047, // match move
0x80000000|435, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 564
-1, // $$start
-1, // start
989, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
-1, // `=
-1, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
MIN_REDUCTION+278, // "="
1511, // "/"
MIN_REDUCTION+278, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+278, // $
-1, // $NT
  }
,
{ // state 565
0x80000000|169, // match move
0x80000000|452, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 566
0x80000000|1101, // match move
0x80000000|1188, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 567
177,MIN_REDUCTION+169, // $NT
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 568
0x80000000|106, // match move
0x80000000|1372, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 569
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 570
0x80000000|1241, // match move
0x80000000|681, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 571
0x80000000|1, // match move
0x80000000|1092, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 572
101,264, // "t"
  }
,
{ // state 573
0x80000000|190, // match move
0x80000000|883, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 574
4,1190, // token
58,581, // `!
59,1069, // `!=
60,1084, // `%
61,1203, // `&&
63,544, // `(
64,1089, // `)
65,419, // `{
66,1346, // `}
67,1342, // `-
68,494, // `+
69,290, // `=
70,398, // `==
71,933, // `[
72,993, // `]
73,1378, // `||
74,329, // `<
75,666, // `<=
76,1370, // `,
77,200, // `>
78,778, // `>=
79,365, // `.
80,299, // `;
81,1525, // `++
82,881, // `--
83,682, // `/
84,693, // ID
85,387, // INTLIT
86,1099, // STRINGLIT
87,537, // CHARLIT
134,958, // "0"
148,962, // letter
  }
,
{ // state 575
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 576
92,36, // "a"
  }
,
{ // state 577
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 578
96,1419, // "r"
  }
,
{ // state 579
0x80000000|92, // match move
0x80000000|540, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 580
91,827, // "e"
  }
,
{ // state 581
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 582
0x80000000|1228, // match move
0x80000000|797, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 583
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 584
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 585
177,MIN_REDUCTION+198, // $NT
  }
,
{ // state 586
101,1133, // "t"
105,324, // "w"
106,323, // "u"
108,1325, // "h"
110,1332, // "y"
  }
,
{ // state 587
0x80000000|1, // match move
0x80000000|291, // no-match move
// T-test match for {'"' "\"}:
140,
145,
  }
,
{ // state 588
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 589
-1, // $$start
-1, // start
880, // ws*
-1, // $$0
MIN_REDUCTION+110, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+110, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+110, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+110, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+110, // "u"
267, // "p"
MIN_REDUCTION+110, // "h"
1274, // "v"
MIN_REDUCTION+110, // "y"
MIN_REDUCTION+110, // "m"
1212, // "g"
MIN_REDUCTION+110, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+110, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+110, // {"1".."9"}
MIN_REDUCTION+110, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+110, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 590
0x80000000|457, // match move
0x80000000|1495, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 591
88,870, // "b"
  }
,
{ // state 592
0x80000000|119, // match move
0x80000000|374, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 593
0x80000000|1145, // match move
0x80000000|407, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 594
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 595
0x80000000|1037, // match move
0x80000000|195, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 596
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 597
-1, // $$start
-1, // start
592, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
-1, // `=
-1, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
MIN_REDUCTION+248, // "="
1511, // "/"
MIN_REDUCTION+248, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+248, // $
-1, // $NT
  }
,
{ // state 598
0x80000000|247, // match move
0x80000000|1482, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 599
0x80000000|67, // match move
0x80000000|886, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 600
0x80000000|1, // match move
0x80000000|946, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 601
0x80000000|376, // match move
0x80000000|1409, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 602
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 603
2,1352, // ws*
MIN_REDUCTION+290, // (default reduction)
  }
,
{ // state 604
96,576, // "r"
  }
,
{ // state 605
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 606
177,MIN_REDUCTION+123, // $NT
  }
,
{ // state 607
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 608
0x80000000|1, // match move
0x80000000|860, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 609
0x80000000|429, // match move
0x80000000|997, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 610
2,1049, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 611
111,801, // "m"
  }
,
{ // state 612
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 613
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 614
-1, // $$start
-1, // start
373, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+284, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+284, // $
-1, // $NT
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
{ // state 615
90,719, // "l"
93,328, // "n"
96,1042, // "r"
100,1436, // "x"
  }
,
{ // state 616
0x80000000|1529, // match move
0x80000000|857, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 617
93,1165, // "n"
103,95, // "f"
111,1061, // "m"
  }
,
{ // state 618
88,1076, // "b"
89,1076, // "o"
90,1076, // "l"
91,1076, // "e"
92,1076, // "a"
93,1076, // "n"
96,1076, // "r"
97,1076, // "k"
98,1076, // "c"
99,1076, // "s"
100,1076, // "x"
101,1076, // "t"
102,1076, // "d"
103,1076, // "f"
104,1076, // "i"
105,1076, // "w"
106,1076, // "u"
107,1076, // "p"
108,1076, // "h"
109,1076, // "v"
110,1076, // "y"
111,1076, // "m"
112,1076, // "g"
113,1076, // "z"
114,1076, // "!"
115,1076, // "="
116,1076, // "/"
117,1076, // "*"
118,1076, // "%"
119,1076, // "&"
120,1076, // "("
121,1076, // ")"
122,1076, // "+"
123,1076, // ","
124,1076, // "-"
125,1076, // "."
126,1076, // ";"
127,1076, // "<"
128,1076, // ">"
129,1076, // "["
130,1076, // "]"
131,1076, // "{"
132,1076, // "|"
133,1076, // "}"
134,1076, // "0"
135,1076, // {"1".."9"}
136,1076, // "X"
140,1076, // '"'
145,1076, // "\"
146,1076, // "'"
147,910, // printable
161,1076, // "_"
162,1076, // {"A".."W" "Y".."Z" "j" "q"}
163,1076, // {"#".."$" ":" "?".."@" "^" "`" "~"}
164,1076, // " "
  }
,
{ // state 619
177,MIN_REDUCTION+157, // $NT
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 620
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 621
0x80000000|1097, // match move
0x80000000|219, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 622
2,466, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 623
0x80000000|1, // match move
0x80000000|268, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 624
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 625
0x80000000|1571, // match move
0x80000000|311, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 626
177,MIN_REDUCTION+180, // $NT
  }
,
{ // state 627
0x80000000|1298, // match move
0x80000000|432, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 628
2,411, // ws*
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 629
0x80000000|670, // match move
0x80000000|969, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 630
2,194, // ws*
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 631
MIN_REDUCTION+336, // (default reduction)
  }
,
{ // state 632
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 633
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 634
0x80000000|1, // match move
0x80000000|472, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 635
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 636
0x80000000|292, // match move
0x80000000|1585, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 637
99,775, // "s"
  }
,
{ // state 638
0x80000000|490, // match move
0x80000000|266, // no-match move
0x80000000|1164, // NT-test-match state for digit
  }
,
{ // state 639
0x80000000|710, // match move
0x80000000|773, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 640
0x80000000|164, // match move
0x80000000|1330, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 641
4,1190, // token
5,91, // `boolean
6,1280, // `class
7,1410, // `extends
8,1607, // `void
9,607, // `int
10,1247, // `while
11,301, // `if
12,1510, // `else
13,142, // `for
14,782, // `break
15,667, // `this
16,757, // `false
17,283, // `true
18,1469, // `super
19,561, // `null
20,1353, // `return
21,46, // `instanceof
22,372, // `new
23,549, // `abstract
24,877, // `assert
25,400, // `byte
26,515, // `case
27,645, // `catch
28,1337, // `char
29,18, // `const
30,130, // `continue
31,289, // `default
32,795, // `do
33,14, // `double
34,230, // `enum
35,1599, // `final
36,1418, // `finally
37,484, // `float
38,31, // `goto
39,796, // `implements
40,141, // `import
41,762, // `interface
42,1041, // `long
43,612, // `native
44,1066, // `package
45,524, // `private
46,633, // `protected
47,885, // `public
48,1078, // `short
49,1239, // `static
50,1193, // `strictfp
51,1118, // `switch
52,584, // `synchronized
53,553, // `throw
54,1040, // `throws
55,304, // `transient
56,791, // `try
57,1295, // `volatile
88,1305, // "b"
90,1497, // "l"
91,512, // "e"
92,1139, // "a"
93,1169, // "n"
96,1046, // "r"
98,1465, // "c"
99,1051, // "s"
101,440, // "t"
102,1559, // "d"
103,138, // "f"
104,617, // "i"
105,1052, // "w"
107,267, // "p"
109,1274, // "v"
112,1212, // "g"
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 642
2,1137, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 643
2,1150, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 644
2,341, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 645
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 646
0x80000000|1258, // match move
0x80000000|1260, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 647
90,893, // "l"
  }
,
{ // state 648
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 649
2,639, // ws*
153,1156, // eol
164,878, // " "
166,830, // ws
167,878, // {9}
168,1161, // {10}
169,707, // {13}
MIN_REDUCTION+274, // (default reduction)
  }
,
{ // state 650
177,MIN_REDUCTION+234, // $NT
  }
,
{ // state 651
0x80000000|1279, // match move
0x80000000|45, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 652
0x80000000|1117, // match move
0x80000000|858, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 653
0x80000000|72, // match move
0x80000000|383, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 654
MIN_REDUCTION+325, // (default reduction)
  }
,
{ // state 655
88,841, // "b"
89,841, // "o"
90,841, // "l"
91,841, // "e"
92,841, // "a"
93,841, // "n"
94,982, // idChar
96,841, // "r"
97,841, // "k"
98,841, // "c"
99,841, // "s"
100,841, // "x"
101,841, // "t"
102,841, // "d"
103,841, // "f"
104,841, // "i"
105,841, // "w"
106,841, // "u"
107,841, // "p"
108,841, // "h"
109,841, // "v"
110,841, // "y"
111,841, // "m"
112,841, // "g"
113,841, // "z"
134,906, // "0"
135,906, // {"1".."9"}
136,841, // "X"
148,183, // letter
160,439, // digit
161,1407, // "_"
162,841, // {"A".."W" "Y".."Z" "j" "q"}
  }
,
{ // state 656
2,636, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 657
0x80000000|228, // match move
0x80000000|423, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 658
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 659
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 660
0x80000000|1550, // match move
0x80000000|702, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 661
0x80000000|1, // match move
0x80000000|1401, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 662
-1, // $$start
-1, // start
449, // ws*
-1, // $$0
MIN_REDUCTION+236, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+236, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+236, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+236, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+236, // "u"
267, // "p"
MIN_REDUCTION+236, // "h"
1274, // "v"
MIN_REDUCTION+236, // "y"
MIN_REDUCTION+236, // "m"
1212, // "g"
MIN_REDUCTION+236, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+236, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+236, // {"1".."9"}
MIN_REDUCTION+236, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+236, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 663
124,1233, // "-"
  }
,
{ // state 664
0x80000000|1, // match move
0x80000000|590, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 665
0x80000000|987, // match move
0x80000000|1004, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 666
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 667
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 668
177,MIN_REDUCTION+160, // $NT
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 669
0x80000000|1195, // match move
0x80000000|6, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 670
2,839, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 671
0x80000000|1, // match move
0x80000000|1246, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 672
0x80000000|139, // match move
0x80000000|657, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 673
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 674
0x80000000|507, // match move
0x80000000|1369, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 675
0x80000000|517, // match move
0x80000000|189, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 676
-1, // $$start
-1, // start
19, // ws*
-1, // $$0
MIN_REDUCTION+119, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+119, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+119, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+119, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+119, // "u"
267, // "p"
MIN_REDUCTION+119, // "h"
1274, // "v"
MIN_REDUCTION+119, // "y"
MIN_REDUCTION+119, // "m"
1212, // "g"
MIN_REDUCTION+119, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+119, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+119, // {"1".."9"}
MIN_REDUCTION+119, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+119, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+119, // $
MIN_REDUCTION+119, // $NT
  }
,
{ // state 677
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+145, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+145, // $
MIN_REDUCTION+145, // $NT
  }
,
{ // state 678
0x80000000|1045, // match move
0x80000000|463, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 679
0x80000000|1249, // match move
0x80000000|1452, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 680
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 681
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+238, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+238, // $
MIN_REDUCTION+238, // $NT
  }
,
{ // state 682
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 683
0x80000000|740, // match move
0x80000000|918, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 684
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+244, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+244, // $
MIN_REDUCTION+244, // $NT
  }
,
{ // state 685
177,MIN_REDUCTION+223, // $NT
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 686
0x80000000|1, // match move
0x80000000|559, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 687
177,MIN_REDUCTION+327, // $NT
MIN_REDUCTION+327, // (default reduction)
  }
,
{ // state 688
88,1306, // "b"
89,1306, // "o"
90,1306, // "l"
91,1306, // "e"
92,1306, // "a"
93,1306, // "n"
96,1306, // "r"
97,1306, // "k"
98,1306, // "c"
99,1306, // "s"
100,1306, // "x"
101,1306, // "t"
102,1306, // "d"
103,1306, // "f"
104,1306, // "i"
105,1306, // "w"
106,1306, // "u"
107,1306, // "p"
108,1306, // "h"
109,1306, // "v"
110,1306, // "y"
111,1306, // "m"
112,1306, // "g"
113,1306, // "z"
134,232, // "0"
135,232, // {"1".."9"}
136,1306, // "X"
148,511, // letter
160,811, // digit
161,744, // "_"
162,1306, // {"A".."W" "Y".."Z" "j" "q"}
  }
,
{ // state 689
2,1526, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 690
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+241, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+241, // $
MIN_REDUCTION+241, // $NT
  }
,
{ // state 691
104,1604, // "i"
  }
,
{ // state 692
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+285, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+285, // $
-1, // $NT
  }
,
{ // state 693
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 694
0x80000000|1013, // match move
0x80000000|1130, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 695
0x80000000|1, // match move
0x80000000|199, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 696
0x80000000|654, // match move
0x80000000|178, // no-match move
0x80000000|890, // NT-test-match state for multiCommentContent
  }
,
{ // state 697
0x80000000|833, // match move
0x80000000|269, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 698
100,492, // "x"
134,22, // "0"
135,22, // {"1".."9"}
136,492, // "X"
138,1424, // `x
139,1020, // digit++
160,638, // digit
175,122, // digit+
  }
,
{ // state 699
MIN_REDUCTION+323, // (default reduction)
  }
,
{ // state 700
2,579, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 701
0x80000000|326, // match move
0x80000000|333, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 702
-1, // $$start
-1, // start
341, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+258, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+258, // $
-1, // $NT
  }
,
{ // state 703
2,815, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+239, // (default reduction)
  }
,
{ // state 704
0x80000000|1, // match move
0x80000000|1385, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 705
177,MIN_REDUCTION+144, // $NT
  }
,
{ // state 706
0x80000000|799, // match move
0x80000000|225, // no-match move
// T-test match for 10:
168,
  }
,
{ // state 707
0x80000000|1463, // match move
0x80000000|911, // no-match move
// T-test match for 10:
168,
  }
,
{ // state 708
116,56, // "/"
154,696, // commentStart
157,1421, // multiCommentContent
  }
,
{ // state 709
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+166, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+166, // $
MIN_REDUCTION+166, // $NT
  }
,
{ // state 710
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 711
0x80000000|1223, // match move
0x80000000|947, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 712
0x80000000|1158, // match move
0x80000000|953, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 713
0x80000000|37, // match move
0x80000000|355, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 714
177,MIN_REDUCTION+186, // $NT
  }
,
{ // state 715
0x80000000|939, // match move
0x80000000|1129, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 716
0x80000000|876, // match move
0x80000000|1336, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 717
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 718
0x80000000|81, // match move
0x80000000|309, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 719
99,1503, // "s"
  }
,
{ // state 720
0x80000000|1324, // match move
0x80000000|1304, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 721
0x80000000|723, // match move
0x80000000|1415, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 722
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+127, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+127, // $
MIN_REDUCTION+127, // $NT
  }
,
{ // state 723
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 724
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+97, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+97, // $
MIN_REDUCTION+97, // $NT
  }
,
{ // state 725
MIN_REDUCTION+358, // (default reduction)
  }
,
{ // state 726
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 727
-1, // $$start
-1, // start
1137, // ws*
-1, // $$0
MIN_REDUCTION+218, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+218, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+218, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+218, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+218, // "u"
267, // "p"
MIN_REDUCTION+218, // "h"
1274, // "v"
MIN_REDUCTION+218, // "y"
MIN_REDUCTION+218, // "m"
1212, // "g"
MIN_REDUCTION+218, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+218, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+218, // {"1".."9"}
MIN_REDUCTION+218, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+218, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 728
177,MIN_REDUCTION+184, // $NT
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 729
0x80000000|751, // match move
0x80000000|1059, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 730
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+205, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+205, // $
MIN_REDUCTION+205, // $NT
  }
,
{ // state 731
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+199, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+199, // $
MIN_REDUCTION+199, // $NT
  }
,
{ // state 732
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 733
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 734
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+208, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+208, // $
MIN_REDUCTION+208, // $NT
  }
,
{ // state 735
177,MIN_REDUCTION+199, // $NT
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 736
-1, // $$start
-1, // start
1149, // ws*
-1, // $$0
MIN_REDUCTION+191, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+191, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+191, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+191, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+191, // "u"
267, // "p"
MIN_REDUCTION+191, // "h"
1274, // "v"
MIN_REDUCTION+191, // "y"
MIN_REDUCTION+191, // "m"
1212, // "g"
MIN_REDUCTION+191, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+191, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+191, // {"1".."9"}
MIN_REDUCTION+191, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+191, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 737
0x80000000|214, // match move
0x80000000|1282, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 738
0x80000000|655, // match move
0x80000000|99, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 739
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 740
2,163, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 741
0x80000000|972, // match move
0x80000000|1435, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 742
0x80000000|47, // match move
0x80000000|181, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 743
2,989, // ws*
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 744
177,MIN_REDUCTION+331, // $NT
  }
,
{ // state 745
177,MIN_REDUCTION+174, // $NT
  }
,
{ // state 746
177,MIN_REDUCTION+226, // $NT
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 747
0x80000000|158, // match move
0x80000000|1594, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 748
0x80000000|434, // match move
0x80000000|864, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 749
2,989, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+278, // (default reduction)
  }
,
{ // state 750
2,188, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 751
2,296, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 752
0x80000000|964, // match move
0x80000000|1229, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 753
0x80000000|496, // match move
0x80000000|1174, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 754
177,MIN_REDUCTION+99, // $NT
  }
,
{ // state 755
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 756
98,156, // "c"
  }
,
{ // state 757
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 758
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+297, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+297, // $
-1, // $NT
  }
,
{ // state 759
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 760
0x80000000|1432, // match move
0x80000000|1471, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 761
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 762
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 763
0x80000000|1439, // match move
0x80000000|1573, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 764
0x80000000|1451, // match move
0x80000000|1393, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 765
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 766
-1, // $$start
-1, // start
7, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+254, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+254, // $
-1, // $NT
  }
,
{ // state 767
MIN_REDUCTION+354, // (default reduction)
  }
,
{ // state 768
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 769
0x80000000|508, // match move
0x80000000|1001, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 770
-1, // $$start
-1, // start
1244, // ws*
-1, // $$0
MIN_REDUCTION+212, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+212, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+212, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+212, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+212, // "u"
267, // "p"
MIN_REDUCTION+212, // "h"
1274, // "v"
MIN_REDUCTION+212, // "y"
MIN_REDUCTION+212, // "m"
1212, // "g"
MIN_REDUCTION+212, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+212, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+212, // {"1".."9"}
MIN_REDUCTION+212, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+212, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 771
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 772
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 773
0x80000000|1381, // match move
0x80000000|65, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 774
2,694, // ws*
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 775
104,242, // "i"
  }
,
{ // state 776
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+283, // (default reduction)
  }
,
{ // state 777
0x80000000|1206, // match move
0x80000000|1142, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 778
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 779
MIN_REDUCTION+352, // (default reduction)
  }
,
{ // state 780
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 781
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 782
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 783
0x80000000|1498, // match move
0x80000000|909, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 784
-1, // $$start
-1, // start
424, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+260, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+260, // $
-1, // $NT
  }
,
{ // state 785
91,491, // "e"
  }
,
{ // state 786
122,763, // "+"
  }
,
{ // state 787
0x80000000|613, // match move
0x80000000|1390, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 788
91,1292, // "e"
  }
,
{ // state 789
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 790
0x80000000|567, // match move
0x80000000|210, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 791
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 792
-1, // $$start
-1, // start
694, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+365, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+365, // $
-1, // $NT
  }
,
{ // state 793
116,56, // "/"
154,696, // commentStart
157,260, // multiCommentContent
159,527, // multiCommentContent**
172,1090, // multiCommentContent*
  }
,
{ // state 794
0x80000000|1470, // match move
0x80000000|1371, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 795
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 796
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 797
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+94, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+94, // $
MIN_REDUCTION+94, // $NT
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
{ // state 798
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 799
168,1364, // {10}
  }
,
{ // state 800
2,1462, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 801
91,1289, // "e"
  }
,
{ // state 802
0x80000000|115, // match move
0x80000000|146, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 803
104,1216, // "i"
  }
,
{ // state 804
-1, // $$start
-1, // start
646, // ws*
-1, // $$0
MIN_REDUCTION+92, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+92, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+92, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+92, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+92, // "u"
267, // "p"
MIN_REDUCTION+92, // "h"
1274, // "v"
MIN_REDUCTION+92, // "y"
MIN_REDUCTION+92, // "m"
1212, // "g"
MIN_REDUCTION+92, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+92, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+92, // {"1".."9"}
MIN_REDUCTION+92, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+92, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 805
-1, // $$start
528, // start
150, // ws*
1288, // $$0
104, // token
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
-1, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
764, // token*
122, // digit+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 806
2,936, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 807
2,907, // ws*
150,403, // $$2
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+314, // (default reduction)
  }
,
{ // state 808
91,284, // "e"
  }
,
{ // state 809
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+277, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+277, // $
-1, // $NT
  }
,
{ // state 810
0x80000000|384, // match move
0x80000000|332, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 811
177,MIN_REDUCTION+330, // $NT
  }
,
{ // state 812
177,MIN_REDUCTION+150, // $NT
  }
,
{ // state 813
0x80000000|96, // match move
0x80000000|935, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 814
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 815
0x80000000|470, // match move
0x80000000|1380, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 816
177,MIN_REDUCTION+136, // $NT
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 817
2,426, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 818
-1, // $$start
-1, // start
1208, // ws*
-1, // $$0
MIN_REDUCTION+137, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+137, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+137, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+137, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+137, // "u"
267, // "p"
MIN_REDUCTION+137, // "h"
1274, // "v"
MIN_REDUCTION+137, // "y"
MIN_REDUCTION+137, // "m"
1212, // "g"
MIN_REDUCTION+137, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+137, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+137, // {"1".."9"}
MIN_REDUCTION+137, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+137, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 819
0x80000000|817, // match move
0x80000000|1339, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 820
0x80000000|78, // match move
0x80000000|729, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 821
MIN_REDUCTION+310, // (default reduction)
  }
,
{ // state 822
0x80000000|892, // match move
0x80000000|1065, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 823
177,MIN_REDUCTION+112, // $NT
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 824
2,7, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 825
0x80000000|1384, // match move
0x80000000|1086, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 826
2,880, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 827
96,34, // "r"
  }
,
{ // state 828
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 829
0x80000000|1499, // match move
0x80000000|461, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 830
177,MIN_REDUCTION+347, // $NT
MIN_REDUCTION+347, // (default reduction)
  }
,
{ // state 831
99,380, // "s"
  }
,
{ // state 832
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 833
2,1028, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 834
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+160, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+160, // $
MIN_REDUCTION+160, // $NT
  }
,
{ // state 835
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+142, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+142, // $
MIN_REDUCTION+142, // $NT
  }
,
{ // state 836
2,1524, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 837
0x80000000|1214, // match move
0x80000000|1505, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 838
0x80000000|303, // match move
0x80000000|1446, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 839
0x80000000|442, // match move
0x80000000|1547, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 840
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 841
0x80000000|522, // match move
0x80000000|270, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 842
97,623, // "k"
  }
,
{ // state 843
177,MIN_REDUCTION+109, // $NT
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 844
0x80000000|1477, // match move
0x80000000|948, // no-match move
0x80000000|1285, // NT-test-match state for commentTerminal
  }
,
{ // state 845
177,MIN_REDUCTION+108, // $NT
  }
,
{ // state 846
177,MIN_REDUCTION+121, // $NT
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 847
0x80000000|619, // match move
0x80000000|223, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 848
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 849
0x80000000|1348, // match move
0x80000000|614, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 850
2,679, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 851
0x80000000|375, // match move
0x80000000|394, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 852
0x80000000|1504, // match move
0x80000000|541, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 853
0x80000000|1275, // match move
0x80000000|1344, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 854
98,222, // "c"
  }
,
{ // state 855
3,1234, // $$0
4,104, // token
58,581, // `!
59,1069, // `!=
60,1084, // `%
61,1203, // `&&
63,544, // `(
64,1089, // `)
65,419, // `{
66,1346, // `}
67,1342, // `-
68,494, // `+
69,290, // `=
70,398, // `==
71,933, // `[
72,993, // `]
73,1378, // `||
74,329, // `<
75,666, // `<=
76,1370, // `,
77,200, // `>
78,778, // `>=
79,365, // `.
80,299, // `;
81,1525, // `++
82,881, // `--
83,682, // `/
84,693, // ID
85,387, // INTLIT
86,1099, // STRINGLIT
87,537, // CHARLIT
134,958, // "0"
148,962, // letter
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
174,764, // token*
  }
,
{ // state 856
177,MIN_REDUCTION+138, // $NT
  }
,
{ // state 857
-1, // $$start
-1, // start
1083, // ws*
-1, // $$0
MIN_REDUCTION+185, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+185, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+185, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+185, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+185, // "u"
267, // "p"
MIN_REDUCTION+185, // "h"
1274, // "v"
MIN_REDUCTION+185, // "y"
MIN_REDUCTION+185, // "m"
1212, // "g"
MIN_REDUCTION+185, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+185, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+185, // {"1".."9"}
MIN_REDUCTION+185, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+185, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 858
-1, // $$start
-1, // start
391, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+266, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+266, // $
-1, // $NT
  }
,
{ // state 859
2,936, // ws*
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 860
0x80000000|1224, // match move
0x80000000|1520, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 861
96,1480, // "r"
  }
,
{ // state 862
0x80000000|1, // match move
0x80000000|629, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 863
0x80000000|1026, // match move
0x80000000|1237, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 864
-1, // $$start
-1, // start
907, // ws*
-1, // $$0
MIN_REDUCTION+316, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+316, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+316, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+316, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+316, // "u"
267, // "p"
MIN_REDUCTION+316, // "h"
1274, // "v"
MIN_REDUCTION+316, // "y"
MIN_REDUCTION+316, // "m"
1212, // "g"
MIN_REDUCTION+316, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+316, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+316, // {"1".."9"}
MIN_REDUCTION+316, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
145, // idChar**
147, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+316, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
738, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+316, // $
-1, // $NT
  }
,
{ // state 865
101,15, // "t"
  }
,
{ // state 866
2,1530, // ws*
MIN_REDUCTION+307, // (default reduction)
  }
,
{ // state 867
99,963, // "s"
  }
,
{ // state 868
0x80000000|1, // match move
0x80000000|983, // no-match move
// T-test match for {"'" "\"}:
145,
146,
  }
,
{ // state 869
0x80000000|307, // match move
0x80000000|455, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 870
90,1523, // "l"
  }
,
{ // state 871
0x80000000|204, // match move
0x80000000|171, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 872
0x80000000|1555, // match move
0x80000000|295, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 873
111,82, // "m"
  }
,
{ // state 874
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 875
0x80000000|1050, // match move
0x80000000|1119, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 876
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 877
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 878
177,MIN_REDUCTION+337, // $NT
MIN_REDUCTION+337, // (default reduction)
  }
,
{ // state 879
0x80000000|1377, // match move
0x80000000|1302, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 880
0x80000000|117, // match move
0x80000000|416, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 881
MIN_REDUCTION+82, // (default reduction)
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+109, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+109, // $
MIN_REDUCTION+109, // $NT
  }
,
{ // state 883
-1, // $$start
-1, // start
449, // ws*
-1, // $$0
MIN_REDUCTION+236, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+236, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+236, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+236, // "x"
80, // "t"
1559, // "d"
138, // "f"
617, // "i"
916, // "w"
323, // "u"
267, // "p"
1325, // "h"
1274, // "v"
1332, // "y"
MIN_REDUCTION+236, // "m"
1212, // "g"
MIN_REDUCTION+236, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+236, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+236, // {"1".."9"}
MIN_REDUCTION+236, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+236, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 884
2,160, // ws*
MIN_REDUCTION+272, // (default reduction)
  }
,
{ // state 885
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 886
-1, // $$start
-1, // start
665, // ws*
-1, // $$0
MIN_REDUCTION+224, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+224, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+224, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+224, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+224, // "u"
267, // "p"
MIN_REDUCTION+224, // "h"
1274, // "v"
MIN_REDUCTION+224, // "y"
MIN_REDUCTION+224, // "m"
1212, // "g"
MIN_REDUCTION+224, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+224, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+224, // {"1".."9"}
MIN_REDUCTION+224, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+224, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 887
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+297, // (default reduction)
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+249, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+249, // $
-1, // $NT
  }
,
{ // state 889
1,528, // start
2,150, // ws*
3,1288, // $$0
4,104, // token
58,581, // `!
59,1069, // `!=
60,1084, // `%
61,1203, // `&&
62,1210, // `*
63,544, // `(
64,1089, // `)
65,419, // `{
66,1346, // `}
67,1342, // `-
68,494, // `+
69,290, // `=
70,398, // `==
71,933, // `[
72,993, // `]
73,1378, // `||
74,329, // `<
75,666, // `<=
76,1370, // `,
77,200, // `>
78,778, // `>=
79,365, // `.
80,299, // `;
81,1525, // `++
82,881, // `--
84,693, // ID
85,387, // INTLIT
86,1099, // STRINGLIT
87,537, // CHARLIT
117,1236, // "*"
137,425, // intLit2
139,275, // digit++
148,962, // letter
153,1156, // eol
160,638, // digit
166,830, // ws
174,764, // token*
175,122, // digit+
  }
,
{ // state 890
0x80000000|206, // match move
0x80000000|1266, // no-match move
0x80000000|1285, // NT-test-match state for commentTerminal
  }
,
{ // state 891
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 892
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 893
0x80000000|1, // match move
0x80000000|1215, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 894
0x80000000|1, // match move
0x80000000|536, // no-match move
// T-test match for {'"' "\"}:
140,
145,
  }
,
{ // state 895
0x80000000|273, // match move
0x80000000|8, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 896
101,1521, // "t"
  }
,
{ // state 897
0x80000000|1225, // match move
0x80000000|871, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 898
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+235, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+235, // $
MIN_REDUCTION+235, // $NT
  }
,
{ // state 899
177,MIN_REDUCTION+135, // $NT
  }
,
{ // state 900
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 901
177,MIN_REDUCTION+339, // $NT
MIN_REDUCTION+339, // (default reduction)
  }
,
{ // state 902
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+255, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+255, // $
-1, // $NT
  }
,
{ // state 903
177,MIN_REDUCTION+204, // $NT
  }
,
{ // state 904
89,1484, // "o"
110,129, // "y"
  }
,
{ // state 905
2,802, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 906
0x80000000|1394, // match move
0x80000000|605, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 907
0x80000000|1191, // match move
0x80000000|378, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 908
0x80000000|689, // match move
0x80000000|118, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 909
0x80000000|680, // match move
0x80000000|349, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 910
177,MIN_REDUCTION+335, // $NT
  }
,
{ // state 911
177,MIN_REDUCTION+343, // $NT
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 912
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 913
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+291, // (default reduction)
  }
,
{ // state 914
101,1027, // "t"
  }
,
{ // state 915
177,MIN_REDUCTION+175, // $NT
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 916
104,354, // "i"
108,986, // "h"
  }
,
{ // state 917
-1, // $$start
-1, // start
211, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
-1, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
-1, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+262, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
MIN_REDUCTION+262, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+262, // $
-1, // $NT
  }
,
{ // state 918
0x80000000|1516, // match move
0x80000000|565, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 919
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 920
0x80000000|1519, // match move
0x80000000|478, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 921
0x80000000|1179, // match move
0x80000000|27, // no-match move
0x80000000|209, // NT-test-match state for printable
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+175, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+175, // $
MIN_REDUCTION+175, // $NT
  }
,
{ // state 923
0x80000000|1141, // match move
0x80000000|339, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 924
-1, // $$start
-1, // start
321, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+312, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+312, // $
-1, // $NT
  }
,
{ // state 925
91,1284, // "e"
  }
,
{ // state 926
2,1187, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 927
0x80000000|154, // match move
0x80000000|480, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 928
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 929
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 930
0x80000000|586, // match move
0x80000000|573, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 931
0x80000000|1, // match move
0x80000000|927, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 932
0x80000000|1474, // match move
0x80000000|770, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 933
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 934
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+193, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+193, // $
MIN_REDUCTION+193, // $NT
  }
,
{ // state 935
0x80000000|1556, // match move
0x80000000|1192, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 936
0x80000000|624, // match move
0x80000000|1535, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 937
0x80000000|66, // match move
0x80000000|1373, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 938
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+211, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+211, // $
MIN_REDUCTION+211, // $NT
  }
,
{ // state 939
2,669, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 940
177,MIN_REDUCTION+324, // $NT
  }
,
{ // state 941
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 942
91,11, // "e"
  }
,
{ // state 943
0x80000000|1440, // match move
0x80000000|1478, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 944
92,954, // "a"
  }
,
{ // state 945
103,1417, // "f"
  }
,
{ // state 946
0x80000000|1256, // match move
0x80000000|135, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 947
0x80000000|1154, // match move
0x80000000|1513, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 948
88,227, // "b"
89,227, // "o"
90,227, // "l"
91,227, // "e"
92,227, // "a"
93,227, // "n"
96,227, // "r"
97,227, // "k"
98,227, // "c"
99,227, // "s"
100,227, // "x"
101,227, // "t"
102,227, // "d"
103,227, // "f"
104,227, // "i"
105,227, // "w"
106,227, // "u"
107,227, // "p"
108,227, // "h"
109,227, // "v"
110,227, // "y"
111,227, // "m"
112,227, // "g"
113,227, // "z"
114,227, // "!"
115,227, // "="
116,227, // "/"
117,227, // "*"
118,227, // "%"
119,227, // "&"
120,227, // "("
121,227, // ")"
122,227, // "+"
123,227, // ","
124,227, // "-"
125,227, // "."
126,227, // ";"
127,227, // "<"
128,227, // ">"
129,227, // "["
130,227, // "]"
131,227, // "{"
132,227, // "|"
133,227, // "}"
134,227, // "0"
135,227, // {"1".."9"}
136,227, // "X"
140,227, // '"'
145,227, // "\"
146,227, // "'"
147,390, // printable
153,1172, // eol
157,260, // multiCommentContent
159,527, // multiCommentContent**
161,227, // "_"
162,227, // {"A".."W" "Y".."Z" "j" "q"}
163,227, // {"#".."$" ":" "?".."@" "^" "`" "~"}
164,227, // " "
168,151, // {10}
169,706, // {13}
172,1090, // multiCommentContent*
  }
,
{ // state 949
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+291, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+291, // $
-1, // $NT
  }
,
{ // state 950
0x80000000|1082, // match move
0x80000000|1319, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 951
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+267, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+267, // $
-1, // $NT
  }
,
{ // state 952
177,MIN_REDUCTION+231, // $NT
  }
,
{ // state 953
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+103, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+103, // $
MIN_REDUCTION+103, // $NT
  }
,
{ // state 954
90,598, // "l"
  }
,
{ // state 955
-1, // $$start
-1, // start
1524, // ws*
-1, // $$0
MIN_REDUCTION+146, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+146, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+146, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+146, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+146, // "u"
267, // "p"
MIN_REDUCTION+146, // "h"
1274, // "v"
MIN_REDUCTION+146, // "y"
MIN_REDUCTION+146, // "m"
1212, // "g"
MIN_REDUCTION+146, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+146, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+146, // {"1".."9"}
MIN_REDUCTION+146, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+146, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+146, // $
MIN_REDUCTION+146, // $NT
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
{ // state 956
0x80000000|1, // match move
0x80000000|1312, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 957
0x80000000|499, // match move
0x80000000|902, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 958
0x80000000|698, // match move
0x80000000|1508, // no-match move
// T-test match for {"0".."9" "X" "x"}:
100,
134,
135,
136,
  }
,
{ // state 959
0x80000000|610, // match move
0x80000000|505, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 960
2,335, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 961
177,MIN_REDUCTION+320, // $NT
  }
,
{ // state 962
0x80000000|1095, // match move
0x80000000|748, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 963
91,862, // "e"
  }
,
{ // state 964
2,579, // ws*
MIN_REDUCTION+292, // (default reduction)
  }
,
{ // state 965
93,686, // "n"
  }
,
{ // state 966
93,1197, // "n"
  }
,
{ // state 967
MIN_REDUCTION+359, // (default reduction)
  }
,
{ // state 968
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 969
-1, // $$start
-1, // start
839, // ws*
-1, // $$0
MIN_REDUCTION+104, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+104, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+104, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+104, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+104, // "u"
267, // "p"
MIN_REDUCTION+104, // "h"
1274, // "v"
MIN_REDUCTION+104, // "y"
MIN_REDUCTION+104, // "m"
1212, // "g"
MIN_REDUCTION+104, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+104, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+104, // {"1".."9"}
MIN_REDUCTION+104, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+104, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 970
177,MIN_REDUCTION+96, // $NT
  }
,
{ // state 971
0x80000000|1200, // match move
0x80000000|331, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 972
2,1003, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 973
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 974
177,MIN_REDUCTION+342, // $NT
MIN_REDUCTION+342, // (default reduction)
  }
,
{ // state 975
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 976
0x80000000|823, // match move
0x80000000|984, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 977
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 978
MIN_REDUCTION+360, // (default reduction)
  }
,
{ // state 979
-1, // $$start
-1, // start
1263, // ws*
-1, // $$0
MIN_REDUCTION+179, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+179, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+179, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+179, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+179, // "u"
267, // "p"
MIN_REDUCTION+179, // "h"
1274, // "v"
MIN_REDUCTION+179, // "y"
MIN_REDUCTION+179, // "m"
1212, // "g"
MIN_REDUCTION+179, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+179, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+179, // {"1".."9"}
MIN_REDUCTION+179, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+179, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+179, // $
MIN_REDUCTION+179, // $NT
  }
,
{ // state 980
2,694, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 981
0x80000000|658, // match move
0x80000000|701, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 982
0x80000000|1025, // match move
0x80000000|771, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 983
88,1076, // "b"
89,1076, // "o"
90,1076, // "l"
91,1076, // "e"
92,1076, // "a"
93,1076, // "n"
96,1076, // "r"
97,1076, // "k"
98,1076, // "c"
99,1076, // "s"
100,1076, // "x"
101,1076, // "t"
102,1076, // "d"
103,1076, // "f"
104,1076, // "i"
105,1076, // "w"
106,1076, // "u"
107,1076, // "p"
108,1076, // "h"
109,1076, // "v"
110,1076, // "y"
111,1076, // "m"
112,1076, // "g"
113,1076, // "z"
114,1076, // "!"
115,1076, // "="
116,1076, // "/"
117,1076, // "*"
118,1076, // "%"
119,1076, // "&"
120,1076, // "("
121,1076, // ")"
122,1076, // "+"
123,1076, // ","
124,1076, // "-"
125,1076, // "."
126,1076, // ";"
127,1076, // "<"
128,1076, // ">"
129,1076, // "["
130,1076, // "]"
131,1076, // "{"
132,1076, // "|"
133,1076, // "}"
134,1076, // "0"
135,1076, // {"1".."9"}
136,1076, // "X"
140,1076, // '"'
144,1351, // char
145,1076, // "\"
146,1076, // "'"
147,821, // printable
161,1076, // "_"
162,1076, // {"A".."W" "Y".."Z" "j" "q"}
163,1076, // {"#".."$" ":" "?".."@" "^" "`" "~"}
164,1076, // " "
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+112, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+112, // $
MIN_REDUCTION+112, // $NT
  }
,
{ // state 985
-1, // $$start
-1, // start
1014, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
-1, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
-1, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+268, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
MIN_REDUCTION+268, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+268, // $
-1, // $NT
  }
,
{ // state 986
104,24, // "i"
  }
,
{ // state 987
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 988
99,431, // "s"
  }
,
{ // state 989
0x80000000|317, // match move
0x80000000|787, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 990
0x80000000|1, // match move
0x80000000|477, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 991
101,201, // "t"
  }
,
{ // state 992
115,672, // "="
  }
,
{ // state 993
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 994
0x80000000|1039, // match move
0x80000000|1375, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 995
98,1254, // "c"
  }
,
{ // state 996
2,601, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 997
-1, // $$start
-1, // start
783, // ws*
-1, // $$0
MIN_REDUCTION+134, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+134, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+134, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+134, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+134, // "u"
267, // "p"
MIN_REDUCTION+134, // "h"
1274, // "v"
MIN_REDUCTION+134, // "y"
MIN_REDUCTION+134, // "m"
1212, // "g"
MIN_REDUCTION+134, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+134, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+134, // {"1".."9"}
MIN_REDUCTION+134, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+134, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 998
2,1541, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 999
2,592, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1000
0x80000000|251, // match move
0x80000000|313, // no-match move
0x80000000|209, // NT-test-match state for printable
  }
,
{ // state 1001
0x80000000|743, // match move
0x80000000|564, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1002
103,1281, // "f"
  }
,
{ // state 1003
0x80000000|759, // match move
0x80000000|165, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1004
0x80000000|38, // match move
0x80000000|382, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1005
MIN_REDUCTION+293, // (default reduction)
  }
,
{ // state 1006
0x80000000|786, // match move
0x80000000|674, // no-match move
// T-test match for "+":
122,
  }
,
{ // state 1007
116,550, // "/"
117,84, // "*"
  }
,
{ // state 1008
97,23, // "k"
  }
,
{ // state 1009
0x80000000|824, // match move
0x80000000|1507, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1010
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1011
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 1012
0x80000000|1382, // match move
0x80000000|837, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1013
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 1014
0x80000000|1517, // match move
0x80000000|1400, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1015
0x80000000|475, // match move
0x80000000|934, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1016
89,458, // "o"
  }
,
{ // state 1017
0x80000000|1035, // match move
0x80000000|520, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1018
2,335, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 1019
-1, // $$start
-1, // start
179, // ws*
-1, // $$0
MIN_REDUCTION+161, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+161, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+161, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+161, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+161, // "u"
267, // "p"
MIN_REDUCTION+161, // "h"
1274, // "v"
MIN_REDUCTION+161, // "y"
MIN_REDUCTION+161, // "m"
1212, // "g"
MIN_REDUCTION+161, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+161, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+161, // {"1".."9"}
MIN_REDUCTION+161, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+161, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 1020
0x80000000|543, // match move
0x80000000|1102, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1021
177,MIN_REDUCTION+163, // $NT
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 1022
2,391, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 1023
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+133, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+133, // $
MIN_REDUCTION+133, // $NT
  }
,
{ // state 1024
101,956, // "t"
  }
,
{ // state 1025
MIN_REDUCTION+361, // (default reduction)
  }
,
{ // state 1026
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 1027
104,215, // "i"
  }
,
{ // state 1028
0x80000000|261, // match move
0x80000000|1079, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1029
2,1269, // ws*
MIN_REDUCTION+300, // (default reduction)
  }
,
{ // state 1030
177,MIN_REDUCTION+141, // $NT
  }
,
{ // state 1031
140,1536, // '"'
141,1492, // stringLiteral
142,433, // $$1
165,631, // stringChar**
171,1033, // stringChar*
  }
,
{ // state 1032
0x80000000|1334, // match move
0x80000000|684, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1033
0x80000000|587, // match move
0x80000000|109, // no-match move
0x80000000|1606, // NT-test-match state for stringChar
  }
,
{ // state 1034
89,61, // "o"
90,1423, // "l"
  }
,
{ // state 1035
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 1036
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+256, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+256, // $
-1, // $NT
  }
,
{ // state 1037
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 1038
177,MIN_REDUCTION+102, // $NT
  }
,
{ // state 1039
2,601, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 1040
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 1041
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 1042
103,276, // "f"
  }
,
{ // state 1043
2,1014, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1044
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 1045
177,MIN_REDUCTION+100, // $NT
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 1046
91,464, // "e"
  }
,
{ // state 1047
177,MIN_REDUCTION+91, // $NT
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 1048
0x80000000|525, // match move
0x80000000|1107, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1049
0x80000000|123, // match move
0x80000000|1017, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1050
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1051
101,1133, // "t"
105,324, // "w"
106,323, // "u"
108,1325, // "h"
110,1332, // "y"
  }
,
{ // state 1052
108,986, // "h"
  }
,
{ // state 1053
116,1593, // "/"
  }
,
{ // state 1054
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+269, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+269, // $
-1, // $NT
  }
,
{ // state 1055
-1, // $$start
-1, // start
636, // ws*
-1, // $$0
MIN_REDUCTION+128, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+128, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+128, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+128, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+128, // "u"
267, // "p"
MIN_REDUCTION+128, // "h"
1274, // "v"
MIN_REDUCTION+128, // "y"
MIN_REDUCTION+128, // "m"
1212, // "g"
MIN_REDUCTION+128, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+128, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+128, // {"1".."9"}
MIN_REDUCTION+128, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+128, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 1056
-1, // $$start
-1, // start
720, // ws*
-1, // $$0
MIN_REDUCTION+170, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+170, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+170, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+170, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+170, // "u"
267, // "p"
MIN_REDUCTION+170, // "h"
1274, // "v"
MIN_REDUCTION+170, // "y"
MIN_REDUCTION+170, // "m"
1212, // "g"
MIN_REDUCTION+170, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+170, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+170, // {"1".."9"}
MIN_REDUCTION+170, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+170, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 1057
177,MIN_REDUCTION+129, // $NT
  }
,
{ // state 1058
177,MIN_REDUCTION+111, // $NT
  }
,
{ // state 1059
0x80000000|1597, // match move
0x80000000|1335, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1060
0x80000000|648, // match move
0x80000000|1032, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1061
107,1034, // "p"
  }
,
{ // state 1062
0x80000000|1, // match move
0x80000000|713, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 1063
101,1259, // "t"
  }
,
{ // state 1064
0x80000000|1, // match move
0x80000000|1243, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 1065
0x80000000|456, // match move
0x80000000|1494, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1066
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 1067
0x80000000|277, // match move
0x80000000|388, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1068
2,1602, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 1069
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 1070
MIN_REDUCTION+269, // (default reduction)
  }
,
{ // state 1071
92,578, // "a"
  }
,
{ // state 1072
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+285, // (default reduction)
  }
,
{ // state 1073
-1, // $$start
-1, // start
802, // ws*
-1, // $$0
MIN_REDUCTION+194, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+194, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+194, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+194, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+194, // "u"
267, // "p"
MIN_REDUCTION+194, // "h"
1274, // "v"
MIN_REDUCTION+194, // "y"
MIN_REDUCTION+194, // "m"
1212, // "g"
MIN_REDUCTION+194, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+194, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+194, // {"1".."9"}
MIN_REDUCTION+194, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+194, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 1074
0x80000000|1486, // match move
0x80000000|248, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1075
0x80000000|133, // match move
0x80000000|137, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1076
177,MIN_REDUCTION+334, // $NT
MIN_REDUCTION+334, // (default reduction)
  }
,
{ // state 1077
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1078
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 1079
0x80000000|421, // match move
0x80000000|402, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1080
0x80000000|124, // match move
0x80000000|951, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1081
2,211, // ws*
MIN_REDUCTION+262, // (default reduction)
  }
,
{ // state 1082
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 1083
0x80000000|1528, // match move
0x80000000|853, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1084
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 1085
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+261, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+261, // $
-1, // $NT
  }
,
{ // state 1086
-1, // $$start
-1, // start
875, // ws*
-1, // $$0
MIN_REDUCTION+158, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+158, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+158, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+158, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+158, // "u"
267, // "p"
MIN_REDUCTION+158, // "h"
1274, // "v"
MIN_REDUCTION+158, // "y"
MIN_REDUCTION+158, // "m"
1212, // "g"
MIN_REDUCTION+158, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+158, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+158, // {"1".."9"}
MIN_REDUCTION+158, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+158, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 1087
-1, // $$start
-1, // start
907, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+314, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
403, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+314, // $
-1, // $NT
  }
,
{ // state 1088
177,MIN_REDUCTION+124, // $NT
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 1089
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 1090
0x80000000|1368, // match move
0x80000000|1299, // no-match move
0x80000000|1285, // NT-test-match state for commentTerminal
  }
,
{ // state 1091
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 1092
0x80000000|836, // match move
0x80000000|955, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1093
0x80000000|1399, // match move
0x80000000|250, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1094
0x80000000|489, // match move
0x80000000|736, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1095
88,841, // "b"
89,841, // "o"
90,841, // "l"
91,841, // "e"
92,841, // "a"
93,841, // "n"
94,112, // idChar
96,841, // "r"
97,841, // "k"
98,841, // "c"
99,841, // "s"
100,841, // "x"
101,841, // "t"
102,841, // "d"
103,841, // "f"
104,841, // "i"
105,841, // "w"
106,841, // "u"
107,841, // "p"
108,841, // "h"
109,841, // "v"
110,841, // "y"
111,841, // "m"
112,841, // "g"
113,841, // "z"
134,906, // "0"
135,906, // {"1".."9"}
136,841, // "X"
148,183, // letter
149,145, // idChar**
160,439, // digit
161,1407, // "_"
162,841, // {"A".."W" "Y".."Z" "j" "q"}
170,738, // idChar*
  }
,
{ // state 1096
0x80000000|1010, // match move
0x80000000|1589, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1097
2,373, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 1098
177,MIN_REDUCTION+232, // $NT
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 1099
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 1100
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 1101
2,1562, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 1102
0x80000000|481, // match move
0x80000000|249, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1103
0x80000000|569, // match move
0x80000000|534, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1104
0x80000000|1, // match move
0x80000000|26, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 1105
101,664, // "t"
  }
,
{ // state 1106
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+121, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+121, // $
MIN_REDUCTION+121, // $NT
  }
,
{ // state 1107
0x80000000|1132, // match move
0x80000000|1202, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1108
0x80000000|554, // match move
0x80000000|949, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1109
0x80000000|620, // match move
0x80000000|2, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1110
0x80000000|926, // match move
0x80000000|101, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1111
99,43, // "s"
  }
,
{ // state 1112
0x80000000|1, // match move
0x80000000|1534, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 1113
0x80000000|663, // match move
0x80000000|441, // no-match move
// T-test match for "-":
124,
  }
,
{ // state 1114
0x80000000|271, // match move
0x80000000|597, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1115
0x80000000|1437, // match move
0x80000000|677, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1116
MIN_REDUCTION+335, // (default reduction)
  }
,
{ // state 1117
2,391, // ws*
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 1118
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 1119
0x80000000|1500, // match move
0x80000000|847, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1120
2,694, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+365, // (default reduction)
  }
,
{ // state 1121
177,MIN_REDUCTION+241, // $NT
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 1122
88,1458, // "b"
  }
,
{ // state 1123
177,MIN_REDUCTION+90, // $NT
  }
,
{ // state 1124
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 1125
0x80000000|557, // match move
0x80000000|697, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 1126
-1, // $$start
-1, // start
815, // ws*
-1, // $$0
MIN_REDUCTION+239, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+239, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+239, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+239, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+239, // "u"
267, // "p"
MIN_REDUCTION+239, // "h"
1274, // "v"
MIN_REDUCTION+239, // "y"
MIN_REDUCTION+239, // "m"
1212, // "g"
MIN_REDUCTION+239, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+239, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+239, // {"1".."9"}
MIN_REDUCTION+239, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+239, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 1127
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 1128
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+181, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+181, // $
MIN_REDUCTION+181, // $NT
  }
,
{ // state 1129
-1, // $$start
-1, // start
669, // ws*
-1, // $$0
MIN_REDUCTION+227, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+227, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+227, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+227, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+227, // "u"
267, // "p"
MIN_REDUCTION+227, // "h"
1274, // "v"
MIN_REDUCTION+227, // "y"
MIN_REDUCTION+227, // "m"
1212, // "g"
MIN_REDUCTION+227, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+227, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+227, // {"1".."9"}
MIN_REDUCTION+227, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+227, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 1130
0x80000000|761, // match move
0x80000000|395, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1131
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 1132
MIN_REDUCTION+265, // (default reduction)
  }
,
{ // state 1133
92,1354, // "a"
96,330, // "r"
  }
,
{ // state 1134
117,1053, // "*"
156,687, // commentEnd
159,527, // multiCommentContent**
172,1090, // multiCommentContent*
  }
,
{ // state 1135
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1136
0x80000000|717, // match move
0x80000000|1096, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1137
0x80000000|1173, // match move
0x80000000|272, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1138
0x80000000|184, // match move
0x80000000|1605, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1139
88,1111, // "b"
99,236, // "s"
  }
,
{ // state 1140
0x80000000|826, // match move
0x80000000|589, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1141
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 1142
0x80000000|968, // match move
0x80000000|155, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1143
0x80000000|774, // match move
0x80000000|792, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1144
106,1321, // "u"
  }
,
{ // state 1145
2,466, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+286, // (default reduction)
  }
,
{ // state 1146
177,MIN_REDUCTION+222, // $NT
  }
,
{ // state 1147
93,944, // "n"
  }
,
{ // state 1148
0x80000000|1, // match move
0x80000000|741, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 1149
0x80000000|510, // match move
0x80000000|1468, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1150
0x80000000|1493, // match move
0x80000000|760, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1151
177,MIN_REDUCTION+214, // $NT
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 1152
0x80000000|726, // match move
0x80000000|12, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1153
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 1154
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 1155
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1156
177,MIN_REDUCTION+338, // $NT
MIN_REDUCTION+338, // (default reduction)
  }
,
{ // state 1157
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 1158
177,MIN_REDUCTION+103, // $NT
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 1159
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 1160
MIN_REDUCTION+355, // (default reduction)
  }
,
{ // state 1161
177,MIN_REDUCTION+341, // $NT
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 1162
MIN_REDUCTION+299, // (default reduction)
  }
,
{ // state 1163
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 1164
134,232, // "0"
135,232, // {"1".."9"}
  }
,
{ // state 1165
99,1063, // "s"
101,1376, // "t"
  }
,
{ // state 1166
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+279, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+279, // $
-1, // $NT
  }
,
{ // state 1167
0x80000000|140, // match move
0x80000000|93, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1168
MIN_REDUCTION+308, // (default reduction)
  }
,
{ // state 1169
91,485, // "e"
92,1300, // "a"
106,1252, // "u"
  }
,
{ // state 1170
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 1171
2,391, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+266, // (default reduction)
  }
,
{ // state 1172
0x80000000|1396, // match move
0x80000000|1091, // no-match move
0x80000000|890, // NT-test-match state for multiCommentContent
  }
,
{ // state 1173
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 1174
0x80000000|1220, // match move
0x80000000|136, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1175
-1, // $$start
-1, // start
451, // ws*
-1, // $$0
MIN_REDUCTION+95, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+95, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+95, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+95, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+95, // "u"
267, // "p"
MIN_REDUCTION+95, // "h"
1274, // "v"
MIN_REDUCTION+95, // "y"
MIN_REDUCTION+95, // "m"
1212, // "g"
MIN_REDUCTION+95, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+95, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+95, // {"1".."9"}
MIN_REDUCTION+95, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+95, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 1176
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 1177
98,634, // "c"
  }
,
{ // state 1178
177,MIN_REDUCTION+166, // $NT
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 1179
88,1502, // "b"
89,1502, // "o"
90,1502, // "l"
91,1502, // "e"
92,1502, // "a"
93,1502, // "n"
96,1502, // "r"
97,1502, // "k"
98,1502, // "c"
99,1502, // "s"
100,1502, // "x"
101,1502, // "t"
102,1502, // "d"
103,1502, // "f"
104,1502, // "i"
105,1502, // "w"
106,1502, // "u"
107,1502, // "p"
108,1502, // "h"
109,1502, // "v"
110,1502, // "y"
111,1502, // "m"
112,1502, // "g"
113,1502, // "z"
114,1502, // "!"
115,1502, // "="
116,1502, // "/"
117,1502, // "*"
118,1502, // "%"
119,1502, // "&"
120,1502, // "("
121,1502, // ")"
122,1502, // "+"
123,1502, // ","
124,1502, // "-"
125,1502, // "."
126,1502, // ";"
127,1502, // "<"
128,1502, // ">"
129,1502, // "["
130,1502, // "]"
131,1502, // "{"
132,1502, // "|"
133,1502, // "}"
134,1502, // "0"
135,1502, // {"1".."9"}
136,1502, // "X"
140,1502, // '"'
145,1502, // "\"
146,1502, // "'"
147,1311, // printable
161,1502, // "_"
162,1502, // {"A".."W" "Y".."Z" "j" "q"}
163,1502, // {"#".."$" ":" "?".."@" "^" "`" "~"}
164,1502, // " "
  }
,
{ // state 1180
0x80000000|920, // match move
0x80000000|1272, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1181
0x80000000|1310, // match move
0x80000000|1138, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1182
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+253, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+253, // $
-1, // $NT
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
{ // state 1183
89,64, // "o"
104,213, // "i"
  }
,
{ // state 1184
2,194, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 1185
0x80000000|776, // match move
0x80000000|895, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1186
0x80000000|1081, // match move
0x80000000|917, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1187
0x80000000|75, // match move
0x80000000|318, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1188
-1, // $$start
-1, // start
1562, // ws*
-1, // $$0
MIN_REDUCTION+245, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+245, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+245, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+245, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+245, // "u"
267, // "p"
MIN_REDUCTION+245, // "h"
1274, // "v"
MIN_REDUCTION+245, // "y"
MIN_REDUCTION+245, // "m"
1212, // "g"
MIN_REDUCTION+245, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+245, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+245, // {"1".."9"}
MIN_REDUCTION+245, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+245, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 1189
-1, // $$start
-1, // start
1430, // ws*
-1, // $$0
MIN_REDUCTION+200, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+200, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+200, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+200, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+200, // "u"
267, // "p"
MIN_REDUCTION+200, // "h"
1274, // "v"
MIN_REDUCTION+200, // "y"
MIN_REDUCTION+200, // "m"
1212, // "g"
MIN_REDUCTION+200, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+200, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+200, // {"1".."9"}
MIN_REDUCTION+200, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+200, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 1190
MIN_REDUCTION+350, // (default reduction)
  }
,
{ // state 1191
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+366, // (default reduction)
  }
,
{ // state 1192
-1, // $$start
-1, // start
1361, // ws*
-1, // $$0
MIN_REDUCTION+233, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+233, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+233, // "k"
1465, // "c"
930, // "s"
MIN_REDUCTION+233, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+233, // "u"
267, // "p"
MIN_REDUCTION+233, // "h"
1274, // "v"
MIN_REDUCTION+233, // "y"
MIN_REDUCTION+233, // "m"
1212, // "g"
MIN_REDUCTION+233, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+233, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+233, // {"1".."9"}
MIN_REDUCTION+233, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+233, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 1193
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 1194
0x80000000|1318, // match move
0x80000000|551, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 1195
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 1196
110,129, // "y"
  }
,
{ // state 1197
102,389, // "d"
  }
,
{ // state 1198
0x80000000|562, // match move
0x80000000|1355, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1199
177,MIN_REDUCTION+235, // $NT
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 1200
2,1462, // ws*
MIN_REDUCTION+305, // (default reduction)
  }
,
{ // state 1201
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 1202
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+265, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+265, // $
-1, // $NT
  }
,
{ // state 1203
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 1204
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+255, // (default reduction)
  }
,
{ // state 1205
0x80000000|843, // match move
0x80000000|882, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1206
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+257, // (default reduction)
  }
,
{ // state 1207
93,4, // "n"
  }
,
{ // state 1208
0x80000000|832, // match move
0x80000000|1598, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1209
0x80000000|1564, // match move
0x80000000|1286, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1210
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 1211
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1212
89,572, // "o"
  }
,
{ // state 1213
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+287, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+287, // $
-1, // $NT
  }
,
{ // state 1214
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1215
0x80000000|1293, // match move
0x80000000|500, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1216
109,1448, // "v"
  }
,
{ // state 1217
177,MIN_REDUCTION+97, // $NT
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 1218
89,79, // "o"
  }
,
{ // state 1219
MIN_REDUCTION+364, // (default reduction)
  }
,
{ // state 1220
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1221
-1, // $$start
-1, // start
466, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
-1, // `=
-1, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
MIN_REDUCTION+286, // "="
1511, // "/"
MIN_REDUCTION+286, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+286, // $
-1, // $NT
  }
,
{ // state 1222
177,MIN_REDUCTION+217, // $NT
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 1223
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+259, // (default reduction)
  }
,
{ // state 1224
4,1190, // token
5,91, // `boolean
6,1280, // `class
7,1410, // `extends
8,1607, // `void
9,607, // `int
10,1247, // `while
11,301, // `if
12,1510, // `else
13,142, // `for
14,782, // `break
15,667, // `this
16,757, // `false
17,283, // `true
18,1469, // `super
19,561, // `null
20,1353, // `return
21,46, // `instanceof
22,372, // `new
23,549, // `abstract
24,877, // `assert
25,400, // `byte
26,515, // `case
27,645, // `catch
28,1337, // `char
29,18, // `const
30,130, // `continue
31,289, // `default
32,795, // `do
33,14, // `double
34,230, // `enum
35,1599, // `final
36,1418, // `finally
37,484, // `float
38,31, // `goto
39,796, // `implements
40,141, // `import
41,762, // `interface
42,1041, // `long
43,612, // `native
44,1066, // `package
45,524, // `private
46,633, // `protected
47,885, // `public
48,1078, // `short
49,1239, // `static
50,1193, // `strictfp
51,1118, // `switch
52,584, // `synchronized
53,553, // `throw
54,1040, // `throws
55,304, // `transient
56,791, // `try
57,1295, // `volatile
  }
,
{ // state 1225
2,320, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 1226
0x80000000|310, // match move
0x80000000|459, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1227
0x80000000|1, // match move
0x80000000|105, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 1228
177,MIN_REDUCTION+94, // $NT
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 1229
-1, // $$start
-1, // start
579, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+292, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+292, // $
-1, // $NT
  }
,
{ // state 1230
89,1509, // "o"
  }
,
{ // state 1231
0x80000000|413, // match move
0x80000000|1578, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1232
0x80000000|588, // match move
0x80000000|1445, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1233
0x80000000|1544, // match move
0x80000000|344, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1234
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 1235
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1236
0x80000000|1, // match move
0x80000000|131, // no-match move
// T-test match for "/":
116,
  }
,
{ // state 1237
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+366, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+366, // $
-1, // $NT
  }
,
{ // state 1238
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 1239
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 1240
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 1241
177,MIN_REDUCTION+238, // $NT
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 1242
2,424, // ws*
MIN_REDUCTION+260, // (default reduction)
  }
,
{ // state 1243
0x80000000|108, // match move
0x80000000|63, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1244
0x80000000|828, // match move
0x80000000|1209, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1245
0x80000000|992, // match move
0x80000000|176, // no-match move
// T-test match for "=":
115,
  }
,
{ // state 1246
0x80000000|41, // match move
0x80000000|408, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1247
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 1248
177,MIN_REDUCTION+326, // $NT
MIN_REDUCTION+326, // (default reduction)
  }
,
{ // state 1249
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+279, // (default reduction)
  }
,
{ // state 1250
93,220, // "n"
  }
,
{ // state 1251
0x80000000|1416, // match move
0x80000000|678, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1252
90,647, // "l"
  }
,
{ // state 1253
177,MIN_REDUCTION+156, // $NT
  }
,
{ // state 1254
108,300, // "h"
  }
,
{ // state 1255
98,1464, // "c"
  }
,
{ // state 1256
2,287, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 1257
177,MIN_REDUCTION+127, // $NT
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 1258
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 1259
92,1552, // "a"
  }
,
{ // state 1260
0x80000000|94, // match move
0x80000000|563, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1261
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+275, // (default reduction)
  }
,
{ // state 1262
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+281, // (default reduction)
  }
,
{ // state 1263
0x80000000|1157, // match move
0x80000000|1315, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1264
2,19, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 1265
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+163, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+163, // $
MIN_REDUCTION+163, // $NT
  }
,
{ // state 1266
88,1076, // "b"
89,1076, // "o"
90,1076, // "l"
91,1076, // "e"
92,1076, // "a"
93,1076, // "n"
96,1076, // "r"
97,1076, // "k"
98,1076, // "c"
99,1076, // "s"
100,1076, // "x"
101,1076, // "t"
102,1076, // "d"
103,1076, // "f"
104,1076, // "i"
105,1076, // "w"
106,1076, // "u"
107,1076, // "p"
108,1076, // "h"
109,1076, // "v"
110,1076, // "y"
111,1076, // "m"
112,1076, // "g"
113,1076, // "z"
114,1076, // "!"
115,1076, // "="
116,1076, // "/"
117,1076, // "*"
118,1076, // "%"
119,1076, // "&"
120,1076, // "("
121,1076, // ")"
122,1076, // "+"
123,1076, // ","
124,1076, // "-"
125,1076, // "."
126,1076, // ";"
127,1076, // "<"
128,1076, // ">"
129,1076, // "["
130,1076, // "]"
131,1076, // "{"
132,1076, // "|"
133,1076, // "}"
134,1076, // "0"
135,1076, // {"1".."9"}
136,1076, // "X"
140,1076, // '"'
145,1076, // "\"
146,1076, // "'"
147,172, // printable
153,940, // eol
161,1076, // "_"
162,1076, // {"A".."W" "Y".."Z" "j" "q"}
163,1076, // {"#".."$" ":" "?".."@" "^" "`" "~"}
164,1076, // " "
168,1161, // {10}
169,707, // {13}
  }
,
{ // state 1267
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1268
177,MIN_REDUCTION+168, // $NT
  }
,
{ // state 1269
0x80000000|755, // match move
0x80000000|1577, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1270
2,296, // ws*
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 1271
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+187, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+187, // $
MIN_REDUCTION+187, // $NT
  }
,
{ // state 1272
0x80000000|1491, // match move
0x80000000|805, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1273
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+287, // (default reduction)
  }
,
{ // state 1274
89,1307, // "o"
  }
,
{ // state 1275
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 1276
0x80000000|1170, // match move
0x80000000|716, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1277
2,592, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 1278
134,22, // "0"
135,22, // {"1".."9"}
160,298, // digit
  }
,
{ // state 1279
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 1280
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 1281
92,1144, // "a"
  }
,
{ // state 1282
0x80000000|912, // match move
0x80000000|1476, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1283
2,1103, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+302, // (default reduction)
  }
,
{ // state 1284
96,671, // "r"
  }
,
{ // state 1285
116,532, // "/"
117,1053, // "*"
154,961, // commentStart
156,444, // commentEnd
  }
,
{ // state 1286
0x80000000|76, // match move
0x80000000|938, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1287
0x80000000|59, // match move
0x80000000|476, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1288
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 1289
93,21, // "n"
  }
,
{ // state 1290
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 1291
0x80000000|1317, // match move
0x80000000|1443, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1292
0x80000000|1, // match move
0x80000000|1110, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 1293
2,20, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 1294
177,MIN_REDUCTION+148, // $NT
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1295
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 1296
0x80000000|1, // match move
0x80000000|649, // no-match move
// T-test match for {"*" "/"}:
116,
117,
  }
,
{ // state 1297
0x80000000|74, // match move
0x80000000|212, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1298
2,601, // ws*
MIN_REDUCTION+294, // (default reduction)
  }
,
{ // state 1299
88,227, // "b"
89,227, // "o"
90,227, // "l"
91,227, // "e"
92,227, // "a"
93,227, // "n"
96,227, // "r"
97,227, // "k"
98,227, // "c"
99,227, // "s"
100,227, // "x"
101,227, // "t"
102,227, // "d"
103,227, // "f"
104,227, // "i"
105,227, // "w"
106,227, // "u"
107,227, // "p"
108,227, // "h"
109,227, // "v"
110,227, // "y"
111,227, // "m"
112,227, // "g"
113,227, // "z"
114,227, // "!"
115,227, // "="
116,227, // "/"
117,227, // "*"
118,227, // "%"
119,227, // "&"
120,227, // "("
121,227, // ")"
122,227, // "+"
123,227, // ","
124,227, // "-"
125,227, // "."
126,227, // ";"
127,227, // "<"
128,227, // ">"
129,227, // "["
130,227, // "]"
131,227, // "{"
132,227, // "|"
133,227, // "}"
134,227, // "0"
135,227, // {"1".."9"}
136,227, // "X"
140,227, // '"'
145,227, // "\"
146,227, // "'"
147,390, // printable
153,1172, // eol
157,1421, // multiCommentContent
161,227, // "_"
162,227, // {"A".."W" "Y".."Z" "j" "q"}
163,227, // {"#".."$" ":" "?".."@" "^" "`" "~"}
164,227, // " "
168,151, // {10}
169,706, // {13}
  }
,
{ // state 1300
101,803, // "t"
  }
,
{ // state 1301
0x80000000|1121, // match move
0x80000000|690, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1302
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+271, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+271, // $
-1, // $NT
  }
,
{ // state 1303
0x80000000|1290, // match move
0x80000000|1301, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1304
0x80000000|1267, // match move
0x80000000|790, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1305
89,1218, // "o"
96,353, // "r"
110,256, // "y"
  }
,
{ // state 1306
177,MIN_REDUCTION+332, // $NT
  }
,
{ // state 1307
90,120, // "l"
104,498, // "i"
  }
,
{ // state 1308
116,550, // "/"
117,84, // "*"
  }
,
{ // state 1309
98,1104, // "c"
  }
,
{ // state 1310
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+289, // (default reduction)
  }
,
{ // state 1311
0x80000000|1160, // match move
0x80000000|348, // no-match move
0x80000000|209, // NT-test-match state for printable
  }
,
{ // state 1312
0x80000000|642, // match move
0x80000000|727, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1313
3,1234, // $$0
4,104, // token
5,91, // `boolean
6,1280, // `class
7,1410, // `extends
8,1607, // `void
9,607, // `int
10,1247, // `while
11,301, // `if
12,1510, // `else
13,142, // `for
14,782, // `break
15,667, // `this
16,757, // `false
17,283, // `true
18,1469, // `super
19,561, // `null
20,1353, // `return
21,46, // `instanceof
22,372, // `new
23,549, // `abstract
24,877, // `assert
25,400, // `byte
26,515, // `case
27,645, // `catch
28,1337, // `char
29,18, // `const
30,130, // `continue
31,289, // `default
32,795, // `do
33,14, // `double
34,230, // `enum
35,1599, // `final
36,1418, // `finally
37,484, // `float
38,31, // `goto
39,796, // `implements
40,141, // `import
41,762, // `interface
42,1041, // `long
43,612, // `native
44,1066, // `package
45,524, // `private
46,633, // `protected
47,885, // `public
48,1078, // `short
49,1239, // `static
50,1193, // `strictfp
51,1118, // `switch
52,584, // `synchronized
53,553, // `throw
54,1040, // `throws
55,304, // `transient
56,791, // `try
57,1295, // `volatile
174,764, // token*
  }
,
{ // state 1314
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 1315
0x80000000|1135, // match move
0x80000000|640, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1316
0x80000000|894, // match move
0x80000000|1031, // no-match move
0x80000000|1606, // NT-test-match state for stringChar
  }
,
{ // state 1317
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 1318
115,1074, // "="
  }
,
{ // state 1319
0x80000000|377, // match move
0x80000000|346, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1320
MIN_REDUCTION+261, // (default reduction)
  }
,
{ // state 1321
90,865, // "l"
  }
,
{ // state 1322
0x80000000|1, // match move
0x80000000|265, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1323
0x80000000|575, // match move
0x80000000|516, // no-match move
0x80000000|1606, // NT-test-match state for stringChar
  }
,
{ // state 1324
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 1325
89,427, // "o"
  }
,
{ // state 1326
0x80000000|905, // match move
0x80000000|1073, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1327
0x80000000|1, // match move
0x80000000|366, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 1328
0x80000000|673, // match move
0x80000000|1398, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1329
-1, // $$start
-1, // start
1602, // ws*
-1, // $$0
MIN_REDUCTION+125, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+125, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+125, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+125, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+125, // "u"
267, // "p"
MIN_REDUCTION+125, // "h"
1274, // "v"
MIN_REDUCTION+125, // "y"
MIN_REDUCTION+125, // "m"
1212, // "g"
MIN_REDUCTION+125, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+125, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+125, // {"1".."9"}
MIN_REDUCTION+125, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+125, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 1330
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+178, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+178, // $
MIN_REDUCTION+178, // $NT
  }
,
{ // state 1331
177,MIN_REDUCTION+130, // $NT
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 1332
93,756, // "n"
  }
,
{ // state 1333
-1, // $$start
-1, // start
32, // ws*
-1, // $$0
MIN_REDUCTION+203, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+203, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+203, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+203, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+203, // "u"
267, // "p"
MIN_REDUCTION+203, // "h"
1274, // "v"
MIN_REDUCTION+203, // "y"
MIN_REDUCTION+203, // "m"
1212, // "g"
MIN_REDUCTION+203, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+203, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+203, // {"1".."9"}
MIN_REDUCTION+203, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+203, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 1334
177,MIN_REDUCTION+244, // $NT
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 1335
0x80000000|1270, // match move
0x80000000|182, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1336
0x80000000|1178, // match move
0x80000000|709, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1337
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 1338
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+106, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+106, // $
MIN_REDUCTION+106, // $NT
  }
,
{ // state 1339
-1, // $$start
-1, // start
426, // ws*
-1, // $$0
MIN_REDUCTION+98, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+98, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+98, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+98, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+98, // "u"
267, // "p"
MIN_REDUCTION+98, // "h"
1274, // "v"
MIN_REDUCTION+98, // "y"
MIN_REDUCTION+98, // "m"
1212, // "g"
MIN_REDUCTION+98, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+98, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+98, // {"1".."9"}
MIN_REDUCTION+98, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+98, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
-1, // digit+
MIN_REDUCTION+98, // $
MIN_REDUCTION+98, // $NT
  }
,
{ // state 1340
0x80000000|1162, // match move
0x80000000|1397, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1341
3,1234, // $$0
4,104, // token
58,581, // `!
59,1069, // `!=
60,1084, // `%
61,1203, // `&&
62,1210, // `*
63,544, // `(
64,1089, // `)
65,419, // `{
66,1346, // `}
67,1342, // `-
68,494, // `+
69,290, // `=
70,398, // `==
71,933, // `[
72,993, // `]
73,1378, // `||
74,329, // `<
75,666, // `<=
76,1370, // `,
77,200, // `>
78,778, // `>=
79,365, // `.
80,299, // `;
81,1525, // `++
82,881, // `--
84,693, // ID
85,387, // INTLIT
86,1099, // STRINGLIT
87,537, // CHARLIT
117,1236, // "*"
137,425, // intLit2
139,275, // digit++
148,962, // letter
153,1156, // eol
160,638, // digit
166,245, // ws
174,764, // token*
175,122, // digit+
  }
,
{ // state 1342
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 1343
2,335, // ws*
MIN_REDUCTION+288, // (default reduction)
  }
,
{ // state 1344
0x80000000|728, // match move
0x80000000|410, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1345
88,1502, // "b"
89,1502, // "o"
90,1502, // "l"
91,1502, // "e"
92,1502, // "a"
93,1502, // "n"
96,1502, // "r"
97,1502, // "k"
98,1502, // "c"
99,1502, // "s"
100,1502, // "x"
101,1502, // "t"
102,1502, // "d"
103,1502, // "f"
104,1502, // "i"
105,1502, // "w"
106,1502, // "u"
107,1502, // "p"
108,1502, // "h"
109,1502, // "v"
110,1502, // "y"
111,1502, // "m"
112,1502, // "g"
113,1502, // "z"
114,1502, // "!"
115,1502, // "="
116,1502, // "/"
117,1502, // "*"
118,1502, // "%"
119,1502, // "&"
120,1502, // "("
121,1502, // ")"
122,1502, // "+"
123,1502, // ","
124,1502, // "-"
125,1502, // "."
126,1502, // ";"
127,1502, // "<"
128,1502, // ">"
129,1502, // "["
130,1502, // "]"
131,1502, // "{"
132,1502, // "|"
133,1502, // "}"
134,1502, // "0"
135,1502, // {"1".."9"}
136,1502, // "X"
140,1502, // '"'
145,1502, // "\"
146,1502, // "'"
147,1000, // printable
152,462, // printable**
161,1502, // "_"
162,1502, // {"A".."W" "Y".."Z" "j" "q"}
163,1502, // {"#".."$" ":" "?".."@" "^" "`" "~"}
164,1502, // " "
173,921, // printable*
  }
,
{ // state 1346
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 1347
0x80000000|1, // match move
0x80000000|1094, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 1348
2,373, // ws*
MIN_REDUCTION+284, // (default reduction)
  }
,
{ // state 1349
2,451, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 1350
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+226, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+226, // $
MIN_REDUCTION+226, // $NT
  }
,
{ // state 1351
146,1490, // "'"
  }
,
{ // state 1352
0x80000000|765, // match move
0x80000000|1181, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1353
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 1354
101,1425, // "t"
  }
,
{ // state 1355
0x80000000|196, // match move
0x80000000|1383, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1356
MIN_REDUCTION+331, // (default reduction)
  }
,
{ // state 1357
2,321, // ws*
MIN_REDUCTION+312, // (default reduction)
  }
,
{ // state 1358
0x80000000|197, // match move
0x80000000|1514, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1359
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+232, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+232, // $
MIN_REDUCTION+232, // $NT
  }
,
{ // state 1360
177,MIN_REDUCTION+246, // $NT
  }
,
{ // state 1361
0x80000000|973, // match move
0x80000000|1075, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1362
0x80000000|406, // match move
0x80000000|879, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1363
0x80000000|1264, // match move
0x80000000|676, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1364
0x80000000|153, // match move
0x80000000|479, // no-match move
0x80000000|890, // NT-test-match state for multiCommentContent
  }
,
{ // state 1365
0x80000000|342, // match move
0x80000000|1414, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1366
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+301, // (default reduction)
  }
,
{ // state 1367
0x80000000|750, // match move
0x80000000|1569, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1368
0x80000000|708, // match move
0x80000000|357, // no-match move
0x80000000|890, // NT-test-match state for multiCommentContent
  }
,
{ // state 1369
0x80000000|495, // match move
0x80000000|1186, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1370
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 1371
0x80000000|255, // match move
0x80000000|166, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1372
0x80000000|460, // match move
0x80000000|102, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1373
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+229, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+229, // $
MIN_REDUCTION+229, // $NT
  }
,
{ // state 1374
0x80000000|1, // match move
0x80000000|829, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 1375
0x80000000|996, // match move
0x80000000|627, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1376
0x80000000|337, // match move
0x80000000|55, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 1377
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1378
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 1379
0x80000000|1, // match move
0x80000000|715, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 1380
0x80000000|1586, // match move
0x80000000|570, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1381
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+273, // (default reduction)
  }
,
{ // state 1382
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 1383
-1, // $$start
-1, // start
-1, // ws*
1234, // $$0
104, // token
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
-1, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
764, // token*
122, // digit+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 1384
2,875, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 1385
0x80000000|656, // match move
0x80000000|1055, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1386
98,1008, // "c"
  }
,
{ // state 1387
0x80000000|1608, // match move
0x80000000|1232, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1388
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+293, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+293, // $
-1, // $NT
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
{ // state 1389
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 1390
0x80000000|1506, // match move
0x80000000|809, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1391
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 1392
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 1393
0x80000000|417, // match move
0x80000000|173, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1394
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 1395
0x80000000|1131, // match move
0x80000000|1411, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1396
MIN_REDUCTION+324, // (default reduction)
  }
,
{ // state 1397
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+299, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+299, // $
-1, // $NT
  }
,
{ // state 1398
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+263, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+263, // $
-1, // $NT
  }
,
{ // state 1399
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+295, // (default reduction)
  }
,
{ // state 1400
0x80000000|1155, // match move
0x80000000|1080, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1401
0x80000000|1563, // match move
0x80000000|1333, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1402
MIN_REDUCTION+343, // (default reduction)
  }
,
{ // state 1403
-1, // $$start
-1, // start
159, // ws*
-1, // $$0
MIN_REDUCTION+221, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+221, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+221, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+221, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+221, // "u"
267, // "p"
MIN_REDUCTION+221, // "h"
1274, // "v"
MIN_REDUCTION+221, // "y"
MIN_REDUCTION+221, // "m"
1212, // "g"
MIN_REDUCTION+221, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+221, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+221, // {"1".."9"}
MIN_REDUCTION+221, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+221, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 1404
MIN_REDUCTION+362, // (default reduction)
  }
,
{ // state 1405
0x80000000|846, // match move
0x80000000|1106, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1406
105,813, // "w"
  }
,
{ // state 1407
0x80000000|594, // match move
0x80000000|1356, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 1408
0x80000000|168, // match move
0x80000000|758, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1409
0x80000000|148, // match move
0x80000000|30, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1410
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 1411
0x80000000|1320, // match move
0x80000000|1085, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1412
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 1413
MIN_REDUCTION+341, // (default reduction)
  }
,
{ // state 1414
0x80000000|603, // match move
0x80000000|1460, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1415
0x80000000|1442, // match move
0x80000000|976, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1416
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 1417
107,1447, // "p"
  }
,
{ // state 1418
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 1419
0x80000000|1, // match move
0x80000000|111, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 1420
177,MIN_REDUCTION+228, // $NT
  }
,
{ // state 1421
0x80000000|52, // match move
0x80000000|967, // no-match move
0x80000000|890, // NT-test-match state for multiCommentContent
  }
,
{ // state 1422
0x80000000|352, // match move
0x80000000|1221, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1423
91,611, // "e"
  }
,
{ // state 1424
134,22, // "0"
135,22, // {"1".."9"}
139,1472, // digit++
160,638, // digit
175,122, // digit+
  }
,
{ // state 1425
104,1177, // "i"
  }
,
{ // state 1426
2,625, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 1427
2,203, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 1428
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 1429
0x80000000|1116, // match move
0x80000000|632, // no-match move
0x80000000|1606, // NT-test-match state for stringChar
  }
,
{ // state 1430
0x80000000|217, // match move
0x80000000|297, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1431
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+271, // (default reduction)
  }
,
{ // state 1432
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1433
0x80000000|205, // match move
0x80000000|134, // no-match move
0x80000000|1606, // NT-test-match state for stringChar
  }
,
{ // state 1434
MIN_REDUCTION+253, // (default reduction)
  }
,
{ // state 1435
-1, // $$start
-1, // start
1003, // ws*
-1, // $$0
MIN_REDUCTION+155, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+155, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+155, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+155, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+155, // "u"
267, // "p"
MIN_REDUCTION+155, // "h"
1274, // "v"
MIN_REDUCTION+155, // "y"
MIN_REDUCTION+155, // "m"
1212, // "g"
MIN_REDUCTION+155, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+155, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+155, // {"1".."9"}
MIN_REDUCTION+155, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+155, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 1436
101,474, // "t"
  }
,
{ // state 1437
177,MIN_REDUCTION+145, // $NT
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 1438
2,1014, // ws*
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1439
2,194, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+264, // (default reduction)
  }
,
{ // state 1440
2,1387, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 1441
4,1190, // token
58,581, // `!
59,1069, // `!=
60,1084, // `%
61,1203, // `&&
63,544, // `(
64,1089, // `)
65,419, // `{
66,1346, // `}
67,1342, // `-
68,494, // `+
69,290, // `=
70,398, // `==
71,933, // `[
72,993, // `]
73,1378, // `||
74,329, // `<
75,666, // `<=
76,1370, // `,
77,200, // `>
78,778, // `>=
79,365, // `.
80,299, // `;
81,1525, // `++
82,881, // `--
83,682, // `/
84,693, // ID
85,387, // INTLIT
86,1099, // STRINGLIT
87,537, // CHARLIT
88,841, // "b"
89,841, // "o"
90,841, // "l"
91,841, // "e"
92,841, // "a"
93,841, // "n"
96,841, // "r"
97,841, // "k"
98,841, // "c"
99,841, // "s"
100,841, // "x"
101,841, // "t"
102,841, // "d"
103,841, // "f"
104,841, // "i"
105,841, // "w"
106,841, // "u"
107,841, // "p"
108,841, // "h"
109,841, // "v"
110,841, // "y"
111,841, // "m"
112,841, // "g"
113,841, // "z"
114,1245, // "!"
115,820, // "="
116,1296, // "/"
118,1009, // "%"
119,1548, // "&"
120,254, // "("
121,653, // ")"
122,1006, // "+"
123,358, // ","
124,1113, // "-"
125,747, // "."
126,683, // ";"
127,1194, // "<"
128,438, // ">"
129,1600, // "["
130,259, // "]"
131,994, // "{"
132,415, // "|"
133,1297, // "}"
134,22, // "0"
135,22, // {"1".."9"}
136,841, // "X"
137,425, // intLit2
139,275, // digit++
140,1316, // '"'
146,868, // "'"
148,962, // letter
160,638, // digit
162,841, // {"A".."W" "Y".."Z" "j" "q"}
175,122, // digit+
MIN_REDUCTION+363, // (default reduction)
  }
,
{ // state 1442
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 1443
0x80000000|1570, // match move
0x80000000|835, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1444
91,368, // "e"
  }
,
{ // state 1445
0x80000000|1151, // match move
0x80000000|350, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1446
0x80000000|887, // match move
0x80000000|1408, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1447
0x80000000|1, // match move
0x80000000|599, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 1448
91,931, // "e"
  }
,
{ // state 1449
0x80000000|1489, // match move
0x80000000|180, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1450
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 1451
0x80000000|1, // match move
0x80000000|608, // no-match move
// T-test match for "/":
116,
  }
,
{ // state 1452
0x80000000|226, // match move
0x80000000|1542, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1453
177,MIN_REDUCTION+93, // $NT
  }
,
{ // state 1454
177,MIN_REDUCTION+132, // $NT
  }
,
{ // state 1455
2,1430, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 1456
177,MIN_REDUCTION+237, // $NT
  }
,
{ // state 1457
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+263, // (default reduction)
  }
,
{ // state 1458
90,13, // "l"
  }
,
{ // state 1459
177,MIN_REDUCTION+192, // $NT
  }
,
{ // state 1460
-1, // $$start
-1, // start
1352, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+290, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+290, // $
-1, // $NT
  }
,
{ // state 1461
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 1462
0x80000000|1527, // match move
0x80000000|1287, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1463
168,974, // {10}
  }
,
{ // state 1464
108,1379, // "h"
  }
,
{ // state 1465
89,1207, // "o"
90,244, // "l"
92,1539, // "a"
108,1071, // "h"
  }
,
{ // state 1466
0x80000000|929, // match move
0x80000000|1405, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1467
0x80000000|1257, // match move
0x80000000|722, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1468
0x80000000|798, // match move
0x80000000|742, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1469
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 1470
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 1471
0x80000000|282, // match move
0x80000000|1338, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1472
0x80000000|447, // match move
0x80000000|473, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1473
93,637, // "n"
  }
,
{ // state 1474
2,1244, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 1475
0x80000000|379, // match move
0x80000000|1128, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1476
0x80000000|16, // match move
0x80000000|1271, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1477
0x80000000|793, // match move
0x80000000|1134, // no-match move
0x80000000|890, // NT-test-match state for multiCommentContent
  }
,
{ // state 1478
-1, // $$start
-1, // start
1387, // ws*
-1, // $$0
MIN_REDUCTION+215, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+215, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+215, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+215, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+215, // "u"
267, // "p"
MIN_REDUCTION+215, // "h"
1274, // "v"
MIN_REDUCTION+215, // "y"
MIN_REDUCTION+215, // "m"
1212, // "g"
MIN_REDUCTION+215, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+215, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+215, // {"1".."9"}
MIN_REDUCTION+215, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+215, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 1479
90,867, // "l"
  }
,
{ // state 1480
93,704, // "n"
  }
,
{ // state 1481
89,48, // "o"
  }
,
{ // state 1482
0x80000000|1426, // match move
0x80000000|73, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1483
MIN_REDUCTION+329, // (default reduction)
  }
,
{ // state 1484
93,167, // "n"
  }
,
{ // state 1485
2,679, // ws*
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1486
2,679, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+280, // (default reduction)
  }
,
{ // state 1487
2,7, // ws*
MIN_REDUCTION+254, // (default reduction)
  }
,
{ // state 1488
MIN_REDUCTION+330, // (default reduction)
  }
,
{ // state 1489
2,1541, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+296, // (default reduction)
  }
,
{ // state 1490
0x80000000|54, // match move
0x80000000|258, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1491
1,528, // start
2,150, // ws*
3,1288, // $$0
4,104, // token
5,91, // `boolean
6,1280, // `class
7,1410, // `extends
8,1607, // `void
9,607, // `int
10,1247, // `while
11,301, // `if
12,1510, // `else
13,142, // `for
14,782, // `break
15,667, // `this
16,757, // `false
17,283, // `true
18,1469, // `super
19,561, // `null
20,1353, // `return
21,46, // `instanceof
22,372, // `new
23,549, // `abstract
24,877, // `assert
25,400, // `byte
26,515, // `case
27,645, // `catch
28,1337, // `char
29,18, // `const
30,130, // `continue
31,289, // `default
32,795, // `do
33,14, // `double
34,230, // `enum
35,1599, // `final
36,1418, // `finally
37,484, // `float
38,31, // `goto
39,796, // `implements
40,141, // `import
41,762, // `interface
42,1041, // `long
43,612, // `native
44,1066, // `package
45,524, // `private
46,633, // `protected
47,885, // `public
48,1078, // `short
49,1239, // `static
50,1193, // `strictfp
51,1118, // `switch
52,584, // `synchronized
53,553, // `throw
54,1040, // `throws
55,304, // `transient
56,791, // `try
57,1295, // `volatile
88,1305, // "b"
90,1497, // "l"
91,512, // "e"
92,1139, // "a"
93,1169, // "n"
96,1046, // "r"
98,1465, // "c"
99,1051, // "s"
101,440, // "t"
102,1559, // "d"
103,138, // "f"
104,617, // "i"
105,1052, // "w"
107,267, // "p"
109,1274, // "v"
112,1212, // "g"
174,764, // token*
176,MIN_REDUCTION+1, // $
  }
,
{ // state 1492
140,1536, // '"'
142,1168, // $$1
  }
,
{ // state 1493
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 1494
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+88, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+88, // $
MIN_REDUCTION+88, // $NT
  }
,
{ // state 1495
-1, // $$start
-1, // start
737, // ws*
-1, // $$0
MIN_REDUCTION+188, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+188, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+188, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+188, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+188, // "u"
267, // "p"
MIN_REDUCTION+188, // "h"
1274, // "v"
MIN_REDUCTION+188, // "y"
MIN_REDUCTION+188, // "m"
1212, // "g"
MIN_REDUCTION+188, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+188, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+188, // {"1".."9"}
MIN_REDUCTION+188, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+188, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 1496
177,MIN_REDUCTION+159, // $NT
  }
,
{ // state 1497
89,1484, // "o"
  }
,
{ // state 1498
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 1499
2,35, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 1500
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 1501
0x80000000|1018, // match move
0x80000000|315, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1502
0x80000000|780, // match move
0x80000000|545, // no-match move
0x80000000|209, // NT-test-match state for printable
  }
,
{ // state 1503
91,10, // "e"
  }
,
{ // state 1504
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+251, // (default reduction)
  }
,
{ // state 1505
0x80000000|1294, // match move
0x80000000|518, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1506
MIN_REDUCTION+277, // (default reduction)
  }
,
{ // state 1507
0x80000000|28, // match move
0x80000000|1533, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1508
0x80000000|143, // match move
0x80000000|538, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1509
103,293, // "f"
  }
,
{ // state 1510
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 1511
0x80000000|1308, // match move
0x80000000|649, // no-match move
// T-test match for {"*" "/"}:
116,
117,
  }
,
{ // state 1512
96,1112, // "r"
  }
,
{ // state 1513
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+259, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+259, // $
-1, // $NT
  }
,
{ // state 1514
0x80000000|668, // match move
0x80000000|834, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1515
0x80000000|1567, // match move
0x80000000|1560, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1516
2,163, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+276, // (default reduction)
  }
,
{ // state 1517
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+267, // (default reduction)
  }
,
{ // state 1518
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+273, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+273, // $
-1, // $NT
  }
,
{ // state 1519
1,528, // start
2,150, // ws*
3,1288, // $$0
4,104, // token
5,91, // `boolean
6,1280, // `class
7,1410, // `extends
8,1607, // `void
9,607, // `int
10,1247, // `while
11,301, // `if
12,1510, // `else
13,142, // `for
14,782, // `break
15,667, // `this
16,757, // `false
17,283, // `true
18,1469, // `super
19,561, // `null
20,1353, // `return
21,46, // `instanceof
22,372, // `new
23,549, // `abstract
24,877, // `assert
25,400, // `byte
26,515, // `case
27,645, // `catch
28,1337, // `char
29,18, // `const
30,130, // `continue
31,289, // `default
32,795, // `do
33,14, // `double
34,230, // `enum
35,1599, // `final
36,1418, // `finally
37,484, // `float
38,31, // `goto
39,796, // `implements
40,141, // `import
41,762, // `interface
42,1041, // `long
43,612, // `native
44,1066, // `package
45,524, // `private
46,633, // `protected
47,885, // `public
48,1078, // `short
49,1239, // `static
50,1193, // `strictfp
51,1118, // `switch
52,584, // `synchronized
53,553, // `throw
54,1040, // `throws
55,304, // `transient
56,791, // `try
57,1295, // `volatile
174,764, // token*
  }
,
{ // state 1520
4,1190, // token
58,581, // `!
59,1069, // `!=
60,1084, // `%
61,1203, // `&&
62,1210, // `*
63,544, // `(
64,1089, // `)
65,419, // `{
66,1346, // `}
67,1342, // `-
68,494, // `+
69,290, // `=
70,398, // `==
71,933, // `[
72,993, // `]
73,1378, // `||
74,329, // `<
75,666, // `<=
76,1370, // `,
77,200, // `>
78,778, // `>=
79,365, // `.
80,299, // `;
81,1525, // `++
82,881, // `--
84,693, // ID
85,387, // INTLIT
86,1099, // STRINGLIT
87,537, // CHARLIT
117,1236, // "*"
137,425, // intLit2
139,275, // digit++
148,962, // letter
160,638, // digit
175,122, // digit+
  }
,
{ // state 1521
91,233, // "e"
  }
,
{ // state 1522
MIN_REDUCTION+333, // (default reduction)
  }
,
{ // state 1523
91,191, // "e"
  }
,
{ // state 1524
0x80000000|975, // match move
0x80000000|1579, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1525
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 1526
0x80000000|107, // match move
0x80000000|385, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1527
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+304, // (default reduction)
  }
,
{ // state 1528
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 1529
2,1083, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 1530
0x80000000|1546, // match move
0x80000000|1574, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1531
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 1532
-1, // $$start
-1, // start
838, // ws*
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+298, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+298, // $
-1, // $NT
  }
,
{ // state 1533
0x80000000|1487, // match move
0x80000000|766, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1534
0x80000000|643, // match move
0x80000000|100, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1535
0x80000000|218, // match move
0x80000000|503, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1536
0x80000000|980, // match move
0x80000000|325, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1537
2,1014, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+268, // (default reduction)
  }
,
{ // state 1538
-1, // $$start
-1, // start
53, // ws*
-1, // $$0
MIN_REDUCTION+143, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+143, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+143, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+143, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+143, // "u"
267, // "p"
MIN_REDUCTION+143, // "h"
1274, // "v"
MIN_REDUCTION+143, // "y"
MIN_REDUCTION+143, // "m"
1212, // "g"
MIN_REDUCTION+143, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+143, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+143, // {"1".."9"}
MIN_REDUCTION+143, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+143, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 1539
99,239, // "s"
101,995, // "t"
  }
,
{ // state 1540
0x80000000|781, // match move
0x80000000|533, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1541
0x80000000|1211, // match move
0x80000000|1093, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1542
0x80000000|1127, // match move
0x80000000|1166, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1543
177,MIN_REDUCTION+219, // $NT
  }
,
{ // state 1544
2,936, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+270, // (default reduction)
  }
,
{ // state 1545
101,945, // "t"
  }
,
{ // state 1546
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+306, // (default reduction)
  }
,
{ // state 1547
0x80000000|772, // match move
0x80000000|712, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1548
119,897, // "&"
  }
,
{ // state 1549
0x80000000|190, // match move
0x80000000|662, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1550
2,341, // ws*
MIN_REDUCTION+258, // (default reduction)
  }
,
{ // state 1551
2,1208, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 1552
93,854, // "n"
  }
,
{ // state 1553
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+304, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+304, // $
-1, // $NT
  }
,
{ // state 1554
0x80000000|1331, // match move
0x80000000|347, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1555
177,MIN_REDUCTION+139, // $NT
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 1556
2,1361, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 1557
0x80000000|1314, // match move
0x80000000|1251, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1558
0x80000000|1485, // match move
0x80000000|50, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1559
89,1125, // "o"
91,1002, // "e"
  }
,
{ // state 1560
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+220, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+220, // $
MIN_REDUCTION+220, // $NT
  }
,
{ // state 1561
177,MIN_REDUCTION+319, // $NT
  }
,
{ // state 1562
0x80000000|530, // match move
0x80000000|1060, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1563
2,32, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 1564
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 1565
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 1566
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+311, // (default reduction)
  }
,
{ // state 1567
177,MIN_REDUCTION+220, // $NT
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 1568
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 1569
-1, // $$start
-1, // start
188, // ws*
-1, // $$0
MIN_REDUCTION+173, // token
91, // `boolean
1280, // `class
1410, // `extends
1607, // `void
607, // `int
1247, // `while
301, // `if
1510, // `else
142, // `for
782, // `break
667, // `this
757, // `false
283, // `true
1469, // `super
561, // `null
1353, // `return
46, // `instanceof
372, // `new
549, // `abstract
877, // `assert
400, // `byte
515, // `case
645, // `catch
1337, // `char
18, // `const
130, // `continue
289, // `default
795, // `do
14, // `double
230, // `enum
1599, // `final
1418, // `finally
484, // `float
31, // `goto
796, // `implements
141, // `import
762, // `interface
1041, // `long
612, // `native
1066, // `package
524, // `private
633, // `protected
885, // `public
1078, // `short
1239, // `static
1193, // `strictfp
1118, // `switch
584, // `synchronized
553, // `throw
1040, // `throws
304, // `transient
791, // `try
1295, // `volatile
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
1305, // "b"
MIN_REDUCTION+173, // "o"
1497, // "l"
512, // "e"
1139, // "a"
1169, // "n"
-1, // idChar
-1, // reserved
1046, // "r"
MIN_REDUCTION+173, // "k"
1465, // "c"
1051, // "s"
MIN_REDUCTION+173, // "x"
440, // "t"
1559, // "d"
138, // "f"
617, // "i"
1052, // "w"
MIN_REDUCTION+173, // "u"
267, // "p"
MIN_REDUCTION+173, // "h"
1274, // "v"
MIN_REDUCTION+173, // "y"
MIN_REDUCTION+173, // "m"
1212, // "g"
MIN_REDUCTION+173, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+173, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
958, // "0"
MIN_REDUCTION+173, // {"1".."9"}
MIN_REDUCTION+173, // "X"
-1, // intLit2
-1, // `x
-1, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
-1, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
-1, // digit
-1, // "_"
MIN_REDUCTION+173, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
830, // ws
878, // {9}
1161, // {10}
707, // {13}
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
{ // state 1570
177,MIN_REDUCTION+142, // $NT
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 1571
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 1572
0x80000000|1242, // match move
0x80000000|784, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1573
0x80000000|1184, // match move
0x80000000|69, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1574
0x80000000|483, // match move
0x80000000|224, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1575
0x80000000|735, // match move
0x80000000|731, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1576
2,320, // ws*
MIN_REDUCTION+256, // (default reduction)
  }
,
{ // state 1577
0x80000000|336, // match move
0x80000000|1340, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1578
0x80000000|509, // match move
0x80000000|692, // no-match move
0x80000000|338, // NT-test-match state for reserved
  }
,
{ // state 1579
0x80000000|556, // match move
0x80000000|1115, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1580
0x80000000|1100, // match move
0x80000000|872, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1581
177,MIN_REDUCTION+225, // $NT
  }
,
{ // state 1582
91,1227, // "e"
  }
,
{ // state 1583
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+247, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+247, // $
-1, // $NT
  }
,
{ // state 1584
177,MIN_REDUCTION+151, // $NT
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 1585
0x80000000|57, // match move
0x80000000|1467, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1586
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 1587
0x80000000|1, // match move
0x80000000|932, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 1588
177,MIN_REDUCTION+114, // $NT
  }
,
{ // state 1589
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+311, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+311, // $
-1, // $NT
  }
,
{ // state 1590
2,646, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 1591
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+136, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+136, // $
MIN_REDUCTION+136, // $NT
  }
,
{ // state 1592
0x80000000|1240, // match move
0x80000000|110, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1593
177,MIN_REDUCTION+321, // $NT
MIN_REDUCTION+321, // (default reduction)
  }
,
{ // state 1594
0x80000000|279, // match move
0x80000000|371, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1595
0x80000000|192, // match move
0x80000000|660, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1596
152,462, // printable**
153,237, // eol
168,1161, // {10}
169,707, // {13}
173,921, // printable*
  }
,
{ // state 1597
2,296, // ws*
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,830, // ws
MIN_REDUCTION+282, // (default reduction)
  }
,
{ // state 1598
0x80000000|1568, // match move
0x80000000|356, // no-match move
// T-test match for "0":
134,
  }
,
{ // state 1599
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 1600
0x80000000|121, // match move
0x80000000|1365, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1601
106,861, // "u"
  }
,
{ // state 1602
0x80000000|501, // match move
0x80000000|445, // no-match move
// T-test match for "*":
117,
  }
,
{ // state 1603
0x80000000|1, // match move
0x80000000|497, // no-match move
0x80000000|688, // NT-test-match state for idChar
  }
,
{ // state 1604
113,1444, // "z"
  }
,
{ // state 1605
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
581, // `!
1069, // `!=
1084, // `%
1203, // `&&
-1, // `*
544, // `(
1089, // `)
419, // `{
1346, // `}
1342, // `-
494, // `+
290, // `=
398, // `==
933, // `[
993, // `]
1378, // `||
329, // `<
666, // `<=
1370, // `,
200, // `>
778, // `>=
365, // `.
299, // `;
1525, // `++
881, // `--
682, // `/
693, // ID
387, // INTLIT
1099, // STRINGLIT
537, // CHARLIT
841, // "b"
841, // "o"
841, // "l"
841, // "e"
841, // "a"
841, // "n"
-1, // idChar
-1, // reserved
841, // "r"
841, // "k"
841, // "c"
841, // "s"
841, // "x"
841, // "t"
841, // "d"
841, // "f"
841, // "i"
841, // "w"
841, // "u"
841, // "p"
841, // "h"
841, // "v"
841, // "y"
841, // "m"
841, // "g"
841, // "z"
1245, // "!"
820, // "="
1511, // "/"
MIN_REDUCTION+289, // "*"
1009, // "%"
1548, // "&"
254, // "("
653, // ")"
1006, // "+"
358, // ","
1113, // "-"
747, // "."
683, // ";"
1194, // "<"
438, // ">"
1600, // "["
259, // "]"
994, // "{"
415, // "|"
1297, // "}"
22, // "0"
22, // {"1".."9"}
841, // "X"
425, // intLit2
-1, // `x
275, // digit++
1316, // '"'
-1, // stringLiteral
-1, // $$1
-1, // stringChar
-1, // char
-1, // "\"
868, // "'"
-1, // printable
962, // letter
-1, // idChar**
-1, // $$2
901, // singleComment
-1, // printable**
1156, // eol
844, // commentStart
-1, // commentTerminal
-1, // commentEnd
-1, // multiCommentContent
202, // multiComment
-1, // multiCommentContent**
638, // digit
-1, // "_"
841, // {"A".."W" "Y".."Z" "j" "q"}
-1, // {"#".."$" ":" "?".."@" "^" "`" "~"}
878, // " "
-1, // stringChar**
245, // ws
878, // {9}
1161, // {10}
707, // {13}
-1, // idChar*
-1, // stringChar*
-1, // multiCommentContent*
-1, // printable*
-1, // token*
122, // digit+
MIN_REDUCTION+289, // $
-1, // $NT
  }
,
{ // state 1606
0x80000000|1, // match move
0x80000000|618, // no-match move
// T-test match for {'"' "\"}:
140,
145,
  }
,
{ // state 1607
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 1608
151,901, // singleComment
153,1156, // eol
154,844, // commentStart
158,202, // multiComment
166,245, // ws
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 1609
0x80000000|1043, // match move
0x80000000|17, // no-match move
// T-test match for "0":
134,
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
