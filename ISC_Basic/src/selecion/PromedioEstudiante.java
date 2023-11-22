package selecion;

import java.util.Scanner;

public class PromedioEstudiante {

	public static void main(String[] args) {
		//declarar calificaciones enteras
		int c1,c2,c3,c4,c5,promedio;
		String name;
		Scanner in = new Scanner(System.in);
		System.out.println("inserte el nombre del alumno: ");
		name = in.nextLine();
		System.out.println("inserte la primera calificacion: ");
		c1=in.nextInt();
		System.out.println("inserte la segunda calificacion: ");
		c2=in.nextInt();
		System.out.println("inserte la tercera calificacion: ");
		c3=in.nextInt();
		System.out.println("inserte la cuarta calificacion: ");
		c4=in.nextInt();
		System.out.println("inserte la quinta calificacion: ");
		c5=in.nextInt();
		promedio= (c1+c2+c3+c4+c5)/5;
		switch(promedio)
		{ 
		case 100:
			System.out.println(name+" tienes calificacion excelente");break;
		case 90:
			System.out.println(name+" tienes calificacion buena");break;
		case 80:
			System.out.println(name+" tienes calificacion regular");break;
		case 70:
			System.out.println(name+" tienes calificacion suficiente");break;
			default:
				System.out.println(name+" tienes calificacion no aprobatoria");break;
		
		}
		

	}

}
