package io;

import java.util.Scanner;

public class PerimetroRombo {

	public static void main(String[] args) {
		// Calculo el perimetro de un rombo 
		int lado;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingresa el valor lado ");
		lado =entrada.nextInt();
		System.out.println("el perimetro de un rombo es :"+(lado+lado+lado+lado));

	}

}
