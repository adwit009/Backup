package day1;

import javax.swing.JOptionPane;

public class FloydSpinnoff {
public static void main(String[] args) {
	int x = 1;
	int numberofrows = 10;

	
			for (int i = 1; i < numberofrows + 1; i++) {
				for (int j = 0; j < i; j++) {
				if(i%2 == 1 && j == 0 )	{
					x = 1;
				}
					System.out.print(x + " ");
				if (x == 0){
					x++;
					}
				
				else if (x == 1){
						x--;
					}
					
					
				}
				
			
			System.out.println();
			}
}
}
