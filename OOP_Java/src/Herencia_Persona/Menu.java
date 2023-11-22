package Herencia_Persona;

import javax.swing.JOptionPane;

public class Menu {
	Alta_Estudiante ae=new Alta_Estudiante();
     public void menu()
     {
    	 int opc;
    	 do {
    	 opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Alta de Estudiante\n2.-salir del programa","Menu de pesona",JOptionPane.INFORMATION_MESSAGE));
    	 switch(opc)
    	 {
    	 case 1:ae.alta();
    		 break;
    	 case 2:
    		 System.exit(0);
    		 break;
    		 default:
    			 JOptionPane.showMessageDialog(null, "error de input","error",JOptionPane.ERROR_MESSAGE);
    	 }//fin del switch
    	 }while (opc!=2);//fin del do-while
     }
}
