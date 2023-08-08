package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio12 {
    public static void run(){
        Divisor.printExercise(12);

        double firstGrade = InputHandler.getDoubleInput("Digite a primeira nota: ");
        double secondGrade = InputHandler.getDoubleInput("Digite a segunda nota: ");
        double thirdGrade = InputHandler.getDoubleInput("Digite a terceira nota: ");

        printStudentStatus(firstGrade, secondGrade, thirdGrade);
    }

    public static void printStudentStatus(double firstGrade, double secondGrade, double thirdGrade){
        double average = (firstGrade + secondGrade + thirdGrade) / 3;

        System.out.println("Sua média foi: " + average);

        System.out.print("Status - ");

        if(average >= 7){
            System.out.println("Aprovado! :D");
            return;
        }
        if (average >= 5){
            System.out.println("Recuperação :/");

            if (isDoingRecovery()) doRecovery();

            return;
        }

        System.out.println("Reprovado ;(");
    }

    private static boolean isDoingRecovery(){
        int answer;

        do {
            answer = InputHandler.getIntInput("Deseja realizar o teste final? 1 (Sim); 2 (Não): ");
        } while (answer != 1 && answer != 2);


        return answer == 1;
    }

    private static void doRecovery(){
        Exercicio13.run();
    }
}
