package Repeticion;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ParImpSum {

	public static void main(String[] args) {
		// hacer un programa con un menu de tres opciones
		// opcion 1 pares-> obtener la suma de los primeros numeros 200 pares y mostrarlos en pantalla
		// opcion 2 pares-> obtener la suma de los primeros numeros impares 200 y mostrarlos en pantalla
		// opcion 3 pares-> salir
		// utilice sentencia switch, for, if
		
		int opc;
		opc=Integer.parseInt(JOptionPane.showInputDialog("1.- Pares \n2.- Impares \n3.- salir"));
			switch (opc) {
			case 1:
			{	int sump=0;
				for (int i=0;i<=200;i+=2)
					System.out.println(i+"\t");
				
			} break;
			
			case 2:
			{   int sumi=0;
				for (int i=1;i<=200;i+=2)
				System.out.println(i+"\t");
			} break;
			
			case 3:
				System.exit(0);
				
				default:
					System.out.println("opcion incorrecta \n intente otra opcion");
			}//fin del nintendo
		
	}

}
