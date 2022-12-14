package _04estruturarepetitiva;

import java.util.Scanner;

public class EstruturasRepetitivasExercicioCrescente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X, Y;

		System.out.println("Digite dois numeros:");
		X = sc.nextInt();
		Y = sc.nextInt();

		while (X != Y) {
			if (X > Y) {
				System.out.println("DECRESCENTE!");
			} else {
				System.out.println("CRESCENTE!");
			}
			System.out.println("Digite outros dois numeros:");
			X = sc.nextInt();
			Y = sc.nextInt();
		}

		sc.close();
	}

}
