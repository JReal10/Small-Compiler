grammar python;

start :'begin' + statementList + 'end' EOF;

statementList: statement | statement ';' statementList;

statement: assign | expr | declare |condition| iteration| total| print| variableType|else|localDeclare;

assign: VARIABLE '=' expr;

declare: variableType VARIABLE;

else: 'else';

variableType: 'integer'|'string'| 'double' | 'float';

condition:'if' '(' expr ')''{' statementList '}' (else '{' statementList '}')?;

iteration:'while' + '(' + expr + ')' + '{'statementList'}';

print: 'print' + '('expr')';

total: VARIABLE '+=' expr;

localDeclare: '{' declare? statementList '}';

expr: expr op=(' * ' | ' / '|' % ') expr  #Mult
    | expr op=(' + ' | ' - ') expr  #Add
    | expr op=(' < '|' > '|' <= '|' >= ') expr#Comparisson
    | expr op=(' == '|' != ') expr #Equals
    | '(' expr ')'              #Paren
    | NUMBER                    #NUMBER
    | VARIABLE                  #VARIABLE
    ;

NUMBER: '-'? DIGIT+ ('.' DIGIT+)?;
VARIABLE: [a-zA-Z]+;

fragment DIGIT: [0-9];
fragment NEWLINE: [\r\n]+;
IGNORED: NEWLINE -> skip;
WS: [ \t\r\n]+ -> skip;