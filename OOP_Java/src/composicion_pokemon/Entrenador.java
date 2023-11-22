package composicion_pokemon;

public class Entrenador {

	private String name;
	private String apellido;
	private String sexo;
	private int edad;
	private int phone;
	private int poke;
	private int meda;
	
public Entrenador(String name,String apellido,String sexo, int edad,int phone, int poke,int meda)	
{
	this.name=name;
	this.apellido=apellido;
	this.sexo=sexo;
	this.edad=edad;
	this.phone=phone;
	this.poke=poke;
	this.meda=meda;
}
	
public String getname()
{
	return this.name;
}	
public String getapellido()
{
	return this.apellido;
}		
public String getsexo()
{
	return this.sexo;
}		
public int getedad()
{
	return this.edad;
}	
public int getphone()
{
	return this.phone;
}		
public int getpoke()
{
	return this.poke;
}		
public int getmeda()
{
	return this.meda;
}		
	
	
public void setname(String name )
{
	this.name=name;
}
public void setapellido(String apellido)
{
	this.apellido=apellido;
}
public void setsexo(String sexo)
{
	this.sexo=sexo;
}
public void setedad(int edad )
{
	this.edad=edad;
}
public void setphone(int phone)
{
	this.phone=phone;
}
public void setpoke(int poke)
{
	this.poke=poke;
}
public void setmeda(int meda)
{
	this.meda=meda;
}




}
