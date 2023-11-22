package Composicion_Aluymno_escuela;

import javax.swing.JOptionPane;

public class menu {
	public void menus() 
	{
		Imprime im=new Imprime();
		ingresa in=new ingresa();
		
		int op;
		do {
		op=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Datos imprimibles\n2.-Datos ingresables\n3.-Salir","menu del Alumno",JOptionPane.INFORMATION_MESSAGE));	
		switch(op)
		{
		case 1:
			JOptionPane.showMessageDialog(null,im.Toimprime(),"Datos de la Escuela",JOptionPane.INFORMATION_MESSAGE);
			break;
		case 2:
			JOptionPane.showMessageDialog(null,in.ing(),"Datos de la Escuela",JOptionPane.INFORMATION_MESSAGE);
			break;
		case 3:
			System.exit(0);
			break;
			default:
				JOptionPane.showMessageDialog(null, "eto ta mal, eta mal","no sea erroneo",JOptionPane.ERROR_MESSAGE);
		}
		}while(op!=3);
	}
	

}
