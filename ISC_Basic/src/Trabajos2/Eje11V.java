package Trabajos2;

import javax.swing.JOptionPane;

public class Eje11V {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int h,m,s;
        h=Integer.parseInt(JOptionPane.showInputDialog("ingresa la hora"));
        m=Integer.parseInt(JOptionPane.showInputDialog("ingresa los minutos"));
        s=86400-(h*3600)+(m*60);
        JOptionPane.showMessageDialog(null, "segundos faltantes para la media noche "+s);
	}

}
