package asociacion_matriz;

import java.util.Random;

import javax.swing.JOptionPane;

public class Menu {
	//declaramos las matrices
	int x[][]=new int [3][3];
	int y[][]=new int [3][3];
	
	public void mens()
	{
		Suma s=new Suma();
		Resta r=new Resta();
		Multiplica m=new Multiplica();
		Multiplicacion mu=new Multiplicacion();
		int opc;
		do {
		opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-inicialice matrices\n2.-suma\n3.-resta\n4.-multiplica\n5.-multiplicacion\n6.-salir","menu principal",JOptionPane.INFORMATION_MESSAGE));
		switch(opc)
		{
		case 1:
			inimat();
			break;
		case 2:
			s.sum(x, y);
			break;
		case 3:
			r.res(x, y);
			break;
		case 4:
			m.mul(x, y);
			break;
		case 5:
			mu.multi();
			break;
		case 6:
			System.exit(0);
			break;
			default:
				JOptionPane.showMessageDialog(null, "ute puso una occion inva.ida jajajaj xD\nvuelva a intentarlo\n","opcion incorrecta jaj",JOptionPane.ERROR_MESSAGE);
		}//switch
		
		}while(opc!=5);
		
	}
	public void inimat()
	{
		Random nr=new Random();
		for (int i=0;i<x.length;i++)
			for (int j=0;j<y.length;j++)
			{
				x[i][j]=nr.nextInt(3)+1;
				y[i][j]=nr.nextInt(3)+1;
			}
		
		
	}
}
