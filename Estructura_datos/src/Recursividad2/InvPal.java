package Recursividad2;

public class InvPal {

	public static void main(String[] args) {
		String pal="tamal";
		System.out.println(InvPal(pal,pal.length()-1));

	}
	public static String InvPal( String pal, int lon)
	{
		if(lon==0)
		{
			return pal.charAt(lon)+"";
		}
		else
		{
		return pal.charAt(lon)+InvPal(pal,lon-1);
		}

	}

}
