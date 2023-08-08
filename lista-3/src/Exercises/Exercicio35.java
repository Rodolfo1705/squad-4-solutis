/*Exiba uma quantidade de números sorteados determinada pelo usuário. Peça também que o usuário determine a faixa do sorteio.*/

package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

import java.util.Random;

public class Exercicio35 {
    public static void run(){
        Divisor.printExercise(35);

        int numbers = InputHandler.getIntInput("Quantos números devem ser sorteados pelo sistema? ");
        int min = InputHandler.getIntInput("Digite o valor mínimo do sorteio: ");
        int max = InputHandler.getIntInput("Digite o valor máximo do sorteio: ");

        if (min < max){
            drawer(numbers, min, max);
        } else {
            System.out.println("Números incompatíveis! Valor mínimo deve ser menor que o valor máximo.");
        }

    }

    private static void drawer(int numbers, int min, int max){
        Random random = new Random();

        System.out.println("\nNúmeros sorteados:");

        for (int i = 0; i < numbers; i++) {
            int drawnNumber = random.nextInt(max - min + 1) + min;
            if (i == (numbers - 1)){
                System.out.print(drawnNumber + " ");
            } else {
                System.out.print(drawnNumber + ", ");
            }
        }
    }
}
