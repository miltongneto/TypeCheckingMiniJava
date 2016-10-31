package build;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import ast.*;
import sources.mvgnParser.ClassDeclContext;
import sources.mvgnParser.ExpContext;
import sources.mvgnParser.FormalContext;
import sources.mvgnParser.FormalListContext;
import sources.mvgnParser.GoalContext;
import sources.mvgnParser.MainClassContext;
import sources.mvgnParser.MethodDeclContext;
import sources.mvgnParser.StatementContext;
import sources.mvgnParser.TypeContext;
import sources.mvgnParser.VarDeclContext;

public class BuilderAST {
	
	public BuilderAST(){
		
	}

	public Program returnGoal(GoalContext ctx){
		MainClass mainClass = returnMainClass(ctx.mainClass());
		ClassDeclList classDeclList = returnClassDeclList(ctx.classDecl());
		
		return new Program(mainClass,classDeclList);
	}
	
	public MainClass returnMainClass(MainClassContext ctx){
		Identifier id1 = returnIdentifier(ctx.IDENTIFIER(0));
		Identifier id2 = returnIdentifier(ctx.IDENTIFIER(1));
		Statement st = returnStatement(ctx.statement());
		return new MainClass(id1,id2,st);
	}
	
	public Identifier returnIdentifier(TerminalNode id){
		Identifier i = new Identifier(null);
		if(id !=null){
			String str = id.toString();
			i = new Identifier(str);
		}
		
		return i;
	}
	
	public Statement returnStatement(StatementContext ctx){
		Statement result = null;
		
		if(ctx.isEmpty()) result = null;
		if(ctx.getChildCount() >0){
			if(ctx.exp().size() == 2){
				result = returnArrayAssing(ctx.IDENTIFIER(), ctx.exp(0), ctx.exp(1));
			}else if(ctx.getChild(0).getText().equals("if")){
				result = returnIfStatement(ctx);
			}else if(ctx.getChild(0).getText().equals("while")){
				result = returnWhileStatement(ctx);
			}else if(ctx.getChild(0).getText().equals("System.out.println")){
				result = new Print(returnExp(ctx.exp(0)));				
			}else if(ctx.getChild(1).getText().equals("=") || ctx.getChild(2).getText().equals("=")){
				result = returnAssignStatement(ctx.IDENTIFIER(), ctx.exp(0));
			}else{
				result = returnBlockStatement(ctx.statement());
			}
		}
		return result;
		
	}
	
	public Statement returnAssignStatement(TerminalNode id, ExpContext exp){
		Identifier i = returnIdentifier(id);
		Exp e = returnExp(exp);
		return new Assign(i, e);
	}
	
	public Statement returnArrayAssing(TerminalNode id, ExpContext exp1,ExpContext exp2){
		Identifier i = returnIdentifier(id);
		Exp e1 = returnExp(exp1);
		Exp e2 = returnExp(exp2);
		return new ArrayAssign(i,e1,e2);
	}
	
	public Statement returnIfStatement(StatementContext ctx){
		Exp exp = returnExp(ctx.exp(0));
		Statement st1 = returnStatement(ctx.statement(0));
		Statement st2 = returnStatement(ctx.statement(1));
		return new If(exp, st1, st2);
	}
	public Statement returnWhileStatement(StatementContext ctx){
		Exp exp = returnExp(ctx.exp(0));
		Statement st = returnStatement(ctx.statement(0));
		return new While(exp, st);
	}
	
	public ClassDeclList returnClassDeclList(List<ClassDeclContext> ctxList){
		ClassDeclList classDeclList = new ClassDeclList();
		
		for(int i=0; i < ctxList.size(); i++){
			ClassDecl element = returnClassDecl(ctxList.get(i));
			classDeclList.addElement(element);
		}
		
		return classDeclList;
	}
	
	public ClassDecl returnClassDecl(ClassDeclContext ctx){
		ClassDecl classDecl;
		if(ctx.IDENTIFIER().size() > 1)
			classDecl = returnClassDeclExtends(ctx);
		else
			classDecl = returnClassDeclSimple(ctx);
		
		return classDecl;
	}
	public ClassDeclExtends returnClassDeclExtends(ClassDeclContext ctx){
		Identifier id1 = returnIdentifier (ctx.IDENTIFIER(0));
		Identifier id2 = returnIdentifier(ctx.IDENTIFIER(1));
		VarDeclList varList = returnVarDeclList(ctx.varDecl()); 
		MethodDeclList methodList = returnMethodDeclList(ctx.methodDecl());
		return new ClassDeclExtends(id1,id2,varList,methodList);
	}
	public ClassDeclSimple returnClassDeclSimple(ClassDeclContext ctx){
		Identifier id = returnIdentifier(ctx.IDENTIFIER(0));
		VarDeclList varList = returnVarDeclList(ctx.varDecl()); 
		MethodDeclList methodList = returnMethodDeclList(ctx.methodDecl());
		return new ClassDeclSimple(id,varList,methodList);
	}
	
	public VarDeclList returnVarDeclList(List<VarDeclContext> ctxList){
		VarDeclList varList = new VarDeclList();
		
		for(int i=0;i<ctxList.size();i++){
			VarDecl var = returnVarDecl(ctxList.get(i));
			varList.addElement(var);
		}
		return varList;
	}
	public VarDecl returnVarDecl(VarDeclContext ctx){
		Type type = returnType(ctx.type());
		Identifier id = returnIdentifier(ctx.IDENTIFIER());
		return new VarDecl(type, id);
	}
	
	public MethodDeclList returnMethodDeclList(List<MethodDeclContext> ctxList){
		MethodDeclList methodList = new MethodDeclList();
		
		for(int i=0;i<ctxList.size();i++){
			MethodDecl method = returnMethodDecl(ctxList.get(i));
			methodList.addElement(method);
		}
		return methodList;
	}
	public MethodDecl returnMethodDecl(MethodDeclContext ctx){
		Type type = returnType(ctx.type());
		Identifier id = returnIdentifier(ctx.IDENTIFIER());
		VarDeclList varList = returnVarDeclList(ctx.varDecl());
		FormalList formalList = returnFormalList(ctx.formalList());
		StatementList stList = returnStatementList(ctx.statement()); 	
		Exp exp = returnExp(ctx.exp());
		return new MethodDecl(type, id, formalList, varList, stList, exp);
	}
	
	public Type returnType(TypeContext ctx){
		return null;
	}
	
	public FormalList returnFormalList(FormalListContext ctxList){
		FormalList formalList = new FormalList();
		for(FormalContext formal : ctxList.formal()){
			Formal f = returnFormal(formal);
			formalList.addElement(f);
		}
		return formalList;
	}
	public Formal returnFormal(FormalContext ctx){
		Identifier id = returnIdentifier(ctx.IDENTIFIER());
		Type type = returnType(ctx.type());
		return new Formal(type,id);
	}
	
	public StatementList returnStatementList(List<StatementContext> ctxList){
		StatementList list = new StatementList();
		for (int i=0;i<ctxList.size(); i++) {
			Statement st = returnStatement(ctxList.get(i));
			list.addElement(st);
		}
		return list;
	}
	public Statement returnBlockStatement(List<StatementContext> ctxList){
		return new Block(returnStatementList(ctxList));
	}
	public Exp returnExp(ExpContext ctx){
		Exp result = null;
		
		TerminalNode operator = ctx.OP();
		TerminalNode ids = ctx.IDENTIFIER();
		TerminalNode literal = ctx.INTEGER();
		String text = ctx.getText();
		if (operator != null) {
			Exp exp1 = this.returnExp(ctx.exp(0));
			Exp exp2 = this.returnExp(ctx.exp(1));

			switch(operator.getText()){
			case "&&":
				result = new And(exp1, exp2);
				break;
			case "<":
				result = new LessThan(exp1, exp2);
				break;
			case "+":
				result = new Plus(exp1, exp2);
				break;
			case "*": 
				result = new Times(exp1, exp2);
				break;
			case "-":
				result = new Minus(exp1, exp2);
				break;
			}
		} else if (text.contains("!")) {
			result = new Not(this.returnExp(ctx.exp(0)));
		} else if (ctx.exp().size() >= 1 && ids != null) {
			result = new Call(this.returnExp(ctx.exp(0)), new Identifier(ids.getText()), 
					returnExpList(ctx.exp().subList(1, ctx.exp().size())));
		} else if (ctx.getText().contains("true")) {
			result = new True();
		} else if (ctx.getText().contains("false")) {
			result = new False();
		} else if (ctx.getText().contains("this")) {
			result = new This();
		} else if (ctx.exp().size() == 2) {
			result = new ArrayLookup(this.returnExp(ctx.exp(0)), returnExp(ctx.exp(1)));
		} else if (ctx.exp().size() == 1 && !text.contains("new")) {
			result = new ArrayLength(this.returnExp(ctx.exp(0)));
		} else if (literal != null) {
			result = new IntegerLiteral(Integer.parseInt(literal.getText()));
		} else if (ids != null && !text.contains("new")) {
			result = new IdentifierExp(ids.getText());
		} else if (text.contains("new")) {
			if (ctx.exp().size() == 1) {
				result = new NewArray(this.returnExp(ctx.exp(0)));
			} else {
				result = new NewObject(new Identifier(ids.getText()));
			}
		}
		
		return result;
	}
	
	public ExpList returnExpList(List<ExpContext> ctxList){
		ExpList list = new ExpList();
		for(int i=0;i<list.size();i++){
			Exp exp = returnExp(ctxList.get(i));
			list.addElement(exp);
		}
		return list;
	}
}
