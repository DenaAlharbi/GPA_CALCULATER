package lab01;
import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		//Decelerations
		int totalCredits =0; 
		double totalPoints = 0;
		
		
	
	
		Scanner input= new Scanner(System.in);
		System.out.print("How many courses do you have: ");
		int numCourses =input.nextInt();
		System.out.println("Enter letter grade, credit hours for "+ numCourses +"courses: ");

		for(int i =0; i < numCourses; i++) {
			String sentence ="A+ A B+ B C+ C D+ D  F ";
			//System.out.print("Enter letter grade, credit hours for "+ numCourses +"courses: ");

			String letterGrade = input.next();

			int numCredits=input.nextInt();
			totalCredits = totalCredits + numCredits;
			boolean result = sentence.contains(letterGrade);
			if(result) {
				switch(letterGrade) {
				case "A+" -> totalPoints = (double) (totalPoints+(4.0)* numCredits);
				case "A" -> totalPoints = (double) (totalPoints+( 3.75)* numCredits);
				case "B+" -> totalPoints = (double) (totalPoints+( 3.5)* numCredits);
				case "B" -> totalPoints = (double) (totalPoints+( 3.0)* numCredits);
				case "C+" -> totalPoints = (double) (totalPoints+( 2.5)* numCredits);
				case "C" -> totalPoints = (double) (totalPoints+( 2.0)* numCredits);
				case "D+" -> totalPoints = (double) (totalPoints+( 1.5)* numCredits);
				case "D" -> totalPoints = (double) (totalPoints+(1.0)* numCredits);
				case "F" -> totalPoints = (double) (totalPoints+( 0.0)* numCredits);			
				}
			}
			else {
				System.out.println("Invalid");
		
			}
			
			

	


	}
		//GPA = (sum of grade points x credits) / (sum of credits)
		double gpa= 0.0;
		gpa = (totalPoints / totalCredits);
		
		System.out.println("GPA = "+ gpa);
	
	}
}
