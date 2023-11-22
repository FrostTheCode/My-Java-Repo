package herencia_empleado;

import javax.swing.JTextArea;

public class Imprime {
	JTextArea t1=new JTextArea();
	String dD="\t\t\t\tDirector\nNombre\tA. Paterno\tA. Materno\tEdad\tSexo\tDireccion\tPago\tBono\n";
	public Object printD(Director d)
	{
		dD+="_____________________________________________________________________________________________________________________________\n";
		dD+=d.getName()+"\t"+d.getMid()+"\t"+d.getLast()+"\t"+d.getAge()+"\t"+d.getSexo()+"\t"+d.getDir()+"\t"+d.getPay()+"\t"+d.getBono();
		t1.setText(dD);
		return t1;
	}
	String dM="\t\t\t\tDirector\nNombre\tA. Paterno\tA. Materno\tEdad\tSexo\tDireccion\tPago\tArea\n";
	public Object printM(Mantenimiento m)
	{
		dM+="_____________________________________________________________________________________________________________________________\n";
		dM+=m.getName()+"\t"+m.getMid()+"\t"+m.getLast()+"\t"+m.getAge()+"\t"+m.getSexo()+"\t"+m.getDir()+"\t"+m.getPay()+"\t"+m.getArea();
		t1.setText(dM);
		return t1;
	}
	String dI="\t\t\t\tDirector\nNombre\tA. Paterno\tA. Materno\tEdad\tSexo\tDireccion\tPago\tCorreo\tTelefono\n";
	public Object printI(Informatico i)
	{
		dI+="_____________________________________________________________________________________________________________________________\n";
		dI+=i.getName()+"\t"+i.getMid()+"\t"+i.getLast()+"\t"+i.getAge()+"\t"+i.getSexo()+"\t"+i.getDir()+"\t"+i.getPay()+"\t"+i.getCorreo()+"\t"+i.getTelefono();
		t1.setText(dI);
		return t1;
	}
	
	
}
