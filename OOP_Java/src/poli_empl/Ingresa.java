package poli_empl;

import javax.swing.JOptionPane;

public class Ingresa {
	Imprime in=new Imprime();
	public void ing_dir()
	{
		String name,lastp,lastm,sex,dir,emp;
		int id,age;
		double pay,bono;
		name=JOptionPane.showInputDialog("ingresa el nombre del director");
		lastp=JOptionPane.showInputDialog("ingresa el apellido paterno del director");
		lastm=JOptionPane.showInputDialog("ingresa el apellido materno del director");
		sex=JOptionPane.showInputDialog("ingresa el sexo del director");
		dir=JOptionPane.showInputDialog("ingresa la direccion del director");
		id=Integer.parseInt(JOptionPane.showInputDialog("ingresa el id del director"));
		age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del director"));
		pay=Double.parseDouble(JOptionPane.showInputDialog("ingresa el salario del director"));
		bono=Double.parseDouble(JOptionPane.showInputDialog("ingresa el Bono del director"));
		emp=JOptionPane.showInputDialog("ingresa la empresa del director");
		
		Empleado e=new Director(id, name, lastp, lastm, age, sex, dir, pay,bono,emp);
		JOptionPane.showMessageDialog(null, in.imp_dir((Director) e));
	}
	public void ing_man()
	{
		String name,lastp,lastm,sex,dir,area,turno;
		int id,age;
		double pay;
		name=JOptionPane.showInputDialog("ingresa el nombre de Mantenimiento");
		lastp=JOptionPane.showInputDialog("ingresa el apellido paterno de Mantenimiento");
		lastm=JOptionPane.showInputDialog("ingresa el apellido materno de Mantenimiento");
		sex=JOptionPane.showInputDialog("ingresa el sexo de Mantenimiento");
		dir=JOptionPane.showInputDialog("ingresa la direccion de Mantenimiento");
		id=Integer.parseInt(JOptionPane.showInputDialog("ingresa el id de Mantenimiento"));
		age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad de Mantenimiento"));
		pay=Double.parseDouble(JOptionPane.showInputDialog("ingresa el salario de Mantenimiento"));
		area=JOptionPane.showInputDialog("ingresa el area de Mantenimiento");
		turno=JOptionPane.showInputDialog("ingresa el turno de Mantenimiento");
		
		Empleado e=new Mantenimiento(id, name, lastp, lastm, age, sex, dir, pay,area,turno);
		JOptionPane.showMessageDialog(null, in.imp_man((Mantenimiento) e));
	}
	public void ing_inf()
	{
		String name,lastp,lastm,sex,dir,email,web;
		int id,age,tel;
		double pay;
		name=JOptionPane.showInputDialog("ingresa el nombre del Informatico");
		lastp=JOptionPane.showInputDialog("ingresa el apellido paterno del Informatico");
		lastm=JOptionPane.showInputDialog("ingresa el apellido materno del Informatico");
		sex=JOptionPane.showInputDialog("ingresa el sexo del Informatico");
		dir=JOptionPane.showInputDialog("ingresa la direccion del Informatico");
		id=Integer.parseInt(JOptionPane.showInputDialog("ingresa el id del Informatico"));
		age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del Informatico"));
		pay=Double.parseDouble(JOptionPane.showInputDialog("ingresa el salario del Informatico"));
		email=JOptionPane.showInputDialog("ingresa el correo del Informatico");
		web=JOptionPane.showInputDialog("ingresa el turno del Informatico");
		tel=Integer.parseInt(JOptionPane.showInputDialog("ingresa el telefono del informatico"));
		
		Empleado e=new Informatico(id, name, lastp, lastm, age, sex, dir, pay,email,tel,web);
		JOptionPane.showMessageDialog(null, in.imp_inf((Informatico) e));
	}

}
