package Composicion_Hospital;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class INGR {
	Medico m1=new Medico("jose","palurdo","c.morelos #45","j_palurdoMX@gmail,com",66,65000,6262,"urologo");
	Hospital h1=new Hospital("clinica loez","c.mireles #69","cwb3232n","www.cliLoez.mx",4856123);
	Paciente p1=new Paciente(m1,h1,"Carloz","c.pizarro #23","ulceras","e8v8ed1f1","celrlom21231@gmail.com","8152006");
	JTextArea t1=new JTextArea();
	String dt="\t\t\t\tMedico\nNombre\tApellido\tDireccion\tEmail\tEdad\tSalario\tCedula\tEspecialidad\n";
	
	public Object inp()
	{
		
	m1.setname(JOptionPane.showInputDialog(null, "ingresa el nombre del medico: ","Datos del medico",JOptionPane.INFORMATION_MESSAGE));
	m1.setlast(JOptionPane.showInputDialog(null, "ingresa el apellido del medico: ","Datos del medico",JOptionPane.INFORMATION_MESSAGE));
	m1.setdir(JOptionPane.showInputDialog(null, "ingresa la direccion del medico: ","Datos del medico",JOptionPane.INFORMATION_MESSAGE));
	m1.setemail(JOptionPane.showInputDialog(null, "ingresa el email: ","Datos del medico",JOptionPane.INFORMATION_MESSAGE));
	m1.setyer(Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa la edad: ","Datos del medico",JOptionPane.INFORMATION_MESSAGE)));
	m1.setsal(Integer.parseInt(JOptionPane.showInputDialog(null, "salario del medico: ","Datos del medico",JOptionPane.INFORMATION_MESSAGE)));
	m1.setced(Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la Cedula del medico: ","Datos del medico",JOptionPane.INFORMATION_MESSAGE)));
	m1.setesp(JOptionPane.showInputDialog(null, "ingresa la especialidad: ","Datos del medico",JOptionPane.INFORMATION_MESSAGE));
	
	h1.setname(JOptionPane.showInputDialog(null, "ingresa el hospital: ","Datos del hospital",JOptionPane.INFORMATION_MESSAGE));
	h1.setdir(JOptionPane.showInputDialog(null, "ingresa la direccion: ","Datos del hospital",JOptionPane.INFORMATION_MESSAGE));
	h1.setrfc(JOptionPane.showInputDialog(null, "ingresa el RFC: ","Datos del hospital",JOptionPane.INFORMATION_MESSAGE));
	h1.setweb(JOptionPane.showInputDialog(null, "ingresa el sitio WEB: ","Datos del hospital",JOptionPane.INFORMATION_MESSAGE));
	h1.setphone(Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa el telefono: ","Datos del hospital",JOptionPane.INFORMATION_MESSAGE)));
	
	p1.setname(JOptionPane.showInputDialog(null, "ingresa el paciente: ","Datos del Paciente",JOptionPane.INFORMATION_MESSAGE));
	p1.setdir(JOptionPane.showInputDialog(null, "ingresa su direccion: ","Datos del Paciente",JOptionPane.INFORMATION_MESSAGE));
	p1.setsik(JOptionPane.showInputDialog(null, "ingresa su enfermedad: ","Datos del Paciente",JOptionPane.INFORMATION_MESSAGE));
	p1.setnss(JOptionPane.showInputDialog(null, "ingresa el NSS: ","Datos del Paciente",JOptionPane.INFORMATION_MESSAGE));
	p1.setemail(JOptionPane.showInputDialog(null, "ingresa el email: ","Datos del Paciente",JOptionPane.INFORMATION_MESSAGE));
	p1.setPhone(JOptionPane.showInputDialog(null, "ingresa el telefono: ","Datos del Paciente",JOptionPane.INFORMATION_MESSAGE));
	
	
	dt+="__________________________________________________________________________________________________________________________________________________\n";
	 dt+=p1.getme().getname()+"\t"+p1.getme().getlast()+"\t"
			+"\t"+p1.getme().getdir()+"\t"+p1.getme().getemail()
			+"\t"+p1.getme().getyer()+"\t"+p1.getme().getsal()
			+"\t"+p1.getme().getced()+"\t"+p1.getme().getesp()+"\n";
	 
	 dt+="\t\t\t\tHospital\nNombre\tDireccion\tRFC\tWEB\tPhone\n";
	 dt+="____________________________________________________________________________________________________________________________________________\n";
	 dt+=p1.getho().getname()+"\nt"+p1.getho().getdir()
			+"\t"+p1.getho().getrfc()+"\t"+p1.getho().getweb()
			+"\t"+p1.getho().getphone()+"\n";
	 
	 dt+="\t\t\t\tPaciente\nNombre\tDireccion\tEnfermedad\tNSS\tEmail\tTelefono\n";
	 dt+="________________________________________________________________________________________________________________________________________________\n";
	 dt+=p1.getname()+"\t"+p1.getdir()+"\t"
			+p1.getsik()+"\t"+p1.getnss()+"\t"+p1.getemail()
			+"\t"+p1.getphone();
	t1.setText(dt);
	return t1;
	}

}
