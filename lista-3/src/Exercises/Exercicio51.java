/*Exiba os n primeiros termos da seqüência de Tribonacci (soma dos três anteriores). Inicia com 1,1 e 2.*/

package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio51 {
    public static void run(){
        Divisor.printExercise(51);

        int num = InputHandler.getIntInput("Digite o número de termos da sequência de Tribonacci que serão apresentados: ");

        int[] sequence = tribonacciSequence(num);
        System.out.println("Os primeiros " + num + " termos da sequência de Tribonacci:");
        for (int i = 0; i < num; i++) {
            System.out.print(sequence[i] + " ");
        }
    }

    private static int[] tribonacciSequence(int num){
        int[] sequence = new int[num];

        sequence[0] = 1;
        sequence[1] = 1;
        sequence[2] = 2;

        for (int i = 3; i < num; i++) {
            sequence[i] = sequence[i - 3] + sequence[i - 2] + sequence[i - 1];
        }

        return sequence;
    }
}
