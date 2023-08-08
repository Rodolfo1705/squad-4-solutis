package Exercises;

import Utils.InputHandler;

public class Exercicio14 {
	public static void run() {
		String mes = InputHandler.getStringInput("Digite o nome de um mes: ");
		
		if(mes.equalsIgnoreCase("janeiro")) {
			System.out.println(mes + " corresponde ao mes: 01");
		} else if(mes.equalsIgnoreCase("fevereiro")) {
			System.out.println(mes + " corresponde ao mes: 02");
		} else if(mes.equalsIgnoreCase("marco")) {
			System.out.println(mes + " corresponde ao mes: 03");
		} else if(mes.equalsIgnoreCase("abril")) {
			System.out.println(mes + " corresponde ao mes: 04");
		} else if(mes.equalsIgnoreCase("maio")) {
			System.out.println(mes + " corresponde ao mes: 05");
		} else if(mes.equalsIgnoreCase("junho")) {
			System.out.println(mes + " corresponde ao mes: 06");
		} else if(mes.equalsIgnoreCase("julho")) {
			System.out.println(mes + " corresponde ao mes: 07");
		} else if(mes.equalsIgnoreCase("agosto")) {
			System.out.println(mes + " corresponde ao mes: 08");
		} else if(mes.equalsIgnoreCase("setembro")) {
			System.out.println(mes + " corresponde ao mes: 09");
		} else if(mes.equalsIgnoreCase("outubro")) {
			System.out.println(mes + " corresponde ao mes: 10");
		} else if(mes.equalsIgnoreCase("novembro")) {
			System.out.println(mes + " corresponde ao mes: 11");
		} else if(mes.equalsIgnoreCase("dezembro")) {
			System.out.println(mes + " corresponde ao mes: 12");
		} else {
			System.out.println("Digite um mes valido!");
		}
	}

}
