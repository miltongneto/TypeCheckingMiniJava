package build;

import ast.And;
import ast.ArrayAssign;
import ast.ArrayLength;
import ast.ArrayLookup;
import ast.Block;
import ast.BooleanType;
import ast.Call;
import ast.ClassDecl;
import ast.ClassDeclExtends;
import ast.ClassDeclList;
import ast.ClassDeclSimple;
import ast.Exp;
import ast.ExpList;
import ast.False;
import ast.Formal;
import ast.FormalList;
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
import ast.MethodDeclList;
import ast.Minus;
import ast.NewArray;
import ast.NewObject;
import ast.Not;
import ast.Plus;
import ast.Print;
import ast.Program;
import ast.Statement;
import ast.StatementList;
import ast.This;
import ast.Times;
import ast.True;
import ast.Type;
import ast.VarDecl;
import ast.VarDeclList;
import ast.While;

import java.util.List;


import org.antlr.v4.runtime.tree.TerminalNode;

import sourceParser.gramaticaParser.ClassDeclarationContext;
import sourceParser.gramaticaParser.ExpressionContext;
import sourceParser.gramaticaParser.FormalContext;
import sourceParser.gramaticaParser.FormalListContext;
import sourceParser.gramaticaParser.GoalContext;
import sourceParser.gramaticaParser.MainClassContext;
import sourceParser.gramaticaParser.MethodDeclarationContext;
import sourceParser.gramaticaParser.StatementContext;
import sourceParser.gramaticaParser.TypeContext;
import sourceParser.gramaticaParser.VarDeclarationContext;

public class BuildASTcorreto {

	MainClass mainClass;
	ClassDeclList classDeclList;

	// get + set + constructor
	public BuildASTcorreto() {
		// super();
		mainClass = new MainClass(null, null, null);
	}

	public MainClass getMainClass() {
		return mainClass;
	}

	public void setMainClass(MainClass mainClass) {
		this.mainClass = mainClass;
	}

	public ClassDeclList getClassDeclList() {
		return classDeclList;
	}

	public void setClassDeclList(ClassDeclList classDeclList) {
		this.classDeclList = classDeclList;
	}

	/*
	 * Instanciar para as classes da AST Para cada "tipo" visitado, retornar um
	 * objeto instanciado a classe equivalente a ele (Context)
	 */

	public Program visitGoal(GoalContext goal) {
		Program aux;
		mainClass = visitMainClass(goal.mainClass());
		classDeclList = visitClassDeclList(goal.classDeclaration());
		aux = new Program(mainClass, classDeclList);
		return aux;
	}

	private MainClass visitMainClass(MainClassContext mainClass2) {
		MainClass aux;
		Identifier identifier1 = this.visitIdentifier(mainClass2.IDENTIFIER(0));
		Identifier identifier2 = this.visitIdentifier(mainClass2.IDENTIFIER(1));
		Statement statement = this.visitStatement(mainClass2.statement());
		aux = new MainClass(identifier1, identifier2, statement);
		return aux;
	}

	private Statement visitStatement(StatementContext statement) {
		if (statement.isEmpty()) {
			return null;
		} else if (statement.getChild(0).getText().equals("{")) {
			return this.visitBlock(statement.statement());
		} else if (statement.getChild(0).getText().equals("if")) {
			return new If(this.visitExpression(statement.expression(0)), this.visitStatement(statement.statement(0)),
					this.visitStatement(statement.statement(1)));
		} else if (statement.getChild(0).getText().equals("while")) {
			return new While(this.visitExpression(statement.expression(0)),
					this.visitStatement(statement.statement(0)));
		} else if (statement.getChild(0).getText().equals("System.out.println")) {
			return new Print(this.visitExpression(statement.expression(0)));
		} else if (statement.getChild(1).getText().equals("=")) {
			return this.visitAssign(statement.IDENTIFIER(), statement.expression(0));
		} else {
			return this.visitArrayAssign(statement.IDENTIFIER(), statement.expression(0), statement.expression(1));
		}
	}

	private Statement visitArrayAssign(TerminalNode identifier, ExpressionContext expression,
			ExpressionContext expression2) {
		return new ArrayAssign(this.visitIdentifier(identifier), this.visitExpression(expression),
				this.visitExpression(expression2));
	}

	private Statement visitAssign(TerminalNode identifier, ExpressionContext expression) {
		return new ArrayAssign(this.visitIdentifier(identifier), this.visitExpression(expression),
				this.visitExpression(expression));
	}

	private Statement visitBlock(List<StatementContext> statement) {
		return new Block(this.visitStatementList(statement));
	}

	private StatementList visitStatementList(List<StatementContext> statement) {
		StatementList aux = new StatementList();
		for (StatementContext stctx : statement) {
			aux.addElement(this.visitStatement(stctx));
		}
		return aux;
	}

	private Exp visitExpression(ExpressionContext expression) {
		Exp aux = null;
		TerminalNode oper = expression.OPERATOR();
		TerminalNode ids = expression.IDENTIFIER();
		TerminalNode literal = expression.INTEGER_LITERAL();
		String text = expression.getText();
		if (oper != null) {
			Exp exp1 = this.visitExpression(expression.expression(0));
			Exp exp2 = this.visitExpression(expression.expression(1));

			if (oper.getText().equals("&&")) {
				return new And(exp1, exp2);
			} else if (oper.getText().equals("<")) {
				return new LessThan(exp1, exp2);
			} else if (oper.getText().equals("+")) {
				return new Plus(exp1, exp2);
			} else if (oper.getText().equals("*")) {
				return new Times(exp1, exp2);
			} else if (oper.getText().equals("-")) {
				return new Minus(exp1, exp2);
			}
		} else if (text.contains("!")) {
			return new Not(this.visitExpression(expression.expression(0)));
		} else if (expression.expression().size() >= 1 && ids != null) {
			return new Call(this.visitExpression(expression.expression(0)), new Identifier(ids.getText()), this.visitExpList(expression.expression().subList(1, expression.expression().size())));
		} else if (expression.getText().contains("true")) {
			return new True();
		} else if (expression.getText().contains("false")) {
			return new False();
		} else if (expression.getText().contains("this")) {
			return new This();
		} else if (expression.expression().size() == 2) {
			return new ArrayLookup(this.visitExpression(expression.expression(0)), this.visitExpression(expression.expression(1)));
		} else if (expression.expression().size() == 1 && !text.contains("new")) {
			return new ArrayLength(this.visitExpression(expression.expression(0)));
		} else if (literal != null) {
			return new IntegerLiteral(Integer.parseInt(literal.getText()));
		} else if (ids != null && !text.contains("new")) {
			return new IdentifierExp(ids.getText());
		} else if (text.contains("new")) {
			if (expression.expression().size() == 1) {
				return new NewArray(this.visitExpression(expression.expression(0)));
			} else {
				return new NewObject(new Identifier(ids.getText()));
			}
		}
		return this.visitExpression(expression.expression(0));
	}

	private ExpList visitExpList(List<ExpressionContext> subList) {
		ExpList expList = new ExpList();
		for (int i = 0; i < subList.size(); i++) expList.addElement(this.visitExpression(subList.get(i)));
		return expList;
	}

	private ClassDeclList visitClassDeclList(List<ClassDeclarationContext> classDeclaration) {
		ClassDeclList classDecList = new ClassDeclList();
		for (ClassDeclarationContext c : classDeclaration) {
			if (c.IDENTIFIER().size() > 1)
				classDecList.addElement(this.visitClassDeclExtends(c));
			else
				classDecList.addElement(this.visitClassDecl(c));
		}
		return classDecList;
	}

	private ClassDecl visitClassDecl(ClassDeclarationContext c) {
		ClassDeclSimple aux;
		Identifier identifier = this.visitIdentifier(c.IDENTIFIER(0));
		VarDeclList varList = this.visitVarDeclList(c.varDeclaration());
		MethodDeclList method = this.visitMethodDeclList(c.methodDeclaration());
		aux = new ClassDeclSimple(identifier, varList, method);
		return aux;
	}

	private MethodDeclList visitMethodDeclList(List<MethodDeclarationContext> methodDeclaration) {
		MethodDeclList method = new MethodDeclList();
		for (MethodDeclarationContext m : methodDeclaration) {
			method.addElement(this.visitMethodDecl(m));
		}
		return method;
	}

	private MethodDecl visitMethodDecl(MethodDeclarationContext m) {
		MethodDecl aux;
		FormalList formal = new FormalList();
		List<TypeContext> types = m.type();
		Type type = this.visitType(types.get(0));
		List<TerminalNode> tokens = m.IDENTIFIER();
		Identifier identifier = new Identifier(tokens.get(0).getText());
		int i;
		for (i = 1; i < types.size(); i++) {
			formal.addElement(new Formal(this.visitType(types.get(i)), new Identifier(tokens.get(i).getText())));
		}
		VarDeclList vdl = this.visitVarDeclList(m.varDeclaration());
		StatementList statement = this.visitStatementList(m.statement());
		Exp exp = this.visitExpression(m.expression());
		aux = new MethodDecl(type, identifier, formal, vdl, statement, exp);
		return aux;
	}

	private Formal visitFormal(FormalContext ctx) {
		Identifier identifier = this.visitIdentifier(ctx.IDENTIFIER());
		Type type = this.visitType(ctx.type());
		return new Formal(type, identifier);
	}

	private FormalList visitFormalList(FormalListContext flc) {
		Type type = this.visitType(flc.type());
		FormalList formal = new FormalList();
		Identifier identifier = this.visitIdentifier(flc.IDENTIFIER());
		formal.addElement(new Formal(type, identifier));
		for (FormalContext ctx : flc.formal()) {
			formal.addElement(this.visitFormal(ctx));
		}
		return formal;
	}

	private Identifier visitIdentifier(TerminalNode identifier) {
		String id = identifier.toString();
		Identifier aux = new Identifier(id);
		return aux;
	}

	private Type visitType(TypeContext type) {
		Type aux = null;
		if (type.getText().equals("int[]") || type.getText().equals("int []")) {
			aux = new IntArrayType();
		} else if (type.getText().equals("int")) {
			aux = new IntegerType();
		} else if (type.getText().equals("boolean")) {
			aux = new BooleanType();
		} else {
			aux = new IdentifierType(type.IDENTIFIER().getText());
		}
		// Diogo, vê se precisa adc o Identifier aqui, por favor.
		return aux;
	}

	private VarDeclList visitVarDeclList(List<VarDeclarationContext> varDeclaration) {
		VarDeclList vdl = new VarDeclList();
		for (VarDeclarationContext ctx : varDeclaration) {
			vdl.addElement(this.visitVarDecl(ctx));
		}
		return vdl;
	}

	private VarDecl visitVarDecl(VarDeclarationContext ctx) {
		return new VarDecl(this.visitType(ctx.type()), this.visitIdentifier(ctx.IDENTIFIER()));
	}

	private ClassDecl visitClassDeclExtends(ClassDeclarationContext c) {
		ClassDeclExtends aux;
		Identifier identifier1 = this.visitIdentifier(c.IDENTIFIER(0));
		Identifier identifier2 = this.visitIdentifier(c.IDENTIFIER(1));
		VarDeclList varList = this.visitVarDeclList(c.varDeclaration());
		MethodDeclList method = this.visitMethodDeclList(c.methodDeclaration());
		aux = new ClassDeclExtends(identifier1, identifier2, varList, method);
		return aux;
	}
}