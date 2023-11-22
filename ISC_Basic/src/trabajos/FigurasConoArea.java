package trabajos;

import java.util.Scanner;

public class FigurasConoArea {

	public static void main(String[] args) {
		//sacar el area de un cono
		int radio,g;
		Scanner in = new Scanner(System.in);
		System.out.println("ingresa el valor de radio ");
		radio =in.nextInt();
		System.out.println("ingresa el valor de g ");
		g=in.nextInt();
		System.out.println("el area de un cono es: "+(Math.PI*radio*g)+(Math.PI*Math.pow(radio, 2)));
	}

}
