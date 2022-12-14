package _02estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencialExercicioIdades {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Dados da primeira pessoa:");

		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Dados da segunda pessoa:");
		
		System.out.print("Nome: ");
		String nome2 = sc.nextLine();
		
		System.out.print("Idade: ");
		int idade2 = sc.nextInt();
		
		double media = (double) (idade + idade2) / 2;
		
		System.out.printf("A idade média de %s e %s é de %.1f anos", nome, nome2, media);

		sc.close();
	}
}
