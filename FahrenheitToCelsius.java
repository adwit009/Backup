package day1;

import java.util.Scanner;

public class FahrenheitToCelsius {
public static void main(String[] args) {
	System.out.println("Enter a temperature value in fahrenheit");
	Scanner keyboard = new Scanner(System.in);
	double x;
	x = keyboard.nextDouble();
	double c = (x-32)/1.8;
	System.out.println(x+" degrees Fahrenheit is " + c+" degrees Celsius");



}
}
