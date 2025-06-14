parser grammar DecibelParser;

options { tokenVocab = DecibelLexer; }

program
    :   statements
    ;
statements
    :   statement*
    ;
statement
    :   expression ';'                                          #baseStatement
    |   assignment ';'                                          #assignmentStatement
    |   function                                                #functionStatement
    |   if                                                      #ifStatement
    |   while                                                   #whileStatement
    |   for                                                     #forStatement
    |   'return' expression ';'                                 #returnStatment
    |   'continue' ';'                                          #continueStatement
    |   'break' ';'                                             #breakStatement
    ;
expression
    :   '(' expression ')'                                      #baseExpression
    |   increment                                               #incrementExpression
    |   expression '**' expression                              #powerExpression
    |   expression op=('*'|'/'|'%') expression                  #multiplicationExpression
    |   expression op=('+'|'-') expression                      #additionExpression
    |   expression op=('>>'|'<<') expression                    #shiftExpression
    |   expression op=(AND|OR) expression                       #logicalExpression
    |   expression '&' expression                               #logicalAndExpression
    |   expression op=('|'|'^') expression                      #logicalOrExpression
    |   expression op=('>'|'<'|'=='|'>='|'<=') expression       #comparisonExpression
    |   op=(NOT | '-' | '+') expression                         #unaryExpression
    |   call                                                    #callExpression
    |   index                                                   #indexExpression
    |   list                                                    #listExpression
    |   length                                                  #lengthExpression
    |   REAL                                                    #realExpression
    |   STRING                                                  #stringExpression
    |   boolean                                                 #booleanExpression
    |   IDENTIFIER                                              #identifierExpression
    ;
assignment
    :   IDENTIFIER '=' expression
    ;
function
    :   'function' IDENTIFIER '(' formalParameters ')' block
    ;
if
    :   'if' expression block ('else' (block|if))?
    ;
while
    :   'while' expression block
    ;
for
    :   'for' '(' assignmentOrExpression ';' expression ';' assignmentOrExpression ')' block
    ;
assignmentOrExpression
    :   (assignment|expression)
    ;
call
    :   IDENTIFIER '(' actualParameters ')'
    ;
formalParameters
    :   (IDENTIFIER (',' IDENTIFIER)*)?
    ;
actualParameters
    :   (expression (',' expression)*)?
    ;
block
    :   '{' statements '}'
    ;
list
    :   '[' actualParameters ']'
    ;
index
    :   IDENTIFIER '[' expression ']'
    ;
length
    :   IDENTIFIER LENGTH
    ;
increment
    :   prefixIncrement
    |   postfixIncrement
    ;
prefixIncrement
    :   op=('++'|'--') IDENTIFIER
    ;
postfixIncrement
    :   IDENTIFIER op=('++'|'--')
    ;
boolean
    :   'true'
    |   'false'
    ;