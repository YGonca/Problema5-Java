package entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	public void approval() {
		if(finalGrade()<60) {
			System.out.println("Failed!");
			System.out.println("Missing: " + (60-finalGrade()) + " points!");
		}
		else
			System.out.println();
	}
}
