package _03estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionalExercicioMenorTres {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int valorA, valorB, valorC, menor;

		System.out.print("Primeiro valor: ");
		valorA = sc.nextInt();

		System.out.print("Segundo valor: ");
		valorB = sc.nextInt();

		System.out.print("Terceiro valor: ");
		valorC = sc.nextInt();

		if (valorA < valorB && valorA < valorC) {
			menor = valorA;
		} else if (valorB < valorA && valorB < valorC) {
			menor = valorB;
		} else {
			menor = valorC;
		}

		System.out.printf("MENOR = %d%n", menor);

		sc.close();
	}
}
