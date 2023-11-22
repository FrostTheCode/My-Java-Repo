package composcion_jugador;

public class Estadio {

	private Jugador jugador;
	private Entrenador entrenador;
	private Masajista masajista;
	private String name;
	private String equipo;
	private String direccion;
	private String www;
	private int capa;
	
	public Estadio(Jugador jugador,Entrenador entrenador,Masajista masajista,String name,String equipo,String direccion,String www,int capa)
	{
		this.jugador=jugador;
		this.entrenador=entrenador;
		this.masajista=masajista;
		this.name=name;
		this.equipo=equipo;
		this.direccion=direccion;
		this.www=www;
		this.capa=capa;
	}
	
	public Jugador getjugador()
	{
		return this.jugador;
	}
	public Entrenador getentrenador()
	{
		return this.entrenador;
	}
	public Masajista getmasajista()
	{
		return this.masajista;
	}
	public String getname()
	{
		return this.name;
	}
	public String getequipo()
	{
		return this.equipo;
	}
	public String getdireccion()

	{
		return this.direccion;
	}
	public String getwww()
	{
		return this.www;
	}
	public int getcapa()
	{
		return this.capa;
	}
	
	
	public void setjugador(Jugador jugador)
	{
		this.jugador=jugador;
	}
	public void setentrenador(Entrenador entrenador)
	{
		this.entrenador=entrenador;
	}
	public void setmasajista(Masajista masajista)
	{
		this.masajista=masajista;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setequipo(String equipo)
	{
		this.equipo=equipo;
	}
	public void setdireccion(String direccion)
	{
		this.direccion=direccion;
	}
	public void setwww(String www)
	{
		this.www=www;
	}
	public void setcapa(int capa)
	{
		this.capa=capa;
	}	
}
