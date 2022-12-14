package _02estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencialExercicioConsumo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Distancia percorrida: ");
		int distanciaPercorrida = sc.nextInt();
		
		System.out.print("Combustível gasto: ");
		double combustivelGasto = sc.nextDouble();
		
		double consumoMedio = ((double) distanciaPercorrida / combustivelGasto);
		
		System.out.printf("Consumo medio = %.3f%n", consumoMedio);
		
		sc.close();
	}

}
