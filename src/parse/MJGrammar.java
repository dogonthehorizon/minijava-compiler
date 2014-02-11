package parse;
import java.util.List;
import errorMsg.*;
import syntaxtree.*;

public class MJGrammar
		implements wrangLR.runtime.MessageObject, wrangLR.runtime.FilePosObject {
	
	public static final boolean FILTER_GRAMMAR = true;
	
	// constructor
	public MJGrammar(ErrorMsg em) {
		errorMsg = em;
		topObject = null;
	}
	
	// error message object
	private ErrorMsg errorMsg;
	
	// object returned by the parse
	private Program topObject;

	// method for printing error message
	public void error(int pos, String msg) {
		errorMsg.error(pos, msg);
	}

	// method for printing warning message
	public void warning(int pos, String msg) {
		errorMsg.warning(pos, msg);
	}

	// method for converting file position to line/character
	// position
	public String filePosString(int pos) {
		return errorMsg.lineAndChar(pos);
	}
	
	// method to register a newline
	public void registerNewline(int pos) {
		errorMsg.newline(pos-1);
	}

	// returns the object produced by the parse
	public Program parseResult() {
		return topObject;
	}
	
	//===============================================================
	// start symbol
	//===============================================================

	//: <start> ::= ws* <program> =>
	public void topLevel(Program obj) {
		topObject = obj;
	}
	
	//================================================================
	//top-level program constructs
	//================================================================

	//: <program> ::= # <class decl>+ =>
	public Program createProgram(int pos, List<ClassDecl> vec) {
		return new Program(pos, new ClassDeclList(vec));
	}

	//: <class decl> ::= `class # ID `{ <decl in class>* `} =>
	public ClassDecl createClassDecl(int pos, String name, List<Decl> vec) {
		return new ClassDecl(pos, name, "Object", new DeclList(vec));
	}

	//: <decl in class> ::= <method decl> => pass

	//: <method decl> ::= `public `void # ID `( `) `{ <stmt>* `} =>
	public Decl createMethodDeclVoid(int pos, String name, List<Statement> stmts) {
		return new MethodDeclVoid(pos, name, new VarDeclList(new VarDeclList()),
				new StatementList(stmts));
	}

    //: <formal list rest> ::= # `, <type> ID =>
    public VarDecl createVarDeclList(int pos, Type t, String s) {
        return new FormalDecl(pos, t, s);
    }

    //: <formal list> ::= # <type> ID <formal list rest>* =>
    public VarDeclList newFormalDeclList(int pos, Type t, String s, List<VarDecl> d) {
        FormalDecl head = new FormalDecl(pos, t, s);
        VarDeclList rest = new VarDeclList(d);
        rest.addElementAtFront(head);

        return rest;
    }

    //: <method decl> ::= # `public !`void <type> ID `( <formal list>? `) `{ <stmt>* `return <exp> `; `} =>
    public Decl createMethodDeclNonVoid(int pos, Type t, String id, VarDeclList d,
                                        List<Statement> stmts, Exp e) {

        return new MethodDeclNonVoid(pos, t, id, d,
                new StatementList(stmts), e);
    }

	//: <type> ::= # `int =>
	public Type intType(int pos) {
		return new IntegerType(pos);
	}
	//: <type> ::= # `boolean =>
	public Type booleanType(int pos) {
		return new BooleanType(pos);
	}
	//: <type> ::= # ID =>
	public Type identifierType(int pos, String name) {
		return new IdentifierType(pos, name);
	}

    //: <type> ::= # `void =>
    public Type voidType(int pos) {
        return new VoidType(pos);
    }

    //: <type> ::= # `null =>
    public Type nullType(int pos) {
        return new NullType(pos);
    }

	//: <type> ::= # <type> <empty bracket pair> !<empty bracket pair> =>
	public Type newArrayType(int pos, Type t, Object dummy) {
		return new ArrayType(pos, t);
	}

    //: <type> ::= # <type> <empty bracket pair> <empty bracket pair> =>
    public Type newArrayType(int pos, Type t, Object dummy, Object dummy2) {
        ArrayType at = new ArrayType(pos, t);
        return new ArrayType(pos, at);
    }

	//: <empty bracket pair> ::= `[ `] => null

	//================================================================
	//statement-level program constructs
	//================================================================

	//: <stmt> ::= <assign> `; => pass
	
	//: <stmt> ::= # `{ <stmt>* `} =>
	public Statement newBlock(int pos, List<Statement> sl) {
		return new Block(pos, new StatementList(sl));
	}
	//: <stmt> ::= <local var decl> `; => pass
    //: <stmt> ::= <if>  => pass
    //: <stmt> ::= <break> => pass

	//: <assign> ::= <exp> # `= <exp> =>
	public Statement assign(Exp lhs, int pos, Exp rhs) {
		return new Assign(pos, lhs, rhs);
	}

    /**
     * Assignment Statement: Unary Increment
     */
    //: <assign> ::= `++ # ID =>
    public Statement incrementByOne(int pos, String s) {
        IdentifierExp id = new IdentifierExp(pos, s);
        Plus p = new Plus(pos, new IntegerLiteral(pos, 1), id);
        return new Assign(pos, id, p);
    }
    //: <assign> ::= # ID `++ => Statement incrementByOne(int, String)

    /**
     * Assignment Statement: Unary Decrement
     */
    //: <assign> ::= `-- # ID =>
    public Statement decrementByOne(int pos, String s) {
        IdentifierExp id = new IdentifierExp(pos, s);
        Minus m = new Minus(pos, new IntegerLiteral(pos, 1), id);
        return new Assign(pos, id, m);
    }
    //: <assign> ::= # ID `-- => Statement decrementByOne(int, String)

	//: <local var decl> ::= <type> # ID `= <exp> =>
	public Statement localVarDecl(Type t, int pos, String name, Exp init) {
		return new LocalVarDecl(pos, t, name, init);
	}

    /**
     * If Statement
     */
    //: <if> ::= `if `( <exp> `) # <stmt> `else <stmt> =>
    public Statement newIfElseStmt(Exp e1, int pos, Statement trueStmt, Statement falseStmt) {
        return new If(pos, e1, trueStmt, falseStmt);
    }

    //: <if> ::= `if `( <exp> `) # <stmt> !`else =>
    public Statement newIfStmt(Exp e, int pos, Statement stmt){
        return new If(pos, e, stmt, new Block(pos, new StatementList()));
    }

    /**
     * Break Statement
     */
    //: <break> ::= # `break `; =>
    public Statement newBreakStmt(int pos) {
        return new Break(pos);
    }

	//================================================================
	//expressions
	//================================================================
    //: <exp> ::= <exp2> => pass
    //: <exp2> ::= <exp3> => pass
    //: <exp3> ::= <exp4> => pass
    //: <exp4> ::= <exp5> => pass
    //: <exp5> ::= <exp6> => pass
    //: <exp6> ::= <exp7> => pass
    //: <exp7> ::= <exp8> => pass


    //: <exp> ::= <exp> # `|| <exp2> =>
    public Exp newOr(Exp e1, int pos, Exp e2) {
        return new Or(pos, e1, e2);
    }

    //: <exp2> ::= <exp2> # `&& <exp3> =>
    public Exp newAnd(Exp e1, int pos, Exp e2) {
        return new And(pos, e1, e2);
    }

    //: <exp3> ::= <equals> => pass
    //: <exp3> ::= <not equals> => pass

    //: <equals> ::= <exp3> # `== <exp4> =>
    public Exp newEq(Exp e1, int pos, Exp e2) {
        return new Equals(pos, e1, e2);
    }

    //: <not equals> ::= <exp3> # `!= <exp4> =>
    public Exp newNotEq(Exp e1, int pos, Exp e2) {

        Equals eq = new Equals(pos, e1, e2);
        return new Not(pos, eq);
    }

    //: <exp4> ::= <greater than> => pass
    //: <exp4> ::= <less than> => pass
    //: <exp4> ::= <gt equals> => pass
    //: <exp4> ::= <lt equals> => pass
    //: <exp4> ::= <instanceof> => pass

    //: <gt equals> ::= <exp4> # `>= <exp5> =>
    public Exp newGreatherThanEquals(Exp e1, int pos, Exp e2) {
        Equals eq = new Equals(pos, e1, e2);
        GreaterThan gt = new GreaterThan(pos, e1, e2);

        return new Or(pos, eq, gt);
    }

    //: <lt equals> ::= <exp4> # `<= <exp5> =>
    public Exp newLessThanEquals(Exp e1, int pos, Exp e2) {
        Equals eq = new Equals(pos, e1, e2);
        LessThan lt = new LessThan(pos, e1, e2);

        return new Or(pos, eq, lt);
    }

    //: <greater than> ::= <exp4> # `> <exp5> =>
    public Exp newGreaterThan(Exp e1, int pos, Exp e2) {
        return new GreaterThan(pos, e1, e2);
    }

    //: <less than> ::= <exp4> # `< <exp5> =>
    public Exp newLessThan(Exp e1, int pos, Exp e2) {
        return new LessThan(pos, e1, e2);
    }

    //: <instanceof> ::= <exp4> # `instanceof <type> =>
    public Exp newInstanceOf(Exp e1, int pos, Type t) {
        return new InstanceOf(pos, e1, t);
    }

    //: <exp5> ::= <plus> => pass
    //: <exp5> ::= <minus> => pass

	//: <plus> ::= <exp5> # `+ <exp6> =>
	public Exp newPlus(Exp e1, int pos, Exp e2) {
		return new Plus(pos, e1, e2);
	}

    //: <minus> ::= <exp5> # `- <exp6> =>
    public Exp newMinus(Exp e1, int pos, Exp e2) {
        return new Minus(pos, e1, e2);
    }


	//: <exp7> ::= <exp7> # `* <exp8> =>
	public Exp newTimes(Exp e1, int pos, Exp e2) {
		return new Times(pos, e1, e2);
	}

    //: <exp7> ::= <exp7> # `/ <exp8> =>
    public Exp newDivide(Exp e1, int pos, Exp e2) {
        return new Divide(pos, e1, e2);
    }

    //: <exp7> ::= <exp7> # `% <exp8> =>
    public Exp newMod(Exp e1, int pos, Exp e2) {
        return new Remainder(pos, e1, e2);
    }

	//: <exp8> ::= <cast exp> => pass
	//: <exp8> ::= <unary exp> => pass

	//: <cast exp> ::= # `( <type> `) <cast exp> =>
	public Exp newCast(int pos, Type t, Exp e) {
		return new Cast(pos, t, e);
	}
	//: <cast exp> ::= # `( <type> `) <exp9> => Exp newCast(int, Type, Exp)

	//: <unary exp> ::= # `- <unary exp> =>
	public Exp newUnaryMinus(int pos, Exp e) {
		return new Minus(pos, new IntegerLiteral(pos, 0), e);
	}

    //: <unary exp> ::= # `+ <unary exp> =>
    public Exp newUnaryPlus(int pos, Exp e) {
        return new Plus(pos, new IntegerLiteral(pos, 0), e);
    }
	//: <unary exp> ::= <exp9> => pass

	//: <exp9> ::= # ID  =>
	public Exp newIdentfierExp(int pos, String name) {
		return new IdentifierExp(pos, name);
	}

    //: <exp9> ::= # `null =>
    public Exp newNullExp(int pos) {
        return new Null(pos);
    }

    //: <exp9> ::= # `true =>
    public Exp newTrueExp(int pos) {
        return new True(pos);
    }

    //: <exp9> ::= # `false =>
    public Exp newFalseExp(int pos) {
        return new False(pos);
    }

    //: <exp9> ::= # `this =>
    public Exp newThisExp(int pos) {
        return new This(pos);
    }

    //: <exp9> ::= # `super =>
    public Exp newSuperExp(int pos) {
        return new Super(pos);
    }

	//: <exp9> ::= <exp9> !<empty bracket pair> # `[ <exp> `] =>
	public Exp newArrayLookup(Exp e1, int pos, Exp e2) {
		return new ArrayLookup(pos, e1, e2);
	}

    /**
     * Instance Variable Access
     */
    //: <exp9> ::= # <exp9> `. ID !`( =>
    public Exp newInstanceVarAccess(int pos, Exp e, String s) {
        return new InstVarAccess(pos, e, s);
    }

    /**
     * Literals
     */
	//: <exp9> ::= # INTLIT =>
	public Exp newIntegerLiteral(int pos, int n) {
		return new IntegerLiteral(pos, n);
	}

    //: <exp9> ::= # STRINGLIT =>
    public Exp newStringLiteral(int pos, String s) {
        return new StringLiteral(pos, s);
    }

    /**
     * Method Calls
     */
    //: <exp list> ::= <exp> `, <exp list> =>
    public ExpList newExpParam(Exp e, ExpList el) {
        el.addElementAtFront(e);
        return el;
    }

    //: <exp list> ::= <exp>=>
    public ExpList newExpList(Exp e) {
        ExpList list = new ExpList();
        list.add(e);
        return list;
    }

    //: <exp9> ::= # <exp9> `. ID `( <exp list> `) =>
    public Exp newCallExp(int pos, Exp e, String s, ExpList el) {
        return new Call(pos, e, s, el);
    }

    //: <exp9> ::= # <exp9> `. ID `( !<exp list> `) =>
    public Exp newCallExpNoParam(int pos, Exp e, String s) {
        return new Call(pos, new This(pos), s, new ExpList());
    }

    //: <exp9> ::= # !`. ID `( !<exp list> `) =>
    public Exp newCallThisExpNoParam(int pos, String s) {
        return new Call(pos, new This(pos), s, new ExpList());
    }

    /**
     * Object Creation Expression
     */
    //: <exp9> ::= # `new ID `( `) =>
    public Exp newClassInst(int pos, String s) {
        IdentifierType it = new IdentifierType(pos, s);
        return new NewObject(pos, it);
    }

    /**
     * Array Creation Expression
     */
    //: <exp9> ::= # `new <type> `[ <exp9> `] =>
    public Exp newArrayInst(int pos, Type t, Exp e) {
        return new NewArray(pos, t, e);
    }

	//================================================================
	// Lexical grammar for filtered language begins here: DO NOT MODIFY
	// ANYTHING BELOW THIS, UNLESS YOU REPLACE IT WITH YOUR ENTIRE
	// LEXICAL GRAMMAR, and set the constant FILTER_GRAMMAR (defined
	// near the top of this file) to false.
	//================================================================

	//: letter ::= {"a".."z" "A".."Z"} => pass
	//: letter128 ::= {225..250 193..218} =>
	public char sub128(char orig) {
		return (char)(orig-128);
	}
	//: digit ::= {"0".."9"} => pass
	//: digit128 ::= {176..185} => char sub128(char)
	//: any ::= {0..127} => pass
	//: any128 ::= {128..255} => char sub128(char)
	//: ws ::= " "
	//: ws ::= {10} registerNewline
	//: registerNewline ::= # => void registerNewline(int)
	//: `boolean ::= "#bo" ws*
	//: `class ::= "#cl" ws*
	//: `extends ::= "#ex" ws*
	//: `void ::= "#vo" ws*
	//: `int ::= "#it" ws*
	//: `while ::= "#wh" ws*
	//: `if ::= '#+' ws*
	//: `else ::= "#el" ws*
	//: `for ::= "#fo" ws*
	//: `break ::= "#br" ws*
	//: `this ::= "#th" ws*
	//: `false ::= '#fa' ws*
	//: `true ::= "#tr" ws*
	//: `super ::= "#su" ws*
	//: `null ::= "#nu" ws*
	//: `return ::= "#re" ws*
	//: `instanceof ::= "#in" ws*
	//: `new ::= "#ne" ws*
	//: `abstract ::= "#ab" ws*
	//: `assert ::= "#as" ws*
	//: `byte ::= "#by" ws*
	//: `case ::= "#ce" ws*
	//: `catch ::= "#ca" ws*
	//: `char ::= "#ch" ws*
	//: `const ::= "#ct" ws*
	//: `continue ::= "#co" ws*
	//: `default ::= "#de" ws*
	//: `do ::= "#-" ws*
	//: `double ::= "#do" ws*
	//: `enum ::= "#en" ws*
	//: `final ::= "#fi" ws*
	//: `finally ::= "#fy" ws*
	//: `float ::= "#fl" ws*
	//: `goto ::= "#go" ws*
	//: `implements ::= "#is" ws*
	//: `import ::= "#im" ws*
	//: `interface ::= "#ie" ws*
	//: `long ::= "#lo" ws*
	//: `native ::= "#na" ws*
	//: `package ::= "#pa" ws*
	//: `private ::= "#pr" ws*
	//: `protected ::= "#pd" ws*
	//: `public ::= "#pu" ws*
	//: `short ::= "#sh" ws*
	//: `static ::= '#sc' ws*
	//: `strictfp ::= "#st" ws*
	//: `switch ::= "#sw" ws*
	//: `synchronized ::= "#sy" ws*
	//: `throw ::= "#tw" ws*
	//: `throws ::= "#ts" ws*
	//: `transient ::= "#tt" ws*
	//: `try ::= "#ty" ws*
	//: `volatile ::= "#ve" ws*
	
	//: `! ::=  "!" ws* => void
	//: `!= ::=  "@!" ws* => void
	//: `% ::= "%" ws* => void
	//: `&& ::= "@&" ws* => void
	//: `* ::= "*" ws* => void
	//: `( ::= "(" ws* => void
	//: `) ::= ")" ws* => void
	//: `{ ::= "{" ws* => void
	//: `} ::= "}" ws* => void
	//: `- ::= "-" ws* => void
	//: `+ ::= "+" ws* => void
	//: `= ::= "=" ws* => void
	//: `== ::= "@=" ws* => void
	//: `[ ::= "[" ws* => void
	//: `] ::= "]" ws* => void
	//: `|| ::= "@|" ws* => void
	//: `< ::= "<" ws* => void
	//: `<= ::= "@<" ws* => void
	//: `, ::= "," ws* => void
	//: `> ::= ">"  !'=' ws* => void
	//: `>= ::= "@>" ws* => void
	//: `: ::= ":" ws* => void
	//: `. ::= "." ws* => void
	//: `; ::= ";" ws* => void
	//: `++ ::= "@+" ws* => void
	//: `-- ::= "@-" ws* => void
	//: `/ ::= "/" ws* => void

	
	//: ID ::= letter128 ws* => text
	//: ID ::= letter idChar* idChar128 ws* => text
	
	//: INTLIT ::= {"1".."9"} digit* digit128 ws* => 
	public int convertToInt(char c, List<Character> mid, char last) {
		return Integer.parseInt(""+c+mid+last);
	}
	//: INTLIT ::= digit128 ws* => 
	public int convertToInt(char c) {
		return Integer.parseInt(""+c);
	}
	//: INTLIT ::= "0" hexDigit* hexDigit128 ws* => 
	public int convert16ToInt(char c, List<Character> mid, char last) {
		return Integer.parseInt(""+c+mid+last, 16);
	}
	//: STRINGLIT ::= '@"' ws* =>
	public String emptyString(char x, char xx) {
		return "";
	}
	//: STRINGLIT ::= '"' any* any128 ws* =>
	public String string(char x, List<Character> mid, char last) {
		return ""+mid+last;
	}
	//: CHARLIT ::= "'" any ws* =>
	public int charVal(char x, char val) {
		return val;
	}
	
	//: idChar ::= letter => pass
	//: idChar ::= digit => pass
	//: idChar ::= "_" => pass
	//: idChar128 ::= letter128 => pass
	//: idChar128 ::= digit128 => pass
	//: idChar128 ::= {223} => 
	public char underscore(char x) {
		return '_';
	}
	//: hexDigit ::= {"0".."9" "a".."z" "A".."Z"} => pass
	//: hexDigit128 ::= {176..185 225..230 193..198} => char sub128(char)

}

