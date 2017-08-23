package day1;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
public class JFrame1 extends JFrame implements ActionListener {
	TextField text = new TextField(20);

	public JFrame1() {
	//setLayout(new FlowLayout(FlowLayout.LEFT,10,20));

	setLayout(new GridLayout(3,3,5,5));	
	
	text.setText("0");
	JButton b = new JButton("hi");
	b.addActionListener(this);
	JButton c = new JButton("hi2");
	c.addActionListener(this);
	add(text);
	add(b);
	add(new JButton("1"));
add(new JButton("2"));
add(new JButton("3"));
add(new JButton("4"));
add(new JButton("5"));
add(new JButton("6"));
add(new JButton("7"));
add(new JButton("8"));
add(new JButton("9"));
add(new JButton("+"));
add(new JButton("-"));
add(new JButton("/"));
add(new JButton("*"));

}

	
	public static void main(String[] args) {
	
 JFrame1 hi = new JFrame1();
 hi.setSize(1000,1000);
 hi.setVisible(true);
 	
}
	
	public void actionPerformed(ActionEvent e) {
	    
	    text.setText("Button Clicked times");
	}
}