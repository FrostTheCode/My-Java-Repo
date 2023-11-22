package asociacion_matriz;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Multiplica {
	public void mul(int x[][],int y[][])
	{//el numero de columnas de la matriz a es igual al numero de filas de la segunda matriz
		int [][]m=new int [3][3];
		JTextArea sal=new JTextArea();
		String dts="matriz 1\n";
		for (int i=0;i<x.length;i++)
		{
			dts+="\n";
			for (int j=0;j<y.length;j++)
				dts+=x[i][j]+"\t";
		}
		dts+="\nMatriz 2\n";
		for (int i=0;i<x.length;i++)
		{
			dts+="\n";
			for (int j=0;j<y.length;j++)
				dts+=x[i][j]+"\t";
		}
		dts+="\nMultiplicacion de matrices\n";
		
			for (int i=0;i<x.length;i++)
			for (int j=0;j<y.length;j++)
				for (int k=0;k<y.length;k++)
					m[i][j]+=x[i][k]*y[k][j];
			for (int i=0;i<x.length;i++)
			{
				dts+="\n";
						for (int j=0;j<m.length;j++)
							dts+=m[i][j]+"\t";
			}
		
		
		sal.setText(dts);
		JOptionPane.showMessageDialog(null, sal,"Multiplicacion de matrices",JOptionPane.INFORMATION_MESSAGE);

}
}