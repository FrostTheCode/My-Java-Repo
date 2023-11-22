package selecion;

import java.util.Scanner;

public class MayorK {

	public static void main(String[] args) {
		// determina si un numero es multiplo de dos
		int num;
		int num2;
		Scanner in = new Scanner(System.in);
		System.out.println("ingresa el numero 1:");
		num =in.nextInt();
		System.out.println("ingresa el numero 2:");
		num2 =in.nextInt();
		if (num%num2==0) 
			System.out.println(num+" es un multiplo de "+num2);
			else 
				System.out.println(num+" no es multiplo de "+num2);
		

	}

}
