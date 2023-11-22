package herencia_empleado;

public class Director extends Empleado{
	private double bono;

	public Director(int id, String name, String mid, String last, int age, String sexo, String dir, double pay,
			double bono) {
		super(id, name, mid, last, age, sexo, dir, pay);
		this.bono = bono;
	}

	public double getBono() {
		return bono;
	}

	public void setBono(double bono) {
		this.bono = bono;
	}	
	}
