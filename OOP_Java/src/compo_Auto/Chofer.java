package compo_Auto;

public class Chofer {
	private String name;
	private String last;
	private String dir;
	private String email;
	private int yer;
	private float sal;
	
	public Chofer (String name, String last,String dir,String email, int yer,float sal)
	{
		this.name=name;
		this.last=last;
		this.dir=dir;
		this.email=email;
		this.yer=yer;
		this.sal=sal;
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
	
}

