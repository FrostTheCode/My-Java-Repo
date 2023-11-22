package herencia_animal;

import javax.swing.JTextArea;
 class Imp {
	JTextArea t1=new JTextArea();
	String dts="\t\t\tDatos del Estudiante\nNombre\tEdad\tPeso\tAlimentos\tHabitad\n";
	public Object imp(Canino c)
	{
		dts+="_________________________________________________________________________________________\n";
		dts+=c.getName()+"\t"+c.getAge()+"\t"+c.getPeso()+"\t"+c.getAli()+"\t"+c.getHab();
		t1.setText(dts);
		return t1;
	}

}
