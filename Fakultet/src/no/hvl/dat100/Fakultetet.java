package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import static java.lang.Integer.*;

public class Fakultetet {

	public static void main(String[] args) {
		String tallTxt = showInputDialog("Et heltall:");
		int input = parseInt(tallTxt);
		
		double sum = 1;
		for (double i = input; i > 0; i--) {
			sum *= i;
		}
		showMessageDialog(null, sum );
	
		
		

		
	}
	

}
