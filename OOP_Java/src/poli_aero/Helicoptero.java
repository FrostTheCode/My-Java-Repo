package poli_aero;

public class Helicoptero extends Aero{
	private String emp;
	private String rut;
	private Float cosre;
	public Helicoptero(String name, String mar, int mod, String col, double pre, double vel, String emp, String rut,
			Float cosre) {
		super(name, mar, mod, col, pre, vel);
		this.emp = emp;
		this.rut = rut;
		this.cosre = cosre;
	}
	public String getEmp() {
		return emp;
	}
	public void setEmp(String emp) {
		this.emp = emp;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public Float getCosre() {
		return cosre;
	}
	public void setCosre(Float cosre) {
		this.cosre = cosre;
	}
	

}
