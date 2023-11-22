package Herencia_Persona;

import javax.swing.JOptionPane;

public class Alta_Estudiante {
	imprime i=new imprime();
	public void alta()
	{
		String name,last;
		int edad,nc;
		float prom;
		name=JOptionPane.showInputDialog(null,"Ingresa el nombre","Datos del estudiante",JOptionPane.INFORMATION_MESSAGE);
		last=JOptionPane.showInputDialog(null,"Ingresa el apellido","Datos del estudiante",JOptionPane.INFORMATION_MESSAGE);
		edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la edad","Datos del estudiante",JOptionPane.INFORMATION_MESSAGE));
		nc=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el numero de control","Datos del estudiante",JOptionPane.INFORMATION_MESSAGE));
		prom=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingresa el promedio","Datos del estudiante",JOptionPane.INFORMATION_MESSAGE));
		//crear el objeto estudiante
		Estudiante e=new Estudiante(name,last,edad,nc,prom);
	//enviamos los datos del obj a la clase imprime
		JOptionPane.showMessageDialog(null, i.imp(e));
	}
}
