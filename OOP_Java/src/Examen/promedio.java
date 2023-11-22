package Examen;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class promedio {
	
	public void calif()
	{
		JTextArea cl=new JTextArea();
		Random NR=new Random();
		int ca[]=new int [5];	
		int pro=0,nca=0;
		String name;
		String dts="calif\n";
		name=JOptionPane.showInputDialog(null,"ingrese el nombre del estudiante","nombre del estudiante",JOptionPane.INFORMATION_MESSAGE);
		for (int i=0;i<ca.length;i++)
		{
			ca[i]+=NR.nextInt(100)+40;
			pro+=ca[i];
			nca++;
			dts+=ca[i]+"\n";
		}
		pro=(pro/5);
		if (pro>=70)
		JOptionPane.showMessageDialog(null, dts+"\n"+"el promedio es de "+pro,"el estudiante "+name,JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, "usted reprobo","reprobado",JOptionPane.ERROR_MESSAGE);
	}

}
