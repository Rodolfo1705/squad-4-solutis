package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

import java.util.Random;

public class Exercicio50 {

	public static void run() {
        Divisor.printExercise(50);
        
        int n = InputHandler.getIntInput("Qual termo da sequencia voce quer?");

        int atual = 1, ultimo = 1, penultimo = 1;
        for(int i = 0; i < n-2; ++i){
            atual = ultimo + penultimo;
            penultimo = ultimo;
            ultimo = atual;    
        }
        
        System.out.println(atual);
	}
}
