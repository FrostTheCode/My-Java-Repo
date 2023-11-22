package Trabajos2;

import java.util.Scanner;

public class Eje24 {

	public static void main(String[] args) {
		int opc,ed;
		Scanner in = new Scanner(System.in);
		System.out.println("revision de edad");
		System.out.println("ingrese su sexo: \n 1.-hombre, 2.-mujer");
		opc = in.nextInt();
		System.out.println("ingrese su edad: ");
		ed = in.nextInt();
		switch (opc)
		{
		case 1:
			if (ed<=18)
				System.out.println("usted es un hombre menor de edad");
			else
				System.out.println("usted es un hombre mayor de edad");break;
		case 2:
			if (ed<=18)
		System.out.println("usted es una mujer menor de edad");
	else
		System.out.println("usted es una mujer mayor de edad");break;
		
        default:
				System.out.println("dato no valido");break;
		}	
	}

}
