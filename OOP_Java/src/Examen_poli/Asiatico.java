package Examen_poli;

public class Asiatico extends Leon{
	private String smelena;
	private int ngarras;
	public Asiatico(String name, int age, String size, String oner, String sexo, String ali, String smelena,
			int ngarras) {
		super(name, age, size, oner, sexo, ali);
		this.smelena = smelena;
		this.ngarras = ngarras;
	}
	public String getSmelena() {
		return smelena;
	}
	public void setSmelena(String smelena) {
		this.smelena = smelena;
	}
	public int getNgarras() {
		return ngarras;
	}
	public void setNgarras(int ngarras) {
		this.ngarras = ngarras;
	}
	}
