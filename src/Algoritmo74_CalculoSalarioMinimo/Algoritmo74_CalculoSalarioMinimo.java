package Algoritmo74_CalculoSalarioMinimo;

import java.util.Scanner;

public class Algoritmo74_CalculoSalarioMinimo {

	public static void main(String[] args) {
		
		algoritmo74_CalculoSalarioMinimo();

	}

	private static void algoritmo74_CalculoSalarioMinimo() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o sal�rio do funcion�rio: ");
		double salario = scanner.nextDouble(); //
		
		System.out.println("Digite o sal�rio m�nimo base: ");
		double salarioMinimo = scanner.nextDouble();
		
		double result = salario/salarioMinimo;
		
		System.out.println("O funcion�rio ganha: "+result+" sal�rios m�nimos");
	}

}
