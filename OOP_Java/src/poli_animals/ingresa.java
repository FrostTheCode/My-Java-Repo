package poli_animals;

import javax.swing.JOptionPane;

public class ingresa {
	imprime i=new imprime();
	public void ing_agu()
	{
		String name,sexo,hab,tam,esp,gar,vis;
		int age;
		double peso;
		name=JOptionPane.showInputDialog("ingresa el nombre del aguila");
		peso=Double.parseDouble(JOptionPane.showInputDialog("ingresa el peso del aguila"));
		age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del aguila"));
		sexo=JOptionPane.showInputDialog("ingresa el sexo del aguila");
		hab=JOptionPane.showInputDialog("ingresa el habitad del aguila");
		tam=JOptionPane.showInputDialog("ingresa el tamano del aguila");
		esp=JOptionPane.showInputDialog("ingresa la especie del aguila");
		gar=JOptionPane.showInputDialog("ingresa la garra del aguila");
		vis=JOptionPane.showInputDialog("ingresa la vista del aguila");
		
		oviparo m=new aguila(name, peso, age, sexo, hab, tam, esp,gar,vis);
		JOptionPane.showMessageDialog(null, i.imp_agu((aguila) m));
	}
	public void ing_tor()
	{
		String name,sexo,hab,tam,esp,lon;
		int age;
		double peso;
		name=JOptionPane.showInputDialog("ingresa el nombre de la tortuga");
		peso=Double.parseDouble(JOptionPane.showInputDialog("ingresa el peso de la tortuga"));
		age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad de la tortuga"));
		sexo=JOptionPane.showInputDialog("ingresa el sexo de la tortuga");
		hab=JOptionPane.showInputDialog("ingresa el habitad de la tortuga");
		tam=JOptionPane.showInputDialog("ingresa el tamano de la tortuga");
		esp=JOptionPane.showInputDialog("ingresa la especie de la tortuga");
		lon=JOptionPane.showInputDialog("ingresa la longitud de la tortuga");
		
		oviparo o=new tortuga(name, peso, age, sexo, hab, tam, esp,lon);
		JOptionPane.showMessageDialog(null, i.imp_tor((tortuga) o));
	}
	public void ing_del()
	{
		String name,sexo,hab,ali,cols,reg;
		int age;
		double peso;
		name=JOptionPane.showInputDialog("ingresa el nombre del delfin");
		peso=Double.parseDouble(JOptionPane.showInputDialog("ingresa el peso del delfin"));
		age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del delfin"));
		sexo=JOptionPane.showInputDialog("ingresa el sexo del delfin");
		hab=JOptionPane.showInputDialog("ingresa el habitad del delfin");
		ali=JOptionPane.showInputDialog("ingresa el alimento del delfin");
		cols=JOptionPane.showInputDialog("ingresa el color de la piel del delfin");
		reg=JOptionPane.showInputDialog("ingresa la region del delfin");
		
		mamifero m=new delfin(name, peso, age, sexo, hab, ali, cols,reg);
		JOptionPane.showMessageDialog(null, i.imp_del((delfin) m));
	}
	public void ing_per()
	{
		String name,sexo,hab,ali,colp,raza;
		int age;
		double peso;
		name=JOptionPane.showInputDialog("ingresa el nombre del perro");
		peso=Double.parseDouble(JOptionPane.showInputDialog("ingresa el peso del perro"));
		age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del perro"));
		sexo=JOptionPane.showInputDialog("ingresa el sexo del perro");
		hab=JOptionPane.showInputDialog("ingresa el habitad del perro");
		ali=JOptionPane.showInputDialog("ingresa el alimento del perro");
		colp=JOptionPane.showInputDialog("ingresa el color del perro");
		raza=JOptionPane.showInputDialog("ingresa la raza del perro");
		
		mamifero m=new perro(name, peso, age, sexo, hab, ali, colp,raza);
		JOptionPane.showMessageDialog(null, i.imp_per((perro) m));
	}
}
