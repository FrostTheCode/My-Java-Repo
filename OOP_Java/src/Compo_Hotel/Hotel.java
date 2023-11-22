package Compo_Hotel;

public class Hotel {
	private Huesped hu;
	private Habitacion ha;
	private String name;
	private String dir;
	private String phone;
	private String www;
	private String rfc;
	private String cat;
	private String ciu;
	
	public Hotel(Huesped hu,Habitacion ha,String name,String dir
			,String phone,String www,String rfc,String cat,String ciu)
	{
		this.hu=hu;
		this.ha=ha;
		this.name=name;
		this.dir=dir;
		this.phone=phone;
		this.www=www;
		this.rfc=rfc;
		this.cat=cat;
		this.ciu=ciu;
	}
	
	public Huesped ghu()
	{
		return this.hu;
	}
	public Habitacion gha()
	{
		return this.ha;
	}
	public String gname()
	{
		return this.name;
	}
	public String gdir()
	{
		return this.dir;
	}
	public String gphone()
	{
		return this.phone;
	}
	public String gwww()
	{
		return this.www;
	}
	public String grfc()
	{
		return this.rfc;
	}
	public String gcat()
	{
		return this.cat;
	}
	public String gciu()
	{
		return this.ciu;
	}
	
	
	public void shu(Huesped hu)
	{
		this.hu=hu;
	}
	public void sha(Habitacion ha)
	{
		this.ha=ha;
	}
	public void sname(String name)
	{
		this.name=name;
	}
	public void sdir(String dir)
	{
		this.dir=dir;
	}
	public void sphone(String phone)
	{
		this.phone=phone;
	}
	public void swww(String www)
	{
		this.www=www;
	}
	public void srfc(String rfc)
	{
		this.rfc=rfc;
	}
	public void scat(String cat)
	{
		this.cat=cat;
	}
	public void sciu(String ciu)
	{
		this.ciu=ciu;
	}

}
