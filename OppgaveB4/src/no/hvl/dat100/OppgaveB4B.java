package no.hvl.dat100;

import java.util.Scanner;




//Lage et program som beregner progresiv skatt på bruttolønn
//Bruker skirver in sin bruttolønn, den blir beregnet og trinnskatten blir skrevet ut

public class OppgaveB4B {

	static double trinn1 = 184000;
	static double trinn2 = 260100;
	static double trinn3 = 651250;
	static double trinn4 = 1021550;
	
	static double trinnSats1 = 0.017;
	static double trinnSats2 = 0.04;
	static double trinnSats3 = 0.132;
	static double trinnSats4 = 0.162;

	
	public static void main(String[] args) {
		
		double tax = 0,intekt;
		Scanner sc = new Scanner(System.in);

		
		
                
        System.out.println("Bruttolønn:");
        
        intekt=sc.nextDouble();
       
  
        if (intekt > trinn1)
        	tax = tax + Math.max(trinn2-trinn1, intekt -trinn1)*trinnSats1;
        	
        if (intekt > trinn2)
        	tax = tax + Math.max(trinn3-trinn2, intekt - trinn2)*trinnSats2;
        if (intekt > trinn3)
        	tax = tax + Math.max(trinn3-trinn4, intekt - trinn3)*trinnSats3;
        if (intekt > trinn4)
        	tax = tax + Math.max(trinn4, intekt - trinn4)*trinnSats4;
    System.out.println("Din trinnskatt er:" + tax + "Kr");
    sc.close();
   
	}
}

