package Repeticion;

public class CicloFor {

	public static void main(String[] args) {
		// uso de la sentencia for
		int i;
		System.out.println("potencia 1\tpotencia 2\tpotencia 3\tpotencia 4\tpotencia 5");
		System.out.println("__________________________________________________________________________");
		for (i=1;i<11;i++)
        System.out.println(i+"\t\t"+(int)Math.pow(i, 2)+"\t\t"+(int)Math.pow(i, 3)+"\t\t"+(int)Math.pow(i, 4)+"\t\t"+(int)Math.pow(i, 5));
	}

}
