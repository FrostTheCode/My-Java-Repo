package Composicion_Aluymno_escuela;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ingresa {
	Escuela e1=new Escuela("Instituto tecnologico de zacatecas","www.ITzacatecas.tecnm.mx",945123);
	Carrera c1=new Carrera("ISC","ISC2020");
	Alumno a1=new Alumno(e1,c1,"jose de la barrera","marquez",20,"lasabritas@gmail.com");
	JTextArea t1=new JTextArea();
	String dts="\t\t\t\tEscuela\n\nNombre\tSitio Web\tTelefono\n";
	
	public Object ing()
	{
		e1.setName(JOptionPane.showInputDialog("ingresa el nombre de la escuela: "));
		e1.setWeb(JOptionPane.showInputDialog("ingresa el sitio web de la escuela: "));
		e1.setPhone(Integer.parseInt(JOptionPane.showInputDialog("ingresa el telefono de la escuela:\n\t(solo numeros)")));
		
		c1.setName(JOptionPane.showInputDialog("ingresa el nombre de la carrera: "));
		c1.setClave(JOptionPane.showInputDialog("ingresa la clave de la escuela"));
		
		a1.setName(JOptionPane.showInputDialog("ingresa el nombre del alumno: "));
		a1.setApellido(JOptionPane.showInputDialog("ingresa el nombre del alumno: "));
		a1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del alumno:\n\t(solo numeros)")));
		a1.setEmail(JOptionPane.showInputDialog("ingresa el email del alumno: "));
		
		dts+="_________________________________________________________________________________________________\n";
		dts+=a1.getEscuela().getName()+"\t"+a1.getEscuela().getWeb()
				+"\t"+a1.getEscuela().getPhone()+"\n\n";
		dts+="\t\tCarrera\n\nNombre\tClave\n";
		dts+="____________________________________________________________\n";
		dts+=a1.getCarrera().getName()+"\t"+a1.getCarrera().getClave()+"\n";
		dts+="\t\t\t\tAlumno\n\nNombre\tApellido\tEdad\tEmail\n\n";
		dts+="_____________________________________________________________________\n";		
		dts+=a1.getName()+"\t"+a1.getApellido()+"\t"+a1.getEdad()
		+"\t"+a1.getEmail()+"\n";
		t1.setText(dts);
		
		return t1;
	}

}
