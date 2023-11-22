package TrabajosRepeticion;

public class Eje4 {

	public static void main(String[] args) {
		for20();
		while20();
		dowhile20();
	}

	private static void dowhile20() {
		int i=320;
		do
				{
					System.out.println("numeros hacia atras "+i);
					i-=20;
				}while(i>=160);
		
	}

	private static void while20() {
		int i=320;
		while(i>=160)
				{
					System.out.println("numeros hacia atras "+i);
					i-=20;
				}
	}

	private static void for20() {
            for(int i=320;i>=160;i-=20)
			System.out.println(i+"\t");
	}
	}
	