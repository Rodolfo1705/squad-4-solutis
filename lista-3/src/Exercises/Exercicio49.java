package Exercises;

import Utils.Divisor;

public class Exercicio49 {
    public static void run() {
        Divisor.printExercise(49);

        printFibonacciSequence(50);
    }

    private static long calculateFibonacciAlgorithm(int n) {
        if (n < 2) {
            return n;
        }

        return calculateFibonacciAlgorithm(n - 1) + calculateFibonacciAlgorithm(n - 2);
    }

    private static void printFibonacciSequence(int times){
        int number = 1;

        for (int i = times; i > 0; i--){
            System.out.println(calculateFibonacciAlgorithm(number));
            number++;
        }
    }
}
