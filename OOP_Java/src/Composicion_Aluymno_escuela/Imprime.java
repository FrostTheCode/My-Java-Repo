package Composicion_Aluymno_escuela;

import javax.swing.JTextArea;

public class Imprime {
	Escuela e1=new Escuela("Instituto tecnologico de zacatecas","www.ITzacatecas.tecnm.mx",945123);
	Carrera c1=new Carrera("ISC","ISC2020");
	Alumno a1=new Alumno(e1,c1,"jose de la barrera","marquez",20,"lasabritas@gmail.com");
	JTextArea t1=new JTextArea();
	String dts="\t\t\t\tEscuela\n\nNombre\t\t\tSitio Web\t\tTelefono\n";
	
	public Object Toimprime()
	{
		dts+="_________________________________________________________________________________________________\n";
		dts+=a1.getEscuela().getName()+"\t"+a1.getEscuela().getWeb()
				+"\t"+a1.getEscuela().getPhone()+"\n\n";
		dts+="\t\tCarrera\n\nNombre\tClave\n";
		dts+="____________________________________________________________\n";
		dts+=a1.getCarrera().getName()+"\t"+a1.getCarrera().getClave()+"\n";
		dts+="\t\t\t\tAlumno\n\nNombre\t\tApellido\tEdad\tEmail\n\n";
		dts+="_____________________________________________________________________\n";		
		dts+=a1.getName()+"\t"+a1.getApellido()+"\t"+a1.getEdad()
		+"\t"+a1.getEmail()+"\n";
		t1.setText(dts);
		return t1;
	}
	

}
