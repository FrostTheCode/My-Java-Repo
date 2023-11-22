package composicion_pokemon;

public class Pokemon {

	private Gimnasio gim;
	private Entrenador entr;
	private String name;
	private String tipo;
	private String power;
	private String habi;
	private String espe;
	private String evol;
	private double peso;
	private double altura;
	
public Pokemon(Gimnasio gim,Entrenador entr,String name,String tipo,String power,String habi,String espe,String evol,double peso,double altura)
{
	this.gim=gim;
	this.entr=entr;
	this.name=name;
	this.tipo=tipo;
	this.power=power;
	this.habi=habi;
	this.espe=espe;
	this.evol=evol;
	this.peso=peso;
	this.altura=altura;
}


public Gimnasio getgim()
{
	return this.gim;
}
public Entrenador getentr() 
{
	return this.entr;
}
public String getname()
{
	return this.name;
}	
public String gettipo()
{
	return this.tipo;
}	
public String getpower()
{
return this.power;
}
public String gethabi()
{
	return this.habi;
}
public String getespe()
{
	return this.espe;
}
public String getevol()
{
	return this.evol;
}
public double getpeso()
{
	return this.peso;
}
public double getaltura()
{
	return this.altura;
}


public void setgim(Gimnasio gim)
{
	this.gim=gim;
}
public void setentr(Entrenador entr)
{
	this.entr=entr;
}
public void setname(String name)
{
	this.name=name;
}	
public void settipo(String tipo)
{
	this.tipo=tipo;
}
public void setpower(String power)
{
	this.power=power;
}
public void sethabi(String habi)
{
	this.habi=habi;
}
public void setespe(String espe)
{
	this.espe=espe;
}
public void setevol(String evol)
{
	this.evol=evol;
}
public void setpeso(double peso)
{
	this.peso=peso;
}
public void setaltura(double altura)
{
	this.altura=altura;
}
}
