/***********************
 * 
 * @author Erick Rosas
 * DATE: 11/16/2022
 * (Wednesday)
 * 
 * EDITED: FRIDAY 11/18/2022
 *
********************** */

import java.util.Scanner;
public class Exericse06_04v2 {

		//Main method for the prompts shows to the user
		public static void main(String[] args) {
			System.out.print("Enter and Integer Positive or Negative: ");
			Scanner input = new Scanner(System.in);
			int number = input.nextInt();
			reverse(number);
			
			//we have to close the input 
			input.close();
		}
		
		//Reverse method will reverse the number given from the prompt above Positive or NEgative
		 public static void reverse(int n) {
			 
	
	
			 if (n == 0) {
				System.out.print(n);
			 }
			 //if number is less than 0 
			 else if (n < 0) {
				 System.out.print("-");
				 n =  n * -1;
			 }
		
			 while ( n != 0 ) {
				 System.out.print(n%10);
				 n = n / 10;
			 }
	
		 }
	}