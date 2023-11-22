package asociacion_matriz;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Multiplicacion {
	int a[][]=new int [5][5];
	int b[][]=new int [5][5];
	int c[][]=new int [5][5];
	int fm1,cm1,fm2,cm2;
	public void multi()
	{
		capdts();
		JTextArea su=new JTextArea();
		String dat="Matriz 1\n";
		for (int i=0;i<fm1;i++)
		{
			dat+="\n";
			for (int j=0;j<cm1;j++)
				dat+=a[i][j]+"\t";
		}
		dat+="\nMatriz 2\n";
		for (int i=0;i<fm2;i++)
		{
			dat+="\n";
			for (int j=0;j<cm2;j++)
				dat+=b[i][j]+"\t";
		}
		for (int i=0;i<fm1;i++)
			for (int j=0;j<cm2;j++)
				for (int k=0;k<cm1;k++)
					c[i][j]+=a[i][k]*b[k][j];
		dat+="\nResultado de las multiplicaciones";
		for (int i=0;i<fm1;i++)
		{
		dat+="\n";
		for (int j=0;j<cm2;j++)
			dat+=c[i][j]+"\t";
		}		
		
		su.setText(dat);
		JOptionPane.showMessageDialog(null,su,"resultado de la matriz",JOptionPane.INFORMATION_MESSAGE);
		
	}
	public void capdts()
	{
		
		fm1=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el valor menor o igual a 5","Filas de la matriz 1",JOptionPane.INFORMATION_MESSAGE));
		cm1=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el valor menor o igual a 5","columnas de la matriz 1",JOptionPane.INFORMATION_MESSAGE));
		fm2=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el valor menor o igual a 5","Filas de la matriz 2",JOptionPane.INFORMATION_MESSAGE));
		cm2=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el valor menor o igual a 5","columnas de la matriz 2",JOptionPane.INFORMATION_MESSAGE));
		if (cm1==fm2)
		{
			//captura de los elementos de la matriz 1
			for (int i=0;i<fm1;i++)
				for (int j=0;j<cm1;j++)
					a[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"ingersa valor","Valor"+"["+i+"]"+"["+j+"]",JOptionPane.INFORMATION_MESSAGE));
			//captura los datos de la matriz 2
			for (int i=0;i<fm2;i++)
				for (int j=0;j<cm2;j++)
					b[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"ingersa valor","Valor"+"["+i+"]"+"["+j+"]",JOptionPane.INFORMATION_MESSAGE));
		}
		
		else 
			JOptionPane.showMessageDialog(null, "no","NO",JOptionPane.ERROR_MESSAGE);
		
	}

}
