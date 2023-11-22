package poli_animals;

public class delfin extends mamifero{
	private String colski;
	private String reg;
	public delfin(String name, double peso, int age, String sexo, String hab, String ali, String colski, String reg) {
		super(name, peso, age, sexo, hab, ali);
		this.colski = colski;
		this.reg = reg;
	}
	public String getColski() {
		return colski;
	}
	public void setColski(String colski) {
		this.colski = colski;
	}
	public String getReg() {
		return reg;
	}
	public void setReg(String reg) {
		this.reg = reg;
	}
	

}
