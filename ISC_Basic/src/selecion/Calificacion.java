package selecion;

import java.util.Scanner;

public class Calificacion {

	public static void main(String[] args) {
		String name;
		int calif;
		Scanner in = new Scanner(System.in);
		System.out.println("ingresa Nombre del estudiante");
		name=in.nextLine();
        System.out.println("ingresa la calificacion del estudiante ");
        calif=in.nextInt();
        System.out.println("el estudiante "+name+"pose la calificacion de:");
        if(calif >= 100) {
        	{
        	System.out.println("su calificacion de "+calif+" es excelente");
        	}
        }
        else if ( calif <= 99 && calif>=80)
        {
        	System.out.println("su calificacion de "+calif+" esta bien");
        }	
        else if (calif <=79 &&  calif>= 70)
        {
        	System.out.println("su calificacion de "+calif+" es suficiente");
        }
        else if (calif < 70)
        {
        	System.out.println("su calificacion de "+calif+" es no aproba");
        }
	}
}
