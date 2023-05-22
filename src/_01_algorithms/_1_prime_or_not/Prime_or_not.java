package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Prime_or_not {


public static void main(String[] args) {
	
String num = JOptionPane.showInputDialog("Choose a number");
int number = Integer.parseInt(num);
for(int i=2; i<number; i++) {
	if (number%i==(0)) {
		JOptionPane.showMessageDialog(null, "the number is not prime");
		System.exit(0);
	}
	
}
JOptionPane.showMessageDialog(null, "the number is prime");	  
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}