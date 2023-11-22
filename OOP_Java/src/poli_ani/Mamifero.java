package poli_ani;

public class Mamifero extends Animal{
	private String ali;
	private String raza;
	
	public Mamifero(String name, float peso, int age, String hab, String ali, String raza) {
		super(name, peso, age, hab);
		this.ali = ali;
		this.raza = raza;
	}
	public String getAli() {
		return ali;
	}
	public void setAli(String ali) {
		this.ali = ali;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}

}
