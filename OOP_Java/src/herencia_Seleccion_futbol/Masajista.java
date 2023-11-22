package herencia_Seleccion_futbol;

public class Masajista extends Seleccionfutbol{
	private String esp;
	private int exp;
	
	public Masajista(int id, String name, String last, double peso, int edad, String esp, int exp) {
		super(id, name, last, peso, edad);
		this.esp = esp;
		this.exp = exp;
	}
	public String getEsp() {
		return esp;
	}
	public void setEsp(String esp) {
		this.esp = esp;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
}
