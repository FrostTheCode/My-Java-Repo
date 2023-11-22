package io;

import java.util.Scanner;

public class TemperaturaCF {

	public static void main(String[] args) {
		//convercion de grados centigrados a fahrenheit
		//F = c *9/5 + 32
		double gradosC,gradosF;
		Scanner in = new Scanner(System.in);
	System.out.println("Conversion de Grados C-F");
	System.out.print("ingresa el valor en grados C :");
     gradosC=in.nextDouble();
     //calcula el valor
     gradosF=(gradosC*9/5)+32;
     System.out.print("Grados centigrados equivalen a fahrenheit :");
     System.out.println(gradosF);
	}

}
