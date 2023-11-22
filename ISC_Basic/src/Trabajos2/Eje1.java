package Trabajos2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Eje1 {

	public static void main(String[] args) {
	    String d;
		Scanner in = new Scanner(System.in);
		d=JOptionPane.showInputDialog("inserte el dia de la semana:");
		switch (d.toLowerCase())
		{
		case "lunes":
		JOptionPane.showMessageDialog(null,"este dia toca matematicas");break;
		case "martes":
			JOptionPane.showMessageDialog(null,"este dia toca investigacion");break;
		case "miercoles":
			JOptionPane.showMessageDialog(null,"este dia toca artes");break;
		case "jueves":
			JOptionPane.showMessageDialog(null,"este dia toca ciencias");break;
		case "viernes":
			JOptionPane.showMessageDialog(null,"este dia toca Historia");break;
		case "sabado":
		case "domingo":
			JOptionPane.showMessageDialog(null,"este dia no hay clases");break;
			default: 
				JOptionPane.showMessageDialog(null,"opcion invalida","error !!!!!",JOptionPane.ERROR_MESSAGE);

		}
	}

}
