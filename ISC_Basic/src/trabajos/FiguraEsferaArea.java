package trabajos;

import java.util.Scanner;

public class FiguraEsferaArea {

	public static void main(String[] args) {
		int r;
		Scanner in = new Scanner(System.in);
		System.out.println("ingresa el valor de radio ");
		r =in.nextInt();
		System.out.println("el area de una esfera es: "+4*Math.PI*r);

	}

}
