package trabajos;

import java.util.Scanner;

public class Promedio {

	public static void main(String[] args) {
	 String name;
	 int cal1,cal2,cal3,cal4,cal5;
	 Scanner in = new Scanner(System.in);
	 System.out.println("inserte el nombre del estudiante: ");
	 name = in.nextLine();
	 System.out.println("inserte la calificacion 1");
	 cal1 = in.nextInt();
	 System.out.println("inserte la calificacion 2");
	 cal2 = in.nextInt();
	 System.out.println("inserte la calificacion 3");
	 cal3 = in.nextInt();
	 System.out.println("inserte la calificacion 4");
	 cal4 = in.nextInt();
	 System.out.println("inserte la calificacion 5");
	 cal5 = in.nextInt();
	 System.out.println("Nombre\t\tcalificacion 1\tcalificacion 2\tcalificacion 3\tcalificacion 4\tcalificacion 5\tPromedio");
	 System.out.print(name+"\t");
	 System.out.print(cal1+"\t\t");
	 System.out.print(cal2+"\t\t");
	 System.out.print(cal3+"\t\t");
	 System.out.print(cal4+"\t\t");
	 System.out.print(cal5+"\t\t");
	 System.out.print((cal1+cal2+cal3+cal4+cal5)/5);
	}

}
