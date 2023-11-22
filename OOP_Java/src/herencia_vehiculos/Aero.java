package herencia_vehiculos;

public class Aero extends Vehiculo {
	private int cap;
	private String cat;
	
	public Aero(String name, String marca, String mod, String color, double precio, double speed, int cap, String cat) {
		super(name, marca, mod, color, precio, speed);
		this.cap = cap;
		this.cat = cat;
	}
	public int getCap() {
		return cap;
	}
	public void setCap(int cap) {
		this.cap = cap;
	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	

}
