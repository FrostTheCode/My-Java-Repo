package PersonaQ;

public class Persona {
	private String name;
	private int age;
	private int naci;
	public Persona(String name, int age, int naci) {
		this.name = name;
		this.age = age;
		this.naci = naci;
	}
	public void mostrarPersona()
	{
		System.out.println("esta persona se llama "+this.name+" tiene "+this.age+" años de edad y nacio en "+this.naci);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNaci() {
		return naci;
	}
	public void setNaci(int naci) {
		this.naci = naci;
	}
	
	

}
