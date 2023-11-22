package trabajos;

import java.util.Scanner;

public class Converciones2 {

	public static void main(String[] args) {
		        // 0.01 EUR = 1 Ptas
				int pesetas;
				double euros = 0.006;
				Scanner entrada = new Scanner(System.in);
				System.out.println("ingrese la cantidad de Pesetas:");
				pesetas = entrada.nextInt();
				System.out.println("Esta es la cantidad de Pesetas a Euros:"+(pesetas*euros));

	}

}
