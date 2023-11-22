package trabajos;

import java.util.Scanner;

public class Costo {

	public static void main(String[] args) {
		String des;
		int NUP;
		double CDM = 3.5;
		double CF = 10700;
		Scanner in = new Scanner(System.in);
		System.out.println("ingresa la descripcion");
		des = in.nextLine();
		System.out.println("ingresa el valor de NUP: ");
        NUP = in.nextInt();
        System.out.println("el producto es: "+des);
        System.out.println("el costo es: "+(NUP*CDM)+CF);

	}

}
