/*
 * Erick Rosas
 * DATE: 10/28/2022
 * (FRIDAY)
 * 
 * MOFIFIED: 10/31/2022
 * (MONDAY)
 */

import java.util.Scanner;
public class Exercise05_09V2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Prompting the user
		//Assume that there are at least 2 students
		System.out.println("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		
		//Make sure score 1 is greater than score 2
		
		//assigning the a minimum value so we canget higher scores
		String student1 = "";
		double score1 = Double.MIN_VALUE;
		String student2 = "";
		double score2 = Double.MIN_VALUE;
		

		//assert: score1 >= score2
		//this will compare 0 is less than #ofStudents minus 2 and will loop until it reaches how many total sudents there is
		for(int i=0; i < numberOfStudents; i++) {
			System.out.println("Enter a student name: ");
			String student = input.next();
			System.out.println("Enter a students score: ");
			double score = input.nextDouble();
			
			//Swapping the NEW students and score entered if they are the highest value
			//Making sure Score 1 is the highest score by swapping
			if (score > score1) {
				student2 = student1;
				score2 = score1;
				student1 = student;
				score1 = score;
			}
			else if (score > score2) {
				student2 = student;
				score2 = score;
				
			}
		}
		
		System.out.println("The Top Two Students: ");
		System.out.println(student1 + "'s score is " + score1);
		System.out.println(student2 + "'s score is " + score2);
	
		input.close();
	}

}
