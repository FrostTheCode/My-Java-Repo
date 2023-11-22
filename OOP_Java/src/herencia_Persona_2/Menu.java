package herencia_Persona_2;

import javax.swing.JOptionPane;

public class Menu{
	Ingresa IN=new Ingresa();
	public void menu() {
	 int opc;
	 do {
	 opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Alta de Estudiante\n2.-Alta de Maestro\n3.-Alta de Directivo\n4.-salir del programa","Menu de pesona 2",JOptionPane.INFORMATION_MESSAGE));
	 switch(opc)
	 {
	 case 1:
		 IN.ing_est();
		 break;
	 case 2:
		 IN.ing_mas();
		 break;
	 case 3:
		 IN.ing_dir();
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