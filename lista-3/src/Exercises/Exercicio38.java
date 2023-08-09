package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

import java.util.Random;

public class Exercicio38 {

	public static void run() {
        Divisor.printExercise(38);

        int number = InputHandler.getIntInput("Digite um numero: ");
        
        System.out.println("O número " + number + (numberIsPrime(number) ? "" : " não") + " é primo!");
	}

    private static boolean numberIsPrime(int number){
        if (number < 2)
            return false;

        if (number < 4)
            return true;

        if (number % 2 == 0)
            return false;

        for (int i = 3; i * i <= number ; i+= 2){
            if(number % i == 0)
                return false;
        }

        return true;
    }
}
