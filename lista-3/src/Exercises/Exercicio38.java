package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

import java.util.Random;

public class Exercicio38 {

	public static void run() {
        Divisor.printExercise(38);

        int number = InputHandler.getIntInput("Digite um numero: ");
        
        if(number % 2 == 0)
        	System.out.print("O numero " + number + " é um par");
        else
        	System.out.print("O numero " + number + " é um impar");
	}
}
