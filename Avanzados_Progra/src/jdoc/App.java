package jdoc;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logic mil=new Logic();
		mil.suma();
		mil.resta(5, 3);
		int mult=mil.multiplicar(2, 4);
		JOptionPane.showMessageDialog(null, mult);
	}

}
