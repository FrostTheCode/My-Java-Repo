package poli_empl;

import javax.swing.JOptionPane;

public class menu {
	Ingresa i=new Ingresa();
	public void men()
	{
	    int opc;
	    do {
	    opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Alta del Director\n2.-Alta de mantenimiento\n3.-Alta del Informatico\n4.-Salir","Datos del Empleado",JOptionPane.INFORMATION_MESSAGE));
	    switch(opc)
	    {
	    case 1:
	    	i.ing_dir();
	    break;
	    case 2:
	    	i.ing_man();
	    	break;
	    case 3:
	    	i.ing_inf();
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