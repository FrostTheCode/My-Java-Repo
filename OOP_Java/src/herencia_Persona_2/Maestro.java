package herencia_Persona_2;

public class Maestro extends Persona{
	private String grado;
	private float pay;
	
	public Maestro(String name, String last, int edad, String sex, String grado, float pay) {
		super(name, last, edad, sex);
		this.grado = grado;
		this.pay = pay;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	public float getPay() {
		return pay;
	}
	public void setPay(float pay) {
		this.pay = pay;
	}
}
