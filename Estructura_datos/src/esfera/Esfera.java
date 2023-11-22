package esfera;

public class Esfera {
	private double radio;

	public Esfera(double radio) {
		if(radio>0) {
		this.radio = radio;
		}
		else {
			this.radio=0.0;
		}
		}

	public double getRadio() {
		return radio;
	}
	public double getDia()
	{
		return (radio*2);
	}
	public double getcir()
	{
		return (Math.PI*getDia());
	}
	public double getArea() 
	{
		return (4*Math.PI*Math.pow(radio, 2));
	}
	public double getVol()
	{
		return (4*Math.PI*Math.pow(radio, 3))/3;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
}
