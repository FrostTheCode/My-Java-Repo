package trabajos;

import java.util.Scanner;

public class FigurasCilindroArea {

	public static void main(String[] args) {
		int h,r;
		Scanner in = new Scanner(System.in);
		System.out.println("ingresa el valor de altura ");
		h =in.nextInt();
		System.out.println("ingresa el valor de radio ");
		r=in.nextInt();
		System.out.println("el volumen de un cono es: "+2*Math.PI*r*(h+r));

	}

}
