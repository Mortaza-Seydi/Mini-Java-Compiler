grammar MiniJava;

minijava : (classDeclaration)* EOF ;

classDeclaration : CLASS Id '{' (methodDeclaration | fieldDeclaration)* '}' ;

fieldDeclaration : declarators Id ('=' expression)?';' ;

methodDeclaration : declarators Id '(' parameterList? ')' '{' statement* (RETURN expression ';')? '}' ;

declarators : (PUBLIC | PRIVATE)? STATIC? type ;

type : primType | classType | arrType ;

primType : INT | BOOLEAN | VOID ;

classType : Id ;

arrType : ( INT | classType ) '['']' ;

parameterList : type Id (',' type Id)* ;

argumentList : expression (',' expression)* ;

reference : ( THIS | Id ) ( '.' Id )* ;

ifStatement : If '(' expression ')' ifBody ;

ifBody : statement elseStatement? ;

elseStatement : ELSE statement ;

whileStatement : While '(' expression ')' whileBody ;

whileBody : statement ;

varDeclaration : type Id ('=' expression)? ';' ;

goExp : reference '=' expression ';' ;

statement   : '{' statement* '}'

            | varDeclaration | ifStatement | whileStatement | goExp

            | reference '[' expression ']' '=' expression ';'

            | reference '(' argumentList? ')' ';' ;

expression  : reference

            | reference '[' expression ']'

            | reference '(' argumentList? ')'

            | urey expression

            | expression arthmetic expression

            | expression bool expression

            | '(' expression ')'

            | Number | TRUE | FALSE | String

            | NEW ( Id '(' ')' | INT '[' expression ']'| Id '[' expression ']' ) ;

arthmetic : Mul | Divide | Plus | Minus;

urey : Plus | Minus | Not ;

bool : AND | OR | Equal | Great | GAndE | Small | SAndE | NotEqual ;

//--------------------------------------------------------

If      : 'if'      ;

ELSE    : 'else'    ;

THIS    : 'this'    ;

CLASS   : 'class'   ;

RETURN  : 'return'  ;

While   : 'while'   ;

FOR     :  'for'    ;

DO      :  'do'     ;

PUBLIC  : 'public'  ;

PRIVATE : 'private' ;

STATIC  : 'static'  ;

INT     : 'int'     ;

VOID    : 'void'    ;

BOOLEAN : 'boolean' ;

FALSE   : 'false'   ;

TRUE    : 'true'    ;

NEW     : 'new'     ;

//--------------------------------------------------------

Semicolon :  ';'  ;

Point     :  '.'  ;

OpenACC   :  '{'  ;

CloseAcc  :  '}'  ;

OpenPar   :  '('  ;

ClosePar  :  ')'  ;

OpenBar   :  '['  ;

CloseBar  :  ']'  ;

Comma     :  ','  ;

Mul       :  '*'  ;

Divide    :  '/'  ;

Plus      :  '+'  ;

Minus     :  '-'  ;

Equal     :  '==' ;

Assign    :  '='  ;

Great     :  '>'  ;

GAndE     :  '>=' ;

Small     :  '<'  ;

SAndE     :  '<=' ;

NotEqual  :  '!=' ;

Not       :  '!'  ;

AND       :  '&&' ;

OR        :  '||' ;

//--------------------------------------------------------

ERROR : Digit+ (Letter)+ ;

//--------------------------------------------------------

Id          :  Letter ( Letter | Digit )*    ;

Number      :  Digit+                        ;

String      :  '"' .*? '"'                   ;

Ws          :  [ \t\r\n]+     -> skip        ;

Comment     :  '/*' .*? '*/'  -> skip        ;

LineComment :  '//' .*? '\n'  -> skip        ;

//--------------------------------------------------------

fragment Letter : [a-zA-Z]  ;

fragment Digit  : [0-9]     ;