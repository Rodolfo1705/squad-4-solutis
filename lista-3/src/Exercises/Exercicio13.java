package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio13 {
    public static void run(){
        Divisor.printExercise(13);

        double finalTestGrade = InputHandler.getDoubleInput("Digite a nota do teste final: ");

        printFinalTestStatus(finalTestGrade);
    }

    public static void printFinalTestStatus(double finalTestGrade){
        System.out.print("Status - ");
        System.out.println(finalTestGrade >= 5 ? "Aprovado! :D" : "Reprovado ;(");
    }
}
