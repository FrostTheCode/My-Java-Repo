package composcion_jugador;

import javax.swing.JTextArea;

public class Imprime {
	Jugador j1=new Jugador("Flip","jolias","Aguila","FLJOiu@gmail.com","Samba club",665912,23,5000);
	Entrenador e1=new Entrenador("Francisco","lamar","Aguila","FRank23@gmail.com","Masculino",30,998425345,6,10000);		
	Masajista m1=new Masajista("JAcinto","masaJ@gmail.com","Salinas 993",25,6000);
	Estadio e2=new Estadio(j1,e1,m1,"Filledios","GAllardos","Colorado","South park",600000);
	JTextArea t1=new JTextArea();
	String dts="\t\t\tJugador\n\nNombre\tApellido\tEquipo\tEmail\t\tPatrocinador\tNumero\tEdad\tSalario\n";
	
	public Object impri()
	{
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