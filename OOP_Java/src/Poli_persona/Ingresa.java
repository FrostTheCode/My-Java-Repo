package Poli_persona;

import javax.swing.JOptionPane;

public class Ingresa {
	Imprime i=new Imprime();
	public void ing_est()
	{
		String name,nat,sex,sco,email;
		int age,prom;
		name=JOptionPane.showInputDialog("ingresa el nombre del estudiante");
		nat=JOptionPane.showInputDialog("ingresa la nacionalidad del estudiante");
		sex=JOptionPane.showInputDialog("ingresa el sexo del estudiante");
		sco=JOptionPane.showInputDialog("ingresa la escuela del estudiante");
		email=JOptionPane.showInputDialog("ingresa el email del estudiante");
		age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del estudiante"));
		prom=Integer.parseInt(JOptionPane.showInputDialog("ingresa el promedio del estudiante"));
		
		Persona p=new Estudiante(name, nat, age, sex,sco,prom,email);
		JOptionPane.showMessageDialog(null,i.imp_est((Estudiante) p));
	}
	public void ing_mae()
	{
		String name,nat,sex,grad,dir,tel;
		int age;
		float pay;
		name=JOptionPane.showInputDialog("ingresa el nombre del Maestro");
		nat=JOptionPane.showInputDialog("ingresa la nacionalidad del Maestro");
		sex=JOptionPane.showInputDialog("ingresa el sexo del Maestro");
		grad=JOptionPane.showInputDialog("ingresa el grado del Maestro");
		dir=JOptionPane.showInputDialog("ingresa la direccion del Maestro");
		tel=JOptionPane.showInputDialog("ingresa el telefono del Maestro");
		age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del Maestro"));
		pay=Float.parseFloat(JOptionPane.showInputDialog("ingresa el salario del Maestro"));
		
		Persona p=new Maestro(name, nat, age, sex,grad,pay,dir,tel);
		JOptionPane.showMessageDialog(null,i.imp_mae((Maestro) p));
	}
	public void ing_dir()
	{
		String name,nat,sex,pues,dep,tur;
		int age,ant;
		name=JOptionPane.showInputDialog("ingresa el nombre del Directivo");
		nat=JOptionPane.showInputDialog("ingresa la nacionalidad del Directivo");
		sex=JOptionPane.showInputDialog("ingresa el sexo del Directivo");
		pues=JOptionPane.showInputDialog("ingresa el puesto del Directivo");
		dep=JOptionPane.showInputDialog("ingresa el departamento del Directivo");
		tur=JOptionPane.showInputDialog("ingresa el turno del Directivo");
		age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del Directivo"));
		ant=Integer.parseInt(JOptionPane.showInputDialog("ingresa la Antiguedad del Directivo"));
		
		Persona p=new Directivo(name, nat, age, sex,pues,dep,tur,ant);
		JOptionPane.showMessageDialog(null,i.imp_dir((Directivo) p));
	}
}
