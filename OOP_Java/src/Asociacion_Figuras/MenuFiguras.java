package Asociacion_Figuras;

import javax.swing.JOptionPane;

public class MenuFiguras {
	public void menu()
	{
		Triangulo tr=new Triangulo();
		Circulo cr=new Circulo();
		Cuadrado cd=new Cuadrado();
		Rectangulo re =new Rectangulo();
		int opc;
		do {
		opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-triangulo\n2.-circulo\n3.-rectangulo\n4.-cuadrado\n5.-salir"));
		switch (opc)
		{
		case 1:
			tr.Tri();
			break;
		case 2:
			cr.cir();
			break;
		case 3:
			re.rec();
			break;
		case 4:
		    cd.cuadro();
			break;
		case 5:
			System.exit(0);
			break;
			default:
				JOptionPane.showMessageDialog(null, "opcion invalida ajajjaja");
				break;
		}
		}while(opc<=5);
	}

}
