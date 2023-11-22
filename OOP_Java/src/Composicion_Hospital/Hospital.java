package Composicion_Hospital;

public class Hospital {
	private String name;
	private String dir;
	private String rfc;
	private String web;
	private int phone;
	
	public Hospital (String name, String dir, String rfc, String web,int phone)
	{
		this.name=name;
		this.dir=dir;
		this.rfc=rfc;
		this.web=web;
		this.phone=phone;
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
	public int getphone()
	{
		return this.phone;
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
	public void setphone(int phone)
	{
		this.phone=phone;
	}

}
