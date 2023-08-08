package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio65 {

    public static void run(){
        Divisor.printExercise(65);

        int lines = InputHandler.getIntInput("Quantas linhas terá a pirâmide? ");

        drawPyramid(lines);
    }
    public static void drawPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
