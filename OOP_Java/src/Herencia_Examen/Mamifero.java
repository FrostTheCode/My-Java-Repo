package Herencia_Examen;

public class Mamifero extends Animal{
	private String ali;

	
	public Mamifero(String name, double peso, int age, String sexo, String hab, String ali) {
		super(name, peso, age, sexo, hab);
		this.ali = ali;
	}

	public String getAli() {
		return ali;
	}

	public void setAli(String ali) {
		this.ali = ali;
	}
	

}
