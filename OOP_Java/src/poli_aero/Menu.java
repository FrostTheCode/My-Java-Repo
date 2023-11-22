package poli_aero;

import javax.swing.JOptionPane;

public class Menu {
	Ingresa in=new Ingresa();
	public void men()
	{
	    int opc;
	    do {
	    opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Alta del Avion\n2.-Alta del Helicoptero\n3.-Alta del Globo\n4.-Salir","Datos del Aero",JOptionPane.INFORMATION_MESSAGE));
	    switch(opc)
	    {
	    case 1:
	    	in.ing_avi();
	    break;
	    case 2:
	    	in.ing_hel();
	    	break;
	    case 3:
	    	in.ing_glo();
	    	break;
	    case 4:
	    	System.exit(0);
	    	break;
	    default:
    		JOptionPane.showMessageDialog(null, "dato incorrecto\nSAD :,( ","Error!",JOptionPane.ERROR_MESSAGE);
	    }
	    }while(opc!=4);
	}

}
