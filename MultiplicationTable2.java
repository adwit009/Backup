package day1;



public class MultiplicationTable2 {
public static void main(String[] args) {
System.out.println("           Multiplication Table"); //print title
System.out.println();
int multipicationTableLenght = 9; // set length
System.out.print("    ");
for (int i = 1; i < multipicationTableLenght + 1; i++) {
	System.out.print("   " +i + " "); // print x axis
	
} 
System.out.println();
System.out.println("   ----------------------------------------------");//print x axis divider

int x = 1;
for (int i = 1; i < multipicationTableLenght + 1; i++) {
	System.out.print(i+" | "); // print beginning of a row 

	for (int j = 1; j < multipicationTableLenght+ 1; j++) {
	
	int jx = j * x; // create variable for next number in the row
	if (jx-10<0) {                                   // the next few if and else if statements check
		System.out.print("   "+jx+" ");              // if the number is in the ones, tens or hundreds
		}	                                         // then it accordingly adds an amount of spaces
	else if(jx - 100 <  0){                          // this is done to make the chart even and neat
		System.out.print("  "+jx+" ");
	}
	else if(jx - 1000 < 0){
		System.out.print(" "+jx+" ");
	}

	
	}

	x = x  + 1; 
System.out.println();   // goes to next line
System.out.println("  |");// adds a section to the y axis for spacing and neatness

}


}                     
}
