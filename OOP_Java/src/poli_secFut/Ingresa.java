package poli_secFut;

import javax.swing.JOptionPane;

public class Ingresa {
	Imprime i=new Imprime();
	public void ing_fut()
	{
		String name,last,pos;
		int id,age,num;
		double peso;
		float pay;
		name=JOptionPane.showInputDialog("ingresa el nombre del futbolista");
		last=JOptionPane.showInputDialog("ingresa el apellido del futbolista");
	    id=Integer.parseInt(JOptionPane.showInputDialog("ingresa la id del futbolista"));
	    age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del futbolista"));
	    peso=Integer.parseInt(JOptionPane.showInputDialog("ingresa el peso del futbolista"));
	    pos=JOptionPane.showInputDialog("ingresa la posicion del futbolista");
	    num=Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero del futbolista"));
	    pay=Float.parseFloat(JOptionPane.showInputDialog("ingresa el Salario del futbolista"));
	    
	    SecFut s=new Futbolista(id, name, last, peso, age,pos,num,pay);
        JOptionPane.showMessageDialog(null, i.imp_fut((Futbolista) s),"datos del Futbolista",JOptionPane.INFORMATION_MESSAGE);
	}
	public void ing_mas()
	{
		String name,last,esp,email;
		int id,age,exp;
		double peso;
		name=JOptionPane.showInputDialog("ingresa el nombre del Masajista");
		last=JOptionPane.showInputDialog("ingresa el apellido del Masajista");
	    id=Integer.parseInt(JOptionPane.showInputDialog("ingresa la id del Masajista"));
	    age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del Masajista"));
	    peso=Integer.parseInt(JOptionPane.showInputDialog("ingresa el peso del Masajista"));
	    esp=JOptionPane.showInputDialog("ingresa la especialidad del Masajista");
	    exp=Integer.parseInt(JOptionPane.showInputDialog("ingresa la experiencia del Masajista"));
	    email=JOptionPane.showInputDialog("ingresa el email del Masajista");
	    
	    SecFut s=new Masajista(id, name, last, peso, age,esp,exp,email);
        JOptionPane.showMessageDialog(null, i.imp_mas((Masajista) s),"datos del Masajista",JOptionPane.INFORMATION_MESSAGE);
	}
	public void ing_ent()
	{
		String name,last,idfed,cam;
		int id,age,team;
		double peso;
		name=JOptionPane.showInputDialog("ingresa el nombre del entrenador");
		last=JOptionPane.showInputDialog("ingresa el apellido del entrenador");
	    id=Integer.parseInt(JOptionPane.showInputDialog("ingresa la id del entrenador"));
	    age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del entrenador"));
	    peso=Integer.parseInt(JOptionPane.showInputDialog("ingresa el peso del entrenador"));
	    idfed=JOptionPane.showInputDialog("ingresa la Idfed del entrenador");
	    team=Integer.parseInt(JOptionPane.showInputDialog("ingresa el equipo del entrenador"));
	    cam=JOptionPane.showInputDialog("ingresa los Campeonatos del entrenador");
	    
	    SecFut s=new Entrenador(id, name, last, peso, age,idfed,cam,team);
        JOptionPane.showMessageDialog(null, i.imp_ent((Entrenador) s),"datos del Entrenador",JOptionPane.INFORMATION_MESSAGE);
	}
}
