package poli_Vehiculo;

public class Deportivo extends Vehiculo{
	private int ncil;

	public Deportivo(String mat, String mod, String mar, int ncil) {
		super(mat, mod, mar);
		this.ncil = ncil;
	}

	public int getNcil() {
		return ncil;
	}

	public void setNcil(int ncil) {
		this.ncil = ncil;
	}

}
