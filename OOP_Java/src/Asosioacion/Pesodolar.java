package Asosioacion;

import javax.swing.JOptionPane;

public class Pesodolar {
	public void mxusd()
	{
		double pesos, dolar = 18.70,total;
        pesos=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa cantidad de pesos"));
        total=pesos/dolar;
        JOptionPane.showMessageDialog(null, "La cantidad en dolares es: "+total);

	}

}
