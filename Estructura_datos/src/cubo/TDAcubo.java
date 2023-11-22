package cubo;

public class TDAcubo {

	public static void main(String[] args) {
		Cubo c=new Cubo(5);
		System.out.println("LADO: "+c.getLado());
		System.out.println("AREA: "+c.getArea());
		System.out.println("VOLUMEN: "+c.getVol());
		System.out.println("DIAGONAL: "+c.getDiagonal());
		System.out.println("DIAGONAL DEL ESPACIO: "+c.getDiagesp());

	}

}
