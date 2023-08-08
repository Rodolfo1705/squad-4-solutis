package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio9 {
    public static void run(){
        Divisor.printExercise(9);

        int age = InputHandler.getIntInput("Digite sua idade: ");

        System.out.println(isAdult(age) ? "Você é adulto e já pode ser preso! :)" : "Ainda não é adulto.");
    }

    private static boolean isAdult(int age){
        return age >= 18;
    }
}
