package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio29 {
    public static void run(){
        Divisor.printExercise(29);

        int x1 = InputHandler.getIntInput("Digite o valor de x1: ");
        int y1 = InputHandler.getIntInput("Digite o valor de y1: ");
        int x2 = InputHandler.getIntInput("Digite o valor de x2: ");
        int y2 = InputHandler.getIntInput("Digite o valor de y2: ");

        System.out.println();
        printCoordinatesCharacteristics(x1, y1, x2, y2);

        int area = calculateArea(x1, y1, x2, y2);
        System.out.println("A área do retângulo é: " + area);

        int xPoint = InputHandler.getIntInput("Digite o valor x de outro ponto: ");
        int yPoint = InputHandler.getIntInput("Digite o valor y de outro ponto: ");

        printDeterminedNewPointPosition(x1, y1, x2, y2, xPoint, yPoint);
    }

    private static void printCoordinatesCharacteristics(int x1, int y1, int x2, int y2){
        if(x1 != x2 && y1 != y2) {
            System.out.println("Formam uma retângulo.");
            return;
        }

        if(x1 == x2 && y1 != y2){
            System.out.println("Formam uma linha vertical.");
            return;
        }

        if (x1 != x2 ){
            System.out.println("Formam uma linha horizontal.");
            return;
        }

        System.out.println("Formam um ponto.");
    }

    private static int calculateArea(int x1, int y1, int x2, int y2){
        return Math.abs((x2 - x1) * (y2 - y1));
    }

    private static void printDeterminedNewPointPosition(int x1, int y1, int x2, int y2, int xPoint, int yPoint){
        if (xPoint < x1 && yPoint > y2) {
            System.out.println("acima e à esquerda");
            return;
        }
        if (xPoint > x2 && yPoint > y2) {
            System.out.println("acima e à direita");
            return;
        }
        if (xPoint < x1 && yPoint < y1) {
            System.out.println("embaixo e à esquerda");
            return;
        }
        if (xPoint > x2 && yPoint < y1) {
            System.out.println("embaixo e à direita");
            return;
        }
        if (xPoint < x1) {
            System.out.println("à esquerda");
            return;
        }
        if (xPoint > x2) {
            System.out.println("à direita");
            return;
        }
        if (yPoint < y1) {
            System.out.println("embaixo");
            return;
        }
        if (yPoint > y2) {
            System.out.println("acima");
            return;
        }

        System.out.println("dentro do retângulo");
    }
}
