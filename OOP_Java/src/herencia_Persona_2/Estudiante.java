package herencia_Persona_2;

public class Estudiante extends Persona{
	private String school; 
	private float prom;
	
	public Estudiante(String name, String last, int edad, String sex, String school, float prom) {
		super(name, last, edad, sex);
		this.school = school;
		this.prom = prom;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public float getProm() {
		return prom;
	}
	public void setProm(float prom) {
		this.prom = prom;
	}
}
