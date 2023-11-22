package Compo_Hotel;

import javax.swing.JTextArea;

public class Imprime {
	Huesped h1=new Huesped("franco","perez","c.nacional #16","Frnco63@gamil.com",49,4956789,"calisto");
	Habitacion h2=new Habitacion(3,"Sexto","economico","4 personas");
	Hotel h3 =new Hotel(h1,h2,"Franfilo","c. marcial #24","4652113","www.fanhotel.com","MJ526MH","3 Stars","cd. juarez");
	JTextArea t1=new JTextArea();
	String dts="\t\t\t\tHuesped\nNombre\tApellido\tDireccion\tEmail\t\tEdad\tTelefono\tOrigen\n";
	public Object toprint()
	{
		dts+="_______________________________________________________________________________________________________________________________________\n";
		dts+=h3.ghu().gname()+"\t"+h3.ghu().glast()+"\t"+h3.ghu().gdir()
		+"\t"+h3.ghu().gemail()+"\t"+h3.ghu().gyer()+"\t"+h3.ghu().gphone()
		+"\t"+h3.ghu().gori()+"\n";
		
		dts+="\t\t\t\tHabitacion\nNumero\tPiso\tCategoria\tCapacidad\n";
		dts+="_________________________________________________________________________________________\n";
		dts+=h3.gha().gnu()+"\t"+h3.gha().gpis()+"\t"+h3.gha().gcat()+"\t"
		+h3.gha().gca()+"\n";
		
		dts+="\t\t\t\tHotel\nNombre\tDireccion\tTelefono\tSitio Web\t\tRFC\tCategoria\tCiudad\n";
		dts+="__________________________________________________________________________________________________________________________________________\n";
		dts+=h3.gname()+"\t"+h3.gdir()+"\t"+h3.gphone()+"\t"+h3.gwww()
		+"\t"+h3.grfc()+"\t"+h3.gcat()+"\t"+h3.gciu()+"\n";
		t1.setText(dts);
		return t1;
	}
}
