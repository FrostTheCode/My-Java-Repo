package composcion_jugador;

import javax.swing.JOptionPane;

public class menu {
	public void menus() 
	{
		Imprime im=new Imprime();
		Ingresa in=new Ingresa();
		
		int op;
		do {
		op=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Imprime Datos\n2.-Ingresa Datos\n3.-Salir","menu del Futbol",JOptionPane.INFORMATION_MESSAGE));	
		switch(op)
		{
		case 1:
			JOptionPane.showMessageDialog(null,im.impri(),"Datos del Futbol",JOptionPane.INFORMATION_MESSAGE);
			break;
		case 2:
			JOptionPane.showMessageDialog(null,in.ing(),"Datos del Futbol",JOptionPane.INFORMATION_MESSAGE);
			break;
		case 3:
			System.exit(0);
			break;
			default:
				JOptionPane.showMessageDialog(null, "opcion no disponible","error",JOptionPane.ERROR_MESSAGE);
		}
		}while(op!=3);
	}
}
