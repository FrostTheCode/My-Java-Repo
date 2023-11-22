package poli_animals;

public class tortuga extends oviparo{
	private String lon;
	public tortuga(String name, double peso, int age, String sexo, String hab, String tam, String esp, String lon) {
		super(name, peso, age, sexo, hab, tam, esp);
		this.lon = lon;
	}
	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

}
