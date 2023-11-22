package Poli_persona;

public class Maestro extends Persona{
	private String grad;
	private float pay;
	private String dir;
	private String tel;
	
	public Maestro(String name, String nat, int age, String sex, String grad, float pay, String dir, String tel) {
		super(name, nat, age, sex);
		this.grad = grad;
		this.pay = pay;
		this.dir = dir;
		this.tel = tel;
	}
	public String getGrad() {
		return grad;
	}
	public void setGrad(String grad) {
		this.grad = grad;
	}
	public float getPay() {
		return pay;
	}
	public void setPay(float pay) {
		this.pay = pay;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	

}
