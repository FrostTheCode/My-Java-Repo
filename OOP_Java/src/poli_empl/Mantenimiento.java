package poli_empl;

public class Mantenimiento extends Empleado{
	private String area;
	private String turno;
	public Mantenimiento(int id, String name, String lastp, String lastm, int age, String sex, String dir, double pay,
			String area, String turno) {
		super(id, name, lastp, lastm, age, sex, dir, pay);
		this.area = area;
		this.turno = turno;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
}
