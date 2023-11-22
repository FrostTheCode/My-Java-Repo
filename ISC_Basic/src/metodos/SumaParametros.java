package metodos;

import javax.swing.JOptionPane;

public class SumaParametros {

	public static void main(String[] args) {
		captdatos();
	}

	private static void captdatos() {
		int n1,n2;
		n1=Integer.parseInt(JOptionPane.showInputDialog("ingresa valor"));
		n2=Integer.parseInt(JOptionPane.showInputDialog("ingresa valor"));
		int s=suma(n1,n2);
		JOptionPane.showMessageDialog(null, s);
	}

	private static int suma(int n1, int n2) {
	    //suma de dos valores pasados por parametro
		//JOptionPane.showMessageDialog(null, (n1+n2));
		return n1+n2;
		
	}

}
