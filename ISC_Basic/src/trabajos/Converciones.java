package trabajos;

import java.util.Scanner;

public class Converciones {

	public static void main(String[] args) {
		// 1 EUR = 166.39 Ptas
		int euros;
		double pesetas = 166.39 ;
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese la cantidad de Euros:");
		euros = entrada.nextInt();
		System.out.println("Esta es la cantidad de Euros a Pesetas:"+(euros*pesetas));

	}

}
