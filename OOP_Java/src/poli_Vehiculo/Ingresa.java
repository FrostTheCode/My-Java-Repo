package poli_Vehiculo;

import javax.swing.JOptionPane;

public class Ingresa {
	Imprime i=new Imprime();
	public void ing_dep()
	{
		String mat,mod,mar;
		int ncil;
		mat=JOptionPane.showInputDialog(null,"ingresa la matricula","Datos del deportivo",JOptionPane.INFORMATION_MESSAGE);
		mod=JOptionPane.showInputDialog(null,"ingresa el modelo","Datos del deportivo",JOptionPane.INFORMATION_MESSAGE);
		mar=JOptionPane.showInputDialog(null,"ingresa la marca","Datos del deportivo",JOptionPane.INFORMATION_MESSAGE);
		ncil=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa los cilindros\n(solo numeros):","Datos del deportivo",JOptionPane.INFORMATION_MESSAGE));
	    Vehiculo v1=new Deportivo(mat, mod, mar,ncil);
	    JOptionPane.showMessageDialog(null, i.imp_dep((Deportivo) v1),"datos del Deportivo",JOptionPane.INFORMATION_MESSAGE);
	}
	public void ing_fam()
	{
		String mat,mod,mar;
		int npu;
		mat=JOptionPane.showInputDialog(null,"ingresa la matricula","Datos del familiar",JOptionPane.INFORMATION_MESSAGE);
		mod=JOptionPane.showInputDialog(null,"ingresa el modelo","Datos del familiar",JOptionPane.INFORMATION_MESSAGE);
		mar=JOptionPane.showInputDialog(null,"ingresa la marca","Datos del familiar",JOptionPane.INFORMATION_MESSAGE);
		npu=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa las puertas\n(solo numeros):","Datos del familiar",JOptionPane.INFORMATION_MESSAGE));
	    Vehiculo v1=new Familiar(mat, mod, mar,npu);
	    JOptionPane.showMessageDialog(null, i.imp_fam((Familiar) v1),"datos del familiar",JOptionPane.INFORMATION_MESSAGE);
	}
	public void ing_car()
	{
		String mat,mod,mar,dep;
		int cap_car;
		mat=JOptionPane.showInputDialog(null,"ingresa la matricula","Datos del cargo",JOptionPane.INFORMATION_MESSAGE);
		mod=JOptionPane.showInputDialog(null,"ingresa el modelo","Datos del cargo",JOptionPane.INFORMATION_MESSAGE);
		mar=JOptionPane.showInputDialog(null,"ingresa la marca","Datos del cargo",JOptionPane.INFORMATION_MESSAGE);
		dep=JOptionPane.showInputDialog(null,"ingresa el departamento","Datos del cargo",JOptionPane.INFORMATION_MESSAGE);
		cap_car=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa la capacidad\n(solo numeros):","Datos del familiar",JOptionPane.INFORMATION_MESSAGE));
	    Vehiculo v1=new Carga(mat, mod, mar,cap_car,dep);
	    JOptionPane.showMessageDialog(null, i.imp_car((Carga) v1),"datos del cargo",JOptionPane.INFORMATION_MESSAGE);
	}
}
