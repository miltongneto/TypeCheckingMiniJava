package build;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import ast.Program;
import sourceParser.gramaticaLexer;
import sourceParser.gramaticaParser;
import sources.mvgnLexer;
import sources.mvgnParser;
import visitor.BuildSymbolTableVisitor;
import visitor.PrettyPrintVisitor;
import visitor.TypeCheckVisitor;

public class Main {

	public static void main(String[] args) throws IOException {
		/*System.out.println("ok");
		InputStream is = (args.length == 0)
	            ?  System.in
	            : new FileInputStream(args[0]);
	    */
		FileInputStream is = new FileInputStream("prog.txt");
		ANTLRInputStream input = new ANTLRInputStream(is);
		gramaticaLexer lexer = new gramaticaLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		gramaticaParser parser = new gramaticaParser(tokens);
		
		BuildASTcorreto build = new BuildASTcorreto();	// Classe responsavel por fazer o mapeamento da ClassContext para a Class desejada
		
		Program prog = build.visitGoal(parser.goal());		// Retorna um Program
	
		PrettyPrintVisitor print = new PrettyPrintVisitor();
		BuildSymbolTableVisitor buildTable = new BuildSymbolTableVisitor();
		//prog.accept(print);
		prog.accept(buildTable);
		prog.accept(new TypeCheckVisitor(buildTable.getSymbolTable()));
}

}
