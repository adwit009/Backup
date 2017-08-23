package day1;



public class MultiplicationTable {
public static void main(String[] args) {
System.out.println("           Multiplication Table");
System.out.println();
int multipicationTableLenght = 9;
System.out.print("    ");
for (int i = 1; i < multipicationTableLenght + 1; i++) {
	System.out.print("  " +i + " ");
	
} 
System.out.println();
System.out.println("   -------------------------------------");
int linenumber = 1;
int x = 1;
for (int i = 1; i < multipicationTableLenght + 1; i++) {
	System.out.print(i+" | ");
	int nn = 1;
	for (int j = 1; j < multipicationTableLenght+ 1; j++) {
	if (linenumber==4 && nn == 3) {
		System.out.print("    "+j * x+" ");
	}
	else if( linenumber == 3 && nn == 3 ){
		System.out.print("     "+j * x+" ");
	}
	else if (linenumber == 2 && nn == 3){
		System.out.print("     "+j * x+" ");
	}
	else if (linenumber == 2 && nn == 5){
		System.out.print("    "+j * x+" ");
	}
	else{
		System.out.print("   "+j * x+" ");
	}
	nn ++;
	}
	linenumber ++;
	x = x  + 1;
System.out.println();
System.out.println("  |");

}
}                     
}
