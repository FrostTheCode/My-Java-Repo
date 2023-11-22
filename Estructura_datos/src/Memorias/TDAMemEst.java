package Memorias;
import java.util.Arrays;

import javax.swing.JOptionPane;
public class TDAMemEst {

	public static void main(String[] args) {
		int num[]=new int[5];
		int numeros[]=new int [num.length];
		String pala[]=new String[5];
		int i;
		for (i=0;i<5;i++)
		{
			num[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento del indice "+i));
		}
		//
		System.out.println("estos son los numeros originales");
		for (int t=0;t<5;t++) {
	    System.out.print("["+num[t]+"]");
		}
		System.out.println("\n estos son los numeros ordenados");
		Arrays.sort(num);
		for(i=0;i<5;i++)
			System.out.print("["+num[i]+"]");
		//rellenar arreglo pal
		Arrays.fill(pala, "bienvenido a mi fiesta");
		System.out.println("elementos del arreglo pala");
		for (int t=0;t<5;t++) {
		    System.out.print("["+pala[t]+"]");}
		//copiar arreglos
		System.arraycopy(num, 0, num, 0, num.length);
		System.out.println("elementos del arreglo numeros");
		for (int t=0;t<5;t++) {
		    System.out.print("["+numeros[t]+"]");}
	
		}

}
