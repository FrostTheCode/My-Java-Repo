package poli_animals;

public class mamifero extends animal{
	private String ali;

	public mamifero(String name, double peso, int age, String sexo, String hab, String ali) {
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
