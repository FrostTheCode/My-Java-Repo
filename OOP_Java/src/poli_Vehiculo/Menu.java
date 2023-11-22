package poli_Vehiculo;

import javax.swing.JOptionPane;

public class Menu {
	Ingresa in=new Ingresa();
	public void men()
	{
	    int opc;
	    do {
	    opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Alta del Deportivo\n2.-Alta del familiar\n3.-Alta del Cargar\n4.-Salir","Datos del vehiculo",JOptionPane.INFORMATION_MESSAGE));
	    switch(opc)
	    {
	    case 1:
	    	in.ing_dep();
	    	break;
	    case 2:
	    	in.ing_fam();
	    	break;
	    case 3:
	    	in.ing_car();
	    	break;
	    case 4:
	    	System.exit(0);
	    	break;
	    	default:
	    		JOptionPane.showMessageDialog(null, "dato incorrecto\nSAD :,( ","Error!",JOptionPane.ERROR_MESSAGE);
	    }//fin del nintendo
	    }while (opc!=4);
	}
}
