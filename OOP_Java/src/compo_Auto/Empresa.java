package compo_Auto;

public class Empresa {
	private String name;
	private String dir;
	private String rfc;
	private String web;
	
	public Empresa (String name, String dir, String rfc, String web)
	{
		this.name=name;
		this.dir=dir;
		this.rfc=rfc;
		this.web=web;
	}
	
	public String getname()
	{
		return this.name;
	}
	public String getdir()
	{
		return this.dir;
	}
	public String getrfc()
	{
		return this.rfc;
	}
	public String getweb()
	{
		return this.web;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	public void setdir(String dir)
	{
		this.dir=dir;
	}
	public void setrfc(String rfc)
	{
		this.rfc=rfc;
	}
	public void setweb(String web)
	{
		this.web=web;
	}
	
	
	

}
