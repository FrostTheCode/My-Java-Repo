package poli_secFut;

public class Masajista extends SecFut{
	private String esp;
	private int exp;
	private String email;
	
	public Masajista(int id, String name, String last, double peso, int age, String esp, int exp, String email) {
		super(id, name, last, peso, age);
		this.esp = esp;
		this.exp = exp;
		this.email = email;
	}
	public String getEsp() {
		return esp;
	}
	public void setEsp(String esp) {
		this.esp = esp;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
