package mascota;

import javax.swing.JTextArea;

public class Imprime {
	Mascota m1=new Mascota("calaca","equino","Mustang",15,400,"Jose de la barrera","femenino","blanco","c.lopez obrador","promedio");
	JTextArea j1=new JTextArea();
	String dts="Nombre\tEspecie\tRaza\tEdad\tPeso\tSexo\tColor\tTamaño\tPropietario\tDireccion\n";
	
	public String toString()
	{
		return "Nombre: "+m1.getName()+"\nEspecie: "+m1.getEspecie()+"\nRaza: "+m1.getRaza()+"\nEdad: "+m1.getEdad()+"\nPeso en KG.: "+m1.getpeso()+
				"\nSexo: "+m1.getSexo()+"\nColor: "+m1.getColor()+"\nTamaño: "+m1.getSize()+"\nPropietario: "+m1.getDueno()+"\nDireccion: "+m1.getDireccion();
	}
	
	public Object toString2()
	{
		dts+="______________________________________________________________________________________________________________________________________________\n";
		dts+=m1.getName()+"\t"+m1.getEspecie()+"\t"+m1.getRaza()+"\t"+m1.getEdad()+"\t"+m1.getpeso()+"\t"+m1.getSexo()+"\t"+m1.getColor()+"\t"
				+m1.getSize()+"\t"+m1.getDueno()+"\t"+m1.getDireccion()+"\n";
		j1.setText(dts);
		return j1;
		
	}
	public Object toString3(Mascota m)
	{
		dts+=m.getName()+"\t"+m.getEspecie()+"\t"+m.getRaza()+"\t"+m.getEdad()+"\t"+m.getpeso()+"\t"+m.getSexo()+"\t"+m.getColor()+"\t"
				+m.getSize()+"\t"+m.getDueno()+"\t"+m.getDireccion()+"\n";
		j1.setText(dts);
		return j1;
	}
	

}
