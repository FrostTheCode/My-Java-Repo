package Asociacion_Figuras;

import javax.swing.JOptionPane;

public class Rectangulo {
	public void rec()
	{
		double b,h;
		h=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese la altura","perimetro rectangulo",JOptionPane.INFORMATION_MESSAGE));
		b=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese la base","perimetro rectangulo",JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, h+h+b+b,"area rectangulo",JOptionPane.INFORMATION_MESSAGE);
		
		h=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese la altura","Area rectangulo",JOptionPane.INFORMATION_MESSAGE));
		b=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese la base","Area rectangulo",JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, h*b,"area rectangulo",JOptionPane.INFORMATION_MESSAGE);
		
		
		
		

}
}