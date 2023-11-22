package memoria_recursiva;

public class sumaNum {

	public static void main(String[] args) {
		int n=10;
		int r=sumaR(n);
		System.out.println(r);
	}
	public static int sumaR(int x)
	{
	int r=0;
	if (x==1)
	{
		return 1;
	}
	else {
		r+= x+sumaR(x-1);
	return r;}
	}
}
