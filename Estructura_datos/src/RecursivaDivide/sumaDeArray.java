package RecursivaDivide;

public class sumaDeArray {

	public static void main(String[] args) {
		int []ar= {1,2,3,4,5,6,7,8};
		System.out.println(sumA(0,ar.length-1,ar));

	}
	public static int sumA(int ini,int end,int[]ar)
	{
		if(ini==end)
		{
			return ar[ini];
		}
		else
		{
			int mid=(ini+end)/2;
			System.out.println("inicio: "+ini);
			System.out.println("mitad: "+mid);
			System.out.println("final: "+end);
			System.out.println(" ");
			int x=sumA(ini,mid,ar);
			int y=sumA(mid+1,end,ar);
			System.out.println("X: "+x);
			System.out.println("Y: "+y);
			System.out.println(" ");
			return x+y;
		}
	}

}
