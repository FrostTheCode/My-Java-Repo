package arreglos;

import java.util.Scanner;

public class ArregloPromedio {

	public static void main(String[] args) {
		String name;
		int Scal=0;
		int [] cal=new int [5];
		Scanner in = new Scanner (System.in);
		System.out.println("ingresa el nombre del estudiante");
		name=in.nextLine();
		for (int i=0;i<cal.length;i++)
		{
			System.out.println("ingresa calificacion "+i);
		cal[i]=in.nextInt();
		Scal+=cal[i];
		}
System.out.println("el promedio de "+name+" es igual "+Scal/(cal.length));		

	}

}
