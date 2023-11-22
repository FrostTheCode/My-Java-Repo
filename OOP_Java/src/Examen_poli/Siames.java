package Examen_poli;

public class Siames extends Felino{
	private String colojo;
	private String colsia;
	public Siames(String name, int age, String size, String oner, String raza, int npat, String colojo, String colsia) {
		super(name, age, size, oner, raza, npat);
		this.colojo = colojo;
		this.colsia = colsia;
	}
	public String getColojo() {
		return colojo;
	}
	public void setColojo(String colojo) {
		this.colojo = colojo;
	}
	public String getColsia() {
		return colsia;
	}
	public void setColsia(String colsia) {
		this.colsia = colsia;
	}
	

}
