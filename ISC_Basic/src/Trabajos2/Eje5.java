package Trabajos2;

import java.util.Scanner;

public class Eje5 {

	public static void main(String[] args) {
		int a,b;
		Scanner in = new Scanner(System.in);
        System.out.println("ingresa el numero A: ");
        a=in.nextInt();
        System.out.println("ingresa el numero B: ");
        b=in.nextInt();
        if ( a*b == 0)
        	System.out.println("el resultado es correcto");
        else {
        System.out.println("la operacion es incorrecta");
        }
	}

}
