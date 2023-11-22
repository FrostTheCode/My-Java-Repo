package RecursivaDivide;

public class ArraySame {

	public static void main(String[] args) {
		int []ar= {1,2,3,4,5,6,7,8};
		int []ar0= {1,2,3,4,5,6,7,8};
		System.out.println(arrayigu(0,ar.length-1,ar,ar0));

	}
	public static int arrayigu(int ini,int fin,int []ar,int []ar0)
	{
		if(ini==fin)
		{
			if(ar[ini]==ar0[ini])
				return -1;
			else
				return ini;
		}
		else
		{
			int mid=(ini+fin)/2;
			int x=arrayigu(ini,mid,ar,ar0);
			int y=arrayigu(mid+1,fin,ar,ar0);
			
			if(x!=-1)
				return x;
			if(y!=-1)
				return y;
			return -1;
		}
	}

}
