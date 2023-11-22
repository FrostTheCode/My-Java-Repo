package Herencia_Persona;

public class Persona {
	private String name;
	private String last;
	private int edad;
    
	public Persona(String name, String last, int edad) {
		this.name = name;
		this.last = last;
		this.edad = edad;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}