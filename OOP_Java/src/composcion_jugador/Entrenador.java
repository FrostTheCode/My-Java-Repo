package composcion_jugador;

public class Entrenador {

	private String name;
	private String apellido;
	private String equipo;
	private String email;
	private String sexo;
	private int edad;
	private int phone;
	private int camp;
	private float salario;
	
	public Entrenador(String name,String apellido,String equipo,String email,String sexo,int edad,int phone,int camp,float salario)
	{
		this.name=name;
		this.apellido=apellido;
		this.equipo=equipo;
		this.email=email;
		this.email=email;
		this.sexo=sexo;
		this.edad=edad;
		this.phone=phone;
		this.camp=camp;
		this.salario=salario;
	}
	
	
	public String getname()
	{
		return this.name;
	}
	public String getapellido()
	{
		return this.apellido;
	}
	public String getequipo()
	{
		return this.equipo;
	}
	public String getemail()
	{
		return this.email;
	}
	public String getsexo()
	{
		return this.sexo;
	}
	public int getedad()
	{
		return this.edad;
	}
	public int getphone()
	{
		return this.phone;
	}
	public int getcamp()
	{
		return this.camp;
	}
	public float getsalario()
	{
		return this.salario;
	}
	
	
	public void setname(String name)
	{
		this.name=name;
	}
	public void setapellido(String apellido)
	{
		this.apellido=apellido;
	}
	public void setequipo(String equipo)
	{
		this.equipo=equipo;
	}
	public void setemail(String email)
	{
		this.email=email;
	}
	public void setsexo(String sexo)
	{
		this.sexo=sexo;
	}
	public void setedad(int edad)
	{
		this.edad=edad;
	}
	public void setphone(int phone)
	{
		this.phone=phone;
	}
	public void setcamp(int camp)
	{
		this.camp=camp;
	}
	public void setsalario(float salario)
	{
		this.salario=salario;
	}
	
}
