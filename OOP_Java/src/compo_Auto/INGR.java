package compo_Auto;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class INGR {
	
	    Chofer ch1=new Chofer("Marcus","Froid","c.Guter #09","guguenmar@yopmail.com",30,30500);
		Empresa em1=new Empresa("volswagen","c.bismark #803","met2378co","www.volswagen.com");
		Vehiculo v1=new Vehiculo(ch1,em1,"chevy","zha-685-54","2019","negro");
		JTextArea t1=new JTextArea();
		String dts="\t\t\t\tChofer\nNombre\tApellido\tDireccion\tEmail\tEdad\tSalario\n";
	
		public Object inp()
	{
		ch1.setname(JOptionPane.showInputDialog(null,"ingresa el nombre del chofer: ","Datos del chofer",JOptionPane.INFORMATION_MESSAGE));
		ch1.setlast(JOptionPane.showInputDialog(null,"ingresa el apellido del chofer: ","Datos del chofer",JOptionPane.INFORMATION_MESSAGE));
		ch1.setdir(JOptionPane.showInputDialog(null,"ingresa la direccion del chofer: ","Datos del chofer",JOptionPane.INFORMATION_MESSAGE));
		ch1.setemail(JOptionPane.showInputDialog(null,"ingresa el email del chofer: ","Datos del chofer",JOptionPane.INFORMATION_MESSAGE));
		ch1.setyer(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa la edad del chofer\n(solo numeros): ","Datos del chofer",JOptionPane.INFORMATION_MESSAGE)));
		ch1.setsal(Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el salario del chofer\n(solo numeros): ","Datos del chofer",JOptionPane.INFORMATION_MESSAGE)));
		
		em1.setname(JOptionPane.showInputDialog(null,"ingresa el Nombre de la Empresa: ","Datos de la empresa",JOptionPane.INFORMATION_MESSAGE));
		em1.setdir(JOptionPane.showInputDialog(null,"ingresa la Direccion de la Empresa:","Datos del chofer",JOptionPane.INFORMATION_MESSAGE));
		em1.setrfc(JOptionPane.showInputDialog(null,"ingresa el RFC de la Empresa: ","Datos de la empresa",JOptionPane.INFORMATION_MESSAGE));
		em1.setweb(JOptionPane.showInputDialog(null,"ingresa el Sitio WEB de la Empresa: ","Datos de la empresa",JOptionPane.INFORMATION_MESSAGE));
		
		v1.setmar(JOptionPane.showInputDialog(null,"ingresa la Marca del Vehiculo: ","Datos del Vehiculo",JOptionPane.INFORMATION_MESSAGE));
		v1.setmo(JOptionPane.showInputDialog(null,"ingresa el Modelo del Vehiculo","Datos del Vehiculo",JOptionPane.INFORMATION_MESSAGE));
		v1.setmat(JOptionPane.showInputDialog(null,"ingresa la Matricula del Vehiculo: ","Datos del Vehiculo",JOptionPane.INFORMATION_MESSAGE));
		v1.setcol(JOptionPane.showInputDialog(null,"ingresa el Color del Vehiculo: ","Datos del Vehiculo",JOptionPane.INFORMATION_MESSAGE));
		
		
		dts+="__________________________________________________________________________________________________\n";
		dts+=v1.getcho().getname()+"\t"+v1.getcho().getlast()+"\t"
	        +v1.getcho().getdir()+"\t"+v1.getcho().getemail()+"\t"
		    +v1.getcho().getyer()+"\t"+v1.getcho().getsal()+"\n";
		
		dts+="\t\t\t\tEmpresa\nNombre\tDireccion\tRFC\tSitio WEB\n";
		dts+="__________________________________________________________________________________________________\n";
		dts+=v1.getem().getname()+"\t"+v1.getem().getdir()
				+"\t"+v1.getem().getrfc()+"\t"+v1.getem().getweb()+"\n";
		
		dts+="\t\t\t\tVehiculo\nMarca\tMatricula\tModelo\tColor\n";
		dts+="___________________________________________________________________________________________________\n";
		dts+=v1.getmar()+"\t"+v1.getmat()+"\t"+v1.getmo()
	        +"\t"+v1.getcol()+"\n";
		t1.setText(dts);
		return t1;
		
	}


}
