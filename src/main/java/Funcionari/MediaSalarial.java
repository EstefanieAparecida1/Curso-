package Funcionari;

import java.util.Scanner;

public class MediaSalarial {
	/*
	 * Criar um programa que calcule a m�dia de sal�rios de uma empresa, pedindo ao
	 * usu�rio a grade de funcion�rios e os sal�rios, e devolvendo a m�dia salarial.
	 * Exemplo: Funcion�rio 1 = R$2.000 Funcion�rio 2 = R$3.000 Funcion�rio 3 =
	 * R$4.000 M�dia = f1+f2+f3/3 M�dia = R$3.000
	 */

	public static void main(String[] Args) {

		Scanner ler = new Scanner(System.in);

		int Funcionarios;

		System.out.println("Media_Salarial");

		System.out.println("Qual a Grade de Funcionarios? ");
		Funcionarios = ler.nextInt();

		double Salario_funcionarios;
		double Soma_salarial = 0;

		for (int a = 0; a < Funcionarios; a += 1) {
			System.out.println("Insira salario do funcionario: ");
			Salario_funcionarios = ler.nextDouble();

			Soma_salarial = Salario_funcionarios + Soma_salarial;

		}
		
		Soma_salarial = Soma_salarial / Funcionarios;

		System.out.println("Media Salarial �:" + Soma_salarial);
	}

}
