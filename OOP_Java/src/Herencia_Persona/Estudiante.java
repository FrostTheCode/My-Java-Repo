package Herencia_Persona;

public class Estudiante extends Persona{
	private int nc;
	private float prom;
	
	public Estudiante(String name, String last, int edad, int nc, float prom) {
		super(name, last, edad);
		this.nc = nc;
		this.prom = prom;
	}
	public int getNc() {
		return nc;
	}
	public void setNc(int nc) {
		this.nc = nc;
	}
	public float getProm() {
		return prom;
	}
	public void setProm(float prom) {
		this.prom = prom;
	}
}
