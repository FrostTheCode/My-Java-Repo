package poli_aero;

public class Avion extends Aero{
	private int cap;
	private String com;
	private int nmot;
	public Avion(String name, String mar, int mod, String col, double pre, double vel, int cap, String com, int nmot) {
		super(name, mar, mod, col, pre, vel);
		this.cap = cap;
		this.com = com;
		this.nmot = nmot;
	}
	public int getCap() {
		return cap;
	}
	public void setCap(int cap) {
		this.cap = cap;
	}
	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
	}
	public int getNmot() {
		return nmot;
	}
	public void setNmot(int nmot) {
		this.nmot = nmot;
	}
	

}
