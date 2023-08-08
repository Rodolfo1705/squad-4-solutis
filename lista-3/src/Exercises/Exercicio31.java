/*Exiba mil vezes o número 100.*/

package Exercises;

import Utils.Divisor;

public class Exercicio31 {
    public static void run(){
        Divisor.printExercise(31);

        for (int i = 0; i <= 1000; i++){
            if (i != 1000) {
                System.out.printf("100, ");
            } else {
                System.out.println("100");
            }
        }
    }
}
