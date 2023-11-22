package Asosioacion;

import javax.swing.JOptionPane;

public class MenuDivisas {
	public void menu()
	{
		Pesodolar ps = new Pesodolar();
		Dolarpeso dp=new Dolarpeso();
		pesoEuro pe=new pesoEuro();
		EuroPeso ep=new EuroPeso();
		Dolareuro de=new Dolareuro();
		Eurodolar ed=new Eurodolar();
		
		int opc;
		do {
		opc=Integer.parseInt(JOptionPane.showInputDialog("1.-peso a dollar\n2.-dollar a peso\n3.-peso a euro\n4.-euro a peso\n5.-euro a dollar\n6.-dollar a euro\n7.-salir"));
		switch (opc)
		{
		case 1:
			ps.mxusd();
			break;
		case 2:
			dp.udsmx();
			break;
		case 3:
			pe.mxeur();
			break;
		case 4:
			ep.eurmx();
			break;
		case 5:
			de.usdeur();
			break;
		case 6:
			ed.eurusd();
			break;
		case 7:
			System.exit(0);
			break;
			default:
				JOptionPane.showMessageDialog(null,"opcion invalida");
				break;
		}
		}while(opc<=7);
		
	}

}
