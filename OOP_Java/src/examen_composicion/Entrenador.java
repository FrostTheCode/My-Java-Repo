package examen_composicion;

public class Entrenador {
	//se instancia los datos
	private String name;
	private String last;
	private int edad;
	private String sexo;
	private int phone;
	private String email;
	private String dir;
	private String team;
	private int pay;
	//se crea el constructor
	public Entrenador(String name,String last,int edad,String sexo,int phone,String email,String dir,String team,int pay)
	{
		this.name=name;
		this.last=last;
		this.edad=edad;
		this.sexo=sexo;
		this.phone=phone;
		this.email=email;
		this.dir=dir;
		this.team=team;
		this.pay=pay;
	}
	//se crean los geters
	public String gname()
	{
		return this.name;
	}
	public String glast()
	{
		return this.last;
	}
	public int gedad()
	{
		return this.edad;
	}
	public String gsexo()
	{
		return this.sexo;
	}
	public int gphone()
	{
		return this.phone;
	}
	public String gemail()
	{
		return this.email;
	}
	public String gdir()
	{
		return this.dir;
	}
	public String gteam()
	{
		return this.team;
	}
	public int gpay()
	{
		return this.pay;
	}
	//ingresamos los seters
	public void sname(String name)
	{
		this.name=name;
	}
	public void slast(String last)
	{
		this.last=last;
	}
	public void sedad(int edad)
	{
		this.edad=edad;
	}
	public void ssexo(String sexo)
	{
		this.sexo=sexo;
	}
	public void sphone(int phone)
	{
		this.phone=phone;
	}
	public void semail(String email)
	{
		this.email=email;
	}
	public void sdir(String dir)
	{
		this.dir=dir;
	}
	public void steam(String team)
	{
		this.team=team;
	}
	public void spay(int pay)
	{
		this.pay=pay;
	}
	

}
