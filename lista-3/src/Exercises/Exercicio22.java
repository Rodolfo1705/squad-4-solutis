package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio22 {

	public static void run() {
        Divisor.printExercise(22);
        
        int pessoa1Dia = InputHandler.getIntInput("Dia do aniversario(pessoa 1): ");
        int pessoa1Mes = InputHandler.getIntInput("Mes do aniversario(pessoa 1): ");
        int pessoa2Dia = InputHandler.getIntInput("Dia do aniversario(pessoa 2): ");
        int pessoa2Mes = InputHandler.getIntInput("Mes do aniversario(pessoa 2): ");
        
        if(pessoa1Dia == pessoa2Dia && pessoa1Mes == pessoa2Mes)
        	System.out.println("Essas pessoas fazem aniversario na mesma data");
        else
        	System.out.println("Essas pessoas não fazem aniversario na mesma data");
	}
}
