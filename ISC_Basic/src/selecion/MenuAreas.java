package selecion;

import java.util.Scanner;

public class MenuAreas {

	public static void main(String[] args) {
		// Menu Areas
		int opc,radio,base,alt,lado;
		Scanner in= new Scanner(System.in);
		System.out.println("******Menu Areas*********");
		System.out.println("1.-Circulo");
		System.out.println("2.-Rectangulo");
		System.out.println("3.-Triangulo");
		System.out.println("4.-Cuadrado");
		System.out.println("5.-Salir");
		System.out.println("Seleccionar opcion");
		opc =in.nextInt();
		switch (opc)
		{
		case 1:
		{System.out.println("ingrese el valor del radio");
		radio=in.nextInt();
		System.out.println("el area de un circulo es:"+Math.PI*Math.pow(radio, 2));
		}
			break;
		case 2:
		{System.out.println("ingrese el valor de base");
		base=in.nextInt();
		System.out.println("ingrese el valor de altura");
		alt=in.nextInt();
		System.out.println("el area del rectangulo es:"+base*alt);
		}
			break;
		case 3:
		{System.out.println("ingrese el valor de base");
		base=in.nextInt();
		System.out.println("ingrese el valor de altura");
		alt=in.nextInt();
		System.out.println("el area del rectangulo es:"+base*alt/2);	
		}
			break;
		case 4:
			System.out.println("ingrece el valor lado:");
			lado =in.nextInt();
			System.out.println("el area de un cuadrado es: "+lado*lado);
			break;
		case 5:
		{System.out.println("see you!!!!!!");}
			break;
        default:
        	System.out.println("no puedo ayudarte :)");
		}//fin del programa		
	}

}
