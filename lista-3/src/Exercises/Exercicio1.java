package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio1 {
    public static void run(){
        Divisor.printExercise(1);

        int yearOfBirth = InputHandler.getIntInput("Digite seu ano de nascimento: ");
        int currentYear = InputHandler.getIntInput("Digite o ano atual: ");

        System.out.println("Você fará " + calculateAge(yearOfBirth, currentYear) + " anos este ano.");
    }

    private static int calculateAge(int yearOfBirth, int currentYear){
        return currentYear - yearOfBirth;
    }
}
