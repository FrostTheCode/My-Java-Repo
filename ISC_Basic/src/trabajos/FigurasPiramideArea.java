package trabajos;

import java.util.Scanner;

public class FigurasPiramideArea {

	public static void main(String[] args) {
		int perim,aplat,area;
		Scanner in = new Scanner(System.in);
		System.out.println("ingresa el valor de perim: ");
        perim = in.nextInt();
        System.out.println("ingresa el valor de aplat: ");
        aplat = in.nextInt();
        System.out.println("ingresa el valor de area base: ");
        area = in.nextInt();
        System.out.println("el valor de el area de una piramide es: "+(perim*aplat)/2+area);
        }

}
