package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio61 {
    public static void run(){
        Divisor.printExercise(61);

        int linesQuantity = InputHandler.getIntInput("Digite uma quantidade de linhas: ");

        printAsteriskPyramid(linesQuantity);
    }

    private static void printAsteriskPyramid(int linesQuantity){
        for (int i = 1; i <= linesQuantity; i++){
            System.out.println("*".repeat(i));
        }
    }
}
