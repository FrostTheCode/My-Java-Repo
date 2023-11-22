package trabajos;

import java.util.Scanner;

public class FigurasPiramideVolumen {

	public static void main(String[] args) {
		int h,area;
		Scanner in = new Scanner(System.in);
		System.out.println("ingresa el valor de perim: ");
        area = in.nextInt();
        System.out.println("ingresa el valor de aplat: ");
        h = in.nextInt();
        System.out.println("el valor de el volumen de una piramide es: "+(area*h)/3);
        
		
	}

}
