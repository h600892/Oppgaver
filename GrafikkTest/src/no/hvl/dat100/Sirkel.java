package no.hvl.dat100;

import easygraphics.*;

public class Sirkel extends EasyGraphics {
	
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		launch(args);
	}
	
	public void run(){
	
		makeWindow("Sirkel", 200, 100);
		drawCircle(50, 25, 15);
		drawCircle(50, 55, 15);
	
	
	}

}
