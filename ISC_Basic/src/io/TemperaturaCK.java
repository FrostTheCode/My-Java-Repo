package io;

import java.util.Scanner;

public class TemperaturaCK {

	public static void main(String[] args) {
		//convercion de grados centigrados a kelvin
				//K = c + 273.15
				double gradosC,gradosK;
				Scanner in = new Scanner(System.in);
			System.out.println("Conversion de Grados C-K");
			System.out.print("ingresa el valor en grados C :");
		     gradosC=in.nextDouble();
		     //calcula el valor
		     gradosK=(gradosC+273.15);
		     System.out.print("Grados centigrados equivalen a Kelvin :");
		     System.out.println(gradosK);

	}

}
