package Trabajos2;

import javax.swing.JOptionPane;

public class Eje2 {

	public static void main(String[] args) {
		int h;
		
h=Integer.parseInt(JOptionPane.showInputDialog("inserte la hora deseada en formato de 24 horas: "));
        if (h <= 12 && h >= 6 ) {
        	{
        		JOptionPane.showMessageDialog(null, "buenos dias");
        	}
        }
        	else if (h <= 20 && h >= 13) {
        		JOptionPane.showMessageDialog(null,"es de tarde");
        	}
        	
        	else if (h <= 5 && h >= 21) {
        		JOptionPane.showMessageDialog(null,"es de noche");
        	}
        	else JOptionPane.showMessageDialog(null,"no esta registrado");        	
        	
        	
        	
        	
        	
        	
        	
        	
		
        
	}

}
