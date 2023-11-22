package circulo;

public class Usacirculo {

	public static void main(String[] args) {
		circulo c=new circulo(20);
		System.out.println("radio: "+c.getRadio());
		System.out.println("perimetro: "+c.calcPer());
		System.out.println("Area: "+c.calcArea());
	}

}
