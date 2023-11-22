package selecion;

import java.util.Scanner;

public class HabiIInabil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int dia;
         Scanner in = new Scanner(System.in);
         System.out.println("ingrese el numero de dia deseado dia deseado:");
         dia = in.nextInt();
         switch (dia) {
         case 1 :
       	  System.out.println("el dia es habil");break;
         case 2 :
       	  System.out.println("el dia es inabil");break;
       	  default:
       		  System.out.println("valor no registrado");
		
		
         }
		
	}

}
