package TrabajosRepeticion;

import java.util.Scanner;

public class Eje7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         cajafuerte();//eje 7 
         tablademulti();//eje 8
         digitos();//ejercisio 9
         media();//eje 10
         columnas();//eje 11
         fibonachi();//eje 12
         posinega();//eje 13
         potencia();//eje 14
         numreal();//eje 15
         numprimo();//eje 16
         num100();//eje 17
         nenteros();//eje 18
         piramide();//eje 19
         pirahueca();//eje20
         eje21();// eje 21
         numsum();//eje 23
         numinverso();//
         //eje 24 no
         
	}

	private static void num100() {
		  int nI= 0;
		  Scanner in = new Scanner (System.in); 
		    do {
		      System.out.print("Introduzca un número entero positivo: ");
		      nI = Integer.parseInt(System.console().readLine());
		      
		      if(nI< 0) {
		        System.out.println("El número introducido no es correcto, debe introducir un número positivo.");
		      }
		    } while (nI< 0);
		    int suma=0;
		    for(int i=nI;i<nI+100;i++) {
		      suma+=i;
		    }

		    System.out.println("La suma de los 100 números siguientes a "+nI+" es "+suma);
		  }
	private static void pirahueca() {
		 Scanner in = new Scanner (System.in); 
		  System.out.print("Pintroduzca la altura de la pirámide: ");
		    int aI=in.nextInt();

		    System.out.print("Introduzca el carácter de relleno: ");
		    String r=in.nextLine();
		    int a=1,i=0,eD=aI-1,eI=0;
		    while (a<aI) {
		      for (i=1;i<=eD;i++) {
		        System.out.print(" ");
		      }
		      System.out.print(r);
		      for (i=1;i<eI;i++) {
		        System.out.print(" ");
		      }
		      if (a>1) {
		        System.out.print(r);
		      }
		      System.out.println();
		      a++;
		      eD--;
		      eI+=2;
		    } 
		    for (i=1;i<a*2;i++) {
		      System.out.print(r);
		    }	
	}
	private static void numreal() {
		 Scanner in = new Scanner (System.in); 
		System.out.print("Introduzca un número real como base: ");
	    double b=in.nextDouble();
	    
	    System.out.print("Introduzca un múmero entero como exponente: ");
	    int eF=in.nextInt();
	    double p;
	    int ex;
	        
	    for (int i=1;i<=eF;i++) {
	        
	      p= 1;
	      ex= i;
	      
	      for (int j=0;j<ex;j++) {
	        p*=b;
	      } 
	      System.out.println(b+" ^ "+i+" = "+p);
	    }
	}
	private static void fibonachi() {
		  Scanner in = new Scanner(System.in);
	        int n,fibo1,fibo2,i;
	        do{
	            System.out.print("Introduce numero mayor que 1: ");
	            n = in.nextInt();
	        }while(n<=1);
	        System.out.println("Los " + n + " primeros términos de la serie de Fibonacci son:");

	        fibo1=1;
	        fibo2=1;

	        System.out.print(fibo1 + " ");
	        for(i=2;i<=n;i++){
	             System.out.print(fibo2 + " ");
	             fibo2 = fibo1 + fibo2;
	             fibo1 = fibo2 - fibo1;
	        }
	        System.out.println();
	    }

	private static void numsum() {
		int op,cuo=0;
		Scanner in = new Scanner (System.in);
	{while (cuo>1000);
			
			op=in.nextInt();
			cuo+=op;
	}
			System.out.println("la cantidad sumada es "+cuo);
	}

	private static void piramide() {
		 Scanner in = new Scanner (System.in); 
		 System.out.print("Por favor, introduzca la altura de la pirámide: ");
		    int aI= in.nextInt();
		    System.out.print("Introduzca el carácter de relleno: ");
		    String r=in.nextLine();
		    
		    int p=1,lL=1,e=aI-1;
		    while (p<= aI) {
		      for (int i=1;i<=e;i++) {
		        System.out.print(" ");
		      }
		      for (int i=1;i<=lL;i++) {
		        System.out.print(r);
		      }
		      System.out.println();
		      p++;
		      e--;
		      lL+= 2;
		    }
	}
	private static void nenteros() {
		int i,n1,n2;
		Scanner in = new Scanner (System.in);
		
		System.out.println("ingresa el primer valor");
		n1=in.nextInt();
		System.out.println("ingresa el segundo valor");
		n2=in.nextInt();
		if (n1<n2)
		for( i=n1;i<=n2;i++)
			if (i%7==0)
			System.out.println(i+"\t");
		else if (n1>n2)
			for( i=n2;i<=n1;i++)
				if (i%7==0)
				System.out.println(i+"\t");
	}

	private static void numprimo() {
		Scanner in = new Scanner(System.in);
        int c,n;
 
        System.out.print("Ingresa un numero: ");
        n=in.nextInt();
        c=0;
        for(int i= 1;i<=n;i++)
        {
            if((n%i)== 0)
            {
                c++;
            }
        }
        if(c <= 2)
        {
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
	}

	private static void columnas() {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("inserte el numero deseado");
		n=in.nextInt();
		for (int i=1;i<=5;i++)
		{
			System.out.println(n+"\t"+Math.pow(n, i)+"\t"+Math.pow(n, (i+1)));
		}
		
		
	}

	private static void tablademulti() {
		int t;
		Scanner in = new Scanner(System.in);
		System.out.println("*************Tabla de Multiplicar************");
		System.out.println("ingresa la tabla a mostrar");
		t=in.nextInt();
		for(int i=1;i<=10;i++)
			System.out.println(t+" * "+i+" = "+(t*i));
		
	}

	private static void numinverso() {
		int n,inv=0,rest=0;
		Scanner in = new Scanner(System.in);
		System.out.println("ingresa el numero ");
		n=in.nextInt();
		while(n!=0)
		{
			rest=n%10;
			inv=inv*10+rest;
			n=n/10;
		}
		System.out.println("inverso es "+inv);
	}

	private static void eje21() {
		int n=0,tn=0,mp,cont=0;
		Scanner in = new Scanner(System.in);
		while(n<0)
		{
			System.out.println("ingresa un numero");
			n=in.nextInt();
			if(n%2==0)
			{
				tn+=n;
				cont++;				
			}
		}
		System.out.println("numeros ingresados= "+cont);
		System.out.println("la media es= "+tn/cont);
	}

	private static void potencia() {
		int  b,e,result=0;
		Scanner in = new Scanner (System.in);
		System.out.println("ingresa el valor de la base");
		b=in.nextInt();
		System.out.println("ingresa el valor del expoente");
		e=in.nextInt();
		for (int i=1;i<=e;i++)
		{
			result*=b;
		}
		System.out.println("valor del exponente igual: "+result);
	}

	private static void posinega() {
		int n,p=0,ne=0;
		Scanner in = new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			System.out.println("ingresa el numero: ");
			n=in.nextInt();
			if(n>0)
				p++;
			else
				ne++;
		}
		System.out.println("positivos= "+p);
		System.out.println("negativos= "+ne);
		
	}

	private static void media() {
	   int n,snum=0,tnum=0;
	   Scanner in = new Scanner(System.in);
	   do {
		System.out.println("ingresa el numero");
		n=in.nextInt();
		snum+=n;
		tnum++;
		}while(n<0); System.out.println("la media es "+(snum/tnum));
	   }
	   
	   
		
	

	private static void digitos() {
		int n,tmp;
		Scanner in = new Scanner(System.in);
		System.out.println("ingrese el numero ");
		n=in.nextInt();
		tmp=(int)Math.log10(n);
		System.out.println("el numero de digitos es "+tmp);
		
	}

	private static void cajafuerte() {
		int c=1234;
		int inte;
		Scanner in = new Scanner(System.in);
		for(int i=1;i<=4;i++)
		{
			System.out.println("ingrese la contrasena");
			inte=in.nextInt();
			if (c==inte) {
				System.out.println("gracias pos el uso de la caja");
			break;
		}
			else
				System.err.print("clave incorrecta en tu intento "+i);
		}
		
	}

}
