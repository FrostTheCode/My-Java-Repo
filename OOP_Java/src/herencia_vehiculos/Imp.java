package herencia_vehiculos;

import javax.swing.JTextArea;

public class Imp {
	JTextArea t1=new JTextArea();
	String da="\t\t\tDatos del Aero\nNombre\tMarca\tModelo\tColor\tPrecio\tVelocidad\tCapacidad\tCategoria\n";
	public Object printAE(Aero a)
	{
		da+=("___________________________________________________________________________________________________________________________________________\n");
		da+=a.getName()+"\t"+a.getMarca()+"\t"+a.getMod()+"\t"+a.getColor()+"\t"+a.getPrecio()+"\t"+a.getSpeed()+"\t"+a.getCap()+"\t"+a.getCat();
		t1.setText(da);
		return t1;
	}
	String dq="\t\t\tDatos del Aquatico\nNombre\tMarca\tModelo\tColor\tPrecio\tVelocidad\tEmpresa\tRuta\n";
	public Object printAQ(Aqua q)
	{
		dq+=("___________________________________________________________________________________________________________________________________________\n");
		dq+=q.getName()+"\t"+q.getMarca()+"\t"+q.getMod()+"\t"+q.getColor()+"\t"+q.getPrecio()+"\t"+q.getSpeed()+"\t"+q.getEmp()+"\t"+q.getRuta();
		t1.setText(dq);
		return t1;
	}
	String dt="\t\t\tDatos del Terrestre\nNombre\tMarca\tModelo\tColor\tPrecio\tVelocidad\tTipo\n";
	public Object printT(Terre t)
	{
		dt+=("___________________________________________________________________________________________________________________________________________\n");
		dt+=t.getName()+"\t"+t.getMarca()+"\t"+t.getMod()+"\t"+t.getColor()+"\t"+t.getPrecio()+"\t"+t.getSpeed()+"\t"+t.getTipo();
		t1.setText(dt);
		return t1;
	}

}
