package Compo_Hotel;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ingresa {
	Huesped h1=new Huesped("franco","perez","c.nacional #16","Frnco63@gamil.com",49,4956789,"calisto");
	Habitacion h2=new Habitacion(3,"Sexto","economico","4 personas");
	Hotel h3 =new Hotel(h1,h2,"Franfilo","c. marcial #24","4652113","www.fanhotel.com","MJ526MH","3 Stars","cd. juarez");
	JTextArea t1=new JTextArea();
	String dts="\t\t\t\tHuesped\nNombre\tApellido\tDireccion\tEmail\tEdad\tTelefono\tOrigen\n";
	public Object toing()
	{
		h1.sname(JOptionPane.showInputDialog(null,"ingrese el Nombre: ","Datos del Huesped",JOptionPane.INFORMATION_MESSAGE));
		h1.slast(JOptionPane.showInputDialog(null,"ingrese el Apellido: ","Datos del Huesped",JOptionPane.INFORMATION_MESSAGE));
		h1.sdir(JOptionPane.showInputDialog(null,"ingrese la Direccion: ","Datos del Huesped",JOptionPane.INFORMATION_MESSAGE));
		h1.semail(JOptionPane.showInputDialog(null,"ingrese el Email: ","Datos del Huesped",JOptionPane.INFORMATION_MESSAGE));
		h1.syer(Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la Edad:\n(solo numeros) ","Datos del Huesped",JOptionPane.INFORMATION_MESSAGE)));
		h1.sphone(Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el Telefono:\n(solo numeros) ","Datos del Huesped",JOptionPane.INFORMATION_MESSAGE)));
		h1.sori(JOptionPane.showInputDialog(null,"ingrese el Origen: ","Datos del Huesped",JOptionPane.INFORMATION_MESSAGE));
		
		h2.snu(Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el Numero:\n(solo numero): ","Datos de la Habitacion",JOptionPane.INFORMATION_MESSAGE)));
		h2.spis(JOptionPane.showInputDialog(null,"ingrese el Piso: ","Datos de la Habitacion",JOptionPane.INFORMATION_MESSAGE));
		h2.scat(JOptionPane.showInputDialog(null,"ingrese la Categoria: ","Datos de la Habitacion",JOptionPane.INFORMATION_MESSAGE));
		h2.sca(JOptionPane.showInputDialog(null,"ingrese la Capacidad: ","Datos de la Habitacion",JOptionPane.INFORMATION_MESSAGE));
		
		h3.sname(JOptionPane.showInputDialog(null,"ingrese el Nombre: ","Datos de la Hotel",JOptionPane.INFORMATION_MESSAGE));
		h3.sdir(JOptionPane.showInputDialog(null,"ingrese la Direccion: ","Datos de la Hotel",JOptionPane.INFORMATION_MESSAGE));
		h3.sphone(JOptionPane.showInputDialog(null,"ingrese el Telefono: ","Datos de la Hotel",JOptionPane.INFORMATION_MESSAGE));
		h3.swww(JOptionPane.showInputDialog(null,"ingrese el Sitio Web: ","Datos de la Hotel",JOptionPane.INFORMATION_MESSAGE));
		h3.srfc(JOptionPane.showInputDialog(null,"ingrese el RFC: ","Datos de la Hotel",JOptionPane.INFORMATION_MESSAGE));
		h3.scat(JOptionPane.showInputDialog(null,"ingrese la Categoria: ","Datos de la Hotel",JOptionPane.INFORMATION_MESSAGE));
		h3.sciu(JOptionPane.showInputDialog(null,"ingrese la Ciudad: ","Datos de la Hotel",JOptionPane.INFORMATION_MESSAGE));
		
		
		dts+="________________________________________________________________________________________________\n";
		dts+=h3.ghu().gname()+"\t"+h3.ghu().glast()+"\t"+h3.ghu().gdir()
		+"\t"+h3.ghu().gemail()+"\t"+h3.ghu().gyer()+"\t"+h3.ghu().gphone()
		+"\t"+h3.ghu().gori()+"\n";
		
		dts+="\t\t\t\tHabitacion\nNumero\tPiso\tCategoria\tCapacidad\n";
		dts+="________________________________________________________________________________\n";
		dts+=h3.gha().gnu()+"\t"+h3.gha().gpis()+"\t"+h3.gha().gcat()+"\t"
		+h3.gha().gca()+"\n";
		
		dts+="\t\t\t\tHotel\nNombre\tDireccion\tTelefono\tSitio Web\tRFC\tCategoria\tCiudad\n";
		dts+="_____________________________________________________________________________________________\n";
		dts+=h3.gname()+"\t"+h3.gdir()+"\t"+h3.gphone()+"\t"+h3.gwww()
		+"\t"+h3.grfc()+"\t"+h3.gcat()+"\t"+h3.gciu()+"\n";
		t1.setText(dts);
		return t1;
	}
}


