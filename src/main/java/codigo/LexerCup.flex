package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char


espacio=[ \t\r\n]*
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

identificadores= ("_" | {letras})("_"| {letras} | {digitos})*
string= {simboloString}{caracteres_string}{simboloString}
character = {simboloChar} {caracteres_Char} {simboloChar}

cometario_bloque = "@*"{caracteres_comentario_bloque}"*@"
comentario_lineal = "@"{caracteres_comentario_linea}{saltoLinea}
int= ({simb_negativo}? {digLim}{digitos}*) | {cero}
float = {simb_negativo}? {int}"."{digitos}*

%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type,yyline,yycolumn,value);
    }

    private Symbol symbol(int type){
        return new Symbol(type,yyline,yycolumn);
    }
%}
%%

{saltoLinea} {/**/}
{espacio} {/*Ignore*/}

"#" {return new Symbol(sym.delimitador, yychar, yyline, yytext());}

"{" {return new Symbol(sym.ini_bloque, yychar, yyline, yytext());}

"}" {return new Symbol(sym.fin_bloque, yychar, yyline, yytext());}

"=" {return new Symbol(sym.simb_igual, yychar, yyline, yytext());}

"main" {return new Symbol(sym.simb_inicial, yychar, yyline, yytext());}

"return" {return new Symbol(sym.retorno, yychar, yyline, yytext());}

"read" {return new Symbol(sym.simb_input, yychar, yyline, yytext());}

"print" {return new Symbol(sym.simb_output, yychar, yyline, yytext());}

"null" {return new Symbol(sym.valor_nulo, yychar, yyline, yytext());}

/*"'" {return new Symbol(sym.simb_char, yychar, yyline, yytext());}*/                

/*"\"" {return new Symbol(sym.simb_string, yychar, yyline, yytext());}*/               

"[" {return new Symbol(sym.ini_arreglo, yychar, yyline, yytext());}

"]" {return new Symbol(sym.fin_arreglo, yychar, yyline, yytext());}

"(" {return new Symbol(sym.ini_parentesis, yychar, yyline, yytext());}

")" {return new Symbol(sym.fin_parentesis, yychar, yyline, yytext());}

"," {return new Symbol(sym.simb_coma, yychar, yyline, yytext());}

"true" {return new Symbol(sym.verdadero, yychar, yyline, yytext());}

"false" {return new Symbol(sym.falso, yychar, yyline, yytext());}

"if" {return new Symbol(sym.simb_if, yychar, yyline, yytext());}

"else" {return new Symbol(sym.simb_else, yychar, yyline, yytext());}

"while" {return new Symbol(sym.simb_while, yychar, yyline, yytext());}

"switch" {return new Symbol(sym.simb_switch, yychar, yyline, yytext());}

"case" {return new Symbol(sym.simb_case, yychar, yyline, yytext());}

"break" {return new Symbol(sym.simb_break, yychar, yyline, yytext());}

"default" {return new Symbol(sym.simb_default, yychar, yyline, yytext());}

":" {return new Symbol(sym.simb_dos_puntos, yychar, yyline, yytext());}

"+" {return new Symbol(sym.simb_positivo, yychar, yyline, yytext());}

"-" {return new Symbol(sym.simb_negativo, yychar, yyline, yytext());}

"/" {return new Symbol(sym.simb_division, yychar, yyline, yytext());}

"*" {return new Symbol(sym.simb_multiplicacion, yychar, yyline, yytext());}

"^" {return new Symbol(sym.simb_potencia, yychar, yyline, yytext());}

"~" {return new Symbol(sym.simb_modulo, yychar, yyline, yytext());}

"++" {return new Symbol(sym.simb_aumento, yychar, yyline, yytext());}

"--" {return new Symbol(sym.simb_decremento, yychar, yyline, yytext());}

"<" {return new Symbol(sym.simb_menor_que, yychar, yyline, yytext());}
">" {return new Symbol(sym.simb_mayor_que, yychar, yyline, yytext());}
"==" {return new Symbol(sym.simb_igual_que, yychar, yyline, yytext());}
"!=" {return new Symbol(sym.simb_diferente, yychar, yyline, yytext());}
"<=" {return new Symbol(sym.simb_menor_igual, yychar, yyline, yytext());}
">=" {return new Symbol(sym.simb_mayor_igual, yychar, yyline, yytext());}

"&" {return new Symbol(sym.simb_conjuncion, yychar, yyline, yytext());}
"|" {return new Symbol(sym.simb_disyuncion, yychar, yyline, yytext());}
"!" {return new Symbol(sym.simb_negacion, yychar, yyline, yytext());}


"int" {return new Symbol(sym.tipo_int, yychar, yyline, yytext());}
"float" {return new Symbol(sym.tipo_float, yychar, yyline, yytext());}
"bool" {return new Symbol(sym.tipo_bool, yychar, yyline, yytext());}
"char" {return new Symbol(sym.tipo_char, yychar, yyline, yytext());}
"string" {return new Symbol(sym.tipo_string, yychar, yyline, yytext());}
"array" {return new Symbol(sym.tipo_array, yychar, yyline, yytext());}

{identificadores} {return new Symbol(sym.Identificador, yychar, yyline, yytext());}
{string} {return new Symbol(sym.String, yychar, yyline, yytext());}
{character} {return new Symbol(sym.Caracter, yychar, yyline, yytext());}
{cometario_bloque} {/*ignore*/}
{comentario_lineal} {/*ignore*/}


{int} {return new Symbol(sym.Int, yychar, yyline, yytext());}
{float} {return new Symbol(sym.Float, yychar, yyline, yytext());}

/*error*/
 . {return new Symbol(sym.Error, yychar, yyline, yytext());} 