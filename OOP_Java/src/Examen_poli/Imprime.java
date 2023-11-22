package Examen_poli;

import javax.swing.JTextArea;

public class Imprime {
	JTextArea t1=new JTextArea();
	String dP="\t\t\t\tPersa\nNombre\tEdad\tTamaño\tDueño\tRaza\tN.Patas\tColor\tTamaño garra\n";
	public Object imp_per(Persa p)
	{
		dP+="\n";
		dP+=p.getName()+"\t"+p.getAge()+"\t"+p.getSize()+"\t"+p.getOner()+"\t"+p.getRaza()+"\t"+p.getNpat()+"\t"+p.getColor()+"\t"+p.getSizega();
		t1.setText(dP);
		return t1;
	}
	String dS="\t\t\t\tSiames\nNombre\tEdad\tTamaño\tDueño\tRaza\tN.Patas\tColor Ojos\tColor Siames\n";
	public Object imp_sia(Siames s)
	{
		dS+="\n";
		dS+=s.getName()+"\t"+s.getAge()+"\t"+s.getSize()+"\t"+s.getOner()+"\t"+s.getRaza()+"\t"+s.getNpat()+"\t"+s.getColojo()+"\t"+s.getColsia();
		t1.setText(dS);
		return t1;
	}
	String dA="\t\t\t\tAfricano\nNombre\tEdad\tTamaño\tDueño\tSexo\tAlimento\tCaza\tN.hembras\n";
	public Object imp_afri(Africano a)
	{
		dA+="\n";
		dA+=a.getName()+"\t"+a.getAge()+"\t"+a.getSize()+"\t"+a.getOner()+"\t"+a.getSexo()+"\t"+a.getAli()+"\t"+a.getCaza()+"\t"+a.getNfem();
		t1.setText(dA);
		return t1;
	}
	String das="\t\t\t\tAsiatico\nNombre\tEdad\tTamaño\tDueño\tSexo\tAlimento\tT.Melena\tN.Garras\n";
	public Object imp_asi(Asiatico t)
	{
		das+="\n";
		das+=t.getName()+"\t"+t.getAge()+"\t"+t.getSize()+"\t"+t.getOner()+"\t"+t.getSexo()+"\t"+t.getAli()+"\t"+t.getSmelena()+"\t"+t.getNgarras();
		t1.setText(das);
		return t1;
	}

}
