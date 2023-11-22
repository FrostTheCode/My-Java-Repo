package trabajos;

import java.util.Scanner;

public class Volumen {

	public static void main(String[] args) {
		// volumen = 1/3PIr2
         int radio;
         Scanner entrada = new Scanner(System.in);
         System.out.println("inserte el radio:");
         radio =entrada.nextInt();
         System.out.println("El volumen es:"+1/3*(Math.PI*Math.pow(radio, 2)));
         
         
	}

}
