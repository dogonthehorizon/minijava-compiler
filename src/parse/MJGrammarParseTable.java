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
public int getEofSym() { return 106; }
public int getNttSym() { return 107; }
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
"<type>",
"`int",
"`boolean",
"<empty bracket pair>",
"`[",
"`]",
"<stmt>",
"<assign>",
"`;",
"<local var decl>",
"<if>",
"<exp>",
"`=",
"`if",
"<exp2>",
"<exp3>",
"<exp4>",
"<exp5>",
"<exp6>",
"<exp7>",
"<exp8>",
"<exp9>",
"`||",
"`&&",
"<equals>",
"<not equals>",
"`==",
"`!=",
"<gt equals>",
"`>=",
"<plus>",
"<minus>",
"`+",
"`-",
"`*",
"<unary exp>",
"INTLIT",
"letter",
"\"p\"",
"{\"A\"..\"Z\" \"a\" \"d\"..\"h\" \"j\"..\"k\" \"m\"..\"n\" \"q\"..\"s\" \"w\"..\"z\"}",
"\"v\"",
"\"c\"",
"\"i\"",
"\"l\"",
"\"o\"",
"\"u\"",
"\"b\"",
"\"t\"",
"letter128",
"{199..218 231..250}",
"{193..198 225..230}",
"digit",
"{\"1\"..\"9\"}",
"\"0\"",
"digit128",
"{176..185}",
"ws",
"\" \"",
"10",
"\"#\"",
"\"+\"",
"\"@\"",
"\"!\"",
"\"&\"",
"\"*\"",
"\"(\"",
"\")\"",
"\"{\"",
"\"}\"",
"\"-\"",
"\"=\"",
"\"[\"",
"\"]\"",
"\"|\"",
"\">\"",
"\";\"",
"idChar*",
"$$0",
"digit*",
"$$1",
"hexDigit*",
"$$2",
"idChar",
"\"_\"",
"idChar128",
"223",
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
public int numSymbols() { return 108;}
private static final int MIN_REDUCTION = 273;
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
1,174, // <start>
2,262, // ws*
3,112, // <program>
4,171, // <class decl>+
5,271, // <class decl>
6,109, // `class
74,10, // ws
75,140, // " "
76,98, // {10}
77,74, // "#"
  }
,
{ // state 1
0x80000000|216, // match move
0x80000000|113, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 2
  }
,
{ // state 3
2,14, // ws*
74,10, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 4
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 5
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 6
15,232, // `(
83,53, // "("
  }
,
{ // state 7
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 8
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 9
7,19, // ID
29,207, // <exp>
32,186, // <exp2>
33,145, // <exp3>
34,144, // <exp4>
35,166, // <exp5>
36,54, // <exp6>
37,224, // <exp7>
38,59, // <exp8>
39,176, // <exp9>
42,230, // <equals>
43,184, // <not equals>
46,161, // <gt equals>
48,187, // <plus>
49,18, // <minus>
50,245, // `+
51,88, // `-
53,77, // <unary exp>
54,212, // INTLIT
55,199, // letter
56,156, // "p"
57,156, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,156, // "v"
59,156, // "c"
60,156, // "i"
61,156, // "l"
62,156, // "o"
63,156, // "u"
64,156, // "b"
65,156, // "t"
66,31, // letter128
67,240, // {199..218 231..250}
68,240, // {193..198 225..230}
70,21, // {"1".."9"}
71,264, // "0"
72,203, // digit128
73,1, // {176..185}
78,259, // "+"
87,247, // "-"
  }
,
{ // state 10
107,MIN_REDUCTION+123, // $NT
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 11
74,80, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 12
0x80000000|2, // match move
0x80000000|252, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 13
7,6, // ID
55,27, // letter
56,156, // "p"
57,156, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,156, // "v"
59,156, // "c"
60,156, // "i"
61,156, // "l"
62,156, // "o"
63,156, // "u"
64,156, // "b"
65,156, // "t"
66,105, // letter128
67,8, // {199..218 231..250}
68,8, // {193..198 225..230}
  }
,
{ // state 14
74,80, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 15
0x80000000|249, // match move
0x80000000|132, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 16
0x80000000|2, // match move
0x80000000|137, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 17
2,250, // ws*
74,10, // ws
75,140, // " "
76,98, // {10}
107,MIN_REDUCTION+93, // $NT
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 18
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 19
0x80000000|2, // match move
0x80000000|25, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 20
2,136, // ws*
74,10, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 21
69,96, // digit
70,55, // {"1".."9"}
71,55, // "0"
72,202, // digit128
73,1, // {176..185}
96,78, // digit*
97,122, // $$1
  }
,
{ // state 22
74,80, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 23
44,193, // `==
45,48, // `!=
79,257, // "@"
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 24
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 25
22,MIN_REDUCTION+47, // `[
89,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 26
65,116, // "t"
  }
,
{ // state 27
55,154, // letter
56,156, // "p"
57,156, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,156, // "v"
59,156, // "c"
60,156, // "i"
61,156, // "l"
62,156, // "o"
63,156, // "u"
64,156, // "b"
65,156, // "t"
66,194, // letter128
67,8, // {199..218 231..250}
68,8, // {193..198 225..230}
69,28, // digit
70,55, // {"1".."9"}
71,55, // "0"
72,75, // digit128
73,35, // {176..185}
94,170, // idChar*
95,225, // $$0
100,93, // idChar
101,196, // "_"
102,169, // idChar128
103,7, // {223}
  }
,
{ // state 28
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 29
107,MIN_REDUCTION+13, // $NT
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 30
61,130, // "l"
  }
,
{ // state 31
0x80000000|197, // match move
0x80000000|251, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 32
30,119, // `=
88,84, // "="
  }
,
{ // state 33
22,MIN_REDUCTION+132, // `[
74,261, // ws
75,173, // " "
76,217, // {10}
89,MIN_REDUCTION+132, // "["
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 34
7,127, // ID
8,221, // `{
10,267, // `}
18,49, // <type>
19,222, // `int
20,108, // `boolean
24,121, // <stmt>
25,38, // <assign>
27,37, // <local var decl>
28,153, // <if>
29,79, // <exp>
31,125, // `if
32,186, // <exp2>
33,145, // <exp3>
34,144, // <exp4>
35,166, // <exp5>
36,54, // <exp6>
37,224, // <exp7>
38,59, // <exp8>
39,176, // <exp9>
42,230, // <equals>
43,184, // <not equals>
46,161, // <gt equals>
48,187, // <plus>
49,18, // <minus>
50,245, // `+
51,88, // `-
53,77, // <unary exp>
54,212, // INTLIT
55,199, // letter
56,156, // "p"
57,156, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,156, // "v"
59,156, // "c"
60,156, // "i"
61,156, // "l"
62,156, // "o"
63,156, // "u"
64,156, // "b"
65,156, // "t"
66,31, // letter128
67,240, // {199..218 231..250}
68,240, // {193..198 225..230}
70,21, // {"1".."9"}
71,264, // "0"
72,203, // digit128
73,1, // {176..185}
77,198, // "#"
78,259, // "+"
85,3, // "{"
86,107, // "}"
87,247, // "-"
  }
,
{ // state 35
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 36
74,80, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 37
26,263, // `;
93,190, // ";"
  }
,
{ // state 38
26,178, // `;
93,190, // ";"
  }
,
{ // state 39
0x80000000|2, // match move
0x80000000|120, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 40
63,235, // "u"
  }
,
{ // state 41
0x80000000|66, // match move
0x80000000|260, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 42
74,80, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 43
0x80000000|4, // match move
0x80000000|56, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 44
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 45
22,MIN_REDUCTION+117, // `[
89,MIN_REDUCTION+117, // "["
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 46
2,208, // ws*
74,10, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 47
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 48
7,19, // ID
34,101, // <exp4>
35,166, // <exp5>
36,54, // <exp6>
37,224, // <exp7>
38,59, // <exp8>
39,176, // <exp9>
46,161, // <gt equals>
48,187, // <plus>
49,18, // <minus>
50,245, // `+
51,88, // `-
53,77, // <unary exp>
54,212, // INTLIT
55,199, // letter
56,156, // "p"
57,156, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,156, // "v"
59,156, // "c"
60,156, // "i"
61,156, // "l"
62,156, // "o"
63,156, // "u"
64,156, // "b"
65,156, // "t"
66,31, // letter128
67,240, // {199..218 231..250}
68,240, // {193..198 225..230}
70,21, // {"1".."9"}
71,264, // "0"
72,203, // digit128
73,1, // {176..185}
78,259, // "+"
87,247, // "-"
  }
,
{ // state 49
7,32, // ID
21,83, // <empty bracket pair>
22,218, // `[
55,27, // letter
56,156, // "p"
57,156, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,156, // "v"
59,156, // "c"
60,156, // "i"
61,156, // "l"
62,156, // "o"
63,156, // "u"
64,156, // "b"
65,156, // "t"
66,105, // letter128
67,8, // {199..218 231..250}
68,8, // {193..198 225..230}
89,46, // "["
  }
,
{ // state 50
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 51
7,19, // ID
33,23, // <exp3>
34,144, // <exp4>
35,166, // <exp5>
36,54, // <exp6>
37,224, // <exp7>
38,59, // <exp8>
39,176, // <exp9>
42,230, // <equals>
43,184, // <not equals>
46,161, // <gt equals>
48,187, // <plus>
49,18, // <minus>
50,245, // `+
51,88, // `-
53,77, // <unary exp>
54,212, // INTLIT
55,199, // letter
56,156, // "p"
57,156, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,156, // "v"
59,156, // "c"
60,156, // "i"
61,156, // "l"
62,156, // "o"
63,156, // "u"
64,156, // "b"
65,156, // "t"
66,31, // letter128
67,240, // {199..218 231..250}
68,240, // {193..198 225..230}
70,21, // {"1".."9"}
71,264, // "0"
72,203, // digit128
73,1, // {176..185}
78,259, // "+"
87,247, // "-"
  }
,
{ // state 52
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 53
2,188, // ws*
74,10, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 54
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 55
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 56
22,MIN_REDUCTION+100, // `[
74,261, // ws
75,173, // " "
76,217, // {10}
89,MIN_REDUCTION+100, // "["
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 57
22,MIN_REDUCTION+51, // `[
89,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 58
0x80000000|94, // match move
0x80000000|195, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 59
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 60
74,80, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 61
74,80, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 62
22,MIN_REDUCTION+102, // `[
89,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 63
22,MIN_REDUCTION+122, // `[
89,MIN_REDUCTION+122, // "["
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 64
7,MIN_REDUCTION+11, // ID
22,MIN_REDUCTION+47, // `[
56,MIN_REDUCTION+11, // "p"
57,MIN_REDUCTION+11, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,MIN_REDUCTION+11, // "v"
59,MIN_REDUCTION+11, // "c"
60,MIN_REDUCTION+11, // "i"
61,MIN_REDUCTION+11, // "l"
62,MIN_REDUCTION+11, // "o"
63,MIN_REDUCTION+11, // "u"
64,MIN_REDUCTION+11, // "b"
65,MIN_REDUCTION+11, // "t"
67,MIN_REDUCTION+11, // {199..218 231..250}
68,MIN_REDUCTION+11, // {193..198 225..230}
89,MIN_REDUCTION+47, // "["
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 65
0x80000000|2, // match move
0x80000000|185, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 66
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 67
74,80, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 68
2,36, // ws*
74,10, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 69
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 70
22,MIN_REDUCTION+115, // `[
89,MIN_REDUCTION+115, // "["
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 71
14,13, // `void
77,73, // "#"
  }
,
{ // state 72
7,19, // ID
35,124, // <exp5>
36,54, // <exp6>
37,224, // <exp7>
38,59, // <exp8>
39,176, // <exp9>
48,187, // <plus>
49,18, // <minus>
50,245, // `+
51,88, // `-
53,77, // <unary exp>
54,212, // INTLIT
55,199, // letter
56,156, // "p"
57,156, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,156, // "v"
59,156, // "c"
60,156, // "i"
61,156, // "l"
62,156, // "o"
63,156, // "u"
64,156, // "b"
65,156, // "t"
66,31, // letter128
67,240, // {199..218 231..250}
68,240, // {193..198 225..230}
70,21, // {"1".."9"}
71,264, // "0"
72,203, // digit128
73,1, // {176..185}
78,259, // "+"
87,247, // "-"
  }
,
{ // state 73
58,162, // "v"
  }
,
{ // state 74
59,30, // "c"
  }
,
{ // state 75
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 76
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 77
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 78
69,168, // digit
70,55, // {"1".."9"}
71,55, // "0"
72,202, // digit128
73,1, // {176..185}
97,226, // $$1
  }
,
{ // state 79
30,146, // `=
40,215, // `||
79,209, // "@"
88,84, // "="
  }
,
{ // state 80
107,MIN_REDUCTION+122, // $NT
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 81
22,MIN_REDUCTION+54, // `[
89,MIN_REDUCTION+54, // "["
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 82
56,47, // "p"
57,47, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,47, // "v"
59,47, // "c"
60,47, // "i"
61,47, // "l"
62,47, // "o"
63,47, // "u"
64,47, // "b"
65,47, // "t"
68,91, // {193..198 225..230}
70,47, // {"1".."9"}
71,47, // "0"
73,91, // {176..185}
99,39, // $$2
104,86, // hexDigit
105,151, // hexDigit128
  }
,
{ // state 83
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 84
2,177, // ws*
74,10, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 85
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 86
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 87
7,127, // ID
8,221, // `{
18,49, // <type>
19,222, // `int
20,108, // `boolean
24,253, // <stmt>
25,38, // <assign>
27,37, // <local var decl>
28,153, // <if>
29,79, // <exp>
31,125, // `if
32,186, // <exp2>
33,145, // <exp3>
34,144, // <exp4>
35,166, // <exp5>
36,54, // <exp6>
37,224, // <exp7>
38,59, // <exp8>
39,176, // <exp9>
42,230, // <equals>
43,184, // <not equals>
46,161, // <gt equals>
48,187, // <plus>
49,18, // <minus>
50,245, // `+
51,88, // `-
53,77, // <unary exp>
54,212, // INTLIT
55,199, // letter
56,156, // "p"
57,156, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,156, // "v"
59,156, // "c"
60,156, // "i"
61,156, // "l"
62,156, // "o"
63,156, // "u"
64,156, // "b"
65,156, // "t"
66,31, // letter128
67,240, // {199..218 231..250}
68,240, // {193..198 225..230}
70,21, // {"1".."9"}
71,264, // "0"
72,203, // digit128
73,1, // {176..185}
77,198, // "#"
78,259, // "+"
85,3, // "{"
87,247, // "-"
  }
,
{ // state 88
7,19, // ID
39,139, // <exp9>
50,245, // `+
51,88, // `-
53,85, // <unary exp>
54,212, // INTLIT
55,199, // letter
56,156, // "p"
57,156, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,156, // "v"
59,156, // "c"
60,156, // "i"
61,156, // "l"
62,156, // "o"
63,156, // "u"
64,156, // "b"
65,156, // "t"
66,31, // letter128
67,240, // {199..218 231..250}
68,240, // {193..198 225..230}
70,21, // {"1".."9"}
71,264, // "0"
72,203, // digit128
73,1, // {176..185}
78,259, // "+"
87,247, // "-"
  }
,
{ // state 89
2,179, // ws*
74,10, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 90
22,MIN_REDUCTION+104, // `[
89,MIN_REDUCTION+104, // "["
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 91
0x80000000|220, // match move
0x80000000|45, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 92
40,215, // `||
79,209, // "@"
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 93
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 94
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 95
10,159, // `}
11,246, // <decl in class>
12,160, // <method decl>
13,71, // `public
77,254, // "#"
86,107, // "}"
  }
,
{ // state 96
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 97
22,MIN_REDUCTION+123, // `[
89,MIN_REDUCTION+123, // "["
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 98
107,MIN_REDUCTION+55, // $NT
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 99
22,MIN_REDUCTION+49, // `[
89,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 100
0x80000000|172, // match move
0x80000000|33, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 101
47,72, // `>=
79,211, // "@"
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 102
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 103
2,22, // ws*
74,10, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 104
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 105
2,11, // ws*
74,10, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 106
23,229, // `]
40,215, // `||
79,209, // "@"
90,238, // "]"
  }
,
{ // state 107
2,60, // ws*
74,10, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 108
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 109
7,210, // ID
55,27, // letter
56,156, // "p"
57,156, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,156, // "v"
59,156, // "c"
60,156, // "i"
61,156, // "l"
62,156, // "o"
63,156, // "u"
64,156, // "b"
65,156, // "t"
66,105, // letter128
67,8, // {199..218 231..250}
68,8, // {193..198 225..230}
  }
,
{ // state 110
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 111
74,80, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 112
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 113
22,MIN_REDUCTION+53, // `[
89,MIN_REDUCTION+53, // "["
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 114
74,80, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 115
74,80, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 116
2,165, // ws*
74,10, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 117
0x80000000|150, // match move
0x80000000|62, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 118
22,MIN_REDUCTION+55, // `[
89,MIN_REDUCTION+55, // "["
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 119
7,19, // ID
29,92, // <exp>
32,186, // <exp2>
33,145, // <exp3>
34,144, // <exp4>
35,166, // <exp5>
36,54, // <exp6>
37,224, // <exp7>
38,59, // <exp8>
39,176, // <exp9>
42,230, // <equals>
43,184, // <not equals>
46,161, // <gt equals>
48,187, // <plus>
49,18, // <minus>
50,245, // `+
51,88, // `-
53,77, // <unary exp>
54,212, // INTLIT
55,199, // letter
56,156, // "p"
57,156, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,156, // "v"
59,156, // "c"
60,156, // "i"
61,156, // "l"
62,156, // "o"
63,156, // "u"
64,156, // "b"
65,156, // "t"
66,31, // letter128
67,240, // {199..218 231..250}
68,240, // {193..198 225..230}
70,21, // {"1".."9"}
71,264, // "0"
72,203, // digit128
73,1, // {176..185}
78,259, // "+"
87,247, // "-"
  }
,
{ // state 120
22,MIN_REDUCTION+108, // `[
89,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 121
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 122
0x80000000|2, // match move
0x80000000|256, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 123
47,72, // `>=
79,211, // "@"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 124
50,206, // `+
51,242, // `-
78,259, // "+"
87,247, // "-"
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 125
15,9, // `(
83,53, // "("
  }
,
{ // state 126
8,239, // `{
85,3, // "{"
  }
,
{ // state 127
0x80000000|52, // match move
0x80000000|64, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 128
22,MIN_REDUCTION+134, // `[
74,261, // ws
75,173, // " "
76,217, // {10}
89,MIN_REDUCTION+134, // "["
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 129
2,243, // ws*
22,MIN_REDUCTION+135, // `[
74,255, // ws
75,173, // " "
76,217, // {10}
89,MIN_REDUCTION+135, // "["
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 130
2,42, // ws*
74,10, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 131
2,65, // ws*
22,MIN_REDUCTION+93, // `[
74,255, // ws
75,173, // " "
76,217, // {10}
89,MIN_REDUCTION+93, // "["
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 132
2,100, // ws*
22,MIN_REDUCTION+133, // `[
74,255, // ws
75,173, // " "
76,217, // {10}
89,MIN_REDUCTION+133, // "["
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 133
7,127, // ID
8,221, // `{
10,69, // `}
18,49, // <type>
19,222, // `int
20,108, // `boolean
24,121, // <stmt>
25,38, // <assign>
27,37, // <local var decl>
28,153, // <if>
29,79, // <exp>
31,125, // `if
32,186, // <exp2>
33,145, // <exp3>
34,144, // <exp4>
35,166, // <exp5>
36,54, // <exp6>
37,224, // <exp7>
38,59, // <exp8>
39,176, // <exp9>
42,230, // <equals>
43,184, // <not equals>
46,161, // <gt equals>
48,187, // <plus>
49,18, // <minus>
50,245, // `+
51,88, // `-
53,77, // <unary exp>
54,212, // INTLIT
55,199, // letter
56,156, // "p"
57,156, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,156, // "v"
59,156, // "c"
60,156, // "i"
61,156, // "l"
62,156, // "o"
63,156, // "u"
64,156, // "b"
65,156, // "t"
66,31, // letter128
67,240, // {199..218 231..250}
68,240, // {193..198 225..230}
70,21, // {"1".."9"}
71,264, // "0"
72,203, // digit128
73,1, // {176..185}
77,198, // "#"
78,259, // "+"
85,3, // "{"
86,107, // "}"
87,247, // "-"
  }
,
{ // state 134
2,227, // ws*
22,MIN_REDUCTION+107, // `[
74,255, // ws
75,173, // " "
76,217, // {10}
89,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 135
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 136
74,80, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 137
22,MIN_REDUCTION+136, // `[
74,261, // ws
75,173, // " "
76,217, // {10}
89,MIN_REDUCTION+136, // "["
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 138
2,114, // ws*
74,10, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 139
0x80000000|2, // match move
0x80000000|266, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 140
107,MIN_REDUCTION+54, // $NT
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 141
2,155, // ws*
74,10, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 142
22,218, // `[
89,46, // "["
  }
,
{ // state 143
41,51, // `&&
79,214, // "@"
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 144
47,72, // `>=
79,211, // "@"
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 145
44,193, // `==
45,48, // `!=
79,257, // "@"
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 146
7,19, // ID
29,213, // <exp>
32,186, // <exp2>
33,145, // <exp3>
34,144, // <exp4>
35,166, // <exp5>
36,54, // <exp6>
37,224, // <exp7>
38,59, // <exp8>
39,176, // <exp9>
42,230, // <equals>
43,184, // <not equals>
46,161, // <gt equals>
48,187, // <plus>
49,18, // <minus>
50,245, // `+
51,88, // `-
53,77, // <unary exp>
54,212, // INTLIT
55,199, // letter
56,156, // "p"
57,156, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,156, // "v"
59,156, // "c"
60,156, // "i"
61,156, // "l"
62,156, // "o"
63,156, // "u"
64,156, // "b"
65,156, // "t"
66,31, // letter128
67,240, // {199..218 231..250}
68,240, // {193..198 225..230}
70,21, // {"1".."9"}
71,264, // "0"
72,203, // digit128
73,1, // {176..185}
78,259, // "+"
87,247, // "-"
  }
,
{ // state 147
22,MIN_REDUCTION+106, // `[
74,261, // ws
75,173, // " "
76,217, // {10}
89,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 148
22,MIN_REDUCTION+48, // `[
89,MIN_REDUCTION+48, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 149
74,80, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 150
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 151
0x80000000|269, // match move
0x80000000|204, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 152
9,95, // <decl in class>*
10,104, // `}
11,157, // <decl in class>
12,160, // <method decl>
13,71, // `public
77,254, // "#"
86,107, // "}"
  }
,
{ // state 153
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 154
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 155
74,80, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 156
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 157
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 158
0x80000000|76, // match move
0x80000000|70, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 159
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 160
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 161
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 162
62,183, // "o"
  }
,
{ // state 163
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 164
2,61, // ws*
74,10, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 165
74,80, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 166
50,206, // `+
51,242, // `-
78,259, // "+"
87,247, // "-"
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 167
7,19, // ID
29,106, // <exp>
32,186, // <exp2>
33,145, // <exp3>
34,144, // <exp4>
35,166, // <exp5>
36,54, // <exp6>
37,224, // <exp7>
38,59, // <exp8>
39,176, // <exp9>
42,230, // <equals>
43,184, // <not equals>
46,161, // <gt equals>
48,187, // <plus>
49,18, // <minus>
50,245, // `+
51,88, // `-
53,77, // <unary exp>
54,212, // INTLIT
55,199, // letter
56,156, // "p"
57,156, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,156, // "v"
59,156, // "c"
60,156, // "i"
61,156, // "l"
62,156, // "o"
63,156, // "u"
64,156, // "b"
65,156, // "t"
66,31, // letter128
67,240, // {199..218 231..250}
68,240, // {193..198 225..230}
70,21, // {"1".."9"}
71,264, // "0"
72,203, // digit128
73,1, // {176..185}
78,259, // "+"
87,247, // "-"
  }
,
{ // state 168
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 169
2,115, // ws*
74,10, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 170
55,154, // letter
56,156, // "p"
57,156, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,156, // "v"
59,156, // "c"
60,156, // "i"
61,156, // "l"
62,156, // "o"
63,156, // "u"
64,156, // "b"
65,156, // "t"
66,194, // letter128
67,8, // {199..218 231..250}
68,8, // {193..198 225..230}
69,28, // digit
70,55, // {"1".."9"}
71,55, // "0"
72,75, // digit128
73,35, // {176..185}
95,102, // $$0
100,181, // idChar
101,196, // "_"
102,169, // idChar128
103,7, // {223}
  }
,
{ // state 171
5,191, // <class decl>
6,109, // `class
77,74, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 172
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 173
0x80000000|5, // match move
0x80000000|81, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 174
106,MIN_REDUCTION+0, // $
  }
,
{ // state 175
2,65, // ws*
  }
,
{ // state 176
0x80000000|2, // match move
0x80000000|234, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 177
74,80, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 178
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 179
74,80, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 180
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 181
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 182
2,67, // ws*
74,10, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 183
2,149, // ws*
74,10, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 184
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 185
22,MIN_REDUCTION+92, // `[
74,261, // ws
75,173, // " "
76,217, // {10}
89,MIN_REDUCTION+92, // "["
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 186
41,51, // `&&
79,214, // "@"
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 187
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 188
74,80, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 189
74,80, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 190
2,236, // ws*
74,10, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 191
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 192
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 193
7,19, // ID
34,123, // <exp4>
35,166, // <exp5>
36,54, // <exp6>
37,224, // <exp7>
38,59, // <exp8>
39,176, // <exp9>
46,161, // <gt equals>
48,187, // <plus>
49,18, // <minus>
50,245, // `+
51,88, // `-
53,77, // <unary exp>
54,212, // INTLIT
55,199, // letter
56,156, // "p"
57,156, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,156, // "v"
59,156, // "c"
60,156, // "i"
61,156, // "l"
62,156, // "o"
63,156, // "u"
64,156, // "b"
65,156, // "t"
66,31, // letter128
67,240, // {199..218 231..250}
68,240, // {193..198 225..230}
70,21, // {"1".."9"}
71,264, // "0"
72,203, // digit128
73,1, // {176..185}
78,259, // "+"
87,247, // "-"
  }
,
{ // state 194
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 195
22,MIN_REDUCTION+113, // `[
89,MIN_REDUCTION+113, // "["
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 196
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 197
2,43, // ws*
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 198
60,26, // "i"
64,228, // "b"
78,68, // "+"
  }
,
{ // state 199
55,154, // letter
56,156, // "p"
57,156, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,156, // "v"
59,156, // "c"
60,156, // "i"
61,156, // "l"
62,156, // "o"
63,156, // "u"
64,156, // "b"
65,156, // "t"
66,58, // letter128
67,240, // {199..218 231..250}
68,240, // {193..198 225..230}
69,28, // digit
70,55, // {"1".."9"}
71,55, // "0"
72,219, // digit128
73,1, // {176..185}
94,231, // idChar*
95,41, // $$0
100,93, // idChar
101,196, // "_"
102,15, // idChar128
103,158, // {223}
  }
,
{ // state 200
2,111, // ws*
74,10, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 201
7,19, // ID
38,50, // <exp8>
39,176, // <exp9>
50,245, // `+
51,88, // `-
53,77, // <unary exp>
54,212, // INTLIT
55,199, // letter
56,156, // "p"
57,156, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,156, // "v"
59,156, // "c"
60,156, // "i"
61,156, // "l"
62,156, // "o"
63,156, // "u"
64,156, // "b"
65,156, // "t"
66,31, // letter128
67,240, // {199..218 231..250}
68,240, // {193..198 225..230}
70,21, // {"1".."9"}
71,264, // "0"
72,203, // digit128
73,1, // {176..185}
78,259, // "+"
87,247, // "-"
  }
,
{ // state 202
0x80000000|270, // match move
0x80000000|129, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 203
0x80000000|241, // match move
0x80000000|134, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 204
2,16, // ws*
22,MIN_REDUCTION+137, // `[
74,255, // ws
75,173, // " "
76,217, // {10}
89,MIN_REDUCTION+137, // "["
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 205
22,MIN_REDUCTION+114, // `[
89,MIN_REDUCTION+114, // "["
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 206
7,19, // ID
36,110, // <exp6>
37,224, // <exp7>
38,59, // <exp8>
39,176, // <exp9>
50,245, // `+
51,88, // `-
53,77, // <unary exp>
54,212, // INTLIT
55,199, // letter
56,156, // "p"
57,156, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,156, // "v"
59,156, // "c"
60,156, // "i"
61,156, // "l"
62,156, // "o"
63,156, // "u"
64,156, // "b"
65,156, // "t"
66,31, // letter128
67,240, // {199..218 231..250}
68,240, // {193..198 225..230}
70,21, // {"1".."9"}
71,264, // "0"
72,203, // digit128
73,1, // {176..185}
78,259, // "+"
87,247, // "-"
  }
,
{ // state 207
16,87, // `)
40,215, // `||
79,209, // "@"
84,103, // ")"
  }
,
{ // state 208
74,80, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 209
91,89, // "|"
  }
,
{ // state 210
8,152, // `{
85,3, // "{"
  }
,
{ // state 211
80,164, // "!"
81,182, // "&"
88,138, // "="
91,89, // "|"
92,200, // ">"
  }
,
{ // state 212
0x80000000|2, // match move
0x80000000|99, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 213
40,215, // `||
79,209, // "@"
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 214
81,182, // "&"
91,89, // "|"
  }
,
{ // state 215
7,19, // ID
32,143, // <exp2>
33,145, // <exp3>
34,144, // <exp4>
35,166, // <exp5>
36,54, // <exp6>
37,224, // <exp7>
38,59, // <exp8>
39,176, // <exp9>
42,230, // <equals>
43,184, // <not equals>
46,161, // <gt equals>
48,187, // <plus>
49,18, // <minus>
50,245, // `+
51,88, // `-
53,77, // <unary exp>
54,212, // INTLIT
55,199, // letter
56,156, // "p"
57,156, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,156, // "v"
59,156, // "c"
60,156, // "i"
61,156, // "l"
62,156, // "o"
63,156, // "u"
64,156, // "b"
65,156, // "t"
66,31, // letter128
67,240, // {199..218 231..250}
68,240, // {193..198 225..230}
70,21, // {"1".."9"}
71,264, // "0"
72,203, // digit128
73,1, // {176..185}
78,259, // "+"
87,247, // "-"
  }
,
{ // state 216
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 217
0x80000000|268, // match move
0x80000000|118, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 218
23,29, // `]
90,17, // "]"
  }
,
{ // state 219
0x80000000|258, // match move
0x80000000|205, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 220
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 221
7,127, // ID
8,221, // `{
10,192, // `}
17,34, // <stmt>*
18,49, // <type>
19,222, // `int
20,108, // `boolean
24,135, // <stmt>
25,38, // <assign>
27,37, // <local var decl>
28,153, // <if>
29,79, // <exp>
31,125, // `if
32,186, // <exp2>
33,145, // <exp3>
34,144, // <exp4>
35,166, // <exp5>
36,54, // <exp6>
37,224, // <exp7>
38,59, // <exp8>
39,176, // <exp9>
42,230, // <equals>
43,184, // <not equals>
46,161, // <gt equals>
48,187, // <plus>
49,18, // <minus>
50,245, // `+
51,88, // `-
53,77, // <unary exp>
54,212, // INTLIT
55,199, // letter
56,156, // "p"
57,156, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,156, // "v"
59,156, // "c"
60,156, // "i"
61,156, // "l"
62,156, // "o"
63,156, // "u"
64,156, // "b"
65,156, // "t"
66,31, // letter128
67,240, // {199..218 231..250}
68,240, // {193..198 225..230}
70,21, // {"1".."9"}
71,264, // "0"
72,203, // digit128
73,1, // {176..185}
77,198, // "#"
78,259, // "+"
85,3, // "{"
86,107, // "}"
87,247, // "-"
  }
,
{ // state 222
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 223
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 224
52,201, // `*
82,141, // "*"
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 225
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 226
0x80000000|2, // match move
0x80000000|90, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 227
0x80000000|2, // match move
0x80000000|147, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 228
62,20, // "o"
  }
,
{ // state 229
0x80000000|2, // match move
0x80000000|148, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 230
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 231
55,154, // letter
56,156, // "p"
57,156, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,156, // "v"
59,156, // "c"
60,156, // "i"
61,156, // "l"
62,156, // "o"
63,156, // "u"
64,156, // "b"
65,156, // "t"
66,58, // letter128
67,240, // {199..218 231..250}
68,240, // {193..198 225..230}
69,28, // digit
70,55, // {"1".."9"}
71,55, // "0"
72,219, // digit128
73,1, // {176..185}
95,117, // $$0
100,181, // idChar
101,196, // "_"
102,15, // idChar128
103,158, // {223}
  }
,
{ // state 232
16,126, // `)
84,103, // ")"
  }
,
{ // state 233
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 234
22,167, // `[
26,MIN_REDUCTION+46, // `;
30,MIN_REDUCTION+46, // `=
40,MIN_REDUCTION+46, // `||
44,MIN_REDUCTION+46, // `==
79,MIN_REDUCTION+46, // "@"
88,MIN_REDUCTION+46, // "="
89,46, // "["
93,MIN_REDUCTION+46, // ";"
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 235
2,189, // ws*
74,10, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 236
74,80, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 237
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 238
0x80000000|175, // match move
0x80000000|131, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 239
7,127, // ID
8,221, // `{
10,244, // `}
17,133, // <stmt>*
18,49, // <type>
19,222, // `int
20,108, // `boolean
24,135, // <stmt>
25,38, // <assign>
27,37, // <local var decl>
28,153, // <if>
29,79, // <exp>
31,125, // `if
32,186, // <exp2>
33,145, // <exp3>
34,144, // <exp4>
35,166, // <exp5>
36,54, // <exp6>
37,224, // <exp7>
38,59, // <exp8>
39,176, // <exp9>
42,230, // <equals>
43,184, // <not equals>
46,161, // <gt equals>
48,187, // <plus>
49,18, // <minus>
50,245, // `+
51,88, // `-
53,77, // <unary exp>
54,212, // INTLIT
55,199, // letter
56,156, // "p"
57,156, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,156, // "v"
59,156, // "c"
60,156, // "i"
61,156, // "l"
62,156, // "o"
63,156, // "u"
64,156, // "b"
65,156, // "t"
66,31, // letter128
67,240, // {199..218 231..250}
68,240, // {193..198 225..230}
70,21, // {"1".."9"}
71,264, // "0"
72,203, // digit128
73,1, // {176..185}
77,198, // "#"
78,259, // "+"
85,3, // "{"
86,107, // "}"
87,247, // "-"
  }
,
{ // state 240
0x80000000|163, // match move
0x80000000|57, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 241
2,227, // ws*
  }
,
{ // state 242
7,19, // ID
36,223, // <exp6>
37,224, // <exp7>
38,59, // <exp8>
39,176, // <exp9>
50,245, // `+
51,88, // `-
53,77, // <unary exp>
54,212, // INTLIT
55,199, // letter
56,156, // "p"
57,156, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,156, // "v"
59,156, // "c"
60,156, // "i"
61,156, // "l"
62,156, // "o"
63,156, // "u"
64,156, // "b"
65,156, // "t"
66,31, // letter128
67,240, // {199..218 231..250}
68,240, // {193..198 225..230}
70,21, // {"1".."9"}
71,264, // "0"
72,203, // digit128
73,1, // {176..185}
78,259, // "+"
87,247, // "-"
  }
,
{ // state 243
0x80000000|2, // match move
0x80000000|128, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 244
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 245
7,19, // ID
39,139, // <exp9>
50,245, // `+
51,88, // `-
53,180, // <unary exp>
54,212, // INTLIT
55,199, // letter
56,156, // "p"
57,156, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,156, // "v"
59,156, // "c"
60,156, // "i"
61,156, // "l"
62,156, // "o"
63,156, // "u"
64,156, // "b"
65,156, // "t"
66,31, // letter128
67,240, // {199..218 231..250}
68,240, // {193..198 225..230}
70,21, // {"1".."9"}
71,264, // "0"
72,203, // digit128
73,1, // {176..185}
78,259, // "+"
87,247, // "-"
  }
,
{ // state 246
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 247
2,248, // ws*
74,10, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 248
74,80, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 249
2,100, // ws*
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 250
74,80, // ws
75,140, // " "
76,98, // {10}
107,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 251
2,43, // ws*
22,MIN_REDUCTION+101, // `[
74,255, // ws
75,173, // " "
76,217, // {10}
89,MIN_REDUCTION+101, // "["
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 252
22,MIN_REDUCTION+109, // `[
89,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 253
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 254
56,40, // "p"
  }
,
{ // state 255
0x80000000|237, // match move
0x80000000|97, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 256
22,MIN_REDUCTION+105, // `[
89,MIN_REDUCTION+105, // "["
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 257
80,164, // "!"
81,182, // "&"
88,138, // "="
91,89, // "|"
  }
,
{ // state 258
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 259
2,265, // ws*
74,10, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 260
22,MIN_REDUCTION+103, // `[
89,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 261
0x80000000|24, // match move
0x80000000|63, // no-match move
0x80000000|142, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 262
3,233, // <program>
4,171, // <class decl>+
5,271, // <class decl>
6,109, // `class
74,80, // ws
75,140, // " "
76,98, // {10}
77,74, // "#"
  }
,
{ // state 263
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 264
56,47, // "p"
57,47, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
58,47, // "v"
59,47, // "c"
60,47, // "i"
61,47, // "l"
62,47, // "o"
63,47, // "u"
64,47, // "b"
65,47, // "t"
68,91, // {193..198 225..230}
70,47, // {"1".."9"}
71,47, // "0"
73,91, // {176..185}
98,82, // hexDigit*
99,12, // $$2
104,44, // hexDigit
105,151, // hexDigit128
  }
,
{ // state 265
74,80, // ws
75,140, // " "
76,98, // {10}
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 266
22,167, // `[
89,46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 267
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 268
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 269
2,16, // ws*
  }
,
{ // state 270
2,243, // ws*
  }
,
{ // state 271
MIN_REDUCTION+130, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[272][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
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
// <type> ::= `int
(18<<16)+1,
// <type> ::= `boolean
(18<<16)+1,
// <type> ::= ID
(18<<16)+1,
// <type> ::= <type> <empty bracket pair>
(18<<16)+2,
// <empty bracket pair> ::= `[ `]
(21<<16)+2,
// <stmt> ::= <assign> `;
(24<<16)+2,
// <stmt> ::= `{ <stmt>* `}
(24<<16)+3,
// <stmt> ::= `{ `}
(24<<16)+2,
// <stmt> ::= <local var decl> `;
(24<<16)+2,
// <stmt> ::= <if>
(24<<16)+1,
// <assign> ::= <exp> `= <exp>
(25<<16)+3,
// <local var decl> ::= <type> ID `= <exp>
(27<<16)+4,
// <if> ::= `if `( <exp> `) <stmt>
(28<<16)+5,
// <exp> ::= <exp2>
(29<<16)+1,
// <exp2> ::= <exp3>
(32<<16)+1,
// <exp3> ::= <exp4>
(33<<16)+1,
// <exp4> ::= <exp5>
(34<<16)+1,
// <exp5> ::= <exp6>
(35<<16)+1,
// <exp6> ::= <exp7>
(36<<16)+1,
// <exp7> ::= <exp8>
(37<<16)+1,
// <exp8> ::= <exp9>
(38<<16)+1,
// <exp> ::= <exp> `|| <exp2>
(29<<16)+3,
// <exp2> ::= <exp2> `&& <exp3>
(32<<16)+3,
// <exp3> ::= <equals>
(33<<16)+1,
// <exp3> ::= <not equals>
(33<<16)+1,
// <equals> ::= <exp3> `== <exp4>
(42<<16)+3,
// <not equals> ::= <exp3> `!= <exp4>
(43<<16)+3,
// <exp4> ::= <gt equals>
(34<<16)+1,
// <gt equals> ::= <exp4> `>= <exp5>
(46<<16)+3,
// <exp5> ::= <plus>
(35<<16)+1,
// <exp5> ::= <minus>
(35<<16)+1,
// <plus> ::= <exp5> `+ <exp6>
(48<<16)+3,
// <minus> ::= <exp5> `- <exp6>
(49<<16)+3,
// <exp7> ::= <exp7> `* <exp8>
(37<<16)+3,
// <exp8> ::= <unary exp>
(38<<16)+1,
// <unary exp> ::= `- <unary exp>
(53<<16)+2,
// <unary exp> ::= `+ <unary exp>
(53<<16)+2,
// <unary exp> ::= <exp9>
(53<<16)+1,
// <exp9> ::= ID
(39<<16)+1,
// <exp9> ::= <exp9> !<empty bracket pair> `[ <exp> `]
(39<<16)+4,
// <exp9> ::= INTLIT
(39<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(55<<16)+1,
// letter128 ::= {193..218 225..250}
(66<<16)+1,
// digit ::= {"0".."9"}
(69<<16)+1,
// digit128 ::= {176..185}
(72<<16)+1,
// ws ::= " "
(74<<16)+1,
// ws ::= {10}
(74<<16)+1,
// `boolean ::= "#" "b" "o" ws*
(20<<16)+4,
// `boolean ::= "#" "b" "o"
(20<<16)+3,
// `class ::= "#" "c" "l" ws*
(6<<16)+4,
// `class ::= "#" "c" "l"
(6<<16)+3,
// `void ::= "#" "v" "o" ws*
(14<<16)+4,
// `void ::= "#" "v" "o"
(14<<16)+3,
// `int ::= "#" "i" "t" ws*
(19<<16)+4,
// `int ::= "#" "i" "t"
(19<<16)+3,
// `if ::= "#" "+" ws*
(31<<16)+3,
// `if ::= "#" "+"
(31<<16)+2,
// `public ::= "#" "p" "u" ws*
(13<<16)+4,
// `public ::= "#" "p" "u"
(13<<16)+3,
// `!= ::= "@" "!" ws*
(45<<16)+3,
// `!= ::= "@" "!"
(45<<16)+2,
// `&& ::= "@" "&" ws*
(41<<16)+3,
// `&& ::= "@" "&"
(41<<16)+2,
// `* ::= "*" ws*
(52<<16)+2,
// `* ::= "*"
(52<<16)+1,
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
(51<<16)+2,
// `- ::= "-"
(51<<16)+1,
// `+ ::= "+" ws*
(50<<16)+2,
// `+ ::= "+"
(50<<16)+1,
// `= ::= "=" ws*
(30<<16)+2,
// `= ::= "="
(30<<16)+1,
// `== ::= "@" "=" ws*
(44<<16)+3,
// `== ::= "@" "="
(44<<16)+2,
// `[ ::= "[" ws*
(22<<16)+2,
// `[ ::= "["
(22<<16)+1,
// `] ::= "]" ws*
(23<<16)+2,
// `] ::= "]"
(23<<16)+1,
// `|| ::= "@" "|" ws*
(40<<16)+3,
// `|| ::= "@" "|"
(40<<16)+2,
// `>= ::= "@" ">" ws*
(47<<16)+3,
// `>= ::= "@" ">"
(47<<16)+2,
// `; ::= ";" ws*
(26<<16)+2,
// `; ::= ";"
(26<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(54<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(54<<16)+2,
// INTLIT ::= digit128 ws*
(54<<16)+2,
// INTLIT ::= digit128
(54<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(54<<16)+3,
// INTLIT ::= "0" $$2
(54<<16)+2,
// idChar ::= letter
(100<<16)+1,
// idChar ::= digit
(100<<16)+1,
// idChar ::= "_"
(100<<16)+1,
// idChar128 ::= letter128
(102<<16)+1,
// idChar128 ::= digit128
(102<<16)+1,
// idChar128 ::= {223}
(102<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(104<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(105<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(17<<16)+2,
// <stmt>* ::= <stmt>
(17<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit* ::= digit* digit
(96<<16)+2,
// digit* ::= digit
(96<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(98<<16)+2,
// hexDigit* ::= hexDigit
(98<<16)+1,
// idChar* ::= idChar* idChar
(94<<16)+2,
// idChar* ::= idChar
(94<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// $$0 ::= idChar128 ws*
(95<<16)+2,
// $$0 ::= idChar128
(95<<16)+1,
// $$1 ::= digit128 ws*
(97<<16)+2,
// $$1 ::= digit128
(97<<16)+1,
// $$2 ::= hexDigit128 ws*
(99<<16)+2,
// $$2 ::= hexDigit128
(99<<16)+1,
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
-1, // 9
76, // 10
-1, // 11
-1, // 12
-1, // 13
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
75, // " "
80, // "!"
-1, // '"'
77, // "#"
-1, // "$"
-1, // "%"
81, // "&"
-1, // "'"
83, // "("
84, // ")"
82, // "*"
78, // "+"
-1, // ","
87, // "-"
-1, // "."
-1, // "/"
71, // "0"
70, // "1"
70, // "2"
70, // "3"
70, // "4"
70, // "5"
70, // "6"
70, // "7"
70, // "8"
70, // "9"
-1, // ":"
93, // ";"
-1, // "<"
88, // "="
92, // ">"
-1, // "?"
79, // "@"
57, // "A"
57, // "B"
57, // "C"
57, // "D"
57, // "E"
57, // "F"
57, // "G"
57, // "H"
57, // "I"
57, // "J"
57, // "K"
57, // "L"
57, // "M"
57, // "N"
57, // "O"
57, // "P"
57, // "Q"
57, // "R"
57, // "S"
57, // "T"
57, // "U"
57, // "V"
57, // "W"
57, // "X"
57, // "Y"
57, // "Z"
89, // "["
-1, // "\"
90, // "]"
-1, // "^"
101, // "_"
-1, // "`"
57, // "a"
64, // "b"
59, // "c"
57, // "d"
57, // "e"
57, // "f"
57, // "g"
57, // "h"
60, // "i"
57, // "j"
57, // "k"
61, // "l"
57, // "m"
57, // "n"
62, // "o"
56, // "p"
57, // "q"
57, // "r"
57, // "s"
65, // "t"
63, // "u"
58, // "v"
57, // "w"
57, // "x"
57, // "y"
57, // "z"
85, // "{"
91, // "|"
86, // "}"
-1, // "~"
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
73, // 176
73, // 177
73, // 178
73, // 179
73, // 180
73, // 181
73, // 182
73, // 183
73, // 184
73, // 185
-1, // 186
-1, // 187
-1, // 188
-1, // 189
-1, // 190
-1, // 191
-1, // 192
68, // 193
68, // 194
68, // 195
68, // 196
68, // 197
68, // 198
67, // 199
67, // 200
67, // 201
67, // 202
67, // 203
67, // 204
67, // 205
67, // 206
67, // 207
67, // 208
67, // 209
67, // 210
67, // 211
67, // 212
67, // 213
67, // 214
67, // 215
67, // 216
67, // 217
67, // 218
-1, // 219
-1, // 220
-1, // 221
-1, // 222
103, // 223
-1, // 224
68, // 225
68, // 226
68, // 227
68, // 228
68, // 229
68, // 230
67, // 231
67, // 232
67, // 233
67, // 234
67, // 235
67, // 236
67, // 237
67, // 238
67, // 239
67, // 240
67, // 241
67, // 242
67, // 243
67, // 244
67, // 245
67, // 246
67, // 247
67, // 248
67, // 249
67, // 250
-1, // 251
-1, // 252
-1, // 253
-1, // 254
-1, // 255
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
"<type> ::= # `int", // 9
"<type> ::= # `boolean", // 10
"<type> ::= # ID", // 11
"<type> ::= # <type> <empty bracket pair>", // 12
"<empty bracket pair> ::= `[ `]", // 13
"<stmt> ::= <assign> `;", // 14
"<stmt> ::= # `{ <stmt>* `}", // 15
"<stmt> ::= # `{ <stmt>* `}", // 16
"<stmt> ::= <local var decl> `;", // 17
"<stmt> ::= <if>", // 18
"<assign> ::= <exp> # `= <exp>", // 19
"<local var decl> ::= <type> # ID `= <exp>", // 20
"<if> ::= `if `( <exp> `) # <stmt>", // 21
"<exp> ::= <exp2>", // 22
"<exp2> ::= <exp3>", // 23
"<exp3> ::= <exp4>", // 24
"<exp4> ::= <exp5>", // 25
"<exp5> ::= <exp6>", // 26
"<exp6> ::= <exp7>", // 27
"<exp7> ::= <exp8>", // 28
"<exp8> ::= <exp9>", // 29
"<exp> ::= <exp> # `|| <exp2>", // 30
"<exp2> ::= <exp2> # `&& <exp3>", // 31
"<exp3> ::= <equals>", // 32
"<exp3> ::= <not equals>", // 33
"<equals> ::= <exp3> # `== <exp4>", // 34
"<not equals> ::= <exp3> # `!= <exp4>", // 35
"<exp4> ::= <gt equals>", // 36
"<gt equals> ::= <exp4> # `>= <exp5>", // 37
"<exp5> ::= <plus>", // 38
"<exp5> ::= <minus>", // 39
"<plus> ::= <exp5> # `+ <exp6>", // 40
"<minus> ::= <exp5> # `- <exp6>", // 41
"<exp7> ::= <exp7> # `* <exp8>", // 42
"<exp8> ::= <unary exp>", // 43
"<unary exp> ::= # `- <unary exp>", // 44
"<unary exp> ::= # `+ <unary exp>", // 45
"<unary exp> ::= <exp9>", // 46
"<exp9> ::= # ID", // 47
"<exp9> ::= <exp9> !<empty bracket pair> # `[ <exp> `]", // 48
"<exp9> ::= # INTLIT", // 49
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 50
"letter128 ::= {193..218 225..250}", // 51
"digit ::= {\"0\"..\"9\"}", // 52
"digit128 ::= {176..185}", // 53
"ws ::= \" \"", // 54
"ws ::= {10} registerNewline", // 55
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 56
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 57
"`class ::= \"#\" \"c\" \"l\" ws*", // 58
"`class ::= \"#\" \"c\" \"l\" ws*", // 59
"`void ::= \"#\" \"v\" \"o\" ws*", // 60
"`void ::= \"#\" \"v\" \"o\" ws*", // 61
"`int ::= \"#\" \"i\" \"t\" ws*", // 62
"`int ::= \"#\" \"i\" \"t\" ws*", // 63
"`if ::= \"#\" \"+\" ws*", // 64
"`if ::= \"#\" \"+\" ws*", // 65
"`public ::= \"#\" \"p\" \"u\" ws*", // 66
"`public ::= \"#\" \"p\" \"u\" ws*", // 67
"`!= ::= \"@\" \"!\" ws*", // 68
"`!= ::= \"@\" \"!\" ws*", // 69
"`&& ::= \"@\" \"&\" ws*", // 70
"`&& ::= \"@\" \"&\" ws*", // 71
"`* ::= \"*\" ws*", // 72
"`* ::= \"*\" ws*", // 73
"`( ::= \"(\" ws*", // 74
"`( ::= \"(\" ws*", // 75
"`) ::= \")\" ws*", // 76
"`) ::= \")\" ws*", // 77
"`{ ::= \"{\" ws*", // 78
"`{ ::= \"{\" ws*", // 79
"`} ::= \"}\" ws*", // 80
"`} ::= \"}\" ws*", // 81
"`- ::= \"-\" ws*", // 82
"`- ::= \"-\" ws*", // 83
"`+ ::= \"+\" ws*", // 84
"`+ ::= \"+\" ws*", // 85
"`= ::= \"=\" ws*", // 86
"`= ::= \"=\" ws*", // 87
"`== ::= \"@\" \"=\" ws*", // 88
"`== ::= \"@\" \"=\" ws*", // 89
"`[ ::= \"[\" ws*", // 90
"`[ ::= \"[\" ws*", // 91
"`] ::= \"]\" ws*", // 92
"`] ::= \"]\" ws*", // 93
"`|| ::= \"@\" \"|\" ws*", // 94
"`|| ::= \"@\" \"|\" ws*", // 95
"`>= ::= \"@\" \">\" ws*", // 96
"`>= ::= \"@\" \">\" ws*", // 97
"`; ::= \";\" ws*", // 98
"`; ::= \";\" ws*", // 99
"ID ::= letter128 ws*", // 100
"ID ::= letter128 ws*", // 101
"ID ::= letter idChar* idChar128 ws*", // 102
"ID ::= letter idChar* idChar128 ws*", // 103
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 104
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 105
"INTLIT ::= digit128 ws*", // 106
"INTLIT ::= digit128 ws*", // 107
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 108
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 109
"idChar ::= letter", // 110
"idChar ::= digit", // 111
"idChar ::= \"_\"", // 112
"idChar128 ::= letter128", // 113
"idChar128 ::= digit128", // 114
"idChar128 ::= {223}", // 115
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 116
"hexDigit128 ::= {176..185 193..198 225..230}", // 117
"<stmt>* ::= <stmt>* <stmt>", // 118
"<stmt>* ::= <stmt>* <stmt>", // 119
"<decl in class>* ::= <decl in class>* <decl in class>", // 120
"<decl in class>* ::= <decl in class>* <decl in class>", // 121
"ws* ::= ws* ws", // 122
"ws* ::= ws* ws", // 123
"digit* ::= digit* digit", // 124
"digit* ::= digit* digit", // 125
"hexDigit* ::= hexDigit* hexDigit", // 126
"hexDigit* ::= hexDigit* hexDigit", // 127
"idChar* ::= idChar* idChar", // 128
"idChar* ::= idChar* idChar", // 129
"<class decl>+ ::= <class decl>", // 130
"<class decl>+ ::= <class decl>+ <class decl>", // 131
"", // 132
"", // 133
"", // 134
"", // 135
"", // 136
"", // 137
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 3: <program> ::= [#] <class decl>+ @createProgram(int,List<ClassDecl>)=>Program
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 4: <class decl> ::= `class [#] ID `{ <decl in class>* `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 5: <class decl> ::= `class [#] ID `{ [<decl in class>*] `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: <empty bracket pair> ::= `[ `] @null
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // 14: <stmt> ::= <assign> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 15: <stmt> ::= [#] `{ <stmt>* `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 16: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 17: <stmt> ::= <local var decl> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 18: <stmt> ::= <if> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 19: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 20: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 21: <if> ::= `if `( <exp> `) [#] <stmt> @ifStmt(Exp,int,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 22: <exp> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 23: <exp2> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 24: <exp3> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 25: <exp4> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 26: <exp5> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 27: <exp6> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 28: <exp7> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 29: <exp8> ::= <exp9> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 30: <exp> ::= <exp> [#] `|| <exp2> @newOr(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 31: <exp2> ::= <exp2> [#] `&& <exp3> @newAnd(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 32: <exp3> ::= <equals> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 33: <exp3> ::= <not equals> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 34: <equals> ::= <exp3> [#] `== <exp4> @newEq(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 35: <not equals> ::= <exp3> [#] `!= <exp4> @newNotEq(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 36: <exp4> ::= <gt equals> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 37: <gt equals> ::= <exp4> [#] `>= <exp5> @newGreatherThanEquals(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 38: <exp5> ::= <plus> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 39: <exp5> ::= <minus> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 40: <plus> ::= <exp5> [#] `+ <exp6> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 41: <minus> ::= <exp5> [#] `- <exp6> @newMinus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 42: <exp7> ::= <exp7> [#] `* <exp8> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 43: <exp8> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 44: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 45: <unary exp> ::= [#] `+ <unary exp> @newUnaryPlus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 46: <unary exp> ::= <exp9> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 47: <exp9> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 48: <exp9> ::= <exp9> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 49: <exp9> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 50: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 51: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 52: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 53: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 54: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 55: ws ::= {10} [registerNewline] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 56: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 57: `boolean ::= "#" "b" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 58: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 59: `class ::= "#" "c" "l" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 60: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 61: `void ::= "#" "v" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 62: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 63: `int ::= "#" "i" "t" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 64: `if ::= "#" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 65: `if ::= "#" "+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 66: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 67: `public ::= "#" "p" "u" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 68: `!= ::= "@" "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 69: `!= ::= "@" "!" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 70: `&& ::= "@" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 71: `&& ::= "@" "&" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 72: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 73: `* ::= "*" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 74: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 75: `( ::= "(" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 76: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 77: `) ::= ")" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 78: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 79: `{ ::= "{" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 80: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 81: `} ::= "}" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 82: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 83: `- ::= "-" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 84: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 85: `+ ::= "+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 86: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 87: `= ::= "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 88: `== ::= "@" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 89: `== ::= "@" "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 90: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 91: `[ ::= "[" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 92: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 93: `] ::= "]" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 94: `|| ::= "@" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 95: `|| ::= "@" "|" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 96: `>= ::= "@" ">" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 97: `>= ::= "@" ">" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 98: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 99: `; ::= ";" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 100: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 101: ID ::= letter128 [ws*] @text
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 102: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 103: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 104: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 105: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 106: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 107: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 108: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 109: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 110: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 111: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 112: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 113: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 114: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 115: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 116: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 117: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 118: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 119: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 120: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 121: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 122: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 123: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 124: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 125: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 126: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 127: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 128: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 129: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 130: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 131: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 132: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 133: $$0 ::= idChar128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 134: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 135: $$1 ::= digit128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 136: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 137: $$2 ::= hexDigit128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "hexDigit* ::=", // hexDigit*
    "<stmt>* ::=", // <stmt>*
    "<decl in class>* ::=", // <decl in class>*
    "ws* ::=", // ws*
    "idChar* ::=", // idChar*
    "digit* ::=", // digit*
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
    { // <decl in class>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // ws*
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // digit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((30<<5)|0x5)/*methodCall:30*/,
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
      Type result = actionObject.intType(parm0);
      si.pushPb(result);
    }
    break;
    case 5: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.booleanType(parm0);
      si.pushPb(result);
    }
    break;
    case 6: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Type result = actionObject.identifierType(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Object parm2 = (Object)si.popPb();
      Type result = actionObject.newArrayType(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      List<Statement> parm1 = (List<Statement>)si.popPb();
      Statement result = actionObject.newBlock(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 9: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 10: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 11: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement result = actionObject.ifStmt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 12: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newOr(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 13: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newAnd(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 14: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newEq(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 15: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newNotEq(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 16: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newGreatherThanEquals(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 17: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 18: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newMinus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 19: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 20: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryPlus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 22: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 23: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 24: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 25: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 26: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 27: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 28: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 29: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 30: {
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
"Type intType(int)",
"Type booleanType(int)",
"Type identifierType(int,String)",
"Type newArrayType(int,Type,Object)",
"Statement newBlock(int,List<Statement>)",
"Statement assign(Exp,int,Exp)",
"Statement localVarDecl(Type,int,String,Exp)",
"Statement ifStmt(Exp,int,Statement)",
"Exp newOr(Exp,int,Exp)",
"Exp newAnd(Exp,int,Exp)",
"Exp newEq(Exp,int,Exp)",
"Exp newNotEq(Exp,int,Exp)",
"Exp newGreatherThanEquals(Exp,int,Exp)",
"Exp newPlus(Exp,int,Exp)",
"Exp newMinus(Exp,int,Exp)",
"Exp newTimes(Exp,int,Exp)",
"Exp newUnaryMinus(int,Exp)",
"Exp newUnaryPlus(int,Exp)",
"Exp newIdentfierExp(int,String)",
"Exp newArrayLookup(Exp,int,Exp)",
"Exp newIntegerLiteral(int,int)",
"char sub128(char)",
"int convertToInt(char,List<Character>,char)",
"int convertToInt(char)",
"int convert16ToInt(char,List<Character>,char)",
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
1,1,
1,1,
2,1,
3,1,
2,1,
3,1,
4,1,
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
3,1,
2,1,
1,1,
3,1,
1,1,
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
    0,
    0,
    1,
    1,
    0,
    0,
    1,
    0,
    1,
    1,
    0,
    0,
    0,
    1,
    1,
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
    1,
    -1,
    -1,
    1,
    -1,
    -1,
    1,
    -1,
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
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    -1,
    1,
    -1,
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
