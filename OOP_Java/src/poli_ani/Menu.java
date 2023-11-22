package poli_ani;

import javax.swing.JOptionPane;

public class Menu {
	INg i=new INg();
	public void menu()
	{
		 int opc;
    	 do {
    	 opc=Integer.parseInt(JOptionPane.showInputDialog(null,"1.-Alta del canino\n2.-salir del programa","Menu de pesona",JOptionPane.INFORMATION_MESSAGE));
    	 switch(opc)
    	 {
    	 case 1:
    		 i.ing_can();
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
