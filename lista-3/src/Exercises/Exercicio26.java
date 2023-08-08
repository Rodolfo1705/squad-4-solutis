package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio26 {

	public static void run() {
        Divisor.printExercise(26);
        
        Horario horario1 = new Horario(InputHandler.getStringInput("Digite o primeiro horario(HH:MM): "));
        Horario horario2 = new Horario(InputHandler.getStringInput("Digite o primeiro horario(HH:MM): "));
        
        System.out.println("Diferença em segundos desses dois horarios é " + Math.abs(horario1.inSeconds() - horario2.inSeconds()));
	}
}

class Horario {
	int hora;
	int minutos;
	
	Horario(String horario) {
		this.hora = Integer.parseInt(horario.substring(0,2));
		this.minutos = Integer.parseInt(horario.substring(2,4));
	}
	
	public int inSeconds() {
		return this.hora*3600 + this.minutos*60;
	}
}
