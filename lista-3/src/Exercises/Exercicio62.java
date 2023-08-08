package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

import java.util.Random;

public class Exercicio62 {

	public static void run() {
        Divisor.printExercise(42);
        
        int numLinhas = InputHandler.getIntInput("Qual o numero de linhas que a piramede vai ter? ");
        
        for(int i = 1; i <= numLinhas; i++) {
        	for(int j = 0; j < i; j++) {
        		System.out.print(zeroEsquerda(i) + " ");
        	}
        	System.out.println();
        }
	}
	
	public static String zeroEsquerda(int i) {
		if(i >= 0 && i < 10)
			return "0" + i;
		else
			return "" + i;
	}
}
