package compo_Auto;

public class Vehiculo {
	private Chofer cho;
	private Empresa em;
	private String mar;
	private String mat;
	private String mo;
	private String col;
	
	public Vehiculo (Chofer cho,Empresa em,String mar,String mat,String mo,String col)
	{
		this.cho=cho;
		this.em=em;
		this.mar=mar;
		this.mat=mat;
		this.mo=mo;
		this.col=col;
	}
	
	public Chofer getcho()
	{
		return this.cho;
	}
	public Empresa getem()
	{
		return this.em;
	}
	public String getmar()
	{
		return this.mar;
	}
	public String getmat()
	{
		return this.mat;
	}
	public String getmo()
	{
		return this.mo;
	}
	public String getcol()
	{
		return this.col;
	}
	
	public void setcho(Chofer cho)
	{
		this.cho=cho;
	}
	public void setem(Empresa em)
	{
		this.em=em;
	}
	public void setmar(String mar)
	{
		this.mar=mar;
	}
	public void setmat(String mat)
	{
		this.mat=mat;
	}
	public void setmo(String mo)
	{
		this.mo=mo;
	}
	public void setcol(String col)
	{
		this.col=col;
	}
	

}
