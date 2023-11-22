package herencia_empleado;

import javax.swing.JOptionPane;

public class Ingresa {
	Imprime in=new Imprime();
	public void ing_Dir()
	{
		String name,mid,last,sexo,dir;
		int id,age;
		double pay,bono;
		name=JOptionPane.showInputDialog("ingresa el nombre del Director");
		mid=JOptionPane.showInputDialog("ingresa el apellido paterno del Director");
		last=JOptionPane.showInputDialog("ingresa el apellido materno del Director");
		sexo=JOptionPane.showInputDialog("ingresa el sexo del Director");
		dir=JOptionPane.showInputDialog("ingresa la direccion del Director");
		id=Integer.parseInt(JOptionPane.showInputDialog("ingresa el ID del Director"));
		age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del Director"));
		pay=Integer.parseInt(JOptionPane.showInputDialog("ingresa el salario del Director"));
		bono=Integer.parseInt(JOptionPane.showInputDialog("ingresa el bono del Director"));
		
		Director d=new Director(id, name, mid, last, age, sexo, dir, pay,bono);
		JOptionPane.showMessageDialog(null,in.printD(d),"datos del aero",JOptionPane.INFORMATION_MESSAGE);
	}
	public void ing_Man()
	{
		String name,mid,last,sexo,dir,area;
		int id,age;
		double pay;
		name=JOptionPane.showInputDialog("ingresa el nombre del Mantenimiento");
		mid=JOptionPane.showInputDialog("ingresa el apellido paterno del Mantenimiento");
		last=JOptionPane.showInputDialog("ingresa el apellido materno del Mantenimiento");
		sexo=JOptionPane.showInputDialog("ingresa el sexo del Mantenimiento");
		dir=JOptionPane.showInputDialog("ingresa la direccion del Mantenimiento");
		id=Integer.parseInt(JOptionPane.showInputDialog("ingresa el ID del Mantenimiento"));
		age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del Mantenimiento"));
		pay=Integer.parseInt(JOptionPane.showInputDialog("ingresa el salario del Mantenimiento"));
		area=JOptionPane.showInputDialog("ingresa el area del Mantenimiento");
		
		Mantenimiento m=new Mantenimiento(id, name, mid, last, age, sexo, dir, pay,area);
		JOptionPane.showMessageDialog(null,in.printM(m),"datos del Mantenimiento",JOptionPane.INFORMATION_MESSAGE);
	}
	public void ing_Inf()
	{
		String name,mid,last,sexo,dir,correo;
		int id,age,telefono;
		double pay;
		name=JOptionPane.showInputDialog("ingresa el nombre del Informatico");
		mid=JOptionPane.showInputDialog("ingresa el apellido paterno del Informatico");
		last=JOptionPane.showInputDialog("ingresa el apellido materno del Informatico");
		sexo=JOptionPane.showInputDialog("ingresa el sexo del Informatico");
		dir=JOptionPane.showInputDialog("ingresa la direccion del Informatico");
		id=Integer.parseInt(JOptionPane.showInputDialog("ingresa el ID del Informatico"));
		age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del Informatico"));
		pay=Integer.parseInt(JOptionPane.showInputDialog("ingresa el salario del Informatico"));
		correo=JOptionPane.showInputDialog("ingresa el correo del Informatico");
		telefono=Integer.parseInt(JOptionPane.showInputDialog("ingresa el telefono del Informatico"));
		
		Informatico i=new Informatico(id, name, mid, last, age, sexo, dir, pay,correo,telefono);
		JOptionPane.showMessageDialog(null,in.printI(i),"datos del Informatico",JOptionPane.INFORMATION_MESSAGE);
		
	}
}
