package repaso;

import java.util.Scanner;

public class NotaPromedio {

	public static void main(String[] args) {
          String name;
          double scal=0,cal,pro;
          int ncal;
          Scanner in = new Scanner(System.in);
          System.out.println("ingresa el nombre del alumno: ");
          name=in.nextLine();
          System.out.println("ingrese el numero de calificaciones: ");
          ncal=in.nextInt();
          for (int i=1;i<=ncal;i++)
          {
        	  System.out.println("ingresa la calificacion "+i);
        	  cal=in.nextDouble();
        	  scal+=cal;  
          }
            pro=scal/ncal;
            if (pro>=90&& pro<=100)
            	System.out.println("felicidades");
            else if(pro>=81&&pro<=89)
            	System.out.println("sigue intentando");
            else if (pro>=71 && pro<=80)
            	System.out.println("sigue adelante");
            else 
            	System.out.println("felicidades reprobaste >:v");
	}

}
