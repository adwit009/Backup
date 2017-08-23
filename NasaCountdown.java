package day1;

import javax.swing.JOptionPane;

public class NasaCountdown {
	public static void main(String[] args) {
		// 2. ask the user when to start (JOptionPane.showInputDialog)
		String a = JOptionPane.showInputDialog("where do i start the count down?");
		// 3. convert the user's answer to an int (Integer.parseInt)
int x = Integer.parseInt(a);
		// 4. countdown from user's starting point
for (; x > 0; x--) {
	speak(x + "");	
}
speak("blastoff");		// 1. countdown from 10 to 0

		// 5. when the counting is done, print "blastoff!"
	}

static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
  }
}

