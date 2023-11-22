package Composicion_Aluymno_escuela;

public class Carrera {
	private String name;
	private String clave;
	
	public Carrera(String name, String clave)
	{
		this.name=name;
		this.clave=clave;
	}
     public String getName()
     {
    	 return this.name;
     }
     public String getClave()
     {
    	 return this.clave;
     }
     
     public void setName(String name)
     {
    	 this.name=name;
     }
     public void setClave(String clave)
     {
    	 this.clave=clave;
     }

}
