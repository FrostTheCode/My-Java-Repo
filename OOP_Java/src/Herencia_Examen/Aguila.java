package Herencia_Examen;

public class Aguila extends Oviparo{
	private String gar;
	private String vis;
	
	public Aguila(String name, double peso, int age, String sexo, String hab, String tam, String esp, String gar,
			String vis) {
		super(name, peso, age, sexo, hab, tam, esp);
		this.gar = gar;
		this.vis = vis;
	}
	public String getGar() {
		return gar;
	}
	public void setGar(String gar) {
		this.gar = gar;
	}
	public String getVis() {
		return vis;
	}
	public void setVis(String vis) {
		this.vis = vis;
	}
	

}
