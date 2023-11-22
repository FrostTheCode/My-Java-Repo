package composicion_Automovil;
import javax.swing.JTextArea;
public class Imprime {
	 Motor m=new Motor("4 Cilindros","cuatrocientos","media potencia","crisler",515882,"aleman");	
		Stereo s=new Stereo(629659,"Sony","8va gen","80Hz");
		Automovil a=new Automovil(m,s,"zvc-36","clad 4","100 mil km","deasel",66,98,518);
		JTextArea t1=new JTextArea();
String dts="\t\t\t\tMotor\nCilindros\tCaballos\tPotencia\tfabricante\tidentificacion\torigen\n";
	
public Object print()
{
	dts+="_________________________________________________________________________________________________________________________________\n";
	dts+=a.getmoto().getcili()+"\t"+a.getmoto().getcaba()+
			"\t"+a.getmoto().getpote()+"\t"+a.getmoto().getfabri()+
			"\t"+a.getmoto().getident()+"\t"+a.getmoto().getorig()+"\n";
			
	 dts+="\t\t\t\tEstereo\nN. Serie\tMarca\tPuertos USB\tPotencia\n";
	 dts+="_________________________________________________________________________________\n";
	 dts+=a.getstere().getseri()+"\t"+a.getstere().getmarc()+
			"\t"+a.getstere().getusb()+"\t"+a.getstere().getpote()+"\n";
			
	 dts+="\t\t\t\tAutomovil\nMarca\tModelo\tRendimiento\tCombustible\tCapacidad\tPuertas\tbolsa de seguridad\n";
	 dts+="______________________________________________________________________________________________________________________________________________\n";
	 dts+=a.getmarc()+"\t"+a.getmode()+"\t"+a.getrend()+
			"\t"+a.getcomb()+"\t\t"+a.getcapa()+"\t"+a.getpuer()+
			"\t\t"+a.getsegu();
	 	
			t1.setText(dts);
			return t1;
}
}
