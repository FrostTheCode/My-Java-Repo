package poli_ani;

import javax.swing.JOptionPane;

public class INg {
	Imp im=new Imp();
	public void ing_can()
	{
		String nom,ali,hab,raza,size;
		int age;
		float peso;
		nom=JOptionPane.showInputDialog("ingresa el nombre del Animal");
		ali=JOptionPane.showInputDialog("ingresa el alimento del Animal");
		hab=JOptionPane.showInputDialog("ingresa el habitad del Animal");
		age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del Animal"));
		peso=Float.parseFloat(JOptionPane.showInputDialog("ingresa el peso del Animal"));
		raza=JOptionPane.showInputDialog("ingresa la raza del Animal");
		size=JOptionPane.showInputDialog("ingresa el tamaño del Animal");
		
		Mamifero m=new canino(nom, peso, age, hab, ali, raza, size);
		JOptionPane.showMessageDialog(null, im.imp_can((canino) m),"datos del canino",JOptionPane.INFORMATION_MESSAGE);
	}
}
