package trabajador_gte_set;

public class Trabajador {
	private String name;
	private String apellido;
	private int edad;
	private String puesto;
	private int sueldo;
	private String turno;
	private String nss;
	private String empresa;
	private String sexo;
	private int phone;
	
	public Trabajador(String name,String apellido,int edad,String puesto,int sueldo,String turno,String nss,String empresa,String sexo,int phone)
	{
		this.name=name;
		this.apellido=apellido;
		this.edad=edad;
		this.puesto=puesto;
		this.sueldo=sueldo;
		this.turno=turno;
		this.nss=nss;
		this.empresa=empresa;
		this.sexo=sexo;
		this.phone=phone;
	}
	public String getname()
	{
		return this.name;
	}
	public String getapellido()
	{
		return this.apellido;
	}
	public int getedad()
	{
		return this.edad;
	}
	public String getpuesto()
	{
		return this.puesto;
	}
	public int getsueldo()
	{
		return this.sueldo;
	}
	public String getturno()
	{
	return this.turno;
	}
	public String getnss()
	{
	return this.nss;
	}
	public String getempresa()
	{
		return this.empresa;
	}
	public String getsexo()
	{
		return this.sexo;
	}
	public int getphone()
	{
		return this.phone;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setApellido(String apellido)
	{
		this.apellido=apellido;
	}
	public void setEdad(int edad)
	{
		this.edad=edad;
	}
	public void setPuesto(String puesto)
	{
		this.puesto=puesto;
	}
	public void setSueldo(int sueldo)
	{
		this.sueldo=sueldo;
	}
	public void setTurno(String turno)
	{
		this.turno=turno;
	}
	public void setNSS(String nss)
	{
		this.nss=nss;
	}
	public void setEmpresa(String empresa)
	{
		this.empresa=empresa;
	}
	public void setSexo(String sexo)
	{
		this.sexo=sexo;
	}
	public void setPhone(int phone)
	{
		this.phone=phone;
	}
	
}
