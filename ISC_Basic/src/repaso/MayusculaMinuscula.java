package repaso;

import java.util.Scanner;

public class MayusculaMinuscula {

	public static void main(String[] args) {
		int c;
		char car;
		Scanner in = new Scanner (System.in);
		System.out.println("Escribe una letra: ");
		car=in.next().charAt(0);
		c=(int)car;
		if (car>=97&&car<=122)
			System.out.println("la letra es minuscula");
		else if (car>=65&&car<=90)
			System.out.println("la letra es mayuscula");
		else if (car>= 48 && car<=57)
			System.out.println("es un numero");
		else
			System.out.println("no valido, es un simbolo");
	}

}
