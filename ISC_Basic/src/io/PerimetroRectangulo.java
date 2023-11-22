package io;

import java.util.Scanner;

public class PerimetroRectangulo {

	public static void main(String[] args) {
		// Calculo el perimetro de un rectangulo
		int base, altura;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingresa el valor base ");
		base =entrada.nextInt();
		System.out.println("ingresa el valor altura ");
		altura =entrada.nextInt();
		System.out.println("el perimetro de un Rectangulo es :"+(base+base+altura+altura));

	}

}
