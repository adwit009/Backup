package day1;

import java.util.Random;
import java.util.Scanner;

public class EnterPIN
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int hi = 1;

		System.out.println("WELCOME TO THE BANK OF MONEY.");
		System.out.print("ENTER YOUR 1 DIGIT PIN: ");
		int entry = keyboard.nextInt();

		while ( entry != hi )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}


	}
