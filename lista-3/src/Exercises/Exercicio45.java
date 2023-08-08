package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

import java.util.ArrayList;
import java.util.List;

public class Exercicio45 {
    public static void run(){
        Divisor.printExercise(45);

        List<Integer> numbersList = requestNumbersToUser(100);

        System.out.println("O maior número da lista é: " + getGreaterNumberOfList(numbersList));
    }


    private static List<Integer> requestNumbersToUser(int numbersQuantity){
        List<Integer> numbersList = new ArrayList<>();
        int userNumber;

        for (int i = numbersQuantity; i > 0; i--){
            userNumber = InputHandler.getIntInput("Digite um número: ");
            numbersList.add(userNumber);
        }

        return numbersList;
    }

    private static int getGreaterNumberOfList(List<Integer> numberList){
        int greaterNumber = 0;

        for (int i = 0; i < numberList.size(); i++){
            if (numberList.get(i) > greaterNumber){
                greaterNumber = numberList.get(i);
            }
        }

        return greaterNumber;
    }
}
