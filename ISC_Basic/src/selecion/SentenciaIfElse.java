package selecion;

import java.util.Scanner;

public class SentenciaIfElse {

	public static void main(String[] args) {
		// uso de la sentencia If-Else
		String name;
		int calif;
		Scanner in = new Scanner(System.in);
		System.out.println("ingresa Nombre del estudiante");
		name=in.nextLine();
        System.out.println("ingresa calificacion del estudiante ");
        calif=in.nextInt();
        if(calif >= 70) {
        	System.out.println("felicidades "+name+"aprobaste el examen" );
        }
        	else 
        		System.out.println("Reprobaste "+name+"el examen");
        	System.out.println("Programa ejecutado");

	}

}
