package Asociacion_Figuras;

import javax.swing.JOptionPane;

public class Triangulo {
	public void Tri()
	{
	    double b,h,r,r2,l;
		l=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el lado","perimetro triangulo",JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, l+l+l,"area triangulo",JOptionPane.INFORMATION_MESSAGE);
		
		
		h=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese la altura","area triangulo",JOptionPane.INFORMATION_MESSAGE));
		b=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese la base","area triangulo",JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, h*b/2,"area triangulo",JOptionPane.INFORMATION_MESSAGE);
	}

}
