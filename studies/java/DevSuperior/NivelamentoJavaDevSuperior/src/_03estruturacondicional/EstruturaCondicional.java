package _03estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int minutos = sc.nextInt();
		double conta = 50.0;
		double price = sc.nextDouble();
		double discount = 0;

		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		System.out.printf("Valor da conta = R$ %.2f%n", conta);

		if (price > 100.0) {
			discount = price * 0.1;
		}
		System.out.println(discount);

		sc.close();
	}

}
