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

		System.out.println("Sal�rio bruto: ");
		funcionario.grossSalary = sc.nextDouble();

		System.out.println("Imposto: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println("Funcion�rio: " + funcionario);
		
		System.out.println("Qual a porcentagem para aumentar o sal�rio?");
		double percentage = sc.nextDouble();
		funcionario.increaseSalary(percentage);
		
		System.out.println("Dados atualizados: " + funcionario);


		sc.close();
	}

}
