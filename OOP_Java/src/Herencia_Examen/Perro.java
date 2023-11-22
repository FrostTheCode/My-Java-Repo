package Herencia_Examen;

public class Perro extends Mamifero{
	private String colo;

	public Perro(String name, double peso, int age, String sexo, String hab, String ali, String colo) {
		super(name, peso, age, sexo, hab, ali);
		this.colo = colo;
	}

	public String getColo() {
		return colo;
	}

	public void setColo(String colo) {
		this.colo = colo;
	}
	

}
