package Asociacion_Figuras;

import javax.swing.JOptionPane;

public class Circulo {
	public void cir()
	{

		double p,d,a,r2;
		d=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el radio","perimetro circulo",JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, Math.PI*d,"perimetro circulo",JOptionPane.INFORMATION_MESSAGE);
		
		r2=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el radio","area circulo",JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, Math.PI*Math.pow(r2, 2),"area circulo",JOptionPane.INFORMATION_MESSAGE);
		
		
	}

}
