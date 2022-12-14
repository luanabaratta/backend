package _03estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionalExercicioGlicose {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a medida da glicose:");
		double medidaGlicose = sc.nextDouble();
		
		if(medidaGlicose <= 100.00) {
			System.out.println("Classificacao: normal");
		} else if (medidaGlicose <= 140.00) {
			System.out.println("Classificacao: elevado");
		} else {
			System.out.println("Classificacao: diabetes");
		}
		
		sc.close();

	}

}
