/*Verifique se um número é perfeito, ou seja, se a soma dos seus divisores (exceto o próprio número) é igual a ele mesmo.*/

package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio39 {
    public static void run(){
        Divisor.printExercise(39);

        int num = InputHandler.getIntInput("Digite um número inteiro: ");

        if (num == dividers(num)){
            System.out.printf("%d é um número perfeito.", num);
        } else {
            System.out.printf("%d não é um número perfeito.", num);
        }
    }

    private static int dividers(int num){
        int soma = 0;

        for (int i = num; i >= 1; i--){
            if (num % i == 0){
                soma += i;
            }
        }

        return soma - num;
    }
}
