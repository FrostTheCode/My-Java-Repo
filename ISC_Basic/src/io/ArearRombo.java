package io;

import java.util.Scanner;

public class ArearRombo {

	public static void main(String[] args) {
		// Calculo el area de un rombo
		int diagonal, diagonalmayor;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingresa el valor diagonal ");
		diagonal =entrada.nextInt();
		System.out.println("ingresa el valor diagonalmayor ");
		diagonalmayor =entrada.nextInt();
		System.out.println("el area de un rombo es :"+(diagonal*diagonalmayor));

	}

}
