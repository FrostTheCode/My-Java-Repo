package memoria_recursiva;

public class ArrayRec {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5};
		arrayR(ar,0);

	}
	public static void arrayR(int[] ar,int ind)
	{
		if (ind==(ar.length-1))
		{
			System.out.println(ar[ind]);
		}
		else
		{
			System.out.println(ar[ind]);
			arrayR(ar,ind+1);
		}
	}

}
