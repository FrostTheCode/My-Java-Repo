package Trabajos2;

import java.util.Scanner;

public class Eje21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c1,c2,c3,c4,c5,promedio;
		int rec;
		Scanner in = new Scanner(System.in);
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
		if (promedio>=5)
			System.out.println("el alumno esta aprobado");
		else if (promedio<5)
			System.out.println("cual ha sido el resultado del examen de recuperacion? (apto)=1/(no apto)=2");
		rec=in.nextInt();
		switch (rec)
		{case 1:
			System.out.println("tu nota es de 5");break;
		case 2:
			System.out.println("se mantiene la nota de "+promedio);break;
			}
		
		
		
		
		

	}

}
