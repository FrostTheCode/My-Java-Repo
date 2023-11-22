package repaso;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int f=1,n,tmp;
		Scanner in = new Scanner(System.in);
		System.out.println("ingresa un numero: ");
		n=in.nextInt();
	    tmp=n;
		while(n!=0)
		{
			f*=n;
			n--;
		}
		System.out.println("factorial de "+tmp+" es: "+f);

	}

}
