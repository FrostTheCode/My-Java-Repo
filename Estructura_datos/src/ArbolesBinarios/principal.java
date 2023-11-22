package ArbolesBinarios;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc=0,el = 0;
		//String nam;
		ArbolBin ar=new ArbolBin();
		do {
			try {
				opc=Integer.parseInt(JOptionPane.showInputDialog(null,
						  "1. Agregar un Nodo\n"
						+ "2. Recorrer el Arbol inOrden\n"
						+ "3. Recorrer el Arbol preOrder\n"
						+ "4. Recorrer el arbol PostOrden\n"
						+ "5. Buscar un nodo en el arbol\n"
						+ "6. Eliminar un nodo del arbol\n"
						+ "7. modificar u un nodo del arbol\n"
						+ "8. generar un Arbol de expresion\n"
						+ "9. Salir\n"
						+ "Elige una opcion:","arboles",
						JOptionPane.QUESTION_MESSAGE));
				
				switch(opc)
				{
				case 1:
					int efe=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la cantidad de nodos a agregar","nodos a agregar",JOptionPane.QUESTION_MESSAGE));
                    if (efe>=11) {
                    	JOptionPane.showMessageDialog(null, "no agregues mas de 10 nodos","Cuidado!!!!!",JOptionPane.INFORMATION_MESSAGE);
                    }else {
                    	for(int n=1;n<=efe;n++){
        					el=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el numero del nodo...","Agregar nodo", JOptionPane.QUESTION_MESSAGE));
        					ar.agNodo(el);
                            }
                    	
                    }
					break;
				case 2:
					if(!ar.esVacio()) {
						System.out.println("Inorden");
						ar.inOrden(ar.raiz);
					System.out.println(" ");
					System.out.println("La Altura de el arbol es: "+ar.alturamax(ar.raiz));
					System.out.println(" ");
					
					}else
						JOptionPane.showMessageDialog(null, "Arbol vacio","Cuidado!!!!!",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 3:
					if(!ar.esVacio()) {
						System.out.println("Preorden");
						ar.preOrden(ar.raiz);
					System.out.println(" ");
					System.out.println("La Altura de el arbol es: "+ar.alturamax(ar.raiz));
					System.out.println(" ");
					}else
						JOptionPane.showMessageDialog(null, "Arbol vacio","Cuidado!!!!!",JOptionPane.INFORMATION_MESSAGE);
					
					break;
				case 4:
					if(!ar.esVacio()) {
						System.out.println("Posorden");
						ar.postOrden(ar.raiz);
					System.out.println(" ");
					System.out.println("La Altura de el arbol es: "+ar.alturamax(ar.raiz));
					System.out.println(" ");
					}else
						JOptionPane.showMessageDialog(null, "Arbol vacio","Cuidado!!!!!",JOptionPane.INFORMATION_MESSAGE);
					
					break;
				case 5:
					if(!ar.esVacio()) {
						el=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el numero de nodo buscado","buscando nodo",JOptionPane.INFORMATION_MESSAGE));
						if (ar.busNodo(el)==null)
							JOptionPane.showMessageDialog(null, "El arbol esta vacio","cuidado!!!",JOptionPane.INFORMATION_MESSAGE);
						else
							System.out.println("nodo Encontrado");
					}
						else
							JOptionPane.showMessageDialog(null, "el arbol esta vacio","cuidado!!!",JOptionPane.INFORMATION_MESSAGE);
					break;
				case 6:
                    if(!ar.esVacio()) {
                    	el=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el numero del nodo a Eliminar...","eliminar nodo",JOptionPane.INFORMATION_MESSAGE));
                    	if (ar.eliminar(el)==false)
                    		JOptionPane.showMessageDialog(null, "El arbol esta vacio","cuidado!!!",JOptionPane.INFORMATION_MESSAGE);
                    	else
                    		JOptionPane.showMessageDialog(null, "El nodo "+el+"a sido eliminado del arbol","Eliminacion completada",JOptionPane.INFORMATION_MESSAGE);
	}
                    else
                    	JOptionPane.showMessageDialog(null, "el arbol esta vacio","cuidado!!!",JOptionPane.INFORMATION_MESSAGE);
                    break;
				case 7:
                    if(!ar.esVacio()) {
                    	el=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el numero del nodo que quiera modificar","modificar nodo",JOptionPane.INFORMATION_MESSAGE));
                    	if (ar.eliminar(el)==false)
                    		JOptionPane.showMessageDialog(null, "El arbol esta vacio","cuidado!!!",JOptionPane.INFORMATION_MESSAGE);
                    	else {
                    		JOptionPane.showMessageDialog(null, "El nodo "+el+"a sera modificado","modificacion en proceso",JOptionPane.INFORMATION_MESSAGE);
                    		el=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el nodo...","Agregar nodo", JOptionPane.QUESTION_MESSAGE));
        					ar.agNodo(el);
                    	}		
                    }
                    else
                    	JOptionPane.showMessageDialog(null, "el arbol esta vacio","cuidado!!!",JOptionPane.INFORMATION_MESSAGE);
                    break;
				case 8:
					ayuda a =  new ayuda();
					String postfix = JOptionPane.showInputDialog(null,"ingrese la operacion deseada","ejemplo ab+cde+** ",JOptionPane.INFORMATION_MESSAGE);
			        Node root = ayuda.construct(postfix);
			        
			        System.out.print("Postfix Expression: ");
			        ayuda.postorder(root);
			 
			        System.out.print("\nInfix Expression: ");
			        ayuda.inorder(root);
			        System.out.println(" ");
					break;
				case 9:
					JOptionPane.showMessageDialog(null, "aplicacion finalizada","fin",JOptionPane.INFORMATION_MESSAGE);
					break;
					default:
						JOptionPane.showMessageDialog(null, "Opcion incorrecta","Warning",JOptionPane.INFORMATION_MESSAGE);
				}
			}catch (NumberFormatException n) {
				JOptionPane.showMessageDialog(null, " Error "+n.getMessage());
			}
		}while(opc!=9);

	}

}
