package day1;

import javax.swing.JOptionPane;

public class Area {
public static void main(String[] args) {
		String a = 	JOptionPane.showInputDialog("Enter the number of the shape whose area you would like to calculate (square(1), triangle(2), circle(3), rectangle(4) or trapeziod(5))");
			int a2 = Integer.parseInt(a);
	if(a2 == 1){
		String s = JOptionPane.showInputDialog("Enter the side length of your square");
		double s2 = Integer.parseInt(s); 
		if(s2 <= 0){
			JOptionPane.showMessageDialog(null, "Error, please make sure your entered side length is not less than 0");
			System.exit(0);
		}
		
		double s3 = s2 * s2;	
		JOptionPane.showMessageDialog(null, s3 + " is the area of your square");
		System.exit(0);
	}
	if (a2 == 2) {
		String s = JOptionPane.showInputDialog("Enter the height of your triangle");
		String b = JOptionPane.showInputDialog("Enter the base length of your triangle");
		double s2 = Integer.parseInt(s); 
		double b2 = Integer.parseInt(b);
		if(s2 <= 0){
			JOptionPane.showMessageDialog(null, "Error, please make sure your entered height is not less than 0");
			System.exit(0);
		}
		if(b2 <= 0){
			JOptionPane.showMessageDialog(null, "Error, please make sure your entered base length is not less than 0");
			System.exit(0);
		}
		double s3 = (s2 * b2)/2;	
		JOptionPane.showMessageDialog(null, s3 + " is the area of your triangle");
		System.exit(0);	
	}
	if (a2 == 3) {
		String s = JOptionPane.showInputDialog("Enter the radius of your circle");
		double s2 = Integer.parseInt(s); 
		if(s2 <= 0){
			JOptionPane.showMessageDialog(null, "Error, please make sure your entered radius length is not less than 0");
			System.exit(0);
		}
		double s3 = Math.sqrt(s2);	
		double pi = 3.14;
		double s4 = Math.sqrt(s2 * pi);
		JOptionPane.showMessageDialog(null, s3 + "π the area of your triangle ("+ s4 +")");
		System.exit(0);
	}
	if (a2 == 4){
		String s = JOptionPane.showInputDialog("Enter the base length of your rectangle");
		String b = JOptionPane.showInputDialog("Enter the  height of your rectangle");
		double s2 = Integer.parseInt(s); 
		double b2 = Integer.parseInt(b);
		if(s2 <= 0){
			JOptionPane.showMessageDialog(null, "Error, please make sure your entered base length is not less than 0");
			System.exit(0);
		}
		if(b2 <= 0){
			JOptionPane.showMessageDialog(null, "Error, please make sure your entered height is not less than 0");
			System.exit(0);
		}
		double s3 = s2 * b2;	
		JOptionPane.showMessageDialog(null, s3 + " is the area of your rectangle");
		System.exit(0);
	}
	if(a2 == 5){
	String s = JOptionPane.showInputDialog("Enter the height of your trapezoid");
	String b1 = JOptionPane.showInputDialog("Enter the first base length of your trapezoid");
	String b2 = JOptionPane.showInputDialog("Enter the second base length of your trapezoid");
	double s2 = Integer.parseInt(s); 
	double b3 = Integer.parseInt(b1);
	double b4 = Integer.parseInt(b2);
	if(s2 <= 0){
		JOptionPane.showMessageDialog(null, "Error, please make sure your entered height is not less than 0");
		System.exit(0);
	}
	if(b3 <= 0){
		JOptionPane.showMessageDialog(null, "Error, please make sure your entered first base length is not less than 0");
		System.exit(0);
	}
	if(b4 <= 0){
		JOptionPane.showMessageDialog(null, "Error, please make sure your entered second base length is not less than 0");
		System.exit(0);
	}
	
	double base = (b3 + b4)/2; 
	double s3 = base * s2;	
	JOptionPane.showMessageDialog(null, s3 + " is the area of your trapezoid");
	System.exit(0);
	}
JOptionPane.showMessageDialog(null, "Error, please make sure you entered a number between 1 and 5");














}
}
