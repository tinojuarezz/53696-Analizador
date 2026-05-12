// Generated from Calculator.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';
import CalculatorListener from './CalculatorListener.js';
import CalculatorVisitor from './CalculatorVisitor.js';

const serializedATN = [4,1,11,41,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,
1,0,4,0,12,8,0,11,0,12,0,13,1,1,1,1,3,1,18,8,1,1,2,1,2,1,2,1,2,5,2,24,8,
2,10,2,12,2,27,9,2,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,3,1,4,1,4,3,4,39,8,4,1,
4,0,0,5,0,2,4,6,8,0,0,39,0,11,1,0,0,0,2,17,1,0,0,0,4,19,1,0,0,0,6,30,1,0,
0,0,8,38,1,0,0,0,10,12,3,2,1,0,11,10,1,0,0,0,12,13,1,0,0,0,13,11,1,0,0,0,
13,14,1,0,0,0,14,1,1,0,0,0,15,18,3,4,2,0,16,18,3,6,3,0,17,15,1,0,0,0,17,
16,1,0,0,0,18,3,1,0,0,0,19,20,5,1,0,0,20,21,3,8,4,0,21,25,5,5,0,0,22,24,
3,2,1,0,23,22,1,0,0,0,24,27,1,0,0,0,25,23,1,0,0,0,25,26,1,0,0,0,26,28,1,
0,0,0,27,25,1,0,0,0,28,29,5,6,0,0,29,5,1,0,0,0,30,31,5,2,0,0,31,32,5,7,0,
0,32,33,5,10,0,0,33,34,5,8,0,0,34,35,5,9,0,0,35,7,1,0,0,0,36,39,5,3,0,0,
37,39,5,4,0,0,38,36,1,0,0,0,38,37,1,0,0,0,39,9,1,0,0,0,4,13,17,25,38];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class CalculatorParser extends antlr4.Parser {

    static grammarFileName = "Calculator.g4";
    static literalNames = [ null, "'mientras'", "'imprimir'", "'verdadero'", 
                            "'falso'", "'{'", "'}'", "'('", "')'", "';'" ];
    static symbolicNames = [ null, "MIENTRAS", "IMPRIMIR", "VERDADERO", 
                             "FALSO", "LLLAVE", "RLLAVE", "LPAREN", "RPAREN", 
                             "PUNTOYCOMA", "CADENA", "WS" ];
    static ruleNames = [ "prog", "instruc", "bucle", "salida", "condicion" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = CalculatorParser.ruleNames;
        this.literalNames = CalculatorParser.literalNames;
        this.symbolicNames = CalculatorParser.symbolicNames;
    }



	prog() {
	    let localctx = new ProgContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, CalculatorParser.RULE_prog);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 11; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 10;
	            this.instruc();
	            this.state = 13; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===1 || _la===2);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	instruc() {
	    let localctx = new InstrucContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, CalculatorParser.RULE_instruc);
	    try {
	        this.state = 17;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 1:
	            localctx = new InstrucBucleContext(this, localctx);
	            this.enterOuterAlt(localctx, 1);
	            this.state = 15;
	            this.bucle();
	            break;
	        case 2:
	            localctx = new InstrucSalidaContext(this, localctx);
	            this.enterOuterAlt(localctx, 2);
	            this.state = 16;
	            this.salida();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	bucle() {
	    let localctx = new BucleContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, CalculatorParser.RULE_bucle);
	    var _la = 0;
	    try {
	        localctx = new SentenciaBucleContext(this, localctx);
	        this.enterOuterAlt(localctx, 1);
	        this.state = 19;
	        this.match(CalculatorParser.MIENTRAS);
	        this.state = 20;
	        this.condicion();
	        this.state = 21;
	        this.match(CalculatorParser.LLLAVE);
	        this.state = 25;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        while(_la===1 || _la===2) {
	            this.state = 22;
	            this.instruc();
	            this.state = 27;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        }
	        this.state = 28;
	        this.match(CalculatorParser.RLLAVE);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	salida() {
	    let localctx = new SalidaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, CalculatorParser.RULE_salida);
	    try {
	        localctx = new SentenciaSalidaContext(this, localctx);
	        this.enterOuterAlt(localctx, 1);
	        this.state = 30;
	        this.match(CalculatorParser.IMPRIMIR);
	        this.state = 31;
	        this.match(CalculatorParser.LPAREN);
	        this.state = 32;
	        this.match(CalculatorParser.CADENA);
	        this.state = 33;
	        this.match(CalculatorParser.RPAREN);
	        this.state = 34;
	        this.match(CalculatorParser.PUNTOYCOMA);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	condicion() {
	    let localctx = new CondicionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, CalculatorParser.RULE_condicion);
	    try {
	        this.state = 38;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 3:
	            localctx = new CondicionVerdaderoContext(this, localctx);
	            this.enterOuterAlt(localctx, 1);
	            this.state = 36;
	            this.match(CalculatorParser.VERDADERO);
	            break;
	        case 4:
	            localctx = new CondicionFalsoContext(this, localctx);
	            this.enterOuterAlt(localctx, 2);
	            this.state = 37;
	            this.match(CalculatorParser.FALSO);
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

CalculatorParser.EOF = antlr4.Token.EOF;
CalculatorParser.MIENTRAS = 1;
CalculatorParser.IMPRIMIR = 2;
CalculatorParser.VERDADERO = 3;
CalculatorParser.FALSO = 4;
CalculatorParser.LLLAVE = 5;
CalculatorParser.RLLAVE = 6;
CalculatorParser.LPAREN = 7;
CalculatorParser.RPAREN = 8;
CalculatorParser.PUNTOYCOMA = 9;
CalculatorParser.CADENA = 10;
CalculatorParser.WS = 11;

CalculatorParser.RULE_prog = 0;
CalculatorParser.RULE_instruc = 1;
CalculatorParser.RULE_bucle = 2;
CalculatorParser.RULE_salida = 3;
CalculatorParser.RULE_condicion = 4;

class ProgContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CalculatorParser.RULE_prog;
    }

	instruc = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(InstrucContext);
	    } else {
	        return this.getTypedRuleContext(InstrucContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.enterProg(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.exitProg(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CalculatorVisitor ) {
	        return visitor.visitProg(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class InstrucContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CalculatorParser.RULE_instruc;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class InstrucBucleContext extends InstrucContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	bucle() {
	    return this.getTypedRuleContext(BucleContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.enterInstrucBucle(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.exitInstrucBucle(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CalculatorVisitor ) {
	        return visitor.visitInstrucBucle(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CalculatorParser.InstrucBucleContext = InstrucBucleContext;

class InstrucSalidaContext extends InstrucContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	salida() {
	    return this.getTypedRuleContext(SalidaContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.enterInstrucSalida(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.exitInstrucSalida(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CalculatorVisitor ) {
	        return visitor.visitInstrucSalida(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CalculatorParser.InstrucSalidaContext = InstrucSalidaContext;

class BucleContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CalculatorParser.RULE_bucle;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class SentenciaBucleContext extends BucleContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	MIENTRAS() {
	    return this.getToken(CalculatorParser.MIENTRAS, 0);
	};

	condicion() {
	    return this.getTypedRuleContext(CondicionContext,0);
	};

	LLLAVE() {
	    return this.getToken(CalculatorParser.LLLAVE, 0);
	};

	RLLAVE() {
	    return this.getToken(CalculatorParser.RLLAVE, 0);
	};

	instruc = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(InstrucContext);
	    } else {
	        return this.getTypedRuleContext(InstrucContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.enterSentenciaBucle(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.exitSentenciaBucle(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CalculatorVisitor ) {
	        return visitor.visitSentenciaBucle(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CalculatorParser.SentenciaBucleContext = SentenciaBucleContext;

class SalidaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CalculatorParser.RULE_salida;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class SentenciaSalidaContext extends SalidaContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	IMPRIMIR() {
	    return this.getToken(CalculatorParser.IMPRIMIR, 0);
	};

	LPAREN() {
	    return this.getToken(CalculatorParser.LPAREN, 0);
	};

	CADENA() {
	    return this.getToken(CalculatorParser.CADENA, 0);
	};

	RPAREN() {
	    return this.getToken(CalculatorParser.RPAREN, 0);
	};

	PUNTOYCOMA() {
	    return this.getToken(CalculatorParser.PUNTOYCOMA, 0);
	};

	enterRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.enterSentenciaSalida(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.exitSentenciaSalida(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CalculatorVisitor ) {
	        return visitor.visitSentenciaSalida(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CalculatorParser.SentenciaSalidaContext = SentenciaSalidaContext;

class CondicionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = CalculatorParser.RULE_condicion;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class CondicionVerdaderoContext extends CondicionContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	VERDADERO() {
	    return this.getToken(CalculatorParser.VERDADERO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.enterCondicionVerdadero(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.exitCondicionVerdadero(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CalculatorVisitor ) {
	        return visitor.visitCondicionVerdadero(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CalculatorParser.CondicionVerdaderoContext = CondicionVerdaderoContext;

class CondicionFalsoContext extends CondicionContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	FALSO() {
	    return this.getToken(CalculatorParser.FALSO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.enterCondicionFalso(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof CalculatorListener ) {
	        listener.exitCondicionFalso(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof CalculatorVisitor ) {
	        return visitor.visitCondicionFalso(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

CalculatorParser.CondicionFalsoContext = CondicionFalsoContext;


CalculatorParser.ProgContext = ProgContext; 
CalculatorParser.InstrucContext = InstrucContext; 
CalculatorParser.BucleContext = BucleContext; 
CalculatorParser.SalidaContext = SalidaContext; 
CalculatorParser.CondicionContext = CondicionContext; 
