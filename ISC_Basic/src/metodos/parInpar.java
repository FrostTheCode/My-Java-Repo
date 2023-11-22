package metodos;

import java.util.Random;
import java.util.Scanner;

public class parInpar {

	public static void main(String[] args) {
		captura();
	}

	private static void captura() {
		int c;
		Scanner in = new Scanner(System.in);
		System.out.println("cuantos numeros deseas generar: ");
		c=in.nextInt();
		generar(c);
	}

	private static  void generar(int x) {
		int sp=0,p=0,sim=0,ip=0,nu;
		Random nr=new Random();
		for (int i=1;i<=x;i++)
		{
			nu=nr.nextInt(100);
			if (nu%2==0) {
				System.out.println();
				sp+=nu;
				p++;
			}
			else if (nu%2==1)
				sim+=nu;
			    ip++;
		}
		imprimepares(sp,p);
		imprimeimpares(sim,ip);
	}

	private static void imprimeimpares(int sim, int ip) {
	     System.out.println("sumatoria de numeros impares "+sim);
	     System.out.println("numeros impares generados "+ip);
		
	}

	private static void imprimepares(int sp, int p) {
		 System.out.println("sumatoria de numeros pares "+sp);
		 System.out.println("numeros pares generados "+p);
		
	}
	

}
