package Asosioacion;

import javax.swing.JOptionPane;

public class Eurodolar {
	public void eurusd()
	{
		double dollar=1.10, euro,total;
        euro=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa cantidad de euros"));
        total=dollar*euro;
        JOptionPane.showMessageDialog(null, "La cantidad en dollares es: "+total);

	}

}
