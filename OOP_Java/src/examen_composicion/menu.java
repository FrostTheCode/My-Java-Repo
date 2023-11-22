package examen_composicion;

import javax.swing.JOptionPane;

public class menu {
	public void men()
	{
		Imprime imp=new Imprime();
		Ingresa inp=new Ingresa();
		int opc;
		 do {
		opc=Integer.parseInt(JOptionPane.showInputDialog(null
				,"1.-Imprime Datos\n2.-Ingresa Datos\n3.-salir"
				,"menu de datos de ciclista"
				,JOptionPane.INFORMATION_MESSAGE));
		switch(opc)
		{
		case 1:
			JOptionPane.showMessageDialog(null,imp.toprint(),"Datos del ciclista ",JOptionPane.INFORMATION_MESSAGE);
			break;
		case 2:
			JOptionPane.showMessageDialog(null, inp.toing(),"Datos del ciclista ",JOptionPane.INFORMATION_MESSAGE);
			break;
		case 3:
			System.exit(0);
			break;
			default:
				JOptionPane.showMessageDialog(null,"opcion incorrecta","no Funciona",JOptionPane.INFORMATION_MESSAGE);
	}
		
}while (opc!=3);
}
}