package day1;

public class FloydsTriangle {
public static void main(String[] args) {
	int amountofrows = 9;
	int topnumber = 91;
	int x = 1;
	for (int i = 1; i <amountofrows + 1; i++) {
		for (int j = 0; j < i ; j++) {
			if(x > topnumber){
			System.exit(0);
			}
				System.out.format("% 3d" , x);
			x ++;
		amountofrows ++;
		}
	System.out.println();
	}
}
}
