package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

import java.util.Random;

public class Exercicio41 {
    public static void run(){
        Divisor.printExercise(41);

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(100) + 1;

        game(randomNumber);
    }

    private static void game(int randomNumber){
        int attemptNumber;

        do {
            attemptNumber = InputHandler.getIntInput("Digite um valor de 1 a 100: ");
        } while (attemptNumber < 1 || attemptNumber > 100);

        do {
            System.out.println("O número aleatório é " + (randomNumber > attemptNumber ? "maior" : "menor") + " que o número escolhido.");

            attemptNumber = InputHandler.getIntInput("Digite outro número: ");

            if (attemptNumber == randomNumber){
                System.out.println("Você acertou! Parabéns!!!");
            }
        } while (attemptNumber != randomNumber);
    }
}
