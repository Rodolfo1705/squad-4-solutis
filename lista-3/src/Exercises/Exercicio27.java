/*Descubra e apresente o maior entre três números fornecidos pelo usuário. Caso eles sejam iguais, avise ao usuário.*/

package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio27 {
    public static void run(){
        Divisor.printExercise(27);

        int num1 = InputHandler.getIntInput("Digite o 1º número: ");
        int num2 = InputHandler.getIntInput("Digite o 2º número: ");
        int num3 = InputHandler.getIntInput("Digite o 3º número: ");

        if(num1 == num2 && num2 == num3){
            System.out.println("Os três números são iguais.");
        } else {
            int maior = findBiggerNumber(num1, num2, num3);
            System.out.println("O maior número é: " + maior);
        }
    }

    private static int findBiggerNumber(int num1, int num2, int num3){
        return Math.max(Math.max(num1, num2), num3);
    }
}
