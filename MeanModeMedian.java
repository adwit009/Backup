package day1;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class MeanModeMedian {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Please enter a number in each of the next 10 panes (one per pane).");
	String n1 = JOptionPane.showInputDialog(null);
	String n2 = JOptionPane.showInputDialog(null);
	String n3 = JOptionPane.showInputDialog(null);
	String n4 = JOptionPane.showInputDialog(null);
	String n5 = JOptionPane.showInputDialog(null);
	String n6 = JOptionPane.showInputDialog(null);
	String n7 = JOptionPane.showInputDialog(null);
	String n8 = JOptionPane.showInputDialog(null);
	String n9 = JOptionPane.showInputDialog(null);
	String n10 = JOptionPane.showInputDialog(null);
	int a1 = Integer.parseInt(n1); 
	int a2 = Integer.parseInt(n2); 
	int a3 = Integer.parseInt(n3); 
	int a4 = Integer.parseInt(n4); 
	int a5 = Integer.parseInt(n5); 
	int a6 = Integer.parseInt(n6); 
	int a7 = Integer.parseInt(n7); 
	int a8 = Integer.parseInt(n8); 
	int a9 = Integer.parseInt(n9); 
	int a10 = Integer.parseInt(n10); 
	
	int[] hi = new int[10];
	hi[0] = a1;
	hi[1] = a2;
	hi[2] = a3;
	hi[3] = a4;
	hi[4] = a5;
	hi[5] = a6;
	hi[6] = a7;
	hi[7] = a8;
	hi[8] = a9;
	hi[9] = a10;
	Arrays.sort( hi );
	
	
	
	
	
	//for mean
	int total = a1 +a2 +a3 +a4 + a5 + a6 + a7 + a8 + a9 + a10; 
	double mean = total/10;
//for median
	int x = hi[4]; 
int y = hi[5];
	double median = (x + y)/2;	
//for range
	int a = hi[0]; 
int b = hi[9];
	int range = b - a;
	//for mode
String answer = JOptionPane.showInputDialog("Please enter what data you would like to see (mean, median, range or all)");

if(answer.equals("mean")){
JOptionPane.showMessageDialog(null, "Your mean is "+ mean+".");}
if (answer.equals("median")) {
	JOptionPane.showMessageDialog(null, "Your median is "+ median+".");

}
if (answer.equals("range")) {
	JOptionPane.showMessageDialog(null, "Your range is "+ range+".");
	
}
if (answer.equals("all")) {
	JOptionPane.showMessageDialog(null, "Your mean is "+ mean+", your range is "+ range+" and your median is "+ median+".");
	
}
}
}


