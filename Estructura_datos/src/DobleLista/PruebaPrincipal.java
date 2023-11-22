package DobleLista;

import javax.swing.JOptionPane;

public class PruebaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaD li=new ListaD();
		int opc=0,ele;
		do 
		{
		try
		{
			opc=Integer.parseInt(JOptionPane.showInputDialog(null,""
					+ "1.Agregar un nodo al inicio\n"
					+ "2.Mostrar un nodo al final\n"
					+ "3.mostrar la lista de inicio a fin\n"
					+ "4.mostrar la lista de fin a inicio\n"
					+ "5.Eliminar un nodo del inicio\n"
					+ "6.Eliminar un Nodo del final\n"
					+ "7.salir\n"
					+ "que se desea realizar?:","menu de opciones",JOptionPane.INFORMATION_MESSAGE));
		
		switch (opc)
		{
		case 1:
			ele=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento del nodo","nodo agregado al inicio",JOptionPane.INFORMATION_MESSAGE));
			li.agInicio(ele);
			break;
		case 2:
			ele=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento del nodo","nodo agregado al final",JOptionPane.INFORMATION_MESSAGE));
			li.agFin(ele);
			break;
		case 3:
			if(!li.estaVacia())
				li.MostLisInFin();
			else
				JOptionPane.showMessageDialog(null, "no hay nodos sgregados aun","lista vacia",JOptionPane.INFORMATION_MESSAGE);
			break;
		case 4:
			if(!li.estaVacia())
				li.MostLisFinIn();
			else
				JOptionPane.showMessageDialog(null, "no hay nodos sgregados aun","lista vacia",JOptionPane.INFORMATION_MESSAGE);
			break;
		case 5:
			if(!li.estaVacia())
			{
				ele=li.EliIn();
				JOptionPane.showMessageDialog(null, "el elemento de la lista eliminado es: "+ele,"lista vacia",JOptionPane.INFORMATION_MESSAGE);
			}
			else
				JOptionPane.showMessageDialog(null, "no hay nodos","lista vacia",JOptionPane.INFORMATION_MESSAGE);
			break;
		case 6:
			if(!li.estaVacia())
			{
				ele=li.EliFin();
				JOptionPane.showMessageDialog(null, "el elemento de la lista eliminado es: "+ele,"lista vacia",JOptionPane.INFORMATION_MESSAGE);
			}
			else
				JOptionPane.showMessageDialog(null, "no hay nodos","lista vacia",JOptionPane.INFORMATION_MESSAGE);			
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "aplicacion finalizada", "end",JOptionPane.INFORMATION_MESSAGE);
		}
		
		}//fin del try
		catch(NumberFormatException n)
		{
			JOptionPane.showMessageDialog(null, "error "+ n.getMessage());
		}
		}while (opc!=5);
		

	}

}
