package io;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		//calcula el area de un circulo
		double radio;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el valor del radio ");
		radio = entrada.nextDouble();
		System.out.print("El area de un ciculo es :"+Math.PI*Math.pow(radio, 2));
		

	}

}
