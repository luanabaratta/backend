package _03estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionalExercicioTempoDeJogo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Hora inicial: ");
		int horaInicial = sc.nextInt();

		System.out.print("Hora final: ");
		int horaFinal = sc.nextInt();
		
		
		if(horaFinal > horaInicial) {
			System.out.printf("O JOGO DUROU %d HORA(S)", horaFinal - horaInicial);
		} else {
			System.out.printf("O JOGO DUROU %d HORA(S)", 24 + horaFinal - horaInicial);
		}

		sc.close();
	}

}
