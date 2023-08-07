package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio37 {
    public static void run(){
        Divisor.printExercise(37);

        int number = InputHandler.getIntInput("Digite um número: ");

        int factory = calculateFactory(number);

        System.out.println("O fatorial de " + number + " é equivalente a: " + factory);
    }

    private static int calculateFactory(int number){
        int factory = 1;

        for (int i = number; i > 0; i--){
           factory *= i;
        }

        return  factory;
    }
}
