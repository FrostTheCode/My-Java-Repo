package selecion;

import java.util.Scanner;

public class IfSimple {

	public static void main(String[] args) {
		//Ejemplo del uso del  if simple
		String name;
		int calif;
		Scanner in = new Scanner(System.in);
		System.out.println("ingresa Nombre del estudiante");
		name=in.nextLine();
        System.out.println("ingresa calificacion del estudiante ");
        calif=in.nextInt();
        if(calif >= 70) {
        	System.out.println("felicidades"+name+"aprobaste el examen" );
        	System.out.println("Programa ejecutado");
        }
	}

}
