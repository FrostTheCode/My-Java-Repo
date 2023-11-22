package poli_ani;

import javax.swing.JTextArea;


public class Imp {
	JTextArea t1=new JTextArea();
	String dts="\t\t\tDatos del Canino\nNombre\tEdad\tPeso\tAlimentos\tHabitad\tRaza\tTamaño\n";
	public Object imp_can(canino c)
	{
		dts+="_________________________________________________________________________________________\n";
		dts+=c.getName()+"\t"+c.getAge()+"\t"+c.getPeso()+"\t"+c.getAli()+"\t"+c.getHab()+"\t"+c.getRaza()+"\t"+c.getSize();
		t1.setText(dts);
		return t1;
	}

}
