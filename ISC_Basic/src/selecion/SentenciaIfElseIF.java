package selecion;
import java.util.Scanner;
public class SentenciaIfElseIF {
public static void main(String[] args) {
		// uso de la sentencia if-else-if
		String name;
		int age;
		Scanner in = new Scanner(System.in);
		System.out.println("ingresa Nombre del estudiante");
		name=in.nextLine();
        System.out.println("ingresa la edad del estudiante ");
        age=in.nextInt();
        if(age >= 18) {
        	{
        	System.out.println("bienvenido a la ingenieria" );
        	System.out.println("ISC");
        	}
        }
        else if(age <= 17 && age>=15)
        {
        	System.out.println("bienvenido a la preparatoria");
        System.out.println("UAZ");
        }	
        else if (age <= 14 && age >=11)
        {
        	System.out.println("Bienvenido a la CQ");
        	System.out.println("Plantel 1");
        }
        else if (age <=10 && age >= 6)
        {
        	System.out.println("Bienvenido a la Primaria");
        	System.out.println("SEP");
        }
        else System.out.println("Bienvenido al prescolar");
        
	}

}
