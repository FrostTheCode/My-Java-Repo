package io;

import java.util.Scanner;

public class CircunferenciaCirculo {

	public static void main(String[] args) {
		// Calculo la circunferencia de un circulo
		int diametro;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingresa el valor diametro ");
		diametro =entrada.nextInt();
		System.out.println("el circunferencia de un circulo es :"+(Math.PI*diametro));

	}

}
