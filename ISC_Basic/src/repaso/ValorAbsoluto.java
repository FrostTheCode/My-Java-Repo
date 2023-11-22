package repaso;

import java.util.Scanner;

public class ValorAbsoluto {

	public static void main(String[] args) {
	

		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("escribe la calificacion del alumno: ");
		n = in.nextInt();
		if (n<0)
			n=Math.abs(n);
			System.out.println("el valor absoluto es " + n);
	}

}