package jdoc;

import javax.swing.JOptionPane;

public class Logic {
	public void suma() {
		int n1=5,n2=6;
		
		JOptionPane.showMessageDialog(null, (n1+n2));
		
	}
	public void resta(int n1,int n2) {
		JOptionPane.showMessageDialog(null, (n1-n2));
	}
	public int multiplicar(int n1,int n2) {
		return n1*n2;
	}
	
}
