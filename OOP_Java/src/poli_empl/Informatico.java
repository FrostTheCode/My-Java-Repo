package poli_empl;

public class Informatico extends Empleado{
	private String email;
	private int tel;
	private String web;
	public Informatico(int id, String name, String lastp, String lastm, int age, String sex, String dir, double pay,
			String email, int tel, String web) {
		super(id, name, lastp, lastm, age, sex, dir, pay);
		this.email = email;
		this.tel = tel;
		this.web = web;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
}