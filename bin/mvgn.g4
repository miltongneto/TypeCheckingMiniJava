grammar mvgn;

INTEGER:				[0-9]+ ;
IDENTIFIER:			 	[a-zA-Z]+ (INTEGER)*;
WHITESPACE:				[' \r\n\t']+ -> skip;
OP:						('&&' | '<' | '+' | '-' | '*') ;
						
						
goal:					mainClass (classDecl)* EOF;
mainClass:				'class' IDENTIFIER '{' 'public' 'static' 'void' 'main' 
						'(' 'String' '[' ']' IDENTIFIER ')' '{' statement '}' '}';

classDecl:				'class' IDENTIFIER '{' (varDecl)* (methodDecl)* '}'
						| 'class' IDENTIFIER ('extends' IDENTIFIER) '{'(varDecl)* (methodDecl)*'}' 
						; 
					
statement:				'{'(statement)*'}'
						| 'if' '('exp')' statement 'else' statement
						| 'while' '('exp')' statement
						| 'System.out.println' '('exp')' ';'
						| IDENTIFIER '=' exp ';'
						| IDENTIFIER'['exp']' '=' exp ';'
						;

exp:					exp OP exp
						| exp '['exp']'
						| exp '.' 'length'
						| exp '.' IDENTIFIER '('expList')'
						| INTEGER
						| 'true'
						| 'false'
						| IDENTIFIER
						| 'this'
						| 'new' 'int' '['exp']'
						| 'new' IDENTIFIER '(' ')'
						| '!' exp
						| '(' exp ')'
						;

expList:				exp (expRest)*;

expRest:				',' exp ;

varDecl: 				type IDENTIFIER ';' ;

methodDecl:				'public' type IDENTIFIER '(' formalList ')'  '{'(varDecl)* (statement)* 'return' exp ';' '}' ;

formalList:				type IDENTIFIER (',' formal)*;

formal:				 	type IDENTIFIER ;

type:					'int' '[' ']'
						| 'int'
						| 'boolean'
						| IDENTIFIER
						;
