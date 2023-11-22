package herencia_Seleccion_futbol;

public class Seleccionfutbol {
	private int id;
	private String name;
	private String last;
	private double peso;
	private int edad;
	
	public Seleccionfutbol(int id, String name, String last, double peso, int edad) {
		this.id = id;
		this.name = name;
		this.last = last;
		this.peso = peso;
		this.edad = edad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
