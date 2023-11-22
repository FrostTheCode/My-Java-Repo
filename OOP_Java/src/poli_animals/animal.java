package poli_animals;

public class animal {
	private String name;
	private double peso;
	private int age;
	private String sexo;
	private String hab;
	public animal(String name, double peso, int age, String sexo, String hab) {
		this.name = name;
		this.peso = peso;
		this.age = age;
		this.sexo = sexo;
		this.hab = hab;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getHab() {
		return hab;
	}
	public void setHab(String hab) {
		this.hab = hab;
	}
	

}
