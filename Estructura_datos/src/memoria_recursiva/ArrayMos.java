package memoria_recursiva;

public class ArrayMos {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5};
		int el=3;
		int elen=PosRec(ar,el,0);
		System.out.println(elen);

	}
	public static int PosRec(int[] ar,int elm,int ind)
	{
		int pos=0;
		if (ar[ind]==elm)
		{
			return ind;
		}
		else 
		{
			pos=PosRec(ar,elm,ind+1);
		}
		return pos;
	}

}
