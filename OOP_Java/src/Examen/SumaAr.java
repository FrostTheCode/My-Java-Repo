package Examen;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class SumaAr {

	public void sum(int[] a, int[] b) {
		
		int c[]=new int [10]; 
		JTextArea salida=new JTextArea();
		String d="arreglo 1\tarreglo 2\tsuma de arreglos\n";
		for (int i=0;i<a.length;i++)
		d+=a[i]+"\t\t"+b[i]+"\t\t"+(a[i]+b[i])+"\n";
		
		salida.setText(d);
		JOptionPane.showMessageDialog(null, salida);
	}
}


