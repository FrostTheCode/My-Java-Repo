package Compo_f1;

public class Entrenador {
	private String name;
	private String last;
	private int edad;
	private String sex;
	private int phone;
	private String email;
	private String dir;
	
	public Entrenador(String name,String last,int edad,String sex,
			int phone,String email,String dir)
	{
		this.name=name;
		this.last=last;
		this.edad=edad;
		this.sex=sex;
		this.phone=phone;
		this.email=email;
		this.dir=dir;
	}
	public String getname()
	{
		return this.name;
	}
	public String getlast()
	{
		return this.last;
	}
	public int getedad()
	{
		return this.edad;
	}
	public String getsex()
	{
		return this.sex;
	}
	public int getphone()
	{
		return this.phone;
	}
	public String getemail()
	{
		return this.email;
	}
	public String getdir()
	{
		return this.dir;
	}
	
	
	public void setname(String name)
	{
		this.name=name;
	}
	public void setlast(String last)
	{
		this.last=last;
	}
	public void setedad(int edad)
	{
		this.edad=edad;
	}
	public void setsex(String sex)
	{
		this.sex=sex;
	}
	public void setphone(int phone)
	{
		this.phone=phone;
	}
	public void setemail(String email)
	{
		this.email=email;
	}
	public void setdir(String dir)
	{
		this.dir=dir;
	}
}   
    


