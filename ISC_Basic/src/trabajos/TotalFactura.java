package trabajos;

import java.util.Scanner;

public class TotalFactura {

	public static void main(String[] args) {
		int cantidadAgua;
		int cantidadRefresco;
		int cantidadPan;
		int cantidadCarne;
		int cantidadArroz;
	    double agua = 11.50;
	    double refresco = 2.54;
	    double pan = 6.50;
	    double carne = 79.90;
	    double arroz = 54.20;
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("inserte la cantidad de Agua:");
	    cantidadAgua =entrada.nextInt();
	    System.out.println("inserte la cantidad de Refresco:");
	    cantidadRefresco =entrada.nextInt();
	    System.out.println("inserte la cantidad de Pan:");
	    cantidadPan =entrada.nextInt();
	    System.out.println("inserte la cantidad de Carne:");
	    cantidadCarne =entrada.nextInt();
	    System.out.println("inserte la cantidad de Arroz:");
	    cantidadArroz =entrada.nextInt();
	    System.out.println("el total es: "+((agua*cantidadAgua)+(refresco*cantidadRefresco)+(pan*cantidadPan)+(carne*cantidadCarne)+(arroz*cantidadArroz)));

	}

}
