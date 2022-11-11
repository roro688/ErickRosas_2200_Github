/***************************
 * ERICK ROSAS
 * DATE: 11/11/2022
 * (Friday)
****************************/

import java.util.Scanner;

public class Exercise06_37 {
	
	//First method to prompt the user to enter said variables
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			System.out.print("Eneter an Intenger: ");
			int number = input.nextInt();
			System.out.print("Enter the width: ");
			int width = input.nextInt();
			
			//format is a way to call upon certain arguments
			//you can also do number*number so the number output will show number time number
			System.out.println("The formated number is " + format(number,width));
			
			input.close();
	}

	//Mehtod to give those said variables a input  WIDTH AND INTERGER
	public static String format(int n, int w) {
		String result = n + "";
		int len = w - result.length();
		for (int i = 0; i < len; i++) {
			result = "0" + result;
		}
		return result;
	}
	
	
}
