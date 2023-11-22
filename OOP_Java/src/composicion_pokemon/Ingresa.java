package composicion_pokemon;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ingresa {
	Gimnasio gim=new Gimnasio("Port Masys","Sasae city","Grindow","Water Losa",4);
	Entrenador e=new Entrenador("Firiyep","Crist","Femenino",15,9877231,4,2);
	Pokemon poke=new Pokemon(gim,e,"Petilil","Planta-puro","nivel 15","hoja magica","semilla baya","liligath",50,1.0);
	JTextArea t1=new JTextArea();
	String dts="\t\t\t\tGimnasio\nNombre\tLocacion\tPropietario\tSuperficie\tCapacidad\n";
	public Object toing()
	{
		
		gim.setname(JOptionPane.showInputDialog(null,"ingresa Nombre: ","Datos de Gimnasio",JOptionPane.INFORMATION_MESSAGE));
		gim.setplace(JOptionPane.showInputDialog(null,"ingresa Lugar: ","Datos de Gimnasio",JOptionPane.INFORMATION_MESSAGE));
		gim.setprop(JOptionPane.showInputDialog(null,"ingresa Propietario: ","Datos de Gimnasio",JOptionPane.INFORMATION_MESSAGE));
		gim.setcapa(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa Capacidad:\n(solo numeros) ","Datos de Gimnasio",JOptionPane.INFORMATION_MESSAGE)));
		
		e.setname(JOptionPane.showInputDialog(null,"ingresa Nombre: ","Datos de Entrenador",JOptionPane.INFORMATION_MESSAGE));
		e.setapellido(JOptionPane.showInputDialog(null,"ingresa Apellido: ","Datos de Entrenador",JOptionPane.INFORMATION_MESSAGE));
		e.setsexo(JOptionPane.showInputDialog(null,"ingresa Sexo: ","Datos de Entrenador",JOptionPane.INFORMATION_MESSAGE));
		e.setedad(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa Edad:\n(solo numeros)","Datos de Entrenador",JOptionPane.INFORMATION_MESSAGE)));
		e.setphone(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa Telefono:\n(solo numeros)","Datos de Entrenador",JOptionPane.INFORMATION_MESSAGE)));
		e.setpoke(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa No. de POkemons:\n(solo numeros)","Datos de Entrenador",JOptionPane.INFORMATION_MESSAGE)));
		e.setmeda(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa No. de Medallas:\n(solo numeros)","Datos de Entrenador",JOptionPane.INFORMATION_MESSAGE)));
		
		poke.setname(JOptionPane.showInputDialog(null,"ingresa Nombre: ","Datos de Pokemon",JOptionPane.INFORMATION_MESSAGE));
		poke.settipo(JOptionPane.showInputDialog(null,"ingresa Tipo: ","Datos de Pokemon",JOptionPane.INFORMATION_MESSAGE));
		poke.setpower(JOptionPane.showInputDialog(null,"ingresa Poder: ","Datos de Pokemon",JOptionPane.INFORMATION_MESSAGE));
		poke.sethabi(JOptionPane.showInputDialog(null,"ingresa Habilidad: ","Datos de Pokemon",JOptionPane.INFORMATION_MESSAGE));
		poke.setespe(JOptionPane.showInputDialog(null,"ingresa Especie: ","Datos de Pokemon",JOptionPane.INFORMATION_MESSAGE));
		poke.setevol(JOptionPane.showInputDialog(null,"ingresa Evolucion: ","Datos de Pokemon",JOptionPane.INFORMATION_MESSAGE));
		poke.setpeso(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa Peso:\n(solo numeros)","Datos de Pokemon",JOptionPane.INFORMATION_MESSAGE)));
		poke.setaltura(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa Altura:\n(solo numeros)","Datos de Pokemon",JOptionPane.INFORMATION_MESSAGE)));
		

		dts+="_________________________________________________________________________________________________\n";
		dts+=poke.getgim().getname()+
				"\t"+poke.getgim().getplace()+"\t"+poke.getgim().getprop()+
				"\t"+poke.getgim().getsupe()+"\t"+poke.getgim().getcapa()+"\n";
				
		dts+="\t\t\t\tEntrenador\nNombre\tApellido\tSexo\tEdad\tTelefono\tPokemon\tMedallas\n";
		dts+="_____________________________________________________________________________________________________\n";
		dts+=poke.getentr().getname()+"\t"+poke.getentr().getapellido()+
		     "\t"+poke.getentr().getsexo()+"\t"+poke.getentr().getedad()+
		     "\t"+poke.getentr().getphone()+"\t"+poke.getentr().getpoke()+
			 "\t"+poke.getentr().getmeda()+"\n";
			
		dts+="\t\t\t\tPokemon\nNombre\tTipo\tPoder\tHabilidad\tEspecie\tEvolucion\tPeso\tAltura\n";	
		dts+="_______________________________________________________________________________________________________________\n";
		dts+=poke.getname()+"\t"+poke.gettipo()+
			"\t"+poke.getpower()+"\t"+poke.gethabi()+
			"\t"+poke.getespe()+"\t"+poke.getevol()+
			"\t"+poke.getpeso()+"\t"+poke.getaltura();
		
		t1.setText(dts);
		return t1;
		
	}
}
