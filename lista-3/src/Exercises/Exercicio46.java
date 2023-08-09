package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio46 {
	public static void run() {
        Divisor.printExercise(46);
        
        int homens = 0, mulheres = 0;
        for(int i = 0; i < 200; i++) {
        	int idade;
        	String sexo;
        	
        	idade = InputHandler.getIntInput("Digite a idade: ");
        	sexo = InputHandler.getStringInput("Digite o sexo da pessoa[m/f]: ");
        	
        	if(idade >= 18) {
        		if(sexo.equalsIgnoreCase("m")) {
        			homens += 1;
        		} else if(sexo.equalsIgnoreCase("m")) {
        			mulheres += 1;
        		}
        	}
        	
        	System.out.print("Quantidade de homens maiores de idade: " + homens);
        	System.out.print("Quantidade de mulheres maiores de idade: " + mulheres	);
        }
	}
}
