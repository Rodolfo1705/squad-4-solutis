package Exercises;

import Utils.Divisor;
import Utils.InputHandler;

public class Exercicio10 {
	public static void run() {
        Divisor.printExercise(10);
        
		double salarioBruto, descontoSalario, emprestimoPretendido;
		salarioBruto = InputHandler.getDoubleInput("Qual seu salario bruto?");
		descontoSalario = InputHandler.getDoubleInput("Qual o valor descontado do seu salario?");
		emprestimoPretendido = InputHandler.getDoubleInput("Qual o valor do emprestimo que voce pretende fazer?");
		
		if(emprestimoDisponivel(salarioBruto, descontoSalario) <= emprestimoPretendido) {
			System.out.println("Valor " + emprestimoPretendido + " disponivel para emprestimo");
		} else {
			System.out.println("Valor " + emprestimoPretendido + " nao disponivel para emprestimo");
		}
	}
	
	public static double emprestimoDisponivel(double salarioBruto, double descontoSalario) {
		return (salarioBruto - descontoSalario) * 0.3;
	}
}
