package Exercises;

import java.util.Date;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio58 {

	public static void run() {
        Divisor.printExercise(58);
        
        String data = InputHandler.getStringInput("Digite uma data (dd/MM/yyyy)?");
        
        int dias = InputHandler.getIntInput("Digite a quantidade de dias que vai ser adicionado na data: ");

        Date formato = new Date(data);
        
        formato.setDate(formato.getDate() + 10);
        System.out.println(data + " + " + dias + " = " + formato.getDay());
	}
	
}
