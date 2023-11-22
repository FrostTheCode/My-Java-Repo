package Examen_poli;

public class Felino extends Mascota{
	private String raza;
	private int npat;
	public Felino(String name, int age, String size, String oner, String raza, int npat) {
		super(name, age, size, oner);
		this.raza = raza;
		this.npat = npat;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getNpat() {
		return npat;
	}
	public void setNpat(int npat) {
		this.npat = npat;
	}
	

}
