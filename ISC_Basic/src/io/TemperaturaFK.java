package io;

import java.util.Scanner;

public class TemperaturaFK {

	public static void main(String[] args) {
		//convercion de grados Fahrenheit a kelvin
				//K = F - 32 * 5/9
				double gradosK,gradosF;
				Scanner in = new Scanner(System.in);
			System.out.println("Conversion de Grados F-K");
			System.out.print("ingresa el valor en grados F :");
		     gradosF=in.nextDouble();
		     //calcula el valor
		     gradosK=(gradosF-32)*5/9+273.15;
		     System.out.print("Grados fahrenheit equivalen a kelvin :");
		     System.out.println(gradosK);

	}

}
