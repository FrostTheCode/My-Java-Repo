package trabajos;

import java.util.Scanner;

public class EquivalenciaExamen {

	public static void main(String[] args) {
		String name;
		int peso,alt;
		Scanner in = new Scanner(System.in);
		System.out.println("ingresa el nombre");
		name = in.nextLine();
		System.out.println("ingresa el valor de alt: ");
        alt = in.nextInt();
        System.out.println("ingresa el valor de peso: ");
        peso = in.nextInt();
        System.out.println("el nombre del alumno: "+name);
        System.out.println("la altura en pulgadas: "+alt*39.37);
        System.out.println("el peso en libras: "+peso*2.2);
	}

}
