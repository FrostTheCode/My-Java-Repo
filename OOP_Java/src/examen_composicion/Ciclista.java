package examen_composicion;

public class Ciclista {
	//se inicia instanciando los datos
	private String name;
	private String last;
	private int edad;
	private String team;
	private int no;
	private String email;
	private String patro;
	private int pay;
	
	//crearemos el constructor
	public Ciclista (String name,String last,int edad,String team,int no,String email,String patro,int pay)
	{
		this.name=name;
		this.last=last;
		this.edad=edad;
		this.team=team;
		this.no=no;
		this.email=email;
		this.patro=patro;
		this.pay=pay;
	}
	
	//ingresampos los geters de los datos
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
	public String gteam()
	{
		return this.team;
	}
	public int gno()
	{
		return this.no;
	}
	public String gemail()
	{
		return this.email;
	}
	public String gpatro()
	{
		return this.patro;
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
	public void steam(String team)
	{
		this.team=team;
	}
	public void sno(int no)
	{
		this.no=no;
	}
	public void semail(String email)
	{
		this.email=email;
	}
	public void spatro(String patro)
	{
		this.patro=patro;
	}
	public void spay(int pay)
	{
		this.pay=pay;
	}
	
	
	

}
