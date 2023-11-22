package poli_secFut;

public class SecFut {
	private int id;
	private String name;
	private String last;
	private double peso;
	private int age;
	
	public SecFut(int id, String name, String last, double peso, int age) {
		
		this.id = id;
		this.name = name;
		this.last = last;
		this.peso = peso;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
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
	

}
