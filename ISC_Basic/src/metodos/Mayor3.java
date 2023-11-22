package metodos;

import java.util.Scanner;

public class Mayor3 {

	public static void main(String[] args) {
		capdatos();
	}

	private static void capdatos() {
		//captura tres valores de tipo entero
		int n1,n2,n3,mayor;
		Scanner in = new Scanner(System.in);
		System.out.println("ingresa el primer valor ");
		n1=in.nextInt();
		System.out.println("ingresa el segundo valor");
		n2=in.nextInt();
		System.out.println("ingresa el tercer valor");
		n3=in.nextInt();
		mayor=calcula(n1,n2,n3);
		System.out.println("el mayor es "+mayor);
	}

	private static int calcula(int x, int y, int z) {
		//determina el mayor de tres
		if (x>y&&x>z)
			return x;
		else if (y>x&&y>z)
			return y;
		else
			return z;
		
	}

}
