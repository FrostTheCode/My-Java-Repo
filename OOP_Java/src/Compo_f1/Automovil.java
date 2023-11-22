package Compo_f1;

public class Automovil {
	private Piloto pil;
	private Entrenador ent;
	private String motor;
	private String color;
	private int no;
	private float vel;
	private String mod;
	private String fab;
	private String cham;
	
	public Automovil(Piloto pil,Entrenador ent,String motor,String color
			,int no,float vel,String mod,String fab,String cham)
	{
		this.pil=pil;
		this.ent=ent;
		this.motor=motor;
		this.color=color;
		this.no=no;
		this.vel=vel;
		this.mod=mod;
		this.fab=fab;
		this.cham=cham;
	}
	
	public Piloto getpil()
	{
		return this.pil;
	}
	public Entrenador getent()
	{
		return this.ent;
	}
	public String getmotor()
	{
		return this.motor;
	}
	public String getcolor()
	{
		return this.color;
	}
	public int getno()
	{
		return this.no;
	}
	public float getvel()
	{
		return this.vel;
	}
	public String getmod()
	{
		return this.mod;
	}
	public String getfab()
	{
		return this.fab;
	}
	public String getcham()
	{
		return this.cham;
	}
	
	
	public void setpil(Piloto pil)
	{
		this.pil=pil;
	}
	public void setent(Entrenador ent)
	{
		this.ent=ent;
	}
	public void setmotor(String motor)
	{
		this.motor=motor;
	}
	public void setcolor(String color)
	{
		this.color=color;
	}
	public void setno(int no)
	{
		this.no=no;
	}
	public void setvel(float vel)
	{
		this.vel=vel;
	}
	public void setmod(String mod)
	{
		this.mod=mod;
	}
	public void setfab(String fab)
	{
		this.fab=fab;
	}
	public void setcham(String cham)
	{
		this.cham=cham;
	}
	

}
