package RecursivaDivide;

public class MediaDeArray {

	public static void main(String[] args) {
		int[]ar= {1,2,3,4,5,6,7,8};
		if (ar.length%2==0)
			System.out.println(mediarray(0,ar.length-1,ar));
		else
			System.out.println("el numero debe ser par");

	}
	public static float mediarray(int ini,int fin,int []ar)
	{
		if(ini==fin)
		{
			return ar[ini];
		}
		else
		{
			int mid=(ini+fin)/2;
			float x=mediarray(ini,mid,ar);
			float y=mediarray(mid+1,fin,ar);
			return (x+y)/2;
		}
	}

}
