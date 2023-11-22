package Trabajos2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Eje13 {

	public static void main(String[] args) {
		int n2,n1,n3;
		Scanner in = new Scanner(System.in);
		n1=Integer.parseInt(JOptionPane.showInputDialog(null,"inserte el primer numero",JOptionPane.INFORMATION_MESSAGE));
		n2=Integer.parseInt(JOptionPane.showInputDialog(null,"inserte el segundo numero",JOptionPane.INFORMATION_MESSAGE));
		n3=Integer.parseInt(JOptionPane.showInputDialog(null,"inserte el tercer numero",JOptionPane.INFORMATION_MESSAGE));
		if (n1>n2&&n1>n3&&n2>n3)
			JOptionPane.showMessageDialog(null,"el numero es: "+n1+n2+n3);
		else if (n1>n3&&n1>n2&&n3>n2)
			JOptionPane.showMessageDialog(null,"el numero es: "+n1+n3+n2);
		else if (n2>n1&&n2>n3&&n1>n3)
			JOptionPane.showMessageDialog(null,"el numero es: "+n2+n1+n3);
		else if (n2>n1&&n2>n3&&n3>n1)
			JOptionPane.showMessageDialog(null,"el numero es: "+n2+n3+n1);
		else if (n3>n2&&n3>n1&&n1>n2)
			JOptionPane.showMessageDialog(null,"el numero es: "+n3+n1+n2);
		else if (n3>n2&&n3>n1&&n2>n1)
			JOptionPane.showMessageDialog(null,"el numero es: "+n3+n2+n1);
		else if (n1==n2&&n2==n3&&n1==n3)
			JOptionPane.showMessageDialog(null,"son iguales los numeros "+n1+n2+n3);
		else 
			JOptionPane.showMessageDialog(null,"invalido");
			
	}

}
