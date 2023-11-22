package io;

import java.util.Scanner;

public class AreaPoligono {

	public static void main(String[] args) {
		// Calculo el area de un poligono
		int perimetro, apotema;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingresa el valor perimetro ");
		perimetro =entrada.nextInt();
		System.out.println("ingresa el valor apotema ");
		apotema =entrada.nextInt();
		System.out.println("el area de un poligono es :"+(perimetro*apotema)/2);

	}

}
