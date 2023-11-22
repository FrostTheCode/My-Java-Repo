package estudiante_set_get;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String carrera;
	private int edad;
	private int Ncontrol;
	private String sexo;
	private int semestre;
	private String direccion;
	private String correo;
	private int telefono;
	private String nss;
	//crear el constructor
	public Estudiante(String nombre,String apellido,String carrera,int edad,int Ncontrol,String sexo,int semestre,String direccion,String correo,int telefono,String nss)
	{
		this.nombre=nombre;
		this.apellido=apellido;
		this.carrera=carrera;
		this.edad=edad;
		this.Ncontrol=Ncontrol;
		this.sexo=sexo;
		this.semestre=semestre;
		this.direccion=direccion;
		this.correo=correo;
		this.telefono=telefono;
		this.nss=nss;
	}
	//crear metodos gets
	public String getNombre()
	{
		return this.nombre;
	}
	public String getApellido()
	{
		return this.apellido;
	}
	public String getCarrera()
	{
		return this.carrera;
	}
	public int getEdad()
	{
		return this.edad;
	}
	public int getNcontrol()
	{
		return this.Ncontrol;
	}
	public String getSexo()
	{
		return this.sexo;
	}
	public int getSemestre()
	{
		return this.semestre;
	}
	public String getDireccion()
	{
		return this.direccion;
	}
	public String getCorreo()
	{
		return this.correo;
	}
	public int getTelefono()
	{
		return this.telefono;
	}
	public String getNSS()
	{
		return this.nss;
	}
	//crear los sets
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	public void setApellido(String apellido)
	{
		this.apellido=apellido;
	}
	public void setCarrera(String carrera)
	{
		this.carrera=carrera;
	}
	public void setEdad(int edad)
	{
		this.edad=edad;
	}
	public void setNControl(int Ncontrol)
	{
		this.Ncontrol=Ncontrol;
	}
	public void setSexo(String sexo)
	{
		this.sexo=sexo;
	}
	public void setSemestre(int semestre)
	{
		this.semestre=semestre;
	}
	public void setDireccion(String direccion)
	{
		this.direccion=direccion;
	}
	public void setCorreo(String correo)
	{
		this.correo=correo;
	}
	public void setTelefono(int telefono)
	{
		this.telefono=telefono;
	}
	public void setNSS(String nss)
	{
		this.nss=nss;
	}

	public String toString()
	{
		return "Nombre: "+getNombre()+"\nApellido: "+getApellido()+"\nCarrera: "+getCarrera()+"\nEdad: "+getEdad()+"\nNumero de control: "+getNcontrol()+"\nSexo: "
	+getSexo()+"\nSemestre: "+getSemestre()+"\nDireccion: "+getDireccion()+"\nCorreo: "+getCorreo()+"\nTelefono: "+getTelefono()+"\nNSS: "+getNSS();
	}
	
	//crear metodos 
	//realizar prueba
}
