grammar Calculator;

//Gramatica

prog: instruc+ ;

instruc: bucle            #InstrucBucle
    | salida              #InstrucSalida
    ;

bucle
    : MIENTRAS condicion LLLAVE instruc* RLLAVE    #sentenciaBucle
    ;

salida
    : IMPRIMIR LPAREN CADENA RPAREN PUNTOYCOMA      #sentenciaSalida
    ;

condicion
    : VERDADERO                #CondicionVerdadero
    | FALSO                    #CondicionFalso
    ;


//Lexemas 

MIENTRAS    : 'mientras';
IMPRIMIR    : 'imprimir';
VERDADERO   : 'verdadero';
FALSO       : 'falso';

LLLAVE  : '{';
RLLAVE : '}';
LPAREN : '(';
RPAREN : ')';
PUNTOYCOMA  : ';';

CADENA
    : '"' CARACTER* '"'
    ;

fragment CARACTER
    : [a-zA-Z]
    | [0-9]
    | [.,!?:;]
    | ' '
    ;

WS
    : [ \t\r\n]+ -> skip
    ;































