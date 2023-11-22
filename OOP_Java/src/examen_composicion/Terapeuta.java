package examen_composicion;

public class Terapeuta {
	//se instancia los datos
	private String name;
	private int edad;
	private String email;
	private String dir;
	private float pay;
	//se crea el constructor
	public Terapeuta(String name,int edad,String email,String dir,float pay)
	{
		this.name=name;
		this.edad=edad;
		this.email=email;
		this.dir=dir;
		this.pay=pay;
	}
	//se crean los geters
	public String gname()
	{
		return this.name;
	}
	public int gedad()
	{
		return this.edad;
	}
	public String gemail()
	{
		return this.email;
	}
	public String gdir()
	{
		return this.dir;
	}
	public float gpay()
	{
		return this.pay;
	}
	//se crean los seters
	public void sname(String name)
	{
		this.name=name;
	}
	public void sedad(int edad)
	{
		this.edad=edad;
	}
	public void semail(String email)
	{
		this.email=email;
	}
	public void sdir(String dir)
	{
		this.dir=dir;
	}
	public void spay(float pay)
	{
		this.pay=pay;
	}
	
	
	
	
	

}
