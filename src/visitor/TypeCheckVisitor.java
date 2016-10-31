package visitor;

import symboltable.Method;
import symboltable.Class;
import symboltable.SymbolTable;
import ast.And;
import ast.ArrayAssign;
import ast.ArrayLength;
import ast.ArrayLookup;
import ast.Assign;
import ast.Block;
import ast.BooleanType;
import ast.Call;
import ast.ClassDeclExtends;
import ast.ClassDeclSimple;
import ast.False;
import ast.Formal;
import ast.Identifier;
import ast.IdentifierExp;
import ast.IdentifierType;
import ast.If;
import ast.IntArrayType;
import ast.IntegerLiteral;
import ast.IntegerType;
import ast.LessThan;
import ast.MainClass;
import ast.MethodDecl;
import ast.Minus;
import ast.NewArray;
import ast.NewObject;
import ast.Not;
import ast.Plus;
import ast.Print;
import ast.Program;
import ast.This;
import ast.Times;
import ast.True;
import ast.Type;
import ast.VarDecl;
import ast.While;

public class TypeCheckVisitor implements TypeVisitor {

	private SymbolTable symbolTable;
	private String currMethod;
	private String currClass;

	public TypeCheckVisitor(SymbolTable st) {
		symbolTable = st;
	}
	
	public boolean areIntegers(Type e1Type, Type e2Type){
		if(symbolTable.compareTypes(e1Type, e2Type))
			if(e1Type instanceof IntegerType)
				return true;
		System.out.println("Erro. Operacao precisa de dois INTEIROS");
		return false;
	}
	
	public boolean areBooleans(Type e1Type, Type e2Type){
		if(symbolTable.compareTypes(e1Type, e2Type))
			if(e1Type instanceof BooleanType)
				return true;
		System.out.println("Erro. Operacao precisa de dois BOOLEANOS");
		return false;
	}
	
	public boolean verificarRetorno(Type retorno, Type metodo){
		if(symbolTable.compareTypes(retorno, metodo)) return true;
		System.out.println("Erro. Retorno da funcao nao corresponde ao tipo do metodo");
		return false;
		
	}
	

	// MainClass m;
	// ClassDeclList cl;
	public Type visit(Program n) {
		//n.m.accept(this);
		for (int i = 0; i < n.cl.size(); i++) {
			n.cl.elementAt(i).accept(this);
		}
		return null;
	}

	// Identifier i1,i2;
	// Statement s;
	public Type visit(MainClass n) {
		n.i1.accept(this);
		n.i2.accept(this);
		n.s.accept(this);
		return null;
	}

	// Identifier i;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Type visit(ClassDeclSimple n) {
		//n.i.accept(this);
		currClass = n.i.s;
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.ml.size(); i++) {
			n.ml.elementAt(i).accept(this);
		}
		currClass = null;
		return null;
	}

	// Identifier i;
	// Identifier j;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Type visit(ClassDeclExtends n) {
		n.i.accept(this);
		n.j.accept(this);
		
		currClass = n.i.s;
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.ml.size(); i++) {
			n.ml.elementAt(i).accept(this);
		}
		currClass = null;
		return null;
	}

	// Type t;
	// Identifier i;
	public Type visit(VarDecl n) {
		//n.t.accept(this);
		//n.i.accept(this);
		return null;
	}

	// Type t;
	// Identifier i;
	// FormalList fl;
	// VarDeclList vl;
	// StatementList sl;
	// Exp e;
	public Type visit(MethodDecl n) {
		//n.t.accept(this);
		//n.i.accept(this);
		
		currMethod = n.i.s;
		
		for (int i = 0; i < n.fl.size(); i++) {
			n.fl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
		
		Type retorno = n.e.accept(this);
		Type metodoType = n.t.accept(this);
		verificarRetorno(retorno, metodoType);
		
		currMethod = null;
		return null;
	}

	// Type t;
	// Identifier i;
	public Type visit(Formal n) {
		n.t.accept(this);
		n.i.accept(this);
		return n.t;
	}

	public Type visit(IntArrayType n) {
		return n;
	}

	public Type visit(BooleanType n) {
		return n;
	}

	public Type visit(IntegerType n) {
		return n;
	}

	// String s;
	public Type visit(IdentifierType n) {
		return n;
	}

	// StatementList sl;
	public Type visit(Block n) {
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
		return null;
	}

	// Exp e;
	// Statement s1,s2;
	public Type visit(If n) {
		Type type = n.e.accept(this);
		if(type instanceof BooleanType){
			n.s1.accept(this);
			n.s2.accept(this);
			return null;
		}
		System.out.println("ERRO. IF precisa receber uma EXPRESSAO BOOLEANA");
		return null;
	}

	// Exp e;
	// Statement s;
	public Type visit(While n) {
		Type type = n.e.accept(this);
		if(type instanceof BooleanType){
			n.s.accept(this);
			return null;
		}
		System.out.println("ERRO. WHILE precisa receber uma EXPRESSAO BOOLEANA");
		return null;
	}

	// Exp e;
	public Type visit(Print n) {
		n.e.accept(this);
		return null;
	}

	// Identifier i;
	// Exp e;
	public Type visit(Assign n) {
		
		//symbolTable.getVarType(m, c, n.i);
		n.i.accept(this);
		n.e.accept(this);
		return null;
	}

	// Identifier i;
	// Exp e1,e2;
	public Type visit(ArrayAssign n) {
		Type idType = n.i.accept(this);
		Type exp1Type = n.e1.accept(this);
		Type exp2Type = n.e2.accept(this);
		
		if(symbolTable.compareTypes(idType, exp1Type) && symbolTable.compareTypes(idType, exp2Type)) return null;
		System.out.println("Erro. Tipos diferentes");
		return null;
	}

	// Exp e1,e2;
	public Type visit(And n) {
		Type e1Type = n.e1.accept(this);
		Type e2Type = n.e2.accept(this);
		
		if(areBooleans(e1Type, e2Type))
			return new BooleanType();

		return null;
	}

	// Exp e1,e2;
	public Type visit(LessThan n) {
		Type e1Type = n.e1.accept(this);
		Type e2Type = n.e2.accept(this);
		
		if(areIntegers(e1Type, e2Type))
			return new IntegerType();

		return null;
	}

	// Exp e1,e2;
	public Type visit(Plus n) {
		Type e1Type = n.e1.accept(this);
		Type e2Type = n.e2.accept(this);
		
		if(areIntegers(e1Type, e2Type))
			return new IntegerType();

		return null;
	}

	// Exp e1,e2;
	public Type visit(Minus n) {
		Type e1Type = n.e1.accept(this);
		Type e2Type = n.e2.accept(this);
		
		if(areIntegers(e1Type, e2Type))
			return new IntegerType();

		return null;
	}

	// Exp e1,e2;
	public Type visit(Times n) {
		Type e1Type = n.e1.accept(this);
		Type e2Type = n.e2.accept(this);
		
		if(areIntegers(e1Type, e2Type))
			return new IntegerType();

		return null;
	}

	// Exp e1,e2;
	public Type visit(ArrayLookup n) {
		n.e1.accept(this);
		n.e2.accept(this);
		return null;
	}

	// Exp e;
	public Type visit(ArrayLength n) {
		n.e.accept(this);
		return null;
	}

	// Exp e;
	// Identifier i;
	// ExpList el;
	public Type visit(Call n) {
		String classAux = currClass;
		String methodAux = currMethod;
		
		Type e = n.e.accept(this);
		if(e instanceof IdentifierType){
			e = (IdentifierType) n.e.accept(this);
			currClass = ((IdentifierType) e).s;
			currMethod = n.i.s;
		}else{
			System.out.println("Erro. Nao eh possivel chamar uma funcao para esse tipo");
		}
		
		
		Type retornoType = n.e.accept(this);
		for (int i = 0; i < n.el.size(); i++) {
			n.el.elementAt(i).accept(this);
		}
		
		currClass = classAux;
		currMethod = methodAux;
		return retornoType;
	}

	// int i;
	public Type visit(IntegerLiteral n) {
		return new IntegerType();
	}

	public Type visit(True n) {
		return new BooleanType();
	}

	public Type visit(False n) {
		return new BooleanType();
	}

	// String s;
	public Type visit(IdentifierExp n) {
		Method m = symbolTable.getMethod(currMethod, currClass);
		Class c = symbolTable.getClass(currClass);
		Type result = null;
		
		if(symbolTable.getClass(n.s) != null) result = new IdentifierType(n.s);
		else if(m != null && currMethod.equals(n.s)) result = symbolTable.getMethodType(currMethod, currClass);
		else if(symbolTable.getVar(m, c, n.s) != null) result = symbolTable.getVarType(m, c, n.s);
		else{
			// MELHORAR ESSA PARTE DEPOIS. 
			if(n.s.equals("false") || n.s.equals("true")) return new BooleanType();
			else return new IntegerType();
		}
		
		return result;
	}

	public Type visit(This n) {
		return null;
	}

	// Exp e;
	public Type visit(NewArray n) {
		return n.e.accept(this);
	}

	// Identifier i;
	public Type visit(NewObject n) {
		Class c = symbolTable.getClass(n.i.s);
		Type classType = c.type();
		return classType;
	}

	// Exp e;
	public Type visit(Not n) {
		return n.e.accept(this);
	}

	// String s;
	public Type visit(Identifier n) {
		Method m = symbolTable.getMethod(currMethod, currClass);
		Class c = symbolTable.getClass(currClass);
		Type result = null;
		
		if(symbolTable.getClass(n.s) != null) result = new IdentifierType(n.s);
		else if(m != null && currMethod.equals(n.s)) result = symbolTable.getMethodType(currMethod, currClass);
		else{
			result = symbolTable.getVarType(m, c, n.s);
		}
		return result;
	}
}
