package Vehiculo_get_set;

public class Vehiculo {
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private double tarifa=0.0;
	private boolean disponibe=false;
	public String getMatricula()
	{
		return this.matricula;
	}
	public String getMarca()
	{
		return this.marca;
	}
	public String getModelo()
	{
		return this.modelo;
	}
	public String getColor()
	{
		return this.color;
	}
	public double getTarifa()
	{
		return this.tarifa;
	}
	public boolean getDisponible()
	{
	      return this.disponibe;
	}
	//definir el constructor de la clase 
	public Vehiculo(String matricula,String marca,String modelo,String color,double tarifa,boolean disponibe)
	{
		this.matricula=matricula;
		this.marca=marca;
		this.modelo=modelo;
		this.color=color;
		this.tarifa=tarifa;
		this.disponibe=disponibe;
		
	}
	//definir los metodos set
	public void setMatricula(String matricula)
	{
		this.matricula=matricula;
	}
	public void setMarca(String marca)
	{
		this.marca=marca;
	}
	public void setModelo(String modelo)
	{
		this.modelo=modelo;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public void setTarifa(double Tarifa)
	{
		this.tarifa=tarifa;
	}
	public void setDisponible(boolean Disponible)
	{
		this.disponibe=disponibe;
	}
	//definir los metodos get
	

}
