package Exercises;

import java.util.Date;

import Utils.InputHandler;

public class Exercicio18 {

	public static void run() {
		int dia = InputHandler.getIntInput("Digite o dia do seu aniversario ");
		int mes = InputHandler.getIntInput("Digite o mes do seu aniversario ");
		int ano = InputHandler.getIntInput("Digite o ano do seu aniversario ");
		
		int diaAtual = InputHandler.getIntInput("Que dia é hoje? ");
		int mesAtual = InputHandler.getIntInput("Que mes é hoje? ");
		int anoAtual = InputHandler.getIntInput("Que ano é hoje? ");
		
		int idade;
		
		if(mes < mesAtual) {
			idade = anoAtual - ano;
		} else {
			if(dia >= diaAtual) {
				idade = anoAtual - ano;
			} else {
				idade = anoAtual - ano - 1;
			}
		}
		
		System.out.println("Sua idade é " + idade);
	}
}
