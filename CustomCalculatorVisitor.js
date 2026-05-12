import { Parser } from "antlr4";
import CalculatorVisitor from "./generated/CalculatorVisitor.js";
import CalculatorParser from "./generated/CalculatorParser.js";


export class CustomCalculatorVisitor extends CalculatorVisitor {

    visitProg(ctx) {
        const instrucciones = ctx.instruc().map(i => this.visit(i));
        const codigoJS = instrucciones.join("\n");

        console.log("\nCódigo JavaScript traducido:");
        console.log(codigoJS);

        console.log("\nEjecución:");
        eval(codigoJS);

        return codigoJS;
    }

    visitInstrucBucle(ctx) {
        return this.visit(ctx.bucle());
    }

    visitInstrucSalida(ctx) {
        return this.visit(ctx.salida());
    }

    visitSentenciaBucle(ctx) {
        const condicion = this.visit(ctx.condicion());
        const instrucciones = ctx.instruc().map(i => this.visit(i)).join("\n");

        return `while (${condicion}) {\n${instrucciones}\n}`;
    }

    visitSentenciaSalida(ctx) {
        const cadena = ctx.CADENA().getText();
        return `console.log(${cadena});`;
    }

    visitCondicionVerdadero(ctx) {
        return "true";
    }

    visitCondicionFalso(ctx) {
        return "false";
    }
}


