package TrabajosRepeticion;

import java.util.Scanner;

public class Eje25 {

	public static void main(String[] args) {
        numrevez();//eje 25
        numydigi();//eje 26
        multde3();//eje 27
        factorial();//eje 28
        nMayor();//eje29
        DiayHora();//eje 30

	}

	private static void nMayor() {
		    int ng,np,c= 0,s= 0;
		Scanner in=new Scanner (System.in);
		 System.out.print("Introduzca un número entero positivo grande: ");
		    ng=in.nextInt();
		    System.out.print("Introduzca otro número (relativamente pequeño): ");
		    np=in.nextInt();
		    System.out.print("Los números enteros positivos menores que " + ng );
		    System.out.println(" que no son divisibles entre " + np + " son los siguientes:");
		    for (int i = 1; i < ng; i++) {
		      if ((i % np) != 0) 
		      {
		        System.out.print(i + "\t");
		      }
		      }
	}
	private static void factorial() {
		    long f=1;
	        int num;
	        Scanner in = new Scanner(System.in);
	        System.out.print("Introduce un número: ");
	        num=in.nextInt();
	        for (int i=num;i>0;i--)
	        {
	            f=f* i;
	        }
	        System.out.println("El factorial de " + num + " es: " +f);
	}

	private static void multde3() {
		int nI,c=0,s= 0;
		Scanner in = new Scanner(System.in);
		 System.out.print("Introduzca un número entero mayor que 1: ");
          nI=in.nextInt();
		    for (int i=1;i<nI;i++) {
		      if (i%3==0) {
		        System.out.print(i + " ");
		        c++;
		        s+= i;
		      }
		    }
		    System.out.println("Desde 1 hasta " +nI+ " hay " +c);
		    System.out.println(" múltiplos de 3 y suman "+s);
	}

	private static void DiayHora() {
		 Scanner in = new Scanner(System.in);
		    int pD= 0,sD = 0,pH,sH;
		    String pDnombre,sDnombre; String nPD = ""; String nSD = "";
		    boolean Co = true;
		    do {
		      System.out.println("\nPor favor, introduzca la primera hora.");
		      System.out.println("Día: ");
		      pDnombre =in.nextLine();
		      System.out.println("Hora: ");
		      pH =in.nextInt();
		      switch(pDnombre) {
		        case "lunes":
		        case "1":
		          pD = 1;
		          nPD = "lunes";
		          break;
		        case "martes":
		        case "2":
		          pD = 2;
		          nPD = "martes";
		          break;
		        case "miércoles":
		        case "3":
		          pD= 3;
		          nPD = "miercoles";
		          break;
		        case "jueves":
		        case "4":
		          pD = 4;
		          nPD = "jueves";
		          break;
		        case "viernes":
		        case "5":
		          pD = 5;
		          nPD= "viernes";
		          break;
		        case "sábado":
		        case "6":
		          pD = 6;
		          nPD= "sábado";
		          break;
		        case "domingo":
		        case "7":
		          pD= 7;
		          nPD = "domingo";
		          break;
		        default:
		         pD= 0;
		      }
		      
		      System.out.println("\nintroduzca la segunda hora.");
		      System.out.println("Día: ");
		      sDnombre=in.nextLine();
		      System.out.println("Hora: ");
		      sH =in.nextInt();
		      
		      switch(sDnombre) {
		        case "lunes":
		        case "1":
		          sD = 1;
		          nSD = "lunes";
		          break;
		        case "martes":
		        case "2":
		          sD= 2;
		          nSD= "martes";
		          break;
		        case "miércoles":
		        case "3":
		          sD= 3;
		          nSD= "miércoles";
		          break;
		        case "jueves":
		        case "4":
		          sD = 4;
		          nSD= "jueves";
		          break;
		        case "viernes":
		        case "5":
		          sD= 5;
		          nSD = "viernes";
		          break;
		        case "sábado":
		        case "6":
		          sD= 6;
		          nSD= "sábado";
		          break;
		        case "domingo":
		        case "7":
		          sD= 7;
		          nSD= "domingo";
		          break;
		        default:
		          sD= 0;
		      }
		      Co= true;
		      if (sD<=pD) {
		        System.out.println("El segundo día debe ser posterior al primero.");
		        Co=false;
		      }
		      
		      if ((pD==0) || (sD==0)) {
		        System.out.println("valor incorrecto.");
		        System.out.println("los dias son invalidos");
		        Co=false;
		      }
		      
		      if ((pH< 0) || (pH> 23) || (sH < 0) || (sH > 23)) {
		        System.out.println("valor incorrecto.");
		        System.out.println("las horas son incorrecta");
		        Co= false;
		      }
		      
		    } while (!Co);
		    System.out.print("Entre las " + pH + ":00h del " + nPD);
		    System.out.print(" y las " + sH + ":00h del " + nSD);
		    System.out.println(" hay " + (((sD * 24) + sH) - ((pD * 24) + pH)) + " horas.");
		
	}

	private static void numydigi() {
		Scanner in = new Scanner(System.in);
		 System.out.print("Introduzca un número entero: ");
		    int nI=in.nextInt();
		    System.out.print("Introduzca un dígito: ");
		    int d= in.nextInt();
		    System.out.print("Contando de izquierda a derecha, el " +d+ " aparece dentro de " +nI+ " en las siguientes posiciones: ");
		    int n= nI,v= 0,l= 0,p= 1;
		    if (n== 0) {
		      l = 1;
		    }
		    while (n> 0) {
		      v = (v * 10) + (n % 10);
		      n /= 10;
		      l++;
		    } 
		    while (v> 0) {
		      if ((v % 10) == d) {
		        System.out.print(p+ " ");
		      }
		      v/= 10;
		      p++;
		    } 
		    System.out.println();
		
	}

	private static void numrevez() {
		int n;
		Scanner in = new Scanner (System.in);
		System.out.println("inserte un numero");
		n=in.nextInt();
		String num = String.valueOf(n);
		String numeroAlRev="";
		String a="";
		char num2 [] = num.toCharArray();
		for(int i=2;i>=0;i--)
		{
		a=Character.toString(num2[i]);
		numeroAlRev = numeroAlRev.concat(a);
		}
		int numerofinal = Integer.parseInt(numeroAlRev);
		System.out.println(numerofinal);
		}
		
	}

