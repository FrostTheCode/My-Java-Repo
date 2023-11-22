package trabajos;

import java.util.Scanner;

public class Cuadratica {

	public static void main(String[] args) {
           int a;
           int b;
           int c;
           Scanner entrada = new Scanner(System.in);
           System.out.println("inserte el dato a:");
           a =entrada.nextInt();
           System.out.println("inserte el dato b:");
           b =entrada.nextInt();
           System.out.println("inserte el dato c:");
           c =entrada.nextInt();
           System.out.println("el resultado de la formula general positiva es:"+ -b+(Math.sqrt(Math.pow(b,2)-(4*a*c)/2*a)));
          
	}

}
