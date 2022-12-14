package _03estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionalExercicioAumento {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o salario da pessoa: ");
		double salario = sc.nextDouble();

		double novoSalario = 0, aumento = 0, porcentagem = 0;

		if (salario <= 1000.00) {
			novoSalario = salario + (salario * 0.2);
			aumento = salario * 0.20;
			porcentagem = aumento / salario * 100.0;
		} else if (salario > 1000.00 && salario <= 3000.00) {
			novoSalario = salario + (salario * 0.15);
			aumento = salario * 0.15;
			porcentagem = aumento / salario * 100.0;
		} else if (salario > 3000.00 && salario <= 8000.00) {
			novoSalario = salario + (salario * 0.1);
			aumento = salario * 0.10;
			porcentagem = aumento / salario * 100.0;
		} else {
			novoSalario = salario + (salario * 0.05);
			aumento = salario * 0.05;
			porcentagem = aumento / salario * 100.0;
		}

		System.out.printf("Novo salario = R$ %.2f%n", novoSalario);
		System.out.printf("Aumento = R$ %.2f%n", aumento);
		System.out.printf("Porcentagem = %.0f", porcentagem);
		System.out.print(" %");

		sc.close();

	}

}
