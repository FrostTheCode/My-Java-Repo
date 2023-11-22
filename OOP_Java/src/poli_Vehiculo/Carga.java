package poli_Vehiculo;

public class Carga extends Vehiculo{
	private int cap_car;
	private String dep;
	
	public Carga(String mat, String mod, String mar, int cap_car, String dep) {
		super(mat, mod, mar);
		this.cap_car = cap_car;
		this.dep = dep;
	}
	public int getCap_car() {
		return cap_car;
	}
	public void setCap_car(int cap_car) {
		this.cap_car = cap_car;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	
	

}
