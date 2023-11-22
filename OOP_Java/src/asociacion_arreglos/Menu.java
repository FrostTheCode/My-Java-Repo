package asociacion_arreglos;

import java.util.Random;

import javax.swing.JOptionPane;

public class Menu {
	int x[]=new int [10];
	int z[]=new int [10];
	public void menu()
	{
		int opc;
		do {
		opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-inicializa arreglos \n2.-operaciones \n3.-salir","operaciones con arreglos",JOptionPane.INFORMATION_MESSAGE));
		switch(opc)
		{
		case 1:
			iniz();
			break;
		case 2:
			Operaciones op=new Operaciones();
			op.opar(x, z);
			break;
		case 3:
			System.exit(0);
			break;
			default:
				JOptionPane.showMessageDialog(null, "opcion invalida !!!!!!!","error",JOptionPane.ERROR_MESSAGE);
		}//fin switch
		}while(opc!=3);
		}

	public void iniz()
	{
		Random nr = new Random();
		for (int i=0;i<x.length;i++)
		{
			x[i]=nr.nextInt(20)+1;
			z[i]=nr.nextInt(20)+1;
		}
			
	}
}//fin de la clase 

