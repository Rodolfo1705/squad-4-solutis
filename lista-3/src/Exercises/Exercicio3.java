/*Solicite a quantidade de homens e de mulheres de uma turma da faculdade. Em seguida calcule e exiba o percentual
(separadamente) de homens e mulheres desta turma.*/

package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio3 {
    public static void run(){
        Divisor.printExercise(3);

        int women = InputHandler.getIntInput("Qual o número de mulheres da turma? ");
        int men = InputHandler.getIntInput("Qual o número de homens da turma? ");

        double percentMen = percent(women + men, men);
        double percentWomen = percent(women + men, women);
        System.out.printf("Essa turma é composta por %.2f%% de mulheres e %.2f%% de homens.\n", percentWomen, percentMen);
    }

    private static double percent(int total, int num){
        return (num / (double) total) * 100;
    }
}

