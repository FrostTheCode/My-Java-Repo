package io;

import java.util.Scanner;

public class TemperaturaFC {

	public static void main(String[] args) {
		//convercion de grados fahrenheit a centigrados
				//C = F *9/5 - 32
				double gradosC,gradosF;
				Scanner in = new Scanner(System.in);
			System.out.println("Conversion de Grados F-C");
			System.out.print("ingresa el valor en grados F :");
		     gradosF=in.nextDouble();
		     //calcula el valor
		     gradosC=(gradosF-32)*5/9;
		     System.out.print("Grados Fahrenheit equivalen a Centigrados :");
		     System.out.println(gradosC);

	}

}
