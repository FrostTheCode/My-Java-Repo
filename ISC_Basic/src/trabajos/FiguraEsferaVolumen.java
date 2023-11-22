package trabajos;

import java.util.Scanner;

public class FiguraEsferaVolumen {

	public static void main(String[] args) {
		int r;
		Scanner in = new Scanner(System.in);
		System.out.println("ingresa el valor de radio ");
		r =in.nextInt();
		System.out.println("el volumen de una esfera es: "+4*Math.PI*Math.pow(r, 3)/3);

	}

}
