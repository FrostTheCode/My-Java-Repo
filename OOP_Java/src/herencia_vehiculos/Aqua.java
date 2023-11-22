package herencia_vehiculos;

public class Aqua extends Vehiculo{
	private String Emp;
	private String ruta;
	
	public Aqua(String name, String marca, String mod, String color, double precio, double speed, String emp,
			String ruta) {
		super(name, marca, mod, color, precio, speed);
		Emp = emp;
		this.ruta = ruta;
	}
	public String getEmp() {
		return Emp;
	}
	public void setEmp(String emp) {
		Emp = emp;
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	

}
