package Asosioacion;

import javax.swing.JOptionPane;

public class Dolareuro {
	public void usdeur ()
	{
		double dollar, euro=0.91,total;
        dollar=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa cantidad de Dollares"));
        total=dollar*euro;
        JOptionPane.showMessageDialog(null, "La cantidad en Euros es: "+total);

	}

}
