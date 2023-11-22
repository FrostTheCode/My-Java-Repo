package herencia_empleado;

public class Mantenimiento extends Empleado{
	private String area;

	public Mantenimiento(int id, String name, String mid, String last, int age, String sexo, String dir, double pay,
			String area) {
		super(id, name, mid, last, age, sexo, dir, pay);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
}
