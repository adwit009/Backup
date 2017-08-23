package day1;

import java.util.Scanner;

public class HarmonicMean {
public static void main(String[] args) {
	int x;
	System.out.println("This program will give you the sum of a hormonic series of the form \n1 + 1/2 + 1/3 + ... + 1/n \nplease enter n");
	Scanner keyboard = new Scanner(System.in);

x = keyboard.nextInt();
double a = 1;
double total = 0;
for (int n = 1; n < x+1 ; n++) {
		total = total + 1/a; 
			
	 a++;
	 }
System.out.println(total);
}
}

