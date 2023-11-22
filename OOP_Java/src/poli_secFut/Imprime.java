package poli_secFut;

import javax.swing.JTextArea;

public class Imprime {
	JTextArea t1=new JTextArea();
	String dF="\t\t\t\tFutbolista\nNombre\tApellido\tIdentificacion\tEdad\tPeso\tPosicion\tNumero\tSalario\n";
	public Object imp_fut(Futbolista f)
	{
		dF+="___________________________________________________________________________________________________________________\n";
		dF+=f.getName()+"\t"+f.getLast()+"\t"+f.getId()+"\t"+f.getAge()+"\t"+f.getPeso()+"\t"+f.getPos()+"\t"+f.getNum()+"\t"+f.getPay();
		t1.setText(dF);
		return t1;
	}
	String dM="\t\t\t\tMasajista\nNombre\tApellido\tIdentificacion\tEdad\tPeso\tEspecialidad\tExperiencia\tEmail\n";
	public Object imp_mas(Masajista m)
	{
		dM+="___________________________________________________________________________________________________________________\n";
		dM+=m.getName()+"\t"+m.getLast()+"\t"+m.getId()+"\t"+m.getAge()+"\t"+m.getPeso()+"\t"+m.getEsp()+"\t"+m.getExp()+"\t"+m.getEmail();
		t1.setText(dM);
		return t1;
	}
	String dE="\t\t\t\tEntrenador\nNombre\tApellido\tIdentificacion\tEdad\tPeso\tIdFed\tCampeonatos\tEquipos\n";
	public Object imp_ent(Entrenador e)
	{
		dE+="___________________________________________________________________________________________________________________\n";
		dE+=e.getName()+"\t"+e.getLast()+"\t"+e.getId()+"\t"+e.getAge()+"\t"+e.getPeso()+"\t"+e.getIdfed()+"\t"+e.getCam()+"\t"+e.getTeam();
		t1.setText(dE);
		return t1;
	}
}
