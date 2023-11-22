package poli_animals;

import javax.swing.JTextArea;

public class imprime {
	JTextArea t1=new JTextArea();
	String da="\t\t\t\tAguila\nNombre\tPeso\tEdad\tSexo\tHabitad\tTamano\tEspecie\tGarra\tVista\n";
	public Object imp_agu(aguila a)
	{
		da+="\n";
		da+=a.getName()+"\t"+a.getPeso()+"\t"+a.getAge()+"\t"+a.getSexo()+"\t"+a.getHab()+"\t"+a.getTam()+"\t"+a.getEsp()+"\t"+a.getGarra()+"\t"+a.getVista();
		t1.setText(da);
		return t1; 
	}
	String dt="\t\t\t\tTortuga\nNombre\tPeso\tEdad\tSexo\tHabitad\tTamano\tEspecie\tLongitud\n";
	public Object imp_tor(tortuga t)
	{
		dt+="\n";
		dt+=t.getName()+"\t"+t.getPeso()+"\t"+t.getAge()+"\t"+t.getSexo()+"\t"+t.getHab()+"\t"+t.getTam()+"\t"+t.getEsp()+"\t"+t.getLon();
		t1.setText(dt);
		return t1; 
	}
	String dd="\t\t\t\tDelfin\nNombre\tPeso\tEdad\tSexo\tHabitad\tAlimento\tColor Piel\tRegion\n";
	public Object imp_del(delfin d)
	{
		dd+="\n";
		dd+=d.getName()+"\t"+d.getPeso()+"\t"+d.getAge()+"\t"+d.getSexo()+"\t"+d.getHab()+"\t"+d.getAli()+"\t"+d.getColski()+"\t"+d.getReg();
		t1.setText(dd);
		return t1; 
	}
	String dp="\t\t\t\tPerro\nNombre\tPeso\tEdad\tSexo\tHabitad\tAlimento\tColor Perro\tRaza\n";
	public Object imp_per(perro p)
	{
		dp+="\n";
		dp+=p.getName()+"\t"+p.getPeso()+"\t"+p.getAge()+"\t"+p.getSexo()+"\t"+p.getHab()+"\t"+p.getAli()+"\t"+p.getColper()+"\t"+p.getRaza();
		t1.setText(dp);
		return t1; 
	}
}
