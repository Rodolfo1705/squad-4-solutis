package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

import java.util.Random;

public class Exercicio34 {

	public static void run() {
        Divisor.printExercise(34);
        
        Random aleatorio = new Random();
        
        for(int i = 0; i < 50; i++) {
        	System.out.println(aleatorio.nextInt(101));
        }
	}
}
