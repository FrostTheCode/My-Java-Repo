package lista;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		Simpl li=new Simpl();
		int opc=0,el;
		do{
			
			try {opc=Integer.parseInt(JOptionPane.showInputDialog(null, ""
					+ "1.Agregar un elemento al inicio\n2.agregar un elemento al final"
					+ "\n3.mostrar los datos de la lista\n4.eliminar un elemento del inicio de la lista"
					+ "\n5.Elimina un elemento del final de la lista\n6.elimina un elemento en espesifico"
					+ "\n7.salir","menu de opciones",3)); 			
			
			switch(opc)
			{
			case 1:
				try {el=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento: ","insertando al inicio",3));}
				catch (NumberFormatException n) {JOptionPane.showMessageDialog(null, "Error "+n.getMessage());}
				break;
			case 2:
				try {el=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento"
						+ "insertado al final",3)); li.agIn(el);}
				catch (NumberFormatException n) {JOptionPane.showMessageDialog(null, "Error "+n.getMessage());}
				break;
			case 3:
				li.moslis();
				break;
			case 4:
				el=li.borrIn();
				JOptionPane.showMessageDialog(null, "el elemento eliminado es: "+el,
						"eliminando nodo del inicio",JOptionPane.INFORMATION_MESSAGE);
				break;
			case 5:
				el=li.borrFin();
				JOptionPane.showMessageDialog(null, "el elemento eliminado es: "+el,
						"eliminando nodo del final",JOptionPane.INFORMATION_MESSAGE);
				break;
			case 6:
				el=Integer.parseInt(JOptionPane.showInputDialog("ingresa el elemento a eliminar: "));
				li.eliminar(el);
				break;
			case 7:
				System.exit(0);
				break;
				default: 
					break;
			}//fin del switch
			}//fin del try
		
			catch(Exception e)
			{}
			
		}while (opc!=6);

	}

}
