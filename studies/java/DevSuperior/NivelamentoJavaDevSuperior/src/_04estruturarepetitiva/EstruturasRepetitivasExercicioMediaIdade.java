package _04estruturarepetitiva;

import java.util.Scanner;

public class EstruturasRepetitivasExercicioMediaIdade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade, numeroPessoas;
		double soma, media;

		System.out.println("Digite as idades:");
		idade = sc.nextInt();

		if (idade < 0) {
			System.out.println("IMPOSSIVEL CALCULAR");
		} else {
			soma = 0;
			numeroPessoas = 0;

			while (idade >= 0) {
				soma += idade;
				numeroPessoas++;
				idade = sc.nextInt();
			}
			media = soma / numeroPessoas;

			System.out.printf("MEDIA = %.2f%n", media);
		}

		sc.close();

	}

}
