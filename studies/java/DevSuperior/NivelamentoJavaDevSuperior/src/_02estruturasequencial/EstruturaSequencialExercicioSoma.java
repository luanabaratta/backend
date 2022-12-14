package _02estruturasequencial;

import java.util.Scanner;

public class EstruturaSequencialExercicioSoma {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X, Y, SOMA;
		
		System.out.print("Digite o valor de X: ");
		X = sc.nextInt();
		 
		System.out.print("Digite o valor de Y: ");
		Y = sc.nextInt();
		
		SOMA = X + Y;
		
		System.out.printf("SOMA = %d%n", SOMA);
		
		sc.close();

	}

}
