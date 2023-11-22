package MD_Pila;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int opc=0,el=0;
		Pila pi=new Pila();
		
		do {
			try {
				
				opc=Integer.parseInt(JOptionPane.showInputDialog(null,""
						+ "1.Empujar un elemento de la pila\n"
						+ "2.sacar un elemento de la pila\n"
						+ "3.la pila esta vacia???\n"
						+ "4.que elemento esta en la cima?\n"
						+ "5.Tamaño de la pila\n"
						+"6.vaciar pila\n"
						+ "7.salir","Que se desea realizar?:",JOptionPane.INFORMATION_MESSAGE));
			
			switch (opc)
			{
			case 1:
				el=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento a empujar en la pila","apilando datos ",JOptionPane.INFORMATION_MESSAGE));
				pi.emp(el);
				break;
			case 2:
				if(!pi.esVacia())
					JOptionPane.showMessageDialog(null, "el elemento a sacar es"+pi.sacar(),"obteniendo datos de la pila",JOptionPane.INFORMATION_MESSAGE);
				else
					JOptionPane.showMessageDialog(null, "la pila esta vacia","pila vacia ",JOptionPane.INFORMATION_MESSAGE);
				break;
			case 3:
				if(!pi.esVacia())
					JOptionPane.showMessageDialog(null, "la pila esta vacia","pila vacia",JOptionPane.INFORMATION_MESSAGE);
				else
					JOptionPane.showMessageDialog(null, "la pila tiene datos","la pila contiene datos",JOptionPane.INFORMATION_MESSAGE);
				break;
			case 4:
				if(!pi.esVacia())
					JOptionPane.showMessageDialog(null, "el elemento de la cima de la pila es: "+pi.Cima(),"cima de la pila",JOptionPane.INFORMATION_MESSAGE);
				else
					JOptionPane.showMessageDialog(null, "la pila esta vacia","pila vacia",JOptionPane.INFORMATION_MESSAGE);
				break;
			case 5:
					JOptionPane.showMessageDialog(null, "el tamano de la pila es: "+pi.tamanioPila(),"tamano pila",JOptionPane.INFORMATION_MESSAGE);
				break;
			case 6:
				if(!pi.esVacia())
				{
					pi.limpPila();
					JOptionPane.showMessageDialog(null, "la pila se ha vaciado","vaciando pila",JOptionPane.INFORMATION_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(null, "la pila esta vacia","no hay nada que vaciar",JOptionPane.INFORMATION_MESSAGE);			
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "aplicacion finalizada", "end",JOptionPane.INFORMATION_MESSAGE);
			}
			}catch(NumberFormatException n) {
				JOptionPane.showMessageDialog(null, "error" + n.getMessage());
			}//fin catch
		}while (opc!=7);

	}

}
