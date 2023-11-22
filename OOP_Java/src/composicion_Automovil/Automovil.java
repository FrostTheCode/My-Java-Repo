package composicion_Automovil;

public class Automovil {

	private Motor moto;
	private Stereo ster;
	private String marc;
	private String mode;
	private String rend;
	private String comb;
	private int capa;
	private int puer;
	private int segu;
	
public Automovil(Motor moto, Stereo ster, String marc, String mode, String rend, String comb, int capa, int puer, int segu)
{
	this.moto=moto;
	this.ster=ster;
	this.marc=marc;
	this.mode=mode;
	this.rend=rend;
	this.comb=comb;
	this.capa=capa;
	this.puer=puer;
	this.segu=segu;
}
	

public Motor getmoto()
{
	return this.moto;
}
public Stereo getstere()
{
	return this.ster;
}
public String getmarc()
{
	return this.marc;
}
public String getmode()
{
	return this.mode;
}	
public String getrend()
{
	return this.rend;
}	
public String getcomb()
{
	return this.comb;
}	
public int getcapa()
{
	return this.capa;
}	
public int getpuer()
{
	return this.puer;
}	
public int getsegu()
{
	return this.segu;
}	
		



public void setmoto(Motor moto)
{
	this.moto=moto;
}
public void setster(Stereo ster)
{
	this.ster=ster;
}
public void setmarc(String marc)
{
	this.marc=marc;
}	
public void setmode(String mode)
{
	this.mode=mode;
}	
public void setrend(String rend)
{
	this.rend=rend;
}	
public void setcomb(String comb)
{
	this.comb=comb;
}	
public void setcapa(int capa)
{
	this.capa=capa;
}
public void setpuer(int puer)
{
	this.puer=puer;
}
public void setsegu(int segu)
{
	this.puer=segu;
}	
}
