package backtracking;

public class cuentaWord {

	public static void main(String[] args) {
		String cad="televisas";
		int ind=0;
		System.out.println("hay "+cCar(cad,ind)+" cadenas");

	}
	public static int cCar(String cad,int ind)
	{
		try {
			cad.charAt(ind);
			return 1+cCar(cad,ind+1);
		} catch (IndexOutOfBoundsException ex ) {
			System.out.println("fin de recursiva: ");
		}
		return 0;
		
	}

}
