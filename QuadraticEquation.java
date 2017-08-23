package day1;

import javax.swing.JOptionPane;

public class QuadraticEquation {
public static void main(String[] args) {
	String i = JOptionPane.showInputDialog("Enter a quadratic eqation in the form ax^2 + bx + c = 0");
	String A = JOptionPane.showInputDialog("Enter the value of a in "+ i);
	String B = JOptionPane.showInputDialog("Enter the value of b in "+ i);
	String C = JOptionPane.showInputDialog("Enter the value of c in "+ i);
// x = (-b +- sqrt(b^2 - 4ac))/2a
	int a = Integer.parseInt(A);;
	int b = Integer.parseInt(B);
	int c = Integer.parseInt(C);
	int bnew = b * b; 
	int b2 = b + b;
	int bneg = b - b2;
	int a2 = a + a;
	int ac = a * c;
	int ac4 = ac*4;
	int first = (int) Math.sqrt(bnew - ac4);
int next1 = bneg + first;  
int next2 = bneg - first;
int last1 = next1 / a2;
int last2 = next2 / a2 ;
System.out.println("The answers are " + last1 + ", " + last2);

}
}
