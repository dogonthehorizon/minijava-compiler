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
import
syntaxtree
.
*
;
public class MJGrammarParseTable implements wrangLR.runtime.ParseTable {
public int getEofSym() { return 157; }
public int getNttSym() { return 158; }
private String[] symNameTable = {
"$$start",
"<start>",
"ws*",
"<program>",
"<class decl>+",
"<class decl>",
"`class",
"ID",
"`{",
"<decl in class>*",
"`}",
"<decl in class>",
"<method decl>",
"`public",
"`void",
"`(",
"`)",
"<stmt>*",
"<formal list rest>",
"`,",
"<type>",
"<formal list>",
"<formal list rest>*",
"<formal list>?",
"$$0",
"`int",
"`boolean",
"`null",
"<empty bracket pair>",
"`[",
"`]",
"<stmt>",
"<assign>",
"`;",
"<local var decl>",
"<if>",
"<break>",
"<exp>",
"`=",
"`++",
"`--",
"`if",
"`else",
"`break",
"<exp2>",
"<exp3>",
"<exp4>",
"<exp5>",
"<exp6>",
"<exp7>",
"<exp8>",
"`||",
"`&&",
"<equals>",
"<not equals>",
"`==",
"`!=",
"<greater than>",
"<less than>",
"<gt equals>",
"<lt equals>",
"<instanceof>",
"`>=",
"`<=",
"`>",
"`<",
"`instanceof",
"<plus>",
"<minus>",
"`+",
"`-",
"`*",
"`/",
"`%",
"<cast exp>",
"<unary exp>",
"<exp9>",
"`true",
"`false",
"`this",
"`super",
"`.",
"INTLIT",
"STRINGLIT",
"<exp list>",
"`new",
"letter",
"\"a\"",
"\"p\"",
"\"s\"",
"\"v\"",
"{\"A\"..\"Z\" \"d\" \"g\" \"j\"..\"k\" \"m\" \"q\" \"w\"..\"z\"}",
"\"c\"",
"\"f\"",
"\"i\"",
"\"l\"",
"\"o\"",
"\"r\"",
"\"u\"",
"\"b\"",
"\"e\"",
"\"h\"",
"\"n\"",
"\"t\"",
"letter128",
"{199..218 231..250}",
"{193..198 225..230}",
"digit",
"{\"1\"..\"9\"}",
"\"0\"",
"digit128",
"{176..185}",
"any",
"\"[\"",
"\"-\"",
"\"<\"",
"\"|\"",
"\" \"",
"\"#\"",
"\"&\"",
"\")\"",
"\",\"",
"\"]\"",
"\"/\"",
"\";\"",
"\">\"",
"\"{\"",
"{0..9 11..31 \"$\" \"\'\" \":\" \"?\" \"\\\" \"^\" \"`\" \"~\"..127}",
"\"%\"",
"\"(\"",
"\"+\"",
"\".\"",
"\"_\"",
"\"=\"",
"\"@\"",
"10",
"\"}\"",
"\"!\"",
"\'\"\'",
"\"*\"",
"any128",
"{223}",
"{128..175 186..192 219..222 224 251..255}",
"ws",
"`return",
"idChar*",
"$$1",
"digit*",
"$$2",
"hexDigit*",
"$$3",
"any*",
"$$4",
"idChar",
"idChar128",
"hexDigit",
"hexDigit128",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private MJGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 159;}
private static final int MIN_REDUCTION = 780;
public int minReduction() { return MIN_REDUCTION;}
private static final int MAX_ACCEPT_REDUCTION = MIN_REDUCTION+0;
public int maxAcceptReduction() { return MAX_ACCEPT_REDUCTION; }
private final int[][] parseTable;
public void error(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).error(pos,msg);
 else System.err.println("file position "+pos+": "+msg);}
public void warning(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).warning(pos,msg);
 else System.err.println("file position "+pos+"(warning): "+msg);}
public String filePosString(int pos){
 if (((Object)actionObject) instanceof wrangLR.runtime.FilePosObject)
 return ((wrangLR.runtime.FilePosObject)(Object)actionObject).filePosString(pos);
 else return ""+pos;}
public boolean parse(java.io.InputStream is) {
	return new wrangLR.runtime.BaseParser(this).parse(is);
}
public boolean parse(java.io.InputStream is, int verboseLevel, boolean verboseReductions) {
	return new wrangLR.runtime.BaseParser(this,verboseLevel,verboseReductions).parse(is);
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
1,321, // <start>
2,773, // ws*
3,82, // <program>
4,319, // <class decl>+
5,778, // <class decl>
6,658, // `class
117,486, // " "
118,44, // "#"
135,648, // {10}
143,388, // ws
  }
,
{ // state 1
  }
,
{ // state 2
100,721, // "e"
  }
,
{ // state 3
16,315, // `)
120,689, // ")"
  }
,
{ // state 4
16,240, // `)
120,689, // ")"
  }
,
{ // state 5
15,158, // `(
129,609, // "("
  }
,
{ // state 6
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 7
0x80000000|221, // match move
0x80000000|297, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 8
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 9
95,492, // "l"
  }
,
{ // state 10
0x80000000|507, // match move
0x80000000|95, // no-match move
0x80000000|328, // NT-test-match state for `else
  }
,
{ // state 11
0x80000000|547, // match move
0x80000000|209, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 12
29,MIN_REDUCTION+211, // `[
113,MIN_REDUCTION+211, // "["
117,MIN_REDUCTION+211, // " "
135,MIN_REDUCTION+211, // {10}
143,MIN_REDUCTION+211, // ws
158,MIN_REDUCTION+211, // $NT
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 13
158,MIN_REDUCTION+199, // $NT
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 14
0x80000000|535, // match move
0x80000000|361, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 15
129,609, // "("
  }
,
{ // state 16
55,531, // `==
56,419, // `!=
134,572, // "@"
158,MIN_REDUCTION+45, // $NT
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 17
103,467, // "t"
  }
,
{ // state 18
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 19
158,MIN_REDUCTION+21, // $NT
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 20
7,446, // ID
27,73, // `null
69,762, // `+
70,247, // `-
75,244, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,542, // "#"
130,180, // "+"
134,620, // "@"
138,552, // '"'
  }
,
{ // state 21
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 22
117,411, // " "
135,670, // {10}
143,394, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 23
33,774, // `;
124,124, // ";"
  }
,
{ // state 24
0x80000000|465, // match move
0x80000000|522, // no-match move
0x80000000|57, // NT-test-match state for `void
  }
,
{ // state 25
0x80000000|553, // match move
0x80000000|267, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 26
10,578, // `}
136,261, // "}"
  }
,
{ // state 27
29,MIN_REDUCTION+202, // `[
113,MIN_REDUCTION+202, // "["
158,MIN_REDUCTION+202, // $NT
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 28
158,MIN_REDUCTION+74, // $NT
  }
,
{ // state 29
0x80000000|1, // match move
0x80000000|753, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 30
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 31
29,MIN_REDUCTION+193, // `[
113,MIN_REDUCTION+193, // "["
158,MIN_REDUCTION+193, // $NT
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 32
0x80000000|345, // match move
0x80000000|751, // no-match move
0x80000000|328, // NT-test-match state for `else
  }
,
{ // state 33
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 34
158,MIN_REDUCTION+115, // $NT
  }
,
{ // state 35
0x80000000|1, // match move
0x80000000|770, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 36
158,MIN_REDUCTION+43, // $NT
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 37
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 38
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 39
0x80000000|1, // match move
0x80000000|431, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 40
7,MIN_REDUCTION+211, // ID
16,MIN_REDUCTION+211, // `)
29,MIN_REDUCTION+211, // `[
87,MIN_REDUCTION+211, // "a"
88,MIN_REDUCTION+211, // "p"
89,MIN_REDUCTION+211, // "s"
90,MIN_REDUCTION+211, // "v"
91,MIN_REDUCTION+211, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,MIN_REDUCTION+211, // "c"
93,MIN_REDUCTION+211, // "f"
94,MIN_REDUCTION+211, // "i"
95,MIN_REDUCTION+211, // "l"
96,MIN_REDUCTION+211, // "o"
97,MIN_REDUCTION+211, // "r"
98,MIN_REDUCTION+211, // "u"
99,MIN_REDUCTION+211, // "b"
100,MIN_REDUCTION+211, // "e"
101,MIN_REDUCTION+211, // "h"
102,MIN_REDUCTION+211, // "n"
103,MIN_REDUCTION+211, // "t"
105,MIN_REDUCTION+211, // {199..218 231..250}
106,MIN_REDUCTION+211, // {193..198 225..230}
113,MIN_REDUCTION+211, // "["
120,MIN_REDUCTION+211, // ")"
158,MIN_REDUCTION+211, // $NT
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 41
158,MIN_REDUCTION+224, // $NT
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 42
2,410, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 43
90,106, // "v"
  }
,
{ // state 44
92,198, // "c"
  }
,
{ // state 45
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 46
158,MIN_REDUCTION+51, // $NT
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 47
0x80000000|669, // match move
0x80000000|383, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 48
38,99, // `=
51,735, // `||
133,245, // "="
134,133, // "@"
  }
,
{ // state 49
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 50
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
318, // ID
147, // `{
-1, // <decl in class>*
563, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
213, // `void
90, // `(
-1, // `)
286, // <stmt>*
-1, // <formal list rest>
-1, // `,
276, // <type>
-1, // <formal list>
-1, // <formal list rest>*
-1, // <formal list>?
-1, // $$0
150, // `int
459, // `boolean
132, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
483, // <stmt>
412, // <assign>
-1, // `;
23, // <local var decl>
498, // <if>
644, // <break>
48, // <exp>
-1, // `=
306, // `++
750, // `--
636, // `if
-1, // `else
681, // `break
719, // <exp2>
691, // <exp3>
265, // <exp4>
311, // <exp5>
423, // <exp6>
346, // <exp7>
36, // <exp8>
-1, // `||
-1, // `&&
360, // <equals>
523, // <not equals>
-1, // `==
-1, // `!=
120, // <greater than>
46, // <less than>
703, // <gt equals>
539, // <lt equals>
337, // <instanceof>
-1, // `>=
-1, // `<=
-1, // `>
-1, // `<
-1, // `instanceof
525, // <plus>
595, // <minus>
762, // `+
247, // `-
-1, // `*
-1, // `/
-1, // `%
485, // <cast exp>
437, // <unary exp>
196, // <exp9>
603, // `true
63, // `false
322, // `this
11, // `super
-1, // `.
734, // INTLIT
372, // STRINGLIT
-1, // <exp list>
564, // `new
594, // letter
503, // "a"
503, // "p"
503, // "s"
503, // "v"
503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
503, // "c"
503, // "f"
503, // "i"
503, // "l"
503, // "o"
503, // "r"
503, // "u"
503, // "b"
503, // "e"
503, // "h"
503, // "n"
503, // "t"
199, // letter128
168, // {199..218 231..250}
168, // {193..198 225..230}
-1, // digit
754, // {"1".."9"}
212, // "0"
130, // digit128
384, // {176..185}
-1, // any
-1, // "["
764, // "-"
-1, // "<"
-1, // "|"
-1, // " "
687, // "#"
-1, // "&"
-1, // ")"
-1, // ","
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
583, // "{"
-1, // {0..9 11..31 "$" "'" ":" "?" "\" "^" "`" "~"..127}
-1, // "%"
609, // "("
180, // "+"
-1, // "."
-1, // "_"
-1, // "="
630, // "@"
-1, // {10}
261, // "}"
-1, // "!"
552, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // `return
-1, // idChar*
-1, // $$1
-1, // digit*
-1, // $$2
-1, // hexDigit*
-1, // $$3
-1, // any*
-1, // $$4
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 51
2,230, // ws*
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 52
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 53
0x80000000|1, // match move
0x80000000|253, // no-match move
// T-test match for "=":
133,
  }
,
{ // state 54
2,736, // ws*
158,MIN_REDUCTION+142, // $NT
  }
,
{ // state 55
0x80000000|1, // match move
0x80000000|116, // no-match move
0x80000000|452, // NT-test-match state for <exp list>
  }
,
{ // state 56
0x80000000|602, // match move
0x80000000|425, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 57
118,43, // "#"
  }
,
{ // state 58
0x80000000|611, // match move
0x80000000|8, // no-match move
0x80000000|328, // NT-test-match state for `else
  }
,
{ // state 59
33,183, // `;
124,649, // ";"
  }
,
{ // state 60
0x80000000|697, // match move
0x80000000|217, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 61
158,MIN_REDUCTION+191, // $NT
  }
,
{ // state 62
0x80000000|711, // match move
0x80000000|72, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 63
0x80000000|396, // match move
0x80000000|631, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 64
7,446, // ID
15,90, // `(
27,73, // `null
37,451, // <exp>
44,719, // <exp2>
45,691, // <exp3>
46,265, // <exp4>
47,311, // <exp5>
48,423, // <exp6>
49,346, // <exp7>
50,36, // <exp8>
53,360, // <equals>
54,523, // <not equals>
57,120, // <greater than>
58,46, // <less than>
59,703, // <gt equals>
60,539, // <lt equals>
61,337, // <instanceof>
67,525, // <plus>
68,595, // <minus>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,542, // "#"
129,609, // "("
130,180, // "+"
134,620, // "@"
138,552, // '"'
  }
,
{ // state 65
2,228, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 66
0x80000000|1, // match move
0x80000000|612, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 67
16,205, // `)
51,735, // `||
120,652, // ")"
134,133, // "@"
  }
,
{ // state 68
7,MIN_REDUCTION+212, // ID
16,MIN_REDUCTION+212, // `)
29,MIN_REDUCTION+212, // `[
87,MIN_REDUCTION+212, // "a"
88,MIN_REDUCTION+212, // "p"
89,MIN_REDUCTION+212, // "s"
90,MIN_REDUCTION+212, // "v"
91,MIN_REDUCTION+212, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,MIN_REDUCTION+212, // "c"
93,MIN_REDUCTION+212, // "f"
94,MIN_REDUCTION+212, // "i"
95,MIN_REDUCTION+212, // "l"
96,MIN_REDUCTION+212, // "o"
97,MIN_REDUCTION+212, // "r"
98,MIN_REDUCTION+212, // "u"
99,MIN_REDUCTION+212, // "b"
100,MIN_REDUCTION+212, // "e"
101,MIN_REDUCTION+212, // "h"
102,MIN_REDUCTION+212, // "n"
103,MIN_REDUCTION+212, // "t"
105,MIN_REDUCTION+212, // {199..218 231..250}
106,MIN_REDUCTION+212, // {193..198 225..230}
113,MIN_REDUCTION+212, // "["
120,MIN_REDUCTION+212, // ")"
158,MIN_REDUCTION+212, // $NT
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 69
158,MIN_REDUCTION+66, // $NT
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 70
29,MIN_REDUCTION+82, // `[
113,MIN_REDUCTION+82, // "["
158,MIN_REDUCTION+82, // $NT
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 71
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 72
0x80000000|187, // match move
0x80000000|273, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 73
0x80000000|184, // match move
0x80000000|447, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 74
2,302, // ws*
158,MIN_REDUCTION+114, // $NT
  }
,
{ // state 75
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 76
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 77
0x80000000|34, // match move
0x80000000|601, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 78
0x80000000|723, // match move
0x80000000|676, // no-match move
0x80000000|328, // NT-test-match state for `else
  }
,
{ // state 79
0x80000000|52, // match move
0x80000000|627, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 80
7,473, // ID
28,268, // <empty bracket pair>
29,177, // `[
86,279, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,260, // letter128
105,186, // {199..218 231..250}
106,186, // {193..198 225..230}
113,606, // "["
  }
,
{ // state 81
7,MIN_REDUCTION+16, // ID
15,226, // `(
29,MIN_REDUCTION+74, // `[
39,76, // `++
40,613, // `--
87,MIN_REDUCTION+16, // "a"
88,MIN_REDUCTION+16, // "p"
89,MIN_REDUCTION+16, // "s"
90,MIN_REDUCTION+16, // "v"
91,MIN_REDUCTION+16, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,MIN_REDUCTION+16, // "c"
93,MIN_REDUCTION+16, // "f"
94,MIN_REDUCTION+16, // "i"
95,MIN_REDUCTION+16, // "l"
96,MIN_REDUCTION+16, // "o"
97,MIN_REDUCTION+16, // "r"
98,MIN_REDUCTION+16, // "u"
99,MIN_REDUCTION+16, // "b"
100,MIN_REDUCTION+16, // "e"
101,MIN_REDUCTION+16, // "h"
102,MIN_REDUCTION+16, // "n"
103,MIN_REDUCTION+16, // "t"
105,MIN_REDUCTION+16, // {199..218 231..250}
106,MIN_REDUCTION+16, // {193..198 225..230}
113,MIN_REDUCTION+74, // "["
129,514, // "("
134,758, // "@"
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 82
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 83
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 84
0x80000000|255, // match move
0x80000000|733, // no-match move
0x80000000|57, // NT-test-match state for `void
  }
,
{ // state 85
0x80000000|580, // match move
0x80000000|362, // no-match move
0x80000000|328, // NT-test-match state for `else
  }
,
{ // state 86
16,MIN_REDUCTION+98, // `)
120,MIN_REDUCTION+98, // ")"
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 87
0x80000000|1, // match move
0x80000000|139, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 88
7,446, // ID
27,73, // `null
30,275, // `]
76,170, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
118,542, // "#"
122,560, // "]"
134,620, // "@"
138,552, // '"'
  }
,
{ // state 89
2,154, // ws*
29,MIN_REDUCTION+188, // `[
113,MIN_REDUCTION+188, // "["
117,320, // " "
135,737, // {10}
143,178, // ws
158,MIN_REDUCTION+188, // $NT
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 90
7,363, // ID
14,213, // `void
20,591, // <type>
25,150, // `int
26,459, // `boolean
27,387, // `null
86,279, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,260, // letter128
105,186, // {199..218 231..250}
106,186, // {193..198 225..230}
118,646, // "#"
  }
,
{ // state 91
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 92
17,286, // <stmt>*
  }
,
{ // state 93
0x80000000|257, // match move
0x80000000|292, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 94
158,MIN_REDUCTION+193, // $NT
  }
,
{ // state 95
117,MIN_REDUCTION+212, // " "
135,MIN_REDUCTION+212, // {10}
143,MIN_REDUCTION+212, // ws
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 96
29,MIN_REDUCTION+190, // `[
113,MIN_REDUCTION+190, // "["
158,MIN_REDUCTION+190, // $NT
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 97
2,500, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 98
7,446, // ID
15,90, // `(
27,73, // `null
46,647, // <exp4>
47,311, // <exp5>
48,423, // <exp6>
49,346, // <exp7>
50,36, // <exp8>
57,120, // <greater than>
58,46, // <less than>
59,703, // <gt equals>
60,539, // <lt equals>
61,337, // <instanceof>
67,525, // <plus>
68,595, // <minus>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,542, // "#"
129,609, // "("
130,180, // "+"
134,620, // "@"
138,552, // '"'
  }
,
{ // state 99
0x80000000|1, // match move
0x80000000|651, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 100
0x80000000|1, // match move
0x80000000|582, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 101
7,728, // ID
28,268, // <empty bracket pair>
29,177, // `[
86,279, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,260, // letter128
105,186, // {199..218 231..250}
106,186, // {193..198 225..230}
113,606, // "["
  }
,
{ // state 102
158,MIN_REDUCTION+84, // $NT
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 103
158,MIN_REDUCTION+141, // $NT
  }
,
{ // state 104
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 105
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 106
96,327, // "o"
  }
,
{ // state 107
158,MIN_REDUCTION+70, // $NT
  }
,
{ // state 108
158,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 109
0x80000000|393, // match move
0x80000000|550, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 110
2,309, // ws*
158,MIN_REDUCTION+225, // $NT
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 111
158,MIN_REDUCTION+90, // $NT
  }
,
{ // state 112
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 113
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 114
0x80000000|374, // match move
0x80000000|79, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 115
7,446, // ID
15,90, // `(
27,73, // `null
46,693, // <exp4>
47,311, // <exp5>
48,423, // <exp6>
49,346, // <exp7>
50,36, // <exp8>
57,120, // <greater than>
58,46, // <less than>
59,703, // <gt equals>
60,539, // <lt equals>
61,337, // <instanceof>
67,525, // <plus>
68,595, // <minus>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,542, // "#"
129,609, // "("
130,180, // "+"
134,620, // "@"
138,552, // '"'
  }
,
{ // state 116
117,140, // " "
135,281, // {10}
143,370, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 117
158,MIN_REDUCTION+72, // $NT
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 118
0x80000000|151, // match move
0x80000000|129, // no-match move
0x80000000|328, // NT-test-match state for `else
  }
,
{ // state 119
2,235, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 120
158,MIN_REDUCTION+50, // $NT
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 121
0x80000000|110, // match move
0x80000000|608, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 122
2,316, // ws*
117,411, // " "
135,670, // {10}
143,10, // ws
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 123
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
318, // ID
147, // `{
-1, // <decl in class>*
530, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
213, // `void
90, // `(
-1, // `)
600, // <stmt>*
-1, // <formal list rest>
-1, // `,
276, // <type>
-1, // <formal list>
-1, // <formal list rest>*
-1, // <formal list>?
-1, // $$0
150, // `int
459, // `boolean
132, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
483, // <stmt>
412, // <assign>
-1, // `;
23, // <local var decl>
498, // <if>
644, // <break>
48, // <exp>
-1, // `=
306, // `++
750, // `--
636, // `if
-1, // `else
681, // `break
719, // <exp2>
691, // <exp3>
265, // <exp4>
311, // <exp5>
423, // <exp6>
346, // <exp7>
36, // <exp8>
-1, // `||
-1, // `&&
360, // <equals>
523, // <not equals>
-1, // `==
-1, // `!=
120, // <greater than>
46, // <less than>
703, // <gt equals>
539, // <lt equals>
337, // <instanceof>
-1, // `>=
-1, // `<=
-1, // `>
-1, // `<
-1, // `instanceof
525, // <plus>
595, // <minus>
762, // `+
247, // `-
-1, // `*
-1, // `/
-1, // `%
485, // <cast exp>
437, // <unary exp>
196, // <exp9>
603, // `true
63, // `false
322, // `this
11, // `super
-1, // `.
734, // INTLIT
372, // STRINGLIT
-1, // <exp list>
564, // `new
594, // letter
503, // "a"
503, // "p"
503, // "s"
503, // "v"
503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
503, // "c"
503, // "f"
503, // "i"
503, // "l"
503, // "o"
503, // "r"
503, // "u"
503, // "b"
503, // "e"
503, // "h"
503, // "n"
503, // "t"
199, // letter128
168, // {199..218 231..250}
168, // {193..198 225..230}
-1, // digit
754, // {"1".."9"}
212, // "0"
130, // digit128
384, // {176..185}
-1, // any
-1, // "["
764, // "-"
-1, // "<"
-1, // "|"
-1, // " "
687, // "#"
-1, // "&"
-1, // ")"
-1, // ","
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
583, // "{"
-1, // {0..9 11..31 "$" "'" ":" "?" "\" "^" "`" "~"..127}
-1, // "%"
609, // "("
180, // "+"
-1, // "."
-1, // "_"
-1, // "="
630, // "@"
-1, // {10}
261, // "}"
-1, // "!"
552, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // `return
-1, // idChar*
-1, // $$1
-1, // digit*
-1, // $$2
-1, // hexDigit*
-1, // $$3
-1, // any*
-1, // $$4
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 124
2,162, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 125
158,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 126
0x80000000|131, // match move
0x80000000|330, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 127
0x80000000|250, // match move
0x80000000|233, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 128
117,MIN_REDUCTION+98, // " "
135,MIN_REDUCTION+98, // {10}
143,MIN_REDUCTION+98, // ws
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 129
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 130
0x80000000|441, // match move
0x80000000|89, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 131
158,MIN_REDUCTION+183, // $NT
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 132
0x80000000|470, // match move
0x80000000|430, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 133
116,249, // "|"
  }
,
{ // state 134
0x80000000|1, // match move
0x80000000|435, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 135
29,MIN_REDUCTION+224, // `[
113,MIN_REDUCTION+224, // "["
117,25, // " "
135,391, // {10}
143,269, // ws
158,MIN_REDUCTION+224, // $NT
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 136
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 137
51,735, // `||
134,133, // "@"
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 138
158,MIN_REDUCTION+94, // $NT
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 139
7,446, // ID
15,90, // `(
27,73, // `null
37,408, // <exp>
44,719, // <exp2>
45,691, // <exp3>
46,265, // <exp4>
47,311, // <exp5>
48,423, // <exp6>
49,346, // <exp7>
50,36, // <exp8>
53,360, // <equals>
54,523, // <not equals>
57,120, // <greater than>
58,46, // <less than>
59,703, // <gt equals>
60,539, // <lt equals>
61,337, // <instanceof>
67,525, // <plus>
68,595, // <minus>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,542, // "#"
129,609, // "("
130,180, // "+"
134,620, // "@"
138,552, // '"'
  }
,
{ // state 140
0x80000000|71, // match move
0x80000000|143, // no-match move
0x80000000|452, // NT-test-match state for <exp list>
  }
,
{ // state 141
2,768, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 142
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
318, // ID
147, // `{
-1, // <decl in class>*
-1, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
213, // `void
90, // `(
-1, // `)
29, // <stmt>*
-1, // <formal list rest>
-1, // `,
276, // <type>
-1, // <formal list>
-1, // <formal list rest>*
-1, // <formal list>?
-1, // $$0
150, // `int
459, // `boolean
132, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
483, // <stmt>
412, // <assign>
-1, // `;
23, // <local var decl>
498, // <if>
644, // <break>
48, // <exp>
-1, // `=
306, // `++
750, // `--
636, // `if
-1, // `else
681, // `break
719, // <exp2>
691, // <exp3>
265, // <exp4>
311, // <exp5>
423, // <exp6>
346, // <exp7>
36, // <exp8>
-1, // `||
-1, // `&&
360, // <equals>
523, // <not equals>
-1, // `==
-1, // `!=
120, // <greater than>
46, // <less than>
703, // <gt equals>
539, // <lt equals>
337, // <instanceof>
-1, // `>=
-1, // `<=
-1, // `>
-1, // `<
-1, // `instanceof
525, // <plus>
595, // <minus>
762, // `+
247, // `-
-1, // `*
-1, // `/
-1, // `%
485, // <cast exp>
437, // <unary exp>
196, // <exp9>
603, // `true
63, // `false
322, // `this
11, // `super
-1, // `.
734, // INTLIT
372, // STRINGLIT
-1, // <exp list>
564, // `new
594, // letter
503, // "a"
503, // "p"
503, // "s"
503, // "v"
503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
503, // "c"
503, // "f"
503, // "i"
503, // "l"
503, // "o"
503, // "r"
503, // "u"
503, // "b"
503, // "e"
503, // "h"
503, // "n"
503, // "t"
199, // letter128
168, // {199..218 231..250}
168, // {193..198 225..230}
-1, // digit
754, // {"1".."9"}
212, // "0"
130, // digit128
384, // {176..185}
-1, // any
-1, // "["
764, // "-"
-1, // "<"
-1, // "|"
-1, // " "
438, // "#"
-1, // "&"
-1, // ")"
-1, // ","
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
583, // "{"
-1, // {0..9 11..31 "$" "'" ":" "?" "\" "^" "`" "~"..127}
-1, // "%"
609, // "("
180, // "+"
-1, // "."
-1, // "_"
-1, // "="
630, // "@"
-1, // {10}
-1, // "}"
-1, // "!"
552, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
712, // `return
-1, // idChar*
-1, // $$1
-1, // digit*
-1, // $$2
-1, // hexDigit*
-1, // $$3
-1, // any*
-1, // $$4
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 143
16,MIN_REDUCTION+97, // `)
120,MIN_REDUCTION+97, // ")"
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 144
0x80000000|1, // match move
0x80000000|432, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 145
158,MIN_REDUCTION+86, // $NT
  }
,
{ // state 146
2,381, // ws*
29,MIN_REDUCTION+192, // `[
113,MIN_REDUCTION+192, // "["
117,320, // " "
135,737, // {10}
143,178, // ws
158,MIN_REDUCTION+192, // $NT
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 147
0x80000000|301, // match move
0x80000000|123, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 148
0x80000000|489, // match move
0x80000000|705, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 149
158,MIN_REDUCTION+76, // $NT
  }
,
{ // state 150
158,MIN_REDUCTION+14, // $NT
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 151
42,310, // `else
118,229, // "#"
  }
,
{ // state 152
86,501, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,188, // letter128
105,540, // {199..218 231..250}
106,540, // {193..198 225..230}
107,18, // digit
108,220, // {"1".."9"}
109,220, // "0"
110,62, // digit128
111,114, // {176..185}
132,727, // "_"
141,283, // {223}
146,397, // $$1
153,325, // idChar
154,549, // idChar128
  }
,
{ // state 153
0x80000000|51, // match move
0x80000000|597, // no-match move
0x80000000|452, // NT-test-match state for <exp list>
  }
,
{ // state 154
0x80000000|399, // match move
0x80000000|491, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 155
0x80000000|544, // match move
0x80000000|182, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 156
0x80000000|708, // match move
0x80000000|695, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 157
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
318, // ID
147, // `{
-1, // <decl in class>*
433, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
213, // `void
90, // `(
-1, // `)
-1, // <stmt>*
-1, // <formal list rest>
-1, // `,
276, // <type>
-1, // <formal list>
-1, // <formal list rest>*
-1, // <formal list>?
-1, // $$0
150, // `int
459, // `boolean
132, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
671, // <stmt>
412, // <assign>
-1, // `;
23, // <local var decl>
498, // <if>
644, // <break>
48, // <exp>
-1, // `=
306, // `++
750, // `--
636, // `if
-1, // `else
681, // `break
719, // <exp2>
691, // <exp3>
265, // <exp4>
311, // <exp5>
423, // <exp6>
346, // <exp7>
36, // <exp8>
-1, // `||
-1, // `&&
360, // <equals>
523, // <not equals>
-1, // `==
-1, // `!=
120, // <greater than>
46, // <less than>
703, // <gt equals>
539, // <lt equals>
337, // <instanceof>
-1, // `>=
-1, // `<=
-1, // `>
-1, // `<
-1, // `instanceof
525, // <plus>
595, // <minus>
762, // `+
247, // `-
-1, // `*
-1, // `/
-1, // `%
485, // <cast exp>
437, // <unary exp>
196, // <exp9>
603, // `true
63, // `false
322, // `this
11, // `super
-1, // `.
734, // INTLIT
372, // STRINGLIT
-1, // <exp list>
564, // `new
594, // letter
503, // "a"
503, // "p"
503, // "s"
503, // "v"
503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
503, // "c"
503, // "f"
503, // "i"
503, // "l"
503, // "o"
503, // "r"
503, // "u"
503, // "b"
503, // "e"
503, // "h"
503, // "n"
503, // "t"
199, // letter128
168, // {199..218 231..250}
168, // {193..198 225..230}
-1, // digit
754, // {"1".."9"}
212, // "0"
130, // digit128
384, // {176..185}
-1, // any
-1, // "["
764, // "-"
-1, // "<"
-1, // "|"
-1, // " "
687, // "#"
-1, // "&"
-1, // ")"
-1, // ","
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
583, // "{"
-1, // {0..9 11..31 "$" "'" ":" "?" "\" "^" "`" "~"..127}
-1, // "%"
609, // "("
180, // "+"
-1, // "."
-1, // "_"
-1, // "="
630, // "@"
-1, // {10}
261, // "}"
-1, // "!"
552, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // `return
-1, // idChar*
-1, // $$1
-1, // digit*
-1, // $$2
-1, // hexDigit*
-1, // $$3
-1, // any*
-1, // $$4
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 158
16,280, // `)
120,652, // ")"
  }
,
{ // state 159
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 160
117,486, // " "
135,648, // {10}
143,241, // ws
158,MIN_REDUCTION+171, // $NT
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 161
158,MIN_REDUCTION+82, // $NT
  }
,
{ // state 162
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 163
158,MIN_REDUCTION+212, // $NT
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 164
158,MIN_REDUCTION+87, // $NT
  }
,
{ // state 165
15,336, // `(
129,609, // "("
  }
,
{ // state 166
0x80000000|92, // match move
0x80000000|50, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 167
2,77, // ws*
  }
,
{ // state 168
0x80000000|108, // match move
0x80000000|428, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 169
28,699, // <empty bracket pair>
29,546, // `[
113,606, // "["
  }
,
{ // state 170
0x80000000|1, // match move
0x80000000|657, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 171
0x80000000|635, // match move
0x80000000|376, // no-match move
0x80000000|328, // NT-test-match state for `else
  }
,
{ // state 172
0x80000000|94, // match move
0x80000000|31, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 173
2,MIN_REDUCTION+92, // ws*
29,MIN_REDUCTION+92, // `[
113,MIN_REDUCTION+92, // "["
117,MIN_REDUCTION+92, // " "
135,MIN_REDUCTION+92, // {10}
158,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 174
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 175
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 176
0x80000000|371, // match move
0x80000000|554, // no-match move
0x80000000|452, // NT-test-match state for <exp list>
  }
,
{ // state 177
30,275, // `]
122,560, // "]"
  }
,
{ // state 178
0x80000000|163, // match move
0x80000000|68, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 179
158,MIN_REDUCTION+199, // $NT
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 180
2,380, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 181
0x80000000|1, // match move
0x80000000|506, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 182
29,MIN_REDUCTION+184, // `[
113,MIN_REDUCTION+184, // "["
158,MIN_REDUCTION+184, // $NT
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 183
0x80000000|445, // match move
0x80000000|342, // no-match move
0x80000000|328, // NT-test-match state for `else
  }
,
{ // state 184
158,MIN_REDUCTION+75, // $NT
  }
,
{ // state 185
0x80000000|496, // match move
0x80000000|146, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 186
158,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 187
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 188
0x80000000|100, // match move
0x80000000|482, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 189
158,MIN_REDUCTION+157, // $NT
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 190
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 191
117,411, // " "
135,670, // {10}
143,394, // ws
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 192
2,289, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
158,MIN_REDUCTION+100, // $NT
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 193
158,MIN_REDUCTION+73, // $NT
  }
,
{ // state 194
86,501, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,227, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
107,18, // digit
108,220, // {"1".."9"}
109,220, // "0"
110,352, // digit128
111,384, // {176..185}
132,727, // "_"
141,505, // {223}
146,126, // $$1
153,325, // idChar
154,121, // idChar128
  }
,
{ // state 195
33,718, // `;
51,735, // `||
124,124, // ";"
134,133, // "@"
  }
,
{ // state 196
0x80000000|193, // match move
0x80000000|632, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 197
29,MIN_REDUCTION+81, // `[
113,MIN_REDUCTION+81, // "["
158,MIN_REDUCTION+81, // $NT
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 198
95,675, // "l"
  }
,
{ // state 199
0x80000000|533, // match move
0x80000000|369, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 200
38,270, // `=
133,245, // "="
  }
,
{ // state 201
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 202
0x80000000|1, // match move
0x80000000|88, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 203
29,MIN_REDUCTION+78, // `[
113,MIN_REDUCTION+78, // "["
158,MIN_REDUCTION+78, // $NT
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 204
98,405, // "u"
100,65, // "e"
  }
,
{ // state 205
0x80000000|1, // match move
0x80000000|598, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 206
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
318, // ID
147, // `{
-1, // <decl in class>*
605, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
213, // `void
90, // `(
-1, // `)
-1, // <stmt>*
-1, // <formal list rest>
-1, // `,
276, // <type>
-1, // <formal list>
-1, // <formal list rest>*
-1, // <formal list>?
-1, // $$0
150, // `int
459, // `boolean
132, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
671, // <stmt>
412, // <assign>
-1, // `;
23, // <local var decl>
498, // <if>
644, // <break>
48, // <exp>
-1, // `=
306, // `++
750, // `--
636, // `if
-1, // `else
681, // `break
719, // <exp2>
691, // <exp3>
265, // <exp4>
311, // <exp5>
423, // <exp6>
346, // <exp7>
36, // <exp8>
-1, // `||
-1, // `&&
360, // <equals>
523, // <not equals>
-1, // `==
-1, // `!=
120, // <greater than>
46, // <less than>
703, // <gt equals>
539, // <lt equals>
337, // <instanceof>
-1, // `>=
-1, // `<=
-1, // `>
-1, // `<
-1, // `instanceof
525, // <plus>
595, // <minus>
762, // `+
247, // `-
-1, // `*
-1, // `/
-1, // `%
485, // <cast exp>
437, // <unary exp>
196, // <exp9>
603, // `true
63, // `false
322, // `this
11, // `super
-1, // `.
734, // INTLIT
372, // STRINGLIT
-1, // <exp list>
564, // `new
594, // letter
503, // "a"
503, // "p"
503, // "s"
503, // "v"
503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
503, // "c"
503, // "f"
503, // "i"
503, // "l"
503, // "o"
503, // "r"
503, // "u"
503, // "b"
503, // "e"
503, // "h"
503, // "n"
503, // "t"
199, // letter128
168, // {199..218 231..250}
168, // {193..198 225..230}
-1, // digit
754, // {"1".."9"}
212, // "0"
130, // digit128
384, // {176..185}
-1, // any
-1, // "["
764, // "-"
-1, // "<"
-1, // "|"
-1, // " "
687, // "#"
-1, // "&"
-1, // ")"
-1, // ","
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
583, // "{"
-1, // {0..9 11..31 "$" "'" ":" "?" "\" "^" "`" "~"..127}
-1, // "%"
609, // "("
180, // "+"
-1, // "."
-1, // "_"
-1, // "="
630, // "@"
-1, // {10}
32, // "}"
-1, // "!"
552, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // `return
-1, // idChar*
-1, // $$1
-1, // digit*
-1, // $$2
-1, // hexDigit*
-1, // $$3
-1, // any*
-1, // $$4
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 207
0x80000000|701, // match move
0x80000000|487, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 208
2,127, // ws*
29,MIN_REDUCTION+229, // `[
113,MIN_REDUCTION+229, // "["
117,320, // " "
135,737, // {10}
143,178, // ws
158,MIN_REDUCTION+229, // $NT
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 209
29,MIN_REDUCTION+79, // `[
113,MIN_REDUCTION+79, // "["
158,MIN_REDUCTION+79, // $NT
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 210
0x80000000|1, // match move
0x80000000|655, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 211
2,302, // ws*
29,MIN_REDUCTION+114, // `[
113,MIN_REDUCTION+114, // "["
117,320, // " "
135,737, // {10}
143,178, // ws
158,MIN_REDUCTION+114, // $NT
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 212
87,418, // "a"
88,418, // "p"
89,418, // "s"
90,418, // "v"
91,418, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,418, // "c"
93,418, // "f"
94,418, // "i"
95,418, // "l"
96,418, // "o"
97,418, // "r"
98,418, // "u"
99,418, // "b"
100,418, // "e"
101,418, // "h"
102,418, // "n"
103,418, // "t"
106,440, // {193..198 225..230}
108,418, // {"1".."9"}
109,418, // "0"
111,440, // {176..185}
149,365, // hexDigit*
150,756, // $$3
155,83, // hexDigit
156,653, // hexDigit128
  }
,
{ // state 213
158,MIN_REDUCTION+17, // $NT
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 214
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 215
0x80000000|1, // match move
0x80000000|548, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 216
0x80000000|385, // match move
0x80000000|427, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 217
2,555, // ws*
29,MIN_REDUCTION+225, // `[
113,MIN_REDUCTION+225, // "["
117,25, // " "
135,391, // {10}
143,478, // ws
158,MIN_REDUCTION+225, // $NT
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 218
0x80000000|1, // match move
0x80000000|510, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 219
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 220
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 221
2,686, // ws*
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 222
158,MIN_REDUCTION+98, // $NT
  }
,
{ // state 223
2,MIN_REDUCTION+200, // ws*
29,MIN_REDUCTION+200, // `[
113,MIN_REDUCTION+200, // "["
117,MIN_REDUCTION+200, // " "
135,MIN_REDUCTION+200, // {10}
158,MIN_REDUCTION+200, // $NT
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 224
0x80000000|35, // match move
0x80000000|3, // no-match move
0x80000000|452, // NT-test-match state for <exp list>
  }
,
{ // state 225
2,127, // ws*
158,MIN_REDUCTION+229, // $NT
  }
,
{ // state 226
0x80000000|1, // match move
0x80000000|4, // no-match move
0x80000000|452, // NT-test-match state for <exp list>
  }
,
{ // state 227
0x80000000|444, // match move
0x80000000|725, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 228
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 229
100,9, // "e"
  }
,
{ // state 230
0x80000000|690, // match move
0x80000000|116, // no-match move
0x80000000|452, // NT-test-match state for <exp list>
  }
,
{ // state 231
69,341, // `+
70,761, // `-
114,764, // "-"
130,180, // "+"
158,MIN_REDUCTION+58, // $NT
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 232
2,476, // ws*
158,MIN_REDUCTION+122, // $NT
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 233
29,MIN_REDUCTION+228, // `[
113,MIN_REDUCTION+228, // "["
117,320, // " "
135,737, // {10}
143,771, // ws
158,MIN_REDUCTION+228, // $NT
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 234
0x80000000|189, // match move
0x80000000|524, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 235
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 236
0x80000000|1, // match move
0x80000000|293, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 237
2,331, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 238
158,MIN_REDUCTION+94, // $NT
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 239
158,MIN_REDUCTION+200, // $NT
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 240
0x80000000|618, // match move
0x80000000|570, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 241
158,MIN_REDUCTION+211, // $NT
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 242
158,MIN_REDUCTION+186, // $NT
  }
,
{ // state 243
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 244
158,MIN_REDUCTION+71, // $NT
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 245
2,113, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 246
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 247
0x80000000|1, // match move
0x80000000|20, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 248
158,MIN_REDUCTION+19, // $NT
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 249
2,324, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 250
158,MIN_REDUCTION+228, // $NT
  }
,
{ // state 251
29,MIN_REDUCTION+184, // `[
113,MIN_REDUCTION+184, // "["
158,MIN_REDUCTION+184, // $NT
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 252
69,341, // `+
70,761, // `-
114,764, // "-"
130,180, // "+"
158,MIN_REDUCTION+56, // $NT
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 253
2,443, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 254
10,104, // `}
11,366, // <decl in class>
12,105, // <method decl>
13,749, // `public
118,274, // "#"
136,261, // "}"
  }
,
{ // state 255
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 256
98,569, // "u"
  }
,
{ // state 257
2,77, // ws*
158,MIN_REDUCTION+116, // $NT
  }
,
{ // state 258
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 259
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 260
2,390, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
158,MIN_REDUCTION+182, // $NT
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 261
2,37, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 262
158,MIN_REDUCTION+119, // $NT
  }
,
{ // state 263
2,234, // ws*
158,MIN_REDUCTION+158, // $NT
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 264
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 265
62,236, // `>=
63,66, // `<=
64,732, // `>
65,462, // `<
66,706, // `instanceof
115,237, // "<"
118,740, // "#"
125,53, // ">"
134,353, // "@"
158,MIN_REDUCTION+39, // $NT
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 266
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 267
0x80000000|91, // match move
0x80000000|587, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 268
0x80000000|169, // match move
0x80000000|248, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 269
0x80000000|575, // match move
0x80000000|643, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 270
0x80000000|1, // match move
0x80000000|406, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 271
29,MIN_REDUCTION+113, // `[
113,MIN_REDUCTION+113, // "["
117,320, // " "
135,737, // {10}
143,771, // ws
158,MIN_REDUCTION+113, // $NT
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 272
0x80000000|1, // match move
0x80000000|562, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 273
2,MIN_REDUCTION+199, // ws*
29,MIN_REDUCTION+199, // `[
113,MIN_REDUCTION+199, // "["
117,MIN_REDUCTION+199, // " "
135,MIN_REDUCTION+199, // {10}
158,MIN_REDUCTION+199, // $NT
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 274
88,256, // "p"
  }
,
{ // state 275
0x80000000|45, // match move
0x80000000|466, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 276
7,200, // ID
28,268, // <empty bracket pair>
29,177, // `[
86,279, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,260, // letter128
105,186, // {199..218 231..250}
106,186, // {193..198 225..230}
113,606, // "["
  }
,
{ // state 277
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 278
117,MIN_REDUCTION+211, // " "
135,MIN_REDUCTION+211, // {10}
143,MIN_REDUCTION+211, // ws
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 279
86,501, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,335, // letter128
105,186, // {199..218 231..250}
106,186, // {193..198 225..230}
107,18, // digit
108,220, // {"1".."9"}
109,220, // "0"
110,436, // digit128
111,407, // {176..185}
132,727, // "_"
141,585, // {223}
145,303, // idChar*
146,748, // $$1
153,638, // idChar
154,420, // idChar128
  }
,
{ // state 280
8,166, // `{
126,583, // "{"
  }
,
{ // state 281
0x80000000|357, // match move
0x80000000|86, // no-match move
0x80000000|452, // NT-test-match state for <exp list>
  }
,
{ // state 282
0x80000000|136, // match move
0x80000000|33, // no-match move
0x80000000|328, // NT-test-match state for `else
  }
,
{ // state 283
0x80000000|417, // match move
0x80000000|589, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 284
0x80000000|660, // match move
0x80000000|135, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 285
42,272, // `else
118,229, // "#"
  }
,
{ // state 286
0x80000000|1, // match move
0x80000000|157, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 287
0x80000000|707, // match move
0x80000000|664, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 288
0x80000000|424, // match move
0x80000000|415, // no-match move
0x80000000|328, // NT-test-match state for `else
  }
,
{ // state 289
117,486, // " "
135,648, // {10}
143,241, // ws
158,MIN_REDUCTION+99, // $NT
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 290
0x80000000|377, // match move
0x80000000|173, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 291
2,264, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 292
2,77, // ws*
29,MIN_REDUCTION+116, // `[
113,MIN_REDUCTION+116, // "["
117,320, // " "
135,737, // {10}
143,178, // ws
158,MIN_REDUCTION+116, // $NT
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 293
7,446, // ID
15,90, // `(
27,73, // `null
47,475, // <exp5>
48,423, // <exp6>
49,346, // <exp7>
50,36, // <exp8>
67,525, // <plus>
68,595, // <minus>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,542, // "#"
129,609, // "("
130,180, // "+"
134,620, // "@"
138,552, // '"'
  }
,
{ // state 294
0x80000000|1, // match move
0x80000000|481, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 295
0x80000000|508, // match move
0x80000000|599, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 296
29,546, // `[
113,606, // "["
  }
,
{ // state 297
2,686, // ws*
29,MIN_REDUCTION+182, // `[
113,MIN_REDUCTION+182, // "["
117,25, // " "
135,391, // {10}
143,478, // ws
158,MIN_REDUCTION+182, // $NT
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 298
8,526, // `{
126,583, // "{"
  }
,
{ // state 299
0x80000000|111, // match move
0x80000000|621, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 300
117,486, // " "
135,648, // {10}
143,241, // ws
158,MIN_REDUCTION+103, // $NT
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 301
17,600, // <stmt>*
  }
,
{ // state 302
0x80000000|650, // match move
0x80000000|271, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 303
86,501, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,335, // letter128
105,186, // {199..218 231..250}
106,186, // {193..198 225..230}
107,18, // digit
108,220, // {"1".."9"}
109,220, // "0"
110,436, // digit128
111,407, // {176..185}
132,727, // "_"
141,585, // {223}
146,574, // $$1
153,325, // idChar
154,420, // idChar128
  }
,
{ // state 304
2,555, // ws*
  }
,
{ // state 305
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
318, // ID
147, // `{
-1, // <decl in class>*
777, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
213, // `void
90, // `(
-1, // `)
-1, // <stmt>*
-1, // <formal list rest>
-1, // `,
276, // <type>
-1, // <formal list>
-1, // <formal list rest>*
-1, // <formal list>?
-1, // $$0
150, // `int
459, // `boolean
132, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
671, // <stmt>
412, // <assign>
-1, // `;
23, // <local var decl>
498, // <if>
644, // <break>
48, // <exp>
-1, // `=
306, // `++
750, // `--
636, // `if
-1, // `else
681, // `break
719, // <exp2>
691, // <exp3>
265, // <exp4>
311, // <exp5>
423, // <exp6>
346, // <exp7>
36, // <exp8>
-1, // `||
-1, // `&&
360, // <equals>
523, // <not equals>
-1, // `==
-1, // `!=
120, // <greater than>
46, // <less than>
703, // <gt equals>
539, // <lt equals>
337, // <instanceof>
-1, // `>=
-1, // `<=
-1, // `>
-1, // `<
-1, // `instanceof
525, // <plus>
595, // <minus>
762, // `+
247, // `-
-1, // `*
-1, // `/
-1, // `%
485, // <cast exp>
437, // <unary exp>
196, // <exp9>
603, // `true
63, // `false
322, // `this
11, // `super
-1, // `.
734, // INTLIT
372, // STRINGLIT
-1, // <exp list>
564, // `new
594, // letter
503, // "a"
503, // "p"
503, // "s"
503, // "v"
503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
503, // "c"
503, // "f"
503, // "i"
503, // "l"
503, // "o"
503, // "r"
503, // "u"
503, // "b"
503, // "e"
503, // "h"
503, // "n"
503, // "t"
199, // letter128
168, // {199..218 231..250}
168, // {193..198 225..230}
-1, // digit
754, // {"1".."9"}
212, // "0"
130, // digit128
384, // {176..185}
-1, // any
-1, // "["
764, // "-"
-1, // "<"
-1, // "|"
-1, // " "
687, // "#"
-1, // "&"
-1, // ")"
-1, // ","
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
583, // "{"
-1, // {0..9 11..31 "$" "'" ":" "?" "\" "^" "`" "~"..127}
-1, // "%"
609, // "("
180, // "+"
-1, // "."
-1, // "_"
-1, // "="
630, // "@"
-1, // {10}
261, // "}"
-1, // "!"
552, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // `return
-1, // idChar*
-1, // $$1
-1, // digit*
-1, // $$2
-1, // hexDigit*
-1, // $$3
-1, // any*
-1, // $$4
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 306
7,277, // ID
86,279, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,260, // letter128
105,186, // {199..218 231..250}
106,186, // {193..198 225..230}
  }
,
{ // state 307
7,446, // ID
15,90, // `(
27,73, // `null
74,469, // <cast exp>
76,679, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
118,542, // "#"
129,609, // "("
134,620, // "@"
138,552, // '"'
  }
,
{ // state 308
158,MIN_REDUCTION+78, // $NT
  }
,
{ // state 309
0x80000000|41, // match move
0x80000000|702, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 310
0x80000000|1, // match move
0x80000000|551, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 311
69,341, // `+
70,761, // `-
114,764, // "-"
130,180, // "+"
158,MIN_REDUCTION+40, // $NT
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 312
0x80000000|1, // match move
0x80000000|513, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 313
15,665, // `(
129,609, // "("
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 314
0x80000000|1, // match move
0x80000000|502, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 315
0x80000000|164, // match move
0x80000000|460, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 316
0x80000000|484, // match move
0x80000000|191, // no-match move
0x80000000|328, // NT-test-match state for `else
  }
,
{ // state 317
158,MIN_REDUCTION+117, // $NT
  }
,
{ // state 318
0x80000000|219, // match move
0x80000000|81, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 319
5,332, // <class decl>
6,658, // `class
118,44, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 320
0x80000000|584, // match move
0x80000000|622, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 321
157,MIN_REDUCTION+0, // $
  }
,
{ // state 322
0x80000000|308, // match move
0x80000000|203, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 323
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 324
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 325
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 326
7,446, // ID
15,90, // `(
27,73, // `null
50,607, // <exp8>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,542, // "#"
129,609, // "("
130,180, // "+"
134,620, // "@"
138,552, // '"'
  }
,
{ // state 327
2,300, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
158,MIN_REDUCTION+104, // $NT
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 328
118,229, // "#"
  }
,
{ // state 329
117,486, // " "
135,648, // {10}
143,241, // ws
158,MIN_REDUCTION+139, // $NT
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 330
29,MIN_REDUCTION+183, // `[
113,MIN_REDUCTION+183, // "["
158,MIN_REDUCTION+183, // $NT
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 331
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 332
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 333
158,MIN_REDUCTION+194, // $NT
  }
,
{ // state 334
2,MIN_REDUCTION+198, // ws*
29,MIN_REDUCTION+198, // `[
113,MIN_REDUCTION+198, // "["
117,MIN_REDUCTION+198, // " "
135,MIN_REDUCTION+198, // {10}
158,MIN_REDUCTION+198, // $NT
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 335
158,MIN_REDUCTION+198, // $NT
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 336
0x80000000|1, // match move
0x80000000|450, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 337
158,MIN_REDUCTION+54, // $NT
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 338
2,661, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 339
0x80000000|1, // match move
0x80000000|326, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 340
2,686, // ws*
158,MIN_REDUCTION+182, // $NT
  }
,
{ // state 341
0x80000000|1, // match move
0x80000000|416, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 342
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 343
0x80000000|145, // match move
0x80000000|461, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 344
87,93, // "a"
  }
,
{ // state 345
2,659, // ws*
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 346
71,339, // `*
72,210, // `/
73,629, // `%
123,493, // "/"
128,468, // "%"
139,97, // "*"
158,MIN_REDUCTION+42, // $NT
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 347
33,171, // `;
124,649, // ";"
  }
,
{ // state 348
2,413, // ws*
117,24, // " "
135,662, // {10}
143,84, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 349
2,413, // ws*
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 350
158,MIN_REDUCTION+89, // $NT
  }
,
{ // state 351
116,249, // "|"
119,119, // "&"
  }
,
{ // state 352
0x80000000|179, // match move
0x80000000|538, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 353
115,667, // "<"
116,249, // "|"
119,119, // "&"
125,338, // ">"
133,291, // "="
137,709, // "!"
  }
,
{ // state 354
15,224, // `(
129,153, // "("
  }
,
{ // state 355
0x80000000|317, // match move
0x80000000|429, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 356
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 357
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 358
0x80000000|134, // match move
0x80000000|155, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 359
96,192, // "o"
  }
,
{ // state 360
158,MIN_REDUCTION+46, // $NT
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 361
2,355, // ws*
29,MIN_REDUCTION+118, // `[
113,MIN_REDUCTION+118, // "["
117,320, // " "
135,737, // {10}
143,178, // ws
158,MIN_REDUCTION+118, // $NT
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 362
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 363
158,MIN_REDUCTION+16, // $NT
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 364
0x80000000|285, // match move
0x80000000|129, // no-match move
0x80000000|328, // NT-test-match state for `else
  }
,
{ // state 365
87,418, // "a"
88,418, // "p"
89,418, // "s"
90,418, // "v"
91,418, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,418, // "c"
93,418, // "f"
94,418, // "i"
95,418, // "l"
96,418, // "o"
97,418, // "r"
98,418, // "u"
99,418, // "b"
100,418, // "e"
101,418, // "h"
102,418, // "n"
103,418, // "t"
106,440, // {193..198 225..230}
108,418, // {"1".."9"}
109,418, // "0"
111,440, // {176..185}
150,716, // $$3
155,246, // hexDigit
156,653, // hexDigit128
  }
,
{ // state 366
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 367
29,MIN_REDUCTION+185, // `[
113,MIN_REDUCTION+185, // "["
158,MIN_REDUCTION+185, // $NT
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 368
0x80000000|333, // match move
0x80000000|759, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 369
2,216, // ws*
29,MIN_REDUCTION+182, // `[
113,MIN_REDUCTION+182, // "["
117,320, // " "
135,737, // {10}
143,178, // ws
158,MIN_REDUCTION+182, // $NT
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 370
0x80000000|49, // match move
0x80000000|666, // no-match move
0x80000000|452, // NT-test-match state for <exp list>
  }
,
{ // state 371
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 372
0x80000000|683, // match move
0x80000000|763, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 373
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 374
0x80000000|1, // match move
0x80000000|238, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 375
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 376
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 377
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 378
0x80000000|242, // match move
0x80000000|456, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 379
0x80000000|74, // match move
0x80000000|211, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 380
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 381
0x80000000|61, // match move
0x80000000|529, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 382
94,17, // "i"
99,359, // "b"
102,586, // "n"
  }
,
{ // state 383
2,148, // ws*
29,MIN_REDUCTION+231, // `[
113,MIN_REDUCTION+231, // "["
117,320, // " "
135,737, // {10}
143,178, // ws
158,MIN_REDUCTION+231, // $NT
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 384
0x80000000|138, // match move
0x80000000|464, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 385
158,MIN_REDUCTION+181, // $NT
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 386
2,234, // ws*
117,320, // " "
135,737, // {10}
143,178, // ws
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 387
158,MIN_REDUCTION+18, // $NT
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 388
158,MIN_REDUCTION+212, // $NT
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 389
28,268, // <empty bracket pair>
29,202, // `[
113,606, // "["
  }
,
{ // state 390
117,486, // " "
135,648, // {10}
143,241, // ws
158,MIN_REDUCTION+181, // $NT
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 391
0x80000000|714, // match move
0x80000000|739, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 392
7,5, // ID
86,279, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,260, // letter128
105,186, // {199..218 231..250}
106,186, // {193..198 225..230}
  }
,
{ // state 393
0x80000000|1, // match move
0x80000000|757, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 394
0x80000000|534, // match move
0x80000000|668, // no-match move
0x80000000|328, // NT-test-match state for `else
  }
,
{ // state 395
2,568, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
158,MIN_REDUCTION+158, // $NT
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 396
158,MIN_REDUCTION+77, // $NT
  }
,
{ // state 397
0x80000000|294, // match move
0x80000000|295, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 398
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 399
158,MIN_REDUCTION+187, // $NT
  }
,
{ // state 400
158,MIN_REDUCTION+211, // $NT
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 401
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 402
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 403
0x80000000|520, // match move
0x80000000|278, // no-match move
0x80000000|57, // NT-test-match state for `void
  }
,
{ // state 404
117,MIN_REDUCTION+97, // " "
135,MIN_REDUCTION+97, // {10}
143,MIN_REDUCTION+97, // ws
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 405
0x80000000|232, // match move
0x80000000|488, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 406
7,446, // ID
15,90, // `(
27,73, // `null
37,637, // <exp>
44,719, // <exp2>
45,691, // <exp3>
46,265, // <exp4>
47,311, // <exp5>
48,423, // <exp6>
49,346, // <exp7>
50,36, // <exp8>
53,360, // <equals>
54,523, // <not equals>
57,120, // <greater than>
58,46, // <less than>
59,703, // <gt equals>
60,539, // <lt equals>
61,337, // <instanceof>
67,525, // <plus>
68,595, // <minus>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,542, // "#"
129,609, // "("
130,180, // "+"
134,620, // "@"
138,552, // '"'
  }
,
{ // state 407
158,MIN_REDUCTION+94, // $NT
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 408
33,26, // `;
51,735, // `||
124,124, // ";"
134,133, // "@"
  }
,
{ // state 409
117,486, // " "
135,648, // {10}
143,241, // ws
158,MIN_REDUCTION+109, // $NT
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 410
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 411
0x80000000|565, // match move
0x80000000|404, // no-match move
0x80000000|328, // NT-test-match state for `else
  }
,
{ // state 412
33,323, // `;
124,124, // ";"
  }
,
{ // state 413
0x80000000|402, // match move
0x80000000|474, // no-match move
0x80000000|57, // NT-test-match state for `void
  }
,
{ // state 414
2,736, // ws*
29,MIN_REDUCTION+142, // `[
113,MIN_REDUCTION+142, // "["
117,320, // " "
135,737, // {10}
143,178, // ws
158,MIN_REDUCTION+142, // $NT
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 415
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 416
7,446, // ID
15,90, // `(
27,73, // `null
48,463, // <exp6>
49,346, // <exp7>
50,36, // <exp8>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,542, // "#"
129,609, // "("
130,180, // "+"
134,620, // "@"
138,552, // '"'
  }
,
{ // state 417
0x80000000|1, // match move
0x80000000|604, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 418
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 419
0x80000000|1, // match move
0x80000000|98, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 420
2,499, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
158,MIN_REDUCTION+225, // $NT
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 421
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 422
2,577, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
158,MIN_REDUCTION+122, // $NT
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 423
158,MIN_REDUCTION+41, // $NT
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 424
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 425
29,MIN_REDUCTION+212, // `[
113,MIN_REDUCTION+212, // "["
117,MIN_REDUCTION+212, // " "
135,MIN_REDUCTION+212, // {10}
143,MIN_REDUCTION+212, // ws
158,MIN_REDUCTION+212, // $NT
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 426
0x80000000|1, // match move
0x80000000|307, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 427
29,MIN_REDUCTION+181, // `[
113,MIN_REDUCTION+181, // "["
117,320, // " "
135,737, // {10}
143,771, // ws
158,MIN_REDUCTION+181, // $NT
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 428
29,MIN_REDUCTION+92, // `[
113,MIN_REDUCTION+92, // "["
158,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 429
29,MIN_REDUCTION+117, // `[
113,MIN_REDUCTION+117, // "["
117,320, // " "
135,737, // {10}
143,771, // ws
158,MIN_REDUCTION+117, // $NT
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 430
7,MIN_REDUCTION+18, // ID
29,MIN_REDUCTION+75, // `[
87,MIN_REDUCTION+18, // "a"
88,MIN_REDUCTION+18, // "p"
89,MIN_REDUCTION+18, // "s"
90,MIN_REDUCTION+18, // "v"
91,MIN_REDUCTION+18, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,MIN_REDUCTION+18, // "c"
93,MIN_REDUCTION+18, // "f"
94,MIN_REDUCTION+18, // "i"
95,MIN_REDUCTION+18, // "l"
96,MIN_REDUCTION+18, // "o"
97,MIN_REDUCTION+18, // "r"
98,MIN_REDUCTION+18, // "u"
99,MIN_REDUCTION+18, // "b"
100,MIN_REDUCTION+18, // "e"
101,MIN_REDUCTION+18, // "h"
102,MIN_REDUCTION+18, // "n"
103,MIN_REDUCTION+18, // "t"
105,MIN_REDUCTION+18, // {199..218 231..250}
106,MIN_REDUCTION+18, // {193..198 225..230}
113,MIN_REDUCTION+75, // "["
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 431
7,446, // ID
15,90, // `(
27,73, // `null
37,67, // <exp>
44,719, // <exp2>
45,691, // <exp3>
46,265, // <exp4>
47,311, // <exp5>
48,423, // <exp6>
49,346, // <exp7>
50,36, // <exp8>
53,360, // <equals>
54,523, // <not equals>
57,120, // <greater than>
58,46, // <less than>
59,703, // <gt equals>
60,539, // <lt equals>
61,337, // <instanceof>
67,525, // <plus>
68,595, // <minus>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,542, // "#"
129,609, // "("
130,180, // "+"
134,620, // "@"
138,552, // '"'
  }
,
{ // state 432
158,MIN_REDUCTION+212, // $NT
  }
,
{ // state 433
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 434
29,MIN_REDUCTION+200, // `[
113,MIN_REDUCTION+200, // "["
158,MIN_REDUCTION+200, // $NT
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 435
158,MIN_REDUCTION+184, // $NT
  }
,
{ // state 436
158,MIN_REDUCTION+199, // $NT
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 437
158,MIN_REDUCTION+68, // $NT
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 438
89,458, // "s"
90,106, // "v"
93,344, // "f"
94,17, // "i"
97,2, // "r"
99,556, // "b"
102,204, // "n"
103,640, // "t"
130,42, // "+"
  }
,
{ // state 439
7,446, // ID
15,90, // `(
27,73, // `null
47,231, // <exp5>
48,423, // <exp6>
49,346, // <exp7>
50,36, // <exp8>
67,525, // <plus>
68,595, // <minus>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,542, // "#"
129,609, // "("
130,180, // "+"
134,620, // "@"
138,552, // '"'
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
{ // state 440
0x80000000|742, // match move
0x80000000|27, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 441
2,154, // ws*
158,MIN_REDUCTION+188, // $NT
  }
,
{ // state 442
2,207, // ws*
29,MIN_REDUCTION+227, // `[
113,MIN_REDUCTION+227, // "["
117,320, // " "
135,737, // {10}
143,178, // ws
158,MIN_REDUCTION+227, // $NT
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 443
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 444
158,MIN_REDUCTION+198, // $NT
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 445
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 446
0x80000000|28, // match move
0x80000000|448, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 447
29,MIN_REDUCTION+75, // `[
113,MIN_REDUCTION+75, // "["
158,MIN_REDUCTION+75, // $NT
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 448
15,226, // `(
29,MIN_REDUCTION+74, // `[
113,MIN_REDUCTION+74, // "["
129,514, // "("
158,MIN_REDUCTION+74, // $NT
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 449
158,MIN_REDUCTION+211, // $NT
  }
,
{ // state 450
7,446, // ID
15,90, // `(
27,73, // `null
37,765, // <exp>
44,719, // <exp2>
45,691, // <exp3>
46,265, // <exp4>
47,311, // <exp5>
48,423, // <exp6>
49,346, // <exp7>
50,36, // <exp8>
53,360, // <equals>
54,523, // <not equals>
57,120, // <greater than>
58,46, // <less than>
59,703, // <gt equals>
60,539, // <lt equals>
61,337, // <instanceof>
67,525, // <plus>
68,595, // <minus>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,542, // "#"
129,609, // "("
130,180, // "+"
134,620, // "@"
138,552, // '"'
  }
,
{ // state 451
19,731, // `,
51,735, // `||
121,536, // ","
134,133, // "@"
158,MIN_REDUCTION+85, // $NT
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 452
0x80000000|1, // match move
0x80000000|64, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 453
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 454
2,148, // ws*
  }
,
{ // state 455
30,156, // `]
51,735, // `||
122,560, // "]"
134,133, // "@"
  }
,
{ // state 456
29,MIN_REDUCTION+186, // `[
113,MIN_REDUCTION+186, // "["
158,MIN_REDUCTION+186, // $NT
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 457
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 458
98,775, // "u"
  }
,
{ // state 459
158,MIN_REDUCTION+15, // $NT
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 460
29,MIN_REDUCTION+87, // `[
113,MIN_REDUCTION+87, // "["
158,MIN_REDUCTION+87, // $NT
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 461
29,MIN_REDUCTION+86, // `[
113,MIN_REDUCTION+86, // "["
158,MIN_REDUCTION+86, // $NT
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 462
0x80000000|1, // match move
0x80000000|439, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 463
158,MIN_REDUCTION+62, // $NT
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 464
29,MIN_REDUCTION+94, // `[
113,MIN_REDUCTION+94, // "["
158,MIN_REDUCTION+94, // $NT
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 465
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 466
158,MIN_REDUCTION+21, // $NT
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 467
2,710, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
158,MIN_REDUCTION+106, // $NT
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 468
2,6, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 469
158,MIN_REDUCTION+69, // $NT
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 470
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 471
7,MIN_REDUCTION+98, // ID
16,MIN_REDUCTION+98, // `)
29,MIN_REDUCTION+98, // `[
87,MIN_REDUCTION+98, // "a"
88,MIN_REDUCTION+98, // "p"
89,MIN_REDUCTION+98, // "s"
90,MIN_REDUCTION+98, // "v"
91,MIN_REDUCTION+98, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,MIN_REDUCTION+98, // "c"
93,MIN_REDUCTION+98, // "f"
94,MIN_REDUCTION+98, // "i"
95,MIN_REDUCTION+98, // "l"
96,MIN_REDUCTION+98, // "o"
97,MIN_REDUCTION+98, // "r"
98,MIN_REDUCTION+98, // "u"
99,MIN_REDUCTION+98, // "b"
100,MIN_REDUCTION+98, // "e"
101,MIN_REDUCTION+98, // "h"
102,MIN_REDUCTION+98, // "n"
103,MIN_REDUCTION+98, // "t"
105,MIN_REDUCTION+98, // {199..218 231..250}
106,MIN_REDUCTION+98, // {193..198 225..230}
113,MIN_REDUCTION+98, // "["
120,MIN_REDUCTION+98, // ")"
158,MIN_REDUCTION+98, // $NT
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 472
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 473
15,654, // `(
129,609, // "("
  }
,
{ // state 474
117,24, // " "
135,662, // {10}
143,403, // ws
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 475
69,341, // `+
70,761, // `-
114,764, // "-"
130,180, // "+"
158,MIN_REDUCTION+55, // $NT
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 476
0x80000000|616, // match move
0x80000000|571, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 477
117,320, // " "
135,737, // {10}
143,771, // ws
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 478
0x80000000|144, // match move
0x80000000|56, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 479
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 480
29,MIN_REDUCTION+181, // `[
113,MIN_REDUCTION+181, // "["
117,25, // " "
135,391, // {10}
143,269, // ws
158,MIN_REDUCTION+181, // $NT
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 481
158,MIN_REDUCTION+183, // $NT
  }
,
{ // state 482
0x80000000|243, // match move
0x80000000|334, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 483
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 484
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 485
158,MIN_REDUCTION+67, // $NT
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 486
158,MIN_REDUCTION+97, // $NT
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 487
29,MIN_REDUCTION+226, // `[
113,MIN_REDUCTION+226, // "["
117,320, // " "
135,737, // {10}
143,771, // ws
158,MIN_REDUCTION+226, // $NT
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 488
2,476, // ws*
29,MIN_REDUCTION+122, // `[
113,MIN_REDUCTION+122, // "["
117,320, // " "
135,737, // {10}
143,178, // ws
158,MIN_REDUCTION+122, // $NT
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 489
158,MIN_REDUCTION+230, // $NT
  }
,
{ // state 490
2,381, // ws*
  }
,
{ // state 491
29,MIN_REDUCTION+187, // `[
113,MIN_REDUCTION+187, // "["
117,320, // " "
135,737, // {10}
143,771, // ws
158,MIN_REDUCTION+187, // $NT
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 492
2,409, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
158,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 493
2,259, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 494
14,392, // `void
118,43, // "#"
  }
,
{ // state 495
158,MIN_REDUCTION+97, // $NT
  }
,
{ // state 496
2,381, // ws*
158,MIN_REDUCTION+192, // $NT
  }
,
{ // state 497
2,545, // ws*
29,MIN_REDUCTION+120, // `[
113,MIN_REDUCTION+120, // "["
117,320, // " "
135,737, // {10}
143,178, // ws
158,MIN_REDUCTION+120, // $NT
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 498
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 499
117,486, // " "
135,648, // {10}
143,241, // ws
158,MIN_REDUCTION+224, // $NT
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 500
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 501
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 502
158,MIN_REDUCTION+224, // $NT
  }
,
{ // state 503
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 504
0x80000000|596, // match move
0x80000000|442, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 505
0x80000000|239, // match move
0x80000000|434, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 506
2,555, // ws*
158,MIN_REDUCTION+225, // $NT
  }
,
{ // state 507
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 508
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 509
158,MIN_REDUCTION+185, // $NT
  }
,
{ // state 510
7,446, // ID
15,90, // `(
27,73, // `null
45,16, // <exp3>
46,265, // <exp4>
47,311, // <exp5>
48,423, // <exp6>
49,346, // <exp7>
50,36, // <exp8>
53,360, // <equals>
54,523, // <not equals>
57,120, // <greater than>
58,46, // <less than>
59,703, // <gt equals>
60,539, // <lt equals>
61,337, // <instanceof>
67,525, // <plus>
68,595, // <minus>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,542, // "#"
129,609, // "("
130,180, // "+"
134,620, // "@"
138,552, // '"'
  }
,
{ // state 511
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 512
29,MIN_REDUCTION+76, // `[
113,MIN_REDUCTION+76, // "["
158,MIN_REDUCTION+76, // $NT
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 513
7,446, // ID
15,90, // `(
27,73, // `null
37,455, // <exp>
44,719, // <exp2>
45,691, // <exp3>
46,265, // <exp4>
47,311, // <exp5>
48,423, // <exp6>
49,346, // <exp7>
50,36, // <exp8>
53,360, // <equals>
54,523, // <not equals>
57,120, // <greater than>
58,46, // <less than>
59,703, // <gt equals>
60,539, // <lt equals>
61,337, // <instanceof>
67,525, // <plus>
68,595, // <minus>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,542, // "#"
129,609, // "("
130,180, // "+"
134,620, // "@"
138,552, // '"'
  }
,
{ // state 514
0x80000000|588, // match move
0x80000000|674, // no-match move
0x80000000|452, // NT-test-match state for <exp list>
  }
,
{ // state 515
131,704, // "."
  }
,
{ // state 516
2,736, // ws*
  }
,
{ // state 517
0x80000000|350, // match move
0x80000000|633, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 518
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 519
2,127, // ws*
  }
,
{ // state 520
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 521
29,MIN_REDUCTION+98, // `[
113,MIN_REDUCTION+98, // "["
117,MIN_REDUCTION+98, // " "
135,MIN_REDUCTION+98, // {10}
143,MIN_REDUCTION+98, // ws
158,MIN_REDUCTION+98, // $NT
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 522
117,MIN_REDUCTION+97, // " "
135,MIN_REDUCTION+97, // {10}
143,MIN_REDUCTION+97, // ws
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 523
158,MIN_REDUCTION+47, // $NT
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 524
30,MIN_REDUCTION+157, // `]
33,MIN_REDUCTION+157, // `;
38,MIN_REDUCTION+157, // `=
62,MIN_REDUCTION+157, // `>=
64,MIN_REDUCTION+157, // `>
66,MIN_REDUCTION+157, // `instanceof
69,MIN_REDUCTION+157, // `+
70,MIN_REDUCTION+157, // `-
71,MIN_REDUCTION+157, // `*
72,MIN_REDUCTION+157, // `/
73,MIN_REDUCTION+157, // `%
81,MIN_REDUCTION+157, // `.
114,MIN_REDUCTION+157, // "-"
117,320, // " "
118,MIN_REDUCTION+157, // "#"
122,MIN_REDUCTION+157, // "]"
123,MIN_REDUCTION+157, // "/"
124,MIN_REDUCTION+157, // ";"
125,MIN_REDUCTION+157, // ">"
128,MIN_REDUCTION+157, // "%"
130,MIN_REDUCTION+157, // "+"
131,MIN_REDUCTION+157, // "."
133,MIN_REDUCTION+157, // "="
135,737, // {10}
139,MIN_REDUCTION+157, // "*"
143,771, // ws
158,MIN_REDUCTION+157, // $NT
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 525
158,MIN_REDUCTION+60, // $NT
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 526
0x80000000|624, // match move
0x80000000|142, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 527
7,446, // ID
15,90, // `(
27,73, // `null
37,195, // <exp>
44,719, // <exp2>
45,691, // <exp3>
46,265, // <exp4>
47,311, // <exp5>
48,423, // <exp6>
49,346, // <exp7>
50,36, // <exp8>
53,360, // <equals>
54,523, // <not equals>
57,120, // <greater than>
58,46, // <less than>
59,703, // <gt equals>
60,539, // <lt equals>
61,337, // <instanceof>
67,525, // <plus>
68,595, // <minus>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,542, // "#"
129,609, // "("
130,180, // "+"
134,620, // "@"
138,552, // '"'
  }
,
{ // state 528
0x80000000|509, // match move
0x80000000|367, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 529
29,MIN_REDUCTION+191, // `[
113,MIN_REDUCTION+191, // "["
117,320, // " "
135,737, // {10}
143,771, // ws
158,MIN_REDUCTION+191, // $NT
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 530
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 531
0x80000000|1, // match move
0x80000000|115, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 532
2,316, // ws*
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 533
2,216, // ws*
158,MIN_REDUCTION+182, // $NT
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 534
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 535
2,355, // ws*
158,MIN_REDUCTION+118, // $NT
  }
,
{ // state 536
2,375, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 537
7,446, // ID
15,90, // `(
27,73, // `null
37,451, // <exp>
44,719, // <exp2>
45,691, // <exp3>
46,265, // <exp4>
47,311, // <exp5>
48,423, // <exp6>
49,346, // <exp7>
50,36, // <exp8>
53,360, // <equals>
54,523, // <not equals>
57,120, // <greater than>
58,46, // <less than>
59,703, // <gt equals>
60,539, // <lt equals>
61,337, // <instanceof>
67,525, // <plus>
68,595, // <minus>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
84,102, // <exp list>
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,542, // "#"
129,609, // "("
130,180, // "+"
134,620, // "@"
138,552, // '"'
  }
,
{ // state 538
29,MIN_REDUCTION+199, // `[
113,MIN_REDUCTION+199, // "["
158,MIN_REDUCTION+199, // $NT
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 539
158,MIN_REDUCTION+53, // $NT
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 540
0x80000000|715, // match move
0x80000000|290, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 541
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 542
89,458, // "s"
93,344, // "f"
102,204, // "n"
103,640, // "t"
  }
,
{ // state 543
8,696, // `{
126,583, // "{"
  }
,
{ // state 544
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 545
0x80000000|262, // match move
0x80000000|656, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 546
30,19, // `]
122,395, // "]"
  }
,
{ // state 547
158,MIN_REDUCTION+79, // $NT
  }
,
{ // state 548
158,MIN_REDUCTION+181, // $NT
  }
,
{ // state 549
0x80000000|181, // match move
0x80000000|60, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 550
0x80000000|354, // match move
0x80000000|197, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 551
7,318, // ID
8,694, // `{
14,213, // `void
15,90, // `(
20,276, // <type>
25,150, // `int
26,459, // `boolean
27,132, // `null
31,282, // <stmt>
32,347, // <assign>
34,59, // <local var decl>
35,78, // <if>
36,85, // <break>
37,48, // <exp>
39,306, // `++
40,750, // `--
41,165, // `if
43,713, // `break
44,719, // <exp2>
45,691, // <exp3>
46,265, // <exp4>
47,311, // <exp5>
48,423, // <exp6>
49,346, // <exp7>
50,36, // <exp8>
53,360, // <equals>
54,523, // <not equals>
57,120, // <greater than>
58,46, // <less than>
59,703, // <gt equals>
60,539, // <lt equals>
61,337, // <instanceof>
67,525, // <plus>
68,595, // <minus>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,687, // "#"
126,583, // "{"
129,609, // "("
130,180, // "+"
134,630, // "@"
138,552, // '"'
  }
,
{ // state 552
87,201, // "a"
88,201, // "p"
89,201, // "s"
90,201, // "v"
91,201, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,201, // "c"
93,201, // "f"
94,201, // "i"
95,201, // "l"
96,201, // "o"
97,201, // "r"
98,201, // "u"
99,201, // "b"
100,201, // "e"
101,201, // "h"
102,201, // "n"
103,201, // "t"
105,287, // {199..218 231..250}
106,287, // {193..198 225..230}
108,201, // {"1".."9"}
109,201, // "0"
111,287, // {176..185}
112,174, // any
113,201, // "["
114,201, // "-"
115,201, // "<"
116,201, // "|"
117,201, // " "
118,201, // "#"
119,201, // "&"
120,201, // ")"
121,201, // ","
122,201, // "]"
123,201, // "/"
124,201, // ";"
125,201, // ">"
126,201, // "{"
127,201, // {0..9 11..31 "$" "'" ":" "?" "\" "^" "`" "~"..127}
128,201, // "%"
129,201, // "("
130,201, // "+"
131,201, // "."
132,201, // "_"
133,201, // "="
134,201, // "@"
135,201, // {10}
136,201, // "}"
137,201, // "!"
138,201, // '"'
139,201, // "*"
140,47, // any128
141,287, // {223}
142,287, // {128..175 186..192 219..222 224 251..255}
151,573, // any*
152,368, // $$4
  }
,
{ // state 553
0x80000000|1, // match move
0x80000000|495, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 554
16,MIN_REDUCTION+212, // `)
120,MIN_REDUCTION+212, // ")"
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 555
0x80000000|314, // match move
0x80000000|284, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 556
96,192, // "o"
97,663, // "r"
  }
,
{ // state 557
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 558
2,207, // ws*
  }
,
{ // state 559
16,298, // `)
24,373, // $$0
120,652, // ")"
  }
,
{ // state 560
0x80000000|263, // match move
0x80000000|677, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 561
2,154, // ws*
  }
,
{ // state 562
7,318, // ID
8,147, // `{
14,213, // `void
15,90, // `(
20,276, // <type>
25,150, // `int
26,459, // `boolean
27,132, // `null
31,457, // <stmt>
32,412, // <assign>
34,23, // <local var decl>
35,498, // <if>
36,644, // <break>
37,48, // <exp>
39,306, // `++
40,750, // `--
41,636, // `if
43,681, // `break
44,719, // <exp2>
45,691, // <exp3>
46,265, // <exp4>
47,311, // <exp5>
48,423, // <exp6>
49,346, // <exp7>
50,36, // <exp8>
53,360, // <equals>
54,523, // <not equals>
57,120, // <greater than>
58,46, // <less than>
59,703, // <gt equals>
60,539, // <lt equals>
61,337, // <instanceof>
67,525, // <plus>
68,595, // <minus>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,687, // "#"
126,583, // "{"
129,609, // "("
130,180, // "+"
134,630, // "@"
138,552, // '"'
  }
,
{ // state 563
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 564
7,313, // ID
14,213, // `void
20,389, // <type>
25,150, // `int
26,459, // `boolean
27,387, // `null
86,279, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,260, // letter128
105,186, // {199..218 231..250}
106,186, // {193..198 225..230}
118,646, // "#"
  }
,
{ // state 565
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 566
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 567
7,446, // ID
15,90, // `(
27,73, // `null
44,692, // <exp2>
45,691, // <exp3>
46,265, // <exp4>
47,311, // <exp5>
48,423, // <exp6>
49,346, // <exp7>
50,36, // <exp8>
53,360, // <equals>
54,523, // <not equals>
57,120, // <greater than>
58,46, // <less than>
59,703, // <gt equals>
60,539, // <lt equals>
61,337, // <instanceof>
67,525, // <plus>
68,595, // <minus>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,542, // "#"
129,609, // "("
130,180, // "+"
134,620, // "@"
138,552, // '"'
  }
,
{ // state 568
117,486, // " "
135,648, // {10}
143,241, // ws
158,MIN_REDUCTION+157, // $NT
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 569
0x80000000|349, // match move
0x80000000|348, // no-match move
0x80000000|57, // NT-test-match state for `void
  }
,
{ // state 570
29,MIN_REDUCTION+88, // `[
113,MIN_REDUCTION+88, // "["
158,MIN_REDUCTION+88, // $NT
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 571
29,MIN_REDUCTION+121, // `[
113,MIN_REDUCTION+121, // "["
117,320, // " "
135,737, // {10}
143,771, // ws
158,MIN_REDUCTION+121, // $NT
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 572
116,249, // "|"
119,119, // "&"
133,291, // "="
137,709, // "!"
  }
,
{ // state 573
87,201, // "a"
88,201, // "p"
89,201, // "s"
90,201, // "v"
91,201, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,201, // "c"
93,201, // "f"
94,201, // "i"
95,201, // "l"
96,201, // "o"
97,201, // "r"
98,201, // "u"
99,201, // "b"
100,201, // "e"
101,201, // "h"
102,201, // "n"
103,201, // "t"
105,287, // {199..218 231..250}
106,287, // {193..198 225..230}
108,201, // {"1".."9"}
109,201, // "0"
111,287, // {176..185}
112,720, // any
113,201, // "["
114,201, // "-"
115,201, // "<"
116,201, // "|"
117,201, // " "
118,201, // "#"
119,201, // "&"
120,201, // ")"
121,201, // ","
122,201, // "]"
123,201, // "/"
124,201, // ";"
125,201, // ">"
126,201, // "{"
127,201, // {0..9 11..31 "$" "'" ":" "?" "\" "^" "`" "~"..127}
128,201, // "%"
129,201, // "("
130,201, // "+"
131,201, // "."
132,201, // "_"
133,201, // "="
134,201, // "@"
135,201, // {10}
136,201, // "}"
137,201, // "!"
138,201, // '"'
139,201, // "*"
140,47, // any128
141,287, // {223}
142,287, // {128..175 186..192 219..222 224 251..255}
152,172, // $$4
  }
,
{ // state 574
158,MIN_REDUCTION+183, // $NT
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 575
0x80000000|1, // match move
0x80000000|449, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 576
7,446, // ID
15,90, // `(
27,73, // `null
47,684, // <exp5>
48,423, // <exp6>
49,346, // <exp7>
50,36, // <exp8>
67,525, // <plus>
68,595, // <minus>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,542, // "#"
129,609, // "("
130,180, // "+"
134,620, // "@"
138,552, // '"'
  }
,
{ // state 577
117,486, // " "
135,648, // {10}
143,241, // ws
158,MIN_REDUCTION+121, // $NT
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 578
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 579
158,MIN_REDUCTION+98, // $NT
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 580
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 581
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 582
158,MIN_REDUCTION+198, // $NT
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 583
2,592, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 584
158,MIN_REDUCTION+97, // $NT
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 585
158,MIN_REDUCTION+200, // $NT
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 586
98,422, // "u"
  }
,
{ // state 587
29,MIN_REDUCTION+97, // `[
113,MIN_REDUCTION+97, // "["
117,MIN_REDUCTION+97, // " "
135,MIN_REDUCTION+97, // {10}
143,MIN_REDUCTION+97, // ws
158,MIN_REDUCTION+97, // $NT
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 588
2,55, // ws*
  }
,
{ // state 589
0x80000000|356, // match move
0x80000000|223, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 590
2,355, // ws*
  }
,
{ // state 591
16,426, // `)
28,268, // <empty bracket pair>
29,177, // `[
113,606, // "["
120,652, // ")"
  }
,
{ // state 592
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 593
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 594
86,501, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,227, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
107,18, // digit
108,220, // {"1".."9"}
109,220, // "0"
110,352, // digit128
111,384, // {176..185}
132,727, // "_"
141,505, // {223}
145,194, // idChar*
146,615, // $$1
153,638, // idChar
154,121, // idChar128
  }
,
{ // state 595
158,MIN_REDUCTION+61, // $NT
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 596
2,207, // ws*
158,MIN_REDUCTION+227, // $NT
  }
,
{ // state 597
2,230, // ws*
117,140, // " "
135,281, // {10}
143,176, // ws
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 598
7,318, // ID
8,694, // `{
14,213, // `void
15,90, // `(
20,276, // <type>
25,150, // `int
26,459, // `boolean
27,132, // `null
31,364, // <stmt>
32,347, // <assign>
34,59, // <local var decl>
35,78, // <if>
36,85, // <break>
37,48, // <exp>
39,306, // `++
40,750, // `--
41,165, // `if
43,713, // `break
44,719, // <exp2>
45,691, // <exp3>
46,265, // <exp4>
47,311, // <exp5>
48,423, // <exp6>
49,346, // <exp7>
50,36, // <exp8>
53,360, // <equals>
54,523, // <not equals>
57,120, // <greater than>
58,46, // <less than>
59,703, // <gt equals>
60,539, // <lt equals>
61,337, // <instanceof>
67,525, // <plus>
68,595, // <minus>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,687, // "#"
126,583, // "{"
129,609, // "("
130,180, // "+"
134,630, // "@"
138,552, // '"'
  }
,
{ // state 599
29,MIN_REDUCTION+183, // `[
113,MIN_REDUCTION+183, // "["
158,MIN_REDUCTION+183, // $NT
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 600
0x80000000|1, // match move
0x80000000|305, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 601
29,MIN_REDUCTION+115, // `[
113,MIN_REDUCTION+115, // "["
117,320, // " "
135,737, // {10}
143,771, // ws
158,MIN_REDUCTION+115, // $NT
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 602
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 603
0x80000000|149, // match move
0x80000000|512, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 604
158,MIN_REDUCTION+200, // $NT
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 605
0x80000000|566, // match move
0x80000000|266, // no-match move
0x80000000|328, // NT-test-match state for `else
  }
,
{ // state 606
2,541, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 607
158,MIN_REDUCTION+64, // $NT
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 608
2,309, // ws*
29,MIN_REDUCTION+225, // `[
113,MIN_REDUCTION+225, // "["
117,320, // " "
135,737, // {10}
143,178, // ws
158,MIN_REDUCTION+225, // $NT
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 609
2,329, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
158,MIN_REDUCTION+140, // $NT
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 610
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 611
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 612
7,446, // ID
15,90, // `(
27,73, // `null
47,252, // <exp5>
48,423, // <exp6>
49,346, // <exp7>
50,36, // <exp8>
67,525, // <plus>
68,595, // <minus>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,542, // "#"
129,609, // "("
130,180, // "+"
134,620, // "@"
138,552, // '"'
  }
,
{ // state 613
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 614
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 615
0x80000000|744, // match move
0x80000000|251, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 616
158,MIN_REDUCTION+121, // $NT
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 617
2,545, // ws*
158,MIN_REDUCTION+120, // $NT
  }
,
{ // state 618
158,MIN_REDUCTION+88, // $NT
  }
,
{ // state 619
29,MIN_REDUCTION+141, // `[
113,MIN_REDUCTION+141, // "["
117,320, // " "
135,737, // {10}
143,771, // ws
158,MIN_REDUCTION+141, // $NT
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 620
138,185, // '"'
  }
,
{ // state 621
29,MIN_REDUCTION+90, // `[
113,MIN_REDUCTION+90, // "["
158,MIN_REDUCTION+90, // $NT
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 622
7,MIN_REDUCTION+97, // ID
29,MIN_REDUCTION+97, // `[
87,MIN_REDUCTION+97, // "a"
88,MIN_REDUCTION+97, // "p"
89,MIN_REDUCTION+97, // "s"
90,MIN_REDUCTION+97, // "v"
91,MIN_REDUCTION+97, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,MIN_REDUCTION+97, // "c"
93,MIN_REDUCTION+97, // "f"
94,MIN_REDUCTION+97, // "i"
95,MIN_REDUCTION+97, // "l"
96,MIN_REDUCTION+97, // "o"
97,MIN_REDUCTION+97, // "r"
98,MIN_REDUCTION+97, // "u"
99,MIN_REDUCTION+97, // "b"
100,MIN_REDUCTION+97, // "e"
101,MIN_REDUCTION+97, // "h"
102,MIN_REDUCTION+97, // "n"
103,MIN_REDUCTION+97, // "t"
105,MIN_REDUCTION+97, // {199..218 231..250}
106,MIN_REDUCTION+97, // {193..198 225..230}
113,MIN_REDUCTION+97, // "["
158,MIN_REDUCTION+97, // $NT
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 623
17,673, // <stmt>*
  }
,
{ // state 624
17,29, // <stmt>*
  }
,
{ // state 625
117,MIN_REDUCTION+98, // " "
135,MIN_REDUCTION+98, // {10}
143,MIN_REDUCTION+98, // ws
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 626
102,141, // "n"
  }
,
{ // state 627
2,MIN_REDUCTION+94, // ws*
29,MIN_REDUCTION+94, // `[
113,MIN_REDUCTION+94, // "["
117,MIN_REDUCTION+94, // " "
135,MIN_REDUCTION+94, // {10}
158,MIN_REDUCTION+94, // $NT
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 628
7,363, // ID
20,80, // <type>
25,150, // `int
26,459, // `boolean
27,387, // `null
86,279, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,260, // letter128
105,186, // {199..218 231..250}
106,186, // {193..198 225..230}
118,382, // "#"
  }
,
{ // state 629
0x80000000|1, // match move
0x80000000|766, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 630
114,772, // "-"
130,688, // "+"
138,185, // '"'
  }
,
{ // state 631
29,MIN_REDUCTION+77, // `[
113,MIN_REDUCTION+77, // "["
158,MIN_REDUCTION+77, // $NT
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 632
29,312, // `[
81,745, // `.
113,606, // "["
131,704, // "."
158,MIN_REDUCTION+73, // $NT
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 633
29,MIN_REDUCTION+89, // `[
113,MIN_REDUCTION+89, // "["
158,MIN_REDUCTION+89, // $NT
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 634
158,MIN_REDUCTION+65, // $NT
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 635
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 636
15,39, // `(
129,609, // "("
  }
,
{ // state 637
51,735, // `||
134,133, // "@"
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 638
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 639
2,545, // ws*
  }
,
{ // state 640
97,14, // "r"
101,379, // "h"
  }
,
{ // state 641
18,557, // <formal list rest>
19,729, // `,
121,536, // ","
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 642
7,446, // ID
15,90, // `(
27,73, // `null
48,746, // <exp6>
49,346, // <exp7>
50,36, // <exp8>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,542, // "#"
129,609, // "("
130,180, // "+"
134,620, // "@"
138,552, // '"'
  }
,
{ // state 643
0x80000000|21, // match move
0x80000000|12, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 644
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 645
29,312, // `[
81,745, // `.
113,606, // "["
131,704, // "."
158,MIN_REDUCTION+70, // $NT
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 646
90,106, // "v"
94,17, // "i"
99,359, // "b"
102,586, // "n"
  }
,
{ // state 647
62,236, // `>=
63,66, // `<=
64,732, // `>
65,462, // `<
66,706, // `instanceof
115,237, // "<"
118,740, // "#"
125,53, // ">"
134,353, // "@"
158,MIN_REDUCTION+49, // $NT
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 648
158,MIN_REDUCTION+98, // $NT
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 649
0x80000000|532, // match move
0x80000000|122, // no-match move
0x80000000|328, // NT-test-match state for `else
  }
,
{ // state 650
158,MIN_REDUCTION+113, // $NT
  }
,
{ // state 651
7,446, // ID
15,90, // `(
27,73, // `null
37,137, // <exp>
44,719, // <exp2>
45,691, // <exp3>
46,265, // <exp4>
47,311, // <exp5>
48,423, // <exp6>
49,346, // <exp7>
50,36, // <exp8>
53,360, // <equals>
54,523, // <not equals>
57,120, // <greater than>
58,46, // <less than>
59,703, // <gt equals>
60,539, // <lt equals>
61,337, // <instanceof>
67,525, // <plus>
68,595, // <minus>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,542, // "#"
129,609, // "("
130,180, // "+"
134,620, // "@"
138,552, // '"'
  }
,
{ // state 652
2,398, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 653
0x80000000|225, // match move
0x80000000|208, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 654
7,363, // ID
14,213, // `void
16,298, // `)
20,101, // <type>
21,678, // <formal list>
23,559, // <formal list>?
24,30, // $$0
25,150, // `int
26,459, // `boolean
27,387, // `null
86,279, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,260, // letter128
105,186, // {199..218 231..250}
106,186, // {193..198 225..230}
118,646, // "#"
120,652, // ")"
  }
,
{ // state 655
7,446, // ID
15,90, // `(
27,73, // `null
50,634, // <exp8>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,542, // "#"
129,609, // "("
130,180, // "+"
134,620, // "@"
138,552, // '"'
  }
,
{ // state 656
29,MIN_REDUCTION+119, // `[
113,MIN_REDUCTION+119, // "["
117,320, // " "
135,737, // {10}
143,771, // ws
158,MIN_REDUCTION+119, // $NT
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 657
29,312, // `[
30,299, // `]
81,745, // `.
113,606, // "["
122,560, // "]"
131,704, // "."
  }
,
{ // state 658
7,543, // ID
86,279, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,260, // letter128
105,186, // {199..218 231..250}
106,186, // {193..198 225..230}
  }
,
{ // state 659
0x80000000|581, // match move
0x80000000|22, // no-match move
0x80000000|328, // NT-test-match state for `else
  }
,
{ // state 660
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 661
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 662
0x80000000|518, // match move
0x80000000|128, // no-match move
0x80000000|57, // NT-test-match state for `void
  }
,
{ // state 663
2,112, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 664
29,MIN_REDUCTION+96, // `[
113,MIN_REDUCTION+96, // "["
158,MIN_REDUCTION+96, // $NT
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 665
16,517, // `)
120,689, // ")"
  }
,
{ // state 666
16,MIN_REDUCTION+211, // `)
120,MIN_REDUCTION+211, // ")"
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 667
2,479, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 668
117,MIN_REDUCTION+211, // " "
135,MIN_REDUCTION+211, // {10}
143,MIN_REDUCTION+211, // ws
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 669
2,148, // ws*
158,MIN_REDUCTION+231, // $NT
  }
,
{ // state 670
0x80000000|190, // match move
0x80000000|625, // no-match move
0x80000000|328, // NT-test-match state for `else
  }
,
{ // state 671
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 672
16,343, // `)
120,689, // ")"
  }
,
{ // state 673
0x80000000|1, // match move
0x80000000|206, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 674
2,55, // ws*
117,140, // " "
135,281, // {10}
143,176, // ws
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 675
2,214, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 676
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 677
2,234, // ws*
7,MIN_REDUCTION+158, // ID
16,MIN_REDUCTION+158, // `)
29,MIN_REDUCTION+158, // `[
62,MIN_REDUCTION+158, // `>=
87,MIN_REDUCTION+158, // "a"
88,MIN_REDUCTION+158, // "p"
89,MIN_REDUCTION+158, // "s"
90,MIN_REDUCTION+158, // "v"
91,MIN_REDUCTION+158, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,MIN_REDUCTION+158, // "c"
93,MIN_REDUCTION+158, // "f"
94,MIN_REDUCTION+158, // "i"
95,MIN_REDUCTION+158, // "l"
96,MIN_REDUCTION+158, // "o"
97,MIN_REDUCTION+158, // "r"
98,MIN_REDUCTION+158, // "u"
99,MIN_REDUCTION+158, // "b"
100,MIN_REDUCTION+158, // "e"
101,MIN_REDUCTION+158, // "h"
102,MIN_REDUCTION+158, // "n"
103,MIN_REDUCTION+158, // "t"
105,MIN_REDUCTION+158, // {199..218 231..250}
106,MIN_REDUCTION+158, // {193..198 225..230}
113,MIN_REDUCTION+158, // "["
117,320, // " "
120,MIN_REDUCTION+158, // ")"
135,737, // {10}
143,178, // ws
158,MIN_REDUCTION+158, // $NT
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 678
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 679
0x80000000|107, // match move
0x80000000|645, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 680
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 681
33,421, // `;
124,124, // ";"
  }
,
{ // state 682
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 683
158,MIN_REDUCTION+83, // $NT
  }
,
{ // state 684
69,341, // `+
70,761, // `-
114,764, // "-"
130,180, // "+"
158,MIN_REDUCTION+57, // $NT
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 685
7,446, // ID
27,73, // `null
69,762, // `+
70,247, // `-
75,117, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,542, // "#"
130,180, // "+"
134,620, // "@"
138,552, // '"'
  }
,
{ // state 686
0x80000000|215, // match move
0x80000000|767, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 687
89,458, // "s"
90,106, // "v"
93,344, // "f"
94,17, // "i"
99,556, // "b"
102,204, // "n"
103,640, // "t"
130,42, // "+"
  }
,
{ // state 688
2,258, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 689
0x80000000|54, // match move
0x80000000|414, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 690
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 691
55,531, // `==
56,419, // `!=
134,572, // "@"
158,MIN_REDUCTION+38, // $NT
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 692
52,218, // `&&
134,351, // "@"
158,MIN_REDUCTION+44, // $NT
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 693
62,236, // `>=
63,66, // `<=
64,732, // `>
65,462, // `<
66,706, // `instanceof
115,237, // "<"
118,740, // "#"
125,53, // ">"
134,353, // "@"
158,MIN_REDUCTION+48, // $NT
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 694
0x80000000|623, // match move
0x80000000|726, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 695
29,MIN_REDUCTION+80, // `[
113,MIN_REDUCTION+80, // "["
158,MIN_REDUCTION+80, // $NT
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 696
9,254, // <decl in class>*
10,75, // `}
11,700, // <decl in class>
12,105, // <method decl>
13,749, // `public
118,274, // "#"
136,261, // "}"
  }
,
{ // state 697
2,555, // ws*
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 698
107,511, // digit
108,220, // {"1".."9"}
109,220, // "0"
110,504, // digit128
111,384, // {176..185}
148,528, // $$2
  }
,
{ // state 699
158,MIN_REDUCTION+20, // $NT
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 700
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 701
158,MIN_REDUCTION+226, // $NT
  }
,
{ // state 702
29,MIN_REDUCTION+224, // `[
113,MIN_REDUCTION+224, // "["
117,320, // " "
135,737, // {10}
143,771, // ws
158,MIN_REDUCTION+224, // $NT
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 703
158,MIN_REDUCTION+52, // $NT
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 704
2,160, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
158,MIN_REDUCTION+172, // $NT
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 705
29,MIN_REDUCTION+230, // `[
113,MIN_REDUCTION+230, // "["
117,320, // " "
135,737, // {10}
143,771, // ws
158,MIN_REDUCTION+230, // $NT
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 706
7,363, // ID
14,213, // `void
20,755, // <type>
25,150, // `int
26,459, // `boolean
27,387, // `null
86,279, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,260, // letter128
105,186, // {199..218 231..250}
106,186, // {193..198 225..230}
118,646, // "#"
  }
,
{ // state 707
158,MIN_REDUCTION+96, // $NT
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 708
158,MIN_REDUCTION+80, // $NT
  }
,
{ // state 709
2,38, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 710
117,486, // " "
135,648, // {10}
143,241, // ws
158,MIN_REDUCTION+105, // $NT
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 711
0x80000000|1, // match move
0x80000000|13, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 712
0x80000000|1, // match move
0x80000000|527, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 713
33,288, // `;
124,649, // ";"
  }
,
{ // state 714
0x80000000|1, // match move
0x80000000|222, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 715
0x80000000|1, // match move
0x80000000|125, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 716
0x80000000|752, // match move
0x80000000|724, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 717
0x80000000|1, // match move
0x80000000|340, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 718
10,453, // `}
136,261, // "}"
  }
,
{ // state 719
52,218, // `&&
134,351, // "@"
158,MIN_REDUCTION+37, // $NT
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 720
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 721
2,593, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 722
0x80000000|717, // match move
0x80000000|7, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 723
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 724
29,MIN_REDUCTION+189, // `[
113,MIN_REDUCTION+189, // "["
158,MIN_REDUCTION+189, // $NT
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 725
29,MIN_REDUCTION+198, // `[
113,MIN_REDUCTION+198, // "["
158,MIN_REDUCTION+198, // $NT
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 726
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
318, // ID
147, // `{
-1, // <decl in class>*
58, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
213, // `void
90, // `(
-1, // `)
673, // <stmt>*
-1, // <formal list rest>
-1, // `,
276, // <type>
-1, // <formal list>
-1, // <formal list rest>*
-1, // <formal list>?
-1, // $$0
150, // `int
459, // `boolean
132, // `null
-1, // <empty bracket pair>
-1, // `[
-1, // `]
483, // <stmt>
412, // <assign>
-1, // `;
23, // <local var decl>
498, // <if>
644, // <break>
48, // <exp>
-1, // `=
306, // `++
750, // `--
636, // `if
-1, // `else
681, // `break
719, // <exp2>
691, // <exp3>
265, // <exp4>
311, // <exp5>
423, // <exp6>
346, // <exp7>
36, // <exp8>
-1, // `||
-1, // `&&
360, // <equals>
523, // <not equals>
-1, // `==
-1, // `!=
120, // <greater than>
46, // <less than>
703, // <gt equals>
539, // <lt equals>
337, // <instanceof>
-1, // `>=
-1, // `<=
-1, // `>
-1, // `<
-1, // `instanceof
525, // <plus>
595, // <minus>
762, // `+
247, // `-
-1, // `*
-1, // `/
-1, // `%
485, // <cast exp>
437, // <unary exp>
196, // <exp9>
603, // `true
63, // `false
322, // `this
11, // `super
-1, // `.
734, // INTLIT
372, // STRINGLIT
-1, // <exp list>
564, // `new
594, // letter
503, // "a"
503, // "p"
503, // "s"
503, // "v"
503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
503, // "c"
503, // "f"
503, // "i"
503, // "l"
503, // "o"
503, // "r"
503, // "u"
503, // "b"
503, // "e"
503, // "h"
503, // "n"
503, // "t"
199, // letter128
168, // {199..218 231..250}
168, // {193..198 225..230}
-1, // digit
754, // {"1".."9"}
212, // "0"
130, // digit128
384, // {176..185}
-1, // any
-1, // "["
764, // "-"
-1, // "<"
-1, // "|"
-1, // " "
687, // "#"
-1, // "&"
-1, // ")"
-1, // ","
-1, // "]"
-1, // "/"
-1, // ";"
-1, // ">"
583, // "{"
-1, // {0..9 11..31 "$" "'" ":" "?" "\" "^" "`" "~"..127}
-1, // "%"
609, // "("
180, // "+"
-1, // "."
-1, // "_"
-1, // "="
630, // "@"
-1, // {10}
32, // "}"
-1, // "!"
552, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // `return
-1, // idChar*
-1, // $$1
-1, // digit*
-1, // $$2
-1, // hexDigit*
-1, // $$3
-1, // any*
-1, // $$4
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 727
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 728
18,614, // <formal list rest>
19,729, // `,
22,641, // <formal list rest>*
121,536, // ","
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 729
7,363, // ID
14,213, // `void
20,738, // <type>
25,150, // `int
26,459, // `boolean
27,387, // `null
86,279, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,260, // letter128
105,186, // {199..218 231..250}
106,186, // {193..198 225..230}
118,646, // "#"
  }
,
{ // state 730
7,318, // ID
8,694, // `{
14,213, // `void
15,90, // `(
20,276, // <type>
25,150, // `int
26,459, // `boolean
27,132, // `null
31,118, // <stmt>
32,347, // <assign>
34,59, // <local var decl>
35,78, // <if>
36,85, // <break>
37,48, // <exp>
39,306, // `++
40,750, // `--
41,165, // `if
43,713, // `break
44,719, // <exp2>
45,691, // <exp3>
46,265, // <exp4>
47,311, // <exp5>
48,423, // <exp6>
49,346, // <exp7>
50,36, // <exp8>
53,360, // <equals>
54,523, // <not equals>
57,120, // <greater than>
58,46, // <less than>
59,703, // <gt equals>
60,539, // <lt equals>
61,337, // <instanceof>
67,525, // <plus>
68,595, // <minus>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,687, // "#"
126,583, // "{"
129,609, // "("
130,180, // "+"
134,630, // "@"
138,552, // '"'
  }
,
{ // state 731
0x80000000|1, // match move
0x80000000|537, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 732
0x80000000|1, // match move
0x80000000|576, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 733
117,MIN_REDUCTION+212, // " "
135,MIN_REDUCTION+212, // {10}
143,MIN_REDUCTION+212, // ws
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 734
0x80000000|161, // match move
0x80000000|70, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 735
0x80000000|1, // match move
0x80000000|567, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 736
0x80000000|103, // match move
0x80000000|619, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 737
0x80000000|579, // match move
0x80000000|471, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 738
7,472, // ID
28,268, // <empty bracket pair>
29,177, // `[
86,279, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,260, // letter128
105,186, // {199..218 231..250}
106,186, // {193..198 225..230}
113,606, // "["
  }
,
{ // state 739
0x80000000|769, // match move
0x80000000|521, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 740
94,626, // "i"
  }
,
{ // state 741
86,501, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,188, // letter128
105,540, // {199..218 231..250}
106,540, // {193..198 225..230}
107,18, // digit
108,220, // {"1".."9"}
109,220, // "0"
110,62, // digit128
111,114, // {176..185}
132,727, // "_"
141,283, // {223}
145,152, // idChar*
146,358, // $$1
153,638, // idChar
154,549, // idChar128
  }
,
{ // state 742
158,MIN_REDUCTION+202, // $NT
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 743
0x80000000|1, // match move
0x80000000|730, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 744
158,MIN_REDUCTION+184, // $NT
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 745
7,109, // ID
86,741, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,722, // letter128
105,540, // {199..218 231..250}
106,540, // {193..198 225..230}
  }
,
{ // state 746
158,MIN_REDUCTION+63, // $NT
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 747
2,302, // ws*
  }
,
{ // state 748
158,MIN_REDUCTION+184, // $NT
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 749
0x80000000|494, // match move
0x80000000|628, // no-match move
0x80000000|57, // NT-test-match state for `void
  }
,
{ // state 750
7,610, // ID
86,279, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,260, // letter128
105,186, // {199..218 231..250}
106,186, // {193..198 225..230}
  }
,
{ // state 751
2,659, // ws*
117,411, // " "
135,670, // {10}
143,10, // ws
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 752
158,MIN_REDUCTION+189, // $NT
  }
,
{ // state 753
7,318, // ID
8,147, // `{
14,213, // `void
15,90, // `(
20,276, // <type>
25,150, // `int
26,459, // `boolean
27,132, // `null
31,671, // <stmt>
32,412, // <assign>
34,23, // <local var decl>
35,498, // <if>
36,644, // <break>
37,48, // <exp>
39,306, // `++
40,750, // `--
41,636, // `if
43,681, // `break
44,719, // <exp2>
45,691, // <exp3>
46,265, // <exp4>
47,311, // <exp5>
48,423, // <exp6>
49,346, // <exp7>
50,36, // <exp8>
53,360, // <equals>
54,523, // <not equals>
57,120, // <greater than>
58,46, // <less than>
59,703, // <gt equals>
60,539, // <lt equals>
61,337, // <instanceof>
67,525, // <plus>
68,595, // <minus>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,438, // "#"
126,583, // "{"
129,609, // "("
130,180, // "+"
134,630, // "@"
138,552, // '"'
144,87, // `return
  }
,
{ // state 754
107,401, // digit
108,220, // {"1".."9"}
109,220, // "0"
110,504, // digit128
111,384, // {176..185}
147,698, // digit*
148,378, // $$2
  }
,
{ // state 755
28,268, // <empty bracket pair>
29,177, // `[
113,606, // "["
158,MIN_REDUCTION+59, // $NT
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 756
0x80000000|776, // match move
0x80000000|96, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 757
158,MIN_REDUCTION+81, // $NT
  }
,
{ // state 758
114,772, // "-"
115,667, // "<"
116,249, // "|"
119,119, // "&"
125,338, // ">"
130,688, // "+"
133,291, // "="
137,709, // "!"
  }
,
{ // state 759
29,MIN_REDUCTION+194, // `[
113,MIN_REDUCTION+194, // "["
158,MIN_REDUCTION+194, // $NT
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 760
2,686, // ws*
  }
,
{ // state 761
0x80000000|1, // match move
0x80000000|642, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 762
0x80000000|1, // match move
0x80000000|685, // no-match move
0x80000000|515, // NT-test-match state for `.
  }
,
{ // state 763
29,MIN_REDUCTION+83, // `[
113,MIN_REDUCTION+83, // "["
158,MIN_REDUCTION+83, // $NT
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 764
2,175, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 765
16,743, // `)
51,735, // `||
120,652, // ")"
134,133, // "@"
  }
,
{ // state 766
7,446, // ID
15,90, // `(
27,73, // `null
50,69, // <exp8>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,542, // "#"
129,609, // "("
130,180, // "+"
134,620, // "@"
138,552, // '"'
  }
,
{ // state 767
0x80000000|680, // match move
0x80000000|480, // no-match move
0x80000000|15, // NT-test-match state for `(
  }
,
{ // state 768
117,486, // " "
135,648, // {10}
143,241, // ws
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 769
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 770
7,446, // ID
15,90, // `(
27,73, // `null
37,451, // <exp>
44,719, // <exp2>
45,691, // <exp3>
46,265, // <exp4>
47,311, // <exp5>
48,423, // <exp6>
49,346, // <exp7>
50,36, // <exp8>
53,360, // <equals>
54,523, // <not equals>
57,120, // <greater than>
58,46, // <less than>
59,703, // <gt equals>
60,539, // <lt equals>
61,337, // <instanceof>
67,525, // <plus>
68,595, // <minus>
69,762, // `+
70,247, // `-
74,485, // <cast exp>
75,437, // <unary exp>
76,196, // <exp9>
77,603, // `true
78,63, // `false
79,322, // `this
80,11, // `super
82,734, // INTLIT
83,372, // STRINGLIT
84,672, // <exp list>
85,564, // `new
86,594, // letter
87,503, // "a"
88,503, // "p"
89,503, // "s"
90,503, // "v"
91,503, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
92,503, // "c"
93,503, // "f"
94,503, // "i"
95,503, // "l"
96,503, // "o"
97,503, // "r"
98,503, // "u"
99,503, // "b"
100,503, // "e"
101,503, // "h"
102,503, // "n"
103,503, // "t"
104,199, // letter128
105,168, // {199..218 231..250}
106,168, // {193..198 225..230}
108,754, // {"1".."9"}
109,212, // "0"
110,130, // digit128
111,384, // {176..185}
114,764, // "-"
118,542, // "#"
129,609, // "("
130,180, // "+"
134,620, // "@"
138,552, // '"'
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
{ // state 771
0x80000000|400, // match move
0x80000000|40, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 772
2,682, // ws*
117,486, // " "
135,648, // {10}
143,388, // ws
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 773
3,159, // <program>
4,319, // <class decl>+
5,778, // <class decl>
6,658, // `class
117,486, // " "
118,44, // "#"
135,648, // {10}
143,241, // ws
  }
,
{ // state 774
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 775
0x80000000|617, // match move
0x80000000|497, // no-match move
0x80000000|296, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 776
158,MIN_REDUCTION+190, // $NT
  }
,
{ // state 777
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 778
MIN_REDUCTION+220, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[779][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
  doneSoFar += new Initter3().doInit(doneSoFar);
}
public int[] getProdTable() { return prodTable; }
private static int[] prodTable = {
// $$start ::= <start>
(0<<16)+1,
// <start> ::= ws* <program>
(1<<16)+2,
// <start> ::= <program>
(1<<16)+1,
// <program> ::= <class decl>+
(3<<16)+1,
// <class decl> ::= `class ID `{ <decl in class>* `}
(5<<16)+5,
// <class decl> ::= `class ID `{ `}
(5<<16)+4,
// <decl in class> ::= <method decl>
(11<<16)+1,
// <method decl> ::= `public `void ID `( `) `{ <stmt>* `}
(12<<16)+8,
// <method decl> ::= `public `void ID `( `) `{ `}
(12<<16)+7,
// <formal list rest> ::= `, <type> ID
(18<<16)+3,
// <formal list> ::= <type> ID <formal list rest>*
(21<<16)+3,
// <formal list> ::= <type> ID
(21<<16)+2,
// <method decl> ::= `public !`void <type> ID `( <formal list>? $$0
(12<<16)+6,
// <method decl> ::= `public !`void <type> ID `( $$0
(12<<16)+5,
// <type> ::= `int
(20<<16)+1,
// <type> ::= `boolean
(20<<16)+1,
// <type> ::= ID
(20<<16)+1,
// <type> ::= `void
(20<<16)+1,
// <type> ::= `null
(20<<16)+1,
// <type> ::= <type> <empty bracket pair> !<empty bracket pair>
(20<<16)+2,
// <type> ::= <type> <empty bracket pair> <empty bracket pair>
(20<<16)+3,
// <empty bracket pair> ::= `[ `]
(28<<16)+2,
// <stmt> ::= <assign> `;
(31<<16)+2,
// <stmt> ::= `{ <stmt>* `}
(31<<16)+3,
// <stmt> ::= `{ `}
(31<<16)+2,
// <stmt> ::= <local var decl> `;
(31<<16)+2,
// <stmt> ::= <if>
(31<<16)+1,
// <stmt> ::= <break>
(31<<16)+1,
// <assign> ::= <exp> `= <exp>
(32<<16)+3,
// <assign> ::= `++ ID
(32<<16)+2,
// <assign> ::= ID `++
(32<<16)+2,
// <assign> ::= `-- ID
(32<<16)+2,
// <assign> ::= ID `--
(32<<16)+2,
// <local var decl> ::= <type> ID `= <exp>
(34<<16)+4,
// <if> ::= `if `( <exp> `) <stmt> `else <stmt>
(35<<16)+7,
// <if> ::= `if `( <exp> `) <stmt> !`else
(35<<16)+5,
// <break> ::= `break `;
(36<<16)+2,
// <exp> ::= <exp2>
(37<<16)+1,
// <exp2> ::= <exp3>
(44<<16)+1,
// <exp3> ::= <exp4>
(45<<16)+1,
// <exp4> ::= <exp5>
(46<<16)+1,
// <exp5> ::= <exp6>
(47<<16)+1,
// <exp6> ::= <exp7>
(48<<16)+1,
// <exp7> ::= <exp8>
(49<<16)+1,
// <exp> ::= <exp> `|| <exp2>
(37<<16)+3,
// <exp2> ::= <exp2> `&& <exp3>
(44<<16)+3,
// <exp3> ::= <equals>
(45<<16)+1,
// <exp3> ::= <not equals>
(45<<16)+1,
// <equals> ::= <exp3> `== <exp4>
(53<<16)+3,
// <not equals> ::= <exp3> `!= <exp4>
(54<<16)+3,
// <exp4> ::= <greater than>
(46<<16)+1,
// <exp4> ::= <less than>
(46<<16)+1,
// <exp4> ::= <gt equals>
(46<<16)+1,
// <exp4> ::= <lt equals>
(46<<16)+1,
// <exp4> ::= <instanceof>
(46<<16)+1,
// <gt equals> ::= <exp4> `>= <exp5>
(59<<16)+3,
// <lt equals> ::= <exp4> `<= <exp5>
(60<<16)+3,
// <greater than> ::= <exp4> `> <exp5>
(57<<16)+3,
// <less than> ::= <exp4> `< <exp5>
(58<<16)+3,
// <instanceof> ::= <exp4> `instanceof <type>
(61<<16)+3,
// <exp5> ::= <plus>
(47<<16)+1,
// <exp5> ::= <minus>
(47<<16)+1,
// <plus> ::= <exp5> `+ <exp6>
(67<<16)+3,
// <minus> ::= <exp5> `- <exp6>
(68<<16)+3,
// <exp7> ::= <exp7> `* <exp8>
(49<<16)+3,
// <exp7> ::= <exp7> `/ <exp8>
(49<<16)+3,
// <exp7> ::= <exp7> `% <exp8>
(49<<16)+3,
// <exp8> ::= <cast exp>
(50<<16)+1,
// <exp8> ::= <unary exp>
(50<<16)+1,
// <cast exp> ::= `( <type> `) <cast exp>
(74<<16)+4,
// <cast exp> ::= `( <type> `) <exp9>
(74<<16)+4,
// <unary exp> ::= `- <unary exp>
(75<<16)+2,
// <unary exp> ::= `+ <unary exp>
(75<<16)+2,
// <unary exp> ::= <exp9>
(75<<16)+1,
// <exp9> ::= ID
(76<<16)+1,
// <exp9> ::= `null
(76<<16)+1,
// <exp9> ::= `true
(76<<16)+1,
// <exp9> ::= `false
(76<<16)+1,
// <exp9> ::= `this
(76<<16)+1,
// <exp9> ::= `super
(76<<16)+1,
// <exp9> ::= <exp9> !<empty bracket pair> `[ <exp> `]
(76<<16)+4,
// <exp9> ::= <exp9> `. ID !`(
(76<<16)+3,
// <exp9> ::= INTLIT
(76<<16)+1,
// <exp9> ::= STRINGLIT
(76<<16)+1,
// <exp list> ::= <exp> `, <exp list>
(84<<16)+3,
// <exp list> ::= <exp>
(84<<16)+1,
// <exp9> ::= <exp9> `. ID `( <exp list> `)
(76<<16)+6,
// <exp9> ::= <exp9> `. ID `( !<exp list> `)
(76<<16)+5,
// <exp9> ::= !`. ID `( !<exp list> `)
(76<<16)+3,
// <exp9> ::= `new ID `( `)
(76<<16)+4,
// <exp9> ::= `new <type> `[ <exp9> `]
(76<<16)+5,
// letter ::= {"A".."Z" "a".."z"}
(86<<16)+1,
// letter128 ::= {193..218 225..250}
(104<<16)+1,
// digit ::= {"0".."9"}
(107<<16)+1,
// digit128 ::= {176..185}
(110<<16)+1,
// any ::= {0..127}
(112<<16)+1,
// any128 ::= {128..255}
(140<<16)+1,
// ws ::= " "
(143<<16)+1,
// ws ::= {10}
(143<<16)+1,
// `boolean ::= "#" "b" "o" ws*
(26<<16)+4,
// `boolean ::= "#" "b" "o"
(26<<16)+3,
// `class ::= "#" "c" "l" ws*
(6<<16)+4,
// `class ::= "#" "c" "l"
(6<<16)+3,
// `void ::= "#" "v" "o" ws*
(14<<16)+4,
// `void ::= "#" "v" "o"
(14<<16)+3,
// `int ::= "#" "i" "t" ws*
(25<<16)+4,
// `int ::= "#" "i" "t"
(25<<16)+3,
// `if ::= "#" "+" ws*
(41<<16)+3,
// `if ::= "#" "+"
(41<<16)+2,
// `else ::= "#" "e" "l" ws*
(42<<16)+4,
// `else ::= "#" "e" "l"
(42<<16)+3,
// `break ::= "#" "b" "r" ws*
(43<<16)+4,
// `break ::= "#" "b" "r"
(43<<16)+3,
// `this ::= "#" "t" "h" ws*
(79<<16)+4,
// `this ::= "#" "t" "h"
(79<<16)+3,
// `false ::= "#" "f" "a" ws*
(78<<16)+4,
// `false ::= "#" "f" "a"
(78<<16)+3,
// `true ::= "#" "t" "r" ws*
(77<<16)+4,
// `true ::= "#" "t" "r"
(77<<16)+3,
// `super ::= "#" "s" "u" ws*
(80<<16)+4,
// `super ::= "#" "s" "u"
(80<<16)+3,
// `null ::= "#" "n" "u" ws*
(27<<16)+4,
// `null ::= "#" "n" "u"
(27<<16)+3,
// `return ::= "#" "r" "e" ws*
(144<<16)+4,
// `return ::= "#" "r" "e"
(144<<16)+3,
// `instanceof ::= "#" "i" "n" ws*
(66<<16)+4,
// `instanceof ::= "#" "i" "n"
(66<<16)+3,
// `new ::= "#" "n" "e" ws*
(85<<16)+4,
// `new ::= "#" "n" "e"
(85<<16)+3,
// `public ::= "#" "p" "u" ws*
(13<<16)+4,
// `public ::= "#" "p" "u"
(13<<16)+3,
// `!= ::= "@" "!" ws*
(56<<16)+3,
// `!= ::= "@" "!"
(56<<16)+2,
// `% ::= "%" ws*
(73<<16)+2,
// `% ::= "%"
(73<<16)+1,
// `&& ::= "@" "&" ws*
(52<<16)+3,
// `&& ::= "@" "&"
(52<<16)+2,
// `* ::= "*" ws*
(71<<16)+2,
// `* ::= "*"
(71<<16)+1,
// `( ::= "(" ws*
(15<<16)+2,
// `( ::= "("
(15<<16)+1,
// `) ::= ")" ws*
(16<<16)+2,
// `) ::= ")"
(16<<16)+1,
// `{ ::= "{" ws*
(8<<16)+2,
// `{ ::= "{"
(8<<16)+1,
// `} ::= "}" ws*
(10<<16)+2,
// `} ::= "}"
(10<<16)+1,
// `- ::= "-" ws*
(70<<16)+2,
// `- ::= "-"
(70<<16)+1,
// `+ ::= "+" ws*
(69<<16)+2,
// `+ ::= "+"
(69<<16)+1,
// `= ::= "=" ws*
(38<<16)+2,
// `= ::= "="
(38<<16)+1,
// `== ::= "@" "=" ws*
(55<<16)+3,
// `== ::= "@" "="
(55<<16)+2,
// `[ ::= "[" ws*
(29<<16)+2,
// `[ ::= "["
(29<<16)+1,
// `] ::= "]" ws*
(30<<16)+2,
// `] ::= "]"
(30<<16)+1,
// `|| ::= "@" "|" ws*
(51<<16)+3,
// `|| ::= "@" "|"
(51<<16)+2,
// `< ::= "<" ws*
(65<<16)+2,
// `< ::= "<"
(65<<16)+1,
// `<= ::= "@" "<" ws*
(63<<16)+3,
// `<= ::= "@" "<"
(63<<16)+2,
// `, ::= "," ws*
(19<<16)+2,
// `, ::= ","
(19<<16)+1,
// `> ::= ">" !"=" ws*
(64<<16)+2,
// `> ::= ">" !"="
(64<<16)+1,
// `>= ::= "@" ">" ws*
(62<<16)+3,
// `>= ::= "@" ">"
(62<<16)+2,
// `. ::= "." ws*
(81<<16)+2,
// `. ::= "."
(81<<16)+1,
// `; ::= ";" ws*
(33<<16)+2,
// `; ::= ";"
(33<<16)+1,
// `++ ::= "@" "+" ws*
(39<<16)+3,
// `++ ::= "@" "+"
(39<<16)+2,
// `-- ::= "@" "-" ws*
(40<<16)+3,
// `-- ::= "@" "-"
(40<<16)+2,
// `/ ::= "/" ws*
(72<<16)+2,
// `/ ::= "/"
(72<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$1
(7<<16)+3,
// ID ::= letter $$1
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$2
(82<<16)+3,
// INTLIT ::= {"1".."9"} $$2
(82<<16)+2,
// INTLIT ::= digit128 ws*
(82<<16)+2,
// INTLIT ::= digit128
(82<<16)+1,
// INTLIT ::= "0" hexDigit* $$3
(82<<16)+3,
// INTLIT ::= "0" $$3
(82<<16)+2,
// STRINGLIT ::= "@" '"' ws*
(83<<16)+3,
// STRINGLIT ::= "@" '"'
(83<<16)+2,
// STRINGLIT ::= '"' any* $$4
(83<<16)+3,
// STRINGLIT ::= '"' $$4
(83<<16)+2,
// idChar ::= letter
(153<<16)+1,
// idChar ::= digit
(153<<16)+1,
// idChar ::= "_"
(153<<16)+1,
// idChar128 ::= letter128
(154<<16)+1,
// idChar128 ::= digit128
(154<<16)+1,
// idChar128 ::= {223}
(154<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(155<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(156<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(17<<16)+2,
// <stmt>* ::= <stmt>
(17<<16)+1,
// <formal list rest>* ::= <formal list rest>* <formal list rest>
(22<<16)+2,
// <formal list rest>* ::= <formal list rest>
(22<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// any* ::= any* any
(151<<16)+2,
// any* ::= any
(151<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit* ::= digit* digit
(147<<16)+2,
// digit* ::= digit
(147<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(149<<16)+2,
// hexDigit* ::= hexDigit
(149<<16)+1,
// <formal list>? ::= <formal list>
(23<<16)+1,
// idChar* ::= idChar* idChar
(145<<16)+2,
// idChar* ::= idChar
(145<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// $$0 ::= `) `{ <stmt>* `return <exp> `; `}
(24<<16)+7,
// $$0 ::= `) `{ `return <exp> `; `}
(24<<16)+6,
// $$1 ::= idChar128 ws*
(146<<16)+2,
// $$1 ::= idChar128
(146<<16)+1,
// $$2 ::= digit128 ws*
(148<<16)+2,
// $$2 ::= digit128
(148<<16)+1,
// $$3 ::= hexDigit128 ws*
(150<<16)+2,
// $$3 ::= hexDigit128
(150<<16)+1,
// $$4 ::= any128 ws*
(152<<16)+2,
// $$4 ::= any128
(152<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
127, // 0
127, // 1
127, // 2
127, // 3
127, // 4
127, // 5
127, // 6
127, // 7
127, // 8
127, // 9
135, // 10
127, // 11
127, // 12
127, // 13
127, // 14
127, // 15
127, // 16
127, // 17
127, // 18
127, // 19
127, // 20
127, // 21
127, // 22
127, // 23
127, // 24
127, // 25
127, // 26
127, // 27
127, // 28
127, // 29
127, // 30
127, // 31
117, // " "
137, // "!"
138, // '"'
118, // "#"
127, // "$"
128, // "%"
119, // "&"
127, // "'"
129, // "("
120, // ")"
139, // "*"
130, // "+"
121, // ","
114, // "-"
131, // "."
123, // "/"
109, // "0"
108, // "1"
108, // "2"
108, // "3"
108, // "4"
108, // "5"
108, // "6"
108, // "7"
108, // "8"
108, // "9"
127, // ":"
124, // ";"
115, // "<"
133, // "="
125, // ">"
127, // "?"
134, // "@"
91, // "A"
91, // "B"
91, // "C"
91, // "D"
91, // "E"
91, // "F"
91, // "G"
91, // "H"
91, // "I"
91, // "J"
91, // "K"
91, // "L"
91, // "M"
91, // "N"
91, // "O"
91, // "P"
91, // "Q"
91, // "R"
91, // "S"
91, // "T"
91, // "U"
91, // "V"
91, // "W"
91, // "X"
91, // "Y"
91, // "Z"
113, // "["
127, // "\"
122, // "]"
127, // "^"
132, // "_"
127, // "`"
87, // "a"
99, // "b"
92, // "c"
91, // "d"
100, // "e"
93, // "f"
91, // "g"
101, // "h"
94, // "i"
91, // "j"
91, // "k"
95, // "l"
91, // "m"
102, // "n"
96, // "o"
88, // "p"
91, // "q"
97, // "r"
89, // "s"
103, // "t"
98, // "u"
90, // "v"
91, // "w"
91, // "x"
91, // "y"
91, // "z"
126, // "{"
116, // "|"
136, // "}"
127, // "~"
127, // 127
142, // 128
142, // 129
142, // 130
142, // 131
142, // 132
142, // 133
142, // 134
142, // 135
142, // 136
142, // 137
142, // 138
142, // 139
142, // 140
142, // 141
142, // 142
142, // 143
142, // 144
142, // 145
142, // 146
142, // 147
142, // 148
142, // 149
142, // 150
142, // 151
142, // 152
142, // 153
142, // 154
142, // 155
142, // 156
142, // 157
142, // 158
142, // 159
142, // 160
142, // 161
142, // 162
142, // 163
142, // 164
142, // 165
142, // 166
142, // 167
142, // 168
142, // 169
142, // 170
142, // 171
142, // 172
142, // 173
142, // 174
142, // 175
111, // 176
111, // 177
111, // 178
111, // 179
111, // 180
111, // 181
111, // 182
111, // 183
111, // 184
111, // 185
142, // 186
142, // 187
142, // 188
142, // 189
142, // 190
142, // 191
142, // 192
106, // 193
106, // 194
106, // 195
106, // 196
106, // 197
106, // 198
105, // 199
105, // 200
105, // 201
105, // 202
105, // 203
105, // 204
105, // 205
105, // 206
105, // 207
105, // 208
105, // 209
105, // 210
105, // 211
105, // 212
105, // 213
105, // 214
105, // 215
105, // 216
105, // 217
105, // 218
142, // 219
142, // 220
142, // 221
142, // 222
141, // 223
142, // 224
106, // 225
106, // 226
106, // 227
106, // 228
106, // 229
106, // 230
105, // 231
105, // 232
105, // 233
105, // 234
105, // 235
105, // 236
105, // 237
105, // 238
105, // 239
105, // 240
105, // 241
105, // 242
105, // 243
105, // 244
105, // 245
105, // 246
105, // 247
105, // 248
105, // 249
105, // 250
142, // 251
142, // 252
142, // 253
142, // 254
142, // 255
};
public String[] getActionProdNameTable() { return actionProdNameTable; }
private String[] actionProdNameTable = {
"", // 0
"<start> ::= ws* <program>", // 1
"<start> ::= ws* <program>", // 2
"<program> ::= # <class decl>+", // 3
"<class decl> ::= `class # ID `{ <decl in class>* `}", // 4
"<class decl> ::= `class # ID `{ <decl in class>* `}", // 5
"<decl in class> ::= <method decl>", // 6
"<method decl> ::= `public `void # ID `( `) `{ <stmt>* `}", // 7
"<method decl> ::= `public `void # ID `( `) `{ <stmt>* `}", // 8
"<formal list rest> ::= # `, <type> ID", // 9
"<formal list> ::= # <type> ID <formal list rest>*", // 10
"<formal list> ::= # <type> ID <formal list rest>*", // 11
"<method decl> ::= # `public !`void <type> ID `( <formal list>? `) `{ <stmt>* `return <exp> `; `}", // 12
"<method decl> ::= # `public !`void <type> ID `( <formal list>? `) `{ <stmt>* `return <exp> `; `}", // 13
"<type> ::= # `int", // 14
"<type> ::= # `boolean", // 15
"<type> ::= # ID", // 16
"<type> ::= # `void", // 17
"<type> ::= # `null", // 18
"<type> ::= # <type> <empty bracket pair> !<empty bracket pair>", // 19
"<type> ::= # <type> <empty bracket pair> <empty bracket pair>", // 20
"<empty bracket pair> ::= `[ `]", // 21
"<stmt> ::= <assign> `;", // 22
"<stmt> ::= # `{ <stmt>* `}", // 23
"<stmt> ::= # `{ <stmt>* `}", // 24
"<stmt> ::= <local var decl> `;", // 25
"<stmt> ::= <if>", // 26
"<stmt> ::= <break>", // 27
"<assign> ::= <exp> # `= <exp>", // 28
"<assign> ::= `++ # ID", // 29
"<assign> ::= # ID `++", // 30
"<assign> ::= `-- # ID", // 31
"<assign> ::= # ID `--", // 32
"<local var decl> ::= <type> # ID `= <exp>", // 33
"<if> ::= `if `( <exp> `) # <stmt> `else <stmt>", // 34
"<if> ::= `if `( <exp> `) # <stmt> !`else", // 35
"<break> ::= # `break `;", // 36
"<exp> ::= <exp2>", // 37
"<exp2> ::= <exp3>", // 38
"<exp3> ::= <exp4>", // 39
"<exp4> ::= <exp5>", // 40
"<exp5> ::= <exp6>", // 41
"<exp6> ::= <exp7>", // 42
"<exp7> ::= <exp8>", // 43
"<exp> ::= <exp> # `|| <exp2>", // 44
"<exp2> ::= <exp2> # `&& <exp3>", // 45
"<exp3> ::= <equals>", // 46
"<exp3> ::= <not equals>", // 47
"<equals> ::= <exp3> # `== <exp4>", // 48
"<not equals> ::= <exp3> # `!= <exp4>", // 49
"<exp4> ::= <greater than>", // 50
"<exp4> ::= <less than>", // 51
"<exp4> ::= <gt equals>", // 52
"<exp4> ::= <lt equals>", // 53
"<exp4> ::= <instanceof>", // 54
"<gt equals> ::= <exp4> # `>= <exp5>", // 55
"<lt equals> ::= <exp4> # `<= <exp5>", // 56
"<greater than> ::= <exp4> # `> <exp5>", // 57
"<less than> ::= <exp4> # `< <exp5>", // 58
"<instanceof> ::= <exp4> # `instanceof <type>", // 59
"<exp5> ::= <plus>", // 60
"<exp5> ::= <minus>", // 61
"<plus> ::= <exp5> # `+ <exp6>", // 62
"<minus> ::= <exp5> # `- <exp6>", // 63
"<exp7> ::= <exp7> # `* <exp8>", // 64
"<exp7> ::= <exp7> # `/ <exp8>", // 65
"<exp7> ::= <exp7> # `% <exp8>", // 66
"<exp8> ::= <cast exp>", // 67
"<exp8> ::= <unary exp>", // 68
"<cast exp> ::= # `( <type> `) <cast exp>", // 69
"<cast exp> ::= # `( <type> `) <exp9>", // 70
"<unary exp> ::= # `- <unary exp>", // 71
"<unary exp> ::= # `+ <unary exp>", // 72
"<unary exp> ::= <exp9>", // 73
"<exp9> ::= # ID", // 74
"<exp9> ::= # `null", // 75
"<exp9> ::= # `true", // 76
"<exp9> ::= # `false", // 77
"<exp9> ::= # `this", // 78
"<exp9> ::= # `super", // 79
"<exp9> ::= <exp9> !<empty bracket pair> # `[ <exp> `]", // 80
"<exp9> ::= # <exp9> `. ID !`(", // 81
"<exp9> ::= # INTLIT", // 82
"<exp9> ::= # STRINGLIT", // 83
"<exp list> ::= <exp> `, <exp list>", // 84
"<exp list> ::= <exp>", // 85
"<exp9> ::= # <exp9> `. ID `( <exp list> `)", // 86
"<exp9> ::= # <exp9> `. ID `( !<exp list> `)", // 87
"<exp9> ::= # !`. ID `( !<exp list> `)", // 88
"<exp9> ::= # `new ID `( `)", // 89
"<exp9> ::= # `new <type> `[ <exp9> `]", // 90
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 91
"letter128 ::= {193..218 225..250}", // 92
"digit ::= {\"0\"..\"9\"}", // 93
"digit128 ::= {176..185}", // 94
"any ::= {0..127}", // 95
"any128 ::= {128..255}", // 96
"ws ::= \" \"", // 97
"ws ::= {10} registerNewline", // 98
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 99
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 100
"`class ::= \"#\" \"c\" \"l\" ws*", // 101
"`class ::= \"#\" \"c\" \"l\" ws*", // 102
"`void ::= \"#\" \"v\" \"o\" ws*", // 103
"`void ::= \"#\" \"v\" \"o\" ws*", // 104
"`int ::= \"#\" \"i\" \"t\" ws*", // 105
"`int ::= \"#\" \"i\" \"t\" ws*", // 106
"`if ::= \"#\" \"+\" ws*", // 107
"`if ::= \"#\" \"+\" ws*", // 108
"`else ::= \"#\" \"e\" \"l\" ws*", // 109
"`else ::= \"#\" \"e\" \"l\" ws*", // 110
"`break ::= \"#\" \"b\" \"r\" ws*", // 111
"`break ::= \"#\" \"b\" \"r\" ws*", // 112
"`this ::= \"#\" \"t\" \"h\" ws*", // 113
"`this ::= \"#\" \"t\" \"h\" ws*", // 114
"`false ::= \"#\" \"f\" \"a\" ws*", // 115
"`false ::= \"#\" \"f\" \"a\" ws*", // 116
"`true ::= \"#\" \"t\" \"r\" ws*", // 117
"`true ::= \"#\" \"t\" \"r\" ws*", // 118
"`super ::= \"#\" \"s\" \"u\" ws*", // 119
"`super ::= \"#\" \"s\" \"u\" ws*", // 120
"`null ::= \"#\" \"n\" \"u\" ws*", // 121
"`null ::= \"#\" \"n\" \"u\" ws*", // 122
"`return ::= \"#\" \"r\" \"e\" ws*", // 123
"`return ::= \"#\" \"r\" \"e\" ws*", // 124
"`instanceof ::= \"#\" \"i\" \"n\" ws*", // 125
"`instanceof ::= \"#\" \"i\" \"n\" ws*", // 126
"`new ::= \"#\" \"n\" \"e\" ws*", // 127
"`new ::= \"#\" \"n\" \"e\" ws*", // 128
"`public ::= \"#\" \"p\" \"u\" ws*", // 129
"`public ::= \"#\" \"p\" \"u\" ws*", // 130
"`!= ::= \"@\" \"!\" ws*", // 131
"`!= ::= \"@\" \"!\" ws*", // 132
"`% ::= \"%\" ws*", // 133
"`% ::= \"%\" ws*", // 134
"`&& ::= \"@\" \"&\" ws*", // 135
"`&& ::= \"@\" \"&\" ws*", // 136
"`* ::= \"*\" ws*", // 137
"`* ::= \"*\" ws*", // 138
"`( ::= \"(\" ws*", // 139
"`( ::= \"(\" ws*", // 140
"`) ::= \")\" ws*", // 141
"`) ::= \")\" ws*", // 142
"`{ ::= \"{\" ws*", // 143
"`{ ::= \"{\" ws*", // 144
"`} ::= \"}\" ws*", // 145
"`} ::= \"}\" ws*", // 146
"`- ::= \"-\" ws*", // 147
"`- ::= \"-\" ws*", // 148
"`+ ::= \"+\" ws*", // 149
"`+ ::= \"+\" ws*", // 150
"`= ::= \"=\" ws*", // 151
"`= ::= \"=\" ws*", // 152
"`== ::= \"@\" \"=\" ws*", // 153
"`== ::= \"@\" \"=\" ws*", // 154
"`[ ::= \"[\" ws*", // 155
"`[ ::= \"[\" ws*", // 156
"`] ::= \"]\" ws*", // 157
"`] ::= \"]\" ws*", // 158
"`|| ::= \"@\" \"|\" ws*", // 159
"`|| ::= \"@\" \"|\" ws*", // 160
"`< ::= \"<\" ws*", // 161
"`< ::= \"<\" ws*", // 162
"`<= ::= \"@\" \"<\" ws*", // 163
"`<= ::= \"@\" \"<\" ws*", // 164
"`, ::= \",\" ws*", // 165
"`, ::= \",\" ws*", // 166
"`> ::= \">\" !\"=\" ws*", // 167
"`> ::= \">\" !\"=\" ws*", // 168
"`>= ::= \"@\" \">\" ws*", // 169
"`>= ::= \"@\" \">\" ws*", // 170
"`. ::= \".\" ws*", // 171
"`. ::= \".\" ws*", // 172
"`; ::= \";\" ws*", // 173
"`; ::= \";\" ws*", // 174
"`++ ::= \"@\" \"+\" ws*", // 175
"`++ ::= \"@\" \"+\" ws*", // 176
"`-- ::= \"@\" \"-\" ws*", // 177
"`-- ::= \"@\" \"-\" ws*", // 178
"`/ ::= \"/\" ws*", // 179
"`/ ::= \"/\" ws*", // 180
"ID ::= letter128 ws*", // 181
"ID ::= letter128 ws*", // 182
"ID ::= letter idChar* idChar128 ws*", // 183
"ID ::= letter idChar* idChar128 ws*", // 184
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 185
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 186
"INTLIT ::= digit128 ws*", // 187
"INTLIT ::= digit128 ws*", // 188
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 189
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 190
"STRINGLIT ::= \"@\" \'\"\' ws*", // 191
"STRINGLIT ::= \"@\" \'\"\' ws*", // 192
"STRINGLIT ::= \'\"\' any* any128 ws*", // 193
"STRINGLIT ::= \'\"\' any* any128 ws*", // 194
"idChar ::= letter", // 195
"idChar ::= digit", // 196
"idChar ::= \"_\"", // 197
"idChar128 ::= letter128", // 198
"idChar128 ::= digit128", // 199
"idChar128 ::= {223}", // 200
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 201
"hexDigit128 ::= {176..185 193..198 225..230}", // 202
"<stmt>* ::= <stmt>* <stmt>", // 203
"<stmt>* ::= <stmt>* <stmt>", // 204
"<formal list rest>* ::= <formal list rest>* <formal list rest>", // 205
"<formal list rest>* ::= <formal list rest>* <formal list rest>", // 206
"<decl in class>* ::= <decl in class>* <decl in class>", // 207
"<decl in class>* ::= <decl in class>* <decl in class>", // 208
"any* ::= any* any", // 209
"any* ::= any* any", // 210
"ws* ::= ws* ws", // 211
"ws* ::= ws* ws", // 212
"digit* ::= digit* digit", // 213
"digit* ::= digit* digit", // 214
"hexDigit* ::= hexDigit* hexDigit", // 215
"hexDigit* ::= hexDigit* hexDigit", // 216
"<formal list>? ::= <formal list>", // 217
"idChar* ::= idChar* idChar", // 218
"idChar* ::= idChar* idChar", // 219
"<class decl>+ ::= <class decl>", // 220
"<class decl>+ ::= <class decl>+ <class decl>", // 221
"", // 222
"", // 223
"", // 224
"", // 225
"", // 226
"", // 227
"", // 228
"", // 229
"", // 230
"", // 231
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= <start> @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: <start> ::= ws* <program> @topLevel(Program)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 2: <start> ::= [ws*] <program> @topLevel(Program)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 3: <program> ::= [#] <class decl>+ @createProgram(int,List<ClassDecl>)=>Program
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 4: <class decl> ::= `class [#] ID `{ <decl in class>* `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 5: <class decl> ::= `class [#] ID `{ [<decl in class>*] `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 6: <decl in class> ::= <method decl> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 7: <method decl> ::= `public `void [#] ID `( `) `{ <stmt>* `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 8: <method decl> ::= `public `void [#] ID `( `) `{ [<stmt>*] `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: <formal list rest> ::= [#] `, <type> ID @createVarDeclList(int,Type,String)=>VarDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: <formal list> ::= [#] <type> ID <formal list rest>* @newFormalDeclList(int,Type,String,List<VarDecl>)=>VarDeclList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: <formal list> ::= [#] <type> ID [<formal list rest>*] @newFormalDeclList(int,Type,String,List<VarDecl>)=>VarDeclList
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 12: <method decl> ::= [#] `public !`void <type> ID `( <formal list>? $$0 @createMethodDeclNonVoid(int,Type,String,VarDeclList,List<Statement>,Exp)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 13: <method decl> ::= [#] `public !`void <type> ID `( [<formal list>?] $$0 @createMethodDeclNonVoid(int,Type,String,VarDeclList,List<Statement>,Exp)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x0)/*popToPushBack:2*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 14: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 15: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 16: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 17: <type> ::= [#] `void @voidType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 18: <type> ::= [#] `null @nullType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 19: <type> ::= [#] <type> <empty bracket pair> !<empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 20: <type> ::= [#] <type> <empty bracket pair> <empty bracket pair> @newArrayType(int,Type,Object,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 21: <empty bracket pair> ::= `[ `] @null
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // 22: <stmt> ::= <assign> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 23: <stmt> ::= [#] `{ <stmt>* `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 24: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 25: <stmt> ::= <local var decl> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 26: <stmt> ::= <if> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 27: <stmt> ::= <break> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 28: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 29: <assign> ::= `++ [#] ID @incrementByOne(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 30: <assign> ::= [#] ID `++ @incrementByOne(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 31: <assign> ::= `-- [#] ID @decrementByOne(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 32: <assign> ::= [#] ID `-- @decrementByOne(int,String)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 33: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 34: <if> ::= `if `( <exp> `) [#] <stmt> `else <stmt> @newIfElseStmt(Exp,int,Statement,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 35: <if> ::= `if `( <exp> `) [#] <stmt> !`else @newIfStmt(Exp,int,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 36: <break> ::= [#] `break `; @newBreakStmt(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 37: <exp> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 38: <exp2> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 39: <exp3> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 40: <exp4> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 41: <exp5> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 42: <exp6> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 43: <exp7> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 44: <exp> ::= <exp> [#] `|| <exp2> @newOr(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 45: <exp2> ::= <exp2> [#] `&& <exp3> @newAnd(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 46: <exp3> ::= <equals> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 47: <exp3> ::= <not equals> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 48: <equals> ::= <exp3> [#] `== <exp4> @newEq(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 49: <not equals> ::= <exp3> [#] `!= <exp4> @newNotEq(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 50: <exp4> ::= <greater than> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 51: <exp4> ::= <less than> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 52: <exp4> ::= <gt equals> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 53: <exp4> ::= <lt equals> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 54: <exp4> ::= <instanceof> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 55: <gt equals> ::= <exp4> [#] `>= <exp5> @newGreatherThanEquals(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 56: <lt equals> ::= <exp4> [#] `<= <exp5> @newLessThanEquals(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 57: <greater than> ::= <exp4> [#] `> <exp5> @newGreaterThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 58: <less than> ::= <exp4> [#] `< <exp5> @newLessThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 59: <instanceof> ::= <exp4> [#] `instanceof <type> @newInstanceOf(Exp,int,Type)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 60: <exp5> ::= <plus> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 61: <exp5> ::= <minus> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 62: <plus> ::= <exp5> [#] `+ <exp6> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 63: <minus> ::= <exp5> [#] `- <exp6> @newMinus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 64: <exp7> ::= <exp7> [#] `* <exp8> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 65: <exp7> ::= <exp7> [#] `/ <exp8> @newDivide(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 66: <exp7> ::= <exp7> [#] `% <exp8> @newMod(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 67: <exp8> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 68: <exp8> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 69: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 70: <cast exp> ::= [#] `( <type> `) <exp9> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 71: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 72: <unary exp> ::= [#] `+ <unary exp> @newUnaryPlus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 73: <unary exp> ::= <exp9> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 74: <exp9> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 75: <exp9> ::= [#] `null @newNullExp(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 76: <exp9> ::= [#] `true @newTrueExp(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 77: <exp9> ::= [#] `false @newFalseExp(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 78: <exp9> ::= [#] `this @newThisExp(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 79: <exp9> ::= [#] `super @newSuperExp(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 80: <exp9> ::= <exp9> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 81: <exp9> ::= [#] <exp9> `. ID !`( @newInstanceVarAccess(int,Exp,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 82: <exp9> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 83: <exp9> ::= [#] STRINGLIT @newStringLiteral(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 84: <exp list> ::= <exp> `, <exp list> @newExpParam(Exp,ExpList)=>ExpList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 85: <exp list> ::= <exp> @newExpList(Exp)=>ExpList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 86: <exp9> ::= [#] <exp9> `. ID `( <exp list> `) @newCallExp(int,Exp,String,ExpList)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 87: <exp9> ::= [#] <exp9> `. ID `( !<exp list> `) @newCallExpNoParam(int,Exp,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 88: <exp9> ::= !`. [#] ID `( !<exp list> `) @newCallThisExpNoParam(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 89: <exp9> ::= [#] `new ID `( `) @newClassInst(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 90: <exp9> ::= [#] `new <type> `[ <exp9> `] @newArrayInst(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 91: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 92: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 93: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 94: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 95: any ::= {0..127} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 96: any128 ::= {128..255} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 97: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 98: ws ::= {10} [registerNewline] @void
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 99: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 100: `boolean ::= "#" "b" "o" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 101: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 102: `class ::= "#" "c" "l" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 103: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 104: `void ::= "#" "v" "o" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 105: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 106: `int ::= "#" "i" "t" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 107: `if ::= "#" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 108: `if ::= "#" "+" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 109: `else ::= "#" "e" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 110: `else ::= "#" "e" "l" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 111: `break ::= "#" "b" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 112: `break ::= "#" "b" "r" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 113: `this ::= "#" "t" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 114: `this ::= "#" "t" "h" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 115: `false ::= "#" "f" "a" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 116: `false ::= "#" "f" "a" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 117: `true ::= "#" "t" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 118: `true ::= "#" "t" "r" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 119: `super ::= "#" "s" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 120: `super ::= "#" "s" "u" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 121: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 122: `null ::= "#" "n" "u" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 123: `return ::= "#" "r" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 124: `return ::= "#" "r" "e" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 125: `instanceof ::= "#" "i" "n" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 126: `instanceof ::= "#" "i" "n" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 127: `new ::= "#" "n" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 128: `new ::= "#" "n" "e" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 129: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 130: `public ::= "#" "p" "u" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 131: `!= ::= "@" "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 132: `!= ::= "@" "!" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 133: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 134: `% ::= "%" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 135: `&& ::= "@" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 136: `&& ::= "@" "&" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 137: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 138: `* ::= "*" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 139: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 140: `( ::= "(" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 141: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 142: `) ::= ")" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 143: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 144: `{ ::= "{" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 145: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 146: `} ::= "}" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 147: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 148: `- ::= "-" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 149: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 150: `+ ::= "+" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 151: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 152: `= ::= "=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 153: `== ::= "@" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 154: `== ::= "@" "=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 155: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 156: `[ ::= "[" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 157: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 158: `] ::= "]" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 159: `|| ::= "@" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 160: `|| ::= "@" "|" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 161: `< ::= "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 162: `< ::= "<" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 163: `<= ::= "@" "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 164: `<= ::= "@" "<" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 165: `, ::= "," ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 166: `, ::= "," [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 167: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 168: `> ::= ">" !"=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 169: `>= ::= "@" ">" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 170: `>= ::= "@" ">" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 171: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 172: `. ::= "." [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 173: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 174: `; ::= ";" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 175: `++ ::= "@" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 176: `++ ::= "@" "+" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 177: `-- ::= "@" "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 178: `-- ::= "@" "-" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 179: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 180: `/ ::= "/" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 181: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 182: ID ::= letter128 [ws*] @text
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 183: ID ::= letter idChar* $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 184: ID ::= letter [idChar*] $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 185: INTLIT ::= {"1".."9"} digit* $$2 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 186: INTLIT ::= {"1".."9"} [digit*] $$2 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 187: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 188: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 189: INTLIT ::= "0" hexDigit* $$3 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 190: INTLIT ::= "0" [hexDigit*] $$3 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 191: STRINGLIT ::= "@" '"' ws* @emptyString(char,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 192: STRINGLIT ::= "@" '"' [ws*] @emptyString(char,char)=>String
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 193: STRINGLIT ::= '"' any* $$4 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 194: STRINGLIT ::= '"' [any*] $$4 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 195: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 196: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 197: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 198: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 199: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 200: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 201: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 202: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 203: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 204: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 205: <formal list rest>* ::= <formal list rest>* <formal list rest> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 206: <formal list rest>* ::= [<formal list rest>*] <formal list rest> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 207: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 208: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 209: any* ::= any* any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 210: any* ::= [any*] any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 211: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 212: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 213: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 214: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 215: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 216: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 217: <formal list>? ::= <formal list> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 218: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 219: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 220: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 221: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 222: $$0 ::= `) `{ <stmt>* `return <exp> `; `} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 223: $$0 ::= `) `{ [<stmt>*] `return <exp> `; `} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 224: $$1 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 225: $$1 ::= idChar128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 226: $$2 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 227: $$2 ::= digit128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 228: $$3 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 229: $$3 ::= hexDigit128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 230: $$4 ::= any128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 231: $$4 ::= any128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "hexDigit* ::=", // hexDigit*
    "<stmt>* ::=", // <stmt>*
    "any* ::=", // any*
    "<decl in class>* ::=", // <decl in class>*
    "ws* ::=", // ws*
    "<formal list rest>* ::=", // <formal list rest>*
    "idChar* ::=", // idChar*
    "digit* ::=", // digit*
    "<formal list>? ::=", // <formal list>?
    "# ::=", // #
    "registerNewline ::= #", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // hexDigit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <stmt>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // any*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <decl in class>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // ws*
    },
    { // <formal list rest>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // digit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <formal list>?
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
};
public void actionCall(int idx, wrangLR.runtime.SemanticInfo si) {
  switch(idx) {
    default: System.err.println("Internal error--illegal action number: "+idx);break;
    case 0: {
      Program parm0 = (Program)si.popPb();
      actionObject.topLevel(parm0);
    }
    break;
    case 1: {
      int parm0 = (Integer)si.popPb();
      List<ClassDecl> parm1 = (List<ClassDecl>)si.popPb();
      Program result = actionObject.createProgram(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 2: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      List<Decl> parm2 = (List<Decl>)si.popPb();
      ClassDecl result = actionObject.createClassDecl(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 3: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      List<Statement> parm2 = (List<Statement>)si.popPb();
      Decl result = actionObject.createMethodDeclVoid(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 4: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      String parm2 = (String)si.popPb();
      VarDecl result = actionObject.createVarDeclList(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 5: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      String parm2 = (String)si.popPb();
      List<VarDecl> parm3 = (List<VarDecl>)si.popPb();
      VarDeclList result = actionObject.newFormalDeclList(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 6: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      String parm2 = (String)si.popPb();
      VarDeclList parm3 = (VarDeclList)si.popPb();
      List<Statement> parm4 = (List<Statement>)si.popPb();
      Exp parm5 = (Exp)si.popPb();
      Decl result = actionObject.createMethodDeclNonVoid(parm0,parm1,parm2,parm3,parm4,parm5);
      si.pushPb(result);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.intType(parm0);
      si.pushPb(result);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.booleanType(parm0);
      si.pushPb(result);
    }
    break;
    case 9: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Type result = actionObject.identifierType(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 10: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.voidType(parm0);
      si.pushPb(result);
    }
    break;
    case 11: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.nullType(parm0);
      si.pushPb(result);
    }
    break;
    case 12: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Object parm2 = (Object)si.popPb();
      Type result = actionObject.newArrayType(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 13: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Object parm2 = (Object)si.popPb();
      Object parm3 = (Object)si.popPb();
      Type result = actionObject.newArrayType(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      List<Statement> parm1 = (List<Statement>)si.popPb();
      Statement result = actionObject.newBlock(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 15: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 16: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.incrementByOne(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Statement result = actionObject.decrementByOne(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 18: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 19: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement parm3 = (Statement)si.popPb();
      Statement result = actionObject.newIfElseStmt(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 20: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement result = actionObject.newIfStmt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newBreakStmt(parm0);
      si.pushPb(result);
    }
    break;
    case 22: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newOr(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 23: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newAnd(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 24: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newEq(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 25: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newNotEq(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 26: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newGreatherThanEquals(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 27: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThanEquals(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 28: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newGreaterThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 29: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 30: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Type parm2 = (Type)si.popPb();
      Exp result = actionObject.newInstanceOf(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 31: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 32: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newMinus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 33: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 34: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDivide(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 35: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newMod(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 36: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 37: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 38: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryPlus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 39: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 40: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newNullExp(parm0);
      si.pushPb(result);
    }
    break;
    case 41: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newTrueExp(parm0);
      si.pushPb(result);
    }
    break;
    case 42: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newFalseExp(parm0);
      si.pushPb(result);
    }
    break;
    case 43: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newThisExp(parm0);
      si.pushPb(result);
    }
    break;
    case 44: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newSuperExp(parm0);
      si.pushPb(result);
    }
    break;
    case 45: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 46: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newInstanceVarAccess(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 47: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 48: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newStringLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 49: {
      Exp parm0 = (Exp)si.popPb();
      ExpList parm1 = (ExpList)si.popPb();
      ExpList result = actionObject.newExpParam(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 50: {
      Exp parm0 = (Exp)si.popPb();
      ExpList result = actionObject.newExpList(parm0);
      si.pushPb(result);
    }
    break;
    case 51: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      String parm2 = (String)si.popPb();
      ExpList parm3 = (ExpList)si.popPb();
      Exp result = actionObject.newCallExp(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 52: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newCallExpNoParam(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 53: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newCallThisExpNoParam(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 54: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newClassInst(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 55: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayInst(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 56: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 57: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 58: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 59: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 60: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      String result = actionObject.emptyString(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 61: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      String result = actionObject.string(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 62: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 63: {
      int parm0 = (Integer)si.popPb();
      actionObject.registerNewline(parm0);
    }
    break;
  }
}
private String[] saNameSigTable = {
"void topLevel(Program)",
"Program createProgram(int,List<ClassDecl>)",
"ClassDecl createClassDecl(int,String,List<Decl>)",
"Decl createMethodDeclVoid(int,String,List<Statement>)",
"VarDecl createVarDeclList(int,Type,String)",
"VarDeclList newFormalDeclList(int,Type,String,List<VarDecl>)",
"Decl createMethodDeclNonVoid(int,Type,String,VarDeclList,List<Statement>,Exp)",
"Type intType(int)",
"Type booleanType(int)",
"Type identifierType(int,String)",
"Type voidType(int)",
"Type nullType(int)",
"Type newArrayType(int,Type,Object)",
"Type newArrayType(int,Type,Object,Object)",
"Statement newBlock(int,List<Statement>)",
"Statement assign(Exp,int,Exp)",
"Statement incrementByOne(int,String)",
"Statement decrementByOne(int,String)",
"Statement localVarDecl(Type,int,String,Exp)",
"Statement newIfElseStmt(Exp,int,Statement,Statement)",
"Statement newIfStmt(Exp,int,Statement)",
"Statement newBreakStmt(int)",
"Exp newOr(Exp,int,Exp)",
"Exp newAnd(Exp,int,Exp)",
"Exp newEq(Exp,int,Exp)",
"Exp newNotEq(Exp,int,Exp)",
"Exp newGreatherThanEquals(Exp,int,Exp)",
"Exp newLessThanEquals(Exp,int,Exp)",
"Exp newGreaterThan(Exp,int,Exp)",
"Exp newLessThan(Exp,int,Exp)",
"Exp newInstanceOf(Exp,int,Type)",
"Exp newPlus(Exp,int,Exp)",
"Exp newMinus(Exp,int,Exp)",
"Exp newTimes(Exp,int,Exp)",
"Exp newDivide(Exp,int,Exp)",
"Exp newMod(Exp,int,Exp)",
"Exp newCast(int,Type,Exp)",
"Exp newUnaryMinus(int,Exp)",
"Exp newUnaryPlus(int,Exp)",
"Exp newIdentfierExp(int,String)",
"Exp newNullExp(int)",
"Exp newTrueExp(int)",
"Exp newFalseExp(int)",
"Exp newThisExp(int)",
"Exp newSuperExp(int)",
"Exp newArrayLookup(Exp,int,Exp)",
"Exp newInstanceVarAccess(int,Exp,String)",
"Exp newIntegerLiteral(int,int)",
"Exp newStringLiteral(int,String)",
"ExpList newExpParam(Exp,ExpList)",
"ExpList newExpList(Exp)",
"Exp newCallExp(int,Exp,String,ExpList)",
"Exp newCallExpNoParam(int,Exp,String)",
"Exp newCallThisExpNoParam(int,String)",
"Exp newClassInst(int,String)",
"Exp newArrayInst(int,Type,Exp)",
"char sub128(char)",
"int convertToInt(char,List<Character>,char)",
"int convertToInt(char)",
"int convert16ToInt(char,List<Character>,char)",
"String emptyString(char,char)",
"String string(char,List<Character>,char)",
"char underscore(char)",
"void registerNewline(int)",
};
public String[] getSaNameSigTable() {
  return saNameSigTable;
}
private int[] sigCountTable = {
1,0,
2,1,
3,1,
3,1,
3,1,
4,1,
6,1,
1,1,
1,1,
2,1,
1,1,
1,1,
3,1,
4,1,
2,1,
3,1,
2,1,
2,1,
4,1,
4,1,
3,1,
1,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
2,1,
2,1,
2,1,
1,1,
1,1,
1,1,
1,1,
1,1,
3,1,
3,1,
2,1,
2,1,
2,1,
1,1,
4,1,
3,1,
2,1,
2,1,
3,1,
1,1,
3,1,
1,1,
3,1,
2,1,
3,1,
1,1,
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
    1,
    1,
    1,
    0,
    1,
    0,
    1,
    0,
    1,
    1,
    0,
    0,
    0,
    0,
    1,
    1,
    0,
    1,
    1,
    1,
    1,
    2,
    0,
    0,
    0,
    1,
    0,
    0,
    1,
    1,
    0,
    1,
    1,
    1,
    1,
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
    1,
    1,
    1,
    0,
    0,
    1,
    1,
    0,
    0,
    1,
    1,
    1,
    1,
    1,
    0,
    0,
    0,
    0,
    0,
    1,
    1,
    0,
    0,
    0,
    0,
    0,
    1,
    1,
    1,
    0,
    0,
    0,
    0,
    0,
    1,
    1,
    1,
    0,
    1,
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
    -1,
    -1,
    1,
    -1,
    -1,
    1,
    -1,
    1,
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
    -1,
    -1,
    0,
    0,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
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
