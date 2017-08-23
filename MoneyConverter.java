package day1;

import java.util.Scanner;

public class MoneyConverter {
public static void main(String[] args) {
	System.out.println("Please enter a money value (in dollars)");
	Scanner keyboard = new Scanner(System.in);
	double x;
	x = keyboard.nextDouble();
	int dollartocent =  (int) (x * 100);
System.out.println(x+" dollars in cents is "+dollartocent+ " cents");
}
}
