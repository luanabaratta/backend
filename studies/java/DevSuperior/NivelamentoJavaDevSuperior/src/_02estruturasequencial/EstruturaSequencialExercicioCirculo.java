package _02estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencialExercicioCirculo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double area, r;
		
		System.out.print("Digite o valor do raio do circulo: ");
		r = sc.nextDouble();
		
		area = Math.PI * (Math.pow(r, 2));
		
		System.out.printf("AREA = %.3f%n", area);
		
		sc.close();
	}

}
