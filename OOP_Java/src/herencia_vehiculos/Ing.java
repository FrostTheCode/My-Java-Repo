package herencia_vehiculos;

import javax.swing.JOptionPane;

public class Ing {
	Imp i=new Imp();
	public void ing_aero()
	{
		String nam,mar,mod,col,cat;
		int cap;
		double pre,spe;
		nam=JOptionPane.showInputDialog("ingresa el nombre del aero");
		mar=JOptionPane.showInputDialog("ingresa la marca del aero");
		mod=JOptionPane.showInputDialog("ingresa el modelo del aero");
		col=JOptionPane.showInputDialog("ingresa el color del aero");
		cat=JOptionPane.showInputDialog("ingresa la categoria del aero");
		cap=Integer.parseInt(JOptionPane.showInputDialog("ingresa la capacidad del aero"));
		pre=Integer.parseInt(JOptionPane.showInputDialog("ingresa el precio del aero"));
		spe=Integer.parseInt(JOptionPane.showInputDialog("ingresa la velocidad del aero"));
		
		Aero a=new Aero(nam,mar,mod,col,pre,spe,cap,cat);
		JOptionPane.showMessageDialog(null,i.printAE(a),"datos del aero",JOptionPane.INFORMATION_MESSAGE);
	}
	public void ing_Aqua()
	{
		String nam,mar,mod,col,emp,rut;
		double pre,spe;
		nam=JOptionPane.showInputDialog("ingresa el nombre del aquatico");
		mar=JOptionPane.showInputDialog("ingresa la marca del aquatico");
		mod=JOptionPane.showInputDialog("ingresa el modelo del aquatico");
		col=JOptionPane.showInputDialog("ingresa el color del aquatico");
		emp=JOptionPane.showInputDialog("ingresa la empresa del aquatico");
		rut=JOptionPane.showInputDialog("ingresa la ruta del aquatico");
		pre=Integer.parseInt(JOptionPane.showInputDialog("ingresa el precio del aquatico"));
		spe=Integer.parseInt(JOptionPane.showInputDialog("ingresa la velocidad del aquatico"));
		
		Aqua q=new Aqua(nam,mar,mod,col,pre,spe,emp,rut);		
		JOptionPane.showMessageDialog(null,i.printAQ(q),"datos del aquatico",JOptionPane.INFORMATION_MESSAGE);
	}
	public void ing_terra()
	{
		String nam,mar,mod,col,tip;
		double pre,spe;
		nam=JOptionPane.showInputDialog("ingresa el nombre del terrestre");
		mar=JOptionPane.showInputDialog("ingresa la marca del terrestre");
		mod=JOptionPane.showInputDialog("ingresa el modelo del terrestre");
		col=JOptionPane.showInputDialog("ingresa el color del terrestre");
		tip=JOptionPane.showInputDialog("ingresa el tipo del terrestre");
		pre=Integer.parseInt(JOptionPane.showInputDialog("ingresa el precio del terrestre"));
		spe=Integer.parseInt(JOptionPane.showInputDialog("ingresa la velocidad del terrestre"));
		
		Terre t=new Terre(nam,mar,mod,col,pre,spe,tip);
		JOptionPane.showMessageDialog(null,i.printT(t),"datos del terrestre",JOptionPane.INFORMATION_MESSAGE);
	}

}
