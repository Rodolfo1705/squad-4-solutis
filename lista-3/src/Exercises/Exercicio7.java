/*Calcule e exiba a comissão de 10% de um garçom num restaurante a partir do valor da despesa de um cliente.*/

package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio7 {
    public static void run(){
        Divisor.printExercise(7);

        double expense = InputHandler.getIntInput("Digite o valor da despesa do cliente: ");

        System.out.printf("A comissão ganha pelo garçom é de R$%.2f.\n", expense * 0.10);
    }
}
