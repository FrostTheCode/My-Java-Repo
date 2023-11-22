package Composicion_Hospital;

public class Paciente {
	private Medico me;
	private Hospital ho;
	private String name;
	private String dir;
	private String sik;
	private String nss;
	private String email;
	private String phone;
	
	public Paciente (Medico me,Hospital ho,String name,String dir,String sik
			,String nss,String email, String phone)
	{
		this.me=me;
		this.ho=ho;
		this.name=name;
		this.dir=dir;
		this.sik=sik;
		this.nss=nss;
		this.email=email;
		this.phone=phone;
	}
	
	public Medico getme()
	{
		return this.me;
	}
	public Hospital getho()
	{
		return this.ho;
	}
	public String getname()
	{
		return this.name;
	}
	public String getdir()
	{
		return this.dir;
	}
	public String getsik()
	{
		return this.sik;
	}
	public String getnss()
	{
		return this.nss;
	}
	public String getemail()
	{
		return this.email;
	}
	public String getphone()
	{
		return this.phone;
	}
	
	
	public void setme(Medico me)
	{
		this.me=me;
	}
	public void setho(Hospital ho)
	{
		this.ho=ho;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setdir(String dir)
	{
		this.dir=dir;
	}
	public void setsik(String sik)
	{
		this.sik=sik;
	}
	public void setnss(String nss)
	{
		this.nss=nss;
	}
	public void setemail(String email)
	{
		this.email=email;
	}
	public void setPhone(String phone)
	{
		this.phone=phone;
	}

}









