package Trabajos2;

import java.util.Scanner;

public class Eje14 {

	public static void main(String[] args) {
		int n,j;
		Scanner in = new Scanner(System.in);
		System.out.println("inserte un numero: ");
		n=in.nextInt();
		System.out.println("seleccione la opcion 1");
		j=in.nextInt();
		switch (j) {
		case 1:
		{
			if (n%2==1)
				System.out.println("es par");
			
			else if (n%5==1)
				System.out.println("es divicible entre 5 ");
			else 
				System.out.println("no registrado");
			  
		  }
		}
		}// fin s
		
		
		

	}


