package herencia_Seleccion_futbol;

public class Futbolista extends Seleccionfutbol {
	private String posi;
	private int num;
	
	public Futbolista(int id, String name, String last, double peso, int edad, String posi, int num) {
		super(id, name, last, peso, edad);
		this.posi = posi;
		this.num = num;
	}
	public String getPosi() {
		return posi;
	}
	public void setPosi(String posi) {
		this.posi = posi;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
