package Asosioacion;

import javax.swing.JOptionPane;

public class pesoEuro {
	public void mxeur()
	{
		double pesos, euro=0.048,total;
        pesos=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa cantidad de pesos"));
        total=pesos*euro;
        JOptionPane.showMessageDialog(null, "La cantidad en Euros es: "+total);

	}

}
