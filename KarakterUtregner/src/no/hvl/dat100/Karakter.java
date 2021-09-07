package no.hvl.dat100;

import java.util.Scanner;

public class Karakter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i<10; ++i) {
			grade();
		}
	}
	private static void grade() { 
	Scanner scanner = new Scanner(System.in);
	
		System.out.println("Antall poeng");
		int poeng = scanner.nextInt();
		
		if( poeng < 0 || poeng > 101) {
			System.out.println("Ugyldig verdi");
			grade();
			return;
		}
		
		
		else if (poeng < 39){
			System.out.println ("Du fikk karakteren F");
		}
		else if (poeng < 49){
			System.out.println ("Du fikk karakteren E");
		}
		else if (poeng < 59){
			System.out.println ("Du fikk karakteren D");		
		}
		else if (poeng < 79){
			System.out.println ("Du fikk karakteren C");
		}
		else if (poeng < 89){
			System.out.println ("Du fikk karakteren B");
		}
		else if (poeng < 100){
			System.out.println ("Du fikk karakteren A");
		}
	
	}
}



