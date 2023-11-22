package poli_ani;

public class canino extends Mamifero{
	private String size;

	public canino(String name, float peso, int age, String hab, String ali, String raza, String size) {
		super(name, peso, age, hab, ali, raza);
		this.size = size;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
}
