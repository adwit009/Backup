package day1;

import java.util.Scanner;

public class IfElseIfConditionalSwitch {

	public static void main(String[] args) {
System.out.println("Enter a value for x");
		Scanner keyboard = new Scanner(System.in);	
		float answer;
		int y = 0;
		answer = keyboard.nextFloat();
				if (answer > 0 ) {
			 y = 1;
			 
			if (answer == 0) {
				 y = 0;
		if (answer < 0) {
			 y = -1;
		}
			}
		
				}
				
				System.out.println(y);

	
}
}
