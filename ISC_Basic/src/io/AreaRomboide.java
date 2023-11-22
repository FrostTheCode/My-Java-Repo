package io;

import java.util.Scanner;

public class AreaRomboide {

	public static void main(String[] args) {
		// Calculo el area de romboide
		int base, altura;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingresa el valor base ");
		base =entrada.nextInt();
		System.out.println("ingresa el valor altura ");
		altura =entrada.nextInt();
		System.out.println("el area de un Romboide es :"+(base*altura));

	}

}
