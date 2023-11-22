package asociacion_IO2;

import javax.swing.JOptionPane;

public class Menu {
	int n1,n2,n3,v;
	
	public void menuses()
	{
		
		
		int opc;
		do {
		opc=Integer.parseInt(JOptionPane.showInputDialog("1.-Mayor de tres\n2.-salir"));
		switch (opc)
		{
		case 1:
			cap3();
			break;
		case 2:
			System.exit(0);
			break;
			default:
				JOptionPane.showMessageDialog(null, "la opcion es incorrecta XD");
		} //fin del nintendo
		}while(opc!=2);
	}//fin menu
	public void cap3()
	{
		n1=Integer.parseInt(JOptionPane.showInputDialog("inserte el valor 1"));
		n2=Integer.parseInt(JOptionPane.showInputDialog("inserte el valor 2"));
		n3=Integer.parseInt(JOptionPane.showInputDialog("inserte el valor 3"));
		MayorDeTresNumeros mayt =new MayorDeTresNumeros();
		v=mayt.mas(n1, n2, n3);
		JOptionPane.showMessageDialog(null, "el mayor de los tres numeros es "+v,"cual es el Mayor!!!!!!",JOptionPane.INFORMATION_MESSAGE);
		
	}//fin class

}
