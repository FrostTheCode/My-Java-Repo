package Trabajos2;

import javax.swing.JOptionPane;

public class Eje12 {

	public static void main(String[] args) {
		String name,p1,r1="moscu",p2,r2="4",p3,r3="si",p4,r4="no",p5,r5="la tierra",p6,r6="el aguila calva",p7,r7="la de un elipse",p8,r8="no",p9,r9="",p10,r10="";
		int a=0;
		name=JOptionPane.showInputDialog(null,"ingresa tu nombre","nombre",JOptionPane.INFORMATION_MESSAGE);
		p1=JOptionPane.showInputDialog(null,"capital de rusia","pregunta 1",JOptionPane.INFORMATION_MESSAGE);
	    if (r1.equals(p1.toLowerCase()))
	    	a++;    	
	    p2=JOptionPane.showInputDialog(null," 2+2 ","pregunta 2"); 
	    if (r2.equals(p2.toLowerCase())) 
            a++;	    	
            JOptionPane.showMessageDialog(null,name+" obtiviste "+a+" aciertos " );
	    p3=JOptionPane.showInputDialog(null,"fiji es un pais? ","pregunta 3"); 
	    if (r3.equals(p3.toLowerCase()))
	    	a++;
	    	 JOptionPane.showMessageDialog(null,name+" obtiviste "+a+" aciertos " );
	    p4=JOptionPane.showInputDialog(null,"el nuevo mundo es el continente de oceania?", "pregunta 5"); 
	    if (r4.equals(p4.toLowerCase()))
             a++;	
	    JOptionPane.showMessageDialog(null,name+" obtiviste "+a+" aciertos " );
	    p5=JOptionPane.showInputDialog(null," cual es el planeta azul? "); 
	    if (r5.equals(p5.toLowerCase())) 
	         a++;
	    JOptionPane.showMessageDialog(null,name+" obtiviste "+a+" aciertos " );
	    
	    p6=JOptionPane.showInputDialog(null,"cual es el animal nacional de estados unidos?", "pregunta 6"); 
	    if (r6.equals(p6.toLowerCase())) {
                	a++;
                	JOptionPane.showMessageDialog(null,name+" obtiviste "+a+" aciertos " );
	    }
	    p7=JOptionPane.showInputDialog(null,"que forma tiene la tierra?","pregunta 7");
	    if (r7.equals(p7.toLowerCase())) {
             a++;	    	
             JOptionPane.showMessageDialog(null,name+" obtiviste "+a+" aciertos " );
	    }
	    
	    p8=JOptionPane.showInputDialog(null,"el color negro y blanco existen?","pregunta 8"); 
	    if (r8.equals(p8.toLowerCase())){	 
	    	a++;
	    	JOptionPane.showMessageDialog(null,name+" obtiviste "+a+" aciertos " );
	    }
	    p9=JOptionPane.showInputDialog(null,"cual es la velocidad de la gravedad?","pregunta 9"); 
	    if (r9.equals(p9.toLowerCase())) {
             a++;
             JOptionPane.showMessageDialog(null,name+" obtiviste "+a+" aciertos " );
	    }
	    p10=JOptionPane.showInputDialog(null,"Kono Dio da?","pregunta 10"); 
	    if (r10.equals(p10.toLowerCase())) {
             a++;
             JOptionPane.showMessageDialog(null,name+" obtiviste "+a+" aciertos " );
             
	    }
	    else JOptionPane.showMessageDialog(null,"Nani");
	    
	    JOptionPane.showMessageDialog(null,name+" Gracias por Responder :3");
	}

}
