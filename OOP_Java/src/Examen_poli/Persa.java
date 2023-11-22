package Examen_poli;

public class Persa extends Felino{
	private String color;
	private String sizega;
	public Persa(String name, int age, String size, String oner, String raza, int npat, String color, String sizega) {
		super(name, age, size, oner, raza, npat);
		this.color = color;
		this.sizega = sizega;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSizega() {
		return sizega;
	}
	public void setSizega(String sizega) {
		this.sizega = sizega;
	}
	
	

}
