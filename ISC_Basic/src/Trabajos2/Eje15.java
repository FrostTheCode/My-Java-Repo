package Trabajos2;

import java.util.Scanner;

public class Eje15 {

	public static void main(String[] args) {
		int opc,opc2;
		Scanner in = new Scanner(System.in);
		System.out.println("piramide de simbolos");
		System.out.println("elija la direccion: ");
		System.out.println("1.-arriba, 2.-abajo, 3.-izquierda, 4.-derecha");
		opc2 = in.nextInt();
        System.out.println("elija el simbolo deseado");
        System.out.println("1.-@, 2.-#, 3.-$, 4.-*, 5.-+");
        opc = in.nextInt();
        switch (opc2)
        {
        case 1:
        	 switch (opc)
             {
             case 1:
             	System.out.println("piramide de @");
             	System.out.println("   @");
             	System.out.println("  @@@");
             	System.out.println(" @@@@@");
             	System.out.println("@@@@@@@");break;
             	
             case 2:
             	System.out.println("piramide de #");
             	System.out.println("   #");
             	System.out.println("  ###");
             	System.out.println(" #####");
             	System.out.println("#######");break;
             	
             case 3:
             	System.out.println("piramide de $");
             	System.out.println("   $");
             	System.out.println("  $$$");
             	System.out.println(" $$$$$");
             	System.out.println("$$$$$$$");break;
             	
             case 4:
             	System.out.println("piramide de *");
             	System.out.println("   *");
             	System.out.println("  ***");
             	System.out.println(" *****");
             	System.out.println("*******");break;
             	
             case 5:
             	System.out.println("piramide de +");
             	System.out.println("   +");
             	System.out.println("  +++");
             	System.out.println(" +++++");
             	System.out.println("+++++++");break;
             	
             	default:
             		System.out.println("opcion no valida");break;
             }
        	
        case 2:
        	 switch (opc)
             {
             case 1:
             	System.out.println("piramide de @");
             	System.out.println("@@@@@@@");
             	System.out.println(" @@@@@");
             	System.out.println("  @@@");
             	System.out.println("   @");break;
             	
             case 2:
             	System.out.println("piramide de #");
             	System.out.println("#######");
             	System.out.println(" #####");
             	System.out.println("  ###");
             	System.out.println("   #");break;
             	
             case 3:
             	System.out.println("piramide de $");
             	System.out.println("$$$$$$$");
             	System.out.println(" $$$$$");
             	System.out.println("  $$$");
             	System.out.println("   $");break;
             	
             case 4:
             	System.out.println("piramide de *");
             	System.out.println("*******");
             	System.out.println(" *****");
             	System.out.println("  ***");
             	System.out.println("   *");break;
             	
             case 5:
             	System.out.println("piramide de +");
             	System.out.println("+++++++");
             	System.out.println(" +++++");
             	System.out.println("  +++");
             	System.out.println("   +");break;
             	
             	default:
             		System.out.println("opcion no valida");break;
             }
        case 3:
        	 switch (opc)
             {
             case 1:
             	System.out.println("piramide de @");
             	System.out.println("   @");
             	System.out.println("  @@");
             	System.out.println(" @@@");
             	System.out.println("@@@@");
             	System.out.println(" @@@");
             	System.out.println("  @@");
             	System.out.println("   @");break;
             case 2:
             	System.out.println("piramide de #");
             	System.out.println("   #");
             	System.out.println("  ##");
             	System.out.println(" ###");
             	System.out.println("####");
             	System.out.println(" ###");
             	System.out.println("  ##");
             	System.out.println("   #");break;
             	
             case 3:
             	System.out.println("piramide de $");
             	System.out.println("   $");
             	System.out.println("  $$");
             	System.out.println(" $$$");
             	System.out.println("$$$$");
             	System.out.println(" $$$");
             	System.out.println("  $$");
             	System.out.println("   $");break;
             	
             case 4:
             	System.out.println("piramide de *");
             	System.out.println("   *");
             	System.out.println("  **");
             	System.out.println(" ***");
             	System.out.println("****");
             	System.out.println(" ***");
             	System.out.println("  **");
             	System.out.println("   *");break;
             	
             case 5:
             	System.out.println("piramide de +");
             	System.out.println("   +");
             	System.out.println("  ++");
             	System.out.println(" +++");
             	System.out.println("++++");
             	System.out.println(" +++");
             	System.out.println(" ++");
             	System.out.println("  +");break;
             	default:
             		System.out.println("opcion no valida");break;
             }
        	
        	
        case 4:
        	 switch (opc)
             {
             case 1:
             	System.out.println("piramide de @");
             	System.out.println("@");
             	System.out.println("@@");
             	System.out.println("@@@");
             	System.out.println("@@@@");
             	System.out.println("@@@");
             	System.out.println("@@");
             	System.out.println("@");break;
             case 2:
             	System.out.println("piramide de #");
             	System.out.println("#");
             	System.out.println("##");
             	System.out.println("###");
             	System.out.println("####");
             	System.out.println("###");
             	System.out.println("##");
             	System.out.println("#");break;
             	
             case 3:
             	System.out.println("piramide de $");
             	System.out.println("$");
             	System.out.println("$$");
             	System.out.println("$$$");
             	System.out.println("$$$$");
             	System.out.println("$$$");
             	System.out.println("$$");
             	System.out.println("$");break;
             	
             case 4:
             	System.out.println("piramide de *");
             	System.out.println("*");
             	System.out.println("**");
             	System.out.println("***");
             	System.out.println("****");
             	System.out.println("***");
             	System.out.println("**");
             	System.out.println("*");break;
             	
             case 5:
             	System.out.println("piramide de +");
             	System.out.println("+");
             	System.out.println("++");
             	System.out.println("+++");
             	System.out.println("++++");
             	System.out.println("+++");
             	System.out.println("++");
             	System.out.println("+");break;
             	default:
             		System.out.println("opcion no valida");break;
             }
        	default:
        		System.out.println("opcion no valida");break;
        }
	}

}
