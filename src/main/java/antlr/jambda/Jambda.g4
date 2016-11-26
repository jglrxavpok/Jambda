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

IDENTIFIER:
    [a-zA-Z_]+;

value:
    IDENTIFIER| integer;

expression:
    value | operation;

operation:
    value operator value;

integer:
    DIGIT+;

operator:
    PLUS | MINUS | MULTIPLY | DIVISION;

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

SMALL_ARROW:
    '->';

letter:
    (LOWERCASE_LETTER | UPPERCASE_LETTER);

LOWERCASE_LETTER:
    ('a'..'z');

UPPERCASE_LETTER:
    ('A'..'Z');

WHITESPACE:
    [ \t\n\r]+ -> skip;