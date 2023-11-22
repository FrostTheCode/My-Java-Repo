package herencia_Seleccion_futbol;

import javax.swing.JTextArea;

public class Imprime {
	JTextArea t1=new JTextArea();
	String dtsF="\t\t\tDatos del Futbolista\nNombre\tApellido\tEdad\tID\tPeso\tPosicion\tNumero\n";
	public Object printF(Futbolista f)
	{
		dtsF+="__________________________________________________________________________________________________\n";
		dtsF+=f.getName()+"\t"+f.getLast()+"\t"+f.getEdad()+"\t"+f.getId()+"\t"+f.getPeso()
		+"\t"+f.getPosi()+"\t"+f.getNum()+"\n";
		t1.setText(dtsF);
		return t1;
	}
	String dtsM="\t\t\tDatos del Masajista\nNombre\tApellido\tEdad\tID\tPeso\tEspecializacion\tExperiencia\n";
	public Object printM(Masajista m)
	{
		dtsM+=("______________________________________________________________________________________________\n");
		dtsM+=m.getName()+"\t"+m.getLast()+"\t"+m.getEdad()+"\t"+m.getId()+"\t"+m.getPeso()
		+"\t"+m.getEsp()+"\t"+m.getExp()+"\n";
		t1.setText(dtsM);
		return t1;
	}
	String dtsE="\t\t\tDatos del Entrenador\nNombre\tApellido\tEdad\tID\tPeso\tIdFederacion\n";
	public Object printE(Entrenador e)
	{
		dtsE+=("__________________________________________________________________________________________\n");
		dtsE+=e.getName()+"\t"+e.getLast()+"\t"+e.getEdad()+"\t"+e.getId()+"\t"+e.getPeso()
		+"\t"+e.getIdfed()+"\n";
	    t1.setText(dtsE);
		return t1;
	}
}
