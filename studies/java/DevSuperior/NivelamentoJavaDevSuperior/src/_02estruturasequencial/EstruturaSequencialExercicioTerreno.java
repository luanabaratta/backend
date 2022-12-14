package _02estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencialExercicioTerreno {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, valorMetro, area, precoTerreno;
		
		System.out.print("Digite a largura do terreno: ");
		largura = sc.nextDouble();
		
		System.out.print("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();
		
		System.out.print("Digite o valor do metro quadrado: ");
		valorMetro = sc.nextDouble();
		
		area = largura * comprimento;
		
		precoTerreno = area * valorMetro;
		
		System.out.printf("Area do terreno = %.2f%n", area);
		System.out.printf("Preco do terreno = %.2f", precoTerreno);
		
		sc.close();
	}
}
