package poli_Vehiculo;

public class Familiar extends Vehiculo{
	private int npu;

	public Familiar(String mat, String mod, String mar, int npu) {
		super(mat, mod, mar);
		this.npu = npu;
	}

	public int getNpu() {
		return npu;
	}

	public void setNpu(int npu) {
		this.npu = npu;
	}
	

}
