package _02estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencialExercicioPagamento {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Valor por hora: ");
		double valorPorHora = sc.nextDouble();
		
		System.out.print("Horas trabalhadas: ");
		int horasTrabalhadas = sc.nextInt();
		
		double valorPagamento = (double) horasTrabalhadas * valorPorHora;
		
		System.out.printf("O pagamento para %s deve ser %.2f%n", nome, valorPagamento);
		
		sc.close();
	}

}
