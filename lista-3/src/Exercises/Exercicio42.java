package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

import java.util.Arrays;
import java.util.Random;

public class Exercicio42 {

	public static void run() {
        Divisor.printExercise(42);
        
        Random aleatorio = new Random();
        
		for(int i = 0; i < 40; i++) {
			for(int j = 0; j < 3; j++) {
				int[] numeros = new int[3];
				numeros[0] = aleatorio.nextInt(60);
				numeros[1] = aleatorio.nextInt(60);
				numeros[2] = aleatorio.nextInt(60);
				Arrays.sort(numeros);
				System.out.println(Arrays.toString(numeros));
			}
		}
	}
}
