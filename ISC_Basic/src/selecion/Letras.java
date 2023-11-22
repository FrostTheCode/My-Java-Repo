package selecion;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Letras {

	public static void main(String[] args) {
		// determinar si el caracter capturado corresponde a una vocal o consonante
             String le;
             Scanner in = new Scanner(System.in);
     		le = JOptionPane.showInputDialog("Ingrese la letra");
     		le = le.toLowerCase();
     		switch (le)
     		{
     		case "a":
     		case "e":
     		case "i":
     		case "o":
     		case "u":
     			System.out.println("es una vocal ");break;
     			default:
     			System.out.println("es una consonante ");break;
     			
     		}
     		
     		
     		
     		
     		
	}

}
