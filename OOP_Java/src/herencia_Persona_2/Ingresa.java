package herencia_Persona_2;

import javax.swing.JOptionPane;

public class Ingresa {
	Imprime i=new Imprime();
	public void ing_est()
	{
		String nam,las,sexo,esc;
		int age;
		float pro;
		nam=JOptionPane.showInputDialog(null,"ingresa el Nombre","datos del estudiante",JOptionPane.INFORMATION_MESSAGE);
		las=JOptionPane.showInputDialog(null,"ingresa el Apellido","datos del estudiante",JOptionPane.INFORMATION_MESSAGE);
		sexo=JOptionPane.showInputDialog(null,"ingresa el Sexo","datos del estudiante",JOptionPane.INFORMATION_MESSAGE);
		esc=JOptionPane.showInputDialog(null,"ingresa la Escuela","datos del estudiante",JOptionPane.INFORMATION_MESSAGE);
		age=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa la Edad\n(solo numeros):","datos del estudiante",JOptionPane.INFORMATION_MESSAGE));
		pro=Float.parseFloat(JOptionPane.showInputDialog(null,"ingresa la Promedio\n(solo numeros):","datos del estudiante",JOptionPane.INFORMATION_MESSAGE));
		
		Estudiante E=new Estudiante(nam,las,age,sexo,esc,pro);
		JOptionPane.showMessageDialog(null,i.printE(E),"datos del estudiante",JOptionPane.INFORMATION_MESSAGE);
	}
	public void ing_mas()
	{
		String nam,las,sexo,grad;
		int age;
		float pay;
		nam=JOptionPane.showInputDialog(null,"ingresa el Nombre","datos del Maestro",JOptionPane.INFORMATION_MESSAGE);
		las=JOptionPane.showInputDialog(null,"ingresa el Apellido","datos del Maestro",JOptionPane.INFORMATION_MESSAGE);
		sexo=JOptionPane.showInputDialog(null,"ingresa el Sexo","datos del Maestro",JOptionPane.INFORMATION_MESSAGE);
		grad=JOptionPane.showInputDialog(null,"ingresa el Grado","datos del Maestro",JOptionPane.INFORMATION_MESSAGE);
		age=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa la Edad\n(solo numeros):","datos del Maestro",JOptionPane.INFORMATION_MESSAGE));
		pay=Float.parseFloat(JOptionPane.showInputDialog(null,"ingresa el Salario\n(solo numeros):","datos del Maestro",JOptionPane.INFORMATION_MESSAGE));
	
		Maestro M=new Maestro(nam,las,age,sexo,grad,pay);
		JOptionPane.showMessageDialog(null,i.printM(M),"datos del maestro",JOptionPane.INFORMATION_MESSAGE);
		
	}
	public void ing_dir()
	{
		String nam,las,sexo,pues,depa;
		int age;
		nam=JOptionPane.showInputDialog(null,"ingresa el Nombre","datos del Directivo",JOptionPane.INFORMATION_MESSAGE);
		las=JOptionPane.showInputDialog(null,"ingresa el Apellido","datos del Directivo",JOptionPane.INFORMATION_MESSAGE);
		sexo=JOptionPane.showInputDialog(null,"ingresa el Sexo","datos del Directivo",JOptionPane.INFORMATION_MESSAGE);
		pues=JOptionPane.showInputDialog(null,"ingresa el Puesto","datos del Directivo",JOptionPane.INFORMATION_MESSAGE);
		depa=JOptionPane.showInputDialog(null,"ingresa el Departamento","datos del Directivo",JOptionPane.INFORMATION_MESSAGE);
		age=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa la Edad\n(solo numeros):","datos del Directivo",JOptionPane.INFORMATION_MESSAGE));
		
		Directivo D=new Directivo(nam,las,age,sexo,pues,depa);
		JOptionPane.showMessageDialog(null,i.printD(D),"datos del directivo",JOptionPane.INFORMATION_MESSAGE);
	}

}
