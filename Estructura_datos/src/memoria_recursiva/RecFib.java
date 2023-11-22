package memoria_recursiva;

public class RecFib {

	public static void main(String[] args) {
		System.out.println(recfibo(4));

	}
	public static int recfibo(int n)
	{
		if (n==0)
			return 0;
		else if (n==1)
			return 1;
		else
		return recfibo(n-1)+recfibo(n-2);
	}

}
