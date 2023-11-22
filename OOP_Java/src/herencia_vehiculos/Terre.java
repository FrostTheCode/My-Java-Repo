package herencia_vehiculos;

public class Terre extends Vehiculo{
	private String tipo;

	public Terre(String name, String marca, String mod, String color, double precio, double speed, String tipo) {
		super(name, marca, mod, color, precio, speed);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

}
