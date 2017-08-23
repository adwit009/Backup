package day1;

import com.spun.util.database.SQLQuery.FromPart;

public class SquareRootTable {
public static void main(String[] args) {
	System.out.println("                    Square Root Table");
	System.out.print("Number|");
	System.out.print(" ");
	for (int i = 0; i < 10; i++) {
		System.out.print("  ");
		System.out.print(" 0." + i + "| ");
	}
	for (int i = 0; i < 10; i++) {
		System.out.println();
		System.out.println("______|_______|_______|_______|_______|_______|_______|_______|_______|_______|_______|");
		System.out.print( i + ".0   |");
		for (double j = 0; j < 10; j++) {
		
			double j2 = j/10;
			double n = i + j2;
		double n2 =   Math.sqrt(n);
		System.out.format("%.5f", n2);
		System.out.print("|");
		
		
		
		}
			
	}
	
	System.out.println();
	System.out.println("______|_______|_______|_______|_______|_______|_______|_______|_______|_______|_______|");
 

}
}
