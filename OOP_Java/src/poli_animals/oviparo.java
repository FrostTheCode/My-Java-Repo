package poli_animals;

public class oviparo extends animal{
	private String tam;
	private String esp;
	public oviparo(String name, double peso, int age, String sexo, String hab, String tam, String esp) {
		super(name, peso, age, sexo, hab);
		this.tam = tam;
		this.esp = esp;
	}
	public String getTam() {
		return tam;
	}
	public void setTam(String tam) {
		this.tam = tam;
	}
	public String getEsp() {
		return esp;
	}
	public void setEsp(String esp) {
		this.esp = esp;
	}
	}
