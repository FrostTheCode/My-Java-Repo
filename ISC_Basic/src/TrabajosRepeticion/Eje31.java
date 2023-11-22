package TrabajosRepeticion;

import java.util.Scanner;

public class Eje31 {

	public static void main(String[] args) {
		DibujaL();//eje 31
		longN();//eje32
		DibujaU();//eje 33
		mezcladN();//eje 34

		
	}

	private static void mezcladN() {  
		long v1 = 0,nI1,nI2; 
		    int l= 0;
		    Scanner in= new Scanner(System.in); 
		  System.out.print("Por favor, introduzca un número: ");
		  nI1=in.nextLong();
		  System.out.print("Introduzca otro número: ");
		  nI2=in.nextLong();
		    long n=nI1;
		    if (n== 0) {
		      l= 1;
		    }
		    
		    while (n> 0) {
		      v1= (v1*10) + (n%10);
		      n /= 10;
		      l++;
		    } 
		    n= nI2;
		    long v2=0;
		    while (n> 0) {
		      v2 = (v2 * 10) + (n% 10);
		      n /= 10;
		    } 
		    long rP= 0,rI = 0;
		    int d;
		    
		    for (int i = 0; i < l; i++) {
		      d = (int)(v1 % 10);
		      if (d % 2== 0) {
		        rP= rP* 10 + d;
		      } else {
		        rI= rI*10+d;
		      }
		      d=(int)(v2%10);
		      if (d% 2== 0) {
		        rP=rP*10+d;
		      } else {
		        rI = rI* 10 + d;
		      }
		      v1 /= 10;
		      v2 /= 10;
		    }
		    System.out.println("El número formado por los dígitos pares es: " + rP);
		    System.out.println("El número formado por los dígitos impares es: " + rI);		
	}

	private static void DibujaU() {
		  int h,i,j;
		  Scanner in= new Scanner(System.in);
		 System.out.print("Introduzca la altura de la U: ");
		     h=in.nextInt();
		    for (i=1;i<h;i++) {
		      System.out.print("* ");
		      for (j=2;j<h;j++) {
		        System.out.print("  ");
		      }
		      System.out.println("*");
		    }
		    System.out.print("  ");
		    for (i=2;i<h;i++) {
		      System.out.print("* ");
		    }

		
	}

	private static void longN() { 
		long nI,v=0;
	    int l=0,d,i,sP=0;
	    Scanner in = new Scanner(System.in);
		System.out.print("Por favor, introduzca un número entero positivo: ");
	   nI=in.nextLong();
	   long n=nI;
	    if (n==0) {
	      l=1;
	    }
	      while (n>0) {
	      v=(v*10)+(n%10);
	      n/=10;
	      l++;
	    } 
	    System.out.print("Dígitos pares: ");
	    for (i=0;i<l;i++) {
	      d=(int)(v%10);
	      if ((d%2)==0) {
	        System.out.print(d+ " ");
	        sP+=d;
	      }
	      v/=10;
	    }
	    System.out.println("\nSuma de los dígitos pares: "+sP);
		
	}

	private static void DibujaL() {
		int h,i;
		Scanner in=new Scanner(System.in);
		System.out.println("introduzca la altura de la L ");
		h=in.nextInt();
		for(i=1;i<h;i++)
		{
			System.out.println("*");
		}
		for (i=0;i<h/2+1;i++)
		{
			System.out.println("* ");
		}
		
	}

}
