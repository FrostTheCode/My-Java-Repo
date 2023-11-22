package Compo_f1;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class IN {
	Piloto p1=new Piloto("brin","frost",25,"mazda esc.",65325,"BrinTFRos@gmail.com","heineken");
	Entrenador e1=new Entrenador("marquis","freiz",60,"men",653185,"Markisf34@gmail","c.gibler #403");
	Automovil a1=new Automovil(p1,e1,"V6-zech","rojo",65,230,"VcQ-903=2020","Mercedez","serie Italiana");
	JTextArea t1=new JTextArea();
	String dts="\t\t\t\tPiloto\nNombre\tApellido\tEdad\tEscuderia\tPuntaje\tEmail\tPatrocinador\n";
	public Object in()
	{
		p1.setname(JOptionPane.showInputDialog("inserta el nombre: "));
		p1.setlast(JOptionPane.showInputDialog("ingresa el apellido: "));
        p1.setedad(Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad: ")));
        p1.setesc(JOptionPane.showInputDialog("ingresa la escuderia: "));
        p1.setpoint(Integer.parseInt(JOptionPane.showInputDialog("ingresa el puntaje: ")));
        p1.setemail(JOptionPane.showInputDialog("ingresa el email: "));
        p1.setpatr(JOptionPane.showInputDialog("ingresa el patrocinador: "));
        
        e1.setname(JOptionPane.showInputDialog("ingresa el nombre: "));
        e1.setlast(JOptionPane.showInputDialog("ingresa el apellido: "));
        e1.setedad(Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad: ")));
        e1.setsex(JOptionPane.showInputDialog("ingresa el sexo: "));
        e1.setphone(Integer.parseInt(JOptionPane.showInputDialog("ingresa el telefono: ")));
        e1.setemail(JOptionPane.showInputDialog("ingresa el email: "));
        e1.setdir(JOptionPane.showInputDialog("ingresa la direccion: "));
        
        a1.setmotor(JOptionPane.showInputDialog("ingresa el motor: "));
        a1.setcolor(JOptionPane.showInputDialog("ingresa el color: "));
        a1.setno(Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero: ")));
        a1.setvel(Integer.parseInt(JOptionPane.showInputDialog("ingresa la velocidad max: ")));
        a1.setmod(JOptionPane.showInputDialog("ingresa el modelo: "));
        a1.setfab(JOptionPane.showInputDialog("ingresa el fabricante: "));
        a1.setcham(JOptionPane.showInputDialog("ingresa los campeonatos: "));
        
        
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
