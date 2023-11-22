package Herencia_Examen;

import javax.swing.JTextArea;

public class Imprime {
	JTextArea t1=new JTextArea();
	String dtsA="\t\t\t\tAguila\nNombre\tPeso\tEdad\tSexo\tHabitad\tTamano\tEspecie\tGarras\tVista\n";
	public Object printA(Aguila a)
	{
		dtsA+="________________________________________________________________________________________________________________________________________________________________________\n";
		dtsA+=a.getName()+"\t"+a.getPeso()+"\t"+a.getAge()+"\t"+a.getSexo()+"\t"+a.getHab()+"\t"+a.getTam()+"\t"+a.getEsp()+"\t"+a.getGar()+"\t"+a.getVis();
		t1.setText(dtsA);
		return t1;
	}
	String dtsT="\t\t\t\tTortuga\nNombre\tPeso\tEdad\tSexo\tHabitad\tTamano\tEspecie\tLongitud\n";
	public Object printT(Tortuga t)
	{
		dtsT+="___________________________________________________________________________________________________________________________________________________________________________\n";
		dtsT+=t.getName()+"\t"+t.getPeso()+"\t"+t.getAge()+"\t"+t.getSexo()+"\t"+t.getHab()+"\t"+t.getTam()+"\t"+t.getEsp()+"\t"+t.getLog();
		t1.setText(dtsT);
		return t1;
	}
	String dtsD= "\t\t\t\tDelfin\nNombre\tPeso\tEdad\tSexo\tHabitad\tAlimento\tColor de Piel\n";
	public Object printD(Delfin d)
	{
		dtsD+="______________________________________________________________________________________________________________________________________________________________________________\n";
		dtsD+=d.getName()+"\t"+d.getPeso()+"\t"+d.getAge()+"\t"+d.getSexo()+"\t"+d.getHab()+"\t"+d.getAli()+"\t"+d.getCol();
		t1.setText(dtsD);
		return t1;	
	}
	String dtsP= "\t\t\t\tPerro\nNombre\tPeso\tEdad\tSexo\tHabitad\tAlimento\tColor de Pelaje\n";
public Object printP(Perro p)
{
	dtsP+="_________________________________________________________________________________________________________________________________________________________________________________________\n";
	dtsP+=p.getName()+"\t"+p.getPeso()+"\t"+p.getAge()+"\t"+p.getSexo()+"\t"+p.getHab()+"\t"+p.getAli()+"\t"+p.getColo();
	t1.setText(dtsP);
	return t1;
}
}
