/*Exiba as 10 tabuadas (de 1 a 10).*/

package Exercises;

import Utils.Divisor;

public class Exercicio59 {
    public static void run(){
        Divisor.printExercise(59);

        for (int i = 1; i <= 10; i++){
            System.out.println("Tabuada do " + i + "\n");

            for (int j = 1; j <= 10; j++){
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }

            System.out.println();
        }
    }
}
