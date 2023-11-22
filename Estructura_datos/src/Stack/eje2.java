package Stack;

import java.util.Scanner;
import java.util.Stack;

public class eje2 {

	public static void main(String[] args) {
		Stack<Integer>pila=new Stack<Integer>();
		Scanner in=new Scanner(System.in);
		System.out.println("ingresa cuantos elementos a ingresar: ");
		int tam=in.nextInt();
		System.out.println("agrega los numeros a la pila: ");
		for (int i=0;i<tam;i++)
		{
			pila.push(in.nextInt());
		}
		System.out.println("elementos de la pila: ");
		while(!pila.isEmpty())
		{
			System.out.println((int)pila.pop());
		}

	}

}
