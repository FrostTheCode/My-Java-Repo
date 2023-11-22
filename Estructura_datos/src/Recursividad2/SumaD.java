package Recursividad2;

public class SumaD {

	public static void main(String[] args) {
		int num=123;
		System.out.println(suma(num));
	}
	public static int suma(int n)
	{
		if (n<10)
			return n;
		else
			return (n%10)+suma(n/10);
	}

}
