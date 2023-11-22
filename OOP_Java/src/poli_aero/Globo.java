package poli_aero;

public class Globo extends Aero{
	private String tipo;
	private Float temrec;
	
	public Globo(String name, String mar, int mod, String col, double pre, double vel, String tipo, Float temrec) {
		super(name, mar, mod, col, pre, vel);
		this.tipo = tipo;
		this.temrec = temrec;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Float getTemrec() {
		return temrec;
	}
	public void setTemrec(Float temrec) {
		this.temrec = temrec;
	}
	

}
