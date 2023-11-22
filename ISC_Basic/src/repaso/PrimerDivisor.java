package repaso;

import java.util.Scanner;

public class PrimerDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,d=2;
Scanner in=new Scanner(System.in);
System.out.println("escribe un numero");
n=in.nextInt();
while (n%d!=0)
{
	d++;
	}
System.out.println("el primer divisor es "+d);
	}

}
