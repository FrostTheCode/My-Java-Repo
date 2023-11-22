package io;

import java.util.Scanner;

public class AreaTringulo {

	public static void main(String[] args) {
		// Calculo el area de un traiangulo
		int base, altura;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingresa el valor base ");
		base =entrada.nextInt();
		System.out.println("ingresa el valor altura ");
		altura =entrada.nextInt();
		System.out.println("el area de un Triangulo es :"+(base*altura/2));

	}

}
