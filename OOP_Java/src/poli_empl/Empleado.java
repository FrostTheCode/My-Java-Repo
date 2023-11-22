package poli_empl;

public class Empleado {
	private int id;
	private String name;
	private String lastp;
	private String lastm;
	private int age;
	private String sex;
	private String dir;
	private double pay;
	public Empleado(int id, String name, String lastp, String lastm, int age, String sex, String dir, double pay) {
		this.id = id;
		this.name = name;
		this.lastp = lastp;
		this.lastm = lastm;
		this.age = age;
		this.sex = sex;
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
	public String getLastp() {
		return lastp;
	}
	public void setLastp(String lastp) {
		this.lastp = lastp;
	}
	public String getLastm() {
		return lastm;
	}
	public void setLastm(String lastm) {
		this.lastm = lastm;
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
