package Composicion_Hospital;

import javax.swing.JTextArea;

public class IMPR {
	Medico m1=new Medico("jose","palurdo","c.morelos #45","j_palurdoMX@gmail,com",66,65000,6262,"urologo");
	Hospital h1=new Hospital("clinica loez","c.mireles #69","cwb3232n","www.cliLoez.mx",4856123);
	Paciente p1=new Paciente(m1,h1,"Carloz","c.pizarro #23","ulceras","e8v8ed1f1","celrlom21231@gmail.com","8152006");
	JTextArea t1=new JTextArea();
	String dt="\t\t\t\tMedico\nNombre\tApellido\t\tDireccion\tEmail\t\tEdad\tSalario\tCedula\tEspecialidad\n";
	public Object imp()
	{
		dt+="_________________________________________________________________________________________________________________________________________________________________________________\n";
		 dt+=p1.getme().getname()+"\t"+p1.getme().getlast()+"\t"
				+"\t"+p1.getme().getdir()+"\t"+p1.getme().getemail()
				+"\t"+p1.getme().getyer()+"\t"+p1.getme().getsal()
				+"\t"+p1.getme().getced()+"\t"+p1.getme().getesp()+"\n";
		 
		 dt+="\t\t\t\tHospital\nNombre\tDireccion\tRFC\tWEB\tPhone\n";
		 dt+="________________________________________________________________________________________________\n";
		 dt+=p1.getho().getname()+"\nt"+p1.getho().getdir()
				+"\t"+p1.getho().getrfc()+"\t"+p1.getho().getweb()
				+"\t"+p1.getho().getphone()+"\n";
		 
		 dt+="\t\t\t\tPaciente\nNombre\tDireccion\tEnfermedad\tNSS\tEmail\tTelefono\n";
		 dt+="________________________________________________________________________________________________________________________________________\n";
		 dt+=p1.getname()+"\t"+p1.getdir()+"\t"
				+p1.getsik()+"\t"+p1.getnss()+"\t"+p1.getemail()
				+"\t"+p1.getphone();
		t1.setText(dt);
		return t1;
	}
}
