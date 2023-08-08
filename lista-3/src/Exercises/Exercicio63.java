/*Desenhe a seguinte pirâmide de números. O usuário determina a quantidade de linhas.
    01
    01 02
    01 02 03
    01 02 03 04
    01 02 03 04 05
    01 02 03 04 05 06
    01 02 03 04 05 06 07
    01 02 03 04 05 06 07 08
    01 02 03 04 05 06 07 08 09
    01 02 03 04 05 06 07 08 09 10
    01 02 03 04 05 06 07 08 09 10 11
*/

package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio63 {
    public static void run(){
        Divisor.printExercise(63);

        int lines = InputHandler.getIntInput("Quantas linhas terá a pirâmide? ");

        trianglePrint(lines);
    }

    public static void trianglePrint(int lines){
        for(int i = 1; i <= lines; i++){
            for(int j = 1; j <= lines; j++) {
                if (j <= i){
                    if (j < 10) {
                        System.out.printf("0%d ", j);
                    } else {
                        System.out.printf("%d ", j);
                    }
                }
            }
            System.out.println();
        }
    }
}
