package Herencia_Examen;

public class Tortuga extends Oviparo{
	private String log;

	public Tortuga(String name, double peso, int age, String sexo, String hab, String tam, String esp, String log) {
		super(name, peso, age, sexo, hab, tam, esp);
		this.log = log;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}
	

}
