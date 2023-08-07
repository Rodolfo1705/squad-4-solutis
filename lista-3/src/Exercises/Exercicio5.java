package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

import java.math.BigDecimal;

public class Exercicio5 {
    public static void run(){
        Divisor.printExercise(5);

        double initialDebt = InputHandler.getDoubleInput("Digite o valor inicial da dívida: ");
        int monthsInDebt = InputHandler.getIntInput("Digite a quantidade de meses endividado: ");
        double monthlyFees = InputHandler.getDoubleInput("Digite o valor dos juros mensais em porcentagem: ");

        BigDecimal totalToPay = calculateDebt(initialDebt, monthsInDebt, monthlyFees);

        System.out.println("O total à pagar é: R$" + totalToPay);
    }

    private static BigDecimal calculateDebt(double initialDebt, int monthsInDebt, double monthlyFees){
        double fees = initialDebt * monthsInDebt * (monthlyFees / 100);

        BigDecimal totalToPay = BigDecimal.valueOf(initialDebt + fees);

        return totalToPay;
    }
}
