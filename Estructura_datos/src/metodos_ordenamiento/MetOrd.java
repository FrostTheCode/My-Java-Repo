package metodos_ordenamiento;

public class MetOrd {
	public void ordsel(int a[])
	{
		for (int i=0;i<a.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if (a[j]<a[min])
				{
					min=j;
				}
			}
			int aux=a[i];
			a[i]=a[min];
			a[min]=aux;
		}
	}
	public void imp(int a[])
	{
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
	}

}
