package Poli_persona;

import javax.swing.JTextArea;

public class Imprime {
	JTextArea t1=new JTextArea();
	String dE="\t\t\tEstudiante\nNombre\tNacionalidad\tEdad\tSexo\tEscuela\tPromedio\tEmail\n";
	public Object imp_est(Estudiante e)
	{
		dE+="_______________________________________________________________________________________________\n";
		dE+=e.getName()+"\t"+e.getNat()+"\t"+e.getAge()+"\t"+e.getSex()+"\t"+e.getSco()+"\t"+e.getProm()+"\t"+e.getEmail();
		t1.setText(dE);
		return t1;
	}
	String dM="\t\t\tMaestro\nNombre\tNacionalidad\tEdad\tSexo\tGrado\tSalario\tDireccion\tTelefono\n";
	public Object imp_mae(Maestro m)
	{
		dM+="_______________________________________________________________________________________________\n";
		dM+=m.getName()+"\t"+m.getNat()+"\t"+m.getAge()+"\t"+m.getSex()+"\t"+m.getGrad()+"\t"+m.getPay()+"\t"+m.getDir()+"\t"+m.getTel();
		t1.setText(dM);
		return t1;
	}
	String dD="\t\t\tDirectivo\nNombre\tNacionalidad\tEdad\tSexo\tPuesto\tDepartamento\tTurno\tAntiguedad\n";
	public Object imp_dir(Directivo d)
	{
		dD+="_______________________________________________________________________________________________\n";
		dD+=d.getName()+"\t"+d.getNat()+"\t"+d.getAge()+"\t"+d.getSex()+"\t"+d.getPues()+"\t"+d.getDep()+"\t"+d.getTur()+"\t"+d.getAnt();
		t1.setText(dD);
		return t1;
	}
	

}
