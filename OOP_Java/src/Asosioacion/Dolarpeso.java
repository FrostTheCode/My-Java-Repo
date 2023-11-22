package Asosioacion;

import javax.swing.JOptionPane;

public class Dolarpeso {
	public void udsmx()
	{
		double pesos=18.70, dolar,total;
        dolar=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa cantidad de dollares"));
        total=pesos*dolar;
        JOptionPane.showMessageDialog(null, "La cantidad en Pesos es: "+total);

	}

}
