package Compo_Hotel;

public class Huesped {
	private String name;
	private String last;
	private String dir;
	private String email;
	private int yer;
	private int phone;
	private String ori;
	
	public Huesped (String name,String last,String dir,String email
			,int yer,int phone,String ori)
	{
		this.name=name;
		this.last=last;
		this.dir=dir;
		this.email=email;
		this.yer=yer;
		this.phone=phone;
		this.ori=ori;
	}
	
	public String gname()
	{
		return this.name;
	}
	public String glast()
	{
		return this.last;
	}
	public String gdir()
	{
		return this.dir;
	}
	public String gemail()
	{
		return this.email;
	}
	public int gyer()
	{
		return this.yer;
	}
	public int gphone()
	{
		return this.phone;
	}
	public String gori()
	{
		return this.ori;
	}
	
	
	public void sname(String name)
	{
		this.name=name;
	}
	public void slast(String last)
	{
		this.last=last;
	}
	public void sdir(String dir)
	{
		this.dir=dir;
	}
	public void semail(String email)
	{
		this.email=email;
	}
	public void syer(int yer)
	{
		this.yer=yer;
	}
	public void sphone(int phone)
	{
		this.phone=phone;
	}
	public void sori(String ori)
	{
		this.ori=ori;
	}
}
