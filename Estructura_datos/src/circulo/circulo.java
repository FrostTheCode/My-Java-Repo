package circulo;

public class circulo {
	private double radio;

	public circulo(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double calcArea()
	{
		return Math.max(Math.PI*radio, 2);
	}
	public double calcPer()
	{
		return radio*2*Math.PI;
	}

}
