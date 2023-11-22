package trabajos;

import java.util.Scanner;

public class Articulo {

	public static void main(String[] args) {
		String art;
		int cos;
		double uti = .150;
		double im = .15;
		Scanner in = new Scanner(System.in);
		System.out.println("ingresa el articulo");
		art = in.nextLine();
		System.out.println("ingresa el valor de costo: ");
        cos = in.nextInt();
        System.out.println("el producto es: "+art);
        System.out.println("la utilidad es :"+uti+" el impuesto es: "+im+" el precio de venta es: "+((cos*uti)+cos)+((cos*im)+cos));

	}

}
