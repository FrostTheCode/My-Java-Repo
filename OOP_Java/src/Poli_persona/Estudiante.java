package Poli_persona;

public class Estudiante extends Persona{
	private String sco;
	private int prom;
	private String email;
	
	public Estudiante(String name, String nat, int age, String sex, String sco, int prom, String email) {
		super(name, nat, age, sex);
		this.sco = sco;
		this.prom = prom;
		this.email = email;
	}
	public String getSco() {
		return sco;
	}
	public void setSco(String sco) {
		this.sco = sco;
	}
	public int getProm() {
		return prom;
	}
	public void setProm(int prom) {
		this.prom = prom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
