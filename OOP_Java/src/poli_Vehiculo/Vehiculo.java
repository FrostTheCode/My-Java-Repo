package poli_Vehiculo;

public class Vehiculo {
	private String mat;
	private String mod;
	private String mar;
	
	public Vehiculo(String mat, String mod, String mar) {
		this.mat = mat;
		this.mod = mod;
		this.mar = mar;
	}
	public String getMat() {
		return mat;
	}
	public void setMat(String mat) {
		this.mat = mat;
	}
	public String getMod() {
		return mod;
	}
	public void setMod(String mod) {
		this.mod = mod;
	}
	public String getMar() {
		return mar;
	}
	public void setMar(String mar) {
		this.mar = mar;
	}
	

}
