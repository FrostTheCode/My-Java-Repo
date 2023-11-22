package compo_Auto;

import javax.swing.JTextArea;

public class IMPRI {
	Chofer ch1=new Chofer("Marcus","Froid","c.Guter #09","guguenmar@yopmail.com",30,30500);
	Empresa em1=new Empresa("volswagen","c.bismark #803","met2378co","www.volswagen.com");
	Vehiculo v1=new Vehiculo(ch1,em1,"chevy","zha-685-54","2019","negro");
	JTextArea t1=new JTextArea();
	String dts="\t\t\t\tChofer\nNombre\tApellido\tDireccion\t\tEmail\tEdad\tSalario\n";
	public Object imp()
	{
		dts+="____________________________________________________________________________________________________________________________\n";
		dts+=v1.getcho().getname()+"\t"+v1.getcho().getlast()+"\t"
	        +v1.getcho().getdir()+"\t"+v1.getcho().getemail()+"\t"
		    +v1.getcho().getyer()+"\t"+v1.getcho().getsal()+"\n";
		
		dts+="\t\t\t\tEmpresa\nNombre\tDireccion\t\tRFC\tSitio WEB\n";
		dts+="__________________________________________________________________________________________________\n";
		dts+=v1.getem().getname()+"\t"+v1.getem().getdir()
				+"\t"+v1.getem().getrfc()+"\t"+v1.getem().getweb()+"\n";
		
		dts+="\t\t\t\tVehiculo\nMarca\tMatricula\tModelo\tColor\n";
		dts+="_____________________________________________________________________\n";
		dts+=v1.getmar()+"\t"+v1.getmat()+"\t"+v1.getmo()
	        +"\t"+v1.getcol()+"\n";
		t1.setText(dts);
		return t1;
	}
	
	
}
