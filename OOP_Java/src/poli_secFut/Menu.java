package poli_secFut;

import javax.swing.JOptionPane;

public class Menu {
	Ingresa in=new Ingresa();
	public void men()
	{
		 int opc;
		    do {
		    opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Alta del Futbolista\n2.-Alta del Masajista\n3.-Alta del Entrenador\n4.-Salir","Datos de la seleccion Futbol",JOptionPane.INFORMATION_MESSAGE));
		    switch(opc)
		    {
		    case 1:
		    	in.ing_fut();
		    break;
		    case 2:
		    	in.ing_mas();
		    	break;
		    case 3:
		    	in.ing_ent();
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
