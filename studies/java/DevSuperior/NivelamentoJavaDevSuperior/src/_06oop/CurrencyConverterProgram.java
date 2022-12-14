package _06oop;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverterProgram {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o valor do dólar?");
		double dollarPrice = sc.nextDouble();

		System.out.println("Quantos dólares serão comprados?");
		double amount = sc.nextDouble();
		
		double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
		System.out.printf("Valor a ser pago em reais = %.2f%n", result);

		sc.close();

	}

}
