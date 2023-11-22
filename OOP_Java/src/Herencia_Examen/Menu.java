package Herencia_Examen;

import javax.swing.JOptionPane;

public class Menu {
	Ingresa ini=new Ingresa();
	public void menu() {
		 int opc;
		 do {
		 opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Alta del Aguila\n2.-Alta de la tortuga\n3.-Alta del delfin\n4.-Alta del perro\n5.-salir del programa","Menu del examen",JOptionPane.INFORMATION_MESSAGE));
		 switch(opc)
		 {
		 case 1:
			 ini.ing_a();
			 break;
		 case 2:
			 ini.ing_t();
			 break;
		 case 3:
			 ini.ing_d();
			 break;
		 case 4:
			 ini.ing_p();
		 case 5:
			 System.exit(0);
		 default:
			 JOptionPane.showMessageDialog(null, "doesn't work because\nno!","error!!!!",JOptionPane.ERROR_MESSAGE);
		 }//end switch
		 }while (opc!=5);//end while
}
	}
