package cubo;

public class Cubo {
	private double lado;
	
	public Cubo(double lado) {
		if(lado>0) {
		this.lado = lado;
		}
		else {
			this.lado=0.0;
		}
		}

	public double getLado() {
		return lado;
	}

	public double getArea()
	{
		return (6*Math.pow(lado, 2));
	}
	public double getVol()
	{
		return (Math.pow(lado, 3));
	}
	public double getDiagonal()
	{
		return (lado*Math.sqrt(2));
	}
	public double getDiagesp()
	{
		return (lado*Math.sqrt(3));
	}

}
