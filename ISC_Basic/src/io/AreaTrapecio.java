package io;

import java.util.Scanner;

public class AreaTrapecio {

	public static void main(String[] args) {
		// Calculo el area de un Trapecio
		int base, altura, basemayor;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingresa el valor base ");
		base =entrada.nextInt();
		System.out.println("ingresa el valor base mayor ");
		basemayor =entrada.nextInt();
		System.out.println("ingresa el valor altura ");
		altura =entrada.nextInt();
		System.out.println("el area de un Rectangulo es :"+altura*(base*basemayor)/2);

	}

}
