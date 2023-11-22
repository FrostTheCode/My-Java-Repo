package Poli_persona;

public class Persona {
	private String name;
	private String nat;
	private int age;
	private String sex;
	
	public Persona(String name, String nat, int age, String sex) {
		this.name = name;
		this.nat = nat;
		this.age = age;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNat() {
		return nat;
	}
	public void setNat(String nat) {
		this.nat = nat;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	

}
