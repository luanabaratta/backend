package _03estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionalExercicioDardo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double distanciaA, distanciaB, distanciaC, maior;

		System.out.println("Digite as tres distancias:");
		distanciaA = sc.nextDouble();
		distanciaB = sc.nextDouble();
		distanciaC = sc.nextDouble();

		if (distanciaA > distanciaB && distanciaA > distanciaC) {
			maior = distanciaA;
		} else if (distanciaB > distanciaA && distanciaB > distanciaC) {
			maior = distanciaB;
		} else {
			maior = distanciaC;
		}

		System.out.printf("MAIOR DISTANCIA = %.2f", maior);

		sc.close();
	}

}
