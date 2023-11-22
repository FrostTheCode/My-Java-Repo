package ListaCirculares;

import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		listaC li=new listaC();
		int opc=0,ele;
		boolean eliminao=false;
		do 
		{
		
			ele=Integer.parseInt(JOptionPane.showInputDialog(null,""
					+ "1.Agregar un nodo a la lista circular\n"
					+ "2.eliminar un nodo de la lista circular\n"
					+ "3.mostrar los datos de la lista circular\n"
					+ "4.salir\n"
					+ "que se desea realizar?:","menu de opciones",JOptionPane.INFORMATION_MESSAGE));
		
		switch (opc)
		{
		case 1:
			ele=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento del nodo","nodo agregado a la lista",JOptionPane.INFORMATION_MESSAGE));
			li.in(ele);
			break;
		case 2:
			if (!li.esVacio()) {
			ele=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento del nodo a eliminar","nodo eliminado de la lista",JOptionPane.INFORMATION_MESSAGE));
			eliminao=li.elimi(ele);
			if (eliminao)
			{
				JOptionPane.showMessageDialog(null, "el elemento eliminado es "+ele,"lista vacia",JOptionPane.INFORMATION_MESSAGE);
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "el elemento eliminado es "+ele+ " no esta en la lista","elemento vacio",JOptionPane.INFORMATION_MESSAGE);	
			}
			}else
			{
				JOptionPane.showMessageDialog(null, "aun no hay elementos en la lista ","lista vacia",JOptionPane.INFORMATION_MESSAGE);
				
			}
			break;
		case 3:
			if(!li.esVacio())
				li.mosLis();
			else
				JOptionPane.showMessageDialog(null, "no hay nodos sgregados aun","lista vacia",JOptionPane.INFORMATION_MESSAGE);
			break;
		case 4:
			System.exit(0);
		}
		
		
		}while (opc!=5);
	}

}
