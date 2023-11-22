package composicion_Automovil;

public class Stereo {
	private int seri;
	private String marc;
	private String usb;
	private String pote;
	
public Stereo(int seri, String marc, String usb, String pote)
{
	this.seri=seri;
	this.marc=marc;
	this.usb=usb;
	this.pote=pote;
}

public int getseri()
{
	return this.seri;
}
public String getmarc()
{
	return this.marc;
}
public String getusb()
{
	return this.usb;
}
public String getpote()
{
	return this.pote;
}


public void setseri(int seri)
{
	this.seri=seri;
}
public void setmarc(String marc)
{
	this.marc=marc;
}
public void setusb(String usb)
{
	this.usb=usb;
}
public void setpote(String pote)
{
	this.pote=pote;
}
}
