package _06oop;

import java.util.Locale;
import java.util.Scanner;

public class FuncionariosProgram {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Funcionarios funcionario = new Funcionarios();

		System.out.println("Nome: ");
		funcionario.name = sc.nextLine();

		System.out.println("Salário bruto: ");
		funcionario.grossSalary = sc.nextDouble();

		System.out.println("Imposto: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println("Funcionário: " + funcionario);
		
		System.out.println("Qual a porcentagem para aumentar o salário?");
		double percentage = sc.nextDouble();
		funcionario.increaseSalary(percentage);
		
		System.out.println("Dados atualizados: " + funcionario);


		sc.close();
	}

}
