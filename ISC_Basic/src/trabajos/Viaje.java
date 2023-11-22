package trabajos;

import java.util.Scanner;

public class Viaje {

	public static void main(String[] args) {
		int vel;
		double dis = 183.67;
		Scanner in = new Scanner(System.in);
		System.out.println("inserte la velocidad promedio: ");
		vel = in.nextInt();
		System.out.println("el tiempo del viaje fue: "+dis/vel);
		

	}

}
