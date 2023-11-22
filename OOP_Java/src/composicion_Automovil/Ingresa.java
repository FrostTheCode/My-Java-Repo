package composicion_Automovil;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ingresa {
	
	    Motor m=new Motor("4 Cilindros","cuatrocientos","media potencia","crisler",515882,"aleman");	
		Stereo s=new Stereo(629659,"Sony","8va gen","80Hz");
		Automovil a=new Automovil(m,s,"zvc-36","clad 4","100 mil km","deasel",66,98,518);
		JTextArea t1=new JTextArea();
		String dts="\t\t\t\tMotor\nCilindros\tCaballos\tPotencia\tfabricante\tidentificacion\torigen\n";
			
	public Object toprint()
	{
		
		m.setcili(JOptionPane.showInputDialog(null,"ingresa Cilindros: ","Datos de Motor",JOptionPane.INFORMATION_MESSAGE));
		m.setcaba(JOptionPane.showInputDialog(null,"ingresa Caballos: ","Datos de Motor",JOptionPane.INFORMATION_MESSAGE));
		m.setpote(JOptionPane.showInputDialog(null,"ingresa Potencia: ","Datos de Motor",JOptionPane.INFORMATION_MESSAGE));
		m.setfabri(JOptionPane.showInputDialog(null,"ingresa Fabrica: ","Datos de Motor",JOptionPane.INFORMATION_MESSAGE));
		m.setident(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa Identificacion:\n(solo numeros) ","Datos de Motor",JOptionPane.INFORMATION_MESSAGE)));
		m.setorig(JOptionPane.showInputDialog(null,"ingresa Origen: ","Datos de Motor",JOptionPane.INFORMATION_MESSAGE));
		
		s.setseri(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa Serie:\n(solo numeros) ","Datos de Stereo",JOptionPane.INFORMATION_MESSAGE)));
		s.setmarc(JOptionPane.showInputDialog(null,"ingresa Marca: ","Datos de Stereo",JOptionPane.INFORMATION_MESSAGE));
		s.setusb(JOptionPane.showInputDialog(null,"ingresa Entrada USB: ","Datos de Stereo",JOptionPane.INFORMATION_MESSAGE));
		s.setpote(JOptionPane.showInputDialog(null,"ingresa Potencia: ","Datos de Stereo",JOptionPane.INFORMATION_MESSAGE));
		
		a.setmarc(JOptionPane.showInputDialog(null,"ingresa Marca: ","Datos de Automovil",JOptionPane.INFORMATION_MESSAGE));
		a.setmode(JOptionPane.showInputDialog(null,"ingresa Modelo: ","Datos de Automovil",JOptionPane.INFORMATION_MESSAGE));
		a.setrend(JOptionPane.showInputDialog(null,"ingresa Rendimiento: ","Datos de Automovil",JOptionPane.INFORMATION_MESSAGE));
		a.setcomb(JOptionPane.showInputDialog(null,"ingresa Combustible: ","Datos de Automovil",JOptionPane.INFORMATION_MESSAGE));
		a.setcapa(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa Capacidad:\n(solo numeros) ","Datos de Automovil",JOptionPane.INFORMATION_MESSAGE)));
		a.setpuer(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa No. de Puertas:\n(solo numeros) ","Datos de Automovil",JOptionPane.INFORMATION_MESSAGE)));
		a.setsegu(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa No. Bolsas de Seguridad:\n(solo numeros) ","Datos de Automovil",JOptionPane.INFORMATION_MESSAGE)));
		

		dts+="_____________________________________________________________________________________________________\n";
		dts+=a.getmoto().getcili()+"\t"+a.getmoto().getcaba()+
				"\t"+a.getmoto().getpote()+"\t"+a.getmoto().getfabri()+
				"\t"+a.getmoto().getident()+"\t"+a.getmoto().getorig()+"\n";
				
		 dts+="\t\t\t\tEstereo\nN. Serie\tMarca\tPuertos USB\tPotencia\n";
		 dts+="_________________________________________________________________________________\n";
		 dts+=a.getstere().getseri()+"\t"+a.getstere().getmarc()+
				"\t"+a.getstere().getusb()+"\t"+a.getstere().getpote()+"\n";
				
		 dts+="\t\t\t\tAutomovil\nMarca\tModelo\tRendimiento\tCombustible\tCapacidad\tPuertas\tbolsa de seguridad\n";
		 dts+="___________________________________________________________________________________________________________________________\n";
		 dts+=a.getmarc()+"\t"+a.getmode()+"\t"+a.getrend()+
				"\t"+a.getcomb()+"\t"+a.getcapa()+"\t"+a.getpuer()+
				"\t"+a.getsegu();
		 
		t1.setText(dts);
		return t1;			
	}
}
