package memoria_recursiva;

public class fac {

	public static void main(String[] args) {
		int n=5;
		int fin=fact(n);
		System.out.println(fin);

	}
	public static int fact(int x)
	{
		int re=0;
		if (x==1)
		{
			return 1;
		}
		else
		{
			re=x*fact(x-1);
		}
		return re;
	}

}
