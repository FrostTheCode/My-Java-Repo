package metodos;

import javax.swing.JOptionPane;

public class PasoParametro {

	public static void main(String[] args) {
       capdatos();
	}

	private static void capdatos() {
		int n1,n2;
		n1=Integer.parseInt(JOptionPane.showInputDialog("ingresa valor"));
		n2=Integer.parseInt(JOptionPane.showInputDialog("ingresa valor"));
		int s=suma(n1,n2),m=multi(n1,n2),d=divi(m,s),r=res(d,m);
		JOptionPane.showMessageDialog(null, "suma= "+s+" multiplicacion= "+m+" divicion= "+d+" resta= "+r);
		
	}
	private static int res(int d, int m) {
		return d-m;
	}

	private static int divi(int s, int m) {
		return s/m;
	}
	private static int multi(int a, int b) {
		return a*b;
	}
	private static int suma(int x, int y) {
		return x+y;
	}

}
