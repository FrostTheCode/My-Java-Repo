package io;

import java.util.Scanner;

public class PerimetroPoligono {

	public static void main(String[] args) {
		// Calculo el perimetro de un poligono
		int lado, numerolados;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingresa el valor lado ");
		lado =entrada.nextInt();
		System.out.println("ingresa el valor numerolados ");
		numerolados =entrada.nextInt();
		System.out.println("el perimetro de un poligono es :"+(lado*numerolados));

	}

}
