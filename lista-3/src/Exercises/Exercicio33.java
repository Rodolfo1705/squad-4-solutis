package Exercises;

import Utils.Divisor;

public class Exercicio33 {
    public static void run(){
        Divisor.printExercise(33);

        printEvenNumbers(1, 200);
    }

    private static void printEvenNumbers(int start, int end){
        for (int currentNumber = start; currentNumber <= end; currentNumber++){
            if (currentNumber % 2 == 0) System.out.println(currentNumber + " é par!");
        }
    }
}
