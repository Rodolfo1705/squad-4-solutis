/*Verifique a validade de uma data de aniversário (solicite apenas o número do dia e do mês). Além de falar se a
data está ok, informe também o nome do mês. Dica: meses com 30 dias: abril, junho, setembro e novembro.*/

package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio15 {
    public static void run(){
        Divisor.printExercise(15);

        String[] months = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        int day = InputHandler.getIntInput("Digite o dia do aniversário: ");
        int month = InputHandler.getIntInput("Digite o mês do aniversário: ");

        if (checkMonth(month) && checkDay(month, day)){
            System.out.printf("%d de %s é uma data válida!\n", day, monthName(month));
        } else if (checkMonth(month) || checkDay(month, day)){
            if (checkMonth(month)){ System.out.println("Dia inválido!"); }
            else { System.out.println("Mês inválido!"); }
        } else {
            System.out.println("Nem o dia, nem o mês são inválidos!");
        }
    }

    private static boolean checkDay (int month, int day){
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: {
                if (day > 0 && day <= 31) {return true;}
                break;
            }
            default: {
                if (day > 0 && day <= 30) {return true;}
                break;
            }
        }
        return false;
    }

    private static boolean checkMonth (int month){
        if (month >= 1 && month <= 12){
            return true;
        }

        return false;
    }
    private static String monthName(int month){
        String[] months = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        return months[month - 1];
    }
}
