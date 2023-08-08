/*Calcule a média aritmética de 500 valores fornecidos pelo usuário.*/

package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio43 {
    public static void run(){
        Divisor.printExercise(43);

        int num, soma = 0;

        for(int i = 1; i <= 500; i++){
            num = InputHandler.getIntInput("Digite o " + i + "º valor: ");
            soma += num;
        }

        System.out.printf("A média dos 500 valores fornecidos é %.2f", soma/500.0);
    }
}
