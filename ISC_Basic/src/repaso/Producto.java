package repaso;

import java.util.Scanner;

public class Producto {

	public static void main(String[] args) {
		int n,p=0;
		Scanner in =new Scanner(System.in);
		System.out.println("escribe un numero: ");
		n=in.nextInt();
		while (n >= 0)
		{
			p+=n;//p=p*n
			System.out.println("escribe un numero: ");
			n=in.nextInt();
		}
		System.out.println("el producto es "+p);

	}

}
