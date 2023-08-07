package Exercises;

import Utils.Divisor;
import Utils.InputHandler;
import Utils.Validator;

import java.util.HashMap;
import java.util.Map;

public class Exercicio17 {
    public static void run(){
        Divisor.printExercise(17);

        int monthOfBirth;
        int dayOfBirth;

        do {
             monthOfBirth = InputHandler.getIntInput("Digite o número do mês de seu aniversário: ");
        } while (Validator.monthOfBirthIsValid(monthOfBirth));

        do {
            dayOfBirth = InputHandler.getIntInput("Digite o número do dia de seu aniversário: ");
        } while (Validator.dayOfBirthIsValid(dayOfBirth, monthOfBirth));


        printSign(monthOfBirth, dayOfBirth);
    }

    public static void printSign(int month, int day ){
        System.out.print("Signo - ");
        if((day >= 20 && month == 1) || (day <= 18 && month == 2)){
            System.out.println("Áquario");
        }
        if((day >= 19 && month == 2) || (day <= 20 && month == 3)){
            System.out.println("Peixes");
        }
        if ((day >= 21 && month == 3) || (day <= 19 && month == 4)){
            System.out.println("Áries");
        }
        if((day >= 20 && month == 4) || (day <= 20 && month == 5)){
            System.out.println("Touro");
        }
        if ((day >= 21 && month == 5) || (day <= 20 && month == 6)){
            System.out.println("Gêmeos");
        }
        if ((day >= 21 && month == 6) || (day <= 22 && month == 7)){
            System.out.println("Câncer");
        }
        if((day >= 23 && month ==7) || (day <= 23 && month == 8)){
            System.out.println("Leão");
        }
        if((day >= 24 && month == 8) || (day <= 22 && month == 9)){
            System.out.println("Virgem");
        }
        if((day >= 23 && month == 9) || (day <= 22 && month == 10)){
            System.out.println("Libra");
        }
        if((day >= 23 && month == 10) || (day <= 21 && month == 11)){
            System.out.println("Escorpião");
        }
        if((day >= 22 && month == 11) || (day <= 21 && month == 12)) {
            System.out.println("Sagitário");
        }
        if((day >= 22 && month == 12) || (day < 19 && month == 1)){
            System.out.println("Capricórnio");
        }
    }
}
