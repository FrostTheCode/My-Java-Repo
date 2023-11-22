package metodos;

import java.util.Scanner;

public class Factorial1 {

	public static void main(String[] args) {
       captura();

	}

	private static void captura() {
		int n=0,f;
		Scanner in = new Scanner(System.in);
		System.out.println("inserte los numeros deseados");
		n=in.nextInt();
		f=calculafactorial(n);
		imprimefac(f,n);
	}

	private static void imprimefac(int f, int n) {
		System.out.println("el numero factorial es: "+f+"y el numero es "+n);
		
		
	}

	private static int calculafactorial(int x) {
		int fac=1,tmp=x;
	    while ( x!=0) {
	    	  fac*=x;
	    	  x--;
	    	  
	}
		return fac;

	}
}
