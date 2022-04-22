package codigo;
import static codigo.Tokens.*;
%%class Lexer
%type Tokens

espacio=[\ ,\t,\r]+
saltoLinea=[\n]

letras=[a-zA-Z]+
cero=0
digitos=[0-9]
digLim=[1-9]

caracteres_string = [^\n\"]+
caracteres_Char = [a-zA-Z]
caracteres_comentario_linea=[^\n]+
caracteres_comentario_bloque= [^(\*/)]+
simboloString=[\"]
simboloChar=[\']
simb_negativo=[\-]

/*creacion de identificadores*/
identificadores=("_" | {letras})("_" | {letras} | {digitos})*

/*creacion de string*/
string={simboloString}{caracteres_string}{simboloString}

/*Creacion de char*/
character = {simboloChar} {caracteres_Char} {simboloChar}

/*comentarios*/
cometario_bloque = "/*"{caracteres_comentario_bloque}"*/"
comentario_lineal = "//"{caracteres_comentario_linea}{saltoLinea}

/*enteros*/
int= ({simb_negativo}? {digLim}{digitos}*) | {cero}

/*flotantes*/
float = {simb_negativo}? {int}"."{digitos}*

%{
    public String lexemas;
%}
%%


{saltoLinea} {/**/}
{espacio} {/*Ignore*/}
"#" {lexemas=yytext(); return DELIMITADOR;}
"=" {lexemas=yytext(); return ASIGNACION;}

/*OPERADORES TERMINALES*/
"{" {lexemas=yytext(); return TERMINAL;}
"}" {lexemas=yytext(); return TERMINAL;}
"[" {lexemas=yytext(); return TERMINAL;}
"]" {lexemas=yytext(); return TERMINAL;}
"(" {lexemas=yytext(); return TERMINAL;}
")" {lexemas=yytext(); return TERMINAL;}
"," {lexemas=yytext(); return TERMINAL;}
":" {lexemas=yytext(); return TERMINAL;}

/*operadores aritmetrico*/
"+" {lexemas=yytext(); return OPERADOR_ARITMETICO;}
"-" {lexemas=yytext(); return OPERADOR_ARITMETICO;}
"/" {lexemas=yytext(); return OPERADOR_ARITMETICO;}
"*" {lexemas=yytext(); return OPERADOR_ARITMETICO;}
"^" {lexemas=yytext(); return OPERADOR_ARITMETICO;}
"~" {lexemas=yytext(); return OPERADOR_ARITMETICO;}


/*operadores unarios*/
"++" {lexemas=yytext(); return OPERADOR_UNARIO;}
"--" {lexemas=yytext(); return OPERADOR_UNARIO;}

/* Operadores relacionales*/
"<" {lexemas=yytext(); return OPERADOR_RELACIONAL;}
">" {lexemas=yytext(); return OPERADOR_RELACIONAL;}
"==" {lexemas=yytext(); return OPERADOR_RELACIONAL;}
"!=" {lexemas=yytext(); return OPERADOR_RELACIONAL;}
"<=" {lexemas=yytext(); return OPERADOR_RELACIONAL;}
">=" {lexemas=yytext(); return OPERADOR_RELACIONAL;}
"&" {lexemas=yytext(); return OPERADOR_RELACIONAL;}
"|" {lexemas=yytext(); return OPERADOR_RELACIONAL;}
"!" {lexemas=yytext(); return OPERADOR_RELACIONAL;}


/*Palabras reservadas*/
"main" {lexemas=yytext(); return RESERVADA;}
"return" {lexemas=yytext(); return RESERVADA;}
"read" {lexemas=yytext(); return RESERVADA;}
"true" {lexemas=yytext(); return RESERVADA;}
"false" {lexemas=yytext(); return RESERVADA;}
"if" {lexemas=yytext(); return RESERVADA;}
"else" {lexemas=yytext(); return RESERVADA;}
"while" {lexemas=yytext(); return RESERVADA;}
"switch" {lexemas=yytext(); return RESERVADA;}
"case" {lexemas=yytext(); return RESERVADA;}
"break" {lexemas=yytext(); return RESERVADA;}
"default" {lexemas=yytext(); return RESERVADA;}
"int" {lexemas=yytext(); return RESERVADA;}
"float" {lexemas=yytext(); return RESERVADA;}
"bool" {lexemas=yytext(); return RESERVADA;}
"char" {lexemas=yytext(); return RESERVADA;}
"string" {lexemas=yytext(); return RESERVADA;}
"array" {lexemas=yytext(); return RESERVADA;}
"null" {lexemas=yytext(); return RESERVADA;}

/*Literales*/
{int} {lexemas=yytext(); return LITERAL;}
{float} {lexemas=yytext(); return LITERAL;}
{string} {lexemas=yytext(); return LITERAL;}
{character} {lexemas=yytext(); return LITERAL;}

/*identificador*/
{identificadores} {lexemas=yytext(); return IDENTIFICADOR;}

/*COMENTARIOS*/
{cometario_bloque} {lexemas=yytext(); return COMENTARIO;}
{comentario_lineal} {lexemas=yytext(); return COMENTARIO;}

/*Error al analizar*/
. {return ERROR;} 