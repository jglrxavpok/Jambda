grammar Jambda;

file:
    packageDeclaration?
    importDeclaration*
    declarations*;

declarations:
    functionDeclaration | constantDeclaration;

constantDeclaration:
    IDENTIFIER EQUAL_SIGN expression;

function:
    lambda variables PERIOD expression | functionApplication;

functionDeclaration:
    IDENTIFIER (DOUBLE_COLON type SMALL_ARROW type)? COLON function;

tuple:
    LEFT_PAREN expression (',' expression)* RIGHT_PAREN;

variableTuple:
    LEFT_PAREN type (',' type)* RIGHT_PAREN;

type:
    IDENTIFIER | variableTuple;

packageDeclaration:
    'package ' IDENTIFIER (PERIOD IDENTIFIER)*;

importDeclaration:
    'import ' IDENTIFIER (PERIOD IDENTIFIER)*;

lambda:
    '\u03BB' | 'lambda '; // λ

variables:
    IDENTIFIER | variableTuple;

value:
    IDENTIFIER | integer | floatingPointNumber;

floatingPointNumber:
    integer (PERIOD integer)? FLOAT_TERMINATOR;

functionApplication:
    | IDENTIFIER/*function*/ expression/*arg*/
    | IDENTIFIER/*function*/ LEFT_PAREN expression (',' expression)* RIGHT_PAREN;

expression:
    value | expression operator expression | function | LEFT_PAREN expression RIGHT_PAREN | functionApplication | tuple;

integer:
    DIGIT+;

operator:
    PLUS | MINUS | MULTIPLY | DIVISION;

FLOAT_TERMINATOR:
    'f';

DOUBLE_COLON:
    '::';

DIGIT:
    ('0'..'9');

PERIOD:
    '.';

PLUS:
    '+';

MINUS:
    '-';

MULTIPLY:
    '*';

DIVISION:
    '/';

COLON:
    ':';

LEFT_PAREN:
    '(';

RIGHT_PAREN:
    ')';

SMALL_ARROW:
    '->';

EQUAL_SIGN:
    '=';

IDENTIFIER:
    [a-zA-Z_]+;

letter:
    (LOWERCASE_LETTER | UPPERCASE_LETTER);

LOWERCASE_LETTER:
    ('a'..'z');

UPPERCASE_LETTER:
    ('A'..'Z');

WHITESPACE:
    [ \t\n\r]+ -> skip;