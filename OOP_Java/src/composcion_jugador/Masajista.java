package composcion_jugador;

public class Masajista {

	private String name;
	private String email;
	private String direccion;
	private int edad;
	private float salario;
	
	public Masajista(String name,String email,String direccion,int edad,float salario)
	{
		this.name=name;
		this.email=email;
		this.direccion=direccion;
		this.edad=edad;
		this.salario=salario;
	}
	
	
	public String getname()
	{
		return this.name;
	}
	public String getemail()
	{
		return this.email;
	}
	public String getdireccion()

	{
		return this.direccion;
	}
	public int getedad()
	{
		return this.edad;
	}
	public float getsalario()
	{
		return this.salario;
	}
	
	
	public void setname(String name)
	{
		this.name=name;
	}
	public void setemail(String email)
	{
		this.email=email;
	}
	public void setdireccion(String direccion)
	{
		this.direccion=direccion;
	}
	public void setedad(int edad)
	{
		this.edad=edad;
	}
	public void setsalario(float salario)
	{
		this.salario=salario;
	}
}
