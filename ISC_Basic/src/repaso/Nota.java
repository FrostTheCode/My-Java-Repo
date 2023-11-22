package repaso;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("escribe la calificacion del alumno: ");
		n = in.nextInt();
		if (n>=9)
			System.out.println("sobresaliente");
		else if (n>=7)
			System.out.println("notable");
		else if (n>=5)
			System.out.println("aprobado");
		else 
			System.out.println("reprobado");

	}

}
