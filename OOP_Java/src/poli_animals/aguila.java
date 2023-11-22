package poli_animals;

public class aguila extends oviparo{
	private String garra;
	private String vista;
	public aguila(String name, double peso, int age, String sexo, String hab, String tam, String esp, String garra,
			String vista) {
		super(name, peso, age, sexo, hab, tam, esp);
		this.garra = garra;
		this.vista = vista;
	}
	public String getGarra() {
		return garra;
	}
	public void setGarra(String garra) {
		this.garra = garra;
	}
	public String getVista() {
		return vista;
	}
	public void setVista(String vista) {
		this.vista = vista;
	}
	

}
