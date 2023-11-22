package io;

import java.util.Scanner;

public class PerimetroTrapecio {

	public static void main(String[] args) {
		// Calculo el Perimetro de un Trapecio
		int base, basemayor, lado;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingresa el valor base ");
		base =entrada.nextInt();
		System.out.println("ingresa el valor base mayor ");
		basemayor =entrada.nextInt();
		System.out.println("ingresa el valor lado");
		lado =entrada.nextInt();
		System.out.println("el perimetro de un Trapecio es :"+(basemayor+base+lado+lado));

	}

}
