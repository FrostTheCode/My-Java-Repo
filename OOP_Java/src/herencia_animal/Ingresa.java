package herencia_animal;

import javax.swing.JOptionPane;

public class Ingresa {
	Imp i=new Imp(); 
	public void ing()
	{
		String nom,ali,hab;
		int age;
		float peso;
		nom=JOptionPane.showInputDialog("ingresa el nombre del Animal");
		ali=JOptionPane.showInputDialog("ingresa el alimento del Animal");
		hab=JOptionPane.showInputDialog("ingresa el habitad del Animal");
		age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del Animal"));
		peso=Float.parseFloat(JOptionPane.showInputDialog("ingresa el peso del Animal"));
		Canino c=new Canino(nom, age, peso, ali,hab);
		JOptionPane.showMessageDialog(null,i.imp(c),"datos del Animal",JOptionPane.INFORMATION_MESSAGE);
	}
}
