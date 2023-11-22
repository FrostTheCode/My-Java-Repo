package trabajos;

import java.util.Scanner;

public class Exprecion2 {

	public static void main(String[] args) {
		int x,y;
		Scanner in = new Scanner(System.in);
		System.out.println("ingresa el valor x: ");
		x = in.nextInt();
		System.out.println("ingresa el valor y: ");
        y = in.nextInt();
        System.out.println("los valores son: "+"X "+x+" Y "+y);
        System.out.println("el resultado es: "+(Math.pow(x,y+5)-Math.sqrt(y+4*x*y)/x-y));
	}

}
