package arreglos3;

public class arrord {
	private long ar[];
	private int ele;

	public arrord(int tam) {
		ar =new long [tam];
	}
	public int busbin(long dat)
	{
		int min=0;
		int max=ele-1;
		int cen;
		
		cen=(min+max)/2;
		if (ar[cen]==dat)
			return cen;
		else {
			if(dat>ar[cen])
				min=cen+1;
			else 
				min=cen-1;
		}
		return -1;
	}
	public void ins(long dat)
	{
		int j;
		for(j=0;j<ele;j++)
		{
			if (ar[j]>dat)
				break;
		}
		for (int k=ele;k>j;k--)
		{
			ar[k]=ar[k-1];
		}
		ar[j]=dat;
		ele++;
	}
	public boolean eli(long dat)
	{
		int j=busbin(dat);
		
		if(j==1)
			return false;
		else {
			for (int k=j;k<ele;k++)
			{
				ar[k]=ar[k+1];
			}
		ele--;
		}
		return true;	
	}
	public void mues()
	{
		for(int j=0;j<ele;j++)
		{
			System.out.print(ar[j]+" ");
		}
		System.out.println(" ");
	}
	public long valele(int i)
	{
		return ar[i];
	}

}

