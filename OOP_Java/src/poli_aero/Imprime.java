package poli_aero;

import javax.swing.JTextArea;

public class Imprime {
	JTextArea t1=new JTextArea();
	String dA="\t\t\t\tAvion\nNombre\tMarca\tModelo\tColor\tPrecio\tVelocidad\tCapacidad\tCompania\tNo.Motores\n";
	public Object imp_avi(Avion a)
	{
		dA+="______________________________________________________________________________________________________________________\n";
		dA+=a.getName()+"\t"+a.getMar()+"\t"+a.getMod()+"\t"+a.getCol()+"\t"+a.getPre()+"\t"+a.getVel()+"\t"+a.getCap()+"\t"+a.getCom()+"\t"+a.getNmot();
		t1.setText(dA);
		return t1; 	
	}
	String dH="\t\t\t\tHelicoptero\nNombre\tMarca\tModelo\tColor\tPrecio\tVelocidad\tEmpresa\tRuta\tCostoRenta\n";
	public Object imp_hel(Helicoptero h)
	{
		dH+="______________________________________________________________________________________________________________________\n";
		dH+=h.getName()+"\t"+h.getMar()+"\t"+h.getMod()+"\t"+h.getCol()+"\t"+h.getPre()+"\t"+h.getVel()+"\t"+h.getEmp()+"\t"+h.getRut()+"\t"+h.getCosre();
		t1.setText(dH);
		return t1; 	
	}
	String dG="\t\t\t\tGlobo\nNombre\tMarca\tModelo\tColor\tPrecio\tVelocidad\tTipo\tTiempo Recorrido\n";
	public Object imp_glo(Globo g)
	{
		dG+="______________________________________________________________________________________________________________________\n";
		dG+=g.getName()+"\t"+g.getMar()+"\t"+g.getMod()+"\t"+g.getCol()+"\t"+g.getPre()+"\t"+g.getVel()+"\t"+g.getTipo()+"\t"+g.getTemrec();
		t1.setText(dG);
		return t1; 	
	}

}
