package Poli_persona;

public class Directivo extends Persona{
	private String pues;
	private String dep;
	private String tur;
	private int ant;
	
	public Directivo(String name, String nat, int age, String sex, String pues, String dep, String tur, int ant) {
		super(name, nat, age, sex);
		this.pues = pues;
		this.dep = dep;
		this.tur = tur;
		this.ant = ant;
	}
	public String getPues() {
		return pues;
	}
	public void setPues(String pues) {
		this.pues = pues;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getTur() {
		return tur;
	}
	public void setTur(String tur) {
		this.tur = tur;
	}
	public int getAnt() {
		return ant;
	}
	public void setAnt(int ant) {
		this.ant = ant;
	}
	

}
