package trabajos;

import java.util.Scanner;

public class Terreno {

	public static void main(String[] args) {
		int h,a;
		double CPM2 = 3500;
		Scanner in = new Scanner(System.in);
		System.out.println("ingresa el valor h: ");
		h = in.nextInt();
		System.out.println("ingresa el valor a: ");
        a = in.nextInt();
        System.out.println("El costo total del terreno: $"+(h*a)*3500);
		
		
		
	}

}
