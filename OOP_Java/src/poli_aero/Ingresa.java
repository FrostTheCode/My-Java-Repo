package poli_aero;

import javax.swing.JOptionPane;

public class Ingresa {
	Imprime i=new Imprime();
	public void ing_avi()
	{
		String name,mar,col,com;
		int mod,cap,nmot;
		double pre,vel;
		name=JOptionPane.showInputDialog("ingresa el nombre del avion");
		mar=JOptionPane.showInputDialog("ingresa la marca del avion");
		col=JOptionPane.showInputDialog("ingresa el Color del avion");
		mod=Integer.parseInt(JOptionPane.showInputDialog("ingresa el modelo del avion"));
		pre=Double.parseDouble(JOptionPane.showInputDialog("ingresa el Precio del avion"));
		vel=Double.parseDouble(JOptionPane.showInputDialog("ingresa la velocidad del avion"));
		com=JOptionPane.showInputDialog("ingresa la compania del avion");
		cap=Integer.parseInt(JOptionPane.showInputDialog("ingresa la capacidad del avion"));
		nmot=Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero de motores del avion"));
		
		Aero a=new Avion(name, mar, mod, col, pre, vel,cap,com,nmot);
		JOptionPane.showMessageDialog(null, i.imp_avi((Avion) a),"Datos del Avion",JOptionPane.INFORMATION_MESSAGE);
	}
	public void ing_hel()
	{
		String name,mar,col,emp,rut;
		int mod;
		double pre,vel;
		float cosre;
		name=JOptionPane.showInputDialog("ingresa el nombre del helicoptero");
		mar=JOptionPane.showInputDialog("ingresa la marca del helicoptero");
		col=JOptionPane.showInputDialog("ingresa el Color del helicoptero");
		mod=Integer.parseInt(JOptionPane.showInputDialog("ingresa el modelo del helicoptero"));
		pre=Double.parseDouble(JOptionPane.showInputDialog("ingresa el Precio del helicoptero"));
		vel=Double.parseDouble(JOptionPane.showInputDialog("ingresa la velocidad del helicoptero"));
		emp=JOptionPane.showInputDialog("ingresa la empresa del helicoptero");
		rut=JOptionPane.showInputDialog("ingresa la ruta del helicoptero");
		cosre=Float.parseFloat(JOptionPane.showInputDialog("ingresa el Costo del recorrido del helicoptero"));
		
		Aero a=new Helicoptero(name, mar, mod, col, pre, vel,emp,rut,cosre);
		JOptionPane.showMessageDialog(null, i.imp_hel((Helicoptero) a),"Datos del helicoptero",JOptionPane.INFORMATION_MESSAGE);
	}
	public void ing_glo()
	{
		String name,mar,col,tipo;
		int mod;
		double pre,vel;
		float temrec;
		name=JOptionPane.showInputDialog("ingresa el nombre del globo");
		mar=JOptionPane.showInputDialog("ingresa la marca del globo");
		col=JOptionPane.showInputDialog("ingresa el Color del globo");
		mod=Integer.parseInt(JOptionPane.showInputDialog("ingresa el modelo del globo"));
		pre=Double.parseDouble(JOptionPane.showInputDialog("ingresa el Precio del globo"));
		vel=Double.parseDouble(JOptionPane.showInputDialog("ingresa la velocidad del globo"));
		tipo=JOptionPane.showInputDialog("ingresa el tipo del globo");
		temrec=Float.parseFloat(JOptionPane.showInputDialog("ingresa el tiempo del recorrido del globo"));
		
		Aero a=new Globo(name, mar, mod, col, pre, vel,tipo,temrec);
		JOptionPane.showMessageDialog(null, i.imp_glo((Globo) a),"Datos del Globo",JOptionPane.INFORMATION_MESSAGE);
	}

}
