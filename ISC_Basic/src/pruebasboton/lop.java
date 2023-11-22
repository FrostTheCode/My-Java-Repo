package pruebasboton;

import javax.swing.JOptionPane;

public class lop {
	public void mx()
	{
		int dolar=20,peso;
		peso = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de pesos que desea intercambiar"));
		JOptionPane.showMessageDialog(null, "los dolares que resibe son: "+(peso/dolar)); 
	}

}
