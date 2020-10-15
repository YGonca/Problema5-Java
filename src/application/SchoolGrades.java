package application;

import java.util.Scanner;
import entities.Student;

public class SchoolGrades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("What's the student's name? ");
		student.name = sc.nextLine();
		System.out.print("What's the students 1st grade? ");
		student.grade1 = sc.nextDouble();
		System.out.print("What's the students 2nd grade? ");
		student.grade2 = sc.nextDouble();
		System.out.print("What's the students 3rd grade? ");
		student.grade3 = sc.nextDouble();
		
		System.out.println("\nStudent: " + student.name);
		System.out.println("Final grade: " + student.finalGrade());
		student.approval();
		sc.close();
	}

}
