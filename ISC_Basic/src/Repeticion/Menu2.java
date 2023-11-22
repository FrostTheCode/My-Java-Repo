package Repeticion;

import javax.swing.JOptionPane;

public class Menu2 {

	public static void main(String[] args) {
		int opc,i;
     opc=Integer.parseInt(JOptionPane.showInputDialog("1.- Pares \n2.- Impares \n3.- Pares 2 \n4.- Impares 2 \n salir"));

				  switch (opc) {
			        case 1:
			        {//inmprime los primeros 10 numeros pares
			        	for (i=0;i<=20;i+=2)
			        	System.out.println(i+"\t");
			        }
			        	break;
			        case 2:
			        {//print the first 10 umpar numbers
			        	for (i=1;i<=20;i+=2)
			        		System.out.println(i+"\t");
			        }
			        	break;
			        case 3:{
			        	for (i=0;i<=20;i++) 
			        	{
			        		if (i%2==0)
			        		System.out.println(i+"\t");
			        	}
			        }
			        	break;
			        case 4:
			        {
			        	for (i=0;i<=20;i++) 
			        	{
			        		if (i%2==0)
			        		System.out.println(i+"\t");
			        	}
			        }
			        	break;
				default:
					System.out.println("no autorisado");
				
				
				  }
	}

}
