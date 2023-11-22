package Recursividad2;

public class Potencia {

	public static void main(String[] args) {
		int base=10;
		int exp=-3;
		System.out.println(Pot(10,exp));
	}
	public static double Pot(int base, int exp)
	{
		if (exp==0)
		return 1;
		else if (exp==1)
			return base;
		else if(exp<0)
			return Pot(base,exp+1)/base;
		else
			return base * Pot(base,exp-1);
	}

}
