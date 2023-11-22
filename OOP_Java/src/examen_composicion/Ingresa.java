package examen_composicion;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ingresa {
	//se mandan a llamar los datos de las clases
	Ciclista ci=new Ciclista("marco","frinze",26,"free france",260,"frimar@gmail.com","malboro",34000);
	Entrenador en=new Entrenador("Grim","Dimer",56,"masculino",344323,"gri554@gmail.com","c.salim 43","free france",65000);
	Terapeuta te=new Terapeuta("dusher",35,"dush455@gmail.com","c.muller 65",65000);
	Pais pa=new Pais(ci,en,te,"Francia","free france",89000,"pier sule","www.pierfrance.com");
	JTextArea t1=new JTextArea();
	String dts="\t\t\t\tCiclista\nNombre\tApellido\tEdad\tEquipo\tNumero\tEmail\tPatrocinador\tSalario\n";
	//crear un objeto para ingresar los datos e imprimirlos
	public Object toing()
	{
		ci.sname(JOptionPane.showInputDialog(null,"ingresa el nombre","Datos del ciclista",JOptionPane.INFORMATION_MESSAGE));
		ci.slast(JOptionPane.showInputDialog(null,"ingresa el apellido","Datos del ciclista",JOptionPane.INFORMATION_MESSAGE));
		ci.sedad(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa la edad","Datos del ciclista",JOptionPane.INFORMATION_MESSAGE)));
		ci.steam(JOptionPane.showInputDialog(null,"ingresa el equipo","Datos del ciclista",JOptionPane.INFORMATION_MESSAGE));
		ci.sno(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el numero","Datos del ciclista",JOptionPane.INFORMATION_MESSAGE)));
		ci.semail(JOptionPane.showInputDialog(null,"ingresa el email","Datos del ciclista",JOptionPane.INFORMATION_MESSAGE));
		ci.spatro(JOptionPane.showInputDialog(null,"ingresa el patrocinador","Datos del ciclista",JOptionPane.INFORMATION_MESSAGE));
		ci.spay(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el salario","Datos del ciclista",JOptionPane.INFORMATION_MESSAGE)));
		
		en.sname(JOptionPane.showInputDialog(null,"ingresa el nombre","Datos del Entrenador",JOptionPane.INFORMATION_MESSAGE));
		en.slast(JOptionPane.showInputDialog(null,"ingresa el apellido","Datos del Entrenador",JOptionPane.INFORMATION_MESSAGE));
		en.sedad(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa la edad","Datos del Entrenador",JOptionPane.INFORMATION_MESSAGE)));
		en.ssexo(JOptionPane.showInputDialog(null,"ingresa el sexo","Datos del Entrenador",JOptionPane.INFORMATION_MESSAGE));
		en.sphone(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el telefono","Datos del Entrenador",JOptionPane.INFORMATION_MESSAGE)));
		en.semail(JOptionPane.showInputDialog(null,"ingresa el email","Datos del Entrenador",JOptionPane.INFORMATION_MESSAGE));
		en.sdir(JOptionPane.showInputDialog(null,"ingresa la direccion","Datos del Entrenador",JOptionPane.INFORMATION_MESSAGE));
		en.steam(JOptionPane.showInputDialog(null,"ingresa el equipo","Datos del Entrenador",JOptionPane.INFORMATION_MESSAGE));
		en.spay(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el salario","Datos del Entrenador",JOptionPane.INFORMATION_MESSAGE)));
		
		te.sname(JOptionPane.showInputDialog(null,"ingresa el nombre","Datos del Terapeuta",JOptionPane.INFORMATION_MESSAGE));
		te.sedad(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa la edad","Datos del Terapeuta",JOptionPane.INFORMATION_MESSAGE)));
		te.semail(JOptionPane.showInputDialog(null,"ingresa el email","Datos del Terapeuta",JOptionPane.INFORMATION_MESSAGE));
		te.sdir(JOptionPane.showInputDialog(null,"ingresa la direccion","Datos del Terapeuta",JOptionPane.INFORMATION_MESSAGE));
		te.spay(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el salario","Datos del Terapeuta",JOptionPane.INFORMATION_MESSAGE)));
		
		pa.sname(JOptionPane.showInputDialog(null,"ingresa el nombre","Datos del Pais",JOptionPane.INFORMATION_MESSAGE));
		pa.steam(JOptionPane.showInputDialog(null,"ingresa el equipo","Datos del Pais",JOptionPane.INFORMATION_MESSAGE));
		pa.sesp(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el numero de espectadores","Datos del Pais",JOptionPane.INFORMATION_MESSAGE)));
		pa.sruta(JOptionPane.showInputDialog(null,"ingresa la ruta","Datos del Pais",JOptionPane.INFORMATION_MESSAGE));
		pa.sweb(JOptionPane.showInputDialog(null,"ingresa el sitio web","Datos del Pais",JOptionPane.INFORMATION_MESSAGE));
		
		dts+="_______________________________________________________________________________________________________________________________________________\n";
		dts+=ci.gname()+"\t"+ci.glast()+"\t"+ci.gedad()+"\t"+ci.gteam()+"\t"+ci.gno()+"\t"+ci.gemail()+"\t"+ci.gpatro()+"\t"+ci.gpay()+"\n";
		
		dts+="\t\t\t\tEntrenador\nNombre\tapellido\tedad\tsexo\ttelefono\temail\tdir\tequipo\tsalario\n";
		dts+="___________________________________________________________________________________________________________________________________________________________\n";
		dts+=en.gname()+"\t"+en.glast()+"\t"+en.gedad()+"\t"+en.gsexo()+"\t"+en.gphone()+"\t"+en.gemail()+"\t"+en.gdir()+"\t"+en.gteam()+"\t"+en.gpay()+"\n";
		
		dts+="\t\t\t\tTerapeuta\nnombre\tedad\temail\tdir\tpay\n";
		dts+="___________________________________________________________________________________________\n";
		dts+=te.gname()+"\t"+te.gedad()+"\t"+te.gemail()+"\t"+te.gdir()+"\t"+te.gpay()+"\n";
		
		dts+="\t\t\t\tPais\nNombre\tequipo\tespectadores\truta\tweb\n";
		dts+="________________________________________________________________________________________________________________\n";
		dts+=pa.gname()+"\t"+pa.gteam()+"\t"+pa.gesp()+"\t"+pa.gruta()+"\t"+pa.gweb()+"\n";
		
		t1.setText(dts);
		return t1;
	}

}
