package Recursividad2;

public class arrayinv {

	public static void main(String[] args) {
		int []ar= {1,2,3,4,5,6};
		arInv(ar,0,ar.length-1);
		for (int i=0;i<ar.length;i++)
			System.out.println(ar[i]);

	}
	public static void arInv(int[]a1,int ini,int fin)
	{
		if (ini>fin) {
		int aux=a1[ini];
		a1[ini]=a1[fin];
		a1[fin]=aux;
		arInv(a1,ini+1,fin-1);
		}
		
	}

}
