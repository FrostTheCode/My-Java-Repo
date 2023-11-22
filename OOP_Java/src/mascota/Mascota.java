package mascota;

public class Mascota {
	private String name;
	private String especie;
	private String raza;
	private int edad;
	private double peso;
	private String dueno;
	private String sexo;
	private String color;
	private String direccion;
	private String size;
	
	public Mascota(String name,String especie, String raza,int edad, double peso,String dueno,String sexo,String color,String direccion,String size) 
	{
		this.name=name;
		this.especie=especie;
		this.raza=raza;
		this.edad=edad;
		this.peso=peso;
		this.dueno=dueno;
		this.sexo=sexo;
		this.color=color;
		this.direccion=direccion;
		this.size=size;
	}
	
	public String getName()
	{
		return this.name;
	}
	public String getEspecie()
	{
		return this.especie;
	}
	public String getRaza()
	{
		return this.raza;
	}
	public int getEdad()
	{
		return this.edad;
	}
	public double getpeso()
	{
		return this.peso;
	}
	public String getDueno()	
	{
		return this.dueno;
	}
	public String getSexo()
	{
		return this.sexo;
	}
	public String getColor()
	{
		return this.color;
	}
	public String getDireccion()
	{
		return this.direccion;
	}
	public String getSize()
	{
		return this.size;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setEspecie(String especie)
	{
		this.especie=especie;
	}
	public void setRaza(String raza)
	{
		this.raza=raza;
	}
	public void setPeso(double peso)
	{
		this.peso=peso;
	}
	public void setEdad(int edad)
	{
		this.edad=edad;
	}
	public void setDueno(String dueno)
	{
		this.dueno=dueno;
	}
	public void setSexo(String sexo)
	{
		this.sexo=sexo;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public void setDierccion(String direccion)
	{
		this.direccion=direccion;
	}
	public void setSize(String size)
	{
		this.size=size;
	}
	
	

}
