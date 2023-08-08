/*A partir da idade informada de um cidadão diga se ele não pode votar (idade inferior a 16), ou se o voto é
facultativo (idade menor ou igual a 16, ou maior ou igual a 65), ou ainda se o voto é obrigatório.*/

package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio11 {
    public static void run(){
        Divisor.printExercise(11);

        int idade = InputHandler.getIntInput("Digite a idade desejada: ");

        if (idade < 16) {
            System.out.println("Por ter "+ idade +" anos, este cidadão não pode votar.");
        } else if (idade <= 16 || idade >= 65) {
            System.out.println("Por ter "+ idade +" anos, este cidadão pode escolher se irá votar ou não.");
        } else {
            System.out.println("Por ter "+ idade +" anos, este cidadão é obrigado a votar.");
        }

    }

}
