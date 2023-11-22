package RecursivaDivide;

public class MultiDeArray {

	public static void main(String[] args) {
		int[]ar= {1,2,3,4,5,6,7,8};
		System.out.println(MultA(0,ar.length-1,ar));

	}
	public static int MultA(int ini,int fin,int[]ar)
	{
		if(ini==fin)
		{
			return ar[ini];
		}
		else
		{
			int mid=(ini+fin)/2;
			int x=MultA(ini,mid,ar);
			int y=MultA(mid+1,fin,ar);
			return x+y;
		}
	}

}
