package Repeticion;

import java.util.Scanner;

public class TablaDeMultiplicacion {

	public static void main(String[] args) {
		//tabla de multiplicar
		int tabla;
		Scanner in = new Scanner(System.in);
		System.out.println("*************Tabla de Multiplicar************");
		System.out.println("ingresa la tabla a mostrar");
		tabla=in.nextInt();
		System.out.println("/////////es la tabla de "+tabla+" ///////////// ");
		for(int i=1;i<=10;i++) {
			System.out.println(tabla+"* "+i+" = "+(tabla*i));
		}
	
	}

}
