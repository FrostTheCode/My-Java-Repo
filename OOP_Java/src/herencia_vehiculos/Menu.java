package herencia_vehiculos;

import javax.swing.JOptionPane;

public class Menu {
	Ing i=new Ing();
	public void men()
	{
	int opc;
	 do {
	 opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Alta de Aero\n2.-Alta de Aquatico\n3.-Alta de Terrestre\n4.-Salir del programa","Menu de Vehiculo",JOptionPane.INFORMATION_MESSAGE));
	 switch(opc)
	 {
	 case 1:
		 i.ing_aero();
		 break;
	 case 2:
		 i.ing_Aqua();
		 break;
	 case 3:
		 i.ing_terra();
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
