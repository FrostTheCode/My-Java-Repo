package backtracking;

public class CadRec {

	public static void main(String[] args) {
		String cad="";
		int ind=0;
		MosCad(cad,ind);
		System.out.println("");

	}
	public static void MosCad(String cad,int ind)
	{
		try {
			char c=cad.charAt(ind);
			System.out.println(c);
			MosCad(cad,ind+1);
		}
		catch (IndexOutOfBoundsException ex)
		{
			
		}
	}

}
