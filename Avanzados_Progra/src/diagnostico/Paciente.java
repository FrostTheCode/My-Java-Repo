package diagnostico;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import ListaCirculares.nodoC;

public class Paciente {
	private String name;
	private int age;
	private String sex;
	private String esci;//estado civil
	private int opqui;//cantidad de operaciones que le han hecho en su vida
	private String [] exp=new String [10];
	
	public Paciente(String name, int age, String sex, String esci, int opqui, String[] exp) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.esci = esci;
		this.opqui = opqui;
		this.exp = exp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEsci() {
		return esci;
	}

	public void setEsci(String esci) {
		this.esci = esci;
	}

	public int getOpqui() {
		return opqui;
	}

	public void setOpqui(int opqui) {
		this.opqui = opqui;
	}
	public String[] getExp() {
		return exp;
	}

	public void setExp(String[] exp) {
		this.exp = exp;
	}

	public void obtdat () {
		String  fec;//fecha de consulta
		String  desen;
		String  res;
		name=JOptionPane.showInputDialog("ingresa el nombre del paciente");
		age=Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del paciente"));
		sex=JOptionPane.showInputDialog("ingrese el sexo del paciente");
		esci=JOptionPane.showInputDialog("ingrese el Estado Civil del paciente");
		opqui=Integer.parseInt(JOptionPane.showInputDialog("ingrese las intervenciones quirurgicas que ha tenido el paciente"));

		for (int i=0;i<=exp.length;i++) {
		fec=JOptionPane.showInputDialog("ingresa la fecha de consulta");
		desen=JOptionPane.showInputDialog("ingresa descripcion de enfermedad");
		res =JOptionPane.showInputDialog("ingresa la receta");
		exp[i]=JOptionPane.showInputDialog(fec+""+desen+""+res);
		}
		
	}
	
	public void mosdat(){
		JTextArea sa=new JTextArea();
		String datos="consulta\tenfermedad\treceta\n";
		datos+="__________________________________________________________________\n";
		for (int i=0;i<exp.length;i++)
			datos+=exp[i]+"\n";
		
		sa.setText(datos);
		JOptionPane.showMessageDialog(null, name +"\t"+age+"\t"+sex+"\t"+esci+"\t"+opqui+"\n"+sa);
		
		
	}
	public void altCon() {
		consulta c = new consulta("19/05/21", "influenza dura", "una mejoralita");
		for (int i=0;i<=exp.length;i++) {
			System.out.println(exp[i]);
			
		}
	}
	public void listaConsulta() {
		consulta aux=ul.sig;
		String ca="";
		do {
		ca=ca+"["+aux.sig+"]->";
		aux=aux.sig;
		}while(aux!=ul.sig);
		JOptionPane.showMessageDialog(null, ca ,"Mostrando la lista circular",JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	
	
	

}
