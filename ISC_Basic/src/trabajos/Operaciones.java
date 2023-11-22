package trabajos;

import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		int numeroUno;
		int numeroDos;
		Scanner entrada = new Scanner(System.in); 
		System.out.println("inserta el Primer Numero:");
		numeroUno =entrada.nextInt();
		System.out.println("inserta el Segundo Numero:");
		numeroDos =entrada.nextInt();
		System.out.println("La suma es:"+(numeroUno+numeroDos));
		System.out.println("La resta es:"+(numeroUno-numeroDos));
		System.out.println("La multiplicacion es:"+(numeroUno*numeroDos));
		System.out.println("La divicion es:"+(numeroUno/numeroDos));
	}

}
