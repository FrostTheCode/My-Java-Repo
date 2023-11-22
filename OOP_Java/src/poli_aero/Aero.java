package poli_aero;

public class Aero {
	private String name;
	private String mar;
	private int mod;
	private String col;
	private double pre;
	private double vel;
	
	public Aero(String name, String mar, int mod, String col, double pre, double vel) {
		this.name = name;
		this.mar = mar;
		this.mod = mod;
		this.col = col;
		this.pre = pre;
		this.vel = vel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMar() {
		return mar;
	}
	public void setMar(String mar) {
		this.mar = mar;
	}
	public int getMod() {
		return mod;
	}
	public void setMod(int mod) {
		this.mod = mod;
	}
	public String getCol() {
		return col;
	}
	public void setCol(String col) {
		this.col = col;
	}
	public double getPre() {
		return pre;
	}
	public void setPre(double pre) {
		this.pre = pre;
	}
	public double getVel() {
		return vel;
	}
	public void setVel(double vel) {
		this.vel = vel;
	}
	

}
