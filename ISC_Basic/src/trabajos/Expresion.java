package trabajos;

import java.util.Scanner;

public class Expresion {

	public static void main(String[] args) {
		int a,b;
		Scanner in = new Scanner(System.in);
		System.out.println("ingresa el valor de A ");
		a =in.nextInt();
		System.out.println("ingresa el valor de B ");
		b=in.nextInt();
		System.out.println("el valor c es: "+67*b+a*b*(a-b+4*a*b)+23*a);

	}

}
