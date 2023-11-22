package Trabajos2;

import java.util.Scanner;

public class Eje6 {

	public static void main(String[] args) {
		int h;
	    double g = 9.81;
		Scanner in = new Scanner(System.in);
		System.out.println("ingrese la altura");
		h = in.nextInt();
		System.out.println("el tiempo que tarda es: "+Math.sqrt((2*h*g)));
		

	}

}
