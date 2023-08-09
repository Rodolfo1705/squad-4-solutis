package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio30 {
	public static void run() {
        Divisor.printExercise(30);

		int firstRectangleX1 = InputHandler.getIntInput("Digite o valor X de um vértice: ");
		int firstRectangleY1 = InputHandler.getIntInput("Digite o valor Y de um vértice: ");
		int firstRectangleX2 = InputHandler.getIntInput("Digite o valor X do outro vértice: ");
		int firstRectangleY2 = InputHandler.getIntInput("Digite o valor Y do outro vértice: ");

		int secondRectangleX1 = InputHandler.getIntInput("Digite o valor X de um vértice: ");
		int secondRectangleY1 = InputHandler.getIntInput("Digite o valor Y de um vértice: ");
		int secondRectangleX2 = InputHandler.getIntInput("Digite o valor X do outro vértice: ");
		int secondRectangleY2 = InputHandler.getIntInput("Digite o valor Y do outro vértice: ");

		if (firstRectangleX1 > secondRectangleX2 || firstRectangleX2 < secondRectangleX1 || firstRectangleY1 > secondRectangleY2 || firstRectangleY2 < secondRectangleY1) {
			System.out.println("Os retângulos não se sobrepõem.");
		} else {
			System.out.println("Os retângulos se sobrepõem em algum lugar.");
		}
	}
}