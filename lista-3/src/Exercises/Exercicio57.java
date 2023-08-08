package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicio57 {
    public static void run(){
        Divisor.printExercise(57);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String initialDateString = InputHandler.getStringInput("Digite a data inicial (dd/mm/aaaa): ");
        LocalDate initalDate = LocalDate.parse(initialDateString, dateFormatter);

        String finalDateString = InputHandler.getStringInput("Digite a data final (dd/mm/aaaa): ");
        LocalDate finalDate = LocalDate.parse(finalDateString, dateFormatter);

        printDatesBeetween(initalDate, finalDate, dateFormatter);
    }

    private static void printDatesBeetween(LocalDate initalDate, LocalDate finalDate, DateTimeFormatter dateTimeFormatter){
        System.out.println("Datas entre " + initalDate.format(dateTimeFormatter) + " e " + finalDate.format(dateTimeFormatter) + ":");

        LocalDate currentDate = initalDate.plusDays(1);

        while (currentDate.isBefore(finalDate)) {
            System.out.println(currentDate.format(dateTimeFormatter));

            currentDate = currentDate.plusDays(1);
        }
    }
}
