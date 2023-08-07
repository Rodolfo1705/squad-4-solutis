package Exercises;

import Utils.Divisor;
import Utils.InputHandler;
import Utils.Validator;

public class Exercicio25 {
    public static void run(){
        Divisor.printExercise(25);

        int hour = InputHandler.getIntInput("Digite o valor das horas: ");
        int minutes = InputHandler.getIntInput("Digite o valor dos minutos ");
        int seconds = InputHandler.getIntInput("Digite o valor dos segundos: ");

        System.out.println(hour + ":" + minutes + ":" + seconds + " é um horário " + (Validator.isHourValid(hour, minutes, seconds) ? "válido! :D" : "inválido :/"));
    }
}
