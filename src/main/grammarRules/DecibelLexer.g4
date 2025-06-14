lexer grammar DecibelLexer;

//  STRINGS
STRING                      :   QUOTE (ESCAPE | ~[\\"])+ QUOTE  ;
fragment ESCAPE             :   '\\' (. | UNICODE)              ;
fragment UNICODE            :   'u' HEX HEX HEX HEX             ;
fragment HEX                :   [0-9a-fA-F]                     ;

//  KEYWORDS
RETURN                      :   'return'                        ;
CONTINUE                    :   'continue'                      ;
BREAK                       :   'break'                         ;
FUNCTION                    :   'function'                      ;
IF                          :   'if'                            ;
ELSE                        :   'else'                          ;
FOR                         :   'for'                           ;
WHILE                       :   'while'                         ;

//  CONSTANTS
TRUE                        :   'true'                          ;
FALSE                       :   'false'                         ;

//  LOGIC OPERATORS
AND                         :   '&&' | 'and'                    ;
OR                          :   '||' | 'or'                     ;
NOT                         :   '!'  | 'not'                    ;

//  BITWISE LOGIC OPERATORS
BITWISE_AND                 :   '&'                             ;
BITWISE_OR                  :   '|'                             ;
BITWISE_XOR                 :   '^'                             ;
BITWISE_NOT                 :   '~'                             ;
BITWISE_SHIFT_RIGHT         :   '>>'                            ;
BITWISE_SHIFT_LEFT          :   '<<'                            ;

//  IDENTIFIER
IDENTIFIER                  :   [a-zA-Z_][a-zA-Z0-9_]*          ;

//  PUNCTUATION
SEMICOLON                   :   ';'                             ;
COMMA                       :   ','                             ;
QUOTE                       :   '"'                             ;
OPEN                        :   '('                             ;
CLOSE                       :   ')'                             ;
OPEN_BRACKET                :   '['                             ;
CLOSE_BRACKET               :   ']'                             ;
OPEN_CURLY                  :   '{'                             ;
CLOSE_CURLY                 :   '}'                             ;

//  INCREMENT OPERATORS
INCREMENT                   :   '++'                            ;
DECREMENT                   :   '--'                            ;

//  ARITHMETIC OPERATORS
MODULO                      :   '%'                             ;
EXPONENT                    :   '**'                            ;
MULTIPLY                    :   '*'                             ;
DIVIDE                      :   '/'                             ;
ADD                         :   '+'                             ;
SUBTRACT                    :   '-'                             ;
LENGTH                      :   '#'                             ;

//  COMPARATIVE OPERATORS
GREATER_THAN                :   '>'                             ;
LESSER_THAN                 :   '<'                             ;
EQUALS                      :   '='                             ;
EQUALS_TO                   :   '=='                            ;
GREATER_THAN_OR_EQUAL_TO    :   '>='                            ;
LESSER_THAN_OR_EQUAL_TO     :   '<='                            ;

//  NUMBERS
REAL
                            :   INTEGER
                            |   INTEGER NOTATION
                            |   INTEGER? '.' INTEGER NOTATION?
                            |   INTEGER '.' NOTATION?
                            ;
fragment INTEGER            :   [0-9]+                          ;
fragment NOTATION           :   [Ee] [+\-]? INTEGER             ;

//  SKIP
WHITE_SPACE                 :   [ \t\n\r]+ -> channel(1)        ;
COMMENT                     :   '//' .*? '\n' -> channel(2)     ;