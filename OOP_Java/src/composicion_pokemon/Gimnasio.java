package composicion_pokemon;

public class Gimnasio {
	
	private String name;
	private String place;
	private String prop;
	private String supe;
	private int capa;
	
	public Gimnasio(String name,String place,String prop,String supe,int capa)
	{
		this.name=name;
		this.place=place;
		this.prop=prop;
		this.supe=supe;
		this.capa=capa;
	}

public String getname()
{
	return this.name;
}
public String getplace()
{
	return this.place;
}
public String getprop()
{
	return this.prop;
}
public String getsupe()
{
	return this.supe;
}
public int getcapa()
{
	return this.capa;
}
	
	

public void setname(String name)
{
	this.name=name;
}
public void setplace(String place)
{
	this.place=place;
}
public void setprop(String prop)
{
	this.prop=prop;
}
public void setsupe(String supe)
{
	this.supe=supe;
}
public void setcapa(int capa)
{
	this.capa=capa;
}





}
