package Examen_poli;

import javax.swing.JOptionPane;

public class Ingresa {
	Imprime i=new Imprime();
	public void ing_per()
	{
		String name,size,oner,raza,color,sizega;
		int age,npat;
		name=JOptionPane.showInputDialog("ingresa el nombre del G.persa");
		size=JOptionPane.showInputDialog("ingresa el tamaño del G.persa");
		oner=JOptionPane.showInputDialog("ingresa el dueño del G.persa");
		raza=JOptionPane.showInputDialog("ingresa la raza del G.persa");
		age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del G.persa"));
		npat=Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero de patas del G.persa"));
		color=JOptionPane.showInputDialog("ingresa el color del G.persa");
		sizega=JOptionPane.showInputDialog("ingresa el tamaño de las garras del G.persa");
		Felino f=new Persa(name, age, size, oner, raza, npat,color,sizega);
		JOptionPane.showMessageDialog(null, i.imp_per((Persa) f));
	}
	public void ing_Sia()
	{
		String name,size,oner,raza,colojo,colsia;
		int age,npat;
		name=JOptionPane.showInputDialog("ingresa el nombre del G.siames");
		size=JOptionPane.showInputDialog("ingresa el tamaño del G.siames");
		oner=JOptionPane.showInputDialog("ingresa el dueño del G.siames");
		raza=JOptionPane.showInputDialog("ingresa la raza del G.siames");
		age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del G.siames"));
		npat=Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero de patas del G.siames"));
		colojo=JOptionPane.showInputDialog("ingresa el color de ojos del G.siames");
		colsia=JOptionPane.showInputDialog("ingresa el color del G.siames");
		Felino f=new Siames(name, age, size, oner, raza, npat,colojo,colsia);
		JOptionPane.showMessageDialog(null, i.imp_sia((Siames) f));
	}
	public void ing_Afr()
	{
		String name,size,oner,sexo,ali,caza,nfem;
		int age;
		name=JOptionPane.showInputDialog("ingresa el nombre del L.africano");
		size=JOptionPane.showInputDialog("ingresa el tamaño del L.africano");
		oner=JOptionPane.showInputDialog("ingresa el dueño del L.africano");
		sexo=JOptionPane.showInputDialog("ingresa el sexo del L.africano");
		age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del L.africano"));
		ali=JOptionPane.showInputDialog("ingresa el alimento del L.africano");
		caza=JOptionPane.showInputDialog("ingresa la caza del L.africano");
		nfem=JOptionPane.showInputDialog("ingresa el numero de hembras del L.africano");
		Leon l=new Africano(name, age, size, oner, sexo, ali,caza,nfem);
		JOptionPane.showMessageDialog(null, i.imp_afri((Africano) l));
	}
	public void ing_Asi()
	{
		String name,size,oner,sexo,ali,smelena;
		int age,ngarras;
		name=JOptionPane.showInputDialog("ingresa el nombre del L.Asiatico");
		size=JOptionPane.showInputDialog("ingresa el tamaño del L.Asiatico");
		oner=JOptionPane.showInputDialog("ingresa el dueño del L.Asiatico");
		sexo=JOptionPane.showInputDialog("ingresa el sexo del L.Asiatico");
		age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del L.Asiatico"));
		ali=JOptionPane.showInputDialog("ingresa el alimento de patas del L.Asiatico");
		smelena=JOptionPane.showInputDialog("ingresa el tamaño de la melena del L.Asiatico");
		ngarras=Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero de garras del L.Asiatico"));
		Leon l=new Asiatico(name, age, size, oner, sexo, ali,smelena,ngarras);
		JOptionPane.showMessageDialog(null, i.imp_asi((Asiatico) l));
	}
	

}
