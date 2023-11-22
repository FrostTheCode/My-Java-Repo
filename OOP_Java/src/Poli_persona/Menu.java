package Poli_persona;

import javax.swing.JOptionPane;

public class Menu {
	Ingresa in=new Ingresa();
	public void men()
	{
	    int opc;
	    do {
	    opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Alta del Estudiante\n2.-Alta del Maestro\n3.-Alta del Directivo\n4.-Salir","Datos de la persona",JOptionPane.INFORMATION_MESSAGE));
	    switch(opc)
	    {
	    case 1:
	    	in.ing_est();
	    break;
	    case 2:
	    	in.ing_mae();
	    	break;
	    case 3:
	    	in.ing_dir();
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
