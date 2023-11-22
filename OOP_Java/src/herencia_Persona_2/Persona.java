package herencia_Persona_2;

public class Persona {
	private String name;
	private String last;
	private int edad;
	private String sex;
	
	public Persona(String name, String last, int edad, String sex) {
		this.name = name;
		this.last = last;
		this.edad = edad;
		this.sex = sex;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
