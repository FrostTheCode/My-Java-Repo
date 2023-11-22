package poli_ani;

public class Animal {
	private String name;
	private float peso; 
	private int age;
	private String hab;
	
	public Animal(String name, float peso, int age, String hab) {
		this.name = name;
		this.peso = peso;
		this.age = age;
		this.hab = hab;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHab() {
		return hab;
	}
	public void setHab(String hab) {
		this.hab = hab;
	}

}
