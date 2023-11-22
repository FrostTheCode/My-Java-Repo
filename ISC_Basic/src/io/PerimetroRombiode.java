package io;

import java.util.Scanner;

public class PerimetroRombiode {

	public static void main(String[] args) {
		// Calculo el perimetro de un romboide
		int base, altura;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingresa el valor base ");
		base =entrada.nextInt();
		System.out.println("ingresa el valor altura ");
		altura =entrada.nextInt();
		System.out.println("el perimetro de un romboide es :"+(base+base+altura+altura));

	}

}
