package Examen_poli;

public class Africano extends Leon{
	private String caza;
	private String nfem;
	public Africano(String name, int age, String size, String oner, String sexo, String ali, String caza, String nfem) {
		super(name, age, size, oner, sexo, ali);
		this.caza = caza;
		this.nfem = nfem;
	}
	public String getCaza() {
		return caza;
	}
	public void setCaza(String caza) {
		this.caza = caza;
	}
	public String getNfem() {
		return nfem;
	}
	public void setNfem(String nfem) {
		this.nfem = nfem;
	}
	

}
