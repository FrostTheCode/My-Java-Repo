package io;

import java.util.Scanner;

public class PerimetroCuadrado {

	public static void main(String[] args) {
		// Calcula el perimetro de un cuadrado
				int lado;
				Scanner entrada = new Scanner(System.in);
				System.out.println("ingresa el valor lado ");
				lado =entrada.nextInt();
				System.out.println("El perimetro de un cuadrado es :"+(lado+lado+lado+lado));
						
	
	}

}
