package herencia_empleado;

import javax.swing.JOptionPane;

public class Menu {
	Ingresa in=new Ingresa();
	public void men()
	{
	int opc;
	 do {
	 opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Alta de Director\n2.-Alta de Mantenimiento\n3.-Alta de Informatico\n4.-Salir del programa","Menu de Seleccion futbol",JOptionPane.INFORMATION_MESSAGE));
	 switch(opc)
	 {
	 case 1:
		 in.ing_Dir();
		 break;
	 case 2:
		 in.ing_Man();
		 break;
	 case 3:
		 in.ing_Inf();
		 break;
	 case 4:
		 System.exit(0);
		 break;
	 default:
		 JOptionPane.showMessageDialog(null, "doesn't work because\nno!","error!!!!",JOptionPane.ERROR_MESSAGE);
	 }//end switch
	 }while (opc!=4);//end while
}

}
