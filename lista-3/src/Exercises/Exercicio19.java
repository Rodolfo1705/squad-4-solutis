/*Exiba dois números fornecidos pelo usuário em ordem crescente.*/

package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

import java.sql.Array;
import java.util.Arrays;

public class Exercicio19 {
    public static void run(){
        Divisor.printExercise(19);

        int[] numeros = new int[2];
        numeros[0] = InputHandler.getIntInput("Digite o 1º número: ");
        numeros[1] = InputHandler.getIntInput("Digite o 2º número: ");

        ascendingOrder(numeros);

        System.out.println("Números ordenados em ordem crescente:" + Arrays.toString(numeros));
    }

    private static void ascendingOrder(int[] numeros){
        Arrays.sort(numeros);
    }
}
