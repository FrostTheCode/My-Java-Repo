package Examen;

import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class matriz3 {
	public void matrices()
	{
		int x[][]=new int[3][3];
		int y[][]=new int [3][3];
		Random nr = new Random();
		JTextArea s = new JTextArea();
		String datos="Matriz\n";
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x.length;j++) 
				x[i][j]=nr.nextInt(20)+1;
		}
		for (int i=0;i<y.length;i++)
			for (int j=0;j<y.length;j++)
				y[i][j]=nr.nextInt(20)+1;
	
		for(int i=0;i<y.length;i++) {
			datos+="\n";
			for(int j=0;j<y.length;j++)
				datos+=x[i][j]+"\t";
		}
						datos+="\nMatriz 2\n";
						for(int h=0;h<y.length;h++) {
							datos+="\n";
							for(int j=0;j<y.length;j++)
								datos+=y[h][j]+"\t";
					}
						datos+="\nMatriz inversa 1\n";
						for(int h=0;h<y.length;h++) {
							datos+="\n";
							for(int j=0;j<y.length;j++)
								datos+=x[j][h]+"\t";
					}
						datos+="\nMatriz inversa 2\n";
						for(int h=0;h<y.length;h++) {
							datos+="\n";
							for(int j=0;j<y.length;j++)
								datos+=y[j][h]+"\t";
					}
						
		s.setText(datos);
		JOptionPane.showMessageDialog(null,s, "Matriz",JOptionPane.INFORMATION_MESSAGE);
	}

}
