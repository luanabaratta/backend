package _02estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial {

	public static void main(String[] args) {

		System.out.println("--------------");
		System.out.println("Saída de dados");
		System.out.println("--------------");

		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);

		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

		System.out.println("--------------------");
		System.out.println("Exercício de fixação");
		System.out.println("--------------------");

		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
		System.out.println();
		System.out.printf("Measure with eight decimal places: %.6f%n", measure);
		System.out.printf("Rounded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);

		System.out.println("-------");
		System.out.println("Casting");
		System.out.println("-------");

		int z, y;
		double resultado;
		z = 5;
		y = 2;
		resultado = (double) z / y;
		System.out.println(resultado);

		double a;
		int b;

		a = 5.0;
		b = (int) a;

		System.out.println(b);

		System.out.println("----------------");
		System.out.println("Entrada de dados");
		System.out.println("----------------");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String s;
		s = sc.next();
		System.out.println("Você digitou " + s);

		int m;
		m = sc.nextInt();
		System.out.println("Você digitou " + m);

		double zz;
		zz = sc.nextDouble();
		System.out.println("Você digitou " + zz);

		char g;
		g = sc.next().charAt(0);
		System.out.println("Você digitou " + g);

		int xx;
		String s1, s2, s3;
		xx = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(xx);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

		System.out.println("---------------------------");
		System.out.println("Funções matemáticas em Java");
		System.out.println("---------------------------");

		double xxx = 3.0;
		double yyy = 4.0;
		double zzz = -5.0;
		double AA, BB, CC;

		AA = Math.sqrt(xxx);
		BB = Math.sqrt(yyy);
		CC = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + xxx + " = " + AA);
		System.out.println("Raiz quadrada de " + yyy + " = " + BB);
		System.out.println("Raiz quadrada de 25 = " + CC);

		AA = Math.pow(xxx, yyy);
		BB = Math.pow(xxx, 2.0);
		CC = Math.pow(5.0, 2.0);
		System.out.println(xxx + " elevado a " + yyy + " = " + AA);
		System.out.println(xxx + " elevado ao quadrado = " + BB);
		System.out.println("5 elevado ao quadrado = " + CC);

		AA = Math.abs(yyy);
		BB = Math.abs(zzz);
		System.out.println("Valor absoluto de " + yyy + " = " + AA);
		System.out.println("Valor absoluto de " + zzz + " = " + BB);

	}

}
