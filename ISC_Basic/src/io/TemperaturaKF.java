package io;

import java.util.Scanner;

public class TemperaturaKF {

	public static void main(String[] args) {
		//convercion de grados centigrados a farhenha
				//F = K - 273.15 *9/5 + 32
				double gradosK,gradosF;
				Scanner in = new Scanner(System.in);
			System.out.println("Conversion de Grados K-F");
			System.out.print("ingresa el valor en grados K :");
		     gradosK=in.nextDouble();
		     //calcula el valor
		     gradosF=(gradosK-273.15)*9/5+32;
		     System.out.print("Grados Kelvin equivalen a fahrenheit :");
		     System.out.println(gradosF);

	}

}
