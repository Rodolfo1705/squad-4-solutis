package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio30 {
	public static void run() {
        Divisor.printExercise(30);

		int firstRectangleX1 = InputHandler.getIntInput("Digite o valor X de um vértice: ");
		int firstRectangleY1 = InputHandler.getIntInput("Digite o valor Y de um vértice: ");
		int firstRectangleX2 = InputHandler.getIntInput("Digite o valor X de outro vértice: ");
		int firstRectangleY2 = InputHandler.getIntInput("Digite o valor Y de outro vértice: ");
		int firstRectangleX3 = InputHandler.getIntInput("Digite o valor X de mais um vértice: ");
		int firstRectangleY3 = InputHandler.getIntInput("Digite o valor Y de mais um vértice: ");
		int firstRectangleX4 = InputHandler.getIntInput("Digite o valor X do último vértice: ");
		int firstRectangleY4 = InputHandler.getIntInput("Digite o valor Y do último vértice: ");

		int secondRectangleX1 = InputHandler.getIntInput("Digite o valor X de um vértice: ");
		int secondRectangleY1 = InputHandler.getIntInput("Digite o valor Y de um vértice: ");
		int secondRectangleX2 = InputHandler.getIntInput("Digite o valor X de outro vértice: ");
		int secondRectangleY2 = InputHandler.getIntInput("Digite o valor Y de outro vértice: ");
		int secondRectangleX3 = InputHandler.getIntInput("Digite o valor X de mais um vértice: ");
		int secondRectangleY3 = InputHandler.getIntInput("Digite o valor Y de mais um vértice: ");
		int secondRectangleX4 = InputHandler.getIntInput("Digite o valor X do último vértice: ");
		int secondRectangleY4 = InputHandler.getIntInput("Digite o valor Y do último vértice: ");

        
	}

	private static boolean isRectanglePointsValid(int x1, int y1, int x2, int y2,int x3, int y3,int x4, int y4){
		if ((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x1 == x4 && y1 == y4))
			return false;

		if((x2 == x3 && y2 == y3) || (x2 == x4 && y2 == y4))
			return false;

		if(x3 == x4 && y3 ==y4)
			return false;

		return true;
	}

}