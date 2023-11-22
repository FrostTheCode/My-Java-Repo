package herencia_animal;

public class Canino extends Mamifero{
	private String hab;

	public Canino(String name, int age, float peso, String ali, String hab) {
		super(name, age, peso, ali);
		this.hab = hab;
	}

	public String getHab() {
		return hab;
	}

	public void setHab(String hab) {
		this.hab = hab;
	}
	

}
