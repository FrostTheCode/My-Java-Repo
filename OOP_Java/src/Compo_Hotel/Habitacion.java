package Compo_Hotel;

public class Habitacion {
	private int nu;
	private String pis;
	private String cat;
	private String ca;
	
	public Habitacion (int nu,String pis,String cat,String ca)
	{
		this.nu=nu;
		this.pis=pis;
		this.cat=cat;
		this.ca=ca;
	}
	
	public int gnu()
	{
		return this.nu;
	}
	public String gpis()
	{
		return this.pis;
	}
	public String gcat()
	{
		return this.cat;
	}
	public String gca()
	{
		return this.ca;
	}
	
	public void snu(int nu)
	{
		this.nu=nu;
	}
	public void spis(String pis)
	{
		this.pis=pis;
	}
	public void scat(String cat)
	{
		this.cat=cat;
	}
	public void sca(String ca)
	{
		this.ca=ca;
	}
}
