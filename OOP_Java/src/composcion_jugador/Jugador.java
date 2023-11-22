package composcion_jugador;

public class Jugador {

	private String name;
	private String apellido;
	private String equipo;
	private String email;
	private String patrocinador;
	private int num;
	private int edad;
	private float salario;
	
	public Jugador(String name,String apellido, String equipo,String email,String patrocinador,int num,int edad,float salario)
	{
		this.name=name;
		this.apellido=apellido;
		this.equipo=equipo;
		this.email=email;
		this.patrocinador=patrocinador;
		this.num=num;
		this.edad=edad;
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
	public String getpatrocinador()
	{
		return this.patrocinador;
	}
	public int getnum()
	{
		return this.num;
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
	public void setpatrocinador(String patrocinador)
	{
		this.patrocinador=patrocinador;
	}
	public void setnum(int num)
	{
		this.num=num;
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
