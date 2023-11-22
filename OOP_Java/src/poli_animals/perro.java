package poli_animals;

public class perro extends mamifero{
	private String colper;
	private String raza;
	public perro(String name, double peso, int age, String sexo, String hab, String ali, String colper, String raza) {
		super(name, peso, age, sexo, hab, ali);
		this.colper = colper;
		this.raza = raza;
	}
	public String getColper() {
		return colper;
	}
	public void setColper(String colper) {
		this.colper = colper;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	}
