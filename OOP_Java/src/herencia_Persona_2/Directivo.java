package herencia_Persona_2;

public class Directivo extends Persona{
	private String puesto;
	private String dep;
	
	public Directivo(String name, String last, int edad, String sex, String puesto, String dep) {
		super(name, last, edad, sex);
		this.puesto = puesto;
		this.dep = dep;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
}
