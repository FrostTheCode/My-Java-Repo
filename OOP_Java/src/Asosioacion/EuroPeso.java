package Asosioacion;

import javax.swing.JOptionPane;

public class EuroPeso {
	public void eurmx()
	{
		double pesos=20.62, euro,total;
        euro=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa cantidad de euros"));
        total=pesos*euro;
        JOptionPane.showMessageDialog(null, "La cantidad en Pesos es: "+total);

	}

}
