package herencia_animal;

public class Animal {
	String name;
	int age;
	float peso;
	
	public Animal(String name, int age, float peso) {
		this.name = name;
		this.age = age;
		this.peso = peso;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	

}
