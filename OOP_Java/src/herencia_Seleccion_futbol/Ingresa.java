package herencia_Seleccion_futbol;

import javax.swing.JOptionPane;

public class Ingresa {
	Imprime i=new Imprime();
	public void ing_fut()
	{
		String name,last,posi;
		int id,age,num;
		double peso;
		name=JOptionPane.showInputDialog(null,"ingresa el Nombre","datos Futbolista",JOptionPane.INFORMATION_MESSAGE);
		last=JOptionPane.showInputDialog(null,"ingresa el apellido","datos Futbolista",JOptionPane.INFORMATION_MESSAGE);
		posi=JOptionPane.showInputDialog(null,"ingresa la Posicion","datos Futbolista",JOptionPane.INFORMATION_MESSAGE);
		id=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el ID\n(solo numeros):","datos Futbolista",JOptionPane.INFORMATION_MESSAGE));
		age=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa la Edad\n(solo numeros):","datos Futbolista",JOptionPane.INFORMATION_MESSAGE));
		num=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el Numero\n(solo numeros):","datos Futbolista",JOptionPane.INFORMATION_MESSAGE));
		peso=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el Peso","datos Futbolista",JOptionPane.INFORMATION_MESSAGE));
		
		Futbolista f=new Futbolista(id,name,last,peso,age,posi,num);
		JOptionPane.showMessageDialog(null,i.printF(f),"datos del futbolista",JOptionPane.INFORMATION_MESSAGE);
		
	}
	public void ing_mas()
	{
		String name,last,esp;
		int id,age,exp;
		double peso;
		name=JOptionPane.showInputDialog(null,"ingresa el Nombre","datos Masajista",JOptionPane.INFORMATION_MESSAGE);
		last=JOptionPane.showInputDialog(null,"ingresa el apellido","datos Masajista",JOptionPane.INFORMATION_MESSAGE);
		esp=JOptionPane.showInputDialog(null,"ingresa la especificacion","datos Masajista",JOptionPane.INFORMATION_MESSAGE);
		id=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa la ID\n(solo numeros):","datos Masajista",JOptionPane.INFORMATION_MESSAGE));
		age=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa la edad\n(solo numeros):","datos Masajista",JOptionPane.INFORMATION_MESSAGE));
		exp=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa la Experiencia\n(solo numeros):","datos Masajista",JOptionPane.INFORMATION_MESSAGE));
	    peso=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa la Experiencia\n(solo numeros):","datos Masajista",JOptionPane.INFORMATION_MESSAGE));
        
	    Masajista m=new Masajista(id,name,last,peso,age,esp,exp);
	    JOptionPane.showMessageDialog(null,i.printM(m),"datos del Masajista",JOptionPane.INFORMATION_MESSAGE);
	}
	public void ing_ent()
	{
		String name,last,idfed;
		int id,age;
		double peso;
		name=JOptionPane.showInputDialog(null,"ingresa el Nombre","datos Entrenador",JOptionPane.INFORMATION_MESSAGE);
		last=JOptionPane.showInputDialog(null,"ingresa el Apellido","datos Entrenador",JOptionPane.INFORMATION_MESSAGE);
		idfed=JOptionPane.showInputDialog(null,"ingresa el IdFederacion","datos Entrenador",JOptionPane.INFORMATION_MESSAGE);
		id=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el ID\n(solo numeros):","datos Entrenador",JOptionPane.INFORMATION_MESSAGE));
		age=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa la Edad\n(solo numeros):","datos Entrenador",JOptionPane.INFORMATION_MESSAGE));
		peso=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el peso\n(solo numeros):","datos Entrenador",JOptionPane.INFORMATION_MESSAGE));
		
		Entrenador e=new Entrenador(id,name,last,peso,age,idfed);
		JOptionPane.showMessageDialog(null,i.printE(e),"datos del Entrenador",JOptionPane.INFORMATION_MESSAGE);
	}
}
