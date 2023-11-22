package herencia_vehiculos;

public class Vehiculo {
	private String name;
	private String marca;
	private String mod;
	private String color;
	private double precio;
	private double speed;
	
	public Vehiculo(String name, String marca, String mod, String color, double precio, double speed) {
		this.name = name;
		this.marca = marca;
		this.mod = mod;
		this.color = color;
		this.precio = precio;
		this.speed = speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMod() {
		return mod;
	}
	public void setMod(String mod) {
		this.mod = mod;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	
	

}
