package Repeticion;

import java.util.Scanner;

public class MenuFor {

	public static void main(String[] args) {
		int opc, i;
		Scanner in = new Scanner(System.in);
		System.out.println("*************Menu de Opciones*******");
        System.out.println("1.- Pares");
        System.out.println("2.- Impares");
        System.out.println("3.- Pares 2");
        System.out.println("4.- Impares 2");
        System.out.println("5.- Salir");
        System.out.print("Selecciona la opcion: ");
        opc = in.nextInt();
        switch (opc) {
        case 1:
        {//inmprime los primeros 10 numeros pares
        	for (i=0;i<=20;i+=2)
        	System.out.println(i+"\t");
        }
        	break;
        case 2:
        {//print the first 10 umpar numbers
        	for (i=1;i<=20;i+=2)
        		System.out.println(i+"\t");
        }
        	break;
        case 3:{
        	for (i=0;i<=20;i++) 
        	{
        		if (i%2==0)
        		System.out.println(i+"\t");
        	}
        }
        	break;
        case 4:
        {
        	for (i=0;i<=20;i++) 
        	{
        		if (i%2==0)
        		System.out.println(i+"\t");
        	}
        }
        	break;
        case 5:
        	System.exit(0);
        	break;
        	default:
        		System.out.println("Opcion Incorrecta");
        }//llave para el primer switch Fin
        
        
        
        
	}

}
