package herencia_empleado;

public class Informatico extends Empleado{
	private String correo;
	private int telefono;
	
	public Informatico(int id, String name, String mid, String last, int age, String sexo, String dir, double pay,
			String correo, int telefono) {
		super(id, name, mid, last, age, sexo, dir, pay);
		this.correo = correo;
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	

}
