package _03estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionalExercicioLanchonete {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Codigo do produto comprado: ");
		int codigoProduto = sc.nextInt();
		System.out.print("Quantidade comprada: ");
		int qtdComprada = sc.nextInt();
		double valor = 0.0;

		switch (codigoProduto) {
		case 1:
			valor = qtdComprada * 5.00;
			break;
		case 2:
			valor = qtdComprada * 3.50;
			break;
		case 3:
			valor = qtdComprada * 4.80;
			break;
		case 4:
			valor = qtdComprada * 8.90;
			break;
		case 5:
			valor = qtdComprada * 7.32;
			break;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n", valor);
		
		sc.close();
	}

}
