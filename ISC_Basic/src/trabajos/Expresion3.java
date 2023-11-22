package trabajos;

import java.util.Scanner;

public class Expresion3 {

	public static void main(String[] args) {
		int a,b;
		Scanner in = new Scanner(System.in);
		System.out.println("ingresa el valor de A ");
		a =in.nextInt();
		System.out.println("ingresa el valor de B ");
		b=in.nextInt();
		System.out.println("el resultado de la operacion es: "+Math.pow(a+b, 2)/3);

	}

}
