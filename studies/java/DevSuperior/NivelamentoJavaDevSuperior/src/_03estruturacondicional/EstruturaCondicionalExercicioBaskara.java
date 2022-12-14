package _03estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionalExercicioBaskara {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double delta, a = 0, b = 0, c = 0, x1, x2;
		
		System.out.println("Coeficiente a: ");
		a = sc.nextDouble();
		
		System.out.println("Coeficiente b: ");
		b = sc.nextDouble();
		
		System.out.println("Coeficiente c: ");
		c = sc.nextDouble();

		delta = (Math.pow(b, 2) - (4 * a * c));
		
		x1 = (- b + Math.sqrt(delta)) / (2 * a);
		x2 = (- b - Math.sqrt(delta)) / (2 * a);
		
		if(delta >= 0) {
			System.out.printf("X1 = %.4f%n", x1);
			System.out.printf("X2 = %.4f%n", x2);
		} else {
			System.out.println("Esta equacao nao possui raizes reais");
		}
		
		sc.close();

	}

}
