package trabajos;

import java.util.Scanner;

public class Equivalencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner in = new Scanner(System.in);
		System.out.println("inserte un numero: ");
		num = in.nextInt();
		System.out.println("valor\t"+"cuadrado\t"+"cubo\t"+"cuarta\t"+"quinta\t"+"sexta\t");
		System.out.print(num+"\t");
		System.out.print(num*num+"\t\t");
		System.out.print(num*num*num+"\t");
		System.out.print(num*num*num*num+"\t");
		System.out.print(num*num*num*num*num+"\t");
		System.out.print(num*num*num*num*num*num+"\t");
	}

}
