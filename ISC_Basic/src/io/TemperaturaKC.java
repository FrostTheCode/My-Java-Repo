package io;

import java.util.Scanner;

public class TemperaturaKC {

	public static void main(String[] args) {
		//convercion de grados kelvin a centigrados
				//C = K -273.15
				double gradosC,gradosK;
				Scanner in = new Scanner(System.in);
			System.out.println("Conversion de Grados K-C");
			System.out.print("ingresa el valor en grados K :");
		     gradosK=in.nextDouble();
		     //calcula el valor
		     gradosC=(gradosK-273.15);
		     System.out.print("Grados kelvin equivalen a Centigrados :");
		     System.out.println(gradosC);

	}

}
