package Examen_poli;

public class Leon extends Mascota{
	private String sexo;
	private String ali;
	public Leon(String name, int age, String size, String oner, String sexo, String ali) {
		super(name, age, size, oner);
		this.sexo = sexo;
		this.ali = ali;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getAli() {
		return ali;
	}
	public void setAli(String ali) {
		this.ali = ali;
	}
	

}
