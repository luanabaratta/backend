package _02estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencialExercicioTroco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double precoUnitarioProduto, dinheiroRecebido, totalComprado, troco;
		int quantidadeComprada;
		
		System.out.print("Preço unitário do produto: ");
		precoUnitarioProduto = sc.nextDouble();
		
		System.out.print("Quantidade comprada: ");
		quantidadeComprada = sc.nextInt();
		
		System.out.print("Dinheiro recebido: ");
		dinheiroRecebido = sc.nextDouble();
		
		sc.nextLine();
		
		totalComprado = precoUnitarioProduto * quantidadeComprada;
		
		troco = dinheiroRecebido - totalComprado;
		
		System.out.printf("TROCO = %.2f%n", troco);
		
		sc.close();
	}

}
