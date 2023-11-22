package poli_Vehiculo;

import javax.swing.JTextArea;

public class Imprime {
	JTextArea t1=new JTextArea();
	String dD="\t\t\tDepotivo\nMatricula\tModelo\tMarca\tNo.Cilindros\n";
	public Object imp_dep(Deportivo d)
	{
		dD+="_____________________________________________________________________\n";
		dD+=d.getMat()+"\t"+d.getMod()+"\t"+d.getMar()+"\t"+d.getNcil();
		t1.setText(dD);
		return t1;
	}
	String dF="\t\t\tFamiliar\nMatricula\tModelo\tMarca\tNo.Puertas\n";
	public Object imp_fam(Familiar f)
	{
		dF+="_____________________________________________________________________\n";
		dF+=f.getMat()+"\t"+f.getMod()+"\t"+f.getMar()+"\t"+f.getNpu();
		t1.setText(dF);
		return t1;
	}
	String dC="\t\t\tCarga\nMatricula\tModelo\tMarca\tCapacidad\tDepartamento\n";
	public Object imp_car(Carga c)
	{
		dC+="_______________________________________________________________________________\n";
		dC+=c.getMat()+"\t"+c.getMod()+"\t"+c.getMar()+"\t"+c.getCap_car()+"\t"+c.getDep();
		t1.setText(dC);
		return t1;
	}
}
