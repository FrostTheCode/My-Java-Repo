package Examen;
import javax.swing.JOptionPane;


public class menu {
	public void cenu()
	{
		promedio pr=new promedio();
		matriz3 m=new matriz3();
		opArreglos opa=new opArreglos();
		
		int opc;
		do {
		opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-promedio\n2.-matriz 3x3\n3.-operaciones de matrices\n4.-Salir","Menu del examen",JOptionPane.INFORMATION_MESSAGE));
		switch(opc)
		{
		case 1:
			pr.calif();
			break;
		case 2:
			m.matrices();
			break;
		case 3:
	        opa.menuArreglos();
			break;
		case 4:
			System.exit(0);
			break;
			default:
				JOptionPane.showMessageDialog(null, "esa opcion es invalida","usted esta mal",JOptionPane.ERROR_MESSAGE);
		}
		}while(opc!=4);
	}

}
