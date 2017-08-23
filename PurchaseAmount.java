package day1;

import java.util.Scanner;

public class PurchaseAmount {
public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	System.out.println("How much money did you spend on Mill cloth(in the format 10.53)");
double i;
 i = keyboard.nextDouble();
double mp = 1;
 if (i>=0 && i<= 100) {
mp = i;
 }
 if (i>=101 && i<= 200) {
mp = i * 0.95;
}
 if (i>=201 && i<= 300) {
mp = i * .925;
}
 if (i > 300) {
	 mp = i * .90;
}
 System.out.println("How much money did you spend on Handloom items (in the format 10.53)");
 double a;
  a = keyboard.nextDouble();
 double hp = 1;
  if (a>=0 && a<= 100) {
 hp = a * 0.95;
  }
  else if (a>=101 && a<= 200) {
 hp = a * 0.925;
 }
  else if (a>=201 && a<= 300) {
 hp = a * .9;
 }
  else if (a > 300) {
 	 hp = a * .85;
 }
  
double total = mp + hp;
  System.out.println(total);
  
}
}
