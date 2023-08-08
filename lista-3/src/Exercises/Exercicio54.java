package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio54 {

	public static void run() {
        Divisor.printExercise(42);
	
        double valorInicial, valorFinal, valorIncremento, valorDolar;
        
        valorInicial = InputHandler.getDoubleInput("Digite o valor inicial da tabela: ");
        valorFinal = InputHandler.getDoubleInput("Digite o ultimo valor da tabela: ");
        valorIncremento = InputHandler.getDoubleInput("Digite o valor do incremento: ");
        valorDolar = InputHandler.getDoubleInput("Digite o valor de 1 dolar: ");
        
        for(double i = valorInicial; i <= valorFinal; i += valorIncremento){
        	System.out.printf("BRL %.2f = USS %.2f", i * valorDolar);
        }
        
	}
	
}
