package poli_empl;

public class Director extends Empleado{
	private double bono;
	private String emp;
	public Director(int id, String name, String lastp, String lastm, int age, String sex, String dir, double pay,
			double bono, String emp) {
		super(id, name, lastp, lastm, age, sex, dir, pay);
		this.bono = bono;
		this.emp = emp;
	}
	public double getBono() {
		return bono;
	}
	public void setBono(double bono) {
		this.bono = bono;
	}
	public String getEmp() {
		return emp;
	}
	public void setEmp(String emp) {
		this.emp = emp;
	}

}
