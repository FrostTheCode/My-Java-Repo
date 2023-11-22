package Trabajos2;



import javax.swing.JOptionPane;

public class Eje4 {

	public static void main(String[] args) {
		int ht;
		ht=Integer.parseInt(JOptionPane.showInputDialog("ingresa las horas trabajadas"));
        if(ht >= 40) {
        	JOptionPane.showMessageDialog(null,"su salario es: "+((ht*12)));
        }
        else {
        	JOptionPane.showMessageDialog(null,"su salario es: "+(ht-40)*16+ht*12+" euros");
        
        } 
	}

}
