grammar Jambda;

file:
    package_declaration?
    import_declaration*
    function_declaration*;

function:
    lambda identifiers PERIOD expression;

function_declaration:
    IDENTIFIER (DOUBLE_COLON IDENTIFIER SMALL_ARROW IDENTIFIER)? COLON function;

package_declaration:
    'package ' IDENTIFIER ('.' IDENTIFIER)*;

import_declaration:
    'import ' IDENTIFIER ('.' IDENTIFIER)*;

lambda:
    '\u03BB' | 'lambda '; // λ

identifiers:
    IDENTIFIER (',' IDENTIFIER)*;

value:
    IDENTIFIER | integer | float;

float:
    integer PERIOD integer FLOAT_TERMINATOR;

expression:
    value | expression operator expression | function | LEFT_PAREN expression RIGHT_PAREN;

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