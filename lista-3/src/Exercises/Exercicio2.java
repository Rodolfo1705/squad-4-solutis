package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio2 {
    public static void run(){
        Divisor.printExercise(2);
        
        double salarioAtual = InputHandler.getDoubleInput("Qual seu salário atual?");
        double salarioMinimo = InputHandler.getDoubleInput("Qual o salário mínimo atual?");
        
        int qtdSalarioMinimo = (int) (salarioAtual/salarioMinimo);
        
        System.out.println("Você recebe " + qtdSalarioMinimo);
    }
}
