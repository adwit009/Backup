package day1;

import java.util.Scanner;

public class DistanceTraveled {
public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	while (1 == 1){
		System.out.println("Please enter your time interval");
		double t = keyboard.nextDouble();
		System.out.println("Please enter your acceleration for this interval");
		double a = keyboard.nextDouble();
		System.out.println("Please enter your velocity at the start of this time interval");
		double u = keyboard.nextDouble();
        double ut = u * t;
        double at = a * t;
        double at1 = (at * at) /2;
        double total = ut + at1;
		System.out.println(total + " is the distance traveled in this time");	
		System.out.println("Would you like to enter more values? (yes or no)");
        String answer;
        answer = keyboard.nextLine();
        answer = keyboard.nextLine();
        if (answer.equals("yes")){
	}
	else{
		System.exit(0);
	}
	
	
	
}
}
}
