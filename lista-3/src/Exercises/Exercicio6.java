package Exercises;

import Utils.Divisor;

public class Exercicio6 {
	public static void run() {
        Divisor.printExercise(6);
        
		int raio = 5;
		double area = Math.PI * raio * raio;
		
		System.out.printf("Area de um círculo de raio 5 é: %.2f", area);
	}
}
