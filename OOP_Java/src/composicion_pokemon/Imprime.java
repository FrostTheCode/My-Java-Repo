package composicion_pokemon;

import javax.swing.JTextArea;

public class Imprime {
Gimnasio gim=new Gimnasio("Port Masys","Sasae city","Grindow","Water Losa",4);
Entrenador e=new Entrenador("Firiyep","Crist","Femenino",15,9877231,4,2);
Pokemon poke=new Pokemon(gim,e,"Petilil","Planta-puro","nivel 15","hoja magica","semilla baya","liligath",50,1.0);
JTextArea t1=new JTextArea();
String dts="\t\t\t\tGimnasio\nNombre\tLocacion\tPropietario\tSuperficie\tCapacidad\n";

public Object print()
{
	dts+="_________________________________________________________________________________________________\n";
	dts+=poke.getgim().getname()+"\t"+poke.getgim().getplace()+
		"\t"+poke.getgim().getprop()+"\t"+poke.getgim().getsupe()
		+"\t"+poke.getgim().getcapa()+"\n";
			
	dts+="\t\t\t\tEntrenador\nNombre\tApellido\tSexo\tEdad\tTelefono\tPokemon\tMedallas\n";
	dts+="_______________________________________________________________________________________________________________________\n";
	dts+=poke.getentr().getname()+"\t"+poke.getentr().getapellido()+
	     "\t"+poke.getentr().getsexo()+"\t"+poke.getentr().getedad()+
	     "\t"+poke.getentr().getphone()+"\t\t"+poke.getentr().getpoke()+
		 "\t"+poke.getentr().getmeda()+"\n";
		
	dts+="\t\t\t\tPokemon\nNombre\tTipo\tPoder\tHabilidad\t\tEspecie\tEvolucion\tPeso\tAltura\n";	
	dts+="__________________________________________________________________________________________________________________________________________________\n";
	dts+=poke.getname()+"\t"+poke.gettipo()+
		"\t"+poke.getpower()+"\t"+poke.gethabi()+
		"\t"+poke.getespe()+"\t"+poke.getevol()+
		"\t"+poke.getpeso()+"\t"+poke.getaltura()+"\n";
	
	t1.setText(dts);
	return t1;
}

	
	

}
