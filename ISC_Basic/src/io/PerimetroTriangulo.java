package io;

import java.util.Scanner;

public class PerimetroTriangulo {

	public static void main(String[] args) {
		// Calculo el perimetro de un triangulo
		int lado;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingresa el valor lado ");
		lado =entrada.nextInt();
		System.out.println("el perimetro de un triangulo es :"+(lado+lado+lado));	

	}

}
