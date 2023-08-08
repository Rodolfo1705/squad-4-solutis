package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio53 {
    public static void run(){
        Divisor.printExercise(53);

        int number = InputHandler.getIntInput("Digite um número: ");

        printNumberMultiplicationTable(number);
    }

    private static void printNumberMultiplicationTable(int number){
        for (int i = 1; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}
