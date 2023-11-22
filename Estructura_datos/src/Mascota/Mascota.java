package Mascota;

public class Mascota {
	private String name;
	private String esp;
	private int age;
	private String color;
	public Mascota(String name, String esp, int age, String color) {
		this.name = name;
		this.esp = esp;
		this.age = age;
		this.color = color;
	}
	public void mostrarMascota()
	{
		System.out.println("Esta mascota se llama "+this.name+" tiene "+this.age+" es de la especie "+this.esp+" y es de color "+this.color);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEsp() {
		return esp;
	}
	public void setEsp(String esp) {
		this.esp = esp;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}
