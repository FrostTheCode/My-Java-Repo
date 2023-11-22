package Compo_Hotel;

import javax.swing.JOptionPane;

public class MenuHot {
public void Men()
{
	Imprime i1=new Imprime();
	Ingresa i2=new Ingresa();
	 int opc;
	 do {
	opc=Integer.parseInt(JOptionPane.showInputDialog(null
			,"1.-Imprime los Datos\n2.-Ingresa los Datos\n3.-salir"
			,"menu de los datos del hotel"
			,JOptionPane.INFORMATION_MESSAGE));
	switch(opc)
	{
	case 1:
		JOptionPane.showMessageDialog(null,i1.toprint(),"Datos del hotel",JOptionPane.INFORMATION_MESSAGE);
		break;
	case 2:
		JOptionPane.showMessageDialog(null, i2.toing(),"datos del hotel",JOptionPane.INFORMATION_MESSAGE);
		break;
	case 3:
		System.exit(0);
		break;
		default:
			JOptionPane.showMessageDialog(null,"opcion incorrecta","no funciona",JOptionPane.INFORMATION_MESSAGE);
	}
	 }while(opc!=3);
}
}
