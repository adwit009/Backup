package day1;

import javax.swing.JOptionPane;

public class YourAges {
public static void main(String[] args) {
	String hi = JOptionPane.showInputDialog("What is your age");
	
	int g = Integer.parseInt(hi);
	int  g1 = 2017 - g;
for (;g1 < 2017; g1++) {
	

	System.out.println(g1);
g1 = g1++;
}
	












}
}
