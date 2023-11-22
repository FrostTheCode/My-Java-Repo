package Herencia_Examen;

import javax.swing.JOptionPane;

public class Ingresa {
	Imprime i=new Imprime();
	public void ing_a()
	{
		String name,sexo,hab,tam,esp,gar,vis;
		double peso;
		int age;
		name=JOptionPane.showInputDialog("ingresa el nombre del aguila");
		peso=Integer.parseInt(JOptionPane.showInputDialog("ingresa el peso del aguila"));
		age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del aguila"));
		sexo=JOptionPane.showInputDialog("ingresa el sexo del aguila");
		hab=JOptionPane.showInputDialog("ingresa el habitad del aguila");
		tam=JOptionPane.showInputDialog("ingresa el tamano del aguila");
		esp=JOptionPane.showInputDialog("ingresa la especia del aguila");
		gar=JOptionPane.showInputDialog("ingresa las garras del aguila");
		vis=JOptionPane.showInputDialog("ingresa la vista del aguila");
		
		Aguila A=new Aguila(name, peso, age, sexo, hab, tam, esp,gar,vis);
		JOptionPane.showMessageDialog(null,i.printA(A),"datos del aguila",JOptionPane.INFORMATION_MESSAGE);
	}
	public void ing_t()
	{
		String name,sexo,hab,tam,esp,log;
		double peso;
		int age;
		name=JOptionPane.showInputDialog("ingresa el nombre de la tortuga");
		peso=Integer.parseInt(JOptionPane.showInputDialog("ingresa el peso de la tortuga"));
		age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad de la tortuga"));
		sexo=JOptionPane.showInputDialog("ingresa el sexo de la tortuga");
		hab=JOptionPane.showInputDialog("ingresa el habitad de la tortuga");
		tam=JOptionPane.showInputDialog("ingresa el tamano de la tortuga");
		esp=JOptionPane.showInputDialog("ingresa la especia de la tortuga");
		log=JOptionPane.showInputDialog("ingresa la longitud de la tortuga");
		
		
	    Tortuga T=new Tortuga(name, peso, age, sexo, hab, tam, esp,log);
		JOptionPane.showMessageDialog(null,i.printT(T),"datos de la Tortuga",JOptionPane.INFORMATION_MESSAGE);
	}
	public void ing_d()
	{
		String name,sexo,hab,ali,col;
		double peso;
		int age;
		name=JOptionPane.showInputDialog("ingresa el nombre del delfin");
		peso=Integer.parseInt(JOptionPane.showInputDialog("ingresa el peso del delfin"));
		age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del delfin"));
		sexo=JOptionPane.showInputDialog("ingresa el sexo del delfin");
		hab=JOptionPane.showInputDialog("ingresa el habitad del delfin");
		ali=JOptionPane.showInputDialog("ingresa el alimento del delfin");
		col=JOptionPane.showInputDialog("ingresa la color del delfin");
		
		Delfin D=new Delfin(name, peso, age, sexo, hab,ali,col);
		JOptionPane.showMessageDialog(null,i.printD(D),"datos del delfin",JOptionPane.INFORMATION_MESSAGE);
	}
	public void ing_p()
	{
		String name,sexo,hab,ali,colo;
		double peso;
		int age;
		name=JOptionPane.showInputDialog("ingresa el nombre del perro");
		peso=Integer.parseInt(JOptionPane.showInputDialog("ingresa el peso del perro"));
		age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del perro"));
		sexo=JOptionPane.showInputDialog("ingresa el sexo del perro");
		hab=JOptionPane.showInputDialog("ingresa el habitad del perro");
		ali=JOptionPane.showInputDialog("ingresa el alimento del perro");
		colo=JOptionPane.showInputDialog("ingresa la color del perro");
		
		Perro P=new Perro(name, peso, age, sexo, hab,ali,colo);
		JOptionPane.showMessageDialog(null,i.printP(P),"datos del perro",JOptionPane.INFORMATION_MESSAGE);
	}

}
