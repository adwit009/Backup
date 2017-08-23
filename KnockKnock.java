package day1;

import javax.swing.JOptionPane;

public class KnockKnock {
public static void main(String[] args) {
	JOptionPane.showInputDialog("Knock Knock");
 JOptionPane.showInputDialog("Who"); 
	 JOptionPane.showInputDialog("You sound like an owl");
	 
	 JOptionPane.showInputDialog("Knock Knock");
JOptionPane.showInputDialog("orange"); 
JOptionPane.showInputDialog("banana");	
 
String hi = JOptionPane.showInputDialog("I have 2 mouths, 6 eyes and 3 noses, what am I"); 
 if( hi.equals("ugly")){
JOptionPane.showMessageDialog(null,"correct");	 
 
 }
 else {
	 JOptionPane.showMessageDialog(null,"wrong");	 
	 JOptionPane.showMessageDialog(null,"the correct answer is ugly");	 
 }
	
	
	
	
	
	
	
	
}
}
