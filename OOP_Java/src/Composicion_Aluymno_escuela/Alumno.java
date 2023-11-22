package Composicion_Aluymno_escuela;

public class Alumno {
	private Escuela escuela;//esto es una composicion
	private Carrera carrera;//esto tambien es una compocicion
	private String name;
	private String apellido;
	private int edad;
	private String email;
	
	public Alumno (Escuela escuela,Carrera carrera,String name,String apellido,int edad,String email)
	{
		this.escuela=escuela;
		this.carrera=carrera;
		this.name=name;
		this.apellido=apellido;
		this.edad=edad;
		this.email=email;
	}
	public Escuela getEscuela()
	{
		return this.escuela;
	}
	public Carrera getCarrera()
	{
		return this.carrera;
	}
	public String getName()
	{
		return this.name;
	}
	public String getApellido()
	{
		return this.apellido;
	}
	public int getEdad()
	{
		return this.edad;
	}
	public String getEmail()
	{
		return this.email;
	}
	
	
	public void setEscuela(Escuela escuela)
	{
		this.escuela=escuela;
	}
	public void setCarrera(Carrera carrera)
	{
		this.carrera=carrera;
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
	public void setEmail(String email)
	{
		this.email=email;
	}
	
	
	
	

}
