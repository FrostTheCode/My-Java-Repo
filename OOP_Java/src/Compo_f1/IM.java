package Compo_f1;

import javax.swing.JTextArea;

public class IM {
	Piloto p1=new Piloto("brin","frost",25,"mazda esc.",65325,"BrinTFRos@gmail.com","heineken");
	Entrenador e1=new Entrenador("marquis","freiz",60,"men",653185,"Markisf34@gmail","c.gibler #403");
	Automovil a1=new Automovil(p1,e1,"V6-zech","rojo",65,230,"VcQ-903=2020","Mercedez","serie Italiana");
	JTextArea t1=new JTextArea();
	String dts="\t\t\t\tPiloto\nNombre\tApellido\tEdad\tEscuderia\tPuntaje\tEmail\tPatrocinador\n";
	
	public Object im()
	{
		dts+="_____________________________________________________________________________________________________\n";
		dts+=a1.getpil().getname()+"\t"+a1.getpil().getlast()+"\t"+a1.getpil().getedad()
				+"\t"+a1.getpil().getesc()+"\t"+a1.getpil().getpoint()+"\t"+a1.getpil()
				.getemail()+"\t"+a1.getpil().getpatr()+"\n";
		
		dts+="\t\t\t\tEntrenador\nNombre\tApellido\tEdad\tSexo\tTelefono\tEmail\tDireccion\n";
		dts+="_______________________________________________________________________________________________________\n";
		dts+=a1.getent().getname()+"\t"+a1.getent().getlast()+"\t"+a1.getent().getedad()
				+"\t"+a1.getent().getsex()+"\t"+a1.getent().getphone()+"\t"
				+a1.getent().getemail()+"\t"+a1.getent().getdir()+"\n";
				
		dts+="\t\t\t\tAutomovil\nMotor\tColor\tNumero\tVelocidad Max.\tModelo\tFabricante\tCampeonatos\n";
		dts+="_________________________________________________________________________________________________________________________\n";
		dts+=a1.getmotor()+"\t"+a1.getcolor()+"\t"+a1.getno()+"\t"+a1.getvel()+"\t"+a1.getmod()
		        +"\t"+a1.getfab()+"\t"+a1.getcham()+"\n";
		t1.setText(dts);
		return t1;
	}

}
