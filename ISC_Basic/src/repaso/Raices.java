package repaso;

import java.util.Scanner;

public class Raices {

	public static void main(String[] args) {
		double a,b,c,x1,x2;
		Scanner in = new Scanner(System.in);
		System.out.println("ingresa el valor a");
		a=in.nextDouble();
		System.out.println("ingresa el valor de b");
		b=in.nextDouble();
		System.out.println("ingresa el valor de c");
		c=in.nextDouble();
		if ((b*b)>=(4*a*c))
		{
			x1=(b+Math.sqrt(b*b)-(4*a*c)/2*a);
			x2=(b+Math.sqrt(b*b)-(4*a*c)/2*a);
			System.out.println("las raices reales son : "+x1+" & "+x2);
		}
		else 
			System.out.println("no existe raices reales");
	}

}
