package arreglos;

import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ArrayMetodosJoption {

	public static void main(String[] args) {
		inicializacion();
		

	}

	private static void inicializacion() {
		int []ar1= new int [10];
		int []ar2= new int [10];
		Random nr=new Random();
		for (int i=0;i<ar1.length;i++)
		{
			ar1[i]=nr.nextInt(50);
			ar2[i]=nr.nextInt(50);
		}
		arreglo(ar1,ar2);
		
		
		
	}

	private static void arreglo(int[] ar1, int[] ar2) {
		JOptionPane.showMessageDialog(null,"arreglo 1\tarreglo 2\tsuma\tresta\tmultiplicacion\tdivicion\tresiduo");
		for (int i=0;i<ar1.length;i++)
			System.out.println(ar1[i]+"\t\t"+ar2[i]+"\t\t"+suma(ar1,ar2)+"\t"+resta(ar1,ar2));
		
	}

	private static int suma(int[] ar1, int[] ar2) {
		int ka=0,l=0;
		for (int i=0;i<ar1.length;i++)
			ka=ar1[i]+ar2[i];
		l=ka;
		return l;
	}

	private static Object resta(int[] ar1, int[] ar2) {
		int rar=0,l=0;
		for (int i=0;i<ar1.length;i++)
			rar=ar1[i]-ar2[i];
		l=rar;
	    return l;
	}

		
	}

