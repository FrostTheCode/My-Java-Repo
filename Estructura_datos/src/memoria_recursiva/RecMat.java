package memoria_recursiva;

public class RecMat {

	public static void main(String[] args) {
		int [][] m= {
				{1,2,3},
				{3,2,1},
				{2,1,3}
		};
		RecMatRec(m,0,0);
	}
	public static void RecMatRec(int [][]m,int i,int j)
	{
		System.out.print(m[i][j]);
		if (i!=m.length-1 || j!=m.length-1)
		{
			if(j==m[i].length-1)
			{
				i++;
				j=0;
				System.out.println("");
			}
			else
			{
				j++;
			}
			RecMatRec(m,i,j);
		}
	}

	}


