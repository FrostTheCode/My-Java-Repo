package selecion;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int dia;
          Scanner in = new Scanner(System.in);
          System.out.println("ingrese el numero de dia deseado dia deseado:");
          dia = in.nextInt();
          switch (dia) {
          case 1 :
        	  System.out.println("el dia es domingo");break;
          case 2 :
        	  System.out.println("el dia es lunes");break;
          case 3 :
        	  System.out.println("el dia es martes");break;
          case 4 :
        	  System.out.println("el dia es miercoles");break;
          case 5 :
        	  System.out.println("el dia es jueves");break;
          case 6 :
        	  System.out.println("el dia es viernes");break;
          case 7 :
        	  System.out.println("el dia es sabado");break;
       	  
        	 default:
        		 System.out.println("el dia no exsiste:");break;
          }
  }
}


