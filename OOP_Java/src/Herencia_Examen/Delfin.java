package Herencia_Examen;

public class Delfin extends Mamifero{
	private String col;

	public Delfin(String name, double peso, int age, String sexo, String hab, String ali, String col) {
		super(name, peso, age, sexo, hab, ali);
		this.col = col;
	}

	public String getCol() {
		return col;
	}

	public void setCol(String col) {
		this.col = col;
	}
	

}
