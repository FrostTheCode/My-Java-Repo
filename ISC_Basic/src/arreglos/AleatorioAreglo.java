package arreglos;

import java.util.Random;

public class AleatorioAreglo {

	public static void main(String[] args) {
		// inicializa un arreglo con numeros random
		//tipo [] nombre = new int[tamano]
		int [] ar = new int [10];
		int [] par = new int [10];//guarda los numeros pares
		int [] impar = new int [10];//guarda los numeros impares
		Random nr = new Random ();// objeto random 
		int j=0,k=0,spar=0,simp=0;
		// inicializa el arreglo con numeros random
		for (int i=0;i<ar.length;i++)
		ar[i]=nr.nextInt(100);//rango de random 0-100
		//imprime los datos del arreglo
		System.out.println("el arreglo original");
		for (int i=0;i<ar.length;i++)
		System.out.print(ar[i]+"\t");
		//separa los numeros pares e impares
		for (int i=0;i<ar.length;i++)
		{
			if (ar[i]%2==0)
			{
				par[j]=ar[i];
				spar+=par[j];
				j++;
			}	
			else if (ar[i]%2==1)
			{
				impar[k]=ar[i];
				simp+=impar[k];
				k++;
			}
		}//fin del for
		//imprime los resultados de par
		System.out.println("\n valores de arreglo par");
		for (int i=0;i<j;i++)
			System.out.print(par[i]+"\t");
		//imprime los resultados de impar
		System.out.println("\n valores de arreglo impar");
				for (int i=0;i<k;i++)
				System.out.print(impar[i]+"\t");
        //imprime sumatorias
				System.out.print("\n sumatoria de pares = "+spar);
				System.out.print("\n sumatoria de impares = "+simp);
	}

}
