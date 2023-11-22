package poli_empl;

import javax.swing.JTextArea;

public class Imprime {
	JTextArea t1=new JTextArea();
	String dd="\t\t\t\tDirector\nNombre\tA.Paterno\tA.Materno\tSexo\tEdad\tID\tDireccion\tSalario\tBono\tEmpresa\n"; 
	public Object imp_dir(Director d)
	{
		dd+="_______________________________________________________________________________________________________________________\n";
		dd+=d.getName()+"\t"+d.getLastp()+"\t"+d.getLastm()+"\t"+d.getSex()+"\t"+d.getAge()+"\t"+d.getId()+"\t"+d.getDir()+"\t"+d.getPay()+"\t"+d.getBono()+"\t"+d.getEmp();
		t1.setText(dd);
		return t1;
	}
	String dm="\t\t\t\tMantenimiento\nNombre\tA.Paterno\tA.Materno\tSexo\tEdad\tID\tDireccion\tSalario\tArea\tTurno\n"; 
	public Object imp_man(Mantenimiento m)
	{
		dm+="_______________________________________________________________________________________________________________________\n";
		dm+=m.getName()+"\t"+m.getLastp()+"\t"+m.getLastm()+"\t"+m.getSex()+"\t"+m.getAge()+"\t"+m.getId()+"\t"+m.getDir()+"\t"+m.getPay()+"\t"+m.getArea()+"\t"+m.getTurno();
		t1.setText(dm);
		return t1;
	}
	String di="\t\t\t\tInformatico\nNombre\tA.Paterno\tA.Materno\tSexo\tEdad\tID\tDireccion\tSalario\tCorreo\tTelefono\tSitio Web\n"; 
	public Object imp_inf(Informatico i)
	{
		di+="_______________________________________________________________________________________________________________________\n";
		di+=i.getName()+"\t"+i.getLastp()+"\t"+i.getLastm()+"\t"+i.getSex()+"\t"+i.getAge()+"\t"+i.getId()+"\t"+i.getDir()+"\t"+i.getPay()+"\t"+i.getEmail()+"\t"+i.getTel()+"\t"+i.getWeb();
		t1.setText(di);
		return t1;
	}
}
