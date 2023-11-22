package Memorias;
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class TDAMemDin {

	public static void main(String[] args) {
		//ArrayList <String> frases =new ArrayList <String>();
		ArrayList <String> cadenas;//creando un objeto de tipo arraylist
		cadenas =new ArrayList<String>();
		String frase,resp;
		do {
			frase=JOptionPane.showInputDialog(null, "ingresa la frase");
			cadenas.add(frase);
			resp=JOptionPane.showInputDialog(null,"debes ingresar otra frase");
		    resp=resp.toUpperCase();
		}while(!resp.equals("NO"));
		//mostrar lo de la cadena
		System.out.println("Frases originales");
		for (int i=0;i<cadenas.size();i++)
		{
			System.out.println(cadenas.get(i));
		}
		//mostrar
		cadenas.set(1, "la que modifique");
		for (int i=0;i<cadenas.size();i++)
		{
			System.out.println(cadenas.get(i));
		}
		cadenas.remove(0);
		
	}

}