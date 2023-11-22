package composicion_Automovil;

public class Motor {
	private String cili;
	private String caba;
	private String pote;
	private String fabri;
	private int ident;
	private String orig;
	
public Motor (String cili,String caba, String pote, String fabri, int ident, String orig)
{
	this.cili=cili;
	this.caba=caba;
	this.pote=pote;
	this.fabri=fabri;
	this.ident=ident;
	this.orig=orig;
}


public String getcili()
{
	return this.cili;
}
public String getcaba()
{
	return this.caba;
}
public String getpote()
{
	return this.pote;
}
public String getfabri()
{
	return this.fabri;
}
public int getident()
{
	return this.ident;
}
public String getorig()
{
	return this.orig;
}



public void setcili(String cili)
{
	this.cili=cili;
}
public void setcaba(String caba)
{
	this.caba=caba;
}
public void setpote(String pote)
{
	this.pote=pote;
}
public void setfabri(String fabri)
{
	this.fabri=fabri;
}
public void setident(int ident)
{
	this.ident=ident;
}
public void setorig(String orig)
{
	this.orig=orig;
}	
}
