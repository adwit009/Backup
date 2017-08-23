package day1;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class NimGame {
public static void main(String[] args) throws Exception {
	int a = 5;
	int b = 5;
	int c = 5;
	

	Scanner keyboard = new Scanner(System.in);



System.out.println("Welcome to a new game to Nim");
String p1 = JOptionPane.showInputDialog("Player 1, please enter your name:");
String p2 = JOptionPane.showInputDialog("Player 2, please enter your name:");
System.out.println("The game is simple. There are 3 piles with 5 tokens each. ");
System.out.println("When it is your turn, you will pick a pile and remove a number \nof tokens that will range from 1 to the total tokens in the pile."
		+ "\nThen the next person will go. The person who picks the last remaining token loses.");
int p11;
while (a + b + c >= 1) {
System.out.println("Pile 1 has "+a+" tokens. \nPile 2 has "+b+" tokens. \nPile 3 has "+c+" tokens");
System.out.println(p1 + " it is your turn to play. Pick a pile (1, 2 , or 3)");


p11 = keyboard.nextInt();
if(p11 == 1){
	System.out.println("How many tokens will you take?");
	int t;
	t = keyboard.nextInt();
a = a-t;
}
if(p11 == 2){
	System.out.println("How many tokens will you take?");
	int f;
	f = keyboard.nextInt();
b = b-f;
}if(p11 == 3){
	System.out.println("How many tokens will you take?");
	int g;
	g = keyboard.nextInt();
c = c-g;
}
if(a+b+c <= 0){
	System.out.println(p1 + " you lose.");
	System.exit(0);
}

System.out.println("Pile 1 has "+a+" tokens. \nPile 2 has "+b+" tokens. \nPile 3 has "+c+" tokens");
System.out.println(p2 + " it is your turn to play. Pick a pile (1, 2 , or 3)");


p11 = keyboard.nextInt();
if(p11 == 1){
	System.out.println("How many tokens will you take?");
	int t;
	t = keyboard.nextInt();
a = a-t;
}
if(p11 == 2){
	System.out.println("How many tokens will you take?");
	int f;
	f = keyboard.nextInt();
b = b-f;
}if(p11 == 3){
	System.out.println("How many tokens will you take?");
	int g;
	g = keyboard.nextInt();
c = c-g;
}





}

System.out.println(p2+"you lose.");



	
	
	
	

   








}
}
