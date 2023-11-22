package herencia_animal;

public class Mamifero extends Animal{
	private String ali;

	public Mamifero(String name, int age, float peso, String ali) {
		super(name, age, peso);
		this.ali = ali;
	}

	public String getAli() {
		return ali;
	}

	public void setAli(String ali) {
		this.ali = ali;
	}
	

}
