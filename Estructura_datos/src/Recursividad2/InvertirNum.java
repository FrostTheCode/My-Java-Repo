package Recursividad2;

public class InvertirNum {

	public static void main(String[] args) {
		int a=254;
		System.out.println(InvNum(a,2));

	}
	public static int InvNum(int n,int pos)
	{
		if(n<10)
		{
			return n;
		}
		else
		{
		return (n%10)*(int)	Math.pow(10, pos)+InvNum(n/10,pos-1);
		}

	}

}
