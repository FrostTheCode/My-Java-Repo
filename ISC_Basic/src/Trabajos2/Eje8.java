package Trabajos2;

import javax.swing.JOptionPane;

public class Eje8 {

	public static void main(String[] args) {
		int calif;
       
        calif=Integer.parseInt(JOptionPane.showInputDialog("ingresa la calificacion del estudiante "));
        if(calif >= 100) {
        	{
        	JOptionPane.showMessageDialog(null,"su calificacion de "+calif+" es excelente");
        	}
        }
        else if ( calif <= 99 && calif>=80)
        {
        	JOptionPane.showMessageDialog(null,"su calificacion de "+calif+" esta bien");
        }	
        else if (calif <=79 &&  calif>= 70)
        {
        	JOptionPane.showMessageDialog(null,"su calificacion de "+calif+" es suficiente");
        }
        else if (calif <= 70 && calif>=0)
        {
        	JOptionPane.showMessageDialog(null,"su calificacion de "+calif+" es no aproba");
        }
        else JOptionPane.showInputDialog(null, "no hay ya estas mal wee regresa",JOptionPane.ERROR_MESSAGE);
	}

}
