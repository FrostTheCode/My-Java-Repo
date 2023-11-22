package Asociacion_Figuras;

import javax.swing.JOptionPane;

public class Cuadrado {
	public void cuadro()
	{
		double p,a;
		double l;
		l=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el lado","perimetro cuadrado",JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, l+l+l+l,"perimetro cuadrado",JOptionPane.INFORMATION_MESSAGE);
		
		l=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el lado","area cuadrado",JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, l*l,"area cuadrado",JOptionPane.INFORMATION_MESSAGE);
	}

}
