package _06oop;

public class Students {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

	public double finalGrades() {
		return grade1 + grade2 + grade3;
	}
	
	public double missingPoints() {
		if(finalGrades() < 60.0) {
			return 60.0 - finalGrades();
		} else {
			return 0.0;
		}
	}

}
