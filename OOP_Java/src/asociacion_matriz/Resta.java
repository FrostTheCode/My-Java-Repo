package asociacion_matriz;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Resta {
	public void res(int x[][],int y[][])
	{
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
		dts+="\nResta de matrices 2\n";
		for (int i=0;i<x.length;i++)
		{
			dts+="\n";
			for (int j=0;j<y.length;j++)
				dts+=(x[i][j]+y[i][j])+"\t";
		}
		
		sal.setText(dts);
		JOptionPane.showMessageDialog(null, sal,"Resta de matrices",JOptionPane.INFORMATION_MESSAGE);

}
}