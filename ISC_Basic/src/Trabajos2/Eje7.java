package Trabajos2;

import java.util.Scanner;

public class Eje7 {

	public static void main(String[] args) {
		int n1,n2,n3;
		Scanner in = new Scanner(System.in);
		System.out.println("inserte la nota 1");
		n1= in.nextInt();
		System.out.println("inserte la nota 2");
		n2= in.nextInt();
		System.out.println("inserte la nota 3");
		n3= in.nextInt();
		System.out.println("el promedio es: "+((n1+n2+n3)/3));
		
	}

}
