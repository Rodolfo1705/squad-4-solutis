

package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio64 {
    public static void run(){
        Divisor.printExercise(64);

        int lines = InputHandler.getIntInput("Quantas linhas terá a pirâmide? ");

        trianglePrint(lines);
    }

    public static void trianglePrint(int lines){
        for(int i = 1; i <= lines; i++){
            for(int j = 1; j <= i; j++) {
                for(int k = 1; k <= j; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
