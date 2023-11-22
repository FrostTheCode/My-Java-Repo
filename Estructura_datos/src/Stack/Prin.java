package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Prin {

	public static void main(String[] args) {
		Stack <String>pila=new Stack<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingresa 5 palabras: ");
		for (int i=0;i<5;i++)
		{
			pila.push(sc.next());
		}
		pila.pop();
		pila.pop();
		System.out.println("Elementos de la pila: ");
		while (!pila.isEmpty())
		{
			System.out.println(pila.pop());
		}

	}

}
