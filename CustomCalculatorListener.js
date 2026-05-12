import CalculatorListener from "./generated/CalculatorListener.js";

export class CustomCalculatorListener extends CalculatorListener {

 enterInstruc(ctx) {
        console.log(`Se detectó una instrucción: ${ctx.constructor.name}`);
    }

    enterBucle(ctx) {
        console.log("Se detectó un bucle mientras");
    }

    enterSalida(ctx) {
        console.log("Se detectó una instrucción imprimir");
    }

    enterCondicion(ctx) {
        console.log("Se detectó una condición");
    }
}