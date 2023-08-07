package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio21 {
    public static void run(){
        Divisor.printExercise(21);

        String sector = InputHandler.getStringInput("Digite o setor de seu cargo: ");

        System.out.println("Sua porcentagem de empréstimo disponível é: " + getLoanPercentage(sector) + "%");
    }

    private static int getLoanPercentage(String sector){
        int loanPercentage = 0;
        sector.toLowerCase();

        if(sector.equals("diretoria")){
            loanPercentage = 30;
        } else if(sector.equals("gerência")){
            loanPercentage = 25;
        } else if(sector.equals("operacional")){
            loanPercentage = 20;
        } else {
            System.out.println("Cargo não encontrado.");
        }

        return loanPercentage;
    }
}
