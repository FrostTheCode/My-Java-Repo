package io;

import java.util.Scanner;

public class EntradaSalida {

	public static void main(String[] args) {
		// Realiza la suma de dos numeros enteros
		int x, y; //declaro dos variables
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingresa el valor de x :");
		x =entrada.nextInt();//Captura el valor de x
		System.out.println("ingresa el valor de y :");
        y =entrada.nextInt();//Captura el valor de y
        System.out.println("La suma de "+x+" + "+y+" = "+(x+y));
        
        
	}

}
