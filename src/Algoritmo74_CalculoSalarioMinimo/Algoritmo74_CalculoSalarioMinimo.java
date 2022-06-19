package Algoritmo74_CalculoSalarioMinimo;

import java.util.Scanner;

public class Algoritmo74_CalculoSalarioMinimo {

	public static void main(String[] args) {
		
		algoritmo74_CalculoSalarioMinimo();

	}

	private static void algoritmo74_CalculoSalarioMinimo() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o salário do funcionário: ");
		double salario = scanner.nextDouble(); //
		
		System.out.println("Digite o salário mínimo base: ");
		double salarioMinimo = scanner.nextDouble();
		
		double result = salario/salarioMinimo;
		
		System.out.println("O funcionário ganha: "+result+" salários mínimos");
	}

}
