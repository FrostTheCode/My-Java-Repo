package Examen_poli;

import javax.swing.JOptionPane;

public class Menu {
	Ingresa in=new Ingresa();
	public void men()
	{
	    int opc;
	    do {
	    opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Alta del Persa\n2.-Alta del Siames\n3.-Alta del Africano\n4.-Alta de Asiatico\n5.-Salir","Datos de la Mascota",JOptionPane.INFORMATION_MESSAGE));
	    switch(opc)
	    {
	    case 1:
	    	in.ing_per();
	    break;
	    case 2:
	    	in.ing_Sia();
	    	break;
	    case 3:
	    	in.ing_Afr();;
	    	break;
	    case 4:
	    	in.ing_Asi();
	    	break;
	    case 5:
	    	System.exit(0);
	    	break;
	    default:
    		JOptionPane.showMessageDialog(null, "dato incorrecto\nSAD :,( ","Error!",JOptionPane.ERROR_MESSAGE);
	    }
	    }while(opc!=5);
	}

}
