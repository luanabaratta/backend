package _06oop;

import java.util.Locale;
import java.util.Scanner;

public class StudentsExercicio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Students estudante = new Students();

		estudante.name = sc.nextLine();
		estudante.grade1 = sc.nextDouble();
		estudante.grade2 = sc.nextDouble();
		estudante.grade3 = sc.nextDouble();

		if (estudante.finalGrades() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("FALTARAM %.2f PONTOS", estudante.missingPoints());
		} else {
			System.out.println("PASS");
		}

		sc.close();
	}

}
