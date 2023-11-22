package listaDesordenada;

import java.util.Scanner;

public class mascota {
	private String name;
	private String raza;
	private String color;
	private double peso;
	private double alt;
	
	public mascota()
	{
		
	}
	public mascota(String name)
	{
		this.name=name;
	}
	@Override
	public boolean equals(Object x) {
		if (x instanceof mascota)
		{
			mascota objx=(mascota)x;
			if (this.name.equalsIgnoreCase(objx.name))return true;
			else return false;
		}else return false;
		
	}
	public void ped()
	{
		Scanner read=new Scanner (System.in);
		System.out.println("inserta los datos de la mascota");
		System.out.println("nombre");this.name=read.nextLine();
		System.out.println("raza");this.raza=read.nextLine();
		System.out.println("color");this.color=read.nextLine();
		System.out.println("peso");this.peso=read.nextDouble();
		System.out.println("alt");this.alt=read.nextDouble();
	}
	@Override
	public String toString() {
		return "mascota [name=" + name + ", raza=" + raza + ", color=" + color + ", peso=" + peso + ", alt=" + alt
				+ "]";
	}
	
	

}
