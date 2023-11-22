package repaso;

import java.util.Scanner;

public class MayorQue0Par {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner (System.in);
		System.out.println("Escribe un numero: ");
		n=in.nextInt();
		if (n>0)
			System.out.print("el numero "+n+ " es mayor que cero");
		else
			System.out.print("el numero "+n+" no es mayor que ");
		if((n%2)==0)
			System.out.print(" y es un numero par");
		else 
			System.out.print(" y es un numero impar");
	}

}
