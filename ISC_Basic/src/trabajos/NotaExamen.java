package trabajos;

import java.util.Scanner;

public class NotaExamen {

	public static void main(String[] args) {
		int nota1;
		int notaF;
		double nota2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("anota la nota 1:");
		nota1 =entrada.nextInt();
		System.out.println("anota la nota final deseada:");
		notaF =entrada.nextInt();
		System.out.println("esta es la nota que ocupas en el segundo examen para sacar la calificacion Final:"+(nota1*2-notaF));

	}

}
