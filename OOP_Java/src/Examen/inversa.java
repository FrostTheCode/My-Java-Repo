package Examen;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class inversa {
	public void in(int a[],int b[])
	{
		JTextArea salida=new JTextArea();
		String d="arreglo 1 in\tarreglo 2 in\n";
		for (int i=10;i>0;i--)
		d+=a[i]+"\t\t"+b[i]+"\n";
		
		salida.setText(d);
		JOptionPane.showMessageDialog(null, salida);
	}

}
