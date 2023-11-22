package metodos;

import java.util.Random;
import java.util.Scanner;

public class parimpar0 {

	public static void main(String[] args) {
		capturadatos();

	}

	private static void capturadatos() {
		int c;
		Scanner in = new Scanner(System.in);
		System.out.println("cuantos numeros deseas generar: ");
		c=in.nextInt();
		generar(c);
		
	}

	private static void generar(int x) {
		int sp=0,p=0,sim=0,ip=0,nu,ceros=0;
		Random nr=new Random();
		for (int i=1;i<=x;i++)
		{
			nu=nr.nextInt(100);
			if (x>100)
			{
				System.out.println("ingrese una cantidar de numeros menor a 100");
				capturadatos();
			}
			
			else if(x<100)
			{if (nu==0) {
				ceros++;
					
				}
				else if (nu%2==1)
					sim+=nu;
				    ip++;	
				   
			}
			else if (nu%2==0)
			{
					sp+=nu;
					p++;
			}
			imprimepares(sp,p);
			imprimeimpares(sim,ip);
			imprimetotales(p,ip,ceros);
			}
	
			
		}

	private static void imprimetotales(int p, int ip, int ceros) {
		System.out.println("numeros impares generados "+ip);
		System.out.println("numeros impares generados "+p);
		System.out.println("numeros impares generados "+ceros);
		
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

