package repaso;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,m=0;
Scanner in = new Scanner(System.in);
System.out.println("Inserte numeros positivos para terminar negativo: ");
n=in.nextInt();
while(n>=0)
{
	if (n>m)
		m=n;
		System.out.println("ingresa valor: ");
		n=in.nextInt();
		System.out.println("el numero mayor es: "+m);
	}
	}

}
