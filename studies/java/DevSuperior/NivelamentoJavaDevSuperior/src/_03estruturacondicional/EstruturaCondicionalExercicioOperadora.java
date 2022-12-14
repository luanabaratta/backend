package _03estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionalExercicioOperadora {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double conta = 50.00;
		
		System.out.print("Digite a quantidade de minutos: ");
		double minutos = sc.nextInt();
		
		if(minutos > 100) {
			conta += (minutos - 100) * 2.00;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f", conta);
		
		sc.close();
	}

}
