package arreglos;

import java.util.Scanner;

public class PromedioAlumno {

	public static void main(String[] args) {
		String n;
		int []c=new int [5];
		int nc=0,s=0;
		Scanner in = new Scanner (System.in);
		System.out.println("ingrese el nombre del estudiante:");
		n=in.nextLine();
		do {//validamos numero de calificaciones validas 1-5
		System.out.println("ingrese el numero de calificaciones (1-5) : ");
		nc=in.nextInt();
		}while (nc<1 || nc>5);//capturando las calificaciondes el || es or y obtrnemos la sumatoria
		for (int i=0;i<nc;i++)
		{
			System.out.println("ingresa la calificacion "+(i+1));
			c[i]=in.nextInt();//se guardan las calificaciones en el arreglo
			s+=c[i];
		}
		//imprime las calificaciones del alumno que estan en el arreglo 
		System.out.println("las calificaciones de "+n);
		for (int j=0;j<=nc;j++)
			System.out.println(c[j]+"\t");
		System.out.println("\n el promedio de "+n+" es: "+(s/nc));
				
		

	}

}
