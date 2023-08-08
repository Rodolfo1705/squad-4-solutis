package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio30 {
	public static void run() {
        Divisor.printExercise(30);
        
        
	}
	
}

class Pontos {
	int x;
	int y;
	
	Pontos(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Retangulo {
	Pontos v1;
	Pontos v2;
	Pontos v3;
	Pontos v4;
	
	Retangulo(Pontos c1, Pontos c2, Pontos c3, Pontos c4) {
		
	}
	
	public boolean isRetangulo() {
		return false;
	}
}