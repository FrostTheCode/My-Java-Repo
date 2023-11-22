package compo_Auto;

import javax.swing.JOptionPane;

public class Menu {
	public void men(){
	IMPRI im=new IMPRI();
	INGR in=new INGR();
	int opc;
	 do {
	opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Imprime Datos \n2.-Ingresa Datos \n3.-salir"
			,"menu de datos del vehiculo",JOptionPane.INFORMATION_MESSAGE));
	switch(opc)
	{
	case 1:
		JOptionPane.showMessageDialog(null,im.imp(),"Datos del Vehiculo ",JOptionPane.INFORMATION_MESSAGE);
		break;
	case 2:
		JOptionPane.showMessageDialog(null, in.inp(),"Datos del Vehiculo ",JOptionPane.INFORMATION_MESSAGE);
		break;
	case 3:
		System.exit(0);
		break;
		default:
			JOptionPane.showMessageDialog(null,"opcion incorrecta","no jala jajaja",JOptionPane.INFORMATION_MESSAGE);
	}
	 }while(opc!=3);
}}




