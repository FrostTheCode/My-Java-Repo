package Composicion_Hospital;

public class Medico {
	private String name;
	private String last;
	private String dir;
	private String email;
	private int yer;
	private float sal;
	private int ced;
	private String esp;
	
	public Medico (String name, String last,String dir,String email, int yer,float sal,int ced,String esp)
	{
		this.name=name;
		this.last=last;
		this.dir=dir;
		this.email=email;
		this.yer=yer;
		this.sal=sal;
		this.ced=ced;
		this.esp=esp;
	}
	public String getname()
	{
		return this.name;
	}
	public String getlast()
	{
		return this.last;
	}
	public String getdir()
	{
		return this.dir;
	}
	public String getemail()
	{
		return this.email;
	}
	public int getyer()
	{
		return this.yer;
	}
	public float getsal()
	{
		return this.sal;
	}
	public int getced()
	{
		return this.ced;
	}
	public String getesp()
	{
		return this.esp;
	}
	
	
	
	public void setname(String name)
	{
		this.name=name;
	}
	public void setlast(String last)
	{
		this.last=last;
	}
	public void setdir(String dir)
	{
		this.dir=dir;
	}
	public void setemail(String email)
	{
		this.email=email;
	}
	public void setyer(int yer)
	{
		this.yer=yer;
	}
	public void setsal(float sal)
	{
		this.sal=sal;
	}
	public void setced(int ced)
	{
		this.ced=ced;
	}
	public void setesp(String esp)
	{
		this.esp=esp;
	}
}




