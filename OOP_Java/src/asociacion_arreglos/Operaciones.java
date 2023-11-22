package asociacion_arreglos;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Operaciones {
	public void opar(int x[],int z[])//en los arreglos vacios indica que puede ser cuaqlquier numero
	{
		JTextArea sa=new JTextArea();
		String datos="x\ty\tx+y\tx-y\tx*y\tx/y\tx%y\n";
		datos+="__________________________________________________________________\n";
		for (int i=0;i<x.length;i++)
			datos+=x[i]+"\t"+z[i]+"\t"+(x[i]+z[i])+"\n";
		
		sa.setText(datos);
		JOptionPane.showMessageDialog(null, sa,"operaciones de arreglos",JOptionPane.INFORMATION_MESSAGE);
	}
	}


