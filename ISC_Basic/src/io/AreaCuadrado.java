package io;

import java.util.Scanner;

public class AreaCuadrado {

	public static void main(String[] args) {
		// Calcula el area de un cuadrado
		int lado;
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingresa el valor lado ");
		lado =entrada.nextInt();
		System.out.print("El area de un cuadrado es :"+(lado*lado));
		

	}

}
