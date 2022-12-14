package _03estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionalExercicioTemperatura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double F, C;
		
		System.out.println("Voce vai digitar a temperatura em qual escala (C/F)?");
		
		char escala = sc.next().charAt(0);
		
		if(escala == 'F') {
			System.out.println("Digite a temperatura em Fahrenheit:");
			F = sc.nextDouble();
			C = 5.0  * (F - 32) / 9.0;
			System.out.printf("Temperatura equivalente em Celsius: %.2f%n", C);
		} else {
			System.out.println("Digite a temperatura em Celsius:");
			C = sc.nextDouble();
			F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Temperatura equivalente em Fahrenheit: %.2f%n", F);
		}

		sc.close();

	}

}
