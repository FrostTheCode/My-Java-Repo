package arreglos;


import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class datosArrayJoption {

	public static void main(String[] args) {
		// muestra el arreglo en modo grafico
		inicializa();

	}

	private static void inicializa() {
		int []array= new int [10];
		Random nr = new Random();
		//llenamos el arreglo con randoms
		for (int i=0;i<array.length;i++)
			array[i]=nr.nextInt(50);
		imprimejop(array);
		
	}

	private static void imprimejop(int[] ar) {
		String datos="Arreglo\n";
		JTextArea salida=new JTextArea();//definiendo un objeto JTextArea
		for (int i=0;i<ar.length;i++)
			datos+=ar[i]+"\n";//en datos se guarda los valores de ar[i]
		salida.setText(datos);//coloca la cadena datos en jtext
		JOptionPane.showMessageDialog(null, salida,"Datos del arreglo",JOptionPane.INFORMATION_MESSAGE);//se imprime el salida con joption
		
		
	}

}
