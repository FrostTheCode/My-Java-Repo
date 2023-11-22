package Asociacion_operacion;

import javax.swing.JOptionPane;

public class Promedio {
	public void prom (String na)
	{
		int promr[] =new int [5];
		int sumArray=0;
		for (int i=0; i<promr.length;i++)
			promr [i]=Integer.parseInt(JOptionPane.showInputDialog("ingresa la calificacion "+(i+1)));
		for (int i=0;i<promr.length;i++)//obtiene la sumatoria del arreglo
			sumArray+=promr[i];
		JOptionPane.showMessageDialog(null, "el resultado del promedio del estudiante "+na+" es = "+((sumArray)/promr.length));
	}

}
