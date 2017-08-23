package day1;

import org.omg.Messaging.SyncScopeHelper;

import com.spun.util.database.SQLQuery.FromPart;

public class ForLoopGauntlet {
public static void main(String[] args) {
c4();
}
public static void c1(){
for (int i = 0; i < 101; i++) {
System.out.println(i);
}
}
public static void c2(){
for (int i = 100; i >-1; i--) {
System.out.println(i);
}
}
public static void c3(){
for (int i = 2; i < 101; i = i + 2 ) {
System.out.println(i);
}
}
public static void c4(){
for (int i = 1; i < 501; i ++ ) {

	System.out.print(i);
	if(i%2 == 0){
	System.out.println(" even");	
	}
	else{
	System.out.println(" odd");
	
	}
	}


}





public static void c5(){
for (int i = 1; i < 10; i = i +2 ) {
System.out.println(i);
}
}
public static void c6(){
for (int i = 1; i < 10; i = i +2 ) {
System.out.println(i);
}
}
}






































