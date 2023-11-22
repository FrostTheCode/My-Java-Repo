package herencia_Seleccion_futbol;

import javax.swing.JOptionPane;

public class Menu {
	Ingresa in=new Ingresa();
	public void men()
	{
	int opc;
	 do {
	 opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Alta de Futbolista\n2.-Alta de Masajista\n3.-Alta de Entrenador\n4.-Salir del programa","Menu de Seleccion futbol",JOptionPane.INFORMATION_MESSAGE));
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
		 JOptionPane.showMessageDialog(null, "doesn't work because\nno!","error!!!!",JOptionPane.ERROR_MESSAGE);
	 }//end switch
	 }while (opc!=4);//end while
}}
