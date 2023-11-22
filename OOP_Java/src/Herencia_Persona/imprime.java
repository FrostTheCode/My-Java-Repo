package Herencia_Persona;

import javax.swing.JTextArea;

public class imprime {
	JTextArea t1=new JTextArea();
	String dts="\t\t\tDatos del Estudiante\nNombre\tApellido\tEdad\tN.Control\tPromedio\n";
	public Object imp(Estudiante e)
	{
		dts+="_________________________________________________________________________________________\n";
		dts+=e.getName()+"\t"+e.getLast()+"\t"+e.getEdad()+"\t"+e.getNc()+"\t"+e.getProm();
		t1.setText(dts);
		return t1;
	}
}
