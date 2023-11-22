package examen_composicion;

public class Pais {
	//se instancia los datos
	private Ciclista ci;
	private Entrenador en;
	private Terapeuta te;
	private String name;
	private String team;
	private int esp;
	private String ruta;
	private String web;
	//se crea el constructor
	public Pais(Ciclista ci,Entrenador en,Terapeuta te,String name,String team,int esp,String ruta,String web)
	{
		this.ci=ci;
		this.en=en;
		this.te=te;
		this.name=name;
		this.team=team;
		this.esp=esp;
		this.ruta=ruta;
		this.web=web;
	}
	//se crean los geters
	public Ciclista gci()
	{
		return this.ci;
	}
	public Entrenador gen()
	{
		return this.en;
	}
	public Terapeuta gte()
	{
		return this.te;
	}
	public String gname()
	{
		return this.name;
	}
	public String gteam()
	{
		return this.team;
	}
	public int gesp()
	{
		return this.esp;
	}
	public String gruta()
	{
		return this.ruta;
	}
	public String gweb()
	{
		return this.web;
	}
	//se crean los seters
	public void sci(Ciclista ci)
	{
		this.ci=ci;
	}
	public void sne(Entrenador en)
	{
		this.en=en;
	}
	public void ste(Terapeuta te)
	{
		this.te=te;
	}
	public void sname(String name)
	{
		this.name=name;
	}
	public void steam(String team)
	{
		this.team=team;
	}
	public void sesp(int esp)
	{
		this.esp=esp;
	}
	public void sruta(String ruta)
	{
		this.ruta=ruta;
	}
	public void sweb(String web)
	{
		this.web=web;
	}
	

}
