/*Verifique quem entre duas pessoas faz aniversário primeiro. Exiba o nome do primeiro aniversariante considerando
que estamos no dia 1 de janeiro. Use como entrada o nome, o dia e o mês de nascimento de cada pessoa.*/

package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio23 {
    public static void run(){
        Divisor.printExercise(23);

        String[] nomes = new String[2];
        int[] dias = new int[2];
        int[] meses = new int[2];

        for (int i = 0; i < 2; i++) {
            nomes[i] = InputHandler.getStringInput("Digite o nome da " + (i + 1) + "ª pessoa: ");
            dias[i] = InputHandler.getIntInput("Digite o dia que a " + (i + 1) + "ª pessoa nasceu: ");
            meses[i] = InputHandler.getIntInput("Digite o mês que a " + (i + 1) + "ª pessoa nasceu: ");
            System.out.println();
        }

        int firstBirthday = birthdayOrder(dias, meses);
        if (firstBirthday == -1) {
            System.out.println("Ambas as pessoas fazem aniversário no mesmo dia!");
        } else {
            System.out.println("O primeiro aniversariante é: " + nomes[firstBirthday]);
        }
    }

    private static int birthdayOrder(int[] dias, int[] meses){
        if (meses[0] < meses[1]){
            return 0;
        } else if (meses[0] > meses[1]){
            return 1;
        } else {
            if (dias[0] > dias[1]){
                return 1;
            } else if (dias[0] < dias[1]){
                return 0;
            } else {
                return -1;
            }
        }
    }
}
