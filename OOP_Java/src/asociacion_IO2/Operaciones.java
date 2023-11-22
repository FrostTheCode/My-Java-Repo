package asociacion_IO2;

import javax.swing.JOptionPane;

public class Operaciones {
	int n1,n2,v;
	public int Suma(int x,int y)
	{
		return x+y;
	}
	public int res(int x,int y)
	{
		return x-y;
	}
	public int mul(int x,int y)
	{
		return x*y;
	}
	public void mense()
	{
		int opc;
		do {
		opc=Integer.parseInt(JOptionPane.showInputDialog("1.-suma\n2.-resta\n3.-multiplicacion\n4.-salir"));
		switch (opc)
		{
		case 1:
			capsum();
			break;
		case 2:
			capres();
			break;
		case 3:
			capmul();
			break;
		case 4:
			System.exit(0);
			break;
			default:
			   JOptionPane.showMessageDialog(null, "opcion incorrecta, intentelo de nuevo ","nio ho",JOptionPane.ERROR_MESSAGE);
		}
		}while(opc!=4);
	}
	public void capsum()
	{
		n1=Integer.parseInt(JOptionPane.showInputDialog("inserte el valor 1"));
		n2=Integer.parseInt(JOptionPane.showInputDialog("inserte el valor 2"));
		v=Suma(n1, n2);
		JOptionPane.showMessageDialog(null, "el resultado de la suma es "+v,"mira mama una suma",JOptionPane.INFORMATION_MESSAGE);
	}
	public void capres()
	{
		n1=Integer.parseInt(JOptionPane.showInputDialog("inserte el valor 1"));
		n2=Integer.parseInt(JOptionPane.showInputDialog("inserte el valor 2"));
		v=res(n1, n2);
		JOptionPane.showMessageDialog(null, "el resultado de la resta es "+v,"la resta de todas las restas",JOptionPane.INFORMATION_MESSAGE);
		
	}
	public void capmul()
	{
		n1=Integer.parseInt(JOptionPane.showInputDialog("inserte el valor 1"));
		n2=Integer.parseInt(JOptionPane.showInputDialog("inserte el valor 2"));
		v=mul(n1,n2);
		JOptionPane.showMessageDialog(null, "el resultado de la multiplicacion es "+v,"las multiplicaciones",JOptionPane.INFORMATION_MESSAGE);
	}

}
