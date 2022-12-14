package _03estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionalExercicioTrocoVerificado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double troco, dinheiroRecebido, precoUnitarioProduto, totalComprado = 0, faltam;
		int qtdProduto;

		System.out.println("Preço unitário do produto: ");
		precoUnitarioProduto = sc.nextDouble();

		System.out.println("Quantidade comprada: ");
		qtdProduto = sc.nextInt();

		System.out.println("Dinheiro recebido: ");
		dinheiroRecebido = sc.nextDouble();

		totalComprado = (double) qtdProduto * precoUnitarioProduto;

		if (totalComprado > dinheiroRecebido) {
			faltam = totalComprado - dinheiroRecebido;
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS", faltam);
		} else {
			troco = dinheiroRecebido - totalComprado;
			System.out.printf("TROCO = %.2f", troco);
		}

		sc.close();
	}

}
