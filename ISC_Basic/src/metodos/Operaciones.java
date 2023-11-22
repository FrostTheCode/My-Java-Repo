package metodos;

import javax.swing.JOptionPane;

public class Operaciones {

	public static void main(String[] args) {
		menu();//llamado del metodo menu
	}//fin del metodo main
	//definicion del metodo
	private static void menu() {
		int opc;
		do {
		opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.- suma\n2.- resta\n3.-multiplicacion\n4.-divicion\n5.- salir","menu principal",JOptionPane.INFORMATION_MESSAGE));
		switch(opc)
		{
		case 1:
			suma();
			break;
		case 2:
			resta();
			break;
		case 3:
			multiplicacion();
			break;
		case 4:
			divicion();
			break;
		case 5:
			System.exit(0);
			break;
			default:
				JOptionPane.showMessageDialog(null, "error !!!!!!","opcion invalida",JOptionPane.ERROR_MESSAGE);
		}//fin del switch
		}while(opc!=5);//fin del do while
	}//fin del metodo menu
	private static void divicion() {
		int n1,n2;
		n1=Integer.parseInt(JOptionPane.showInputDialog("ingresa el primer valor"));
		n2=Integer.parseInt(JOptionPane.showInputDialog("ingresa el segundo valor"));
		if(n1>0&&n2>0)
		JOptionPane.showMessageDialog(null, (n1/n2),"resultado de la divicion",JOptionPane.INFORMATION_MESSAGE);
		else if (n1==0&&n2==0)
			JOptionPane.showMessageDialog(null, "error !!!!!!","no se aceptan ceros",JOptionPane.ERROR_MESSAGE);
	}
	private static void multiplicacion() {
		int n1,n2;
		n1=Integer.parseInt(JOptionPane.showInputDialog("ingresa el primer valor"));
		n2=Integer.parseInt(JOptionPane.showInputDialog("ingresa el segundo valor"));
		if(n1>0&&n2>0)
		JOptionPane.showMessageDialog(null, (n1*n2),"resultado de la multiplicacion",JOptionPane.INFORMATION_MESSAGE);
		else if (n1==0&&n2==0)
		JOptionPane.showMessageDialog(null, "error !!!!!!","no se aceptan ceros",JOptionPane.ERROR_MESSAGE);
	}
	private static void resta() {
		int n1,n2;
		n1=Integer.parseInt(JOptionPane.showInputDialog("ingresa el primer valor"));
		n2=Integer.parseInt(JOptionPane.showInputDialog("ingresa el segundo valor"));
		if(n1>0&&n2>0)
		JOptionPane.showMessageDialog(null, (n1-n2),"resultado de la resta",JOptionPane.INFORMATION_MESSAGE);
		else if (n1==0&&n2==0)
			JOptionPane.showMessageDialog(null, "error !!!!!!","no se aceptan ceros",JOptionPane.ERROR_MESSAGE);
	}
	private static void suma() {
		int n1,n2;
		do {
		n1=Integer.parseInt(JOptionPane.showInputDialog("ingresa el primer valor"));
		}while(n1==0);
		do {
		n2=Integer.parseInt(JOptionPane.showInputDialog("ingresa el segundo valor"));
		}while(n2==0);
		JOptionPane.showMessageDialog(null, (n1+n2),"resultado de la suma",JOptionPane.INFORMATION_MESSAGE);
	}

}//fin del codigo
