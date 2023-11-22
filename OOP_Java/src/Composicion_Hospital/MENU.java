package Composicion_Hospital;

import javax.swing.JOptionPane;

public class MENU {
	public void menus()
	{
		 IMPR ib=new IMPR();
    	 INGR is=new INGR();
    	 int opc;
    	 do {
		opc=Integer.parseInt(JOptionPane.showInputDialog(null
				,"1.-Datos ingresados\n2.-Datos ingresables\n3.-salir"
				,"menu de los datos del hospital"
				,JOptionPane.INFORMATION_MESSAGE));
		switch(opc)
		{
		case 1:
			JOptionPane.showMessageDialog(null,ib.imp(),"Datos del hospital",JOptionPane.INFORMATION_MESSAGE);
			break;
		case 2:
			JOptionPane.showMessageDialog(null, is.inp(),"datos del hospital",JOptionPane.INFORMATION_MESSAGE);
			break;
		case 3:
			System.exit(0);
			break;
			default:
				JOptionPane.showMessageDialog(null,"opcion incorrecta","no jala jajaja",JOptionPane.INFORMATION_MESSAGE);
		}
    	 }while(opc!=3);
	}

}
