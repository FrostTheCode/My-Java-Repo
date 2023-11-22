package repaso;

import java.util.Scanner;

public class Intercambio {

	public static void main(String[] args) {
	 int n1,n2,aux;
	 Scanner in = new Scanner(System.in);
	 System.out.println("escribe el primer numero: ");
	 n1 = in.nextInt();
	 System.out.println("escribe el segundo numero");
     n2 = in.nextInt();
     if (n1 != n2)
     {
    	 aux = n1;
    	 n1=n2;
    	 n2=aux;
    	 System.out.println(n1+" & "+n2);
     }
     else
    	 System.out.println("numeros iguales, no hay intercambio");
	}

}
