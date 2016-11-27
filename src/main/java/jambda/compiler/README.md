Inner workings of the Jambda Compiler
=====================================

Once given an InputStream, the Jambda Compiler initializes an ANTLR Lexer and an ANTLR Parser to read through the source.
After the compilation is requested by a call to compile(), the compiler returns a representation of the Jambda code 
that is in an intermediate language, ready to be translated to a target language.