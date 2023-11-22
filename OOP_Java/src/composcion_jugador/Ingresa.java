package composcion_jugador;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ingresa {
	Jugador j1=new Jugador("Douglas","Green","RAF FC","Dglas70@gmail.com","Clacio market",12,19,16000);
	Entrenador e1=new Entrenador("Robert","Graham","RAF FC","R0berth4@gmail.com","Masculino",45,618524,3,200000);		
	Masajista m1=new Masajista("Mike","m1k3J@gmail.com","Green hill 993",30,30000);
	Estadio e2=new Estadio(j1,e1,m1,"Dowhill","RAF FC","Colorado","Cental Avenide",300000);
	JTextArea t1=new JTextArea();
	String dts="\t\t\tJugador\n\nNombre\tApellido\tEquipo\tEmail\t\tPatrocinador\tNumero\tEdad\tSalario\n";
	
	public Object ing()
	{
		j1.setname(JOptionPane.showInputDialog(null,"Ingresa nombre de Jugador","Datos del jugador",JOptionPane.INFORMATION_MESSAGE));
		j1.setapellido(JOptionPane.showInputDialog(null,"Ingresa Apellido de Jugador","Datos del jugador",JOptionPane.INFORMATION_MESSAGE));
		j1.setequipo(JOptionPane.showInputDialog(null,"Ingresa equipo de Jugador","Datos del jugador",JOptionPane.INFORMATION_MESSAGE));
		j1.setemail(JOptionPane.showInputDialog(null,"Ingresa email de Jugador","Datos del jugador",JOptionPane.INFORMATION_MESSAGE));
		j1.setpatrocinador(JOptionPane.showInputDialog(null,"Ingresa patrocinador de Jugador","Datos del jugador",JOptionPane.INFORMATION_MESSAGE));
		j1.setnum(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa numero de Jugador\n(Solo numeros)","Datos del jugador",JOptionPane.INFORMATION_MESSAGE)));
		j1.setedad(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa edad de Jugador\n(Solo numeros)","Datos del jugador",JOptionPane.INFORMATION_MESSAGE)));
		j1.setsalario(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa salario de Jugador\n(Solo numeros)","Datos del jugador",JOptionPane.INFORMATION_MESSAGE)));
		
		e1.setname(JOptionPane.showInputDialog(null,"Ingresa nombre de Entrenador","datos del entrenador",JOptionPane.INFORMATION_MESSAGE));
		e1.setapellido(JOptionPane.showInputDialog(null,"Ingresa apellido de Entrenador","datos del entrenador",JOptionPane.INFORMATION_MESSAGE));
		e1.setequipo(JOptionPane.showInputDialog(null,"Ingresa equipo de Entrenador","datos del entrenador",JOptionPane.INFORMATION_MESSAGE));
		e1.setemail(JOptionPane.showInputDialog(null,"Ingresa email de Entrenador","datos del entrenador",JOptionPane.INFORMATION_MESSAGE));
		e1.setsexo(JOptionPane.showInputDialog(null,"Ingresa sexo de Entrenador","datos del entrenador",JOptionPane.INFORMATION_MESSAGE));
		e1.setedad(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa la edad de Entrenador\n(Solo numeros)","datos del entrenador",JOptionPane.INFORMATION_MESSAGE)));
		e1.setphone(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el telefono de Entrenador\n(Solo numeros)","datos del entrenador",JOptionPane.INFORMATION_MESSAGE)));
		e1.setcamp(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa los campeonatos de Entrenador\n(Solo numeros)","datos del entrenador",JOptionPane.INFORMATION_MESSAGE)));
		e1.setsalario(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el salario de Entrenador\n(Solo numeros)","datos del entrenador",JOptionPane.INFORMATION_MESSAGE)));
		
		m1.setname(JOptionPane.showInputDialog(null,"Ingresa nombre de Masajista","datos del masajista",JOptionPane.INFORMATION_MESSAGE));
		m1.setemail(JOptionPane.showInputDialog(null,"Ingresa email de Masajista","datos del masajista",JOptionPane.INFORMATION_MESSAGE));
		m1.setdireccion(JOptionPane.showInputDialog(null,"Ingresa direccion de Masajista","datos del masajista",JOptionPane.INFORMATION_MESSAGE));
		m1.setedad(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa edad de Masajista\n(Solo numeros)","datos del masajista",JOptionPane.INFORMATION_MESSAGE)));
		m1.setsalario(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa salario de Masajista\n(Solo numeros)","datos del masajista",JOptionPane.INFORMATION_MESSAGE)));
		
		e2.setname(JOptionPane.showInputDialog(null,"Ingresa nombre de Estadio","datos del estadio",JOptionPane.INFORMATION_MESSAGE));
		e2.setequipo(JOptionPane.showInputDialog(null,"Ingresa equipo de Estadio","datos del estadio",JOptionPane.INFORMATION_MESSAGE));
		e2.setdireccion(JOptionPane.showInputDialog(null,"Ingresa direccion de Estadio","datos del estadio",JOptionPane.INFORMATION_MESSAGE));
		e2.setwww(JOptionPane.showInputDialog(null,"Ingresa Pagina de Estadio","datos del estadio",JOptionPane.INFORMATION_MESSAGE));
		e2.setcapa(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa capacidad de Estadio\n(Solo numeros)","datos del estadio",JOptionPane.INFORMATION_MESSAGE)));	
	
		dts+="_______________________________________________________________________________________________________________________________________________________\n";
		dts+=e2.getjugador().getname()+"\t"+e2.getjugador().getapellido()+"\t"+e2.getjugador().getequipo()+"\t"+
		e2.getjugador().getemail()+"\t"+e2.getjugador().getpatrocinador()+"\t"+e2.getjugador().getnum()+"\t"+
		e2.getjugador().getedad()+"\t"+e2.getjugador().getsalario()+"\n\n";
		dts+="\t\t\tEntrenador\n\nNombre\tApellido\tEquipo\tEmail\t\tSexo\tEdad\tTelefono\tCampeonato\tSalario\n";
		dts+="_______________________________________________________________________________________________________________________________________________________\n";
		dts+=e2.getentrenador().getname()+"\t"+e2.getentrenador().getapellido()+"\t"+e2.getentrenador().getequipo()+"\t"+
		e2.getentrenador().getemail()+"\t"+e2.getentrenador().getsexo()+"\t"+e2.getentrenador().getedad()+"\t"+
		e2.getentrenador().getphone()+"\t"+e2.getentrenador().getcamp()+"\t"+e2.getentrenador().getsalario()+"\n\n";
		dts+="\t\t\tMasajista\n\nNombre\tEmail\t\tDireccion\tEdad\tSalario\n";
		dts+="_______________________________________________________________________________________________________________________________________________________\n";
		dts+=e2.getmasajista().getname()+"\t"+e2.getmasajista().getemail()+"\t"+e2.getmasajista().getdireccion()+"\t"+
		e2.getmasajista().getedad()+"\t"+e2.getmasajista().getsalario()+"\n\n";
		dts+="\t\t\tEstadio\n\nNombre\tEquipo\tDireccion\tWWW\tCapacidad\n";
		dts+="_______________________________________________________________________________________________________________________________________________________\n";
		dts+=e2.getname()+"\t"+e2.getequipo()+"\t"+e2.getdireccion()+"\t"+e2.getwww()+"\t"+e2.getcapa()+"\n\n";
		t1.setText(dts);
		return t1;
	}	
}
