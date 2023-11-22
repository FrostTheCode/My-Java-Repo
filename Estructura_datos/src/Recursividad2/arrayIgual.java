package Recursividad2;

public class arrayIgual {

	public static void main(String[] args) {
		int[]tel= {1,2,3,4,5};
		int []tel2= {1,2,3,4,5};
	    
		if(tel.length==tel2.length)
			System.out.println(arigu(tel,tel2,0));
		else
			System.out.println(false);
	}
	public static boolean arigu(int[]ar,int[]ar2,int ind)
	{
		if (ind==ar.length)
			return true;
		else 
			return arigu(ar,ar2,ind+1);
	}

}
