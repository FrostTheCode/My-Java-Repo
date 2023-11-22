package metodos;

import javax.swing.JOptionPane;

public class Figuras {

	public static void main(String[] args) {
	menuPrincipal();
		
	}
	private static void menuPrincipal() {
		int opc;do {
		opc=Integer.parseInt(JOptionPane.showInputDialog(null, "1.- Area\n2.- perimetro\n3.- salir","Menu Principal",JOptionPane.INFORMATION_MESSAGE));
		switch(opc) {
		case 1:
			menuArea();
			break;
		case 2:
			menuPerimetro();
			break;
		case 3:
			System.exit(0);
			default:
				JOptionPane.showMessageDialog(null, "error!!!!!","opcion invalida",JOptionPane.ERROR_MESSAGE);
		}//fin del switch
	}while(opc!=3);
	}
	private static void menuArea() {
	int opc;do {
	opc=Integer.parseInt(JOptionPane.showInputDialog(null, "1.- Circulo\n2.- rectangulo\n3.- triangulo\n4.-Cuadrado\n5.-menu principal","Menu Area",JOptionPane.INFORMATION_MESSAGE));
	switch (opc)
	{
	case 1:
		areaCirculo();
		break;
	case 2:
		areaRectangulo();
		break;
	case 3:
		areaTriangulo();
		break;
	case 4:
		areaCuadrado();
		break;
	case 5:
		menuPrincipal();
		break;
		default:
			JOptionPane.showMessageDialog(null, "error!!!!!","opcion invalida",JOptionPane.ERROR_MESSAGE);
	}//fin del switch
	}while (opc!=5);
	
	}//fin del metodo area
	private static void areaCuadrado() {
		
		
	}
	private static void areaTriangulo() {
	
		
	}
	private static void areaRectangulo() {
	
		
	}
	private static void areaCirculo() {
		double r;
		r=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el radio","area circulo",JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, Math.PI*Math.pow(r, 2),"area circulo",JOptionPane.INFORMATION_MESSAGE);
		
	}
	private static void menuPerimetro() {
		int opc;
		do {
		opc=Integer.parseInt(JOptionPane.showInputDialog(null, "1.- Circulo\n2.- rectangulo\n3.- triangulo\n4.-Cuadrado\n5.-menu principal","Menu Perimetro",JOptionPane.INFORMATION_MESSAGE));
		switch (opc)
		{
		case 1:
			periCirculo();
			break;
		case 2:
			periRectangulo();
			break;
		case 3:
			periTriangulo();
			break;
		case 4:
			periCuadrado();
			break;
		case 5:
			menuPrincipal();
			break;
			default:
				JOptionPane.showMessageDialog(null, "error!!!!!","opcion invalida",JOptionPane.ERROR_MESSAGE); 	
	}
 }while(opc!=5);
}

	private static void periCuadrado() {
		double l;
		l=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el lado","perimetro cuadrado",JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, l+l+l+l,"area cuadrado",JOptionPane.INFORMATION_MESSAGE);
	}
	private static void periTriangulo() {
	
	}
	private static void periRectangulo() {
		double b,h;
		h=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese la altura","perimetro rectangulo",JOptionPane.INFORMATION_MESSAGE));
		b=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese la base","perimetro rectangulo",JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, h+h+b+b,"area cuadrado",JOptionPane.INFORMATION_MESSAGE);
	}
	private static void periCirculo() {
		double d;
		d=Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el radio","perimetro circulo",JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, Math.PI*d,"area circulo",JOptionPane.INFORMATION_MESSAGE);
	}//fin del main
}