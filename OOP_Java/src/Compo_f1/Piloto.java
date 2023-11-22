package Compo_f1;

public class Piloto {
	private String name;
	private String last;
	private int edad;
	private String esc;
	private int point;
	private String email;
	private String patr;
	
	public Piloto (String name, String last, int edad,String esc,
			int point,String email, String patr)
	{
		this.name=name;
		this.last=last;
		this.edad=edad;
		this.esc=esc;
		this.point=point;
		this.email=email;
		this.patr=patr;
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
	} public String getesc()
	{
		return this.esc;
	} 
	public int getpoint()
	{
		return this.point;
	}
	public String getemail()
	{
		return this.email;
	} 
	public String getpatr()
	{
		return this.patr;
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
	public void setesc(String esc)
	{
		this.esc=esc;
	}
	public void setpoint(int point)
	{
		this.point=point;
	}
	public void setemail(String email)
	{
		this.email=email;
	}
	public void setpatr(String patr)
	{
		this.patr=patr;
	}
}
