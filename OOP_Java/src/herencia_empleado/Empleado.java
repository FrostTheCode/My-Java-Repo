package herencia_empleado;

public class Empleado {
	private int id;
	private String name;
	private String mid;
	private String last;
	private int age;
	private String sexo;
	private String dir;
	private double pay;
	
	public Empleado(int id, String name, String mid, String last, int age, String sexo, String dir, double pay) {
		this.id = id;
		this.name = name;
		this.mid = mid;
		this.last = last;
		this.age = age;
		this.sexo = sexo;
		this.dir = dir;
		this.pay = pay;
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
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
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
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	

}
