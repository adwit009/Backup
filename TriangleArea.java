package day1;



import javax.swing.JOptionPane;

public class TriangleArea {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null,"Enter the 3 side lenghts of a triangle. ");
String a	=JOptionPane.showInputDialog("Enter the first. ");
String b = 	JOptionPane.showInputDialog("Enter the second. ");
String c = 	JOptionPane.showInputDialog("Enter the third. ");
int A = Integer.parseInt(a); 
int B = Integer.parseInt(b); 
int C = Integer.parseInt(c); 






double area = A + B  + C;
double s = area/2;
System.out.println(s);
double A1 = s - A;
double B1 = s - B;
double C1 =  s - C;
double total = s * A1 * B1 *  C1;
double y =   Math.sqrt( total);
         //add an error statement if a side is negative of 0 or the triangle is invalid 
if( A<1 || B<1 || C<1) {
	JOptionPane.showMessageDialog(null, "Error, please make sure that none of your side lenghts are less than 1.");
	System.exit(0);

}
if (A+B - 1 < C || C + B -1 < A || C + A -1 < B){
	
JOptionPane.showMessageDialog(null,"Error, invalid side lenghts.");
}
else{	
JOptionPane.showMessageDialog(null, y + " is the area of this triangle.");

}

}
}
