package Examen_poli;

public class Mascota {
	private String name;
	private int age;
	private String size;
	private String oner;
	public Mascota(String name, int age, String size, String oner) {
	
		this.name = name;
		this.age = age;
		this.size = size;
		this.oner = oner;
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
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getOner() {
		return oner;
	}
	public void setOner(String oner) {
		this.oner = oner;
	}
	

}
