package poli_animals;

import javax.swing.JOptionPane;

public class menu {
	ingresa in=new ingresa();
	public void men()
	{
	    int opc;
	    do {
	    opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Alta del Aguila\n2.-Alta de la Tortuga\n3.-Alta del Delfin\n4.-alta del Perro\n5.-salir","Datos de los animales",JOptionPane.INFORMATION_MESSAGE));
	    switch(opc)
	    {
	    case 1:
	    	in.ing_agu();
	    break;
	    case 2:
	    	in.ing_tor();
	    	break;
	    case 3:
	    	in.ing_del();
	    	break;
	    case 4:
	    	in.ing_per();
	    	break;
	    case 5:
	    	System.exit(0);
	    	break;
	    default:
    		JOptionPane.showMessageDialog(null, "dato incorrecto\nSAD :,( ","Error!",JOptionPane.ERROR_MESSAGE);
	    }
	    }while(opc!=4);
}
}