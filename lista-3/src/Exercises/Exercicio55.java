/*A operadora de celular Vai-Vai possui um plano com o valor mensal de 50,00 que permite 100 minutos por mês para
qualquer número. Além disso, ela oferece 50 minutos a mais para ligações destinadas a um número da própria Vai-Vai.
Ainda neste plano ela tem uma promoção onde cada minuto gasto para telefone fixo consome somente a metade. O valor do
minuto excedente para outras operadoras é de 0.65, e para a própria Vai-Vai é 0.20.
Faça um programa que permita ao usuário entrar com o tipo de ligação (‘o’ = outras operadoras, ‘v’ = a própria Vai-Vai, ou
‘f’ = telefone fixo) e  a quantidade de minutos. A cada entrada, deve-se informar o quanto que ele tem de saldo e o valor a
pagar. Faça isto enquanto ele indicar que existem mais ligações a serem digitadas.*/

package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio55 {
    public static void run(){
        Divisor.printExercise(55);

        int option;
        double minutesAvailable = 100, extraValue = 0, value = 50;
        boolean firstPass = true;

        do {
            String type = InputHandler.getStringInput("Especifique qual tipo de ligação será feita: ('o' = outras operadoras | 'v' = operadora Vai-Vai | 'f' = telefone fixo)\n");
            double minute = InputHandler.getDoubleInput("Quantos minutos durou a ligação? ");

            if (type.equalsIgnoreCase("v") && firstPass == true && minute >= 50){
                minutesAvailable += 50;
                firstPass = false;
                value = 0;
            } else if (type.equalsIgnoreCase("v") && firstPass == true && minute < 50){
                value -= minute;
                if (value < 0){
                    minutesAvailable += value;
                    firstPass = false;
                    value = 0;
                } else {
                    minutesAvailable += (minute);
                }
            }

            minutesAvailable = subtractMinutes(type, minute, minutesAvailable);
            if ((minutesAvailable) < 0){
                extraValue = moreMinutes(type, minutesAvailable * -1);
                minutesAvailable = 0;
            }

            System.out.println("Saldo atual: " + minutesAvailable + " minutos.");
            System.out.println("Saldo atual especificamente para a operadora Vai-Vai: " + value + " minutos.");
            System.out.println("Valor total a pagar: R$" + (50.0 + extraValue));

            option = InputHandler.getIntInput("Deseja realizar uma nova ligação? (1 - Sim | 2 - Não)\n");
        } while(option == 1);

    }

    private static double subtractMinutes(String type, double minute, double minutesAvailable){
        if (type.equalsIgnoreCase("v")) {

        } else if (type.equalsIgnoreCase("f")) {
            minute /= 2;
        } else if (type.equalsIgnoreCase("o")) {

        } else {
            System.out.println("Código inválido!");
            return minutesAvailable;
        }

        return minutesAvailable - minute;
    }

    private static double moreMinutes(String type, double balance){
        double valorPorMinuto = 0.65;

        if (type.equalsIgnoreCase("v")) {
            valorPorMinuto = 0.20;
        } else if (type.equalsIgnoreCase("f")) {
            valorPorMinuto /= 2;
        }

        return balance * valorPorMinuto;
    }
}
