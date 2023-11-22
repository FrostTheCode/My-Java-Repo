package Recursividad2;

public class MaxRecursivo {

	public static void main(String[] args) {
		int[]nu={6,4,7,1,4,2,4};
		System.out.println("Max v1: "+maxi(nu,0,nu[0]));
		System.out.println("Max v2: "+maxi2(nu,0));
		System.out.println("Max v1: "+min(nu,0,nu[0]));
		System.out.println("Max v2: "+min2(nu,0));

	}
	public static int maxi(int[]num,int ind,int max)
	{
		if (ind==num.length-1) 
		{
			if (num[ind]>max)
				max=maxi(num,ind+1,num[ind]);
			else
				max=maxi(num,ind+1,max);
		}
		return max;
	}
	public static int maxi2(int[]num,int ind)
	{
		 int max=Integer.MIN_VALUE;
		 if (ind!=num.length)
			 max=Math.max(num[ind], maxi2(num,ind+1));
	return max;
	}
	public static int min(int[]num,int ind,int min)
	{
		if (ind==num.length-1) 
		{
			if (num[ind]<min)
				min=maxi(num,ind+1,num[ind]);
			else
				min=maxi(num,ind+1,min);
		}
		return min;
	}
	public static int min2(int[]num,int ind)
	{
		 int min=Integer.MIN_VALUE;
		 if (ind!=num.length)
			 min=Math.min(num[ind], maxi2(num,ind+1));
	return min;
	}

}
